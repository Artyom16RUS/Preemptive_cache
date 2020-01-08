import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import org.junit.Test;

public class CacheLRUBenchmark extends AbstractBenchmark {

    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 1)
    @Test
    public void put() throws InterruptedException {
        Thread.sleep(1000);
    }
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 1)
    @Test
    public void get() throws InterruptedException {
        Thread.sleep(1000);
    }
}
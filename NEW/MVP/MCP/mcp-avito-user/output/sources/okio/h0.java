package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* compiled from: Throttler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/h0;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h0 {
    public h0() {
        System.nanoTime();
        new ReentrantLock().newCondition();
    }
}

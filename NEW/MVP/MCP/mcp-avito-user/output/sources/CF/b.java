package cF;

import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1FreemiumRulesResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LcF/b;", "", "", "count", "", "progress", "<init>", "(JD)V", "J", "a", "()J", "D", "b", "()D", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    @c("count")
    private final long count;

    @c("progress")
    private final double progress;

    public b(long j12, double d12) {
        this.count = j12;
        this.progress = d12;
    }

    /* renamed from: a, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* renamed from: b, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }
}

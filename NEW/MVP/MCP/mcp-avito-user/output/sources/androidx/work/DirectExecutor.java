package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/DirectExecutor;", "", "Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class DirectExecutor implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final DirectExecutor f55372b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f55373c;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        f55372b = directExecutor;
        f55373c = new DirectExecutor[]{directExecutor};
    }

    public DirectExecutor() {
        throw null;
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f55373c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    @Y61.k
    public final String toString() {
        return "DirectExecutor";
    }
}

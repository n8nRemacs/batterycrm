package androidx.work;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/work/WorkManager;", "", "<init>", "()V", "a", "UpdateResult", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes10.dex */
public abstract class WorkManager {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f55428a = new a(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateResult {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ UpdateResult[] f55429b = {new UpdateResult("NOT_APPLIED", 0), new UpdateResult("APPLIED_IMMEDIATELY", 1), new UpdateResult("APPLIED_FOR_NEXT_RUN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        UpdateResult EF5;

        public UpdateResult() {
            throw null;
        }

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) f55429b.clone();
        }
    }

    /* compiled from: WorkManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/WorkManager$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Y61.k
    public final a0 a(@Y61.k String str, @Y61.k ExistingWorkPolicy existingWorkPolicy, @Y61.k J j12) {
        return b(str, existingWorkPolicy, Collections.singletonList(j12));
    }

    @Y61.k
    public abstract androidx.work.impl.G b(@Y61.k String str, @Y61.k ExistingWorkPolicy existingWorkPolicy, @Y61.k List list);

    @Y61.k
    public abstract L c();

    @Y61.k
    public abstract L d(@Y61.k List list);
}

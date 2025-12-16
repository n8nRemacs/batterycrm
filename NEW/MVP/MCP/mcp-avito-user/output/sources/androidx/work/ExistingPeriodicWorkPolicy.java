package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExistingPeriodicWorkPolicy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/ExistingPeriodicWorkPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExistingPeriodicWorkPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] f55374b = {new ExistingPeriodicWorkPolicy("REPLACE", 0), new ExistingPeriodicWorkPolicy("KEEP", 1), new ExistingPeriodicWorkPolicy("UPDATE", 2), new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingPeriodicWorkPolicy EF5;

    public ExistingPeriodicWorkPolicy() {
        throw null;
    }

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) f55374b.clone();
    }
}

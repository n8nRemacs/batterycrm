package kotlin.annotations.jvm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MigrationStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MigrationStatus[] f406632b = {new MigrationStatus("IGNORE", 0), new MigrationStatus("WARN", 1), new MigrationStatus("STRICT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    MigrationStatus EF5;

    public MigrationStatus() {
        throw null;
    }

    public static MigrationStatus valueOf(String str) {
        return (MigrationStatus) Enum.valueOf(MigrationStatus.class, str);
    }

    public static MigrationStatus[] values() {
        return (MigrationStatus[]) f406632b.clone();
    }
}

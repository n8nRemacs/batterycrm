package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zg8 {
    public static final /* synthetic */ zg8[] a = {new zg8("Short", 0), new zg8("Long", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    zg8 EF5;

    public static zg8 valueOf(String str) {
        return (zg8) Enum.valueOf(zg8.class, str);
    }

    public static zg8[] values() {
        return (zg8[]) a.clone();
    }
}

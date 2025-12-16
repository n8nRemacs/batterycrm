package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lbh {
    public static final /* synthetic */ lbh[] a = {new lbh("LOWEST", 0), new lbh("HIGHEST", 1), new lbh("MAX_QVGA", 2), new lbh("MAX_480P", 3), new lbh("MAX_720P", 4), new lbh("MAX_1080P", 5), new lbh("MAX_2160P", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    lbh EF5;

    public static lbh valueOf(String str) {
        return (lbh) Enum.valueOf(lbh.class, str);
    }

    public static lbh[] values() {
        return (lbh[]) a.clone();
    }
}

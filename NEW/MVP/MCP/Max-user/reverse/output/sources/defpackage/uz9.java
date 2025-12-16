package defpackage;

import org.apache.http.protocol.HTTP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uz9 {
    public static final uz9 X;
    public static final uz9 Y;
    public static final uz9 Z;
    public static final String[] b;
    public static final uz9 c;
    public static final uz9 d;
    public static final uz9 o;
    public static final uz9 s0;
    public static final uz9 t0;
    public static final uz9 u0;
    public static final /* synthetic */ uz9[] v0;
    public static final /* synthetic */ zg5 w0;
    public final String a;

    static {
        uz9 uz9Var = new uz9("UNKNOWN", 0, "unknown");
        c = uz9Var;
        uz9 uz9Var2 = new uz9("IMAGE_JPEG", 1, "image/jpeg");
        d = uz9Var2;
        uz9 uz9Var3 = new uz9("IMAGE_PNG", 2, "image/png");
        o = uz9Var3;
        uz9 uz9Var4 = new uz9("IMAGE_WEBP", 3, "image/webp");
        X = uz9Var4;
        uz9 uz9Var5 = new uz9("IMAGE_GIF", 4, "image/gif");
        Y = uz9Var5;
        uz9 uz9Var6 = new uz9("IMAGE_ANY", 5, "image/*");
        uz9 uz9Var7 = new uz9("IMAGE_HEIC", 6, "image/heic");
        Z = uz9Var7;
        uz9 uz9Var8 = new uz9("IMAGE_HEIF", 7, "image/heif");
        uz9 uz9Var9 = new uz9("IMAGE_AVIF", 8, "image/avif");
        uz9 uz9Var10 = new uz9("VIDEO_MP4", 9, "video/mp4");
        s0 = uz9Var10;
        uz9 uz9Var11 = new uz9("VIDEO_ANY", 10, "video/*");
        uz9 uz9Var12 = new uz9("TEXT_PLAIN", 11, HTTP.PLAIN_TEXT_TYPE);
        t0 = uz9Var12;
        uz9 uz9Var13 = new uz9("TEXT_HTML", 12, "text/html");
        u0 = uz9Var13;
        uz9[] uz9VarArr = {uz9Var, uz9Var2, uz9Var3, uz9Var4, uz9Var5, uz9Var6, uz9Var7, uz9Var8, uz9Var9, uz9Var10, uz9Var11, uz9Var12, uz9Var13, new uz9("TEXT_VCARD", 13, "text/x-vcard")};
        v0 = uz9VarArr;
        w0 = new zg5(uz9VarArr);
        b = new String[]{"image/jpeg", "image/png", "image/webp", "image/gif", "image/*", "image/heic", "image/heif", "image/avif"};
    }

    public uz9(String str, int i, String str2) {
        this.a = str2;
    }

    public static uz9 valueOf(String str) {
        return (uz9) Enum.valueOf(uz9.class, str);
    }

    public static uz9[] values() {
        return (uz9[]) v0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}

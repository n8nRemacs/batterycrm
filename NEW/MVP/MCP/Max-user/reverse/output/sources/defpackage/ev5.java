package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ev5 implements gv5 {
    public static final /* synthetic */ ev5[] b;
    public static final /* synthetic */ zg5 c;
    public final yu5 a;

    static {
        yu5 yu5Var = yu5.Y;
        ev5 ev5Var = new ev5("PDF", 0, yu5Var);
        ev5 ev5Var2 = new ev5("PPT", 1, yu5Var);
        ev5 ev5Var3 = new ev5("PPTX", 2, yu5Var);
        ev5 ev5Var4 = new ev5("KEY", 3, yu5Var);
        yu5 yu5Var2 = yu5.Z;
        ev5 ev5Var5 = new ev5("XLS", 4, yu5Var2);
        ev5 ev5Var6 = new ev5("XLSX", 5, yu5Var2);
        ev5 ev5Var7 = new ev5("CSV", 6, yu5Var2);
        yu5 yu5Var3 = yu5.s0;
        ev5 ev5Var8 = new ev5("DOC", 7, yu5Var3);
        ev5 ev5Var9 = new ev5("DOCX", 8, yu5Var3);
        ev5 ev5Var10 = new ev5("TXT", 9, yu5Var3);
        ev5 ev5Var11 = new ev5("RTF", 10, yu5Var3);
        ev5 ev5Var12 = new ev5("ODT", 11, yu5Var3);
        yu5 yu5Var4 = yu5.t0;
        ev5 ev5Var13 = new ev5("JPG", 12, yu5Var4);
        ev5 ev5Var14 = new ev5("PNG", 13, yu5Var4);
        ev5 ev5Var15 = new ev5("GIF", 14, yu5Var4);
        ev5 ev5Var16 = new ev5("BMP", 15, yu5Var4);
        ev5 ev5Var17 = new ev5("HEIC", 16, yu5Var4);
        ev5 ev5Var18 = new ev5("HEIF", 17, yu5Var4);
        ev5 ev5Var19 = new ev5("AVIF", 18, yu5Var4);
        ev5 ev5Var20 = new ev5("WEBP", 19, yu5Var4);
        ev5 ev5Var21 = new ev5("SVG", 20, yu5Var4);
        yu5 yu5Var5 = yu5.u0;
        ev5 ev5Var22 = new ev5("MP4", 21, yu5Var5);
        ev5 ev5Var23 = new ev5("MOV", 22, yu5Var5);
        ev5 ev5Var24 = new ev5("AVI", 23, yu5Var5);
        ev5 ev5Var25 = new ev5("MKV", 24, yu5Var5);
        ev5 ev5Var26 = new ev5("WEBM", 25, yu5Var5);
        yu5 yu5Var6 = yu5.v0;
        ev5 ev5Var27 = new ev5("ZIP", 26, yu5Var6);
        ev5 ev5Var28 = new ev5("RAR", 27, yu5Var6);
        ev5 ev5Var29 = new ev5("7Z", 28, yu5Var6);
        ev5 ev5Var30 = new ev5("TAR", 29, yu5Var6);
        ev5 ev5Var31 = new ev5("GZ", 30, yu5Var6);
        yu5 yu5Var7 = yu5.w0;
        ev5 ev5Var32 = new ev5("EXE", 31, yu5Var7);
        ev5 ev5Var33 = new ev5("APK", 32, yu5Var7);
        ev5 ev5Var34 = new ev5("DMG", 33, yu5Var7);
        ev5 ev5Var35 = new ev5("BAT", 34, yu5Var7);
        ev5 ev5Var36 = new ev5("SH", 35, yu5Var7);
        yu5 yu5Var8 = yu5.x0;
        ev5[] ev5VarArr = {ev5Var, ev5Var2, ev5Var3, ev5Var4, ev5Var5, ev5Var6, ev5Var7, ev5Var8, ev5Var9, ev5Var10, ev5Var11, ev5Var12, ev5Var13, ev5Var14, ev5Var15, ev5Var16, ev5Var17, ev5Var18, ev5Var19, ev5Var20, ev5Var21, ev5Var22, ev5Var23, ev5Var24, ev5Var25, ev5Var26, ev5Var27, ev5Var28, ev5Var29, ev5Var30, ev5Var31, ev5Var32, ev5Var33, ev5Var34, ev5Var35, ev5Var36, new ev5("MP3", 36, yu5Var8), new ev5("WAV", 37, yu5Var8), new ev5("AAC", 38, yu5Var8), new ev5("OGG", 39, yu5Var8), new ev5("FLAC", 40, yu5Var8)};
        b = ev5VarArr;
        c = new zg5(ev5VarArr);
    }

    public ev5(String str, int i, yu5 yu5Var) {
        this.a = yu5Var;
    }

    public static ev5 valueOf(String str) {
        return (ev5) Enum.valueOf(ev5.class, str);
    }

    public static ev5[] values() {
        return (ev5[]) b.clone();
    }

    @Override // defpackage.gv5
    public final String a() {
        return name();
    }

    @Override // defpackage.gv5
    public final yu5 c() {
        return this.a;
    }
}

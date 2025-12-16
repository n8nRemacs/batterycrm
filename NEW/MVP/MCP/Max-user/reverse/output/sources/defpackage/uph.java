package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uph implements psh {
    public static final uph a;
    public static final /* synthetic */ uph[] b;
    public static final /* synthetic */ zg5 c;

    static {
        uph uphVar = new uph("DOWNLOAD_FILE", 0);
        a = uphVar;
        uph[] uphVarArr = {uphVar};
        b = uphVarArr;
        c = new zg5(uphVarArr);
    }

    public static uph valueOf(String str) {
        return (uph) Enum.valueOf(uph.class, str);
    }

    public static uph[] values() {
        return (uph[]) b.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return 12;
    }

    @Override // defpackage.psh
    public final String c() {
        return "WebAppDownloadFile";
    }

    @Override // defpackage.psh
    public final String d() {
        return "download_file";
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b8d {
    public static final b8d X;
    public static final b8d Y;
    public static final b8d Z;
    public static final b8d b;
    public static final b8d c;
    public static final b8d d;
    public static final b8d o;
    public static final b8d s0;
    public static final b8d t0;
    public static final b8d u0;
    public static final /* synthetic */ b8d[] v0;
    public static final /* synthetic */ zg5 w0;
    public final String a;

    static {
        b8d b8dVar = new b8d("AUDIO_FREEZES", 0, "AUDIO_FREEZES");
        b = b8dVar;
        b8d b8dVar2 = new b8d("AUDIO_CALL_INTERRUPTION", 1, "AUDIO_CALL_INTERRUPTION");
        c = b8dVar2;
        b8d b8dVar3 = new b8d("VOICE_COMMUNICATION_PROBLEM", 2, "VOICE_COMMUNICATION_PROBLEM");
        d = b8dVar3;
        b8d b8dVar4 = new b8d("AUDIO_QUALITY", 3, "AUDIO_QUALITY");
        o = b8dVar4;
        b8d b8dVar5 = new b8d("AUDIO_ECHO", 4, "AUDIO_ECHO");
        X = b8dVar5;
        b8d b8dVar6 = new b8d("VIDEO_FREEZES", 5, "VIDEO_FREEZES");
        Y = b8dVar6;
        b8d b8dVar7 = new b8d("VIDEO_QUALITY", 6, "VIDEO_QUALITY");
        Z = b8dVar7;
        b8d b8dVar8 = new b8d("VIDEO_SYNC", 7, "VIDEO_SYNC");
        s0 = b8dVar8;
        b8d b8dVar9 = new b8d("VIDEO_CALL_INTERRUPTION", 8, "VIDEO_CALL_INTERRUPTION");
        t0 = b8dVar9;
        b8d b8dVar10 = new b8d("USERS_FREEZES", 9, "USERS_FREEZES");
        u0 = b8dVar10;
        b8d[] b8dVarArr = {b8dVar, b8dVar2, b8dVar3, b8dVar4, b8dVar5, b8dVar6, b8dVar7, b8dVar8, b8dVar9, b8dVar10};
        v0 = b8dVarArr;
        w0 = new zg5(b8dVarArr);
    }

    public b8d(String str, int i, String str2) {
        this.a = str2;
    }

    public static b8d valueOf(String str) {
        return (b8d) Enum.valueOf(b8d.class, str);
    }

    public static b8d[] values() {
        return (b8d[]) v0.clone();
    }
}

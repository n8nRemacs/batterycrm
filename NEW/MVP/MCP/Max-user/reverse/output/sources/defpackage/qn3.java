package defpackage;

import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public abstract class qn3 {
    public static final jj5 a;
    public static final jj5 b;
    public static final Object c;
    public static final bwf d;
    public static final bwf e;
    public static final jj5 f;
    public static final bwf g;
    public static final bwf h;
    public static final bwf i;

    static {
        jj5 jj5Var = new jj5("common", 1, MultiFileUploader.UPLOAD_NEXT_INTERVAL, true, true, false, true, 64);
        a = jj5Var;
        b = jj5.a(jj5Var, 383);
        c = ipi.b(2, new fu2(20));
        d = new bwf(new fu2(21));
        e = new bwf(new fu2(22));
        f = new jj5("computation", (Runtime.getRuntime().availableProcessors() * 2) - 1, MultiFileUploader.UPLOAD_NEXT_INTERVAL, true, false, false, false, 96);
        g = new bwf(new fu2(23));
        h = new bwf(new fu2(24));
        i = new bwf(new fu2(25));
    }
}

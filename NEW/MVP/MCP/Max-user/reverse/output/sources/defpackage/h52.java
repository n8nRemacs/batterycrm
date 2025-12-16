package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h52 {
    public static final s90 i = new s90("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final s90 j = new s90("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final s90 k = new s90("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final fjb b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final ryf g;
    public final r02 h;

    public h52(ArrayList arrayList, fjb fjbVar, int i2, boolean z, ArrayList arrayList2, boolean z2, ryf ryfVar, r02 r02Var) {
        this.a = arrayList;
        this.b = fjbVar;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = ryfVar;
        this.h = r02Var;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objF = 0;
        try {
            objF = this.b.f(xwg.q0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objF;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objF = 0;
        try {
            objF = this.b.f(xwg.r0);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objF;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

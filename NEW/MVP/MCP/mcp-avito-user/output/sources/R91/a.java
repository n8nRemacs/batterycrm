package R91;

import aa1.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.FloatBuffer;
import org.tensorflow.lite.InterpreterApi;
import wa1.q;
import ya1.C50207c;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f14111a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14113c;

    /* renamed from: d, reason: collision with root package name */
    public final C50207c f14114d;

    /* renamed from: e, reason: collision with root package name */
    public final r f14115e;

    /* renamed from: f, reason: collision with root package name */
    public final InterpreterApi f14116f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f14117g;

    /* renamed from: h, reason: collision with root package name */
    public final FloatBuffer f14118h;

    public a(Context context) {
        H91.b.a(context);
        Rect rectA = H91.b.a(context);
        this.f14111a = rectA;
        this.f14112b = rectA.width();
        this.f14113c = rectA.height();
        this.f14114d = new C50207c(context);
        this.f14115e = new r(new wa1.c(), new wa1.d());
        this.f14116f = q.a(context, "t234_tflite_fixed_input.tflite");
        this.f14117g = new float[359424];
        this.f14118h = FloatBuffer.allocate(2808);
    }

    public abstract k a(Bitmap bitmap);
}

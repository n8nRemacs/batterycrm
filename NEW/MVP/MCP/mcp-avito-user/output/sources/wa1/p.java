package wa1;

import Ba1.C13123a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.tensorflow.lite.InterpreterApi;
import ya1.C50205a;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final C50207c f441614a;

    /* renamed from: b, reason: collision with root package name */
    public final u f441615b;

    /* renamed from: c, reason: collision with root package name */
    public final InterpreterApi f441616c;

    /* renamed from: d, reason: collision with root package name */
    public final C13123a f441617d = new C13123a();

    /* renamed from: e, reason: collision with root package name */
    public final float[] f441618e = new float[313344];

    /* renamed from: f, reason: collision with root package name */
    public final FloatBuffer f441619f = FloatBuffer.allocate(1);

    /* renamed from: g, reason: collision with root package name */
    public final Paint f441620g;

    public p(Context context, C50207c c50207c, u uVar) {
        this.f441614a = c50207c;
        this.f441615b = uVar;
        this.f441616c = q.a(context, "t203_flare_tflite_meaning.tflite");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        this.f441620g = paint;
    }

    public final boolean a(Bitmap bitmap, ArrayList arrayList) {
        ArrayList arrayListA = this.f441615b.a(arrayList, bitmap.getWidth(), bitmap.getHeight());
        i iVar = new i(this, bitmap, arrayListA);
        C13123a c13123a = this.f441617d;
        Bitmap bitmap2 = (Bitmap) c13123a.a("crop1", iVar);
        Bitmap bitmap3 = (Bitmap) c13123a.a("crop2", new k(this, bitmap, arrayListA));
        Bitmap bitmap4 = (Bitmap) c13123a.a("Image point crop", new g(this, bitmap, arrayListA));
        C50205a c50205a = (C50205a) c13123a.a("Average crop1", new j(this, bitmap2));
        C50205a c50205a2 = (C50205a) c13123a.a("Average crop2", new l(this, bitmap3));
        c50205a.getClass();
        float f12 = 2;
        c13123a.a("Fill input buffer", new e(this, new C50205a((c50205a.f443190a + c50205a2.f443190a) / f12, (c50205a.f443191b + c50205a2.f443191b) / f12, (c50205a.f443192c + c50205a2.f443192c) / f12), (Bitmap) c13123a.a("Resize bitmap to input", new h(this, bitmap4)), (Bitmap) c13123a.a("Resize mask", new n(this, (Bitmap) c13123a.a("Point crop mask", new m(this, (Bitmap) c13123a.a("Create mask", new o(this, bitmap, arrayListA)), arrayListA))))));
        FloatBuffer floatBufferWrap = FloatBuffer.wrap(this.f441618e);
        FloatBuffer floatBuffer = this.f441619f;
        floatBuffer.clear();
        c13123a.a("Run flare net", new f(this, floatBufferWrap));
        return floatBuffer.get(0) >= 0.005242647f;
    }
}

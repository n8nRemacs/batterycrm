package com.otaliastudios.opengl.draw;

import java.nio.FloatBuffer;
import kotlin.Metadata;
import t11.C48460a;

/* compiled from: GlPolygon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/draw/g;", "Lcom/otaliastudios/opengl/draw/a;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public final int f365922d;

    /* renamed from: e, reason: collision with root package name */
    public float f365923e;

    /* renamed from: f, reason: collision with root package name */
    public float f365924f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FloatBuffer f365925g;

    public g(int i12) {
        this.f365922d = i12;
        if (i12 < 3) {
            throw new IllegalArgumentException("Polygon should have at least 3 sides.");
        }
        this.f365923e = 1.0f;
        this.f365925g = C48460a.a((i12 + 2) * this.f365918c);
        c();
    }

    @Override // com.otaliastudios.opengl.draw.f
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final FloatBuffer getF365925g() {
        return this.f365925g;
    }

    public final void c() {
        FloatBuffer floatBuffer = this.f365925g;
        floatBuffer.clear();
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        float f12 = this.f365924f * 0.017453292f;
        int i12 = this.f365922d;
        float f13 = 6.2831855f / i12;
        for (int i13 = 0; i13 < i12; i13++) {
            double d12 = f12;
            floatBuffer.put((this.f365923e * ((float) Math.cos(d12))) + 0.0f);
            floatBuffer.put((this.f365923e * ((float) Math.sin(d12))) + 0.0f);
            f12 += f13;
        }
        floatBuffer.put(floatBuffer.get(2));
        floatBuffer.put(floatBuffer.get(3));
        floatBuffer.flip();
        this.f365921b++;
    }
}

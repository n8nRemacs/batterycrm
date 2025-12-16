package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import com.yandex.mobile.ads.impl.ov0;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes8.dex */
final class qv0 {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f389304i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f389305j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f389306k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f389307a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private a f389308b;

    /* renamed from: c, reason: collision with root package name */
    private py f389309c;

    /* renamed from: d, reason: collision with root package name */
    private int f389310d;

    /* renamed from: e, reason: collision with root package name */
    private int f389311e;

    /* renamed from: f, reason: collision with root package name */
    private int f389312f;

    /* renamed from: g, reason: collision with root package name */
    private int f389313g;

    /* renamed from: h, reason: collision with root package name */
    private int f389314h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f389315a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f389316b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f389317c;

        /* renamed from: d, reason: collision with root package name */
        private final int f389318d;

        public a(ov0.b bVar) {
            this.f389315a = bVar.a();
            this.f389316b = qy.a(bVar.f388650c);
            this.f389317c = qy.a(bVar.f388651d);
            int i12 = bVar.f388649b;
            if (i12 == 1) {
                this.f389318d = 5;
            } else if (i12 != 2) {
                this.f389318d = 4;
            } else {
                this.f389318d = 6;
            }
        }
    }

    public final void a(ov0 ov0Var) {
        ov0.a aVar = ov0Var.f388643a;
        ov0.a aVar2 = ov0Var.f388644b;
        if (aVar.b() == 1 && aVar.a().f388648a == 0 && aVar2.b() == 1 && aVar2.a().f388648a == 0) {
            this.f389307a = ov0Var.f388645c;
            this.f389308b = new a(ov0Var.f388643a.a());
            if (ov0Var.f388646d) {
                return;
            }
            new a(ov0Var.f388644b.a());
        }
    }

    public final void a() {
        py pyVar = new py();
        this.f389309c = pyVar;
        this.f389310d = pyVar.b("uMvpMatrix");
        this.f389311e = this.f389309c.b("uTexMatrix");
        this.f389312f = this.f389309c.a("aPosition");
        this.f389313g = this.f389309c.a("aTexCoords");
        this.f389314h = this.f389309c.b("uTexture");
    }

    public final void a(int i12, float[] fArr) {
        float[] fArr2;
        a aVar = this.f389308b;
        if (aVar == null) {
            return;
        }
        int i13 = this.f389307a;
        if (i13 == 1) {
            fArr2 = f389305j;
        } else if (i13 == 2) {
            fArr2 = f389306k;
        } else {
            fArr2 = f389304i;
        }
        GLES20.glUniformMatrix3fv(this.f389311e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f389310d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i12);
        GLES20.glUniform1i(this.f389314h, 0);
        qy.a();
        GLES20.glVertexAttribPointer(this.f389312f, 3, 5126, false, 12, (Buffer) aVar.f389316b);
        qy.a();
        GLES20.glVertexAttribPointer(this.f389313g, 2, 5126, false, 8, (Buffer) aVar.f389317c);
        qy.a();
        GLES20.glDrawArrays(aVar.f389318d, 0, aVar.f389315a);
        qy.a();
    }
}

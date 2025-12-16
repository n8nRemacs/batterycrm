package R91;

import Ba1.C13123a;
import android.content.Context;
import android.graphics.Rect;
import androidx.camera.core.T;
import androidx.camera.core.z0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http2.Http2Connection;
import wa1.C49586a;
import wa1.C49587b;
import wa1.p;
import wa1.u;
import xa1.C49914h;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class j implements T.a {

    /* renamed from: b, reason: collision with root package name */
    public final ru.mts.biometry.sdk.feature.document.ml.c f14143b;

    /* renamed from: c, reason: collision with root package name */
    public final N f14144c;

    /* renamed from: d, reason: collision with root package name */
    public final C50207c f14145d;

    /* renamed from: e, reason: collision with root package name */
    public final a f14146e;

    /* renamed from: f, reason: collision with root package name */
    public final p f14147f;

    /* renamed from: g, reason: collision with root package name */
    public final C49587b f14148g;

    /* renamed from: h, reason: collision with root package name */
    public final C49586a f14149h;

    /* renamed from: i, reason: collision with root package name */
    public final C49914h f14150i;

    /* renamed from: j, reason: collision with root package name */
    public final C13123a f14151j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14152k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f14153l;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context, ru.mts.biometry.sdk.feature.document.ml.c cVar, Y41.l lVar) {
        a lVar2;
        this.f14143b = cVar;
        this.f14144c = (N) lVar;
        Rect rectA = H91.b.a(context);
        u uVar = new u(rectA.width(), rectA.height());
        C50207c c50207c = new C50207c(context);
        this.f14145d = c50207c;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            lVar2 = new l(context);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            lVar2 = new m(context);
        }
        this.f14146e = lVar2;
        this.f14147f = new p(context, c50207c, uVar);
        this.f14148g = new C49587b();
        this.f14149h = new C49586a(uVar, c50207c);
        this.f14150i = new C49914h();
        this.f14151j = new C13123a();
        this.f14152k = true;
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public final void a(z0 z0Var) {
        long jNanoTime = System.nanoTime();
        l0.h hVar = new l0.h();
        d dVar = new d(this, z0Var);
        C13123a c13123a = this.f14151j;
        hVar.f406842b = c13123a.a("Transform frame", dVar);
        z0Var.close();
        Rect rect = this.f14153l;
        if (rect != null) {
            hVar.f406842b = c13123a.a("Crop by photo frame", new c(this, hVar, rect));
        }
        boolean zBooleanValue = ((Boolean) c13123a.a("Brightness", new g(this, hVar))).booleanValue();
        k kVar = (k) c13123a.a("Passport detect", new h(this, hVar));
        boolean zBooleanValue2 = ((Boolean) c13123a.a("Flare detect", new e(kVar, this, hVar))).booleanValue();
        boolean zBooleanValue3 = ((Boolean) c13123a.a("Blurry detect", new f(kVar, this, hVar))).booleanValue();
        pc1.b.f428696a.b(androidx.media3.exoplayer.analytics.m.i(1 / ((System.nanoTime() - jNanoTime) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS), "Full FPS: "), new Object[0]);
        ArrayList arrayList = kVar.f14154a;
        this.f14144c.invoke(new b(kVar.f14155b, kVar.f14156c, kVar.f14158e, zBooleanValue3, kVar.f14157d, zBooleanValue2, zBooleanValue));
    }

    @Override // androidx.camera.core.T.a
    public final void d(z0 z0Var) {
        if (!this.f14152k) {
            z0Var.close();
            return;
        }
        try {
            int i12 = Z.f406624c;
            a(z0Var);
            G0 g02 = G0.f406611a;
        } catch (Throwable unused) {
            int i13 = Z.f406624c;
        }
    }
}

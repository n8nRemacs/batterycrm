package L91;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.view.M0;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class z extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final Y91.b f9859E;

    /* renamed from: J, reason: collision with root package name */
    public final W91.h f9860J;

    /* renamed from: K, reason: collision with root package name */
    public final C91.h f9861K;

    /* renamed from: L, reason: collision with root package name */
    public r f9862L;

    /* renamed from: M, reason: collision with root package name */
    public N0 f9863M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f9864N;

    /* renamed from: O, reason: collision with root package name */
    public final Z1 f9865O;

    /* renamed from: P, reason: collision with root package name */
    public final n2 f9866P;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(Y91.b r3, W91.h r4, C91.h r5, java.lang.Boolean r6) {
        /*
            r2 = this;
            r2.<init>()
            r2.f9859E = r3
            r2.f9860J = r4
            r2.f9861K = r5
            L91.r r3 = new L91.r
            ru.mts.biometry.sdk.feature.main.entity.b r4 = C91.a.f2017d
            r5 = 1
            if (r4 == 0) goto L17
            ru.mts.biometry.sdk.feature.main.entity.d r4 = r4.f436463c
            if (r4 == 0) goto L17
            int r4 = r4.f436465c
            goto L18
        L17:
            r4 = r5
        L18:
            r3.<init>(r4)
            r2.f9862L = r3
            E91.b r3 = C91.a.f2018e
            E91.d r3 = r3.f3819e
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.String r0 = r3.f3826b
            java.lang.String r1 = "rus"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r1)
            if (r0 == 0) goto L43
            java.lang.String r3 = r3.f3825a
            java.lang.String r0 = "Passport"
            boolean r3 = kotlin.jvm.internal.L.f(r3, r0)
            if (r3 == 0) goto L43
            if (r6 == 0) goto L3f
            boolean r3 = r6.booleanValue()
            goto L40
        L3f:
            r3 = r4
        L40:
            if (r3 == 0) goto L43
            goto L44
        L43:
            r5 = r4
        L44:
            r2.f9864N = r5
            L91.t r3 = L91.t.f9848a
            kotlinx.coroutines.flow.Z1 r3 = kotlinx.coroutines.flow.p2.a(r3)
            r2.f9865O = r3
            kotlinx.coroutines.flow.n2 r3 = kotlinx.coroutines.flow.C43175k.b(r3)
            r2.f9866P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L91.z.<init>(Y91.b, W91.h, C91.h, java.lang.Boolean):void");
    }

    public static ru.mts.biometry.sdk.feature.document.ml.c ke() {
        ru.mts.biometry.sdk.feature.document.intro.domain.d dVar;
        P91.e eVar = C91.a.f2018e.f3820f;
        return (eVar == null || (dVar = eVar.f12874b) == null || !P91.d.a(dVar)) ? ru.mts.biometry.sdk.feature.document.ml.c.f436445b : ru.mts.biometry.sdk.feature.document.ml.c.f436446c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection] */
    public final void le(Bitmap bitmap, Context context) {
        int size = this.f9862L.f9846b.size() + 1;
        r rVar = this.f9862L;
        if (size < rVar.f9845a) {
            this.f9862L = new r(rVar.f9845a, C42745f0.i0(bitmap, rVar.f9846b));
            return;
        }
        N0 n02 = this.f9863M;
        if (n02 == null || !((AbstractC43075a) n02).isActive()) {
            this.f9860J.f17823e = true;
            this.f9863M = C43259k.d(androidx.view.N0.a(this), C43262l0.f411947c, null, new y(this, bitmap, context, null), 2);
        }
    }
}

package ha1;

import androidx.view.M0;
import fa1.C40388b;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* loaded from: classes9.dex */
public final class w extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final C40388b f397268E;

    /* renamed from: J, reason: collision with root package name */
    public final W91.h f397269J;

    /* renamed from: K, reason: collision with root package name */
    public final C91.h f397270K;

    /* renamed from: L, reason: collision with root package name */
    public p f397271L;

    /* renamed from: M, reason: collision with root package name */
    public N0 f397272M;

    /* renamed from: N, reason: collision with root package name */
    public final Z1 f397273N;

    /* renamed from: O, reason: collision with root package name */
    public final n2 f397274O;

    public w(C40388b c40388b, W91.h hVar, C91.h hVar2) {
        this.f397268E = c40388b;
        this.f397269J = hVar;
        this.f397270K = hVar2;
        E91.h hVar3 = c40388b.f395964a;
        this.f397271L = new p(hVar3 != null ? hVar3.f3853c : 3);
        Z1 z1A = p2.a(new q(hVar3 != null ? hVar3.f3852b : 1.5f, hVar3 != null ? hVar3.f3854d : null, hVar3 != null ? hVar3.f3855e : null, hVar3 != null ? hVar3.f3856f : ""));
        this.f397273N = z1A;
        this.f397274O = C43175k.b(z1A);
    }

    public static ru.mts.biometry.sdk.feature.document.ml.c ke() {
        String str;
        E91.h hVar = C91.a.f2018e.f3817c;
        if (hVar == null || (str = hVar.f3851a) == null) {
            str = "";
        }
        ru.mts.biometry.sdk.feature.document.intro.domain.d.f436438b.getClass();
        ru.mts.biometry.sdk.feature.document.intro.domain.d dVarA = P91.c.a(str);
        return (dVarA == null || !P91.d.a(dVarA)) ? ru.mts.biometry.sdk.feature.document.ml.c.f436445b : ru.mts.biometry.sdk.feature.document.ml.c.f436446c;
    }

    public final void b() {
        this.f397271L = new p(this.f397271L.f397251a, C42784z0.f406748b);
        Z1 z12 = this.f397273N;
        E91.h hVar = this.f397268E.f395964a;
        z12.setValue(new q(hVar != null ? hVar.f3852b : 1.5f, hVar != null ? hVar.f3854d : null, hVar != null ? hVar.f3855e : null, hVar != null ? hVar.f3856f : ""));
    }
}

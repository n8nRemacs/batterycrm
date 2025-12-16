package O91;

import androidx.view.M0;
import androidx.view.N0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* loaded from: classes9.dex */
public final class o extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final M91.a f12060E;

    /* renamed from: J, reason: collision with root package name */
    public final W91.h f12061J;

    /* renamed from: K, reason: collision with root package name */
    public final Z1 f12062K;

    /* renamed from: L, reason: collision with root package name */
    public final n2 f12063L;

    /* renamed from: M, reason: collision with root package name */
    public Object f12064M;

    /* renamed from: N, reason: collision with root package name */
    public final Z1 f12065N;

    /* renamed from: O, reason: collision with root package name */
    public final n2 f12066O;

    public o(M91.a aVar, W91.h hVar) {
        this.f12060E = aVar;
        this.f12061J = hVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
        Z1 z1A = p2.a(c42784z0);
        this.f12062K = z1A;
        this.f12063L = C43175k.b(z1A);
        this.f12064M = c42784z0;
        Z1 z1A2 = p2.a(c42784z0);
        this.f12065N = z1A2;
        this.f12066O = C43175k.b(z1A2);
        C43259k.d(N0.a(this), null, null, new k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void a(String str) {
        Z1 z12 = this.f12065N;
        ?? r12 = this.f12064M;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r12) {
            String str2 = ((M91.b) obj).f10433b;
            Locale locale = Locale.ROOT;
            if (C43066x.q(str2.toLowerCase(locale), C43066x.E0(str).toLowerCase(locale), false)) {
                arrayList.add(obj);
            }
        }
        z12.setValue(arrayList);
    }
}

package com.avito.android.profile.pro.impl.screen.mvi;

import D90.b;
import D90.c;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LD90/b;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements t<D90.b, D90.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final D90.c b(D90.b bVar) {
        D90.b bVar2 = bVar;
        if (bVar2 instanceof b.l) {
            return new c.i(((b.l) bVar2).f3029a);
        }
        if (bVar2 instanceof b.i) {
            return new c.f(((b.i) bVar2).f3026a);
        }
        if (bVar2 instanceof b.k) {
            return c.h.f3053a;
        }
        if (bVar2 instanceof b.n) {
            DeepLink deepLink = ((b.n) bVar2).f3031a;
            return deepLink != null ? new c.f(deepLink) : c.k.f3056a;
        }
        if (bVar2 instanceof b.m) {
            return c.j.f3055a;
        }
        if (bVar2 instanceof b.d) {
            return new c.a(com.avito.android.printable_text.b.f(z.k(((b.d) bVar2).f3021a)));
        }
        if (bVar2 instanceof b.j) {
            return c.g.f3052a;
        }
        if (bVar2 instanceof b.f) {
            return new c.C0154c(((b.f) bVar2).f3023a);
        }
        if (bVar2 instanceof b.q) {
            return c.l.f3057a;
        }
        if (bVar2 instanceof b.r) {
            return c.m.f3058a;
        }
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            return new c.b(aVar.f3013e, aVar.f3017i, aVar.f3018j, aVar.f3016h.f222680h);
        }
        if (bVar2 instanceof b.c) {
            return c.e.f3050a;
        }
        if (bVar2 instanceof b.g) {
            return c.d.f3049a;
        }
        if (bVar2 instanceof b.o) {
            b.o oVar = (b.o) bVar2;
            return new c.b(oVar.f3032a, C42784z0.f406748b, null, oVar.f3033b);
        }
        if (bVar2 instanceof b.s) {
            return new c.n(((b.s) bVar2).f3037a);
        }
        if (bVar2 instanceof b.t) {
            return new c.o(((b.t) bVar2).f3038a);
        }
        if (bVar2 instanceof b.C0153b) {
            return new c.a(com.avito.android.printable_text.b.c(R.string.profile_pro_dashboard_quality_open_error_msg, new Serializable[0]));
        }
        return null;
    }
}

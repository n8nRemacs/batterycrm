package com.avito.android.select.glow_animation;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: GlowAnimationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/glow_animation/i;", "Lcom/avito/android/select/glow_animation/f;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f265400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f265401c;

    @Inject
    public i() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f265400b = cVar;
        this.f265401c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        List<UniversalColor> list = aVar2.f265386d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UniversalColor universalColor : list) {
            arrayList.add(Integer.valueOf(C48063a.f437606a.a(kVar.getContext(), universalColor)));
        }
        kVar.SO(aVar2.f265385c, arrayList);
        boolean z12 = aVar2.f265389g;
        kVar.QO(z12);
        UniversalImage universalImage = aVar2.f265391i;
        if (universalImage != null) {
            kVar.Uk(null);
            kVar.Gq(universalImage);
        } else {
            UniversalImage universalImage2 = aVar2.f265390h;
            if (universalImage2 == null || z12) {
                kVar.Uk(null);
                kVar.Gq(null);
            } else {
                kVar.Uk(universalImage2);
                kVar.Gq(null);
            }
        }
        kVar.a(new g(this, aVar2));
        kVar.nc(new h(kVar));
        Integer num = aVar2.f265388f;
        if (num != null) {
            kVar.vS(num.intValue());
        }
    }

    @Override // com.avito.android.select.glow_animation.f
    @Y61.k
    public final z<a> d() {
        return this.f265401c;
    }
}

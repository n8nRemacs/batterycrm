package com.avito.android.loyalty.ui.quality_service.items.effects;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import io.reactivex.rxjava3.internal.observers.m;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EffectsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effects/e;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/effects/i;", "Lcom/avito/android/loyalty/ui/quality_service/items/effects/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<i, a> {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        I5.a(iVar.f183842c, aVar2.f183829c, false);
        j.a(iVar.f183843d, aVar2.f183830d, null);
        iVar.f183841b.l(aVar2.f183831e, null);
        iVar.f183846g = (m) com.avito.android.lib.util.recycler_wrap_height_calculator.c.a(iVar.f183845f, iVar.f183844e, null, null, null, 30).x(new g(iVar), h.f183840b);
    }
}

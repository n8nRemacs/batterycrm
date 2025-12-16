package com.avito.android.loyalty.ui.quality_service.items.effect;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;
import mX.InterfaceC44026a;

/* compiled from: EffectItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effect/e;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service/items/effect/g;", "Lcom/avito/android/loyalty/ui/quality_service/items/effect/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44026a f183820b;

    @Inject
    public e(@k InterfaceC44026a interfaceC44026a) {
        this.f183820b = interfaceC44026a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        d dVar = new d(1, this.f183820b, InterfaceC44026a.class, "onItemClick", "onItemClick(Lcom/avito/conveyor_item/Item;)V", 0);
        TextView textView = gVar.f183824c;
        I5.a(textView, aVar2.f183812e, false);
        String str = aVar2.f183810c;
        TextView textView2 = gVar.f183825d;
        I5.a(textView2, str, false);
        TextView textView3 = gVar.f183826e;
        j.a(textView3, aVar2.f183811d, null);
        int i13 = aVar2.f183814g ? R.attr.gray54 : R.attr.black;
        Context context = gVar.f183823b;
        textView.setTextColor(C35835l0.d(i13, context));
        textView2.setTextColor(C35835l0.d(i13, context));
        textView3.setTextColor(C35835l0.d(i13, context));
        gVar.itemView.setOnClickListener(new h(11, (l) dVar, (Object) aVar2));
        UniversalImage universalImage = aVar2.f183813f;
        if (universalImage != null) {
            C35949t5.c(gVar.f183827f, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
            D6.H(gVar.f183827f);
        }
    }
}

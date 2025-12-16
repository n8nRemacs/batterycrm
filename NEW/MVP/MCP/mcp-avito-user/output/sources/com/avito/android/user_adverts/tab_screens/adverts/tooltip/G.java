package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.d;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c;
import dJ0.C39589a;
import java.io.Serializable;
import kotlin.Metadata;
import wJ0.g;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwJ0/g;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "invoke", "(LwJ0/g;)Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<wJ0.g<?>, InterfaceC35693c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wJ0.f f315577l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p12, wJ0.f fVar) {
        super(1);
        this.f315577l = fVar;
    }

    @Override // Y41.l
    public final InterfaceC35693c invoke(wJ0.g<?> gVar) {
        wJ0.g<?> gVar2 = gVar;
        boolean z12 = gVar2 instanceof d.a;
        wJ0.f fVar = this.f315577l;
        if (z12) {
            long f269849b = fVar.getF269849b();
            d.a aVar = (d.a) gVar2;
            PrintableText printableTextC = com.avito.android.printable_text.b.c(aVar.f314774a, new Serializable[0]);
            PrintableText printableTextC2 = com.avito.android.printable_text.b.c(aVar.f314775b, new Serializable[0]);
            g.a<Integer> aVar2 = aVar.f314776c;
            return new InterfaceC35693c.b(f269849b, printableTextC, printableTextC2, aVar2 != null ? com.avito.android.printable_text.b.c(aVar2.f441373a.intValue(), new Serializable[0]) : null);
        }
        if (!(gVar2 instanceof C39589a.C11022a)) {
            return null;
        }
        long f269849b2 = fVar.getF269849b();
        C39589a.C11022a c11022a = (C39589a.C11022a) gVar2;
        g.a<String> aVar3 = c11022a.f393826c;
        return new InterfaceC35693c.C9780c(f269849b2, aVar3 != null ? aVar3.f441374b : null, c11022a.f393824a, c11022a.f393825b);
    }
}

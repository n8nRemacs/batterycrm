package com.avito.android.rating_form.item.singleLineInput;

import Y41.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import ih0.InterfaceC41402a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SingleLineInputItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/singleLineInput/f;", "Lcom/avito/android/rating_form/item/singleLineInput/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC41402a, G0> f248623b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@Y61.k l<? super InterfaceC41402a, G0> lVar) {
        this.f248623b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        jVar.setTitle(aVar2.f248605f);
        AttributedText attributedText = aVar2.f248607h;
        if (attributedText != null) {
            jVar.Y1(attributedText);
        } else {
            jVar.f(aVar2.f248606g);
        }
        jVar.o(aVar2.f248608i);
        jVar.F9(aVar2.f248609j);
        jVar.s0(aVar2.f248602c);
        jVar.X0(aVar2.f248603d);
        jVar.m(aVar2.f248610k);
        jVar.aw(aVar2.f248611l);
        jVar.Ts(aVar2.f248612m);
        jVar.YD(aVar2.f248614o);
        jVar.r0(new e(aVar2, this));
        if (aVar2.f248613n.equals(Boolean.TRUE)) {
            jVar.i0();
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        List list2 = list;
        Object obj = null;
        for (Object obj2 : list2) {
            if (obj2 instanceof com.avito.android.rating_form.step.recycler.e) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.rating_form.step.recycler.e)) {
            obj = null;
        }
        com.avito.android.rating_form.step.recycler.e eVar2 = (com.avito.android.rating_form.step.recycler.e) obj;
        PrintableText printableText = eVar2 != null ? eVar2.f249734a : null;
        Object obj3 = null;
        for (Object obj4 : list2) {
            if (obj4 instanceof com.avito.android.rating_form.step.recycler.e) {
                obj3 = obj4;
            }
        }
        if (!(obj3 instanceof com.avito.android.rating_form.step.recycler.e)) {
            obj3 = null;
        }
        com.avito.android.rating_form.step.recycler.e eVar3 = (com.avito.android.rating_form.step.recycler.e) obj3;
        Boolean bool = eVar3 != null ? eVar3.f249735b : null;
        jVar.s0(printableText);
        jVar.X0(bool);
    }
}

package com.avito.android.short_term_rent.bookingform.promocode.promocodeitem;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.e;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeItemDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/promocodeitem/c;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f282197a;

    @Inject
    public c(@Y61.k f fVar) {
        this.f282197a = fVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF268996b() == aVar4.getF268996b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof PromoCodeItem) || !(aVar4 instanceof PromoCodeItem)) {
            return null;
        }
        PromoCodeItem promoCodeItem = (PromoCodeItem) aVar3;
        PromoCodeItem promoCodeItem2 = (PromoCodeItem) aVar4;
        this.f282197a.getClass();
        ArrayList arrayList = new ArrayList();
        UniversalImage universalImage = promoCodeItem.f282188d;
        UniversalImage universalImage2 = promoCodeItem2.f282188d;
        if (!L.f(universalImage, universalImage2)) {
            arrayList.add(new e.b(universalImage2));
        }
        PrintableText printableText = promoCodeItem.f282189e;
        PrintableText printableText2 = promoCodeItem2.f282189e;
        if (!L.f(printableText, printableText2)) {
            arrayList.add(new e.c(printableText2));
        }
        PrintableText printableText3 = promoCodeItem.f282190f;
        PrintableText printableText4 = promoCodeItem2.f282190f;
        if (!L.f(printableText3, printableText4)) {
            arrayList.add(new e.C8422e(printableText4));
        }
        boolean z12 = promoCodeItem.f282191g;
        boolean z13 = promoCodeItem2.f282191g;
        if (z12 != z13) {
            arrayList.add(new e.d(z13));
        }
        if (promoCodeItem.f282192h != promoCodeItem2.f282192h) {
            arrayList.add(new e.a());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}

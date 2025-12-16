package com.avito.android.advert_stats.item;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: BarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/d;", "LTV0/d;", "Lcom/avito/android/advert_stats/item/e;", "Lcom/avito/android/advert_stats/item/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28325d implements TV0.d<InterfaceC28326e, C28322a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28333l f86733b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28331j f86734c;

    public C28325d(@Y61.k InterfaceC28333l interfaceC28333l, @Y61.k InterfaceC28331j interfaceC28331j) {
        this.f86733b = interfaceC28333l;
        this.f86734c = interfaceC28331j;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        String strValueOf;
        InterfaceC28326e interfaceC28326e = (InterfaceC28326e) eVar;
        C28322a c28322a = (C28322a) aVar;
        float f12 = c28322a.f86719d;
        boolean z12 = f12 == 0.0f;
        InterfaceC28333l interfaceC28333l = this.f86733b;
        int f86778g = z12 ? interfaceC28333l.getF86778g() : Math.max((int) (interfaceC28333l.getF86776e() * f12), interfaceC28333l.getF86777f());
        int iD2 = interfaceC28333l.d();
        Integer num = c28322a.f86718c;
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue < 1000) {
            strValueOf = String.valueOf(iIntValue);
            i13 = iD2;
        } else {
            double d12 = iIntValue;
            int iLog = (int) (Math.log(d12) / Math.log(1000.0d));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormatSymbols.setGroupingSeparator('.');
            i13 = iD2;
            String str = new DecimalFormat("0.#", decimalFormatSymbols).format(d12 / Math.pow(1000.0d, iLog));
            u0 u0Var = u0.f406856a;
            strValueOf = String.format("%s%c", Arrays.copyOf(new Object[]{str, Character.valueOf("kMBTPE".charAt(iLog - 1))}, 2));
        }
        interfaceC28326e.xd(strValueOf);
        interfaceC28326e.f6(i13, f86778g);
        interfaceC28326e.p9(c28322a.f86720e, z12, kotlin.ranges.s.f(c28322a.f86725j != null ? r3.intValue() / iIntValue : 0.0f, 0.0f, 1.0f));
        interfaceC28326e.a(new C28324c(this, c28322a));
    }
}

package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.internal.widget.tabs.y;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs;
import com.yandex.div2.Y0;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {

    /* compiled from: DivTabsBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivFontWeight.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[0] = 3;
            iArr[3] = 4;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivFontWeight;", "divFontWeight", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivFontWeight;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.l<DivFontWeight, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f368789l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar) {
            super(1);
            this.f368789l = yVar;
        }

        @Override // Y41.l
        public final G0 invoke(DivFontWeight divFontWeight) {
            this.f368789l.setInactiveTypefaceType(j.a(divFontWeight));
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivFontWeight;", "divFontWeight", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivFontWeight;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.l<DivFontWeight, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f368790l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y yVar) {
            super(1);
            this.f368790l = yVar;
        }

        @Override // Y41.l
        public final G0 invoke(DivFontWeight divFontWeight) {
            this.f368790l.setActiveTypefaceType(j.a(divFontWeight));
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DivTabs.TabTitleStyle f368791l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368792m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y f368793n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DivTabs.TabTitleStyle tabTitleStyle, com.yandex.div.json.expressions.e eVar, y yVar) {
            super(1);
            this.f368791l = tabTitleStyle;
            this.f368792m = eVar;
            this.f368793n = yVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            int i12;
            DivTabs.TabTitleStyle tabTitleStyle = this.f368791l;
            com.yandex.div.json.expressions.b<Long> bVar = tabTitleStyle.f372094h;
            com.yandex.div.json.expressions.e eVar = this.f368792m;
            long jLongValue = bVar.a(eVar).longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar2 = tabTitleStyle.f372095i;
            int iOrdinal = bVar2.a(eVar).ordinal();
            int i14 = 1;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i14 = 2;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = 0;
                }
            }
            float f12 = i12;
            y yVar = this.f368793n;
            yVar.setTextSize(i14, f12);
            yVar.setLetterSpacing(((float) tabTitleStyle.f372101o.a(eVar).doubleValue()) / f12);
            com.yandex.div.json.expressions.b<Long> bVar3 = tabTitleStyle.f372102p;
            C37931a.e(yVar, bVar3 == null ? null : bVar3.a(eVar), bVar2.a(eVar));
            return G0.f406611a;
        }
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f368794l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y0 f368795m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368796n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f368797o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y yVar, Y0 y02, com.yandex.div.json.expressions.e eVar, DisplayMetrics displayMetrics) {
            super(1);
            this.f368794l = yVar;
            this.f368795m = y02;
            this.f368796n = eVar;
            this.f368797o = displayMetrics;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            Y0 y02 = this.f368795m;
            com.yandex.div.json.expressions.b<Long> bVar = y02.f374037b;
            com.yandex.div.json.expressions.e eVar = this.f368796n;
            Long lA2 = bVar.a(eVar);
            DisplayMetrics displayMetrics = this.f368797o;
            int iO2 = C37931a.o(lA2, displayMetrics);
            int iO3 = C37931a.o(y02.f374039d.a(eVar), displayMetrics);
            int iO4 = C37931a.o(y02.f374038c.a(eVar), displayMetrics);
            int iO5 = C37931a.o(y02.f374036a.a(eVar), displayMetrics);
            y yVar = this.f368794l;
            yVar.getClass();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            yVar.setPaddingRelative(iO2, iO3, iO4, iO5);
            return G0.f406611a;
        }
    }

    public static final DivTypefaceType a(DivFontWeight divFontWeight) {
        int iOrdinal = divFontWeight.ordinal();
        if (iOrdinal == 0) {
            return DivTypefaceType.f367534e;
        }
        if (iOrdinal == 1) {
            return DivTypefaceType.f367532c;
        }
        if (iOrdinal == 2) {
            return DivTypefaceType.f367531b;
        }
        if (iOrdinal == 3) {
            return DivTypefaceType.f367533d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void b(@Y61.k y yVar, @Y61.k DivTabs.TabTitleStyle tabTitleStyle, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k F21.b bVar) {
        InterfaceC37911f interfaceC37911fD;
        d dVar = new d(tabTitleStyle, eVar, yVar);
        bVar.e(tabTitleStyle.f372094h.d(eVar, dVar));
        bVar.e(tabTitleStyle.f372095i.d(eVar, dVar));
        com.yandex.div.json.expressions.b<Long> bVar2 = tabTitleStyle.f372102p;
        if (bVar2 != null && (interfaceC37911fD = bVar2.d(eVar, dVar)) != null) {
            bVar.e(interfaceC37911fD);
        }
        dVar.invoke(null);
        yVar.setIncludeFontPadding(false);
        DisplayMetrics displayMetrics = yVar.getResources().getDisplayMetrics();
        Y0 y02 = tabTitleStyle.f372103q;
        e eVar2 = new e(yVar, y02, eVar, displayMetrics);
        bVar.e(y02.f374037b.d(eVar, eVar2));
        bVar.e(y02.f374038c.d(eVar, eVar2));
        bVar.e(y02.f374039d.d(eVar, eVar2));
        bVar.e(y02.f374036a.d(eVar, eVar2));
        eVar2.invoke(null);
        com.yandex.div.json.expressions.b<DivFontWeight> bVar3 = tabTitleStyle.f372096j;
        com.yandex.div.json.expressions.b<DivFontWeight> bVar4 = tabTitleStyle.f372098l;
        if (bVar4 == null) {
            bVar4 = bVar3;
        }
        bVar.e(bVar4.e(eVar, new b(yVar)));
        com.yandex.div.json.expressions.b<DivFontWeight> bVar5 = tabTitleStyle.f372088b;
        if (bVar5 != null) {
            bVar3 = bVar5;
        }
        bVar.e(bVar3.e(eVar, new c(yVar)));
    }
}

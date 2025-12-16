package com.avito.android.beduin.common.component.inline_filter.item;

import Y41.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFilterChipsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/f;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/inline_filter/item/d;", "Lcom/avito/android/beduin/common/component/inline_filter/item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.d<d, a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<Button, Filter, G0> f101517b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k p<? super Button, ? super Filter, G0> pVar) {
        this.f101517b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r13, TV0.a r14, int r15) {
        /*
            r12 = this;
            com.avito.android.beduin.common.component.inline_filter.item.d r13 = (com.avito.android.beduin.common.component.inline_filter.item.d) r13
            com.avito.android.beduin.common.component.inline_filter.item.a r14 = (com.avito.android.beduin.common.component.inline_filter.item.a) r14
            com.avito.android.remote.model.search.Filter r15 = r14.f101504b
            java.util.List r0 = r15.getOptions()
            com.avito.android.remote.model.search.InlineFilterValue r15 = r15.getValue()
            com.avito.android.beduin.common.component.inline_filter.item.e r1 = new com.avito.android.beduin.common.component.inline_filter.item.e
            r1.<init>(r12, r14)
            android.view.View r14 = r13.f101511b
            android.content.Context r2 = r14.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.widget.LinearLayout r3 = r13.f101514e
            r3.removeAllViews()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = kotlin.collections.C42745f0.G(r0)
            com.avito.android.remote.model.search.Filter$InnerOptions r0 = (com.avito.android.remote.model.search.Filter.InnerOptions) r0
            if (r0 == 0) goto Lb5
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto Lb5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
            r5 = r4
        L3a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r0.next()
            int r7 = r5 + 1
            r8 = 0
            if (r5 < 0) goto Lb1
            com.avito.android.remote.model.search.Filter$InnerOptions$Options r6 = (com.avito.android.remote.model.search.Filter.InnerOptions.Options) r6
            java.lang.String r9 = r6.getTitle()
            if (r9 == 0) goto Laf
            com.avito.android.beduin.common.component.BeduinComponentTheme r10 = r13.f101512c
            com.avito.android.beduin.common.component.BeduinComponentTheme r11 = com.avito.android.beduin.common.component.BeduinComponentTheme.AVITO_RE_23
            if (r10 != r11) goto L61
            r10 = 2131560921(0x7f0d09d9, float:1.8747228E38)
            android.view.View r8 = r2.inflate(r10, r8)
            com.avito.android.lib.design.button.Button r8 = (com.avito.android.lib.design.button.Button) r8
            goto L6a
        L61:
            r10 = 2131560920(0x7f0d09d8, float:1.8747226E38)
            android.view.View r8 = r2.inflate(r10, r8)
            com.avito.android.lib.design.button.Button r8 = (com.avito.android.lib.design.button.Button) r8
        L6a:
            r8.setText(r9)
            r3.addView(r8)
            if (r5 == 0) goto L8d
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            java.lang.Integer r9 = r13.f101513d
            if (r9 == 0) goto L85
            int r9 = r9.intValue()
        L80:
            int r9 = com.avito.android.util.y6.b(r9)
            goto L87
        L85:
            r9 = 6
            goto L80
        L87:
            r5.setMargins(r9, r4, r4, r4)
            r8.setLayoutParams(r5)
        L8d:
            if (r15 == 0) goto La1
            java.util.List r5 = r15.toStringList()
            if (r5 == 0) goto La1
            java.lang.String r6 = r6.getId()
            boolean r5 = r5.contains(r6)
            r6 = 1
            if (r5 != r6) goto La1
            goto La2
        La1:
            r6 = r4
        La2:
            r8.setActivated(r6)
            com.avito.android.advert.item.compatibility.v2.m r5 = new com.avito.android.advert.item.compatibility.v2.m
            r6 = 9
            r5.<init>(r6, r1)
            r8.setOnClickListener(r5)
        Laf:
            r5 = r7
            goto L3a
        Lb1:
            kotlin.collections.C42745f0.H0()
            throw r8
        Lb5:
            r14.requestLayout()
            r14.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.inline_filter.item.f.O5(TV0.e, TV0.a, int):void");
    }
}

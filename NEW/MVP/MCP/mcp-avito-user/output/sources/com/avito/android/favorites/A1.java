package com.avito.android.favorites;

import Ca1.ViewOnClickListenerC13236c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FavoritesView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class A1 extends kotlin.jvm.internal.N implements Y41.l<View, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f156190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<String> f156191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f156192n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A1(com.avito.android.lib.design.bottom_sheet.d dVar, List<String> list, Y41.l<? super String, kotlin.G0> lVar) {
        super(1);
        this.f156190l = dVar;
        this.f156191m = list;
        this.f156192n = lVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(View view) {
        View view2 = view;
        LinearLayout linearLayout = (LinearLayout) view2;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f156190l;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(dVar.getContext());
        int i12 = 0;
        for (Object obj : this.f156191m) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) obj;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.favorites_reason_item_layout, (ViewGroup) linearLayout, false);
            Integer numValueOf = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? null : Integer.valueOf(R.attr.textIconQuestionOutline) : Integer.valueOf(R.attr.textIconPerson) : Integer.valueOf(R.attr.textIconRoubles) : Integer.valueOf(R.attr.textIconHome);
            TextView textView = viewInflate instanceof TextView ? (TextView) viewInflate : null;
            if (textView != null) {
                textView.setText(str);
                textView.setTextAppearance(C35835l0.j(R.attr.textM20, textView.getContext()));
                if (numValueOf != null) {
                    FV.a aVar = FV.a.f4720a;
                    int iIntValue = numValueOf.intValue();
                    int iB2 = y6.b(13);
                    aVar.getClass();
                    FV.a.j(textView, iIntValue, iB2);
                }
                textView.setOnClickListener(new ViewOnClickListenerC13236c(dVar, this.f156192n, str, 27));
            }
            LinearLayout linearLayout2 = view2 instanceof LinearLayout ? linearLayout : null;
            if (linearLayout2 != null) {
                linearLayout2.addView(viewInflate);
            }
            i12 = i13;
        }
        return kotlin.G0.f406611a;
    }
}

package com.avito.android.service_order_widget.item.form;

import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderFormWidgetView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f278917l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f278918m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, c cVar) {
        super(0);
        this.f278917l = iVar;
        this.f278918m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str = this.f278918m.f278888c;
        i iVar = this.f278917l;
        TextView textView = iVar.f278907b;
        float fMeasureText = textView.getPaint().measureText(str);
        float measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = iVar.f278908c;
        if (fMeasureText >= measuredWidth) {
            textView.setTextAppearance(C35835l0.j(R.attr.textH30, textView.getContext()));
            textView2.setPadding(textView2.getPaddingLeft(), y6.b(6), textView2.getPaddingRight(), textView2.getPaddingBottom());
        } else {
            textView.setTextAppearance(C35835l0.j(R.attr.textH25, textView.getContext()));
            textView2.setPadding(textView2.getPaddingLeft(), y6.b(7), textView2.getPaddingRight(), textView2.getPaddingBottom());
        }
        return G0.f406611a;
    }
}

package com.avito.android.tariff.cpa.info;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpaInfoFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "dialogView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.tariff.cpa.info.ui.items.balance_info.a f294707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CpaInfoFragment f294708m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar, CpaInfoFragment cpaInfoFragment) {
        super(1);
        this.f294707l = aVar;
        this.f294708m = cpaInfoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        TextView textView = (TextView) view2.findViewById(R.id.bs_title);
        com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar = this.f294707l;
        I5.a(textView, aVar.f294812a, false);
        Input input = (Input) view2.findViewById(R.id.input);
        CpaInfoFragment cpaInfoFragment = this.f294708m;
        n.c(input, new d(cpaInfoFragment));
        input.v();
        cpaInfoFragment.f294608y0 = input;
        Button button = (Button) view2.findViewById(R.id.next_button);
        com.avito.android.lib.design.button.b.a(button, aVar.f294813b, false);
        button.setOnClickListener(new a(cpaInfoFragment, 1));
        cpaInfoFragment.f294609z0 = button;
        return G0.f406611a;
    }
}

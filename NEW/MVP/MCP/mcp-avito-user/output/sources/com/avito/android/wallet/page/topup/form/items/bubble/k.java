package com.avito.android.wallet.page.topup.form.items.bubble;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.edit_text.C;
import com.avito.android.lib.deprecated_design.edit_text.C31488a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectBubble.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/bubble/k;", "Lcom/avito/android/wallet/page/topup/form/items/bubble/j;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f328313b;

    /* compiled from: SelectBubble.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f328314l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        TextView textView = (TextView) view;
        this.f328313b = textView;
        textView.addTextChangedListener(new C31488a(new C(view.getResources().getString(R.string.money_input_postfix), 0, false, 6, null), a.f328314l));
    }

    @Override // com.avito.android.wallet.page.topup.form.items.bubble.j
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f328313b.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(11, aVar));
    }

    @Override // com.avito.android.wallet.page.topup.form.items.bubble.j
    public final void setText(@Y61.k String str) {
        this.f328313b.setText(str);
    }
}

package com.avito.android.user_advert.advert.items.reject;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RejectReasonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reject/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/reject/m;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f310009i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f310011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f310012d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f310013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f310014f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f310015g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f310016h;

    public n(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310010b = aVar;
        this.f310011c = (TextView) view.findViewById(R.id.reasons_title);
        this.f310012d = (TextView) view.findViewById(R.id.name);
        this.f310013e = (TextView) view.findViewById(R.id.description);
        TextView textView = (TextView) view.findViewById(R.id.support_link);
        this.f310014f = textView;
        this.f310015g = (Button) view.findViewById(R.id.reject_action);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void F1(@Y61.k String str) {
        I5.a(this.f310012d, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void U2(@Y61.l Y41.a<G0> aVar) {
        this.f310016h = aVar;
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void ZR(@Y61.l AttributedText attributedText) {
        TextView textView = this.f310014f;
        I5.a(textView, this.f310010b.c(textView.getContext(), attributedText), false);
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void al(@Y61.l String str) {
        I5.a(this.f310011c, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f310016h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void kc(@Y61.l Y41.a<G0> aVar) {
        this.f310015g.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(26, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void lD(@Y61.l Action action) {
        Button button = this.f310015g;
        if (action == null) {
            D6.w(button);
        } else {
            D6.H(button);
            button.setText(action.getTitle());
        }
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void n(@Y61.l String str) {
        I5.a(this.f310013e, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.reject.m
    public final void u6(boolean z12) {
        this.itemView.setBackgroundResource(z12 ? R.drawable.bg_reject_reason_orange : R.drawable.bg_reject_reason);
    }
}

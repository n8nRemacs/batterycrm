package com.avito.android.credits.broker_link.no_icon_link;

import Y61.k;
import Y61.l;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CreditBrokerNoIconLinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/broker_link/no_icon_link/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/credits/broker_link/no_icon_link/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f128619d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f128620b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f128621c;

    public e(@k View view) {
        super(view);
        this.f128620b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128621c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.credits.broker_link.no_icon_link.d
    public final void a(@k Y41.a<G0> aVar) {
        this.f128620b.setOnClickListener(new com.avito.android.component.user_hat.items.k(9, aVar));
    }

    @Override // com.avito.android.credits.broker_link.no_icon_link.d
    public final void eZ(@l String str, @l String str2, @l UniversalColor universalColor) {
        TextView textView = this.f128621c;
        if (str == null || str2 == null) {
            D6.w(textView);
            return;
        }
        SpannableString spannableString = new SpannableString(H.i(' ', str, str2));
        spannableString.setSpan(new ForegroundColorSpan(universalColor != null ? C48063a.f437606a.a(textView.getContext(), universalColor) : C35835l0.d(R.attr.blue600, textView.getContext())), 0, str.length(), 33);
        textView.setText(spannableString);
    }

    @Override // com.avito.android.credits.broker_link.no_icon_link.d
    public final void p8(@l AttributedText attributedText, @l String str) {
        TextView textView = this.f128621c;
        if (attributedText != null) {
            j.a(textView, attributedText, null);
        } else {
            I5.a(textView, str, false);
        }
    }
}

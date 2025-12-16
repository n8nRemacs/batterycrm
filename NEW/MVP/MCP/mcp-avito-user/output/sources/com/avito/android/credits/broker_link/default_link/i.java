package com.avito.android.credits.broker_link.default_link;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.credits.broker_link.default_link.a;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.credits.u;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.credit_broker.IconName;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CreditBrokerDefaultLinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/broker_link/default_link/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/credits/broker_link/default_link/h;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f128608h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f128609b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f128610c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f128611d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f128612e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TextView f128613f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f128614g;

    public i(@k View view) {
        super(view);
        this.f128609b = view;
        Context context = view.getContext();
        this.f128610c = context;
        this.f128611d = context.getResources();
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f128612e = (TextView) viewFindViewById;
        this.f128613f = (TextView) view.findViewById(R.id.subtitle);
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f128614g = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void O0(@k String str, @k String str2) {
        this.f128612e.setText(H.i(' ', str, this.f128611d.getString(R.string.advert_details_credit_link_payment_from_postfix, str2)));
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void VE(@k String str) {
        TextView textView = this.f128612e;
        textView.setVisibility(0);
        textView.setText(this.f128611d.getString(R.string.advert_details_credit_link_payment_from, str));
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f128609b.setOnClickListener(new com.avito.android.component.user_hat.items.k(8, aVar));
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void eU(@l String str, boolean z12, @l UniversalColor universalColor) {
        TextView textView = this.f128613f;
        if (textView == null) {
            return;
        }
        int i12 = z12 ? R.attr.textHeadingSmall : R.attr.textBody;
        Context context = this.f128610c;
        textView.setTextAppearance(C35835l0.j(i12, context));
        if (z12) {
            u.a(textView, str, universalColor);
        } else {
            I5.a(textView, str, false);
            textView.setTextColor(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.blue600, context));
        }
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void jA(@k CreditCalculator.Type type, @l IconName iconName) {
        Integer numValueOf;
        a.f128597a.getClass();
        switch (type.ordinal()) {
            case 0:
            case 1:
                numValueOf = Integer.valueOf(R.drawable.tinkoff_logo);
                break;
            case 2:
            case 3:
            case 6:
                numValueOf = null;
                break;
            case 4:
                numValueOf = Integer.valueOf((iconName == null ? -1 : a.C3815a.f128598a[iconName.ordinal()]) == 1 ? R.drawable.credits_sber_logo : R.drawable.cetelem_credit_partner_logo);
                break;
            case 5:
                numValueOf = Integer.valueOf(R.drawable.credits_haraba_logo);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView imageView = this.f128614g;
        if (numValueOf == null) {
            D6.w(imageView);
        } else {
            D6.G(imageView, true);
            imageView.setImageResource(numValueOf.intValue());
        }
    }

    @Override // com.avito.android.credits.broker_link.default_link.h
    public final void setTitle(@k String str) {
        this.f128612e.setText(str);
    }
}

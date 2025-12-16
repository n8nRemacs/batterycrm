package com.avito.android.profile.user_profile.cards.address;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddressCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/h;", "Lcom/avito/android/profile/user_profile/cards/address/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f224729h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f224730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CompositeLocationTextView f224731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CompositeLocationTextView f224732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f224733e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f224734f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f224735g;

    public h(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224730b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.label);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        CompositeLocationTextView compositeLocationTextView = (CompositeLocationTextView) viewFindViewById2;
        compositeLocationTextView.a(R.attr.textM2, R.attr.black);
        this.f224731c = compositeLocationTextView;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        CompositeLocationTextView compositeLocationTextView2 = (CompositeLocationTextView) viewFindViewById3;
        compositeLocationTextView2.a(R.attr.textS1, R.attr.gray64);
        this.f224732d = compositeLocationTextView2;
        View viewFindViewById4 = view.findViewById(R.id.description_details);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224733e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f224734f = (ImageView) viewFindViewById5;
        this.f224735g = (TextView) view.findViewById(R.id.address_action_button);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.g
    public final void D3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.profile.edit.adapter.c cVar = new com.avito.android.profile.edit.adapter.c(9, aVar);
        TextView textView = this.f224735g;
        textView.setOnClickListener(cVar);
        textView.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.g
    public final void HZ(@Y61.k String str, @Y61.k String str2) {
        Drawable drawableH;
        Integer numA = com.avito.android.lib.util.q.a(str);
        Integer numValueOf = null;
        ImageView imageView = this.f224734f;
        if (numA != null) {
            drawableH = C35835l0.h(numA.intValue(), imageView.getContext());
        } else {
            drawableH = null;
        }
        Integer numA2 = com.avito.android.lib.util.e.a(str2);
        if (numA2 != null) {
            numValueOf = Integer.valueOf(C35835l0.d(numA2.intValue(), imageView.getContext()));
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (drawableH != null) {
                drawableH.setTint(iIntValue);
            }
        }
        imageView.setImageDrawable(drawableH);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.g
    public final void Mv(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
        TextView textView = this.f224733e;
        CompositeLocationTextView compositeLocationTextView = this.f224731c;
        CompositeLocationTextView compositeLocationTextView2 = this.f224732d;
        if (str != null && str.length() != 0) {
            CompositeLocationTextView.State state = CompositeLocationTextView.State.f307091b;
            compositeLocationTextView.setState(state);
            compositeLocationTextView.setFirstText(str);
            if (str2 == null || str2.length() == 0) {
                compositeLocationTextView2.setState(state);
                compositeLocationTextView2.setFirstText(str3);
            } else {
                compositeLocationTextView2.setState(CompositeLocationTextView.State.f307092c);
                compositeLocationTextView2.setFirstText(str3.concat(", "));
                compositeLocationTextView2.setSecondText(str2);
            }
            D6.H(compositeLocationTextView2);
            I5.a(textView, str4, false);
            return;
        }
        if (str2 == null || str2.length() == 0) {
            compositeLocationTextView.setState(CompositeLocationTextView.State.f307091b);
            compositeLocationTextView.setFirstText(str3);
        } else {
            compositeLocationTextView.setState(CompositeLocationTextView.State.f307092c);
            compositeLocationTextView.setFirstText(str3.concat(", "));
            compositeLocationTextView.setSecondText(str2);
        }
        if (str4 == null || str4.length() == 0) {
            D6.w(compositeLocationTextView2);
        } else {
            D6.H(compositeLocationTextView2);
            compositeLocationTextView2.setState(CompositeLocationTextView.State.f307091b);
            compositeLocationTextView2.setFirstText(str4);
        }
        I5.a(textView, null, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.g
    public final void setTitle(@Y61.k String str) {
        this.f224730b.setText(str);
    }
}

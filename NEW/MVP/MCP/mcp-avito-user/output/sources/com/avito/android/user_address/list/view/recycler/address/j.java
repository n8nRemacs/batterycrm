package com.avito.android.user_address.list.view.recycler.address;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AddressListItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/address/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_address/list/view/recycler/address/h;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f307475f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CompositeLocationTextView f307476b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f307477c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RadioButton f307478d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f307479e;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        CompositeLocationTextView compositeLocationTextView = (CompositeLocationTextView) viewFindViewById;
        compositeLocationTextView.a(R.attr.textM2, R.attr.black);
        this.f307476b = compositeLocationTextView;
        View viewFindViewById2 = view.findViewById(R.id.text_location);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307477c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.radio_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f307478d = (RadioButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.clickable_layout);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f307479e = viewFindViewById4;
    }

    @Override // com.avito.android.user_address.list.view.recycler.address.h
    public final void cU(@l String str, boolean z12, @k String str2, @l String str3, @l String str4, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        TextView textView = this.f307477c;
        CompositeLocationTextView compositeLocationTextView = this.f307476b;
        String strConcat = "";
        if (str == null || C43066x.K(str)) {
            compositeLocationTextView.setState(CompositeLocationTextView.State.f307092c);
            if (str3 != null && !C43066x.K(str3)) {
                strConcat = ", ".concat(str3);
            }
            compositeLocationTextView.setFirstText(str2);
            compositeLocationTextView.setSecondText(strConcat);
            I5.a(textView, str4, false);
        } else {
            compositeLocationTextView.setState(CompositeLocationTextView.State.f307091b);
            compositeLocationTextView.setFirstText(str);
            textView.setVisibility(0);
            String strConcat2 = (str3 == null || C43066x.K(str3)) ? "" : ", ".concat(str3);
            if (str4 != null && !C43066x.K(str4)) {
                strConcat = "\n".concat(str4);
            }
            textView.setText(str2 + strConcat2 + ' ' + strConcat);
        }
        RadioButton radioButton = this.f307478d;
        if (z12) {
            final int i12 = 0;
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.avito.android.user_address.list.view.recycler.address.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                    switch (i12) {
                        case 0:
                            int i13 = j.f307475f;
                            break;
                        default:
                            int i14 = j.f307475f;
                            compoundButton.setChecked(false);
                            break;
                    }
                }
            });
        } else {
            final int i13 = 1;
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.avito.android.user_address.list.view.recycler.address.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                    switch (i13) {
                        case 0:
                            int i132 = j.f307475f;
                            break;
                        default:
                            int i14 = j.f307475f;
                            compoundButton.setChecked(false);
                            break;
                    }
                }
            });
        }
        radioButton.setChecked(z12);
        radioButton.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(8, aVar));
        this.f307479e.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(9, aVar2));
    }
}

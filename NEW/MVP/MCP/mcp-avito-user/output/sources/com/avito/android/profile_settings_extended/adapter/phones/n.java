package com.avito.android.profile_settings_extended.adapter.phones;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Barrier;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedSettingsPhonesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/phones/k;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends com.avito.konveyor.adapter.b implements k, InterfaceC15026b {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f229722n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229723b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f229724c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public final int f229725d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public final int f229726e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    public final int f229727f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42156l
    public final int f229728g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f229729h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f229730i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Barrier f229731j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f229732k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f229733l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f229734m;

    public n(@Y61.k View view) {
        super(view);
        this.f229723b = new C15027c(view);
        Context context = view.getContext();
        this.f229724c = LayoutInflater.from(context);
        this.f229725d = C35835l0.d(R.attr.blue, context);
        this.f229726e = C35835l0.d(R.attr.gray48, context);
        this.f229727f = C35835l0.d(R.attr.black, context);
        this.f229728g = C35835l0.d(R.attr.gray48, context);
        View viewFindViewById = view.findViewById(R.id.extended_settings_phones_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229729h = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_settings_phones_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f229730i = textView;
        View viewFindViewById3 = view.findViewById(R.id.extended_settings_phones_barrier);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Barrier");
        }
        this.f229731j = (Barrier) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_settings_phones_phone_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f229732k = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_settings_phones_add_phone_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229733l = (Button) viewFindViewById5;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void A80(boolean z12) {
        Barrier barrier = this.f229731j;
        ViewGroup viewGroup = this.f229732k;
        if (z12) {
            D6.H(viewGroup);
            barrier.setDpMargin(8);
        } else {
            D6.w(viewGroup);
            barrier.setDpMargin(16);
        }
    }

    public final void B80(Y41.a aVar, AttributedText attributedText, String str, String str2) {
        TextView textView = this.f229730i;
        D6.H(textView);
        Button button = this.f229733l;
        D6.H(button);
        button.setOnClickListener(new l(0, aVar));
        I5.a(this.f229729h, str, false);
        com.avito.android.util.text.j.a(textView, attributedText, null);
        com.avito.android.lib.design.button.b.a(button, str2, false);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void Jc() {
        this.f229732k.removeAllViews();
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void OU(@Y61.k ExtendedSettingsPhonesItem extendedSettingsPhonesItem) {
        I5.a(this.f229729h, extendedSettingsPhonesItem.f229676d, false);
        D6.w(this.f229730i);
        D6.w(this.f229733l);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void Rt(@Y61.k ExtendedSettingsPhonesItem extendedSettingsPhonesItem, @Y61.k Y41.a<G0> aVar) {
        B80(aVar, extendedSettingsPhonesItem.f229677e, extendedSettingsPhonesItem.f229676d, extendedSettingsPhonesItem.f229678f);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void XH(@Y61.k ExtendedSettingsPhonesItem extendedSettingsPhonesItem, @Y61.k Y41.a<G0> aVar) {
        ExtendedSettingsPhonesItem.EmptyState emptyState = extendedSettingsPhonesItem.f229681i;
        B80(aVar, emptyState.f229686c, emptyState.f229685b, emptyState.f229687d);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f229734m = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f229734m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.k
    public final void rC(@Y61.k final PhoneValue phoneValue, @Y61.k final Y41.l<? super PhoneValue, G0> lVar, @Y61.k final Y41.l<? super PhoneValue, G0> lVar2) {
        LayoutInflater layoutInflater = this.f229724c;
        ViewGroup viewGroup = this.f229732k;
        View viewInflate = layoutInflater.inflate(R.layout.ext_profile_settings_phone_item, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.phone);
        ExtendedSettingsPhonesItem.Phone phone = phoneValue.f229694b;
        textView.setText(phone.f229691d);
        boolean z12 = phone.f229693f;
        int i12 = this.f229727f;
        int i13 = this.f229728g;
        textView.setTextColor(z12 ? i13 : i12);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.status);
        PhoneVerificationStatus phoneVerificationStatus = phone.f229692e;
        textView2.setText(phoneVerificationStatus.getF229696c());
        textView2.setTextColor(z12 ? i13 : phoneVerificationStatus instanceof PhoneVerificationStatusPending ? this.f229725d : this.f229726e);
        final int i14 = 0;
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile_settings_extended.adapter.phones.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneValue phoneValue2 = phoneValue;
                Y41.l lVar3 = lVar;
                switch (i14) {
                    case 0:
                        int i15 = n.f229722n;
                        lVar3.invoke(phoneValue2);
                        break;
                    default:
                        int i16 = n.f229722n;
                        lVar3.invoke(phoneValue2);
                        break;
                }
            }
        });
        Button button = (Button) viewInflate.findViewById(R.id.btn_more);
        if (z12) {
            i12 = i13;
        }
        button.setIconColor(ColorStateList.valueOf(i12));
        final int i15 = 1;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile_settings_extended.adapter.phones.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneValue phoneValue2 = phoneValue;
                Y41.l lVar3 = lVar2;
                switch (i15) {
                    case 0:
                        int i152 = n.f229722n;
                        lVar3.invoke(phoneValue2);
                        break;
                    default:
                        int i16 = n.f229722n;
                        lVar3.invoke(phoneValue2);
                        break;
                }
            }
        });
        viewGroup.addView(viewInflate);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229723b.xT(z12);
    }
}

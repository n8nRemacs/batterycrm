package com.avito.android.profile.user_profile.cards.phones;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/phones/i;", "Lcom/avito/android/profile/user_profile/cards/phones/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Context f225164b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f225165c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f225166d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225167e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f225168f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Drawable f225169g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f225170h;

    /* compiled from: PhonesCardItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PhoneProtectionDisclaimerStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr = PhoneProtectionDisclaimerStyle.f225152b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr2 = PhoneProtectionDisclaimerStyle.f225152b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: PhonesCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225171l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f225171l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225171l.invoke();
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f225164b = context;
        this.f225165c = LayoutInflater.from(context);
        View viewFindViewById = view.findViewById(R.id.phone_card_phones_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f225166d = (ViewGroup) viewFindViewById;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.phone_card_action_button);
        cVarA.a(R.string.phone_action_manage);
        this.f225167e = cVarA;
        this.f225168f = C35835l0.l(androidx.core.content.d.getDrawable(context, R.drawable.ic_call_24), C35835l0.d(R.attr.gray28, context));
        this.f225169g = C35835l0.l(C35835l0.h(R.attr.ic_attentionBoldOutline24, context), C35835l0.d(R.attr.red, context));
        this.f225170h = C35835l0.l(C35835l0.h(R.attr.ic_timeBoldOutline24, context), C35835l0.d(R.attr.blue700, context));
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void HY(@k String str, boolean z12, boolean z13, @l Boolean bool) {
        LayoutInflater layoutInflater = this.f225165c;
        ViewGroup viewGroup = this.f225166d;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_phones_card_item, viewGroup, false);
        com.avito.android.profile.user_profile.cards.d.d(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(str);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageDrawable(z12 ? this.f225168f : bool.equals(Boolean.TRUE) ? this.f225170h : this.f225169g);
        View viewFindViewById2 = viewInflate.findViewById(R.id.protected_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.G(viewFindViewById2, z13);
        viewGroup.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void JC(@k String str, boolean z12) {
        LayoutInflater layoutInflater = this.f225165c;
        ViewGroup viewGroup = this.f225166d;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_phones_card_item, viewGroup, false);
        com.avito.android.profile.user_profile.cards.d.d(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(str);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageDrawable(this.f225168f);
        View viewFindViewById2 = viewInflate.findViewById(R.id.protected_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.w(viewFindViewById2);
        if (z12) {
            View viewFindViewById3 = viewInflate.findViewById(R.id.description);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.H(viewFindViewById3);
        } else {
            View viewFindViewById4 = viewInflate.findViewById(R.id.description);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.w(viewFindViewById4);
        }
        viewGroup.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void Jc() {
        this.f225166d.removeAllViews();
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225167e.c(new b(aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f225167e.c(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void q10() throws Resources.NotFoundException {
        PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr = PhoneProtectionDisclaimerStyle.f225152b;
        String string = this.f225164b.getResources().getString(R.string.call_settings_protection_disclaimer);
        LayoutInflater layoutInflater = this.f225165c;
        ViewGroup viewGroup = this.f225166d;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_phones_card_info, viewGroup, false);
        com.avito.android.profile.user_profile.cards.d.d(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(string);
        View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.H((ImageView) viewFindViewById2);
        viewGroup.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.phones.h
    public final void zh(int i12, int i13) throws Resources.NotFoundException {
        Context context = this.f225164b;
        String quantityString = context.getResources().getQuantityString(R.plurals.some_more_phones_plural, i12, Integer.valueOf(i12));
        String quantityString2 = context.getResources().getQuantityString(R.plurals.some_more_devices_plural, i13, Integer.valueOf(i13));
        String string = (i12 != 0 || i13 <= 0) ? (i12 <= 0 || i13 != 0) ? context.getResources().getString(R.string.some_more_phones_placeholder_updated, r.r(quantityString, " и ", quantityString2)) : context.getResources().getString(R.string.some_more_phones_placeholder_updated, quantityString) : context.getResources().getString(R.string.some_more_phones_placeholder_updated, quantityString2);
        LayoutInflater layoutInflater = this.f225165c;
        ViewGroup viewGroup = this.f225166d;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_phones_card_info, viewGroup, false);
        com.avito.android.profile.user_profile.cards.d.d(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(string);
        View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.g((ImageView) viewFindViewById2);
        viewGroup.addView(viewInflate);
    }
}

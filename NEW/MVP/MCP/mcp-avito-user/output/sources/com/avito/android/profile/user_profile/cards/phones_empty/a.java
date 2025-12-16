package com.avito.android.profile.user_profile.cards.phones_empty;

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
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesEmptyCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/phones_empty/a;", "Lcom/avito/android/profile/user_profile/cards/phones_empty/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Context f225172b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f225173c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225174d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f225175e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f225176f;

    /* compiled from: PhonesEmptyCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.user_profile.cards.phones_empty.a$a, reason: collision with other inner class name */
    public static final class C6826a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225177l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6826a(Y41.a<G0> aVar) {
            super(0);
            this.f225177l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225177l.invoke();
            return G0.f406611a;
        }
    }

    public a(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f225172b = context;
        this.f225173c = LayoutInflater.from(context);
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.phone_card_empty_action_button);
        cVarA.a(R.string.phone_action_manage);
        this.f225174d = cVarA;
        View viewFindViewById = view.findViewById(R.id.phone_card_empty_phones_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f225175e = (ViewGroup) viewFindViewById;
        this.f225176f = C35835l0.l(androidx.core.content.d.getDrawable(context, R.drawable.ic_call_24), C35835l0.d(R.attr.gray28, context));
    }

    @Override // com.avito.android.profile.user_profile.cards.phones_empty.i
    public final void KB(@k String str) {
        LayoutInflater layoutInflater = this.f225173c;
        ViewGroup viewGroup = this.f225175e;
        View viewInflate = layoutInflater.inflate(R.layout.user_profile_phones_card_item, viewGroup, false);
        com.avito.android.profile.user_profile.cards.d.d(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(str);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageDrawable(this.f225176f);
        View viewFindViewById2 = viewInflate.findViewById(R.id.protected_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.w(viewFindViewById2);
        viewGroup.addView(viewInflate);
    }

    @Override // com.avito.android.profile.user_profile.cards.phones_empty.i
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225174d.c(new C6826a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.phones_empty.i
    public final void hE(int i12) throws Resources.NotFoundException {
        Context context = this.f225172b;
        String string = context.getResources().getString(R.string.some_more_phones_placeholder_updated, context.getResources().getQuantityString(R.plurals.some_more_devices_plural, i12, Integer.valueOf(i12)));
        LayoutInflater layoutInflater = this.f225173c;
        ViewGroup viewGroup = this.f225175e;
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

    @Override // com.avito.android.profile.user_profile.cards.phones_empty.i
    public final void zo() {
        this.f225175e.removeAllViews();
    }
}

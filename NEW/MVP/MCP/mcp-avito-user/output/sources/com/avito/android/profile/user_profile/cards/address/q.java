package com.avito.android.profile.user_profile.cards.address;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.user_profile.items.SuggestedAddress;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyAddressCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/q;", "Lcom/avito/android/profile/user_profile/cards/address/EmptyAddressCardView;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q extends com.avito.konveyor.adapter.b implements EmptyAddressCardView {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f224751p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f224752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f224753c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Badge f224754d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f224755e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f224756f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f224757g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f224758h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f224759i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f224760j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f224761k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ImageView f224762l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f224763m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f224764n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f224765o;

    /* compiled from: EmptyAddressCardView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[EmptyAddressCardView.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EmptyAddressCardView.State state = EmptyAddressCardView.State.f224714b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EmptyAddressCardView.State state2 = EmptyAddressCardView.State.f224714b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public q(@Y61.k View view) {
        super(view);
        this.f224752b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224753c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f224754d = (Badge) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224755e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f224756f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.address_insert);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f224757g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.insert_address);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224758h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.insert_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f224759i = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.suggest_layout);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f224760j = (ConstraintLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.suggest_address);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224761k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.suggest_close);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f224762l = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.suggest_save);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f224763m = (Button) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.line);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224764n = viewFindViewById12;
        this.f224765o = (TextView) view.findViewById(R.id.address_action_button);
    }

    public final void B80(boolean z12) {
        this.f224755e.setVisibility(z12 ? 0 : 8);
        this.f224756f.setVisibility(z12 ? 0 : 8);
        this.f224764n.setVisibility(z12 ? 0 : 8);
        this.f224765o.setVisibility(z12 ? 0 : 8);
    }

    public final void C80(boolean z12) {
        ConstraintLayout constraintLayout = this.f224760j;
        constraintLayout.setBackgroundTintList(com.avito.android.lib.util.darkTheme.c.a(constraintLayout.getContext()) ? C35835l0.e(R.attr.white, constraintLayout.getContext()) : C35835l0.e(R.attr.warmGray4, constraintLayout.getContext()));
        constraintLayout.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void D3(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.profile.edit.adapter.c cVar = new com.avito.android.profile.edit.adapter.c(12, aVar);
        TextView textView = this.f224765o;
        textView.setOnClickListener(cVar);
        textView.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void I1(@Y61.l String str) {
        int i12 = (str == null || str.length() == 0) ? 8 : 0;
        Badge badge = this.f224754d;
        badge.setVisibility(i12);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void QD(@Y61.l SuggestedAddress suggestedAddress, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        if (suggestedAddress != null) {
            this.f224761k.setText(suggestedAddress.getAddress());
            String title = suggestedAddress.getButton().getTitle();
            Button button = this.f224763m;
            button.setText(title);
            button.setOnClickListener(new com.avito.android.profile.edit.adapter.c(10, aVar));
            this.f224762l.setOnClickListener(new com.avito.android.profile.edit.adapter.c(11, aVar2));
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void i(@Y61.k UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = this.f224756f;
        com.avito.android.advert.item.delivery_suggests.l.w(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())), C35949t5.a(simpleDraweeView));
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void j80(@Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
        Drawable drawableH;
        Integer numValueOf;
        this.f224758h.setText(str);
        Integer numA = com.avito.android.lib.util.q.a(str2);
        Drawable drawableH2 = null;
        ImageView imageView = this.f224759i;
        if (numA != null) {
            drawableH = C35835l0.h(numA.intValue(), imageView.getContext());
        } else {
            drawableH = null;
        }
        Integer numA2 = com.avito.android.lib.util.e.a(str3);
        if (numA2 != null) {
            numValueOf = Integer.valueOf(C35835l0.d(numA2.intValue(), imageView.getContext()));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (drawableH != null) {
                drawableH.setTint(iIntValue);
            }
        }
        Integer numA3 = com.avito.android.lib.util.q.a(str2);
        if (numA3 != null) {
            drawableH2 = C35835l0.h(numA3.intValue(), imageView.getContext());
        }
        imageView.setImageDrawable(drawableH2);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void setText(@Y61.k String str) {
        this.f224755e.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void setTitle(@Y61.k String str) {
        this.f224753c.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView
    public final void sz(@Y61.k EmptyAddressCardView.State state) {
        int iOrdinal = state.ordinal();
        LinearLayout linearLayout = this.f224757g;
        if (iOrdinal == 0) {
            B80(false);
            linearLayout.setVisibility(8);
            C80(true);
        } else if (iOrdinal == 1) {
            B80(true);
            linearLayout.setVisibility(0);
            C80(false);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            B80(true);
            linearLayout.setVisibility(8);
            C80(false);
        }
    }
}

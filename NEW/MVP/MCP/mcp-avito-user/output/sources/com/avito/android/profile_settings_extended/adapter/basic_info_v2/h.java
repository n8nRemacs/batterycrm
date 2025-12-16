package com.avito.android.profile_settings_extended.adapter.basic_info_v2;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.y;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2ItemView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: BasicInfoV2ItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2ItemView;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements BasicInfoV2ItemView, InterfaceC15026b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f229261q = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f229262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15027c f229263c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f229264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f229265e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f229266f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f229267g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f229268h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f229269i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f229270j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f229271k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f229272l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f229273m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Button f229274n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Button f229275o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ViewGroup f229276p;

    /* compiled from: BasicInfoV2ItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            int measuredWidth = (hVar.f229276p.getMeasuredWidth() - hVar.f229275o.getMeasuredWidth()) - y6.b(48);
            Button button = hVar.f229274n;
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            layoutParams.width = Math.min(measuredWidth, button.getMeasuredWidth());
            button.setLayoutParams(layoutParams);
            return G0.f406611a;
        }
    }

    /* compiled from: BasicInfoV2ItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229278a;

        static {
            int[] iArr = new int[BasicInfoV2Widget.VerificationStatus.values().length];
            try {
                iArr[BasicInfoV2Widget.VerificationStatus.VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f229278a = iArr;
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f229279b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f229280c;

        public c(l lVar, h hVar) {
            this.f229279b = lVar;
            this.f229280c = hVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            this.f229279b.invoke(Integer.valueOf(this.f229280c.f229269i.getId()));
        }
    }

    public h(@k View view) {
        super(view);
        this.f229262b = view;
        this.f229263c = new C15027c(view);
        this.f229264d = view.getContext();
        View viewFindViewById = view.findViewById(R.id.extended_profile_basic_info_v2_avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f229265e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_basic_info_v2_avatar_moderation_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229266f = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_basic_info_v2_avatar_moderation_boarder);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229267g = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_basic_info_v2_user_name);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229268h = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_profile_basic_info_v2_seller_type);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229269i = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_basic_info_v2_profile_type);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229270j = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.extended_profile_basic_info_v2_registered_time);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229271k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.extended_profile_basic_info_v2_user_id);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229272l = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.extended_profile_basic_info_v2_profile_category);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229273m = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.extended_profile_basic_info_v2_verification_button);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229274n = (Button) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.extended_profile_basic_info_v2_more_button);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229275o = (Button) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.extended_profile_basic_info_v2_content_container);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById12;
        this.f229276p = viewGroup;
        D6.l(true, viewGroup, new a());
    }

    @Override // com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2ItemView
    public final void N60(@k BasicInfoV2Item basicInfoV2Item, @k l<? super Integer, G0> lVar, @k l<? super BasicInfoV2ItemView.ClickType, G0> lVar2) {
        Drawable drawableA;
        BasicInfoV2Item.Avatar avatar = basicInfoV2Item.f229214j;
        Image image = avatar.f229222b;
        C35949t5.c(this.f229265e, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
        this.f229265e.setOnClickListener(new ViewOnClickListenerC31042l(19, lVar2));
        ModerationStatus moderationStatus = avatar.f229224d;
        boolean z12 = moderationStatus instanceof ModerationStatus.ModerationFailed;
        ImageView imageView = this.f229267g;
        ImageView imageView2 = this.f229266f;
        if (z12) {
            imageView2.setImageResource(C35835l0.j(R.attr.ic_attentionRound20, imageView2.getContext()));
            imageView2.setImageTintList(C35835l0.e(R.attr.red600, imageView2.getContext()));
            D6.H(imageView2);
            D6.H(imageView);
        } else if (moderationStatus instanceof ModerationStatus.ModerationPending) {
            imageView2.setImageResource(C35835l0.j(R.attr.ic_time20, imageView2.getContext()));
            imageView2.setImageTintList(C35835l0.e(R.attr.blue600, imageView2.getContext()));
            D6.H(imageView2);
            D6.H(imageView);
        } else {
            D6.w(imageView2);
            D6.w(imageView);
        }
        ModerationStatus moderationStatus2 = basicInfoV2Item.f229213i;
        boolean z13 = moderationStatus2 instanceof ModerationStatus.ModerationFailed;
        Context context = this.f229264d;
        if (z13) {
            drawableA = C43852a.a(context, C35835l0.j(R.attr.ic_attentionRound20, context));
            if (drawableA != null) {
                drawableA.setTintList(C35835l0.e(R.attr.red600, context));
            } else {
                drawableA = null;
            }
        } else {
            if (moderationStatus2 instanceof ModerationStatus.ModerationPending) {
                drawableA = C43852a.a(context, C35835l0.j(R.attr.ic_time20, context));
                if (drawableA != null) {
                    drawableA.setTintList(C35835l0.e(R.attr.blue600, context));
                }
            } else if (!(moderationStatus2 instanceof ModerationStatus.ModerationPassed) && moderationStatus2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            drawableA = null;
        }
        TextView textView = this.f229268h;
        String str = basicInfoV2Item.f229212h;
        if (drawableA == null || str == null) {
            I5.a(textView, str, false);
        } else {
            drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append("_", new PK0.h(y6.b(6)), 33);
            spannableStringBuilder.append("_", new y(drawableA), 17);
            I5.a(textView, spannableStringBuilder, false);
        }
        textView.setOnClickListener(new ViewOnClickListenerC31042l(20, lVar2));
        I5.a(this.f229270j, basicInfoV2Item.f229207c, false);
        BasicInfoV2Item.ServicesProfileType servicesProfileType = basicInfoV2Item.f229217m;
        String str2 = servicesProfileType != null ? servicesProfileType.f229238b : null;
        TextView textView2 = this.f229269i;
        I5.a(textView2, str2, false);
        if (textView2.getVisibility() == 0) {
            if (!textView2.isLaidOut() || textView2.isLayoutRequested()) {
                textView2.addOnLayoutChangeListener(new c(lVar, this));
            } else {
                ((d) lVar).invoke(Integer.valueOf(textView2.getId()));
            }
        }
        I5.a(this.f229271k, basicInfoV2Item.f229208d, false);
        CharSequence charSequenceE = FV.a.f4720a.e(basicInfoV2Item.f229209e, this.f229262b.getContext(), R.attr.textIconCopy, y6.b(4));
        TextView textView3 = this.f229272l;
        I5.a(textView3, charSequenceE, false);
        textView3.setOnClickListener(new ViewOnClickListenerC31042l(21, lVar2));
        I5.a(this.f229273m, basicInfoV2Item.f229211g, false);
        BasicInfoV2Item.Verification verification = basicInfoV2Item.f229215k;
        Button button = this.f229274n;
        if (verification != null) {
            com.avito.android.lib.design.button.b.a(button, verification.f229241c, false);
            BasicInfoV2Widget.VerificationStatus verificationStatus = verification.f229240b;
            button.setAppearanceFromAttr((verificationStatus == null ? -1 : b.f229278a[verificationStatus.ordinal()]) == 1 ? R.attr.buttonPrimaryLarge : R.attr.buttonSecondaryLarge);
            Button.g(button, C43852a.a(button.getRootView().getContext(), R.drawable.common_ic_verified_20), null, false, null, 14);
            button.setIconColor(C35835l0.e(R.attr.blue700, button.getRootView().getContext()));
            button.setOnClickListener(new ViewOnClickListenerC31042l(22, lVar2));
        } else {
            D6.w(button);
        }
        this.f229275o.setOnClickListener(new ViewOnClickListenerC31042l(23, lVar2));
        this.f229276p.setOnClickListener(new ViewOnClickListenerC31042l(24, lVar2));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229265e.setOnClickListener(null);
        this.f229272l.setOnClickListener(null);
        this.f229274n.setOnClickListener(null);
        this.f229275o.setOnClickListener(null);
        this.f229276p.setOnClickListener(null);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229263c.xT(z12);
    }
}

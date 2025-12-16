package com.avito.android.profile_vk_linking.common;

import Y41.l;
import Y41.p;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopupBanner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VkPopupView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/VkPopupView;", "", "NavigationType", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VkPopupView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f230927a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f230928b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> f230929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f230930d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Toolbar f230931e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f230932f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f230933g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f230934h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f230935i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f230936j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinearLayout f230937k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f230938l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f230939m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final TextView f230940n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Banner f230941o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final LinearLayout f230942p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final LinearLayout f230943q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final FrameLayout f230944r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final NestedScrollView f230945s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPopupView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/VkPopupView$NavigationType;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigationType {

        /* renamed from: b, reason: collision with root package name */
        public static final NavigationType f230946b;

        /* renamed from: c, reason: collision with root package name */
        public static final NavigationType f230947c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ NavigationType[] f230948d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f230949e;

        static {
            NavigationType navigationType = new NavigationType("CLOSE", 0);
            f230946b = navigationType;
            NavigationType navigationType2 = new NavigationType("BACK", 1);
            f230947c = navigationType2;
            NavigationType[] navigationTypeArr = {navigationType, navigationType2};
            f230948d = navigationTypeArr;
            f230949e = kotlin.enums.c.a(navigationTypeArr);
        }

        public NavigationType() {
            throw null;
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) f230948d.clone();
        }
    }

    /* compiled from: VkPopupView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230950a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f230951b;

        static {
            int[] iArr = new int[NavigationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationType navigationType = NavigationType.f230946b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[VkPopup.CommonButton.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VkPopup.CommonButton.Type type = VkPopup.CommonButton.Type.f231022b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f230950a = iArr2;
            int[] iArr3 = new int[VkPopupBanner.Type.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                VkPopupBanner.Type type2 = VkPopupBanner.Type.f231034b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                VkPopupBanner.Type type3 = VkPopupBanner.Type.f231034b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f230951b = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkPopupView(@k View view, boolean z12, @k NavigationType navigationType, @k Y41.a<G0> aVar, @k l<? super DeepLink, G0> lVar, @k p<? super DeepLink, ? super VkPopup.CommonButton.ActionButton.ActionType, ? extends View.OnClickListener> pVar, @Y61.l Y41.a<G0> aVar2) {
        this.f230927a = z12;
        this.f230928b = lVar;
        this.f230929c = pVar;
        this.f230930d = aVar2;
        View viewFindViewById = view.findViewById(R.id.vk_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f230931e = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.vk_toolbar_more_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f230932f = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vk_logo);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f230933g = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.vk_group_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById4;
        this.f230934h = simpleDraweeView;
        View viewFindViewById5 = view.findViewById(R.id.vk_group_name);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f230935i = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.vk_group_members);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f230936j = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.vk_group_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f230937k = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.vk_popup_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f230938l = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.vk_popup_body);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById9;
        this.f230939m = textView;
        View viewFindViewById10 = view.findViewById(R.id.vk_popup_disclaimer);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById10;
        this.f230940n = textView2;
        View viewFindViewById11 = view.findViewById(R.id.vk_popup_banner);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f230941o = (Banner) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.vk_popup_buttons_container_scrolling);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f230942p = (LinearLayout) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.vk_popup_buttons_container_bottom);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f230943q = (LinearLayout) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.vk_popup_recycler_container);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f230944r = (FrameLayout) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.vk_popup_scrollable_container);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f230945s = (NestedScrollView) viewFindViewById15;
        int iOrdinal = navigationType.ordinal();
        if (iOrdinal == 0) {
            toolbar.setNavigationIcon(R.drawable.ic_close_24_black);
        } else if (iOrdinal == 1) {
            toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        }
        toolbar.setNavigationOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(27, aVar));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        simpleDraweeView.getHierarchy().q(C35835l0.l(C35835l0.h(R.attr.ic_shop64, view.getContext()), C35835l0.d(R.attr.gray16, view.getContext())), (s.a) s.c.f340135g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e3  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.avito.android.remote.model.Image] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y41.l] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View, com.avito.android.lib.design.button.Button] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(final com.avito.android.profile_vk_linking.common.VkPopupView r23, com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup r24, Jc0.C14186a r25, com.avito.android.remote.model.Image r26, com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup.CommonButton.ActionButton.ActionType r27, java.lang.Class r28, int r29) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.common.VkPopupView.b(com.avito.android.profile_vk_linking.common.VkPopupView, com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup, Jc0.a, com.avito.android.remote.model.Image, com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup$CommonButton$ActionButton$ActionType, java.lang.Class, int):void");
    }

    public final void a(Button button, VkPopupBanner.a aVar) {
        if (aVar == null) {
            D6.w(button);
            button.setOnClickListener(null);
        } else {
            D6.H(button);
            button.setText(aVar.f231039a);
            button.setOnClickListener(this.f230929c.invoke(aVar.f231040b.getDeepLink(), null));
        }
    }

    public /* synthetic */ VkPopupView(View view, boolean z12, NavigationType navigationType, Y41.a aVar, l lVar, p pVar, Y41.a aVar2, int i12, C42822w c42822w) {
        this(view, z12, navigationType, aVar, lVar, pVar, (i12 & 64) != 0 ? null : aVar2);
    }
}

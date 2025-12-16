package com.avito.android.user_adverts_views.advert_item;

import LV.c;
import VU.b;
import Zx.C19616a;
import aV.C19820c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import com.avito.android.user_adverts_views_pub.c;
import com.avito.android.user_adverts_views_util.CompositeMultiItemTextView;
import com.avito.android.user_adverts_views_util.CpxPromoWidgetView;
import com.avito.android.user_adverts_views_util.IconsView;
import com.avito.android.user_adverts_views_util.position.BlinkOvalView;
import com.avito.android.user_adverts_views_util.position.SearchPositionView;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42150f;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import sK0.C48063a;
import ur.InterfaceC49101b;
import xV.C49888a;
import yV.C50177a;

/* compiled from: UserAdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views/advert_item/p;", "Lcom/avito/android/user_adverts_views_pub/c$b;", "a", "_avito_user-adverts-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends c.b {

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f316523F0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final CpxPromoWidgetView f316524A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f316525A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final TextView f316526B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final Object f316527B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final View f316528C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final Object f316529C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final CompositeLocationTextView f316530D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final Object f316531D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final TextView f316532E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final Object f316533E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f316534F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final TextView f316535G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final TextView f316536H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final TextView f316537I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final View f316538J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final TextView f316539K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final TextView f316540L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final TextView f316541M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final TextView f316542N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final TextView f316543O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final View f316544P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final TextView f316545Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final TextView f316546R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final View f316547S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final TextView f316548T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final ProgressBarRe23 f316549U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final TextView f316550V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final TextView f316551W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final CompositeMultiItemTextView f316552X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final View f316553Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final TextView f316554Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final TextView f316555a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f316556b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final TextView f316557b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts_views_util.position.a f316558c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final TextView f316559c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f316560d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final TextView f316561d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f316562e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final TextView f316563e0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f316564f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final Object f316565f0;

    /* renamed from: g, reason: collision with root package name */
    public final Resources f316566g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final TextView f316567g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f316568h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final Button f316569h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f316570i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final Object f316571i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Checkbox f316572j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final Object f316573j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f316574k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final Object f316575k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f316576l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final Object f316577l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ImageView f316578m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final Object f316579m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f316580n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final Object f316581n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f316582o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final Object f316583o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final View f316584p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final Object f316585p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f316586q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final Object f316587q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f316588r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final Object f316589r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f316590s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final Object f316591s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final DockingBadgeContainer f316592t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final Object f316593t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f316594u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final Object f316595u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f316596v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final Object f316597v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final DockingBadge f316598w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final Object f316599w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f316600x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final Object f316601x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final IconsView f316602y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final Object f316603y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final SearchPositionView f316604z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public N f316605z0;

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class A extends N implements Y41.a<Integer> {
        public A() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.green800, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/user_adverts_views/advert_item/p$a;", "", "<init>", "()V", "", "ACTIVE_SHORTCUT", "Ljava/lang/String;", "", "ARCHIVED_IMAGE_ALPHA", "F", "ARCHIVED_SHORTCUT", "DEFAULT_IMAGE_ALPHA", "", "MIN_ROUNDED_CONVERSION", "D", "REJECTED_SHORTCUT", "", "THIN_SPACE", "C", "_avito_user-adverts-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_views.advert_item.p$a, reason: case insensitive filesystem */
    public static final class C35712a {
        public /* synthetic */ C35712a(C42822w c42822w) {
            this();
        }

        public C35712a() {
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f316607a;

        static {
            int[] iArr = new int[UserAdvertItem.Status.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f316607a = iArr;
            int[] iArr2 = new int[UserAdvertItem.RightAction.Button.Style.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UserAdvertItem.RightAction.Button.Style style = UserAdvertItem.RightAction.Button.Style.f316653b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[UserAdvertItem.CpxPromoWidget.Color.values().length];
            try {
                iArr3[3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UserAdvertItem.CpxPromoWidget.Color color = UserAdvertItem.CpxPromoWidget.Color.f316643b;
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UserAdvertItem.CpxPromoWidget.Color color2 = UserAdvertItem.CpxPromoWidget.Color.f316643b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UserAdvertItem.CpxPromoWidget.Color color3 = UserAdvertItem.CpxPromoWidget.Color.f316643b;
                iArr3[1] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[State.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                State state = State.f181147b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                State state2 = State.f181147b;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.gray54, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<List<? extends TextView>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends TextView> invoke() {
            p pVar = p.this;
            return C42745f0.U(pVar.f316576l, pVar.f316588r, pVar.f316535G, pVar.f316537I, pVar.f316536H, pVar.f316534F);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LbV/a;", "invoke", "()LbV/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<C25568a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final C25568a invoke() {
            C25568a.C2002a c2002a = C25568a.f57090g;
            Context context = p.this.f316564f;
            int iJ2 = C35835l0.j(R.attr.dockingBadgeGraySmall, context);
            c2002a.getClass();
            return C25568a.C2002a.b(iJ2, context);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f316613l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f316614m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super DeepLink, G0> lVar, DeepLink deepLink) {
            super(0);
            this.f316613l = lVar;
            this.f316614m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f316613l.invoke(this.f316614m);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVU/b;", "invoke", "()LVU/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<VU.b> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final VU.b invoke() {
            b.a aVar = VU.b.f17147t;
            Context context = p.this.f316564f;
            aVar.getClass();
            return (VU.b) c.a.a(aVar, context, R.attr.buttonPrimarySmall);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVU/b;", "invoke", "()LVU/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<VU.b> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final VU.b invoke() {
            b.a aVar = VU.b.f17147t;
            Context context = p.this.f316564f;
            aVar.getClass();
            return (VU.b) c.a.a(aVar, context, R.attr.buttonSecondarySmall);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormatSymbols;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<DecimalFormatSymbols> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f316617l = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        public final DecimalFormatSymbols invoke() {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator(',');
            return decimalFormatSymbols;
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.a<DecimalFormat> {
        public k() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final DecimalFormat invoke() {
            DecimalFormat decimalFormat = new DecimalFormat("0", (DecimalFormatSymbols) p.this.f316595u0.getValue());
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat;
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/text/DecimalFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends N implements Y41.a<DecimalFormat> {
        public l() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final DecimalFormat invoke() {
            DecimalFormat decimalFormat = new DecimalFormat("0.##", (DecimalFormatSymbols) p.this.f316595u0.getValue());
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat;
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.a<Integer> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.black, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/image_loader/d;", "invoke", "()Lcom/avito/android/image_loader/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.image_loader.d> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f316621l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(View view) {
            super(0);
            this.f316621l = view;
        }

        @Override // Y41.a
        public final com.avito.android.image_loader.d invoke() {
            return new com.avito.android.image_loader.e().a(this.f316621l.getContext());
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class o extends N implements Y41.a<Integer> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(p.this.f316566g.getDimensionPixelSize(R.dimen.user_adverts_views_item_image_corner_radius));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_views.advert_item.p$p, reason: collision with other inner class name */
    public static final class C9833p extends N implements Y41.a<String> {
        public C9833p() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return p.this.f316566g.getString(R.string.user_adverts_views_location_content_text);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class q extends N implements Y41.a<String> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return p.this.f316566g.getString(R.string.user_adverts_views_location_delimiter_content_text);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LyV/a;", "invoke", "()LyV/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<C50177a> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final C50177a invoke() {
            C50177a.C12902a c12902a = C50177a.f443122g;
            Context context = p.this.f316564f;
            int iJ2 = C35835l0.j(R.attr.progressBarSuccessSmall, context);
            c12902a.getClass();
            return C50177a.C12902a.b(iJ2, context);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class s extends N implements Y41.a<ColorStateList> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(C35835l0.d(R.attr.black, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class t extends N implements Y41.a<ColorStateList> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(C35835l0.d(R.attr.gray54, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class u extends N implements Y41.a<Integer> {
        public u() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(p.this.f316566g.getDimensionPixelSize(R.dimen.user_adverts_views_item_stat_icon_space));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class v extends N implements Y41.a<String> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return p.this.f316564f.getString(R.string.user_adverts_views_stat_today_text);
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class w extends N implements Y41.a<Integer> {
        public w() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.gray54, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class x extends N implements Y41.a<Integer> {
        public x() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.red600, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class y extends N implements Y41.a<Integer> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(C35835l0.d(R.attr.orange900, p.this.f316564f));
        }
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class z extends N implements Y41.a<List<? extends TextView>> {
        public z() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends TextView> invoke() {
            p pVar = p.this;
            return C42745f0.U(pVar.f316557b0, pVar.f316559c0, pVar.f316561d0);
        }
    }

    static {
        new C35712a(null);
    }

    public p(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.user_adverts_views_util.position.a aVar2, @Y61.k InterfaceC49101b interfaceC49101b) {
        super(view);
        this.f316556b = aVar;
        this.f316558c = aVar2;
        this.f316560d = interfaceC49101b;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f316562e = C42727D.b(lazyThreadSafetyMode, new n(view));
        Context context = view.getContext();
        this.f316564f = context;
        this.f316566g = view.getResources();
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f316568h = simpleDraweeView;
        this.f316570i = (ImageView) view.findViewById(R.id.has_video);
        Checkbox checkbox = (Checkbox) view.findViewById(R.id.user_advert_select_checkbox);
        this.f316572j = checkbox;
        View viewFindViewById = view.findViewById(R.id.user_advert_select_checkbox_click_group);
        this.f316574k = viewFindViewById;
        this.f316576l = (TextView) view.findViewById(R.id.title);
        this.f316578m = (ImageView) view.findViewById(R.id.edit);
        this.f316580n = view.findViewById(R.id.edit_click_group);
        this.f316582o = (Button) view.findViewById(R.id.right_action_button);
        this.f316584p = view.findViewById(R.id.right_action_loading);
        this.f316586q = (ViewGroup) view.findViewById(R.id.price_group);
        this.f316588r = (TextView) view.findViewById(R.id.price);
        this.f316590s = (TextView) view.findViewById(R.id.price_sale_info);
        this.f316592t = (DockingBadgeContainer) view.findViewById(R.id.badge_bar_group);
        this.f316594u = (DockingBadge) view.findViewById(R.id.badge_price);
        this.f316596v = (DockingBadge) view.findViewById(R.id.badge_realty_verification);
        this.f316598w = (DockingBadge) view.findViewById(R.id.badge_fashion_auth);
        this.f316600x = (ViewGroup) view.findViewById(R.id.services_group);
        this.f316602y = (IconsView) view.findViewById(R.id.service_icons);
        SearchPositionView searchPositionView = (SearchPositionView) view.findViewById(R.id.service_search_position);
        this.f316604z = searchPositionView;
        this.f316524A = (CpxPromoWidgetView) view.findViewById(R.id.service_cpx_promo_widget);
        this.f316526B = (TextView) view.findViewById(R.id.fill_parameters);
        this.f316528C = view.findViewById(R.id.fill_parameters_group);
        View viewFindViewById2 = view.findViewById(R.id.location_info);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        this.f316530D = (CompositeLocationTextView) viewFindViewById2;
        this.f316532E = (TextView) view.findViewById(R.id.reservationInfo);
        this.f316534F = (TextView) view.findViewById(R.id.availableStocks);
        this.f316535G = (TextView) view.findViewById(R.id.life_status_date);
        TextView textView = (TextView) view.findViewById(R.id.life_status_icon_auto_publish);
        this.f316536H = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.life_status_icon_delivery);
        this.f316537I = textView2;
        this.f316538J = view.findViewById(R.id.stats_group);
        this.f316539K = (TextView) view.findViewById(R.id.stats_watch);
        this.f316540L = (TextView) view.findViewById(R.id.stats_contact);
        this.f316541M = (TextView) view.findViewById(R.id.stats_conversion);
        this.f316542N = (TextView) view.findViewById(R.id.stats_favorites);
        this.f316543O = (TextView) view.findViewById(R.id.space_badge);
        this.f316544P = view.findViewById(R.id.tips_container);
        this.f316545Q = (TextView) view.findViewById(R.id.tips_text);
        this.f316546R = (TextView) view.findViewById(R.id.tips_icon_re23);
        this.f316547S = view.findViewById(R.id.contacts_group);
        this.f316548T = (TextView) view.findViewById(R.id.contacts_text);
        this.f316549U = (ProgressBarRe23) view.findViewById(R.id.contacts_progress_bar);
        this.f316550V = (TextView) view.findViewById(R.id.contacts_text_new);
        this.f316551W = (TextView) view.findViewById(R.id.vacancy_rostrud);
        View viewFindViewById3 = view.findViewById(R.id.multi_item_group);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_adverts_views_util.CompositeMultiItemTextView");
        }
        this.f316552X = (CompositeMultiItemTextView) viewFindViewById3;
        this.f316553Y = view.findViewById(R.id.status_moderation_block_space);
        this.f316554Z = (TextView) view.findViewById(R.id.status_moderation_internal);
        this.f316555a0 = (TextView) view.findViewById(R.id.status_moderation_delivery_abuse);
        this.f316557b0 = (TextView) view.findViewById(R.id.status_moderation_declined);
        this.f316559c0 = (TextView) view.findViewById(R.id.status_moderation_leadgen);
        this.f316561d0 = (TextView) view.findViewById(R.id.status_moderation_liquidity);
        this.f316563e0 = (TextView) view.findViewById(R.id.status_moderation_verification);
        this.f316565f0 = C42727D.b(lazyThreadSafetyMode, new z());
        this.f316567g0 = (TextView) view.findViewById(R.id.status_other);
        this.f316569h0 = (Button) view.findViewById(R.id.action_button);
        this.f316571i0 = C42727D.b(lazyThreadSafetyMode, new d());
        this.f316573j0 = C42727D.b(lazyThreadSafetyMode, new m());
        this.f316575k0 = C42727D.b(lazyThreadSafetyMode, new c());
        this.f316577l0 = C42727D.b(lazyThreadSafetyMode, new o());
        this.f316579m0 = C42727D.b(lazyThreadSafetyMode, new u());
        this.f316581n0 = C42727D.b(lazyThreadSafetyMode, new w());
        this.f316583o0 = C42727D.b(lazyThreadSafetyMode, new v());
        this.f316585p0 = C42727D.b(lazyThreadSafetyMode, new x());
        this.f316587q0 = C42727D.b(lazyThreadSafetyMode, new y());
        this.f316589r0 = C42727D.b(lazyThreadSafetyMode, new A());
        this.f316591s0 = C42727D.b(lazyThreadSafetyMode, new e());
        this.f316593t0 = C42727D.b(lazyThreadSafetyMode, new r());
        this.f316595u0 = C42727D.b(lazyThreadSafetyMode, j.f316617l);
        this.f316597v0 = C42727D.b(lazyThreadSafetyMode, new l());
        this.f316599w0 = C42727D.b(lazyThreadSafetyMode, new k());
        this.f316601x0 = C42727D.b(lazyThreadSafetyMode, new q());
        this.f316603y0 = C42727D.b(lazyThreadSafetyMode, new C9833p());
        this.f316527B0 = C42727D.b(lazyThreadSafetyMode, new h());
        this.f316529C0 = C42727D.b(lazyThreadSafetyMode, new i());
        this.f316531D0 = C42727D.b(lazyThreadSafetyMode, new s());
        this.f316533E0 = C42727D.b(lazyThreadSafetyMode, new t());
        Drawable drawable = interfaceC49101b.c() ? context.getDrawable(R.drawable.common_ic_snippet_placeholder) : C35835l0.h(R.attr.ic_logo24, context);
        if (drawable != null) {
            if (!interfaceC49101b.c()) {
                V0.a(drawable, C35835l0.d(R.attr.white, context));
            }
            simpleDraweeView.getHierarchy().o(drawable, 5);
        }
        viewFindViewById.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 3));
        checkbox.setOnStateChangedListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 7));
        FV.a.f4720a.getClass();
        FV.a.c(textView, R.attr.textIconAutopublishing);
        FV.a.c(textView2, R.attr.textIconLocalShipping);
        searchPositionView.setAnimator(aVar2);
    }

    public static void Y80(View view, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (!L.f(view2, view)) {
                view2.setVisibility(8);
            }
        }
    }

    public static boolean Z80(UserAdvertItem.d dVar) {
        String f316697a = dVar != null ? dVar.getF316697a() : null;
        return f316697a == null || f316697a.length() == 0;
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void B80(@Y61.l UserAdvertItem.b bVar, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f316569h0;
        if (bVar == null) {
            D6.w(button);
            return;
        }
        D6.H(button);
        com.avito.android.lib.design.button.b.a(button, bVar.f316670a, false);
        button.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(12, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void C80(@Y61.l UserAdvertItem.a aVar, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f316574k.setVisibility(aVar != null ? 0 : 8);
        this.f316605z0 = null;
        this.f316572j.setChecked(aVar != null ? aVar.f316669b : false);
        this.f316605z0 = (N) lVar;
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void D80(@Y61.l String str) {
        I5.a(this.f316534F, str, false);
    }

    @Override // com.avito.android.user_adverts_views_pub.c
    @Y61.k
    public final LinearLayout DR() {
        return this.f316552X.getF316734c();
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void E80(@Y61.l UserAdvertItem.j jVar, @Y61.l UserAdvertItem.k kVar, @Y61.l UserAdvertItem.g gVar) {
        boolean zZ80 = Z80(jVar);
        DockingBadgeContainer dockingBadgeContainer = this.f316592t;
        if (zZ80 && Z80(kVar) && Z80(gVar)) {
            dockingBadgeContainer.setVisibility(8);
            return;
        }
        dockingBadgeContainer.setVisibility(0);
        W80(this.f316594u, jVar);
        DockingBadge dockingBadge = this.f316596v;
        W80(dockingBadge, kVar);
        UserAdvertItem.k.b bVar = kVar != null ? kVar.f316700d : null;
        if (bVar == null) {
            dockingBadge.setOnClickListener(null);
        } else {
            dockingBadge.setOnClickListener(new com.avito.android.user_adverts_views.advert_item.o(0, dockingBadge, bVar));
        }
        W80(this.f316598w, gVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void F80(@Y61.l UserAdvertItem.e eVar, @Y61.k C19616a c19616a) {
        Integer numA;
        View view = this.f316547S;
        TextView textView = this.f316550V;
        if (eVar == null) {
            textView.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[4];
        boolean zBooleanValue = ((Boolean) c19616a.f20581f.a().invoke()).booleanValue();
        Context context = this.f316564f;
        String str = eVar.f316674a;
        if (zBooleanValue) {
            view.setVisibility(8);
            textView.setVisibility(str.length() > 0 ? 0 : 8);
            I5.a(textView, str, false);
            String str2 = eVar.f316675b;
            textView.setTextColor(C35835l0.d((str2 == null || (numA = com.avito.android.lib.util.e.a(str2)) == null) ? R.attr.black : numA.intValue(), context));
            return;
        }
        textView.setVisibility(8);
        int length = str.length();
        UserAdvertItem.e.a aVar = eVar.f316676c;
        view.setVisibility((length <= 0 && aVar == null) ? 8 : 0);
        I5.a(this.f316548T, str, false);
        ProgressBarRe23 progressBarRe23 = this.f316549U;
        if (aVar == null) {
            progressBarRe23.setVisibility(8);
            return;
        }
        progressBarRe23.setVisibility(0);
        progressBarRe23.setState(new C49888a(new xV.e(aVar.f316677a)));
        C50177a c50177a = (C50177a) this.f316593t0.getValue();
        C48063a c48063a = C48063a.f437606a;
        progressBarRe23.setStyle(C50177a.a(c50177a, new C35763c0(ColorStateList.valueOf(c48063a.a(context, aVar.f316679c)), false, 2, (C42822w) null), new C35763c0(ColorStateList.valueOf(c48063a.a(context, aVar.f316678b)), false, 2, (C42822w) null), 60));
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void G80(@Y61.l String str) {
        this.f316528C.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        this.f316526B.setText(str);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void H80(boolean z12) {
        this.f316570i.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void I80(@Y61.l String str, boolean z12, boolean z13) {
        TextView textView = this.f316536H;
        TextView textView2 = this.f316537I;
        TextView textView3 = this.f316535G;
        if (str == null || str.length() == 0) {
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str);
            textView2.setVisibility(z12 ? 0 : 8);
            textView.setVisibility(z13 ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void J80(@Y61.l String str, @Y61.l UserAdvertItem.c cVar) {
        String str2;
        CompositeLocationTextView compositeLocationTextView = this.f316530D;
        if (str == null || str.length() == 0) {
            compositeLocationTextView.setVisibility(8);
        } else {
            compositeLocationTextView.setVisibility(0);
            compositeLocationTextView.setFirstText(str);
            compositeLocationTextView.setState(CompositeLocationTextView.State.f307091b);
            compositeLocationTextView.a(R.attr.textS10, R.attr.black);
        }
        if (cVar != null) {
            String str3 = cVar.f316673b;
            if (str3.length() != 0) {
                compositeLocationTextView.setState(CompositeLocationTextView.State.f307092c);
                String str4 = cVar.f316672a;
                if (str4 == null || C43066x.K(str4)) {
                    u0 u0Var = u0.f406856a;
                    str2 = String.format(Locale.getDefault(), (String) this.f316603y0.getValue(), Arrays.copyOf(new Object[]{str3}, 1));
                } else {
                    u0 u0Var2 = u0.f406856a;
                    str2 = String.format(Locale.getDefault(), (String) this.f316601x0.getValue(), Arrays.copyOf(new Object[]{str4, str3}, 2));
                }
                compositeLocationTextView.setSecondText(str2);
                return;
            }
        }
        compositeLocationTextView.setSecondText("");
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void K80(@Y61.k Y41.a aVar, @Y61.l String str, @Y61.l String str2) {
        CompositeMultiItemTextView compositeMultiItemTextView = this.f316552X;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            compositeMultiItemTextView.setVisibility(8);
            return;
        }
        compositeMultiItemTextView.setVisibility(0);
        compositeMultiItemTextView.setTitle(str);
        compositeMultiItemTextView.setCount(str2);
        compositeMultiItemTextView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(13, aVar));
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void L80(@Y61.l UserAdvertItem.Status status) {
        TextView textView = this.f316567g0;
        if (status != null) {
            String str = status.f316664a;
            if (str.length() != 0) {
                textView.setVisibility(0);
                textView.setText(str);
                int[] iArr = b.f316607a;
                UserAdvertItem.Status.Type type = UserAdvertItem.Status.Type.f316665b;
                if (iArr[0] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setTextColor(((Number) this.f316589r0.getValue()).intValue());
                return;
            }
        }
        textView.setVisibility(8);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void M80(@Y61.l AttributedText attributedText, @Y61.l String str) {
        CharSequence charSequenceC = this.f316556b.c(this.f316564f, attributedText);
        this.f316586q.setVisibility(((str == null || str.length() == 0) && (charSequenceC == null || charSequenceC.length() == 0)) ? 8 : 0);
        I5.a(this.f316588r, str, false);
        I5.a(this.f316590s, charSequenceC, false);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void N80(@Y61.l String str) {
        I5.a(this.f316532E, str, false);
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void O80(@Y61.l UserAdvertItem.RightAction rightAction, @Y61.l DeepLink deepLink, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super UserAdvertItem.RightAction, G0> lVar2) {
        VU.b bVar;
        ?? r42 = this.f316531D0;
        ImageView imageView = this.f316578m;
        Context context = this.f316564f;
        View view = this.f316584p;
        View view2 = this.f316580n;
        Button button = this.f316582o;
        if (rightAction == null) {
            if (deepLink == null) {
                button.setVisibility(8);
                view2.setVisibility(8);
                return;
            }
            g gVar = new g(lVar, deepLink);
            button.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(0);
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_edit16, context));
            imageView.setImageTintList((ColorStateList) r42.getValue());
            view2.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(15, gVar));
            return;
        }
        if (rightAction instanceof UserAdvertItem.RightAction.Button) {
            UserAdvertItem.RightAction.Button button2 = (UserAdvertItem.RightAction.Button) rightAction;
            button.setVisibility(0);
            view.setVisibility(8);
            view2.setVisibility(8);
            int iOrdinal = button2.f316650b.ordinal();
            if (iOrdinal == 0) {
                bVar = (VU.b) this.f316527B0.getValue();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = (VU.b) this.f316529C0.getValue();
            }
            button.setStyle(bVar);
            button.setState(new UU.a(button2.f316649a, null, false, false, false, new com.avito.android.user_adverts_views.advert_item.s(lVar2, button2), null, null, null, false, 990, null));
            return;
        }
        if (rightAction instanceof UserAdvertItem.RightAction.a) {
            UserAdvertItem.RightAction.a aVar = (UserAdvertItem.RightAction.a) rightAction;
            button.setVisibility(8);
            view.setVisibility(8);
            view2.setVisibility(0);
            Integer numA = com.avito.android.lib.util.q.a(aVar.f316657a);
            if (numA != null) {
                imageView.setImageDrawable(C35835l0.h(numA.intValue(), context));
                imageView.setImageTintList((ColorStateList) r42.getValue());
            }
            view2.setOnClickListener(new com.avito.android.user_adverts_views.advert_item.o(1, lVar2, aVar));
            return;
        }
        if (rightAction instanceof UserAdvertItem.RightAction.b) {
            UserAdvertItem.RightAction.b bVar2 = (UserAdvertItem.RightAction.b) rightAction;
            button.setVisibility(8);
            boolean z12 = bVar2.f316662c;
            view.setVisibility(z12 ? 0 : 8);
            view2.setVisibility(z12 ? 8 : 0);
            Integer numA2 = com.avito.android.lib.util.q.a(bVar2.f316660a);
            if (numA2 != null) {
                imageView.setImageDrawable(C35835l0.h(numA2.intValue(), context));
                imageView.setImageTintList((ColorStateList) this.f316533E0.getValue());
            }
            view2.setOnClickListener(new com.avito.android.user_adverts_views.advert_item.o(2, lVar2, bVar2));
        }
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void P80(@Y61.l Map<String, Image> map, @Y61.l UserAdvertItem.m mVar, @Y61.k Y41.a<G0> aVar, @Y61.l UserAdvertItem.CpxPromoWidget cpxPromoWidget, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        int i12;
        ViewGroup viewGroup = this.f316600x;
        if ((map == null || map.isEmpty()) && mVar == null && cpxPromoWidget == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        IconsView iconsView = this.f316602y;
        if (map == null || map.isEmpty()) {
            iconsView.setVisibility(8);
        } else {
            iconsView.setVisibility(0);
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), com.avito.android.image_loader.b.b((Image) entry.getValue()));
            }
            iconsView.setIcons(linkedHashMap);
        }
        AttributedText attributedText = mVar != null ? mVar.f316709b : null;
        com.avito.android.util.text.a aVar2 = this.f316556b;
        Context context = this.f316564f;
        CharSequence charSequenceC = aVar2.c(context, attributedText);
        SearchPositionView searchPositionView = this.f316604z;
        if (charSequenceC == null || charSequenceC.length() == 0) {
            searchPositionView.setVisibility(8);
        } else {
            searchPositionView.setVisibility(0);
            searchPositionView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(17, aVar));
            boolean z12 = mVar != null ? mVar.f316708a : false;
            int length = charSequenceC.length();
            BlinkOvalView blinkOvalView = searchPositionView.f316750d;
            ViewGroup viewGroup2 = searchPositionView.f316748b;
            if (length == 0) {
                viewGroup2.setVisibility(8);
                blinkOvalView.setVisibility(8);
                searchPositionView.a(false);
            } else {
                viewGroup2.setVisibility(0);
                blinkOvalView.setVisibility(z12 ? 0 : 8);
                searchPositionView.f316749c.setText(charSequenceC);
                searchPositionView.a(z12);
            }
            searchPositionView.f316752f = z12;
        }
        int i13 = cpxPromoWidget != null ? 0 : 8;
        CpxPromoWidgetView cpxPromoWidgetView = this.f316524A;
        cpxPromoWidgetView.setVisibility(i13);
        if (cpxPromoWidget != null) {
            int iOrdinal = cpxPromoWidget.f316639a.ordinal();
            if (iOrdinal == 0) {
                i12 = R.attr.black;
            } else if (iOrdinal == 1) {
                i12 = R.attr.green800;
            } else if (iOrdinal == 2) {
                i12 = R.attr.orange700;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.red600;
            }
            int iD2 = C35835l0.d(i12, context);
            DeepLink deepLink = cpxPromoWidget.f316642d;
            com.avito.android.user_adverts_views.advert_item.q qVar = deepLink != null ? new com.avito.android.user_adverts_views.advert_item.q(lVar, deepLink) : null;
            C35949t5.c(cpxPromoWidgetView.f316738b, com.avito.android.image_loader.n.a(cpxPromoWidget.f316640b), null, null, null, 14);
            TextView textView = cpxPromoWidgetView.f316739c;
            textView.setText(cpxPromoWidget.f316641c);
            textView.setTextColor(iD2);
            boolean z13 = qVar != null;
            cpxPromoWidgetView.f316740d.setVisibility(z13 ? 0 : 8);
            cpxPromoWidgetView.setForeground(z13 ? C35835l0.h(android.R.attr.selectableItemBackground, cpxPromoWidgetView.getContext()) : null);
            cpxPromoWidgetView.setOnClickListener(new ru.avito.component.payments.method.b(8, qVar));
            cpxPromoWidgetView.setFocusable(z13);
            cpxPromoWidgetView.setClickable(z13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void Q80(@Y61.l String str) {
        boolean zF2 = L.f(str, "archived");
        if (this.f316525A0 != zF2) {
            int iIntValue = !zF2 ? ((Number) this.f316573j0.getValue()).intValue() : ((Number) this.f316575k0.getValue()).intValue();
            Iterator it = ((List) this.f316571i0.getValue()).iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(iIntValue);
            }
            this.f316568h.setAlpha(zF2 ? 0.7f : 1.0f);
        }
        this.f316525A0 = zF2;
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void R80(@Y61.l AttributedText attributedText) {
        I5.a(this.f316543O, this.f316556b.c(this.f316564f, attributedText), false);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void S(@Y61.k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(14, aVar));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void S80(@Y61.l UserAdvertItem.p pVar) {
        UserAdvertItem.p.a aVar;
        String str;
        View view = this.f316538J;
        if (pVar == null || (aVar = pVar.f316713a) == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        TextView textView = this.f316539K;
        textView.setVisibility(0);
        FV.a aVar2 = FV.a.f4720a;
        CharSequence charSequenceX80 = X80(Integer.valueOf(aVar.f316717a), aVar.f316718b);
        ?? r52 = this.f316579m0;
        int iIntValue = ((Number) r52.getValue()).intValue();
        aVar2.getClass();
        Context context = this.f316564f;
        textView.setText(FV.a.i(charSequenceX80, context, R.attr.textIconVisibility, iIntValue));
        UserAdvertItem.p.a aVar3 = pVar.f316715c;
        int i12 = aVar3 != null ? 0 : 8;
        TextView textView2 = this.f316540L;
        textView2.setVisibility(i12);
        textView2.setText(FV.a.i(X80(aVar3 != null ? Integer.valueOf(aVar3.f316717a) : null, aVar3 != null ? aVar3.f316718b : null), context, R.attr.textIconPerson, ((Number) r52.getValue()).intValue()));
        Double d12 = pVar.f316716d;
        int i13 = d12 != null ? 0 : 8;
        TextView textView3 = this.f316541M;
        textView3.setVisibility(i13);
        if (d12 != null) {
            str = (d12.doubleValue() < 1.0d ? (DecimalFormat) this.f316597v0.getValue() : (DecimalFormat) this.f316599w0.getValue()).format(d12.doubleValue()) + "\u2009%";
        } else {
            str = null;
        }
        textView3.setText(str != null ? FV.a.i(str, context, R.attr.textIconFilterAlt, ((Number) r52.getValue()).intValue()) : null);
        UserAdvertItem.p.a aVar4 = pVar.f316714b;
        int i14 = aVar4 != null ? 0 : 8;
        TextView textView4 = this.f316542N;
        textView4.setVisibility(i14);
        textView4.setText(FV.a.i(X80(aVar4 != null ? Integer.valueOf(aVar4.f316717a) : null, null), context, R.attr.textIconFavorite, ((Number) r52.getValue()).intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T80(@Y61.k java.lang.String r8, boolean r9, @Y61.l java.lang.String r10, @Y61.l java.lang.String r11, @Y61.l com.avito.android.remote.model.text.AttributedText r12, @Y61.l com.avito.android.user_adverts_views_pub.UserAdvertItem.i r13, @Y61.l com.avito.android.user_adverts_views_pub.UserAdvertItem.l r14, @Y61.l com.avito.android.user_adverts_views_pub.UserAdvertItem.t r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_views.advert_item.p.T80(java.lang.String, boolean, java.lang.String, java.lang.String, com.avito.android.remote.model.text.AttributedText, com.avito.android.user_adverts_views_pub.UserAdvertItem$i, com.avito.android.user_adverts_views_pub.UserAdvertItem$l, com.avito.android.user_adverts_views_pub.UserAdvertItem$t):void");
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void U80(@Y61.l UserAdvertItem.r rVar, @Y61.k Y41.a<G0> aVar) {
        View view = this.f316544P;
        if (rVar == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        I5.a(this.f316545Q, rVar.f316720a, false);
        FV.a.f4720a.getClass();
        FV.a.c(this.f316546R, R.attr.textIconArrowForwardIos);
        view.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(16, aVar));
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void V80(@InterfaceC42150f @Y61.l Integer num, @Y61.l String str) {
        TextView textView = this.f316551W;
        I5.a(textView, str, false);
        if (num != null) {
            textView.setTextColor(C35835l0.d(num.intValue(), this.f316564f));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    public final void W80(DockingBadge dockingBadge, UserAdvertItem.d dVar) {
        if (dVar == null || Z80(dVar)) {
            dockingBadge.setVisibility(8);
            return;
        }
        ?? r02 = this.f316591s0;
        C25568a c25568a = (C25568a) r02.getValue();
        UniversalColor f316698b = dVar.getF316698b();
        C48063a c48063a = C48063a.f437606a;
        Context context = this.f316564f;
        int iA2 = c48063a.a(context, f316698b);
        UniversalColor f316699c = dVar.getF316699c();
        dockingBadge.setStyle(C25568a.a(c25568a, null, iA2, f316699c != null ? c48063a.a(context, f316699c) : ((C25568a) r02.getValue()).f57093c, 0, 0, 57));
        dockingBadge.setState(new C19820c(dVar.getF316697a(), null, null, 6, null));
        dockingBadge.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.C] */
    public final CharSequence X80(Integer num, Integer num2) {
        if (num == null) {
            return "";
        }
        String strE = C5.e(num.toString(), (char) 8201);
        if (strE == null) {
            strE = num.toString();
        }
        if (num2 == null || num2.intValue() <= 0) {
            return strE;
        }
        String strE2 = C5.e(num2.toString(), (char) 8201);
        if (strE2 == null) {
            strE2 = num2.toString();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strE);
        u0 u0Var = u0.f406856a;
        spannableStringBuilder.append(String.format(Locale.getDefault(), (String) this.f316583o0.getValue(), Arrays.copyOf(new Object[]{strE2}, 1)), new ForegroundColorSpan(((Number) this.f316581n0.getValue()).intValue()), 17);
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void b(@Y61.k String str) {
        I5.a(this.f316576l, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f316605z0 = null;
        this.f316580n.setOnClickListener(null);
        this.f316552X.setOnClickListener(null);
        this.itemView.setOnClickListener(null);
        this.f316569h0.setOnClickListener(null);
        this.f316604z.setOnClickListener(null);
        this.f316524A.setOnClickListener(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_pub.c.b
    public final void z1(@Y61.l Image image) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        com.avito.android.image_loader.d dVar = (com.avito.android.image_loader.d) this.f316562e.getValue();
        SimpleDraweeView simpleDraweeView = this.f316568h;
        Drawable drawableA = d.a.a(dVar, simpleDraweeView.getContext(), aVarB, null, Integer.valueOf(((Number) this.f316577l0.getValue()).intValue()), 4);
        simpleDraweeView.getHierarchy().p(null);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVarB);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169490h = new f(drawableA);
        aVarA.c();
    }

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements com.avito.android.image_loader.i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Drawable f316612c;

        public f(Drawable drawable) {
            this.f316612c = drawable;
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            p.this.f316568h.getHierarchy().p(this.f316612c);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@Y61.l Throwable th2) {
        }
    }
}

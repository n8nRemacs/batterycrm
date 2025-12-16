package com.avito.android.bxcontent.mvi.entity;

import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoStates;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.additional_buttons.UniversalButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.scroll_tracker.h;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.serp.CallInfo;
import com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem;
import com.avito.android.serp.adapter.snippet.SnippetItem;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import com.avito.android.serp.adapter.warning.SerpWarningItem;
import com.avito.android.serp_list.Mode;
import com.avito.android.service_order_widget.link.o;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentAction.kt */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\\\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]\u0082\u0001\u0096\u0001^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001¨\u0006º\u0001"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "Lcom/avito/android/bxcontent/mvi/entity/b$a;", "Lcom/avito/android/bxcontent/mvi/entity/b$b;", "Lcom/avito/android/bxcontent/mvi/entity/b$c;", "Lcom/avito/android/bxcontent/mvi/entity/b$d;", "Lcom/avito/android/bxcontent/mvi/entity/b$e;", "Lcom/avito/android/bxcontent/mvi/entity/b$f;", "Lcom/avito/android/bxcontent/mvi/entity/b$g;", "Lcom/avito/android/bxcontent/mvi/entity/b$h;", "Lcom/avito/android/bxcontent/mvi/entity/b$i;", "Lcom/avito/android/bxcontent/mvi/entity/b$j;", "Lcom/avito/android/bxcontent/mvi/entity/b$k;", "Lcom/avito/android/bxcontent/mvi/entity/b$l;", "Lcom/avito/android/bxcontent/mvi/entity/b$m;", "Lcom/avito/android/bxcontent/mvi/entity/b$n;", "Lcom/avito/android/bxcontent/mvi/entity/b$o;", "Lcom/avito/android/bxcontent/mvi/entity/b$p;", "Lcom/avito/android/bxcontent/mvi/entity/b$q;", "Lcom/avito/android/bxcontent/mvi/entity/b$r;", "Lcom/avito/android/bxcontent/mvi/entity/b$s;", "Lcom/avito/android/bxcontent/mvi/entity/b$t;", "Lcom/avito/android/bxcontent/mvi/entity/b$u;", "Lcom/avito/android/bxcontent/mvi/entity/b$v;", "Lcom/avito/android/bxcontent/mvi/entity/b$w;", "Lcom/avito/android/bxcontent/mvi/entity/b$x;", "Lcom/avito/android/bxcontent/mvi/entity/b$y;", "Lcom/avito/android/bxcontent/mvi/entity/b$z;", "Lcom/avito/android/bxcontent/mvi/entity/b$A;", "Lcom/avito/android/bxcontent/mvi/entity/b$B;", "Lcom/avito/android/bxcontent/mvi/entity/b$C;", "Lcom/avito/android/bxcontent/mvi/entity/b$D;", "Lcom/avito/android/bxcontent/mvi/entity/b$E;", "Lcom/avito/android/bxcontent/mvi/entity/b$F;", "Lcom/avito/android/bxcontent/mvi/entity/b$G;", "Lcom/avito/android/bxcontent/mvi/entity/b$H;", "Lcom/avito/android/bxcontent/mvi/entity/b$I;", "Lcom/avito/android/bxcontent/mvi/entity/b$J;", "Lcom/avito/android/bxcontent/mvi/entity/b$K;", "Lcom/avito/android/bxcontent/mvi/entity/b$L;", "Lcom/avito/android/bxcontent/mvi/entity/b$M;", "Lcom/avito/android/bxcontent/mvi/entity/b$N;", "Lcom/avito/android/bxcontent/mvi/entity/b$O;", "Lcom/avito/android/bxcontent/mvi/entity/b$P;", "Lcom/avito/android/bxcontent/mvi/entity/b$Q;", "Lcom/avito/android/bxcontent/mvi/entity/b$R;", "Lcom/avito/android/bxcontent/mvi/entity/b$S;", "Lcom/avito/android/bxcontent/mvi/entity/b$T;", "Lcom/avito/android/bxcontent/mvi/entity/b$U;", "Lcom/avito/android/bxcontent/mvi/entity/b$V;", "Lcom/avito/android/bxcontent/mvi/entity/b$W;", "Lcom/avito/android/bxcontent/mvi/entity/b$X;", "Lcom/avito/android/bxcontent/mvi/entity/b$Y;", "Lcom/avito/android/bxcontent/mvi/entity/b$Z;", "Lcom/avito/android/bxcontent/mvi/entity/b$a0;", "Lcom/avito/android/bxcontent/mvi/entity/b$b0;", "Lcom/avito/android/bxcontent/mvi/entity/b$c0;", "Lcom/avito/android/bxcontent/mvi/entity/b$d0;", "Lcom/avito/android/bxcontent/mvi/entity/b$e0;", "Lcom/avito/android/bxcontent/mvi/entity/b$f0;", "Lcom/avito/android/bxcontent/mvi/entity/b$g0;", "Lcom/avito/android/bxcontent/mvi/entity/b$h0;", "Lcom/avito/android/bxcontent/mvi/entity/b$i0;", "Lcom/avito/android/bxcontent/mvi/entity/b$j0;", "Lcom/avito/android/bxcontent/mvi/entity/b$k0;", "Lcom/avito/android/bxcontent/mvi/entity/b$l0;", "Lcom/avito/android/bxcontent/mvi/entity/b$m0;", "Lcom/avito/android/bxcontent/mvi/entity/b$n0;", "Lcom/avito/android/bxcontent/mvi/entity/b$o0;", "Lcom/avito/android/bxcontent/mvi/entity/b$p0;", "Lcom/avito/android/bxcontent/mvi/entity/b$q0;", "Lcom/avito/android/bxcontent/mvi/entity/b$r0;", "Lcom/avito/android/bxcontent/mvi/entity/b$s0;", "Lcom/avito/android/bxcontent/mvi/entity/b$t0;", "Lcom/avito/android/bxcontent/mvi/entity/b$u0;", "Lcom/avito/android/bxcontent/mvi/entity/b$v0;", "Lcom/avito/android/bxcontent/mvi/entity/b$w0;", "Lcom/avito/android/bxcontent/mvi/entity/b$x0;", "Lcom/avito/android/bxcontent/mvi/entity/b$y0;", "Lcom/avito/android/bxcontent/mvi/entity/b$z0;", "Lcom/avito/android/bxcontent/mvi/entity/b$A0;", "Lcom/avito/android/bxcontent/mvi/entity/b$B0;", "Lcom/avito/android/bxcontent/mvi/entity/b$C0;", "Lcom/avito/android/bxcontent/mvi/entity/b$D0;", "Lcom/avito/android/bxcontent/mvi/entity/b$E0;", "Lcom/avito/android/bxcontent/mvi/entity/b$F0;", "Lcom/avito/android/bxcontent/mvi/entity/b$G0;", "Lcom/avito/android/bxcontent/mvi/entity/b$H0;", "Lcom/avito/android/bxcontent/mvi/entity/b$I0;", "Lcom/avito/android/bxcontent/mvi/entity/b$J0;", "Lcom/avito/android/bxcontent/mvi/entity/b$K0;", "Lcom/avito/android/bxcontent/mvi/entity/b$L0;", "Lcom/avito/android/bxcontent/mvi/entity/b$M0;", "Lcom/avito/android/bxcontent/mvi/entity/b$N0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.entity.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29127b {

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$A;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$A */
    public static final /* data */ class A implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FloatingViewsPresenter.Subscriber.b f112060a;

        public A(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
            this.f112060a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && kotlin.jvm.internal.L.f(this.f112060a, ((A) obj).f112060a);
        }

        public final int hashCode() {
            return this.f112060a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FloatingViewsStateUpdate(state=" + this.f112060a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$B;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$B */
    public static final /* data */ class B implements InterfaceC29127b, k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f112063a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Bundle f112064b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f112065c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ItemsSearchLinkHandleForceType f112066d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final List<String> f112067e;

        public B() {
            throw null;
        }

        public B(DeepLink deepLink, Bundle bundle, String str, ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType, List list, int i12, C42822w c42822w) {
            bundle = (i12 & 2) != 0 ? null : bundle;
            str = (i12 & 4) != 0 ? null : str;
            itemsSearchLinkHandleForceType = (i12 & 8) != 0 ? ItemsSearchLinkHandleForceType.f112040d : itemsSearchLinkHandleForceType;
            list = (i12 & 16) != 0 ? null : list;
            this.f112063a = deepLink;
            this.f112064b = bundle;
            this.f112065c = str;
            this.f112066d = itemsSearchLinkHandleForceType;
            this.f112067e = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B)) {
                return false;
            }
            B b12 = (B) obj;
            return kotlin.jvm.internal.L.f(this.f112063a, b12.f112063a) && kotlin.jvm.internal.L.f(this.f112064b, b12.f112064b) && kotlin.jvm.internal.L.f(this.f112065c, b12.f112065c) && this.f112066d == b12.f112066d && kotlin.jvm.internal.L.f(this.f112067e, b12.f112067e);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f112063a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f112064b;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            String str = this.f112065c;
            int iHashCode3 = (this.f112066d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            List<String> list = this.f112067e;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowDeeplink(deeplink=");
            sb2.append(this.f112063a);
            sb2.append(", args=");
            sb2.append(this.f112064b);
            sb2.append(", requestKey=");
            sb2.append(this.f112065c);
            sb2.append(", forceType=");
            sb2.append(this.f112066d);
            sb2.append(", inlinesOrder=");
            return androidx.compose.foundation.H.p(sb2, this.f112067e, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$B0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$B0 */
    public static final /* data */ class B0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final h.a f112068a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112069b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final CommercialVideoStates f112070c;

        public B0(@Y61.k h.a aVar, boolean z12, @Y61.k CommercialVideoStates commercialVideoStates) {
            this.f112068a = aVar;
            this.f112069b = z12;
            this.f112070c = commercialVideoStates;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B0)) {
                return false;
            }
            B0 b02 = (B0) obj;
            return kotlin.jvm.internal.L.f(this.f112068a, b02.f112068a) && this.f112069b == b02.f112069b && kotlin.jvm.internal.L.f(this.f112070c, b02.f112070c);
        }

        public final int hashCode() {
            return this.f112070c.hashCode() + androidx.appcompat.app.r.i(this.f112068a.hashCode() * 31, 31, this.f112069b);
        }

        @Y61.k
        public final String toString() {
            return "SnippetScrollStateChanged(state=" + this.f112068a + ", hasPlayingVideo=" + this.f112069b + ", commercialVideoStates=" + this.f112070c + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$C;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$C */
    public static final /* data */ class C implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112071a;

        public C(@Y61.k String str) {
            this.f112071a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && kotlin.jvm.internal.L.f(this.f112071a, ((C) obj).f112071a);
        }

        public final int hashCode() {
            return this.f112071a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HideItem(itemId="), this.f112071a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$C0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$C0 */
    public static final /* data */ class C0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f112072a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112073b;

        public C0(String str, boolean z12, int i12, C42822w c42822w) {
            this.f112072a = (i12 & 1) != 0 ? null : str;
            this.f112073b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0)) {
                return false;
            }
            C0 c02 = (C0) obj;
            return kotlin.jvm.internal.L.f(this.f112072a, c02.f112072a) && this.f112073b == c02.f112073b;
        }

        public final int hashCode() {
            String str = this.f112072a;
            return Boolean.hashCode(this.f112073b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubscribeParamsChanged(subscriptionId=");
            sb2.append(this.f112072a);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f112073b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$D;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$D */
    public static final /* data */ class D implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SnippetItem f112074a;

        public D(@Y61.k SnippetItem snippetItem) {
            this.f112074a = snippetItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && kotlin.jvm.internal.L.f(this.f112074a, ((D) obj).f112074a);
        }

        public final int hashCode() {
            return this.f112074a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HideSnippet(item=" + this.f112074a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$D0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$D0 */
    public static final /* data */ class D0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final D0 f112075a = new D0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof D0);
        }

        public final int hashCode() {
            return 538666042;
        }

        @Y61.k
        public final String toString() {
            return "SwitchSerpMapButtonClick";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$E;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$E */
    public static final /* data */ class E implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112076a;

        public E(boolean z12) {
            this.f112076a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof E) && this.f112076a == ((E) obj).f112076a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112076a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("LeaveScreen(fromActionBar="), this.f112076a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$E0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$E0 */
    public static final /* data */ class E0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112077a;

        public E0(boolean z12) {
            this.f112077a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof E0) && this.f112077a == ((E0) obj).f112077a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112077a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ToggleSearchBar(isOpened="), this.f112077a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$F;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$F */
    public static final /* data */ class F implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final F f112078a = new F();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof F);
        }

        public final int hashCode() {
            return 1762423908;
        }

        @Y61.k
        public final String toString() {
            return "LoadNextPage";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$F0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$F0 */
    public static final /* data */ class F0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final F0 f112079a = new F0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof F0);
        }

        public final int hashCode() {
            return -1541866652;
        }

        @Y61.k
        public final String toString() {
            return "TriggerUxFeedback";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$G;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$G */
    public static final /* data */ class G implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.serp.adapter.location_notification.a f112080a;

        public G(@Y61.k com.avito.android.serp.adapter.location_notification.a aVar) {
            this.f112080a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof G) && kotlin.jvm.internal.L.f(this.f112080a, ((G) obj).f112080a);
        }

        public final int hashCode() {
            return this.f112080a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationNotificationSubmitted(data=" + this.f112080a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$G0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$G0 */
    public static final /* data */ class G0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112081a;

        public G0(boolean z12) {
            this.f112081a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof G0) && this.f112081a == ((G0) obj).f112081a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112081a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateChangeLocationCondition(changeMainPageLocation="), this.f112081a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$H;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$H */
    public static final /* data */ class H implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.serp.adapter.location_notification.a f112082a;

        public H(@Y61.k com.avito.android.serp.adapter.location_notification.a aVar) {
            this.f112082a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && kotlin.jvm.internal.L.f(this.f112082a, ((H) obj).f112082a);
        }

        public final int hashCode() {
            return this.f112082a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationNotificationVisible(data=" + this.f112082a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$H0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$H0 */
    public static final /* data */ class H0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112083a;

        public H0(boolean z12) {
            this.f112083a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H0) && this.f112083a == ((H0) obj).f112083a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112083a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateScrollToTopButtonVisibility(isVisible="), this.f112083a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$I;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$I */
    public static final /* data */ class I implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final int f112084a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Onboarding f112085b;

        public I(int i12, @Y61.k Onboarding onboarding) {
            this.f112084a = i12;
            this.f112085b = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I)) {
                return false;
            }
            I i12 = (I) obj;
            return this.f112084a == i12.f112084a && kotlin.jvm.internal.L.f(this.f112085b, i12.f112085b);
        }

        public final int hashCode() {
            return this.f112085b.hashCode() + (Integer.hashCode(this.f112084a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "MaybeShowMiniMenuOnboarding(itemPosition=" + this.f112084a + ", onboarding=" + this.f112085b + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$I0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$I0 */
    public static final /* data */ class I0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31171n f112086a;

        public I0(@Y61.k InterfaceC31171n interfaceC31171n) {
            this.f112086a = interfaceC31171n;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I0) && kotlin.jvm.internal.L.f(this.f112086a, ((I0) obj).f112086a);
        }

        public final int hashCode() {
            return this.f112086a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateUdfToolbarCartIconState(state=" + this.f112086a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$J;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$J */
    public static final /* data */ class J implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerIcebreakerDialogDeeplink f112087a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ContactSource f112088b;

        public J(@Y61.k MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, @Y61.k ContactSource contactSource) {
            this.f112087a = messengerIcebreakerDialogDeeplink;
            this.f112088b = contactSource;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof J)) {
                return false;
            }
            J j12 = (J) obj;
            return kotlin.jvm.internal.L.f(this.f112087a, j12.f112087a) && this.f112088b == j12.f112088b;
        }

        public final int hashCode() {
            return this.f112088b.hashCode() + (this.f112087a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "MessengerIcebreakerDeeplinkAction(deepLink=" + this.f112087a + ", contactSource=" + this.f112088b + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$J0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$J0 */
    public static final /* data */ class J0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarColors f112089a;

        public J0(@Y61.k UdfToolbarColors udfToolbarColors) {
            this.f112089a = udfToolbarColors;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof J0) && kotlin.jvm.internal.L.f(this.f112089a, ((J0) obj).f112089a);
        }

        public final int hashCode() {
            return this.f112089a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateUdfToolbarColors(colors=" + this.f112089a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$K;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$K */
    public static final /* data */ class K implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f112090a;

        public K(@Y61.l Integer num) {
            this.f112090a = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K) && kotlin.jvm.internal.L.f(this.f112090a, ((K) obj).f112090a);
        }

        public final int hashCode() {
            Integer num = this.f112090a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("OnAuthClicked(authRequestedFor="), this.f112090a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$K0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$K0 */
    public static final /* data */ class K0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final int f112091a;

        public K0(int i12) {
            this.f112091a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K0) && this.f112091a == ((K0) obj).f112091a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f112091a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("UpdateUdfToolbarFiltersPointVisibility(count="), this.f112091a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$L;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$L */
    public static final /* data */ class L implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final CallInfo f112092a;

        public L(@Y61.l CallInfo callInfo) {
            this.f112092a = callInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof L) && kotlin.jvm.internal.L.f(this.f112092a, ((L) obj).f112092a);
        }

        public final int hashCode() {
            CallInfo callInfo = this.f112092a;
            if (callInfo == null) {
                return 0;
            }
            return callInfo.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnContactClicked(callInfo=" + this.f112092a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$L0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$L0 */
    public static final /* data */ class L0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.SearchInputHeightType f112093a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.SearchInputRightMargin f112094b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.CartIconRightMargin f112095c;

        /* renamed from: d, reason: collision with root package name */
        public final float f112096d;

        public L0(@Y61.k UdfToolbarStyle.SearchInputHeightType searchInputHeightType, @Y61.k UdfToolbarStyle.SearchInputRightMargin searchInputRightMargin, @Y61.k UdfToolbarStyle.CartIconRightMargin cartIconRightMargin, float f12) {
            this.f112093a = searchInputHeightType;
            this.f112094b = searchInputRightMargin;
            this.f112095c = cartIconRightMargin;
            this.f112096d = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof L0)) {
                return false;
            }
            L0 l02 = (L0) obj;
            return this.f112093a == l02.f112093a && this.f112094b == l02.f112094b && this.f112095c == l02.f112095c && Float.compare(this.f112096d, l02.f112096d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f112096d) + ((this.f112095c.hashCode() + ((this.f112094b.hashCode() + (this.f112093a.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateUdfToolbarStyle(searchInputHeight=");
            sb2.append(this.f112093a);
            sb2.append(", searchInputRightMargin=");
            sb2.append(this.f112094b);
            sb2.append(", cartIconRightMargin=");
            sb2.append(this.f112095c);
            sb2.append(", containersAlpha=");
            return androidx.appcompat.app.r.k(')', this.f112096d, sb2);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$M;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$M */
    public static final /* data */ class M implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final M f112097a = new M();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof M);
        }

        public final int hashCode() {
            return 1171957711;
        }

        @Y61.k
        public final String toString() {
            return "OnScreenPause";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$M0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$M0 */
    public static final /* data */ class M0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final VerticalPromoBlockItem.VerticalFilterItem f112098a;

        public M0(@Y61.k VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem) {
            this.f112098a = verticalFilterItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof M0) && kotlin.jvm.internal.L.f(this.f112098a, ((M0) obj).f112098a);
        }

        public final int hashCode() {
            return this.f112098a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateVerticalFilterItem(item=" + this.f112098a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$N;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$N */
    public static final /* data */ class N implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final N f112099a = new N();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof N);
        }

        public final int hashCode() {
            return 2031845748;
        }

        @Y61.k
        public final String toString() {
            return "OnScreenResume";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$N0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$N0 */
    public static final /* data */ class N0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RubricatorRefinedItem f112100a;

        public N0(@Y61.k RubricatorRefinedItem rubricatorRefinedItem) {
            this.f112100a = rubricatorRefinedItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof N0) && kotlin.jvm.internal.L.f(this.f112100a, ((N0) obj).f112100a);
        }

        public final int hashCode() {
            return this.f112100a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VisualRubricatorClicked(rubricatorRefinedItem=" + this.f112100a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$O;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$O */
    public static final /* data */ class O implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.search.p f112101a;

        public O(@Y61.k com.avito.android.search.p pVar) {
            this.f112101a = pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof O) && kotlin.jvm.internal.L.f(this.f112101a, ((O) obj).f112101a);
        }

        public final int hashCode() {
            return this.f112101a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSuggestionsParamsChanged(suggestionsRemoteParams=" + this.f112101a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$P;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$P */
    public static final /* data */ class P implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalButton f112102a;

        public P(@Y61.k UniversalButton universalButton) {
            this.f112102a = universalButton;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof P) && kotlin.jvm.internal.L.f(this.f112102a, ((P) obj).f112102a);
        }

        public final int hashCode() {
            return this.f112102a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnUniversalButtonClick(universalButton=" + this.f112102a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$Q;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$Q */
    public static final /* data */ class Q implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoBlogArticleItem f112103a;

        public Q(@Y61.k AvitoBlogArticleItem avitoBlogArticleItem) {
            this.f112103a = avitoBlogArticleItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Q) && kotlin.jvm.internal.L.f(this.f112103a, ((Q) obj).f112103a);
        }

        public final int hashCode() {
            return this.f112103a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAvitoBlog(avitoBlogArticle=" + this.f112103a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$R;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$R */
    public static final /* data */ class R implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DealConfirmationSheet f112104a;

        public R(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
            this.f112104a = dealConfirmationSheet;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof R) && kotlin.jvm.internal.L.f(this.f112104a, ((R) obj).f112104a);
        }

        public final int hashCode() {
            return this.f112104a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenDealConfirmation(sheetInfo=" + this.f112104a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$S;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$S */
    public static final /* data */ class S implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Filter f112105a;

        public S(@Y61.l Filter filter) {
            this.f112105a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof S) && kotlin.jvm.internal.L.f(this.f112105a, ((S) obj).f112105a);
        }

        public final int hashCode() {
            Filter filter = this.f112105a;
            if (filter == null) {
                return 0;
            }
            return filter.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenInlineFilter(filter=" + this.f112105a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$T;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$T */
    public static final /* data */ class T implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112106a;

        public T(@Y61.k String str) {
            this.f112106a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof T) && kotlin.jvm.internal.L.f(this.f112106a, ((T) obj).f112106a);
        }

        public final int hashCode() {
            return this.f112106a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenInlineFilterWithId(filterId="), this.f112106a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$U;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$U */
    public static final /* data */ class U implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<UxFeedbackConfigOld> f112107a;

        public U(@Y61.l List<UxFeedbackConfigOld> list) {
            this.f112107a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof U) && kotlin.jvm.internal.L.f(this.f112107a, ((U) obj).f112107a);
        }

        public final int hashCode() {
            List<UxFeedbackConfigOld> list = this.f112107a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("OpenSearchBar(uxFeedbackConfigs="), this.f112107a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$V;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$V */
    public static final /* data */ class V implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f112108a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112109b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f112110c;

        public V() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof V)) {
                return false;
            }
            V v12 = (V) obj;
            return kotlin.jvm.internal.L.f(this.f112108a, v12.f112108a) && kotlin.jvm.internal.L.f(this.f112109b, v12.f112109b) && kotlin.jvm.internal.L.f(this.f112110c, v12.f112110c);
        }

        public final int hashCode() {
            String str = this.f112108a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f112109b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f112110c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSearchFilters(iconType=");
            sb2.append(this.f112108a);
            sb2.append(", fromPage=");
            sb2.append(this.f112109b);
            sb2.append(", scrollToParameterWithId=");
            return C22026a.c(sb2, this.f112110c, ')');
        }

        public V(String str, String str2, String str3, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            str3 = (i12 & 4) != 0 ? null : str3;
            this.f112108a = str;
            this.f112109b = str2;
            this.f112110c = str3;
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$W;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$W */
    public static final /* data */ class W implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final W f112111a = new W();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof W);
        }

        public final int hashCode() {
            return 238050142;
        }

        @Y61.k
        public final String toString() {
            return "OpenSharingDialog";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$X;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$X */
    public static final /* data */ class X implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter.AutoShowPresetFiltersDialog f112112a;

        public X(@Y61.k Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog) {
            this.f112112a = autoShowPresetFiltersDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof X) && kotlin.jvm.internal.L.f(this.f112112a, ((X) obj).f112112a);
        }

        public final int hashCode() {
            return this.f112112a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PersonalFiltersChangeDialogShowRequested(dialog=" + this.f112112a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$Y;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$Y */
    public static final /* data */ class Y implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinOneTimeEvent f112113a;

        public Y(@Y61.k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f112113a = beduinOneTimeEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Y) && kotlin.jvm.internal.L.f(this.f112113a, ((Y) obj).f112113a);
        }

        public final int hashCode() {
            return this.f112113a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ProxyBeduinFeatureOneTimeEvent(event=" + this.f112113a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$Z;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$Z */
    public static final /* data */ class Z implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final Z f112114a = new Z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Z);
        }

        public final int hashCode() {
            return 1451341799;
        }

        @Y61.k
        public final String toString() {
            return "ReachedListEnd";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$a;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$a, reason: case insensitive filesystem */
    public static final /* data */ class C29128a implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112115a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112116b;

        public C29128a(@Y61.k String str, @Y61.l String str2) {
            this.f112115a = str;
            this.f112116b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29128a)) {
                return false;
            }
            C29128a c29128a = (C29128a) obj;
            return kotlin.jvm.internal.L.f(this.f112115a, c29128a.f112115a) && kotlin.jvm.internal.L.f(this.f112116b, c29128a.f112116b);
        }

        public final int hashCode() {
            int iHashCode = this.f112115a.hashCode() * 31;
            String str = this.f112116b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AcceptFeedTab(feedId=");
            sb2.append(this.f112115a);
            sb2.append(", filters=");
            return C22026a.c(sb2, this.f112116b, ')');
        }

        public /* synthetic */ C29128a(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$a0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$a0, reason: case insensitive filesystem */
    public static final /* data */ class C29129a0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112117a;

        public C29129a0(boolean z12) {
            this.f112117a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29129a0) && this.f112117a == ((C29129a0) obj).f112117a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112117a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("RecsReloadButtonVisibilityChange(shouldShow="), this.f112117a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$b;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C3300b implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Filter f112118a;

        public C3300b(@Y61.l Filter filter) {
            this.f112118a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3300b) && kotlin.jvm.internal.L.f(this.f112118a, ((C3300b) obj).f112118a);
        }

        public final int hashCode() {
            Filter filter = this.f112118a;
            if (filter == null) {
                return 0;
            }
            return filter.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionHorizontalFilterUpdate(filter=" + this.f112118a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$b0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$b0, reason: case insensitive filesystem */
    public static final /* data */ class C29130b0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29130b0 f112119a = new C29130b0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29130b0);
        }

        public final int hashCode() {
            return -1428546705;
        }

        @Y61.k
        public final String toString() {
            return "RecsReloadClicked";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$c;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$c, reason: case insensitive filesystem */
    public static final /* data */ class C29131c implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SnippetItem f112120a;

        /* renamed from: b, reason: collision with root package name */
        public final int f112121b;

        public C29131c(@Y61.k SnippetItem snippetItem, int i12) {
            this.f112120a = snippetItem;
            this.f112121b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29131c)) {
                return false;
            }
            C29131c c29131c = (C29131c) obj;
            return kotlin.jvm.internal.L.f(this.f112120a, c29131c.f112120a) && this.f112121b == c29131c.f112121b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f112121b) + (this.f112120a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionSnippet(item=");
            sb2.append(this.f112120a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f112121b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$c0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$c0, reason: case insensitive filesystem */
    public static final /* data */ class C29132c0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29132c0 f112122a = new C29132c0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29132c0);
        }

        public final int hashCode() {
            return 720001400;
        }

        @Y61.k
        public final String toString() {
            return "RecsReloadFlowFinished";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$d;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$d, reason: case insensitive filesystem */
    public static final /* data */ class C29133d implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Mode f112123a;

        public C29133d(@Y61.k Mode mode) {
            this.f112123a = mode;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29133d) && this.f112123a == ((C29133d) obj).f112123a;
        }

        public final int hashCode() {
            return this.f112123a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionsHorizontalBlockMode(mode=" + this.f112123a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$d0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$d0, reason: case insensitive filesystem */
    public static final /* data */ class C29134d0 implements InterfaceC29127b, k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Location f112124a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<String> f112125b;

        /* JADX WARN: Multi-variable type inference failed */
        public C29134d0() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29134d0)) {
                return false;
            }
            C29134d0 c29134d0 = (C29134d0) obj;
            return kotlin.jvm.internal.L.f(this.f112124a, c29134d0.f112124a) && kotlin.jvm.internal.L.f(this.f112125b, c29134d0.f112125b);
        }

        public final int hashCode() {
            Location location = this.f112124a;
            int iHashCode = (location == null ? 0 : location.hashCode()) * 31;
            List<String> list = this.f112125b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReloadAll(location=");
            sb2.append(this.f112124a);
            sb2.append(", inlinesOrder=");
            return androidx.compose.foundation.H.p(sb2, this.f112125b, ')');
        }

        public C29134d0(@Y61.l Location location, @Y61.l List<String> list) {
            this.f112124a = location;
            this.f112125b = list;
        }

        public /* synthetic */ C29134d0(Location location, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : location, (i12 & 2) != 0 ? null : list);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$e;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$e, reason: case insensitive filesystem */
    public static final /* data */ class C29135e implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final float f112126a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112127b;

        public C29135e(float f12, boolean z12) {
            this.f112126a = f12;
            this.f112127b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29135e)) {
                return false;
            }
            C29135e c29135e = (C29135e) obj;
            return Float.compare(this.f112126a, c29135e.f112126a) == 0 && this.f112127b == c29135e.f112127b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112127b) + (Float.hashCode(this.f112126a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnimatePromoHeaderToolbar(offset=");
            sb2.append(this.f112126a);
            sb2.append(", isAnimateBackground=");
            return androidx.appcompat.app.r.x(sb2, this.f112127b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$e0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$e0, reason: case insensitive filesystem */
    public static final /* data */ class C29136e0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<String> f112128a;

        /* JADX WARN: Multi-variable type inference failed */
        public C29136e0() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29136e0) && kotlin.jvm.internal.L.f(this.f112128a, ((C29136e0) obj).f112128a);
        }

        public final int hashCode() {
            List<String> list = this.f112128a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("ReloadContent(inlinesOrder="), this.f112128a, ')');
        }

        public C29136e0(@Y61.l List<String> list) {
            this.f112128a = list;
        }

        public /* synthetic */ C29136e0(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$f;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$f, reason: case insensitive filesystem */
    public static final /* data */ class C29137f implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final float f112129a;

        public C29137f(float f12) {
            this.f112129a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29137f) && Float.compare(this.f112129a, ((C29137f) obj).f112129a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f112129a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f112129a, new StringBuilder("AnimateToolbar(offset="));
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$f0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$f0, reason: case insensitive filesystem */
    public static final /* data */ class C29138f0 implements InterfaceC29127b, k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Area f112130a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<String> f112131b;

        public C29138f0(@Y61.l List list, @Y61.l Area area) {
            this.f112130a = area;
            this.f112131b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29138f0)) {
                return false;
            }
            C29138f0 c29138f0 = (C29138f0) obj;
            return kotlin.jvm.internal.L.f(this.f112130a, c29138f0.f112130a) && kotlin.jvm.internal.L.f(this.f112131b, c29138f0.f112131b);
        }

        public final int hashCode() {
            Area area = this.f112130a;
            int iHashCode = (area == null ? 0 : area.hashCode()) * 31;
            List<String> list = this.f112131b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReloadInlines(area=");
            sb2.append(this.f112130a);
            sb2.append(", inlinesOrder=");
            return androidx.compose.foundation.H.p(sb2, this.f112131b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$g;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$g, reason: case insensitive filesystem */
    public static final /* data */ class C29139g implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112132a;

        public C29139g(boolean z12) {
            this.f112132a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29139g) && this.f112132a == ((C29139g) obj).f112132a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112132a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("BackPressed(fromActionBar="), this.f112132a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$g0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$g0, reason: case insensitive filesystem */
    public static final /* data */ class C29140g0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f112133a;

        /* JADX WARN: Multi-variable type inference failed */
        public C29140g0() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29140g0) && kotlin.jvm.internal.L.f(this.f112133a, ((C29140g0) obj).f112133a);
        }

        public final int hashCode() {
            Integer num = this.f112133a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("ReloadList(newBottomSheetState="), this.f112133a, ')');
        }

        public C29140g0(@Y61.l Integer num) {
            this.f112133a = num;
        }

        public /* synthetic */ C29140g0(Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$h;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "a", "b", "c", "Lcom/avito/android/bxcontent/mvi/entity/b$h$a;", "Lcom/avito/android/bxcontent/mvi/entity/b$h$b;", "Lcom/avito/android/bxcontent/mvi/entity/b$h$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$h, reason: case insensitive filesystem */
    public interface InterfaceC29141h extends InterfaceC29127b {

        /* compiled from: BxContentAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$h$a;", "Lcom/avito/android/bxcontent/mvi/entity/b$h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.mvi.entity.b$h$a */
        public static final /* data */ class a implements InterfaceC29141h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C29126a.b f112134a;

            public a(@Y61.k C29126a.b bVar) {
                this.f112134a = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f112134a, ((a) obj).f112134a);
            }

            public final int hashCode() {
                return this.f112134a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "BindBlock(block=" + this.f112134a + ')';
            }
        }

        /* compiled from: BxContentAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$h$b;", "Lcom/avito/android/bxcontent/mvi/entity/b$h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.mvi.entity.b$h$b, reason: collision with other inner class name */
        public static final /* data */ class C3301b implements InterfaceC29141h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f112135a;

            public C3301b(@Y61.k String str) {
                this.f112135a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3301b) && kotlin.jvm.internal.L.f(this.f112135a, ((C3301b) obj).f112135a);
            }

            public final int hashCode() {
                return this.f112135a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("HideAdItemById(itemId="), this.f112135a, ')');
            }
        }

        /* compiled from: BxContentAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$h$c;", "Lcom/avito/android/bxcontent/mvi/entity/b$h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.mvi.entity.b$h$c */
        public static final /* data */ class c implements InterfaceC29141h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f112136a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f112137b;

            public c(@Y61.k String str, @Y61.k String str2) {
                this.f112136a = str;
                this.f112137b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.L.f(this.f112136a, cVar.f112136a) && kotlin.jvm.internal.L.f(this.f112137b, cVar.f112137b);
            }

            public final int hashCode() {
                return this.f112137b.hashCode() + (this.f112136a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RenderError(errorType=");
                sb2.append(this.f112136a);
                sb2.append(", errorMessage=");
                return C22026a.c(sb2, this.f112137b, ')');
            }
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$h0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$h0, reason: case insensitive filesystem */
    public static final /* data */ class C29142h0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<String> f112138a;

        /* JADX WARN: Multi-variable type inference failed */
        public C29142h0() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29142h0) && kotlin.jvm.internal.L.f(this.f112138a, ((C29142h0) obj).f112138a);
        }

        public final int hashCode() {
            List<String> list = this.f112138a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("ReloadPageContent(inlinesOrder="), this.f112138a, ')');
        }

        public C29142h0(@Y61.l List<String> list) {
            this.f112138a = list;
        }

        public /* synthetic */ C29142h0(List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$i;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$i, reason: case insensitive filesystem */
    public static final /* data */ class C29143i implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29143i f112139a = new C29143i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29143i);
        }

        public final int hashCode() {
            return 822894700;
        }

        @Y61.k
        public final String toString() {
            return "BeduinRenderingSuccess";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$i0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$i0, reason: case insensitive filesystem */
    public static final /* data */ class C29144i0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Onboarding f112140a;

        public C29144i0(@Y61.k Onboarding onboarding) {
            this.f112140a = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29144i0) && kotlin.jvm.internal.L.f(this.f112140a, ((C29144i0) obj).f112140a);
        }

        public final int hashCode() {
            return this.f112140a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RememberParanjaOnboardingShown(onboarding=" + this.f112140a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$j;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$j, reason: case insensitive filesystem */
    public static final /* data */ class C29145j implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final float f112141a;

        public C29145j(float f12) {
            this.f112141a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29145j) && Float.compare(this.f112141a, ((C29145j) obj).f112141a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f112141a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f112141a, new StringBuilder("BottomSheetOffsetChanged(offset="));
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$j0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$j0, reason: case insensitive filesystem */
    public static final /* data */ class C29146j0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RecentQuerySearchItem f112142a;

        /* renamed from: b, reason: collision with root package name */
        public final int f112143b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f112144c;

        public C29146j0(@Y61.k RecentQuerySearchItem recentQuerySearchItem, int i12, @Y61.l String str) {
            this.f112142a = recentQuerySearchItem;
            this.f112143b = i12;
            this.f112144c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29146j0)) {
                return false;
            }
            C29146j0 c29146j0 = (C29146j0) obj;
            return kotlin.jvm.internal.L.f(this.f112142a, c29146j0.f112142a) && this.f112143b == c29146j0.f112143b && kotlin.jvm.internal.L.f(this.f112144c, c29146j0.f112144c);
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f112143b, this.f112142a.hashCode() * 31, 31);
            String str = this.f112144c;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveRecentQuerySearchItem(search=");
            sb2.append(this.f112142a);
            sb2.append(", position=");
            sb2.append(this.f112143b);
            sb2.append(", categoryId=");
            return C22026a.c(sb2, this.f112144c, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$k0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$k0, reason: case insensitive filesystem */
    public static final /* data */ class C29148k0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainExitOnboarding f112147a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f112148b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112149c;

        public C29148k0(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding, @Y61.k String str, boolean z12) {
            this.f112147a = replaceMainExitOnboarding;
            this.f112148b = str;
            this.f112149c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29148k0)) {
                return false;
            }
            C29148k0 c29148k0 = (C29148k0) obj;
            return kotlin.jvm.internal.L.f(this.f112147a, c29148k0.f112147a) && kotlin.jvm.internal.L.f(this.f112148b, c29148k0.f112148b) && this.f112149c == c29148k0.f112149c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112149c) + androidx.compose.foundation.H.d(this.f112147a.hashCode() * 31, 31, this.f112148b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceMainExitOnboardingClosed(onboarding=");
            sb2.append(this.f112147a);
            sb2.append(", buttonTitle=");
            sb2.append(this.f112148b);
            sb2.append(", buttonClicked=");
            return androidx.appcompat.app.r.x(sb2, this.f112149c, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$l;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$l, reason: case insensitive filesystem */
    public static final /* data */ class C29149l implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.Toast f112150a;

        public C29149l(@Y61.k BxContentBusiness360.Toast toast) {
            this.f112150a = toast;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29149l) && kotlin.jvm.internal.L.f(this.f112150a, ((C29149l) obj).f112150a);
        }

        public final int hashCode() {
            return this.f112150a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Business360ToastClicked(toast=" + this.f112150a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$l0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$l0, reason: case insensitive filesystem */
    public static final /* data */ class C29150l0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainExitOnboarding f112151a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f112152b;

        public C29150l0(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding, @Y61.k String str) {
            this.f112151a = replaceMainExitOnboarding;
            this.f112152b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29150l0)) {
                return false;
            }
            C29150l0 c29150l0 = (C29150l0) obj;
            return kotlin.jvm.internal.L.f(this.f112151a, c29150l0.f112151a) && kotlin.jvm.internal.L.f(this.f112152b, c29150l0.f112152b);
        }

        public final int hashCode() {
            return this.f112152b.hashCode() + (this.f112151a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceMainExitOnboardingShown(onboarding=");
            sb2.append(this.f112151a);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f112152b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$m;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$m, reason: case insensitive filesystem */
    public static final /* data */ class C29151m implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.Toast f112153a;

        public C29151m(@Y61.k BxContentBusiness360.Toast toast) {
            this.f112153a = toast;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29151m) && kotlin.jvm.internal.L.f(this.f112153a, ((C29151m) obj).f112153a);
        }

        public final int hashCode() {
            return this.f112153a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Business360ToastShown(toast=" + this.f112153a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$m0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$m0, reason: case insensitive filesystem */
    public static final /* data */ class C29152m0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.ReplaceMain.ToastReplaceMain f112154a;

        public C29152m0(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain) {
            this.f112154a = toastReplaceMain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29152m0) && kotlin.jvm.internal.L.f(this.f112154a, ((C29152m0) obj).f112154a);
        }

        public final int hashCode() {
            return this.f112154a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMainToastClicked(toast=" + this.f112154a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$n;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$n, reason: case insensitive filesystem */
    public static final /* data */ class C29153n implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.hero_banner.widget.k f112155a;

        public C29153n(@Y61.k com.avito.android.hero_banner.widget.k kVar) {
            this.f112155a = kVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29153n) && kotlin.jvm.internal.L.f(this.f112155a, ((C29153n) obj).f112155a);
        }

        public final int hashCode() {
            return this.f112155a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeHeroBannerState(newState=" + this.f112155a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$n0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$n0, reason: case insensitive filesystem */
    public static final /* data */ class C29154n0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.ReplaceMain.ToastReplaceMain f112156a;

        public C29154n0(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain) {
            this.f112156a = toastReplaceMain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29154n0) && kotlin.jvm.internal.L.f(this.f112156a, ((C29154n0) obj).f112156a);
        }

        public final int hashCode() {
            return this.f112156a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMainToastShown(toast=" + this.f112156a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$o;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$o, reason: case insensitive filesystem */
    public static final /* data */ class C29155o implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.bxcontent.search_bar_promo_widget.h f112157a;

        public C29155o(@Y61.k com.avito.android.bxcontent.search_bar_promo_widget.h hVar) {
            this.f112157a = hVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29155o) && kotlin.jvm.internal.L.f(this.f112157a, ((C29155o) obj).f112157a);
        }

        public final int hashCode() {
            return this.f112157a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeSearchPromoHeaderState(newState=" + this.f112157a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$o0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$o0 */
    public static final /* data */ class o0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainWidgetItem.ReplaceMain f112158a;

        public o0(@Y61.k ReplaceMainWidgetItem.ReplaceMain replaceMain) {
            this.f112158a = replaceMain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && kotlin.jvm.internal.L.f(this.f112158a, ((o0) obj).f112158a);
        }

        public final int hashCode() {
            return this.f112158a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMainWidgetButtonClicked(replaceMainItem=" + this.f112158a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$p;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$p, reason: case insensitive filesystem */
    public static final /* data */ class C29156p implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29156p f112159a = new C29156p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29156p);
        }

        public final int hashCode() {
            return -937177047;
        }

        @Y61.k
        public final String toString() {
            return "CloseActionPromoBanner";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$p0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$p0 */
    public static final /* data */ class p0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.Q<List<Integer>, List<Integer>> f112160a;

        /* JADX WARN: Multi-variable type inference failed */
        public p0(@Y61.k kotlin.Q<? extends List<Integer>, ? extends List<Integer>> q12) {
            this.f112160a = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && kotlin.jvm.internal.L.f(this.f112160a, ((p0) obj).f112160a);
        }

        public final int hashCode() {
            return this.f112160a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("RubricatorItemsVisibilityChanged(newVisible="), this.f112160a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$q;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$q, reason: case insensitive filesystem */
    public static final /* data */ class C29157q implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29157q f112161a = new C29157q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29157q);
        }

        public final int hashCode() {
            return -504529131;
        }

        @Y61.k
        public final String toString() {
            return "CloseAddAddressSuggest";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$q0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$q0 */
    public static final /* data */ class q0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f112162a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112163b;

        public q0() {
            this(null, null, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q0)) {
                return false;
            }
            q0 q0Var = (q0) obj;
            return kotlin.jvm.internal.L.f(this.f112162a, q0Var.f112162a) && kotlin.jvm.internal.L.f(this.f112163b, q0Var.f112163b);
        }

        public final int hashCode() {
            Throwable th2 = this.f112162a;
            int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            String str = this.f112163b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedSearchError(error=");
            sb2.append(this.f112162a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f112163b, ')');
        }

        public q0(Throwable th2, String str, int i12, C42822w c42822w) {
            th2 = (i12 & 1) != 0 ? null : th2;
            str = (i12 & 2) != 0 ? null : str;
            this.f112162a = th2;
            this.f112163b = str;
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$r;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$r, reason: case insensitive filesystem */
    public static final /* data */ class C29158r implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SnippetItem f112164a;

        /* renamed from: b, reason: collision with root package name */
        public final int f112165b;

        public C29158r(@Y61.k SnippetItem snippetItem, int i12) {
            this.f112164a = snippetItem;
            this.f112165b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29158r)) {
                return false;
            }
            C29158r c29158r = (C29158r) obj;
            return kotlin.jvm.internal.L.f(this.f112164a, c29158r.f112164a) && this.f112165b == c29158r.f112165b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f112165b) + (this.f112164a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseSnippet(item=");
            sb2.append(this.f112164a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f112165b, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$s;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$s, reason: case insensitive filesystem */
    public static final /* data */ class C29159s implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29159s f112170a = new C29159s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29159s);
        }

        public final int hashCode() {
            return -907441686;
        }

        @Y61.k
        public final String toString() {
            return "CloseVerticalFilter";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$s0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$s0 */
    public static final /* data */ class s0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s0 f112171a = new s0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s0);
        }

        public final int hashCode() {
            return 18521960;
        }

        @Y61.k
        public final String toString() {
            return "SelectDatesButtonClicked";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$t;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$t, reason: case insensitive filesystem */
    public static final /* data */ class C29160t implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SerpWarningItem f112172a;

        public C29160t(@Y61.k SerpWarningItem serpWarningItem) {
            this.f112172a = serpWarningItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29160t) && kotlin.jvm.internal.L.f(this.f112172a, ((C29160t) obj).f112172a);
        }

        public final int hashCode() {
            return this.f112172a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CloseWarning(warning=" + this.f112172a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$t0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$t0 */
    public static final /* data */ class t0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.serp.analytics.widgets_tracker.e f112173a;

        public t0(@Y61.k com.avito.android.serp.analytics.widgets_tracker.e eVar) {
            this.f112173a = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t0) && kotlin.jvm.internal.L.f(this.f112173a, ((t0) obj).f112173a);
        }

        public final int hashCode() {
            return this.f112173a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SendWidgetAnalyticsAction(widgetAction=" + this.f112173a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$u;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$u, reason: case insensitive filesystem */
    public static final /* data */ class C29161u implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f112174a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112175b;

        public C29161u() {
            this(null, null, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29161u)) {
                return false;
            }
            C29161u c29161u = (C29161u) obj;
            return kotlin.jvm.internal.L.f(this.f112174a, c29161u.f112174a) && kotlin.jvm.internal.L.f(this.f112175b, c29161u.f112175b);
        }

        public final int hashCode() {
            Throwable th2 = this.f112174a;
            int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
            String str = this.f112175b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f112174a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f112175b, ')');
        }

        public C29161u(Throwable th2, String str, int i12, C42822w c42822w) {
            th2 = (i12 & 1) != 0 ? null : th2;
            str = (i12 & 2) != 0 ? null : str;
            this.f112174a = th2;
            this.f112175b = str;
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$u0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$u0 */
    public static final /* data */ class u0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final o.a f112176a;

        public u0(@Y61.k o.a aVar) {
            this.f112176a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0) && kotlin.jvm.internal.L.f(this.f112176a, ((u0) obj).f112176a);
        }

        public final int hashCode() {
            return this.f112176a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ServiceOrderRequestError(result=" + this.f112176a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$v;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$v, reason: case insensitive filesystem */
    public static final /* data */ class C29162v implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112177a;

        public C29162v(@Y61.k String str) {
            this.f112177a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29162v) && kotlin.jvm.internal.L.f(this.f112177a, ((C29162v) obj).f112177a);
        }

        public final int hashCode() {
            return this.f112177a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FeaturedTabChange(tabName="), this.f112177a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$v0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$v0 */
    public static final /* data */ class v0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final o.b f112178a;

        public v0(@Y61.k o.b bVar) {
            this.f112178a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v0) && kotlin.jvm.internal.L.f(this.f112178a, ((v0) obj).f112178a);
        }

        public final int hashCode() {
            return this.f112178a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ServiceOrderRequestSent(result=" + this.f112178a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$w;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/k;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$w, reason: case insensitive filesystem */
    public static final /* data */ class C29163w implements InterfaceC29127b, k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f112179a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<String> f112180b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112181c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ItemsSearchLinkHandleForceType f112182d;

        public C29163w() {
            throw null;
        }

        public C29163w(DeepLink deepLink, List list, boolean z12, ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType, int i12, C42822w c42822w) {
            list = (i12 & 2) != 0 ? null : list;
            z12 = (i12 & 4) != 0 ? false : z12;
            itemsSearchLinkHandleForceType = (i12 & 8) != 0 ? ItemsSearchLinkHandleForceType.f112040d : itemsSearchLinkHandleForceType;
            this.f112179a = deepLink;
            this.f112180b = list;
            this.f112181c = z12;
            this.f112182d = itemsSearchLinkHandleForceType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29163w)) {
                return false;
            }
            C29163w c29163w = (C29163w) obj;
            return kotlin.jvm.internal.L.f(this.f112179a, c29163w.f112179a) && kotlin.jvm.internal.L.f(this.f112180b, c29163w.f112180b) && this.f112181c == c29163w.f112181c && this.f112182d == c29163w.f112182d;
        }

        public final int hashCode() {
            int iHashCode = this.f112179a.hashCode() * 31;
            List<String> list = this.f112180b;
            return this.f112182d.hashCode() + androidx.appcompat.app.r.i((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f112181c);
        }

        @Y61.k
        public final String toString() {
            return "FiltersUpdated(link=" + this.f112179a + ", inlinesOrder=" + this.f112180b + ", shouldUpdateTopSheet=" + this.f112181c + ", forceType=" + this.f112182d + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$w0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$w0 */
    public static final /* data */ class w0 implements InterfaceC29127b, j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w0 f112183a = new w0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w0);
        }

        public final int hashCode() {
            return 1313498398;
        }

        @Y61.k
        public final String toString() {
            return "ShareButtonShownEvent";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$x;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$x, reason: case insensitive filesystem */
    public static final /* data */ class C29164x implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C29164x f112184a = new C29164x();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C29164x);
        }

        public final int hashCode() {
            return -1549363057;
        }

        @Y61.k
        public final String toString() {
            return "FinishFullScreenAuthorization";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$x0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$x0 */
    public static final /* data */ class x0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final x0 f112185a = new x0();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof x0);
        }

        public final int hashCode() {
            return 1023156964;
        }

        @Y61.k
        public final String toString() {
            return "ShowAllCategories";
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$y;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$y, reason: case insensitive filesystem */
    public static final /* data */ class C29165y implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112186a;

        public C29165y(@Y61.k String str) {
            this.f112186a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29165y) && kotlin.jvm.internal.L.f(this.f112186a, ((C29165y) obj).f112186a);
        }

        public final int hashCode() {
            return this.f112186a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FloatingPromoWidgetClick(widgetId="), this.f112186a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$y0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$y0 */
    public static final /* data */ class y0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112187a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f112188b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.a<kotlin.G0> f112189c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.a<kotlin.G0> f112190d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<kotlin.G0> f112191e;

        public y0(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3) {
            this.f112187a = str;
            this.f112188b = str2;
            this.f112189c = aVar;
            this.f112190d = aVar2;
            this.f112191e = aVar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y0)) {
                return false;
            }
            y0 y0Var = (y0) obj;
            return kotlin.jvm.internal.L.f(this.f112187a, y0Var.f112187a) && kotlin.jvm.internal.L.f(this.f112188b, y0Var.f112188b) && kotlin.jvm.internal.L.f(this.f112189c, y0Var.f112189c) && kotlin.jvm.internal.L.f(this.f112190d, y0Var.f112190d) && kotlin.jvm.internal.L.f(this.f112191e, y0Var.f112191e);
        }

        public final int hashCode() {
            return this.f112191e.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.h(androidx.compose.foundation.H.d(this.f112187a.hashCode() * 31, 31, this.f112188b), 31, this.f112189c), 31, this.f112190d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSerpAdvertScrollToast(title=");
            sb2.append(this.f112187a);
            sb2.append(", subtitle=");
            sb2.append(this.f112188b);
            sb2.append(", onDismiss=");
            sb2.append(this.f112189c);
            sb2.append(", onShow=");
            sb2.append(this.f112190d);
            sb2.append(", onClose=");
            return androidx.appcompat.app.r.v(sb2, this.f112191e, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$z;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$z, reason: case insensitive filesystem */
    public static final /* data */ class C29166z implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f112192a;

        public C29166z(boolean z12) {
            this.f112192a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29166z) && this.f112192a == ((C29166z) obj).f112192a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112192a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("FloatingViewsReverseBehaviourEnable(isEnabled="), this.f112192a, ')');
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$z0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$z0 */
    public static final /* data */ class z0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SnippetItem f112193a;

        public z0(@Y61.k SnippetItem snippetItem) {
            this.f112193a = snippetItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z0) && kotlin.jvm.internal.L.f(this.f112193a, ((z0) obj).f112193a);
        }

        public final int hashCode() {
            return this.f112193a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowSnippet(item=" + this.f112193a + ')';
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$A0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$A0 */
    public static final /* data */ class A0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f112061a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f112062b;

        public A0(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f112061a = str;
            this.f112062b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof A0)) {
                return false;
            }
            A0 a02 = (A0) obj;
            return kotlin.jvm.internal.L.f(this.f112061a, a02.f112061a) && kotlin.jvm.internal.L.f(this.f112062b, a02.f112062b);
        }

        public final int hashCode() {
            return this.f112062b.hashCode() + (this.f112061a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToast(message=" + this.f112061a + ", type=" + this.f112062b + ')';
        }

        public /* synthetic */ A0(String str, com.avito.android.component.toast.f fVar, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? f.a.f125253a : fVar);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$k;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$k, reason: case insensitive filesystem */
    public static final /* data */ class C29147k implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        public final int f112145a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112146b;

        public C29147k(int i12, boolean z12) {
            this.f112145a = i12;
            this.f112146b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29147k)) {
                return false;
            }
            C29147k c29147k = (C29147k) obj;
            return this.f112145a == c29147k.f112145a && this.f112146b == c29147k.f112146b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112146b) + (Integer.hashCode(this.f112145a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetStateChanged(newState=");
            sb2.append(this.f112145a);
            sb2.append(", isGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f112146b, ')');
        }

        public /* synthetic */ C29147k(int i12, boolean z12, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: BxContentAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/b$r0;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.entity.b$r0 */
    public static final /* data */ class r0 implements InterfaceC29127b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineAction.Predefined.State f112166a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f112167b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112168c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f112169d;

        public r0(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12, boolean z13) {
            this.f112166a = state;
            this.f112167b = str;
            this.f112168c = z12;
            this.f112169d = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r0)) {
                return false;
            }
            r0 r0Var = (r0) obj;
            return this.f112166a == r0Var.f112166a && kotlin.jvm.internal.L.f(this.f112167b, r0Var.f112167b) && this.f112168c == r0Var.f112168c && this.f112169d == r0Var.f112169d;
        }

        public final int hashCode() {
            int iHashCode = this.f112166a.hashCode() * 31;
            String str = this.f112167b;
            return Boolean.hashCode(this.f112169d) + androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f112168c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchSubscriptionStateChanged(state=");
            sb2.append(this.f112166a);
            sb2.append(", filterId=");
            sb2.append(this.f112167b);
            sb2.append(", isSubscribed=");
            sb2.append(this.f112168c);
            sb2.append(", notifyOthersFeatures=");
            return androidx.appcompat.app.r.x(sb2, this.f112169d, ')');
        }

        public /* synthetic */ r0(InlineAction.Predefined.State state, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(state, str, z12, (i12 & 8) != 0 ? false : z13);
        }
    }
}

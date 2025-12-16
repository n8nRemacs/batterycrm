package com.avito.android.bxcontent;

import Ax.InterfaceC13095a;
import Hd.C13979c;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import androidx.core.os.C22777e;
import bY.InterfaceC25585b;
import com.avito.android.C36135w2;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.LoggingType;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.async_phone.AsyncPhoneRequestData;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.Q1;
import com.avito.android.bxcontent.di.module.InterfaceC29053a;
import com.avito.android.bxcontent.mvi.entity.FeedId;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.bxcontent.mvi.entity.ItemsSearchLinkHandleForceType;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.cross_category.AnalyticParams;
import com.avito.android.cross_category.CrossCategoryWidgetItem;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.module.ga;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import com.avito.android.feed_shortcuts.widget.FeedShortcutsWidgetItem;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.rec.ScreenSource;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertItemActions;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.saved_searches.analytics.SavedSearchEntryPointType;
import com.avito.android.scroll_tracker.d;
import com.avito.android.scroll_tracker.i;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import com.avito.android.search_ux_feedback.remote.SearchRemoteFeedbackEvent;
import com.avito.android.serp.CallInfo;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import com.avito.android.serp.adapter.vertical_main.publish.PublishAction;
import com.avito.android.serp.adapter.warning.SerpWarningItem;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import js0.d;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l41.InterfaceC43543a;
import mU.C44012a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import qc.InterfaceC47375a;
import rn0.InterfaceC47691c;
import shark.AndroidResourceIdNames;
import vs0.C49377a;
import wj.InterfaceC49636a;

/* compiled from: BxContentPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/t0;", "Lcom/avito/android/bxcontent/r0;", "Lcom/avito/android/favorite/u;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.t0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29253t0 implements InterfaceC29247r0, com.avito.android.favorite.u {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.default_search_location.e f112930A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.analytics.a f112931B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47375a f112932C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f112933D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.n f112934E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.mini_menu.h f112935F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f112936G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delayed_ux_feedback.d f112937H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.main_start_onboarding.a f112938I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f112939J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f112940K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_info_toast_bar.interactor.g f112941L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f112942M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f112943N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49636a f112944O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_favorites_toast.a f112945P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final AD.a f112946Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public C29235n f112947R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Y0 f112948S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f112949T = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f112950U = new io.reactivex.rxjava3.disposables.i(0);

    /* renamed from: V, reason: collision with root package name */
    public long f112951V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public AsyncPhoneRequestData f112952W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f112953X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f112954Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public com.avito.android.search.p f112955Z;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f112956b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_apprater.g f112957c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f112958d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.C f112959e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C44012a f112960f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.d f112961g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.i f112962h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f112963i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f112964j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f112965k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.messenger.a f112966l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f112967m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.stories.t f112968n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.call.a f112969o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final gs0.b f112970p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f112971q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.stories.adapter.k f112972r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28616b f112973s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.q f112974t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.publish.c f112975u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Q1 f112976v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBarPresenter f112977w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final ProgressInfoToastBarPresenter.State f112978x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Rp0.b f112979y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.L0 f112980z;

    /* compiled from: BxContentPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.t0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ContactSource> f112981a = kotlin.enums.c.a(ContactSource.values());
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.t0$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112982a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112982a = iArr;
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "yOffset", "Lkotlin/G0;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.BxContentPresenterImpl$animatePromoHeaderWidget$1", f = "BxContentPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.t0$c */
    public static final class c extends SuspendLambda implements Y41.p<Float, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ float f112983q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f112985s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f112985s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C29253t0.this.new c(this.f112985s, continuation);
            cVar.f112983q = ((Number) obj).floatValue();
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(Float f12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(Float.valueOf(f12.floatValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            float f12 = this.f112983q;
            C29235n c29235n = C29253t0.this.f112947R;
            if (c29235n != null) {
                c29235n.accept(new InterfaceC29127b.C29135e(f12, this.f112985s));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$f */
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            C29235n c29235n = C29253t0.this.f112947R;
            if (c29235n != null) {
                c29235n.accept(new InterfaceC29127b.C29161u(th2, null, 2, null));
            }
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/api/entity/Channel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$h */
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f112990b = new h<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$i */
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f112991b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.c("BXContentPresenter", "Failed to send respond", (Throwable) obj);
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$j */
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C29253t0.this.f112974t.a();
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/T0;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$k */
    public static final class k<T> implements l41.g {
        public k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Y0 y02;
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            C29253t0 c29253t0 = C29253t0.this;
            if (!z12) {
                if (!(typedResult instanceof TypedResult.Error) || (y02 = c29253t0.f112948S) == null) {
                    return;
                }
                y02.i80(((TypedResult.Error) typedResult).getCause());
                return;
            }
            com.avito.android.remote.T0 t02 = (com.avito.android.remote.T0) ((TypedResult.Success) typedResult).getResult();
            C29235n c29235n = c29253t0.f112947R;
            if (c29235n != null) {
                c29235n.accept(new InterfaceC29127b.B(t02.getDeepLink(), null, null, null, null, 30, null));
            }
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Landroid/view/View;", "Lcom/avito/android/remote/model/serp/Onboarding;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$m */
    public static final class m<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y0 f112995b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C29253t0 f112996c;

        public m(Y0 y02, C29253t0 c29253t0) {
            this.f112995b = y02;
            this.f112996c = c29253t0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            View view = (View) q12.f406619b;
            Onboarding onboarding = (Onboarding) q12.f406620c;
            Y0 y02 = this.f112995b;
            if (y02 != null) {
                y02.OQ(view, onboarding, new A0(this.f112996c, onboarding), B0.f108859l);
            }
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$n */
    public static final class n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final n<T> f112997b = new n<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("BXContentPresenter", "Error mini menu show onboarding " + ((Throwable) obj));
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/serp/Onboarding;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$o */
    public static final class o<T> implements l41.g {
        public o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            int iIntValue = ((Number) q12.f406619b).intValue();
            Onboarding onboarding = (Onboarding) q12.f406620c;
            C29235n c29235n = C29253t0.this.f112947R;
            if (c29235n != null) {
                c29235n.accept(new InterfaceC29127b.I(iIntValue, onboarding));
            }
        }
    }

    /* compiled from: BxContentPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.t0$p */
    public static final class p<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final p<T> f112999b = new p<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("BXContentPresenter", "Error mini menu onboardings");
        }
    }

    @Inject
    public C29253t0(@InterfaceC29053a @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.favorite_apprater.g gVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.bxcontent.mvi.C c12, @Y61.k C44012a c44012a, @Y61.k com.avito.android.scroll_tracker.d dVar, @Y61.k com.avito.android.scroll_tracker.i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC13095a interfaceC13095a, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k com.avito.android.advert_core.messenger.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.stories.t tVar, @Y61.k com.avito.android.bxcontent.call.a aVar3, @Y61.k gs0.b bVar2, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.stories.adapter.k kVar, @Y61.k InterfaceC28616b interfaceC28616b, @Y61.k com.avito.android.serp.adapter.vertical_main.q qVar, @Y61.k com.avito.android.serp.adapter.vertical_main.publish.c cVar, @Y61.k Q1 q12, @Y61.k ProgressInfoToastBarPresenter progressInfoToastBarPresenter, @Y61.l ProgressInfoToastBarPresenter.State state, @Y61.k Rp0.b bVar3, @Y61.k com.avito.android.bxcontent.mvi.L0 l02, @Y61.k com.avito.android.home.default_search_location.e eVar, @Y61.k com.avito.android.bxcontent.analytics.a aVar4, @Y61.k InterfaceC47375a interfaceC47375a, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k com.avito.android.advertising.kebab.n nVar2, @Y61.k com.avito.android.serp.adapter.mini_menu.h hVar, @ga @Y61.k com.avito.android.J0 j02, @Y61.k com.avito.android.delayed_ux_feedback.d dVar2, @Y61.k com.avito.android.main_start_onboarding.a aVar5, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar2, @Y61.k com.avito.android.progress_info_toast_bar.interactor.g gVar3, @com.avito.android.bxcontent.di.module.Z @Y61.k String str, @Y61.k C36135w2 c36135w2, @Y61.k InterfaceC49636a interfaceC49636a, @Y61.k com.avito.android.advert_favorites_toast.a aVar6, @Y61.k AD.a aVar7) {
        this.f112956b = nVar;
        this.f112957c = gVar;
        this.f112958d = bVar;
        this.f112959e = c12;
        this.f112960f = c44012a;
        this.f112961g = dVar;
        this.f112962h = iVar;
        this.f112963i = interfaceC35745a5;
        this.f112964j = interfaceC13095a;
        this.f112965k = interfaceC35945t1;
        this.f112966l = aVar;
        this.f112967m = aVar2;
        this.f112968n = tVar;
        this.f112969o = aVar3;
        this.f112970p = bVar2;
        this.f112971q = e12;
        this.f112972r = kVar;
        this.f112973s = interfaceC28616b;
        this.f112974t = qVar;
        this.f112975u = cVar;
        this.f112976v = q12;
        this.f112977w = progressInfoToastBarPresenter;
        this.f112978x = state;
        this.f112979y = bVar3;
        this.f112980z = l02;
        this.f112930A = eVar;
        this.f112931B = aVar4;
        this.f112932C = interfaceC47375a;
        this.f112933D = jVar;
        this.f112934E = nVar2;
        this.f112935F = hVar;
        this.f112936G = j02;
        this.f112937H = dVar2;
        this.f112938I = aVar5;
        this.f112939J = interfaceC31062w;
        this.f112940K = gVar2;
        this.f112941L = gVar3;
        this.f112942M = str;
        this.f112943N = c36135w2;
        this.f112944O = interfaceC49636a;
        this.f112945P = aVar6;
        this.f112946Q = aVar7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(com.avito.android.bxcontent.C29253t0 r17, boolean r18, android.os.Parcelable r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.C29253t0.D(com.avito.android.bxcontent.t0, boolean, android.os.Parcelable):void");
    }

    public static void H(C29253t0 c29253t0, AuthSource authSource, Bundle bundle, int i12) {
        if ((i12 & 4) != 0) {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        C29235n c29235n = c29253t0.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.B(new AuthenticateLink(authSource, false, (DeepLink) null, 2, (C42822w) null), bundle2, null, null, null, 28, null));
        }
    }

    @Override // ob.InterfaceC44746j
    public final void A(@Y61.k String str) {
        this.f112934E.d(str);
    }

    @Override // rn0.InterfaceC47691c
    public final void B(@Y61.k DeepLink deepLink) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.B(deepLink, null, null, ItemsSearchLinkHandleForceType.f112038b, null, 20, null));
        }
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.E(false));
        }
    }

    @Override // com.avito.android.serp.adapter.warning.e
    public final void C(@Y61.k Action action) {
        B(action.getDeepLink());
    }

    @Override // ob.InterfaceC44739c
    public final void C1(@Y61.k BannerInfo bannerInfo, int i12) {
        j.a.c(this.f112933D, bannerInfo, i12, null, 12);
    }

    public final void E(String str) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        SearchParams searchParams;
        C29235n c29235n = this.f112947R;
        if (kotlin.jvm.internal.L.f((c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (searchParams = lVarA.f112345l) == null) ? null : searchParams.getCategoryId(), "111")) {
            this.f112949T.b(this.f112966l.a(str, "serp_xl_item_call_button").s(this.f112963i.e()).x(h.f112990b, i.f112991b));
        }
    }

    public final void F(PublishAction publishAction) {
        if (!this.f112971q.b()) {
            C29235n c29235n = this.f112947R;
            if (c29235n != null) {
                c29235n.accept(new InterfaceC29127b.K(4));
            }
            H(this, AuthSource.f92732v, C22777e.b(new kotlin.Q("authenticate_result_data", publishAction)), 2);
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.S s5 = new C42017o(this.f112975u.a(publishAction).j(new j()), new InterfaceC43543a() { // from class: com.avito.android.bxcontent.s0
            @Override // l41.InterfaceC43543a
            public final void run() {
                this.f112825b.f112974t.q1();
            }
        }).s(this.f112963i.e());
        k kVar = new k();
        final V2 v22 = V2.f318762a;
        this.f112949T.b(s5.x(kVar, new l41.g() { // from class: com.avito.android.bxcontent.t0.l
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }));
    }

    @Override // com.avito.android.async_phone.InterfaceC28615a
    public final void G(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k ContactSource contactSource) {
        AuthSource authSource = AuthSource.f92718o;
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.K(3));
        }
        H(this, authSource, C22777e.b(new kotlin.Q("authenticate_result_data", new AsyncPhoneRequestData(asyncPhoneItem, contactSource))), 2);
    }

    @Override // com.avito.android.serp.adapter.advert_xl.g
    public final void Id(@Y61.k AdvertXlItem advertXlItem, @Y61.k DeepLink deepLink) {
        W(advertXlItem.f268777c, deepLink, ContactSource.f89921f, null, null);
    }

    public final void J(DeepLink deepLink, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_advert_id", str);
        bundle.putString("key_source_name", "button");
        bundle.putString("key_call_context", str2);
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.B(deepLink, bundle, "req_key_bx_content_phone_call", null, null, 24, null));
        }
    }

    @Override // ob.InterfaceC44739c
    public final void J4(@Y61.k BannerInfo bannerInfo, int i12) {
        j.a.b(this.f112933D, bannerInfo, i12);
    }

    public final void K() {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        CallInfo callInfo;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        com.avito.android.bxcontent.mvi.entity.l lVarA3;
        com.avito.android.bxcontent.mvi.entity.t tVarF;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (callInfo = lVarA.f112354r) == null) {
            return;
        }
        DeepLink deepLink = callInfo.f268359c;
        boolean z12 = deepLink instanceof PhoneLink;
        SearchParams searchParams = null;
        str = null;
        String str = null;
        searchParams = null;
        String str2 = callInfo.f268358b;
        com.avito.android.bxcontent.analytics.a aVar = this.f112931B;
        ContactSource contactSource = callInfo.f268360d;
        if (z12) {
            PhoneLink phoneLink = (PhoneLink) deepLink;
            PhoneLink.Call call = phoneLink instanceof PhoneLink.Call ? (PhoneLink.Call) phoneLink : null;
            String str3 = call != null ? call.f133575d : null;
            aVar.B(str2, str3, contactSource);
            E(str2);
            Y0 y02 = this.f112948S;
            if (y02 != null ? y02.o(this.f112965k.a(phoneLink.getF133573b()), new C29266y0(this, str2, str3, phoneLink), new C29268z0(this)) : false) {
                aVar.k(str2);
                return;
            }
            return;
        }
        if (deepLink instanceof AnonymousNumberDialogLink) {
            AnonymousNumberDialogLink anonymousNumberDialogLink = (AnonymousNumberDialogLink) deepLink;
            DeepLink deepLink2 = anonymousNumberDialogLink.f91273f;
            if (deepLink2 instanceof PhoneLink.Call) {
                str = ((PhoneLink.Call) deepLink2).f133575d;
            } else if (deepLink2 instanceof ClickStreamLink) {
                DeepLink deepLink3 = ((ClickStreamLink) deepLink2).f133110e;
                PhoneLink.Call call2 = deepLink3 instanceof PhoneLink.Call ? (PhoneLink.Call) deepLink3 : null;
                if (call2 != null) {
                    str = call2.f133575d;
                }
            }
            aVar.B(str2, str, contactSource);
            E(str2);
            J(anonymousNumberDialogLink, str2, str);
            return;
        }
        if (deepLink instanceof CreateChannelLink) {
            L((CreateChannelLink) deepLink, contactSource, null);
            return;
        }
        if (!(deepLink instanceof MessengerIcebreakerDialogDeeplink)) {
            if (deepLink instanceof AuthenticateLink) {
                C29235n c29235n2 = this.f112947R;
                if (c29235n2 != null) {
                    c29235n2.accept(new InterfaceC29127b.K(2));
                }
                H(this, AuthSource.f92714m, null, 6);
                return;
            }
            return;
        }
        C29235n c29235n3 = this.f112947R;
        if (c29235n3 != null) {
            c29235n3.accept(new InterfaceC29127b.J((MessengerIcebreakerDialogDeeplink) deepLink, contactSource));
        }
        String str4 = ((MessengerIcebreakerDialogDeeplink) deepLink).f197547b;
        C29235n c29235n4 = this.f112947R;
        List<com.avito.android.serp.adapter.l1> list = (c29235n4 == null || (lVarA3 = c29235n4.f112645M.a()) == null || (tVarF = lVarA3.f()) == null) ? null : tVarF.f112428e;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        C29235n c29235n5 = this.f112947R;
        if (c29235n5 != null && (lVarA2 = c29235n5.f112645M.a()) != null) {
            searchParams = lVarA2.f112345l;
        }
        this.f112977w.c(this.f112976v.a(list, str4, searchParams).j(new l41.o() { // from class: com.avito.android.bxcontent.u0
            @Override // l41.o
            public final Object apply(Object obj) {
                Q1.a aVar2 = (Q1.a) obj;
                return ProgressInfoToastBarPresenter.RequestData.a.a(ProgressInfoToastBarPresenter.RequestData.f231543h, aVar2.f109420a, aVar2.f109421b, aVar2.f109423d);
            }
        }));
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void K6(@Y61.k Y0 y02) {
        this.f112948S = y02;
        C29235n c29235n = this.f112947R;
        com.avito.android.bxcontent.mvi.entity.l lVarA = c29235n != null ? c29235n.f112645M.a() : null;
        com.avito.android.serp.adapter.vertical_main.q qVar = this.f112974t;
        C41981q0 c41981q0P = qVar.p();
        InterfaceC35745a5 interfaceC35745a5 = this.f112963i;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = c41981q0P.j0(interfaceC35745a5.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.bxcontent.t0.d
            @Override // l41.g
            public final void accept(Object obj) {
                C29253t0.this.F((PublishAction) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar2 = new l41.g() { // from class: com.avito.android.bxcontent.t0.e
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(gVar, gVar2, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f112949T;
        cVar.b(dVarV0);
        cVar.b(qVar.f().j0(interfaceC35745a5.e()).v0(new f(), new l41.g() { // from class: com.avito.android.bxcontent.t0.g
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f112967m;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(aVar.V9().N(H0.f109341b), null, new I0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(aVar.V9().N(J0.f109350b), null, new K0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(aVar.V9(), L0.f109357l, new M0(this), 2));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(kotlinx.coroutines.rx3.y.b(this.f112944O.b()), N0.f109367l, new O0(this), 2));
        this.f112969o.f109645b.b(this);
        ProgressInfoToastBarPresenter.State state = this.f112978x;
        if (state != null) {
            this.f112977w.e(state);
        }
        if (lVarA != null) {
            d.a aVar2 = lVarA.f112356t;
            if (aVar2 != null) {
                this.f112961g.h(aVar2);
            }
            i.a aVar3 = lVarA.f112357u;
            if (aVar3 != null) {
                this.f112962h.c(aVar3);
            }
            Long l12 = lVarA.f112358v;
            if (l12 != null) {
                this.f112936G.b(l12.longValue());
            }
        }
        this.f112980z.b(this, lVarA != null ? lVarA.f112355s : null);
        PresentationType presentationType = lVarA != null ? lVarA.f112306I : null;
        PresentationType presentationType2 = PresentationType.MAIN;
        com.avito.android.main_start_onboarding.a aVar4 = this.f112938I;
        if (presentationType != presentationType2 || (!aVar4.isRunning() && !this.f112943N.w().invoke().booleanValue())) {
            O(y02);
        }
        if ((lVarA != null ? lVarA.f112306I : null) == presentationType2) {
            aVar4.b(MainStartOnboardingStep.LoyaltyOnboarding.f184217b);
            aVar4.b(MainStartOnboardingStep.MiniMenuOnBoarding.f184218b);
        }
        K();
    }

    public final void L(CreateChannelLink createChannelLink, ContactSource contactSource, ScreenIdField screenIdField) {
        PresentationType presentationType;
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        String str = createChannelLink.f133130b;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (presentationType = lVarA.f112306I) == null) {
            presentationType = PresentationType.MAIN;
        }
        this.f112931B.h0(str, contactSource, createChannelLink.f133132d, presentationType, screenIdField, null);
        InterfaceC13095a interfaceC13095a = this.f112964j;
        Bundle bundleB = kotlin.jvm.internal.L.f(interfaceC13095a.d(), "1") ? C22777e.b(new kotlin.Q("key_disclaimer_pd", interfaceC13095a.f())) : null;
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.B(createChannelLink, bundleB, null, null, null, 28, null));
        }
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k com.avito.android.serp.adapter.S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f112956b.Ld(s5, abstractC30567a);
        this.f112957c.b(s5.getF157692b(), s5.getF107475k());
        if (s5.getF107480p() != null) {
            AD.a aVar = this.f112946Q;
            aVar.getClass();
            kotlin.reflect.n<Object> nVar = AD.a.f216k[7];
            if (((Boolean) aVar.f223h.a().invoke()).booleanValue()) {
                this.f112945P.c(s5);
                return;
            }
        }
        this.f112958d.c(s5);
    }

    public final void M(@Y61.l Parcelable parcelable) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.K(0));
        }
        H(this, AuthSource.f92702g, C22777e.b(new kotlin.Q("authenticate_result_data", parcelable)), 2);
    }

    @Override // rn0.InterfaceC47689a
    @Y61.k
    public final InterfaceC43160i<Float> M6(boolean z12) {
        InterfaceC43160i<Float> interfaceC43160iM6;
        Y0 y02 = this.f112948S;
        return (y02 == null || (interfaceC43160iM6 = y02.M6(z12)) == null) ? C43175k.w() : new C43197r1(new c(z12, null), interfaceC43160iM6);
    }

    public final void N(@Y61.k String str) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.q0(null, str, 1, null));
        }
    }

    public final void O(Y0 y02) {
        this.f112949T.b(this.f112935F.E1().j0(this.f112963i.e()).v0(new m(y02, this), n.f112997b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void P(boolean z12) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null) {
            return;
        }
        int i12 = lVarA.f().f112427d;
        com.avito.android.scroll_tracker.d dVar = this.f112961g;
        boolean zD2 = dVar.d();
        PresentationType presentationType = lVarA.f112306I;
        String str = lVarA.f112349n;
        if (zD2 && str != null) {
            int i13 = b.f112982a[presentationType.ordinal()];
            if (i13 == 1) {
                this.f112932C.a(i12, dVar.i(), Integer.valueOf(dVar.g()), str, dVar.f(), LoggingType.f89660c);
            } else if (i13 != 2) {
                return;
            } else {
                this.f112932C.b(i12, dVar.i(), Integer.valueOf(dVar.g()), str, dVar.f(), LoggingType.f89660c);
            }
            dVar.b();
        }
        com.avito.android.scroll_tracker.i iVar = this.f112962h;
        if (iVar.d() && str != null) {
            int i14 = b.f112982a[presentationType.ordinal()];
            if (i14 == 1) {
                ArrayList arrayListF = iVar.f();
                this.f112932C.a(i12, arrayListF, null, str, arrayListF.size(), LoggingType.f89661d);
            } else {
                if (i14 != 2) {
                    return;
                }
                ArrayList arrayListF2 = iVar.f();
                this.f112932C.b(i12, arrayListF2, null, str, arrayListF2.size(), LoggingType.f89661d);
            }
            iVar.b();
        }
        if (z12) {
            dVar.a();
            iVar.a();
        }
    }

    public final void Q(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.r0(state, str, z12, true));
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.a
    public final void Sa(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource) {
        W(str, deepLink, contactSource, null, null);
    }

    @Override // rn0.e
    public final void W(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l ScreenIdField screenIdField, @Y61.l String str2) {
        PresentationType presentationType;
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        if (deepLink instanceof ClickStreamLink) {
            C29235n c29235n = this.f112947R;
            if (c29235n != null) {
                ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
                clickStreamLink.getClass();
                c29235n.accept(new InterfaceC29127b.B(ClickStreamLink.a(clickStreamLink, null), null, null, null, null, 30, null));
            }
            DeepLink deepLink2 = ((ClickStreamLink) deepLink).f133110e;
            if (deepLink2 != null) {
                C29235n c29235n2 = this.f112947R;
                if (c29235n2 != null) {
                    c29235n2.accept(new InterfaceC29127b.L(new CallInfo(str, deepLink2, contactSource)));
                }
                K();
                return;
            }
            return;
        }
        if (deepLink instanceof PhoneRequestLink) {
            PhoneRequestLink phoneRequestLink = (PhoneRequestLink) deepLink;
            Bundle bundleB = C22777e.b(new kotlin.Q("key_advert_id", str), new kotlin.Q("key_phone_request_link_contact_source_ordinal", Integer.valueOf(contactSource.ordinal())));
            C13979c.f7563a.getClass();
            bundleB.putBoolean("PhoneRequestLink.ManualMode", true);
            C29235n c29235n3 = this.f112947R;
            bundleB.putString("PhoneRequestLink.SearchContext", (c29235n3 == null || (lVarA = c29235n3.f112645M.a()) == null) ? null : lVarA.f112304G);
            String str3 = contactSource.f89926c == 3 ? "item_feed_photo" : null;
            if (str3 != null) {
                bundleB.putString("PhoneRequestLink.IacOverrideScenario", str3);
            }
            b.a.a(this.f112967m, phoneRequestLink, null, bundleB, 2);
            return;
        }
        if (deepLink instanceof PhoneLink ? true : deepLink instanceof AnonymousNumberDialogLink) {
            C29235n c29235n4 = this.f112947R;
            if (c29235n4 != null) {
                c29235n4.accept(new InterfaceC29127b.L(new CallInfo(str, deepLink, contactSource)));
            }
            K();
            return;
        }
        if (deepLink instanceof CreateChannelLink) {
            L((CreateChannelLink) deepLink, contactSource, screenIdField);
            return;
        }
        if (deepLink instanceof AuthenticateLink) {
            C29235n c29235n5 = this.f112947R;
            if (c29235n5 != null) {
                c29235n5.accept(new InterfaceC29127b.K(2));
            }
            H(this, AuthSource.f92714m, null, 6);
            return;
        }
        if (deepLink instanceof com.avito.android.service_order_widget.link.a) {
            C29235n c29235n6 = this.f112947R;
            if (c29235n6 != null) {
                c29235n6.accept(new InterfaceC29127b.B(deepLink, null, null, null, null, 30, null));
                return;
            }
            return;
        }
        if (!(deepLink instanceof JobApplyCreateLink)) {
            C29235n c29235n7 = this.f112947R;
            if (c29235n7 != null) {
                c29235n7.accept(new InterfaceC29127b.B(deepLink, null, null, null, null, 30, null));
                return;
            }
            return;
        }
        this.f112941L.a(str, this.f112942M);
        C29235n c29235n8 = this.f112947R;
        com.avito.android.bxcontent.mvi.entity.l lVarA2 = c29235n8 != null ? c29235n8.f112645M.a() : null;
        boolean zA2 = this.f112964j.a();
        JobApplyCreateLink jobApplyCreateLink = (JobApplyCreateLink) deepLink;
        String str4 = jobApplyCreateLink.f134080c.f133132d;
        if (lVarA2 == null || (presentationType = lVarA2.f112306I) == null) {
            presentationType = PresentationType.MAIN;
        }
        this.f112931B.h0(jobApplyCreateLink.f134079b, contactSource, str4, presentationType, screenIdField, str2);
        C29235n c29235n9 = this.f112947R;
        if (c29235n9 != null) {
            c29235n9.accept(new InterfaceC29127b.B(deepLink, C22777e.b(new kotlin.Q("key_disclaimer_pd", Boolean.valueOf(zA2))), null, null, null, 28, null));
        }
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.u
    public final void a(@Y61.k String str) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.T(str));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void b() {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        PresentationType presentationType;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null) {
            return;
        }
        String cartSegment = lVarA.f112307J.getCartSegment();
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.B(new CartLink(lVarA.f112304G, cartSegment), null, null, null, null, 30, null));
        }
        C29235n c29235n3 = this.f112947R;
        C44012a.a(this.f112960f, null, lVarA.f112349n, (c29235n3 == null || (lVarA2 = c29235n3.f112645M.a()) == null || (presentationType = lVarA2.f112306I) == null) ? null : PresentationTypeKt.toParameterValue(presentationType), 1);
    }

    @Override // rn0.InterfaceC47691c
    public final void d(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle, @Y61.l Boolean bool, @Y61.l String str) {
        PresentationType presentationType;
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE) && bundle == null) {
            kotlin.Q q12 = new kotlin.Q("screen_source", ScreenSource.BXCONTENT.f251777d);
            C29235n c29235n = this.f112947R;
            if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (presentationType = lVarA.f112306I) == null) {
                presentationType = PresentationType.MAIN;
            }
            bundle = C22777e.b(q12, new kotlin.Q("tree_parent", this.f112931B.X(presentationType)));
        }
        Bundle bundle2 = bundle;
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.B(deepLink, bundle2, str, ItemsSearchLinkHandleForceType.f112038b, null, 16, null));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void e(@Y61.k String str, boolean z12) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        r();
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null) {
            return;
        }
        String string = C43066x.A0(str).toString();
        Boolean boolValueOf = z12 ? Boolean.valueOf(z12) : null;
        C29235n c29235n2 = this.f112947R;
        String locationId = (c29235n2 == null || (lVarA2 = c29235n2.f112645M.a()) == null) ? null : lVarA2.getLocationId();
        SearchParams searchParams = lVarA.f112345l;
        SearchParams searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : locationId, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
        com.avito.android.search.p pVar = this.f112955Z;
        String str2 = pVar != null ? pVar.f263833a : null;
        com.avito.android.bxcontent.mvi.C c12 = this.f112959e;
        PresentationType presentationType = lVarA.f112306I;
        io.reactivex.rxjava3.core.z zVarC = c12.c(string, searchParamsCopy, presentationType, str2, boolValueOf);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f112963i;
        this.f112954Y = (io.reactivex.rxjava3.internal.observers.y) C35896f0.b(zVarC, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(new C29259v0(presentationType, this), C29262w0.f113230b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        String parameterValue = PresentationTypeKt.toParameterValue(lVarA.f112306I);
        if (parameterValue == null) {
            parameterValue = "";
        }
        this.f112931B.v(parameterValue);
        this.f112979y.a(new SearchFeedbackCampaign.d(searchParams.getCategoryId(), null));
        List<UxFeedbackConfigOld> list = lVarA.f112321X;
        com.avito.android.delayed_ux_feedback.d dVar = this.f112937H;
        dVar.ge(list);
        dVar.ga(SearchRemoteFeedbackEvent.f264411d);
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void e0() {
        this.f112980z.clear();
        this.f112969o.f109648e.e();
        this.f112949T.e();
        this.f112950U.a(null);
        this.f112947R = null;
        this.f112948S = null;
        r();
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void eY(@Y61.k C29235n c29235n) {
        this.f112947R = c29235n;
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void eu() {
        this.f112950U.a(this.f112935F.x4().j0(this.f112963i.e()).v0(new o(), p.f112999b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // rn0.InterfaceC47692d
    public final void f(@Y61.k AvitoBlogArticleItem avitoBlogArticleItem) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.Q(avitoBlogArticleItem));
        }
    }

    @Override // com.avito.android.bxcontent.P1
    public final void g() {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.C29136e0(this.f112939J.W0()));
        }
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void gU(@Y61.k com.avito.android.search.p pVar) {
        this.f112955Z = pVar;
    }

    @Override // com.avito.android.ui.adapter.f
    /* renamed from: gk */
    public final boolean getF207731j() {
        com.avito.android.bxcontent.mvi.entity.t tVarF;
        C29235n c29235n = this.f112947R;
        com.avito.android.bxcontent.mvi.entity.l lVarA = c29235n != null ? c29235n.f112645M.a() : null;
        if (lVarA != null && (tVarF = lVarA.f()) != null && tVarF.f112426c) {
            if (lVarA.f112327c == LoadState.f112045d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void h(@Y61.l Boolean bool) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            C29235n c29235n = this.f112947R;
            String parameterValue = PresentationTypeKt.toParameterValue((c29235n == null || (lVarA = c29235n.f112645M.a()) == null) ? null : lVarA.f112306I);
            if (parameterValue == null) {
                parameterValue = "";
            }
            this.f112931B.o(parameterValue);
        }
        r();
    }

    @Override // com.avito.android.serp.adapter.constructor.q
    public final void i(@Y61.k DeepLink deepLink, @Y61.k String str) {
        W(str, deepLink, ContactSource.f89921f, null, null);
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        com.avito.android.bxcontent.mvi.entity.t tVarF;
        List<com.avito.android.serp.adapter.l1> list;
        Object next;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (tVarF = lVarA.f()) == null || (list = tVarF.f112428e) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((com.avito.android.serp.adapter.l1) next).getF157692b(), str)) {
                    break;
                }
            }
        }
        AdvertItem advertItem = next instanceof AdvertItem ? (AdvertItem) next : null;
        if (advertItem == null) {
            return;
        }
        AdvertItemActions advertItemActions = advertItem.f268418Z;
        if ((advertItemActions != null ? advertItemActions.getActions() : null) == null) {
            return;
        }
        C29235n c29235n2 = this.f112947R;
        FeedId feedId = (c29235n2 == null || (lVarA2 = c29235n2.f112645M.a()) == null) ? null : lVarA2.f112333f;
        int iIndexOf = list.indexOf(advertItem);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        com.avito.android.bxcontent.analytics.a aVar = this.f112931B;
        String str2 = advertItem.f268420a0;
        aVar.n(numValueOf, str, str2);
        b.a.a(this.f112967m, new AdvertItemActionsDeeplink(str, advertItem.f268418Z, str2, advertItem.f268453o0, feedId != null ? feedId.f112036b : null, Integer.valueOf(iIndexOf)), null, null, 6);
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void ih() {
        io.reactivex.rxjava3.internal.operators.observable.P pC2 = this.f112930A.c();
        InterfaceC35745a5 interfaceC35745a5 = this.f112963i;
        this.f112949T.b(pC2.x0(interfaceC35745a5.e()).j0(interfaceC35745a5.e()).v0(new D0(this), E0.f109321b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deal_confirmation.k
    public final void j(@Y61.k String str) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.A0(str, null, 2, 0 == true ? 1 : 0));
        }
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        C29235n c29235n = this.f112947R;
        com.avito.android.bxcontent.mvi.entity.l lVarA = c29235n != null ? c29235n.f112645M.a() : null;
        if (advertItem.f268393M0) {
            d.a.a(this.f112940K, Integer.valueOf(advertItem.f268397O0), advertItem.f268399P0, advertItem.f268395N0 + ", click on " + advertItem.f268425c, null, null, null, advertItem.f268400Q, null, 184);
        }
        Bundle bundle = new Bundle(7);
        bundle.putString("title", advertItem.f268428d);
        bundle.putString("key_category_id", advertItem.f268420a0);
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        String str = advertItem.f268440i;
        if (str != null) {
            bundle.putString("price", str);
        }
        String str2 = advertItem.f268446l;
        if (str2 != null) {
            bundle.putString("old_price", str2);
        }
        if (image != null) {
            bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
        }
        PresentationType presentationType = lVarA != null ? lVarA.f112306I : null;
        int i12 = presentationType == null ? -1 : b.f112982a[presentationType.ordinal()];
        if (i12 == 1) {
            String str3 = lVarA.f112333f.f112036b;
            if (str3 == null) {
                str3 = "";
            }
            bundle.putParcelable("screen_source", new ScreenSource.MAIN(str3));
        } else if (i12 != 2) {
            bundle.putParcelable("screen_source", ScreenSource.EMPTY.f251779d);
        } else {
            bundle.putParcelable("screen_source", ScreenSource.SERP.f251785d);
        }
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.B(advertItem.f268396O, bundle, null, null, null, 28, null));
        }
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void l(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.R(dealConfirmationSheet));
        }
    }

    @Override // rn0.InterfaceC47691c
    public final void n(@Y61.k DeepLink deepLink) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.C29163w(deepLink, null, false, null, 14, null));
        }
    }

    @Override // com.avito.android.serp.adapter.actions_horizontal_block.u
    public final void o() {
        SavedSearchEntryPointType savedSearchEntryPointType = SavedSearchEntryPointType.f258243c;
        p("bottomHeader");
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void onPause() {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        C29235n c29235n = this.f112947R;
        if (((c29235n == null || (lVarA = c29235n.f112645M.a()) == null) ? null : lVarA.f112306I) == PresentationType.MAIN) {
            com.avito.android.home.default_search_location.e eVar = this.f112930A;
            if (!eVar.getF162405j()) {
                eVar.d();
            }
            eVar.b();
        }
        this.f112977w.onPause();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f112953X;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void onResume() {
        ProgressInfoToastBarPresenter progressInfoToastBarPresenter = this.f112977w;
        progressInfoToastBarPresenter.onResume();
        this.f112953X = (io.reactivex.rxjava3.internal.observers.y) progressInfoToastBarPresenter.getF231563e().j0(this.f112963i.e()).v0(new F0(this), G0.f109334b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f112969o.a();
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void onStop() {
        P(false);
        com.avito.android.bxcontent.call.a aVar = this.f112969o;
        aVar.f109645b.c0();
        aVar.f109648e.e();
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void p(@Y61.l String str) {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        this.f112931B.q();
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null) {
            return;
        }
        this.f112980z.a(lVarA.f112306I, lVarA.f112345l, lVarA.f112360x == InlineAction.Predefined.State.f283118b, lVarA.f112349n, lVarA.f112355s, str);
    }

    @Override // rn0.InterfaceC47691c
    public final void q(@Y61.k DeepLink deepLink, @Y61.l Boolean bool) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.B(deepLink, null, null, kotlin.jvm.internal.L.f(bool, Boolean.FALSE) ? ItemsSearchLinkHandleForceType.f112040d : ItemsSearchLinkHandleForceType.f112038b, null, 20, null));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void r() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f112954Y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.ui.adapter.f
    public final void rp() {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        if (System.currentTimeMillis() - this.f112951V < 1000) {
            return;
        }
        C29235n c29235n = this.f112947R;
        if (((c29235n == null || (lVarA = c29235n.f112645M.a()) == null) ? null : lVarA.f112327c) != LoadState.f112044c) {
            C29235n c29235n2 = this.f112947R;
            if (c29235n2 != null) {
                c29235n2.accept(InterfaceC29127b.F.f112078a);
            }
            this.f112951V = System.currentTimeMillis();
        }
    }

    @Override // com.avito.android.bxcontent.P1
    public final void s() {
        com.avito.android.advertising.loaders.beduin.H h12;
        C29235n c29235n = this.f112947R;
        if (c29235n != null && (h12 = c29235n.f112648P) != null) {
            h12.b(false);
        }
        C29235n c29235n2 = this.f112947R;
        if (c29235n2 != null) {
            c29235n2.accept(new InterfaceC29127b.G0(false));
        }
        this.f112964j.c();
        this.f112968n.invalidate();
        this.f112974t.invalidate();
        P(true);
        C29235n c29235n3 = this.f112947R;
        if (c29235n3 != null) {
            c29235n3.accept(new InterfaceC29127b.C29136e0(this.f112939J.W0()));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void t() {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.V("icon_shashlyk", null, null, 4, null));
        }
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    @Y61.l
    public final String u() {
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        SearchParams searchParams;
        C29235n c29235n = this.f112947R;
        if (c29235n == null || (lVarA = c29235n.f112645M.a()) == null || (searchParams = lVarA.f112345l) == null) {
            return null;
        }
        return searchParams.getQuery();
    }

    @Override // vs0.g
    public final void v(@Y61.k vs0.f fVar) {
        SearchParams empty;
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        Integer num;
        SearchParams searchParams;
        SearchParams empty2;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        DeepLink deeplink;
        boolean z12 = fVar instanceof C49377a;
        categoryId = null;
        String categoryId = null;
        com.avito.android.bxcontent.analytics.a aVar = this.f112931B;
        if (z12) {
            C49377a c49377a = (C49377a) fVar;
            com.avito.android.serp.adapter.l1 l1Var = c49377a.f441018a;
            boolean z13 = l1Var instanceof RecentQuerySearchItem;
            vs0.b bVar = c49377a.f441019b;
            if (z13) {
                SearchParams searchParams2 = bVar.f441021b;
                aVar.Z(searchParams2 != null ? searchParams2.getCategoryId() : null);
                InterfaceC47691c.a.b(this, ((RecentQuerySearchItem) l1Var).getF252235f().f252244b, 2);
                return;
            }
            if (!(l1Var instanceof CrossCategoryWidgetItem)) {
                if (l1Var instanceof FeedShortcutsWidgetElementItem) {
                    FeedShortcutsWidgetElementItem feedShortcutsWidgetElementItem = (FeedShortcutsWidgetElementItem) l1Var;
                    String title = feedShortcutsWidgetElementItem.getF157672d();
                    C29235n c29235n = this.f112947R;
                    if (c29235n == null || (lVarA2 = c29235n.f112645M.a()) == null || (empty2 = lVarA2.f112345l) == null) {
                        empty2 = SearchParams.INSTANCE.getEMPTY();
                    }
                    aVar.a(title, empty2, String.valueOf(feedShortcutsWidgetElementItem.getF157674f()), bVar.f441020a);
                    InterfaceC47691c.a.b(this, feedShortcutsWidgetElementItem.getF157671c(), 2);
                    return;
                }
                return;
            }
            Integer num2 = bVar.f441020a;
            CrossCategoryWidgetItem crossCategoryWidgetItem = (CrossCategoryWidgetItem) l1Var;
            String f131045d = crossCategoryWidgetItem.getF131045d();
            AnalyticParams f131048g = crossCategoryWidgetItem.getF131048g();
            Integer cId = f131048g != null ? f131048g.getCId() : null;
            AnalyticParams f131048g2 = crossCategoryWidgetItem.getF131048g();
            this.f112931B.Q(num2, cId, f131048g2 != null ? f131048g2.getCrossCategoryId() : null, f131045d, bVar.f441022c);
            com.avito.android.cross_category.Action f131046e = crossCategoryWidgetItem.getF131046e();
            if (f131046e == null || (deeplink = f131046e.getDeeplink()) == null) {
                return;
            }
            InterfaceC47691c.a.b(this, deeplink, 2);
            return;
        }
        if (fVar instanceof vs0.c) {
            vs0.c cVar = (vs0.c) fVar;
            com.avito.android.serp.adapter.l1 l1Var2 = cVar.f441023a;
            if (l1Var2 instanceof RecentQuerySearchItem) {
                vs0.b bVar2 = cVar.f441024b;
                SearchParams searchParams3 = bVar2.f441021b;
                aVar.p(searchParams3 != null ? searchParams3.getCategoryId() : null);
                if (!(l1Var2 instanceof RecentQuerySearchItem) || (num = bVar2.f441020a) == null) {
                    return;
                }
                int iIntValue = num.intValue();
                C29235n c29235n2 = this.f112947R;
                if (c29235n2 != null) {
                    RecentQuerySearchItem recentQuerySearchItem = (RecentQuerySearchItem) l1Var2;
                    com.avito.android.bxcontent.mvi.entity.l lVarA3 = c29235n2.f112645M.a();
                    if (lVarA3 != null && (searchParams = lVarA3.f112345l) != null) {
                        categoryId = searchParams.getCategoryId();
                    }
                    c29235n2.accept(new InterfaceC29127b.C29146j0(recentQuerySearchItem, iIntValue, categoryId));
                    return;
                }
                return;
            }
            return;
        }
        if (fVar instanceof vs0.h) {
            vs0.h hVar = (vs0.h) fVar;
            com.avito.android.serp.adapter.l1 l1Var3 = hVar.f441025a;
            if (l1Var3 instanceof RecentQuerySearchItem) {
                aVar.D();
                return;
            }
            if (l1Var3 instanceof CrossCategoryWidgetItem) {
                vs0.b bVar3 = hVar.f441026b;
                Integer num3 = bVar3.f441020a;
                CrossCategoryWidgetItem crossCategoryWidgetItem2 = (CrossCategoryWidgetItem) l1Var3;
                String f131045d2 = crossCategoryWidgetItem2.getF131045d();
                AnalyticParams f131048g3 = crossCategoryWidgetItem2.getF131048g();
                Integer cId2 = f131048g3 != null ? f131048g3.getCId() : null;
                AnalyticParams f131048g4 = crossCategoryWidgetItem2.getF131048g();
                this.f112931B.m(num3, cId2, f131048g4 != null ? f131048g4.getCrossCategoryId() : null, f131045d2, bVar3.f441022c);
                return;
            }
            if (l1Var3 instanceof FeedShortcutsWidgetItem) {
                C29235n c29235n3 = this.f112947R;
                if (c29235n3 == null || (lVarA = c29235n3.f112645M.a()) == null || (empty = lVarA.f112345l) == null) {
                    empty = SearchParams.INSTANCE.getEMPTY();
                }
                List<FeedShortcutsWidgetElementItem> items = ((FeedShortcutsWidgetItem) l1Var3).getItems();
                ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeedShortcutsWidgetElementItem) it.next()).getF157672d());
                }
                aVar.y(empty, arrayList, true);
            }
        }
    }

    @Override // com.avito.android.bxcontent.InterfaceC29247r0
    public final void v30() {
        O(this.f112948S);
    }

    @Override // com.avito.android.serp.adapter.warning.e
    public final void x(@Y61.k SerpWarningItem serpWarningItem) {
        C29235n c29235n = this.f112947R;
        if (c29235n != null) {
            c29235n.accept(new InterfaceC29127b.C29160t(serpWarningItem));
        }
    }

    @Override // com.avito.android.serp.adapter.constructor.q
    public final void y(@Y61.k DeepLink deepLink, @Y61.k String str) {
        W(str, deepLink, ContactSource.f89921f, null, null);
    }

    @Override // com.avito.android.serp.adapter.search_bar.InterfaceC34825d
    public final void z() {
        com.avito.android.map.mvi.entity.a aVarB;
        a.C5436a c5436a;
        com.avito.android.bxcontent.mvi.entity.l lVarA;
        com.avito.android.map.mvi.entity.a aVarB2;
        Integer num;
        com.avito.android.bxcontent.mvi.entity.l lVarA2;
        PresentationType presentationType;
        C29235n c29235n = this.f112947R;
        boolean z12 = false;
        boolean zIsFullMap = (c29235n == null || (lVarA2 = c29235n.f112645M.a()) == null || (presentationType = lVarA2.f112306I) == null) ? false : presentationType.isFullMap();
        C29235n c29235n2 = this.f112947R;
        boolean z13 = (c29235n2 == null || (aVarB2 = c29235n2.f112645M.b()) == null || (num = aVarB2.f185147A) == null || num.intValue() != 1) ? false : true;
        C29235n c29235n3 = this.f112947R;
        boolean z14 = (c29235n3 == null || (lVarA = c29235n3.f112645M.a()) == null || lVarA.f112309L != 3) ? false : true;
        C29235n c29235n4 = this.f112947R;
        C42822w c42822w = null;
        boolean zF2 = kotlin.jvm.internal.L.f((c29235n4 == null || (aVarB = c29235n4.f112645M.b()) == null || (c5436a = aVarB.f185164o) == null) ? null : c5436a.f185183h, HiddenParameter.TYPE);
        if (zIsFullMap && z13 && z14) {
            C29235n c29235n5 = this.f112947R;
            if (c29235n5 != null) {
                c29235n5.accept(new InterfaceC29127b.C29147k(4, z12, 2, c42822w));
                return;
            }
            return;
        }
        if (zIsFullMap && z13 && !zF2) {
            C29235n c29235n6 = this.f112947R;
            if (c29235n6 != null) {
                c29235n6.accept(new InterfaceC25585b.v(HiddenParameter.TYPE));
                return;
            }
            return;
        }
        C29235n c29235n7 = this.f112947R;
        if (c29235n7 != null) {
            c29235n7.accept(new InterfaceC29127b.E(true));
        }
        C29235n c29235n8 = this.f112947R;
        if (c29235n8 != null) {
            c29235n8.accept(new InterfaceC29127b.C29139g(true));
        }
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }
}

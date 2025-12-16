package com.avito.android.profile.user_profile.mvi;

import SK0.b;
import Ua0.InterfaceC15503a;
import android.net.Uri;
import android.os.Bundle;
import cK.InterfaceC27058a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.analytics.event.C28418h0;
import com.avito.android.analytics.event.C28426l0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.UserRatingDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NotificationCenterLink;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import com.avito.android.deep_linking.links.auth.PasswordSettingLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.deeplinks.PhonesListLink;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.profile.PhotoPickerContract;
import com.avito.android.profile.user_profile.CardToOpenFromProfile;
import com.avito.android.profile.user_profile.analytics.ProfileWidgetClickEvent;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.recommendations.a;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.promoblock.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.Sharing;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.InfoItem;
import com.avito.android.remote.model.user_profile.items.PromoBanner;
import com.avito.android.remote.model.user_profile.items.PromotionsItem;
import com.avito.android.safety.deeplink.SafetySettingsLink;
import com.avito.android.social.InterfaceC35025q;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import fv.C40482a;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43202t0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import kv.C43501a;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: UserProfileActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUa0/a;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.user_profile.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33388a implements com.avito.android.arch.mvi.a<InterfaceC15503a, UserProfileInternalAction, UserProfileState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CardToOpenFromProfile f226281a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.j f226282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.counter.f f226283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27058a f226284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport_lib.h f226285e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.active_orders.j f226286f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final NL.a f226287g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.u f226288h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f226289i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f226290j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f226291k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f226292l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35025q f226293m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_ux_feedback.b f226294n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final s90.e f226295o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f226296p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final R0 f226297q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final gD.f f226298r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.wallet.m f226299s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.cards.wallet.d f226300t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction> f226301u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.uxf.b f226302v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Bw0.i f226303w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C43238h f226304x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f226305y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f226306z;

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/a$a;", "", "a", "b", "Lcom/avito/android/profile/user_profile/mvi/a$a$a;", "Lcom/avito/android/profile/user_profile/mvi/a$a$b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC6868a {

        /* compiled from: UserProfileActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/a$a$a;", "Lcom/avito/android/profile/user_profile/mvi/a$a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.user_profile.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6869a implements InterfaceC6868a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6869a f226307a = new C6869a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6869a);
            }

            public final int hashCode() {
                return -132362836;
            }

            @Y61.k
            public final String toString() {
                return "Latest";
            }
        }

        /* compiled from: UserProfileActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/a$a$b;", "Lcom/avito/android/profile/user_profile/mvi/a$a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.user_profile.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC6868a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f226308a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 689507699;
            }

            @Y61.k
            public final String toString() {
                return "Merge";
            }
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardDeeplink$1", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226309q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeepLink f226310r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeepLink deepLink, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226309q = c33388a;
            this.f226310r = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f226310r, this.f226309q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C33388a c33388a = this.f226309q;
            c33388a.f226296p.c(new N90.m());
            b.a.a(c33388a.f226289i, this.f226310r, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardDeeplink$2", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226311q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeepLink f226312r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeepLink deepLink, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226311q = c33388a;
            this.f226312r = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f226312r, this.f226311q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C33388a c33388a = this.f226311q;
            c33388a.f226296p.c(new N90.n());
            b.a.a(c33388a.f226289i, this.f226312r, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardDeeplink$3", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226313q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeepLink f226314r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DeepLink deepLink, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226313q = c33388a;
            this.f226314r = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(this.f226314r, this.f226313q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C33388a c33388a = this.f226313q;
            c33388a.f226296p.c(new C28418h0(null, 1, null));
            b.a.a(c33388a.f226289i, this.f226314r, "req_deep_link_user_profile", null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardDeeplink$4", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ DeepLink f226315q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33388a f226316r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DeepLink deepLink, C33388a c33388a, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f226315q = deepLink;
            this.f226316r = c33388a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new e(this.f226315q, this.f226316r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = new Bundle();
            DeepLink deepLink = this.f226315q;
            bundle.putString("safety_settings_deeplink_source_param", ((SafetySettingsLink) deepLink).f257200b);
            this.f226316r.f226289i.r6(bundle, deepLink, "req_deep_link_user_profile");
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardDeeplink$5", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$f */
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226317q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ DeepLink f226318r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DeepLink deepLink, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226317q = c33388a;
            this.f226318r = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f226318r, this.f226317q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f226317q.f226289i, this.f226318r, "req_deep_link_user_profile", null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$g */
    public static final class g implements InterfaceC43160i<C43501a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f226319b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.user_profile.mvi.a$g$a, reason: collision with other inner class name */
        public static final class C6870a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f226320b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$$inlined$filter$1$2", f = "UserProfileActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.user_profile.mvi.a$g$a$a, reason: collision with other inner class name */
            public static final class C6871a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f226321q;

                /* renamed from: r, reason: collision with root package name */
                public int f226322r;

                public C6871a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f226321q = obj;
                    this.f226322r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6870a.this.emit(null, this);
                }
            }

            public C6870a(InterfaceC43172j interfaceC43172j) {
                this.f226320b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.profile.user_profile.mvi.C33388a.g.C6870a.C6871a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.user_profile.mvi.a$g$a$a r0 = (com.avito.android.profile.user_profile.mvi.C33388a.g.C6870a.C6871a) r0
                    int r1 = r0.f226322r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f226322r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.mvi.a$g$a$a r0 = new com.avito.android.profile.user_profile.mvi.a$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f226321q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f226322r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    kv.a r6 = (kv.C43501a) r6
                    Ju.c r6 = r6.f413261b
                    boolean r6 = r6 instanceof com.avito.android.silent_update_deeplinks.permissions.d
                    if (r6 == 0) goto L48
                    r0.f226322r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f226320b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.C33388a.g.C6870a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC43160i interfaceC43160i) {
            this.f226319b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f226319b).collect(new C6870a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$$inlined$transform$1", f = "UserProfileActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$h */
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226324q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226325r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43202t0 f226326s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C33388a f226327t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226328u;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.user_profile.mvi.a$h$a, reason: collision with other inner class name */
        public static final class C6872a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<UserProfileInternalAction> f226329b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C33388a f226330c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC15503a f226331d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$$inlined$transform$1$1", f = "UserProfileActor.kt", i = {0}, l = {228, 229}, m = "emit", n = {"$this$process_u24lambda_u246"}, s = {"L$0"})
            /* renamed from: com.avito.android.profile.user_profile.mvi.a$h$a$a, reason: collision with other inner class name */
            public static final class C6873a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f226332q;

                /* renamed from: r, reason: collision with root package name */
                public int f226333r;

                /* renamed from: t, reason: collision with root package name */
                public InterfaceC43172j f226335t;

                public C6873a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f226332q = obj;
                    this.f226333r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6872a.this.emit(null, this);
                }
            }

            public C6872a(InterfaceC43172j interfaceC43172j, C33388a c33388a, InterfaceC15503a interfaceC15503a) {
                this.f226330c = c33388a;
                this.f226331d = interfaceC15503a;
                this.f226329b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.avito.android.profile.user_profile.mvi.C33388a.h.C6872a.C6873a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.avito.android.profile.user_profile.mvi.a$h$a$a r0 = (com.avito.android.profile.user_profile.mvi.C33388a.h.C6872a.C6873a) r0
                    int r1 = r0.f226333r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f226333r = r1
                    goto L18
                L13:
                    com.avito.android.profile.user_profile.mvi.a$h$a$a r0 = new com.avito.android.profile.user_profile.mvi.a$h$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f226332q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f226333r
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r5) goto L36
                    if (r2 != r4) goto L2e
                    kotlin.C42729a0.b(r11)
                    goto La5
                L2e:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L36:
                    kotlinx.coroutines.flow.j r10 = r0.f226335t
                    kotlin.C42729a0.b(r11)
                    goto L8a
                L3c:
                    kotlin.C42729a0.b(r11)
                    kv.a r10 = (kv.C43501a) r10
                    Ju.c r10 = r10.f413261b
                    boolean r11 = r10 instanceof com.avito.android.silent_update_deeplinks.permissions.d.b
                    r2 = 6
                    com.avito.android.profile.user_profile.mvi.a r6 = r9.f226330c
                    if (r11 == 0) goto L97
                    com.avito.android.silent_update_deeplinks.permissions.d$b r10 = (com.avito.android.silent_update_deeplinks.permissions.d.b) r10
                    com.avito.android.silent_update.permissions.SilentUpdatePermissions r10 = r10.f283754b
                    boolean r11 = r10.f283694b
                    if (r11 == 0) goto L97
                    boolean r11 = r10.f283696d
                    if (r11 == 0) goto L97
                    boolean r10 = r10.f283695c
                    if (r10 == 0) goto L97
                    Bw0.i r10 = r6.f226303w
                    Ua0.a r11 = r9.f226331d
                    Ua0.a$c r11 = (Ua0.InterfaceC15503a.c) r11
                    com.avito.android.silent_update.DownloadUpdateConfig$OneTimeDownloadRequest r7 = r11.f16450a
                    java.lang.String r8 = "profile"
                    r10.a(r7, r8, r3)
                    com.avito.android.silent_update.DownloadUpdateConfig$PeriodicDownloadRequest r10 = r11.f16451b
                    Bw0.i r7 = r6.f226303w
                    r7.a(r10, r8, r3)
                    com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink r10 = r11.f16452c
                    com.avito.android.deeplink_handler.handler.composite.a r6 = r6.f226289i
                    com.avito.android.deeplink_handler.handler.b.a.a(r6, r10, r3, r3, r2)
                    com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$ShowToastBar r10 = new com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$ShowToastBar
                    java.lang.String r11 = r11.f16453d
                    r10.<init>(r11)
                    kotlinx.coroutines.flow.j<com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction> r11 = r9.f226329b
                    r0.f226335t = r11
                    r0.f226333r = r5
                    java.lang.Object r10 = r11.emit(r10, r0)
                    if (r10 != r1) goto L89
                    return r1
                L89:
                    r10 = r11
                L8a:
                    com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$HideSilentUpdateBanner r11 = com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction.HideSilentUpdateBanner.f226426b
                    r0.f226335t = r3
                    r0.f226333r = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto La5
                    return r1
                L97:
                    com.avito.android.deeplink_handler.handler.composite.a r10 = r6.f226289i
                    com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink r11 = new com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink
                    java.lang.String r0 = "1948"
                    java.lang.String r1 = "fit"
                    r11.<init>(r0, r3, r1, r3)
                    com.avito.android.deeplink_handler.handler.b.a.a(r10, r11, r3, r3, r2)
                La5:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.C33388a.h.C6872a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C43202t0 c43202t0, Continuation continuation, C33388a c33388a, InterfaceC15503a interfaceC15503a) {
            super(2, continuation);
            this.f226326s = c43202t0;
            this.f226327t = c33388a;
            this.f226328u = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f226326s, continuation, this.f226327t, this.f226328u);
            hVar.f226325r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226324q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C6872a c6872a = new C6872a((InterfaceC43172j) this.f226325r, this.f226327t, this.f226328u);
                this.f226324q = 1;
                if (this.f226326s.collect(c6872a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$10", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$i */
    public static final class i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f226336q;

        public i() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            i iVar = new i(3, continuation);
            iVar.f226336q = th2;
            return iVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("Failed to hide suggested address", this.f226336q);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$11", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$j */
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226337q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33388a f226338r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f226337q = interfaceC15503a;
            this.f226338r = c33388a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new j(this.f226337q, this.f226338r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (kotlin.jvm.internal.L.f(((InterfaceC15503a.s) this.f226337q).f16468a, a.C6833a.f225280a)) {
                this.f226338r.f226296p.c(new N90.l());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$12", f = "UserProfileActor.kt", i = {0}, l = {263, 264}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$k */
    public static final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226339q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226340r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C33388a f226341s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226342t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226341s = c33388a;
            this.f226342t = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            k kVar = new k(this.f226342t, this.f226341s, continuation);
            kVar.f226340r = obj;
            return kVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226339q;
            C33388a c33388a = this.f226341s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f226340r;
                com.avito.android.profile.user_profile.j jVar = c33388a.f226282b;
                Uri uri = ((InterfaceC15503a.g) this.f226342t).f16457a;
                this.f226340r = interfaceC43172j;
                this.f226339q = 1;
                if (jVar.d(uri, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f226340r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iD = C33388a.d(c33388a, 3);
            this.f226340r = null;
            this.f226339q = 2;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$13", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$l */
    public static final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f226343q;

        public l() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            l lVar = new l(3, continuation);
            lVar.f226343q = th2;
            return lVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("Failed to upload avatar", this.f226343q);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$14", f = "UserProfileActor.kt", i = {0}, l = {269, 270}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$m */
    public static final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226344q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226345r;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = C33388a.this.new m(continuation);
            mVar.f226345r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226344q;
            C33388a c33388a = C33388a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f226345r;
                com.avito.android.profile.user_profile.j jVar = c33388a.f226282b;
                this.f226345r = interfaceC43172j;
                this.f226344q = 1;
                if (jVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f226345r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iD = C33388a.d(c33388a, 3);
            this.f226345r = null;
            this.f226344q = 2;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$15", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$n */
    public static final class n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f226347q;

        public n() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            n nVar = new n(3, continuation);
            nVar.f226347q = th2;
            return nVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("Failed to delete avatar", this.f226347q);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$19", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$o */
    public static final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226348q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33388a f226349r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f226348q = interfaceC15503a;
            this.f226349r = c33388a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new o(this.f226348q, this.f226349r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC15503a.C1130a c1130a = (InterfaceC15503a.C1130a) this.f226348q;
            boolean z12 = c1130a.f16448b;
            C33388a c33388a = this.f226349r;
            if (z12) {
                b.a.a(c33388a.f226289i, c1130a.f16447a, "req_deep_link_user_profile", null, 4);
            } else {
                b.a.a(c33388a.f226289i, c1130a.f16447a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$21", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$p */
    public static final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226350q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226351r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226350q = c33388a;
            this.f226351r = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new p(this.f226351r, this.f226350q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f226350q.f226289i, ((InterfaceC15503a.h) this.f226351r).f16458a, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$22", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$q */
    public static final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226352q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226353r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226352q = c33388a;
            this.f226353r = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new q(this.f226353r, this.f226352q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f226352q.f226289i, ((InterfaceC15503a.i) this.f226353r).f16459a, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$3", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$r */
    public static final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {
        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C33388a.this.new r(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C33388a c33388a = C33388a.this;
            gD.f fVar = c33388a.f226298r;
            fVar.getClass();
            kotlin.reflect.n<Object> nVar = gD.f.f396389r[13];
            boolean zBooleanValue = ((Boolean) fVar.f396402n.a().invoke()).booleanValue();
            com.avito.android.account.E e12 = c33388a.f226292l;
            if (zBooleanValue) {
                boolean zB2 = e12.b();
                com.avito.android.profile.user_profile.uxf.b bVar = c33388a.f226302v;
                bVar.getClass();
                com.avito.android.profile.user_profile.uxf.a aVar = new com.avito.android.profile.user_profile.uxf.a();
                SK0.a aVar2 = new SK0.a();
                aVar2.f14901b.put("is_auth", Boolean.valueOf(zB2));
                G0 g02 = G0.f406611a;
                b.a.a(bVar.f226594a, aVar, aVar2, null, null, 12);
            }
            String strA = e12.a();
            if (strA != null) {
                c33388a.f226296p.c(new N90.o(strA));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$4", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$s */
    public static final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {
        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C33388a.this.new s(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Q0.d(C33388a.this.f226304x.f411905b);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$6", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$t */
    public static final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226356q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserProfileState f226357r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C33388a f226358s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC15503a interfaceC15503a, UserProfileState userProfileState, C33388a c33388a, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f226356q = interfaceC15503a;
            this.f226357r = userProfileState;
            this.f226358s = c33388a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new t(this.f226356q, this.f226357r, this.f226358s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            UserProfileState.VisibleData visibleData;
            Map<String, String> map;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            DeepLink userRatingDetailsLink = ((InterfaceC15503a.l) this.f226356q).f16462a;
            boolean z12 = userRatingDetailsLink instanceof UserRatingDetailsLink;
            C33388a c33388a = this.f226358s;
            if (z12 && (visibleData = this.f226357r.f226450c) != null && (map = visibleData.f226468f) != null && (str = map.get("rating")) != null) {
                c33388a.f226296p.c(new Uc.h(str, null, null, null, null, 30, null));
                userRatingDetailsLink = new UserRatingDetailsLink(str);
            }
            b.a.a(c33388a.f226289i, userRatingDetailsLink, "req_deep_link_user_profile", null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$7", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$u */
    public static final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226359q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226360r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226359q = c33388a;
            this.f226360r = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new u(this.f226360r, this.f226359q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f226359q.f226289i, ((InterfaceC15503a.p) this.f226360r).f16465a, "req_deep_link_user_profile", null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$8", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$v */
    public static final class v extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C33388a f226361q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226362r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226361q = c33388a;
            this.f226362r = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new v(this.f226362r, this.f226361q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((v) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.a(this.f226361q.f226289i, ((InterfaceC15503a.e) this.f226362r).f16455a, "req_user_address", null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$9", f = "UserProfileActor.kt", i = {}, l = {242, 243}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile.user_profile.mvi.a$w */
    public static final class w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226363q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226364r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C33388a f226365s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15503a f226366t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC15503a interfaceC15503a, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226365s = c33388a;
            this.f226366t = interfaceC15503a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            w wVar = new w(this.f226366t, this.f226365s, continuation);
            wVar.f226364r = obj;
            return wVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((w) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226363q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f226364r;
                UserProfileInternalAction.HideSuggestedAddress hideSuggestedAddress = UserProfileInternalAction.HideSuggestedAddress.f226427b;
                this.f226363q = 1;
                if (interfaceC43172j.emit(hideSuggestedAddress, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            com.avito.android.profile.user_profile.j jVar = this.f226365s.f226282b;
            InterfaceC15503a.m mVar = (InterfaceC15503a.m) this.f226366t;
            mVar.getClass();
            mVar.getClass();
            this.f226363q = 2;
            if (jVar.f(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C33388a(@Y61.k CardToOpenFromProfile cardToOpenFromProfile, @Y61.k com.avito.android.profile.user_profile.j jVar, @Y61.k com.avito.android.notification_center.counter.f fVar, @Y61.k InterfaceC27058a interfaceC27058a, @Y61.k com.avito.android.passport_lib.h hVar, @Y61.k com.avito.android.profile.user_profile.cards.active_orders.j jVar2, @Y61.k NL.a aVar, @Y61.k com.avito.android.profile.user_profile.u uVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k com.avito.android.account.G g12, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC35025q interfaceC35025q, @Y61.k com.avito.android.rating_ux_feedback.b bVar, @Y61.k s90.e eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k gD.f fVar2, @Y61.k com.avito.android.profile.user_profile.cards.wallet.m mVar, @Y61.k com.avito.android.profile.user_profile.cards.wallet.d dVar, @Y61.k AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction> abstractC33302a, @Y61.k com.avito.android.profile.user_profile.uxf.b bVar2, @Y61.k Bw0.i iVar) {
        this.f226281a = cardToOpenFromProfile;
        this.f226282b = jVar;
        this.f226283c = fVar;
        this.f226284d = interfaceC27058a;
        this.f226285e = hVar;
        this.f226286f = jVar2;
        this.f226287g = aVar;
        this.f226288h = uVar;
        this.f226289i = aVar2;
        this.f226290j = interfaceC27663a;
        this.f226291k = g12;
        this.f226292l = e12;
        this.f226293m = interfaceC35025q;
        this.f226294n = bVar;
        this.f226295o = eVar;
        this.f226296p = interfaceC28373a;
        this.f226297q = r02;
        this.f226298r = fVar2;
        this.f226299s = mVar;
        this.f226300t = dVar;
        this.f226301u = abstractC33302a;
        this.f226302v = bVar2;
        this.f226303w = iVar;
        this.f226304x = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f226306z = interfaceC27058a.a().getValue().intValue();
    }

    public static InterfaceC43160i d(C33388a c33388a, int i12) {
        boolean z12 = (i12 & 1) == 0;
        boolean z13 = (i12 & 2) == 0;
        c33388a.getClass();
        return C43175k.G(new I(c33388a, z13, z12, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(d(this, 1), C43175k.Y(C43175k.r(C43175k.t(kotlinx.coroutines.rx3.y.a(this.f226291k.getF68056k()), 1)), new P(this, null)), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f226289i.d9()), new C33392e(this, null)), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f226285e.getF213925b()), new N(this, null)), C43175k.Y(this.f226284d.a(), new C33391d(this, null)), new C43152f0(new Y(this.f226286f.getF224680K()), new Z(3, null)), new C43152f0(new J(kotlinx.coroutines.rx3.y.a(this.f226283c.getCount())), new K(3, null)), C43175k.Y(C43175k.r(kotlinx.coroutines.rx3.y.a(this.f226287g.getF168320d())), new H(this, null)), new C43152f0(new a0(this.f226299s.getF225787L()), new b0(3, null)), new C43152f0(new C33389b(this.f226300t.getF225651L()), new C33390c(3, null)), C43175k.C(new M(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, L.f226237l)));
    }

    public final InterfaceC43160i<UserProfileInternalAction> c(DeepLink deepLink) {
        return deepLink instanceof PasswordChangeLink ? C43175k.G(new b(deepLink, this, null)) : deepLink instanceof PasswordSettingLink ? C43175k.G(new c(deepLink, this, null)) : deepLink instanceof W40.c ? C43175k.G(new d(deepLink, this, null)) : deepLink instanceof SafetySettingsLink ? C43175k.G(new e(deepLink, this, null)) : C43175k.G(new f(deepLink, this, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UserProfileInternalAction> b(@Y61.k InterfaceC15503a interfaceC15503a, @Y61.k UserProfileState userProfileState) {
        C43210w c43210w;
        UserProfileState.VisibleData.HeaderState headerState;
        Sharing sharing;
        Map<String, String> map;
        String str;
        UserProfileState.VisibleData.HeaderState headerState2;
        InterfaceC43160i<UserProfileInternalAction> interfaceC43160iW;
        C43152f0 c43152f0;
        DeepLink f229144f;
        String str2;
        UserProfileResult userProfileResult;
        InfoItem info;
        String id2;
        String strA;
        if (interfaceC15503a instanceof InterfaceC15503a.d) {
            return d(this, 3);
        }
        if (interfaceC15503a instanceof InterfaceC15503a.x) {
            return d(this, 2);
        }
        if (interfaceC15503a instanceof InterfaceC15503a.t) {
            return C43175k.G(new r(null));
        }
        if (interfaceC15503a instanceof InterfaceC15503a.q) {
            return C43175k.G(new s(null));
        }
        if (interfaceC15503a instanceof InterfaceC15503a.o) {
            c43210w = new C43210w(UserProfileInternalAction.OpenLoginScreen.f226433b);
        } else {
            boolean z12 = interfaceC15503a instanceof InterfaceC15503a.k;
            com.avito.android.account.E e12 = this.f226292l;
            InterfaceC28373a interfaceC28373a = this.f226296p;
            if (!z12) {
                if (interfaceC15503a instanceof InterfaceC15503a.l) {
                    return C43175k.G(new t(interfaceC15503a, userProfileState, this, null));
                }
                if (interfaceC15503a instanceof InterfaceC15503a.p) {
                    return C43175k.G(new u(interfaceC15503a, this, null));
                }
                if (interfaceC15503a instanceof InterfaceC15503a.j) {
                    return c(((InterfaceC15503a.j) interfaceC15503a).f16460a);
                }
                if (interfaceC15503a instanceof InterfaceC15503a.e) {
                    return C43175k.G(new v(interfaceC15503a, this, null));
                }
                boolean z13 = interfaceC15503a instanceof InterfaceC15503a.m;
                R0 r02 = this.f226297q;
                if (z13) {
                    c43152f0 = new C43152f0(C43175k.I(r02.a(), C43175k.G(new w(interfaceC15503a, this, null))), new i(3, null));
                } else {
                    boolean z14 = interfaceC15503a instanceof InterfaceC15503a.y;
                    com.avito.android.deeplink_handler.handler.composite.a aVar = this.f226289i;
                    if (z14) {
                        com.avito.android.promoblock.a aVar2 = ((InterfaceC15503a.y) interfaceC15503a).f16474a;
                        boolean z15 = aVar2 instanceof a.C7060a;
                        if (z15) {
                            f229144f = ((a.C7060a) aVar2).f231773b.getF229144f();
                        } else if (aVar2 instanceof a.d) {
                            f229144f = ((a.d) aVar2).f231775b.getF229144f();
                        } else if (aVar2 instanceof a.c) {
                            f229144f = ((a.c) aVar2).f231774b;
                        } else {
                            if (!(aVar2 instanceof a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f229144f = null;
                        }
                        if (f229144f instanceof PhonesListLink) {
                            b.a.a(aVar, f229144f, null, null, 6);
                        } else if (f229144f != null) {
                            b.a.a(aVar, f229144f, "req_deep_link_user_profile", null, 4);
                        }
                        if (aVar2 instanceof a.c ? true : z15) {
                            str2 = "go_to_page";
                        } else if (aVar2 instanceof a.d) {
                            str2 = "go_to_page_secondary";
                        } else {
                            if (!(aVar2 instanceof a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str2 = "close";
                        }
                        String str3 = str2;
                        String strA2 = e12.a();
                        String str4 = strA2 == null ? "" : strA2;
                        TnsPromoBlockItem tnsPromoBlockItem = aVar2.f231772a;
                        CardItem.PromoBlockItem promoBlockItem = tnsPromoBlockItem instanceof CardItem.PromoBlockItem ? (CardItem.PromoBlockItem) tnsPromoBlockItem : null;
                        String str5 = promoBlockItem != null ? promoBlockItem.f224510n : null;
                        interfaceC28373a.c(new BannerEvent.b(tnsPromoBlockItem.getF85287c(), str5 == null ? "" : str5, str3, "", str4));
                        TnsPromoBlockItem tnsPromoBlockItem2 = aVar2.f231772a;
                        CardItem.PromoBlockItem promoBlockItem2 = tnsPromoBlockItem2 instanceof CardItem.PromoBlockItem ? (CardItem.PromoBlockItem) tnsPromoBlockItem2 : null;
                        if (promoBlockItem2 != null) {
                            InterfaceC43160i<UserProfileInternalAction> interfaceC43160iI = C43175k.I(r02.a(), C43175k.G(new G(promoBlockItem2, this, null)));
                            if (interfaceC43160iI != null) {
                                return interfaceC43160iI;
                            }
                        }
                        return C43175k.w();
                    }
                    if (interfaceC15503a instanceof InterfaceC15503a.w) {
                        return C43175k.G(new F(((InterfaceC15503a.w) interfaceC15503a).f16472a, this, null));
                    }
                    if (interfaceC15503a instanceof InterfaceC15503a.s) {
                        return C43175k.G(new j(interfaceC15503a, this, null));
                    }
                    boolean z16 = interfaceC15503a instanceof InterfaceC15503a.v;
                    UserProfileState.VisibleData visibleData = userProfileState.f226450c;
                    if (z16) {
                        return new C43210w(new UserProfileInternalAction.OpenPhotoPicker((visibleData != null ? visibleData.f226467e : null) == AvatarShape.SQUARE ? PhotoPickerContract.Args.Type.f221879c : PhotoPickerContract.Args.Type.f221878b));
                    }
                    if (interfaceC15503a instanceof InterfaceC15503a.g) {
                        c43152f0 = new C43152f0(C43175k.I(r02.a(), C43175k.G(new k(interfaceC15503a, this, null))), new l(3, null));
                    } else if (interfaceC15503a instanceof InterfaceC15503a.f) {
                        c43152f0 = new C43152f0(C43175k.I(r02.a(), C43175k.G(new m(null))), new n(3, null));
                    } else {
                        if (interfaceC15503a instanceof InterfaceC15503a.n) {
                            if (visibleData != null && (headerState2 = visibleData.f226465c) != null) {
                                List<ActionMenu> list = headerState2.f226471d;
                                int size = list.size();
                                List<Action> list2 = headerState2.f226470c;
                                int size2 = size - list2.size();
                                int i12 = ((InterfaceC15503a.n) interfaceC15503a).f16463a;
                                if (i12 < size2) {
                                    ActionMenu actionMenu = list.get(i12);
                                    com.avito.android.profile.user_profile.u uVar = this.f226288h;
                                    if (kotlin.jvm.internal.L.f(actionMenu, (ActionMenu) uVar.f226590b.getValue())) {
                                        interfaceC28373a.c(new C28426l0());
                                        interfaceC43160iW = new C43210w(UserProfileInternalAction.OpenSettings.f226436b);
                                    } else if (kotlin.jvm.internal.L.f(actionMenu, (ActionMenu) uVar.f226591c.getValue())) {
                                        b.a.a(aVar, new NotificationCenterLink(), null, null, 6);
                                        interfaceC43160iW = C43175k.w();
                                    } else {
                                        interfaceC43160iW = C43175k.w();
                                    }
                                } else {
                                    b.a.a(aVar, list2.get(i12 - size2).getDeepLink(), "req_deep_link_user_profile", null, 4);
                                    interfaceC43160iW = C43175k.w();
                                }
                                if (interfaceC43160iW != null) {
                                    return interfaceC43160iW;
                                }
                            }
                            return C43175k.w();
                        }
                        if (interfaceC15503a.equals(InterfaceC15503a.u.f16470a)) {
                            if (visibleData != null && (map = visibleData.f226468f) != null && (str = map.get("sharing")) != null) {
                                interfaceC28373a.c(new yd0.d(str));
                            }
                            return (visibleData == null || (headerState = visibleData.f226465c) == null || (sharing = headerState.f226472e) == null) ? C43175k.w() : new C43210w(new UserProfileInternalAction.OpenShareDialog(sharing.getTitle(), sharing.getText()));
                        }
                        if (interfaceC15503a instanceof InterfaceC15503a.C1130a) {
                            return C43175k.G(new o(interfaceC15503a, this, null));
                        }
                        if (interfaceC15503a instanceof InterfaceC15503a.r) {
                            PromoBanner.ClickAction clickAction = ((InterfaceC15503a.r) interfaceC15503a).f16467a;
                            ParametrizedEvent event = clickAction.getEvent();
                            if (event != null) {
                                interfaceC28373a.c(com.avito.android.analytics.a0.a(event));
                            }
                            b.a.a(aVar, clickAction.getDeeplink(), null, null, 6);
                            return C43175k.w();
                        }
                        if (interfaceC15503a instanceof InterfaceC15503a.h) {
                            return C43175k.G(new p(interfaceC15503a, this, null));
                        }
                        if (interfaceC15503a instanceof InterfaceC15503a.i) {
                            return C43175k.G(new q(interfaceC15503a, this, null));
                        }
                        if (interfaceC15503a instanceof InterfaceC15503a.c) {
                            return C43175k.G(new h(C43175k.V(new g(C40482a.b(aVar)), 1), null, this, interfaceC15503a));
                        }
                        if (!(interfaceC15503a instanceof InterfaceC15503a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c43210w = new C43210w(UserProfileInternalAction.HideSilentUpdateBanner.f226426b);
                    }
                }
                return c43152f0;
            }
            CardItem cardItem = ((InterfaceC15503a.k) interfaceC15503a).f16461a;
            ProfileWidgetClickEvent.TargetPage targetPageL = cardItem.L();
            if (targetPageL != null && (strA = e12.a()) != null) {
                interfaceC28373a.c(new ProfileWidgetClickEvent(strA, targetPageL));
            }
            if (cardItem instanceof CardItem.ActionCardItem) {
                return c(((CardItem.ActionCardItem) cardItem).f224293d.getDeepLink());
            }
            if (cardItem instanceof CardItem.AdvertsCardItem) {
                c43210w = new C43210w(UserProfileInternalAction.OpenUserAdvertsScreen.f226439b);
            } else {
                if (cardItem instanceof CardItem.AutoClickableCardItem) {
                    return C43175k.G(new C33403p(cardItem, this, null));
                }
                if (cardItem instanceof CardItem.AvitoProCardItem) {
                    return c(((CardItem.AvitoProCardItem) cardItem).f224364g);
                }
                if (cardItem instanceof CardItem.CallsCardItem) {
                    return C43175k.G(new C33410x(cardItem, this, null));
                }
                if (cardItem instanceof CardItem.CallsHistoryCardItem) {
                    return C43175k.G(new C33411y(cardItem, this, null));
                }
                if (cardItem instanceof CardItem.RecommendationsItem) {
                    return C43175k.G(new C33412z(cardItem, this, null));
                }
                if (cardItem instanceof CardItem.ClickableCardItem) {
                    return c(((CardItem.ClickableCardItem) cardItem).f224379f);
                }
                if (cardItem instanceof CardItem.ContactsCardItem) {
                    return C43175k.G(new A(cardItem, this, null));
                }
                if (cardItem instanceof CardItem.EmptyAddressCardItem) {
                    return C43175k.G(new B(cardItem, this, null));
                }
                if (!(cardItem instanceof CardItem.HelpCenterCardItem)) {
                    if (cardItem instanceof CardItem.IncomeSettingsCardItem) {
                        return C43175k.G(new C(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.InfoCardItem) {
                        return C43175k.G(new D(2, null));
                    }
                    if (cardItem instanceof CardItem.LogoutCardItem) {
                        return C43175k.G(new E(this, null));
                    }
                    if (cardItem instanceof CardItem.LoyaltyPreferencesCardItem) {
                        DeepLink deepLink = ((CardItem.LoyaltyPreferencesCardItem) cardItem).f224435g.getDeepLink();
                        return deepLink != null ? c(deepLink) : C43175k.w();
                    }
                    if (cardItem instanceof CardItem.MortgageAccountCardItem) {
                        return C43175k.G(new C33396i(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.MortgageApplicationCardItem) {
                        return C43175k.G(new C33397j(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.MyGarageCardItem) {
                        return C43175k.G(new C33398k(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.OrdersCardItem) {
                        return c(((CardItem.OrdersCardItem) cardItem).f224456g);
                    }
                    if (cardItem instanceof CardItem.RfpCardItem) {
                        return c(((CardItem.RfpCardItem) cardItem).f224543g);
                    }
                    if (cardItem instanceof CardItem.SimpleCardItem) {
                        return c(((CardItem.SimpleCardItem) cardItem).f224597f);
                    }
                    if (cardItem instanceof CardItem.PhonesCardItem) {
                        return C43175k.G(new C33399l(this, null));
                    }
                    if (cardItem instanceof CardItem.PhonesEmptyCardItem) {
                        return C43175k.G(new C33400m(this, null));
                    }
                    if (cardItem instanceof CardItem.PremierPartnerCardItem) {
                        return C43175k.G(new C33401n(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.ProfileAuctionCardItem) {
                        return C43175k.G(new C33402o(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.ProfileManagementCardItem) {
                        DeepLink deepLink2 = ((CardItem.ProfileManagementCardItem) cardItem).f224487f.getDeepLink();
                        return deepLink2 != null ? c(deepLink2) : C43175k.w();
                    }
                    if (cardItem instanceof CardItem.ProfileRemovalItem) {
                        return c(((CardItem.ProfileRemovalItem) cardItem).f224491f);
                    }
                    if (cardItem instanceof CardItem.PromotionsCardItem) {
                        PromotionsItem.PromotionsAction promotionsAction = ((CardItem.PromotionsCardItem) cardItem).f224517i;
                        ParametrizedEvent event2 = promotionsAction.getEvent();
                        if (event2 != null) {
                            interfaceC28373a.c(com.avito.android.analytics.a0.a(event2));
                        }
                        return c(promotionsAction.getDeepLink());
                    }
                    if (cardItem instanceof CardItem.ReviewsCardItem) {
                        return C43175k.G(new C33404q(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.SbcDispatchesCardItem) {
                        return C43175k.G(new com.avito.android.profile.user_profile.mvi.r(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.SafeDealSettingsCardItem) {
                        return C43175k.G(new C33405s(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.SeparateWalletCardItem) {
                        return C43175k.G(new C33406t(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.SessionsCardItem) {
                        DeepLink deepLink3 = ((CardItem.SessionsCardItem) cardItem).f224575f;
                        return deepLink3 != null ? c(deepLink3) : C43175k.w();
                    }
                    if (cardItem instanceof CardItem.SocialCardItem) {
                        return C43175k.G(new C33407u(this, null));
                    }
                    if (cardItem instanceof CardItem.StrOrdersCardItem) {
                        return c(((CardItem.StrOrdersCardItem) cardItem).f224608g);
                    }
                    if (cardItem instanceof CardItem.AutotekaPurchaseDataCardItem) {
                        return c(((CardItem.AutotekaPurchaseDataCardItem) cardItem).f224326g);
                    }
                    if (cardItem instanceof CardItem.TariffCardItem) {
                        return C43175k.G(new C33408v(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.WalletCardItem) {
                        return C43175k.G(new C33409w(cardItem, this, null));
                    }
                    if (cardItem instanceof CardItem.WithButtonCardItem) {
                        return c(((CardItem.WithButtonCardItem) cardItem).f224630h);
                    }
                    if (cardItem instanceof CardItem.SilentUpdateItem ? true : cardItem instanceof CardItem.ActiveOrdersWidgetCardItem ? true : cardItem instanceof CardItem.ReferralCardItem ? true : cardItem instanceof CardItem.AddressCardItem ? true : cardItem instanceof CardItem.ExtensionsCardItem ? true : cardItem instanceof CardItem.ServiceBookingCardItem ? true : cardItem instanceof CardItem.PromoBlockItem ? true : cardItem instanceof CardItem.PassportCardItem ? true : cardItem instanceof CardItem.AvitoFinanceSimpleCardItem ? true : cardItem instanceof CardItem.AvitoFinanceSplitBonusesCardItem ? true : cardItem instanceof CardItem.AvitoFinanceSplitInstallmentsCardItem ? true : cardItem instanceof CardItem.AvitoFinanceDynamicCardItem ? true : cardItem instanceof CardItem.PromoBanner) {
                        return C43175k.w();
                    }
                    if (cardItem instanceof CardItem.SafetyCardItem) {
                        return c(((CardItem.SafetyCardItem) cardItem).f224551f);
                    }
                    if (cardItem instanceof CardItem.LeasingEntryPointItem) {
                        return c(((CardItem.LeasingEntryPointItem) cardItem).f224429f);
                    }
                    if (cardItem instanceof CardItem.SpecialMachineryRentalItem) {
                        return c(((CardItem.SpecialMachineryRentalItem) cardItem).f224603f);
                    }
                    if (cardItem instanceof CardItem.ComfortableDealCardItem) {
                        interfaceC28373a.c(new N90.j());
                        return c(((CardItem.ComfortableDealCardItem) cardItem).f224383f);
                    }
                    if (cardItem instanceof CardItem.ComfortableDealWithStatusCardItem) {
                        return c(((CardItem.ComfortableDealWithStatusCardItem) cardItem).f224386e);
                    }
                    if (cardItem instanceof CardItem.RewardsCardItem) {
                        return c(((CardItem.RewardsCardItem) cardItem).f224537g);
                    }
                    if (cardItem instanceof CardItem.ServicesSellerSubscriptionCardItem) {
                        return c(((CardItem.ServicesSellerSubscriptionCardItem) cardItem).f224571h.getDeepLink());
                    }
                    if (cardItem instanceof CardItem.ProfileJobMenuCardItem) {
                        return c(((CardItem.ProfileJobMenuCardItem) cardItem).f224481g);
                    }
                    if (!(cardItem instanceof CardItem.AutoSubscribeItem)) {
                        if (cardItem instanceof CardItem.VirtualDealRoomCardItem) {
                            DeepLink deepLink4 = ((CardItem.VirtualDealRoomCardItem) cardItem).f224619f.getDeepLink();
                            return deepLink4 != null ? c(deepLink4) : C43175k.w();
                        }
                        if (cardItem instanceof CardItem.NdTrxDealCabinetCardItem) {
                            return c(((CardItem.NdTrxDealCabinetCardItem) cardItem).f224451f);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    UserProfileState.Data data = userProfileState.f226449b;
                    if (data != null && (userProfileResult = data.f226456c) != null && (info = userProfileResult.getInfo()) != null && (id2 = info.getId()) != null) {
                        interfaceC28373a.c(new N90.a(Integer.parseInt(id2)));
                    }
                    return c(((CardItem.AutoSubscribeItem) cardItem).f224321g);
                }
                c43210w = new C43210w(new UserProfileInternalAction.OpenHelpCenter(null, 1, null));
            }
        }
        return c43210w;
    }
}

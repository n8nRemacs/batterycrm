package com.avito.android.profile.user_profile;

import Cd.C13243a;
import Ua0.InterfaceC15503a;
import Zd.InterfaceC19542a;
import ak.C19902a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.X0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.profile.PhotoPickerContract;
import com.avito.android.profile.SelectAvatarActionDialog;
import com.avito.android.profile.user_profile.D;
import com.avito.android.profile.user_profile.di.C33370a;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import nI0.InterfaceC44261b;
import z1.AbstractC50339a;

/* compiled from: UserProfileFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/user_profile/UserProfileFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/profile/SelectAvatarActionDialog$Listener;", "Lcom/avito/android/profile/user_profile/D$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserProfileFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.l, SelectAvatarActionDialog.Listener, D.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public A30.b f224214A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public L f224215B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.bottom_navigation.space.a f224216C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f224217D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_settings.b f224218E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public gD.f f224219F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f224220G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f224221H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f224222I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.active_orders_common.items.order.f f224223J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.active_orders_common.items.all_orders.f f224224K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.c f224225L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.user_profile.cards.service_booking.items.order.c f224226M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public l90.c f224227N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.user_profile.cards.o f224228O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public InterfaceC43160i<com.avito.android.promoblock.a> f224229P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public InterfaceC43160i<com.avito.android.component.user_hat.e> f224230Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.user_profile.uxf.f f224231R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.l
    public D f224232S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f224233T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<AvatarShape> f224234U0;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<PhotoPickerContract.Args> f224235V0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public x f224236t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f224237u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f224238v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public l90.o f224239w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f224240x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f224241y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.settings.b f224242z0;

    /* compiled from: UserProfileFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224243a;

        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f224243a = iArr;
            int[] iArr2 = new int[SelectAvatarActionDialog.Listener.Action.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SelectAvatarActionDialog.Listener.Action action = SelectAvatarActionDialog.Listener.Action.f221882b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/profile/user_profile/UserProfileFragment$b", "Li/a;", "Lcom/avito/android/remote/model/AvatarShape;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC41201a<AvatarShape, Boolean> {
        public b() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, AvatarShape avatarShape) {
            AvatarShape avatarShape2 = avatarShape;
            l90.o oVar = UserProfileFragment.this.f224239w0;
            if (oVar == null) {
                oVar = null;
            }
            Intent intentC = oVar.c();
            intentC.putExtra("avatar_shape_type", String.valueOf(avatarShape2));
            return intentC;
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 == -1);
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile/user_profile/UserProfileFragment$c", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f224245b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserProfileFragment f224246c;

        public c(d.a aVar, UserProfileFragment userProfileFragment) {
            this.f224245b = aVar;
            this.f224246c = userProfileFragment;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
            TabFragmentFactory.Data dataA = C19902a.a(intent);
            UserProfileFragment userProfileFragment = this.f224246c;
            if (dataA == null) {
                intent.setFlags(603979776);
                C35966w1.d(userProfileFragment, intent, i12);
            } else {
                intent.setFlags(603979776);
                userProfileFragment.C5(i12, intent);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
            this.f224245b.R(intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            this.f224245b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
            this.f224245b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f224245b.s1();
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile/user_profile/UserProfileFragment$d", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public d(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            ViewGroup viewGroup;
            D d12 = UserProfileFragment.this.f224232S0;
            return (d12 == null || (viewGroup = d12.f224204h) == null) ? super.a() : viewGroup;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileFragment$onViewCreated$1", f = "UserProfileFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super DeepLink>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f224248q;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DeepLink> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f224248q = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f224248q;
            V2.f318762a.b("An error occurred while booking widget item was clicked " + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileFragment$onViewCreated$2", f = "UserProfileFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f224249q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = UserProfileFragment.this.new f(continuation);
            fVar.f224249q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
            return ((f) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UserProfileFragment.this.D5().accept(new InterfaceC15503a.C1130a((DeepLink) this.f224249q, false, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileFragment$onViewCreated$3", f = "UserProfileFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super DeepLink>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f224251q;

        public g() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DeepLink> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            g gVar = new g(3, continuation);
            gVar.f224251q = th2;
            return gVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f224251q;
            V2.f318762a.b("An error occurred while widget item was clicked " + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileFragment$onViewCreated$4", f = "UserProfileFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f224252q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = UserProfileFragment.this.new h(continuation);
            hVar.f224252q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
            return ((h) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UserProfileFragment.this.D5().accept(new InterfaceC15503a.C1130a((DeepLink) this.f224252q, false));
            return G0.f406611a;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUa0/a;", "it", "Lkotlin/G0;", "invoke", "(LUa0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<InterfaceC15503a, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15503a interfaceC15503a) {
            UserProfileFragment.this.D5().accept(interfaceC15503a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f224255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f224255l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f224255l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserProfileFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f224257l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f224257l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f224257l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f224258l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f224258l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f224258l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f224259l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f224259l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f224259l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/profile/user_profile/UserProfileFragment$o", "Li/a;", "Lkotlin/G0;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends AbstractC41201a<G0, Boolean> {
        public o() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, G0 g02) {
            InterfaceC44261b interfaceC44261b = UserProfileFragment.this.f224238v0;
            if (interfaceC44261b == null) {
                interfaceC44261b = null;
            }
            return InterfaceC44261b.a.a(interfaceC44261b, null, null, null, null, 31);
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 == -1);
        }
    }

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/w;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile/user_profile/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<w> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final w invoke() {
            x xVar = UserProfileFragment.this.f224236t0;
            if (xVar == null) {
                xVar = null;
            }
            return (w) xVar.get();
        }
    }

    public UserProfileFragment() {
        super(0, 1, null);
        j jVar = new j(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f224237u0 = new O0(m0.f406844a.b(w.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        final int i12 = 0;
        this.f224233T0 = registerForActivityResult(new o(), new androidx.view.result.a(this) { // from class: com.avito.android.profile.user_profile.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserProfileFragment f226149c;

            {
                this.f226149c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            this.f226149c.D5().accept(new InterfaceC15503a.g(uri));
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f224234U0 = registerForActivityResult(new b(), new androidx.view.result.a(this) { // from class: com.avito.android.profile.user_profile.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserProfileFragment f226149c;

            {
                this.f226149c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            this.f226149c.D5().accept(new InterfaceC15503a.g(uri));
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f224235V0 = registerForActivityResult(new PhotoPickerContract(), new androidx.view.result.a(this) { // from class: com.avito.android.profile.user_profile.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserProfileFragment f226149c;

            {
                this.f226149c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            this.f226149c.D5().accept(InterfaceC15503a.d.f16454a);
                            break;
                        }
                        break;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            this.f226149c.D5().accept(new InterfaceC15503a.g(uri));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final w D5() {
        return (w) this.f224237u0.getValue();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return navigationTabSetItem == NavigationTab.f106974j;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new c(new d.a(this), this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new d(requireActivity());
    }

    @Override // com.avito.android.profile.SelectAvatarActionDialog.Listener
    public final void o2(@Y61.k SelectAvatarActionDialog.Listener.Action action) {
        int iOrdinal = action.ordinal();
        if (iOrdinal == 0) {
            D5().accept(InterfaceC15503a.v.f16471a);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            D5().accept(InterfaceC15503a.f.f16456a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.user_profile, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        D d12 = this.f224232S0;
        if (d12 != null) {
            d12.f224207k.setAdapter(null);
        }
        this.f224232S0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        D5().accept(InterfaceC15503a.q.f16466a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.profile.user_profile.uxf.f fVar = this.f224231R0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(C22981N.a(getLifecycle()));
        D5().accept(InterfaceC15503a.t.f16469a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        D d12 = this.f224232S0;
        if (d12 != null) {
            K2.d(d12.f224198b, true);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f224221H0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new X0());
            G0 g02 = G0.f406611a;
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f224222I0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        w wVarD5 = D5();
        com.avito.konveyor.adapter.d dVar = this.f224220G0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f224222I0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        InterfaceC43160i<com.avito.android.promoblock.a> interfaceC43160i = this.f224229P0;
        InterfaceC43160i<com.avito.android.promoblock.a> interfaceC43160i2 = interfaceC43160i != null ? interfaceC43160i : null;
        InterfaceC43160i<com.avito.android.component.user_hat.e> interfaceC43160i3 = this.f224230Q0;
        InterfaceC43160i<com.avito.android.component.user_hat.e> interfaceC43160i4 = interfaceC43160i3 != null ? interfaceC43160i3 : null;
        com.avito.android.profile.user_profile.cards.o oVar = this.f224228O0;
        this.f224232S0 = new D(view, this, wVarD5, dVar2, screenPerformanceTracker3, interfaceC43160i2, interfaceC43160i4, oVar != null ? oVar : null, false, 256, null);
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f224222I0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.d();
        com.avito.android.profile.user_profile.cards.service_booking.items.order.c cVar = this.f224226M0;
        if (cVar == null) {
            cVar = null;
        }
        e2 f225470d = cVar.getF225470d();
        com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.c cVar2 = this.f224225L0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        C43197r1 c43197r1 = new C43197r1(new f(null), new C43152f0(C43175k.N(f225470d, cVar2.getF225437c()), new e(3, null)));
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.f46682e;
        C43175k.K(C23069w.a(c43197r1, lifecycle, state), C22981N.a(getLifecycle()));
        com.avito.android.active_orders_common.items.order.f fVar = this.f224223J0;
        if (fVar == null) {
            fVar = null;
        }
        e2 f68383e = fVar.getF68383e();
        com.avito.android.active_orders_common.items.all_orders.f fVar2 = this.f224224K0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        C43175k.K(C23069w.a(new C43197r1(new h(null), new C43152f0(C43175k.N(f68383e, fVar2.getF68310d()), new g(3, null))), getViewLifecycleOwner().getLifecycle(), state), C22981N.a(getLifecycle()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            UserProfileArguments userProfileArguments = (UserProfileArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", UserProfileArguments.class) : arguments.getParcelable("key_arguments"));
            if (userProfileArguments != null) {
                C33370a.a().a(requireActivity(), new i(), com.avito.android.analytics.screens.s.c(this), getResources(), userProfileArguments.f224213b, this, this, (com.avito.android.profile.user_profile.di.e) C29972i.a(C29972i.b(this), com.avito.android.profile.user_profile.di.e.class), cv.c.b(this)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f224222I0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f224222I0;
                (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
                return;
            }
        }
        throw new IllegalArgumentException("UserProfileArguments must be specified");
    }
}

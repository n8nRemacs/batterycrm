package com.avito.android.profile.pro.impl.screen;

import B90.a;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.A1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import pg.C47078d;

/* compiled from: ProfileProFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectState$1", f = "ProfileProFragment.kt", i = {}, l = {640}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223743q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f223744r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment.b f223745s;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements Y41.s<D90.d, ServiceBookingBlockState, Dc0.g, C47078d, Continuation<? super D90.d>, Object>, SuspendFunction {
        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
        @Override // Y41.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(D90.d r17, com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState r18, Dc0.g r19, pg.C47078d r20, kotlin.coroutines.Continuation<? super D90.d> r21) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.s.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LD90/d;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LD90/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment f223746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProfileProFragment.b f223747c;

        public b(ProfileProFragment profileProFragment, ProfileProFragment.b bVar) {
            this.f223746b = profileProFragment;
            this.f223747c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            String str;
            D90.d dVar = (D90.d) obj;
            int i12 = ProfileProFragment.f222861X0;
            ProfileProFragment profileProFragment = this.f223746b;
            boolean z12 = dVar.f3062b;
            ProfileProFragment.b bVar = this.f223747c;
            ProfileProFragment.C33356a c33356a = bVar.f222907g;
            com.avito.android.progress_overlay.l lVar = bVar.f222908h;
            ImageView imageView = bVar.f222902b;
            ImageView imageView2 = bVar.f222903c;
            Badge badge = bVar.f222904d;
            SwipeRefreshLayout swipeRefreshLayout = bVar.f222901a;
            ViewGroup viewGroup = bVar.f222906f;
            if (z12) {
                viewGroup.setVisibility(0);
                swipeRefreshLayout.setRefreshing(false);
                badge.setVisibility(8);
                imageView2.setVisibility(8);
                imageView.setVisibility(8);
                lVar.k(null);
                c33356a.a(false);
            } else {
                String str2 = dVar.f3063c;
                if (str2 != null) {
                    viewGroup.setVisibility(0);
                    swipeRefreshLayout.setRefreshing(false);
                    badge.setVisibility(8);
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                    lVar.a(str2);
                    c33356a.a(false);
                } else {
                    viewGroup.setVisibility(8);
                    lVar.j();
                    B90.a aVar = dVar.f3061a;
                    imageView.setVisibility((aVar != null ? aVar.f916a : null) != null ? 0 : 8);
                    swipeRefreshLayout.setRefreshing(false);
                    String str3 = dVar.f3064d;
                    com.avito.android.profile.pro.impl.a.a(badge, str3);
                    boolean z13 = dVar.f3065e;
                    badge.setVisibility((z13 || str3 == null || str3.length() == 0) ? 8 : 0);
                    imageView2.setVisibility(z13 ? 8 : 0);
                    bVar.f222905e.setVisibility(0);
                    if ((aVar != null ? aVar.f922g : null) == null) {
                        c33356a.a(false);
                    } else {
                        c33356a.a(true);
                        a.C0036a c0036a = aVar.f922g;
                        a.C0036a.C0037a c0037a = c0036a.f923a;
                        AnimationView.a.e eVar = (c0037a == null || (str = c0037a.f928a) == null) ? null : new AnimationView.a.e(str, null, null, 6, null);
                        AnimationView animationView = c33356a.f222894b;
                        if (eVar != null) {
                            animationView.setVisibility(0);
                            animationView.setAnimationData(eVar);
                        } else {
                            animationView.setVisibility(4);
                        }
                        c33356a.f222895c.setText(c0036a.f924b);
                        c33356a.f222896d.setText(c0036a.f925c);
                    }
                    com.avito.konveyor.adapter.d dVar2 = profileProFragment.f222866E0;
                    if (dVar2 == null) {
                        dVar2 = null;
                    }
                    dVar2.l(dVar.f3066f, null);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ProfileProFragment profileProFragment, ProfileProFragment.b bVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f223744r = profileProFragment;
        this.f223745s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f223744r, this.f223745s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223743q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ProfileProFragment profileProFragment = this.f223744r;
            D d12 = profileProFragment.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            n2<D90.d> state = d12.getState();
            n2<ServiceBookingBlockState> state2 = profileProFragment.E5().getState();
            e.a aVar = kotlin.time.e.f410651c;
            InterfaceC43160i interfaceC43160iF = com.avito.android.arch.mvi.utils.h.f(state2, kotlin.time.g.h(500L, DurationUnit.f410633e));
            com.avito.android.profile_tab.summary.f fVar = profileProFragment.f222886u0;
            if (fVar == null) {
                fVar = null;
            }
            n2<Dc0.g> state3 = ((com.avito.android.profile_tab.summary.c) fVar).getState();
            n2<C47078d> state4 = profileProFragment.D5().getState();
            F f12 = profileProFragment.f222875N0;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new A1(new InterfaceC43160i[]{state, interfaceC43160iF, state3, state4}, new a(5, f12 != null ? f12 : null, F.class, "combine", "combine(Lcom/avito/android/profile/pro/impl/screen/mvi/entity/ProfileProState;Lcom/avito/android/service_booking_user_profile/view/mvi/entity/ServiceBookingBlockState;Lcom/avito/android/profile_tab/summary/mvi/entity/ProfileSummaryState;Lcom/avito/android/avito_finance_user_profile/view/mvi/entity/AvitoFinanceBlockState;)Lcom/avito/android/profile/pro/impl/screen/mvi/entity/ProfileProState;", 4)));
            R0 r02 = profileProFragment.f222876O0;
            if (r02 == null) {
                r02 = null;
            }
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iR);
            b bVar = new b(profileProFragment, this.f223745s);
            this.f223743q = 1;
            if (interfaceC43160iI.collect(bVar, this) == coroutine_suspended) {
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

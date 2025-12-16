package com.avito.android.extended_profile_image_edit;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import vA.InterfaceC49183a;
import vA.InterfaceC49185c;

/* compiled from: BannerImageEditMviViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/e;", "Lcom/avito/android/arch/mvi/android/j;", "LvA/a;", "LvA/d;", "LvA/c;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends com.avito.android.arch.mvi.android.j<InterfaceC49183a, vA.d, InterfaceC49185c> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f151007N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final R0 f151008O;

    /* compiled from: BannerImageEditMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.BannerImageEditMviViewModel$onCleared$1", f = "BannerImageEditMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f151007N.d("extended profile settings");
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.extended_profile_image_edit.mvi.m mVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k R0 r02) {
        super(mVar, null, 2, null);
        this.f151007N = bVar;
        this.f151008O = r02;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        C43259k.d(U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), this.f151008O.a())), null, null, new a(null), 3);
    }
}

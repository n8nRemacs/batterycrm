package com.avito.android.bx_beduin_native_items;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f108819b;

    /* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bx_beduin_native_items.BxBeduinNativeItemVisibilityTrackerImpl$scrollListener$1$onScrolled$1$1", f = "BxBeduinNativeItemVisibilityTracker.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f108820q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d f108821r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f108822s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, RecyclerView recyclerView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f108821r = dVar;
            this.f108822s = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f108821r, this.f108822s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f108820q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f108820q = 1;
                if (C43131e0.b(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f108821r.h(this.f108822s);
            return G0.f406611a;
        }
    }

    public e(d dVar) {
        this.f108819b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        d dVar = this.f108819b;
        C43238h c43238h = dVar.f108806e;
        if (c43238h != null) {
            N0 n02 = dVar.f108808g;
            if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                dVar.f108808g = C43259k.d(c43238h, null, null, new a(dVar, recyclerView, null), 3);
            }
        }
    }
}

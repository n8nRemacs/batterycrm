package com.avito.android.comfortable_deal.deal.player;

import androidx.media3.common.H;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* compiled from: AudioPlayerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/e;", "Landroidx/media3/common/H$g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements H.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f121760b;

    /* compiled from: AudioPlayerHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.player.AudioPlayerHelper$1$1$onIsPlayingChanged$1", f = "AudioPlayerHelper.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121761q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f121762r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f121763s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f121762r = fVar;
            this.f121763s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f121762r, this.f121763s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f121761q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1<Boolean> z12 = this.f121762r.f121767d;
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.f121763s);
                this.f121761q = 1;
                if (z12.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    public e(f fVar) {
        this.f121760b = fVar;
    }

    @Override // androidx.media3.common.H.g
    public final void onIsPlayingChanged(boolean z12) {
        boolean z13 = true;
        f fVar = this.f121760b;
        if (!z12 && (!fVar.f121764a.a().getPlayWhenReady() || fVar.f121764a.a().getPlaybackState() != 2)) {
            z13 = false;
        }
        C43259k.d(fVar.f121766c, null, null, new a(fVar, z13, null), 3);
    }
}

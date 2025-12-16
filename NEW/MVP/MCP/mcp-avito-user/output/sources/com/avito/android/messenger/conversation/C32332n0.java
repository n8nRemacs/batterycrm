package com.avito.android.messenger.conversation;

import J70.c;
import android.content.Context;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.util.L5;
import kotlin.C42729a0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindPhotoDownloadViewModel$1", f = "ChannelFragment.kt", i = {}, l = {1327}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.n0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32332n0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f195223q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195224r;

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindPhotoDownloadViewModel$1$1", f = "ChannelFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.conversation.n0$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f195225q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ChannelFragment f195226r;

        /* compiled from: ChannelFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.ChannelFragment$bindPhotoDownloadViewModel$1$1$1", f = "ChannelFragment.kt", i = {}, l = {1329}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.n0$a$a, reason: collision with other inner class name */
        public static final class C5764a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f195227q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ChannelFragment f195228r;

            /* compiled from: ChannelFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.n0$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C5765a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ChannelFragment f195229b;

                public C5765a(ChannelFragment channelFragment) {
                    this.f195229b = channelFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    J70.c cVar = (J70.c) obj;
                    ChannelFragment.a aVar = ChannelFragment.f188932o3;
                    ChannelFragment channelFragment = this.f195229b;
                    if (cVar instanceof c.a) {
                        channelFragment.F5(new B1(channelFragment, cVar));
                    } else if (cVar instanceof c.b) {
                        String strK0 = ((c.b) cVar).f8791a.k0(channelFragment.requireContext());
                        Context context = channelFragment.getContext();
                        if (context != null) {
                            L5.b(context, strK0, 0);
                        }
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f195229b, ChannelFragment.class, "handlePhotoDownloadEvent", "handlePhotoDownloadEvent(Lcom/avito/android/photo_download/feature/mvi/entity/PhotoDownloadOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5764a(ChannelFragment channelFragment, Continuation<? super C5764a> continuation) {
                super(2, continuation);
                this.f195228r = channelFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C5764a(this.f195228r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C5764a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f195227q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ChannelFragment channelFragment = this.f195228r;
                    com.avito.android.photo_download.feature.mvi.j jVar = (com.avito.android.photo_download.feature.mvi.j) channelFragment.f188944J0.getValue();
                    C5765a c5765a = new C5765a(channelFragment);
                    this.f195227q = 1;
                    if (jVar.ke(c5765a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ChannelFragment channelFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f195226r = channelFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f195226r, continuation);
            aVar.f195225q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43259k.d((kotlinx.coroutines.T) this.f195225q, null, null, new C5764a(this.f195226r, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32332n0(ChannelFragment channelFragment, Continuation<? super C32332n0> continuation) {
        super(2, continuation);
        this.f195224r = channelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32332n0(this.f195224r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C32332n0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f195223q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            ChannelFragment channelFragment = this.f195224r;
            a aVar = new a(channelFragment, null);
            this.f195223q = 1;
            if (C23056p0.b(channelFragment, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}

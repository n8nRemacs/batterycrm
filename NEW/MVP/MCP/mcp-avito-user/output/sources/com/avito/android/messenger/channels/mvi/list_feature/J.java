package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_problems.public_module.deeplink.IacShowProblemBottomSheetLink;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "LHY/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$30", f = "ChannelsListActor.kt", i = {}, l = {605}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class J extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187750q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31772a f187751r;

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$30$1", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C31772a f187752q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ IacShowProblemBottomSheetLink f187753r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31772a c31772a, IacShowProblemBottomSheetLink iacShowProblemBottomSheetLink, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f187752q = c31772a;
            this.f187753r = iacShowProblemBottomSheetLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f187752q, this.f187753r, continuation);
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
            b.a.a(this.f187752q.f187926f, this.f187753r, null, null, 6);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C31772a c31772a, Continuation<? super J> continuation) {
        super(2, continuation);
        this.f187751r = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new J(this.f187751r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.channels.I0<? super HY.d> i02, Continuation<? super kotlin.G0> continuation) {
        return ((J) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187750q;
        if (i12 == 0) {
            C42729a0.b(obj);
            IacShowProblemBottomSheetLink iacShowProblemBottomSheetLink = new IacShowProblemBottomSheetLink(NotificationsSettings.Section.SECTION_MESSENGER);
            C31772a c31772a = this.f187751r;
            AbstractC43129d1 abstractC43129d1B = c31772a.f187934n.b();
            a aVar = new a(c31772a, iacShowProblemBottomSheetLink, null);
            this.f187750q = 1;
            if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
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

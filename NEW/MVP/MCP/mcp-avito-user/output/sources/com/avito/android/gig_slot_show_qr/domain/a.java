package com.avito.android.gig_slot_show_qr.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.slot_show_qr_impl.generated.api.show_qrv_1.Action;
import com.avito.android.gig_slot_show_qr.mvi.i;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigSlotShowQrInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_slot_show_qr/domain/a;", "", "_avito_gig_slot-show-qr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OG.a f160875a;

    /* compiled from: GigSlotShowQrInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_slot_show_qr/mvi/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_slot_show_qr.domain.GigSlotShowQrInteractor$requestShowQr$1", f = "GigSlotShowQrInteractor.kt", i = {0}, l = {17, 18}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.gig_slot_show_qr.domain.a$a, reason: collision with other inner class name */
    public static final class C4707a extends SuspendLambda implements p<InterfaceC43172j<? super i>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160876q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160877r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f160879t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Action f160880u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4707a(long j12, Action action, Continuation<? super C4707a> continuation) {
            super(2, continuation);
            this.f160879t = j12;
            this.f160880u = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4707a c4707a = a.this.new C4707a(this.f160879t, this.f160880u, continuation);
            c4707a.f160877r = obj;
            return c4707a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super i> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4707a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            i aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160876q;
            a aVar2 = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f160877r;
                OG.a aVar3 = aVar2.f160875a;
                this.f160877r = interfaceC43172j;
                this.f160876q = 1;
                obj = aVar3.a(this.f160879t, this.f160880u, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f160877r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            aVar2.getClass();
            if (typedResult instanceof TypedResult.Success) {
                TypedResult.Success success = (TypedResult.Success) typedResult;
                String title = ((PG.a) success.getResult()).getTitle();
                List<AttributedText> listC = ((PG.a) success.getResult()).c();
                String qr2 = ((PG.a) success.getResult()).getQr();
                aVar = new i.a(((PG.a) success.getResult()).getInfo(), title, listC, ((PG.a) success.getResult()).getSupportChatDeepLink(), qr2);
            } else {
                aVar = i.b.f160905a;
            }
            this.f160877r = null;
            this.f160876q = 2;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k OG.a aVar) {
        this.f160875a = aVar;
    }

    @k
    public final InterfaceC43160i<i> a(long j12, @k Action action) {
        return C43175k.G(new C4707a(j12, action, null));
    }
}

package com.avito.android.entry_point_client_room.report;

import Y41.p;
import android.content.Intent;
import com.avito.android.R;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import sz.AbstractC48439d;

/* compiled from: SendReportFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.entry_point_client_room.report.SendReportFragment$HandleEvents$1", f = "SendReportFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f147666q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SendReportFragment f147667r;

    /* compiled from: SendReportFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsz/d;", "event", "Lkotlin/G0;", "<anonymous>", "(Lsz/d;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.entry_point_client_room.report.SendReportFragment$HandleEvents$1$1", f = "SendReportFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<AbstractC48439d, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f147668q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SendReportFragment f147669r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SendReportFragment sendReportFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f147669r = sendReportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f147669r, continuation);
            aVar.f147668q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC48439d abstractC48439d, Continuation<? super G0> continuation) {
            return ((a) create(abstractC48439d, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AbstractC48439d abstractC48439d = (AbstractC48439d) this.f147668q;
            boolean zF2 = L.f(abstractC48439d, AbstractC48439d.a.f438948a);
            SendReportFragment sendReportFragment = this.f147669r;
            if (zF2) {
                sendReportFragment.requireActivity().setResult(0);
                sendReportFragment.requireActivity().finish();
            } else if (L.f(abstractC48439d, AbstractC48439d.b.f438949a)) {
                sendReportFragment.requireActivity().setResult(-1, new Intent().putExtra("send_report.result_ok.msg_key", sendReportFragment.getResources().getString(R.string.msg_result_ok)));
                sendReportFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SendReportFragment sendReportFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f147667r = sendReportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f147667r, continuation);
        bVar.f147666q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f147666q;
        SendReportFragment sendReportFragment = this.f147667r;
        C43175k.K(new C43197r1(new a(sendReportFragment, null), ((com.avito.android.entry_point_client_room.report.mvi.k) sendReportFragment.f147650o0.getValue()).getEvents()), t12);
        return G0.f406611a;
    }
}

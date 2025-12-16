package com.avito.android.comfortable_deal.contract_sign;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.util.L5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import pp.InterfaceC47121b;

/* compiled from: ContractSignFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.contract_sign.ContractSignFragment$HandleEvents$1", f = "ContractSignFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f120793q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ContractSignFragment f120794r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f120795s;

    /* compiled from: ContractSignFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpp/b;", "event", "Lkotlin/G0;", "<anonymous>", "(Lpp/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.contract_sign.ContractSignFragment$HandleEvents$1$1", f = "ContractSignFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.comfortable_deal.contract_sign.a$a, reason: collision with other inner class name */
    public static final class C3560a extends SuspendLambda implements Y41.p<InterfaceC47121b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f120796q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ContractSignFragment f120797r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f120798s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3560a(ContractSignFragment contractSignFragment, Context context, Continuation<? super C3560a> continuation) {
            super(2, continuation);
            this.f120797r = contractSignFragment;
            this.f120798s = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3560a c3560a = new C3560a(this.f120797r, this.f120798s, continuation);
            c3560a.f120796q = obj;
            return c3560a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC47121b interfaceC47121b, Continuation<? super G0> continuation) {
            return ((C3560a) create(interfaceC47121b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC47121b interfaceC47121b = (InterfaceC47121b) this.f120796q;
            boolean z12 = interfaceC47121b instanceof InterfaceC47121b.d;
            ContractSignFragment contractSignFragment = this.f120797r;
            if (z12) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = contractSignFragment.f120781r0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse(((InterfaceC47121b.d) interfaceC47121b).f428770a), null, null, 6, null), null, null, 6);
            } else if (interfaceC47121b instanceof InterfaceC47121b.e) {
                String strK0 = ((InterfaceC47121b.e) interfaceC47121b).f428771a.k0(this.f120798s);
                Context context = contractSignFragment.getContext();
                if (context != null) {
                    L5.b(context, strK0, 0);
                }
            } else if (interfaceC47121b instanceof InterfaceC47121b.c) {
                ActivityC22955m activityC22955mRequireActivity = contractSignFragment.requireActivity();
                activityC22955mRequireActivity.setResult(-1);
                activityC22955mRequireActivity.finish();
            } else if (interfaceC47121b instanceof InterfaceC47121b.C12290b) {
                ActivityC22955m activityC22955mRequireActivity2 = contractSignFragment.requireActivity();
                activityC22955mRequireActivity2.setResult(0, new Intent().putExtra("sign_status", PaymentStateKt.PAYMENT_STATE_FAILED).putExtra("sign_msg", activityC22955mRequireActivity2.getResources().getString(R.string.comfortable_deal_common_error)));
                activityC22955mRequireActivity2.finish();
            } else if (interfaceC47121b instanceof InterfaceC47121b.a) {
                ActivityC22955m activityC22955mRequireActivity3 = contractSignFragment.requireActivity();
                activityC22955mRequireActivity3.setResult(0, new Intent().putExtra("sign_status", "cancelled"));
                activityC22955mRequireActivity3.finish();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ContractSignFragment contractSignFragment, Context context, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f120794r = contractSignFragment;
        this.f120795s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f120794r, this.f120795s, continuation);
        aVar.f120793q = obj;
        return aVar;
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
        T t12 = (T) this.f120793q;
        ContractSignFragment contractSignFragment = this.f120794r;
        C43175k.K(new C43197r1(new C3560a(contractSignFragment, this.f120795s, null), ((u) contractSignFragment.f120778o0.getValue()).getEvents()), t12);
        return G0.f406611a;
    }
}

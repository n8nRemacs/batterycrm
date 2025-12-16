package com.avito.android.publish.input_imei.mvi;

import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: InputImeiBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiBootstrap$collectScanButton$1", f = "InputImeiBootstrap.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f236422q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f236423r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f236424s;

    /* compiled from: InputImeiBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/input_imei/items/scan_button/c;", "<anonymous parameter 0>", "Lkotlin/G0;", "emit", "(Lcom/avito/android/publish/input_imei/items/scan_button/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f236425b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InputImeiInternalAction> f236426c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(m mVar, InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j) {
            this.f236425b = mVar;
            this.f236426c = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f236425b.f236435f.J();
            Object objEmit = this.f236426c.emit(InputImeiInternalAction.ScanImei.f236388b, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f236424s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f236424s, continuation);
        kVar.f236423r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InputImeiInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        com.jakewharton.rxrelay3.c f236363c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f236422q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f236423r;
            m mVar = this.f236424s;
            Iterator<T> it = mVar.f236434e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof com.avito.android.publish.input_imei.items.scan_button.d) {
                    break;
                }
            }
            com.avito.android.publish.input_imei.items.scan_button.d dVar = (com.avito.android.publish.input_imei.items.scan_button.d) (next instanceof com.avito.android.publish.input_imei.items.scan_button.d ? next : null);
            if (dVar != null && (f236363c = dVar.getF236363c()) != null) {
                InterfaceC43160i interfaceC43160iA = y.a(f236363c);
                a aVar = new a(mVar, interfaceC43172j);
                this.f236422q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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

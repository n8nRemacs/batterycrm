package com.avito.android.barcode.presentation.mvi;

import Og.InterfaceC14685b;
import Y41.p;
import com.avito.android.barcode.domain.model.BarcodeData;
import com.avito.android.barcode_encoder.BarcodeFormat;
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

/* compiled from: BarcodeBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LOg/b;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.arch.mvi.b<InterfaceC14685b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f98726a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f98727b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f98728c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BarcodeFormat f98729d;

    /* compiled from: BarcodeBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOg/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.barcode.presentation.mvi.BarcodeBootstrap$produce$1", f = "BarcodeBootstrap.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14685b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f98730q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f98731r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f98731r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC14685b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f98730q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f98731r;
                d dVar = d.this;
                InterfaceC14685b.c cVar = new InterfaceC14685b.c(new BarcodeData(dVar.f98729d, dVar.f98726a, dVar.f98727b, dVar.f98728c));
                this.f98730q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    @Inject
    public d(@Y61.k BarcodeFormat barcodeFormat, @com.avito.android.barcode.di.c @Y61.k String str, @Y61.l @com.avito.android.barcode.di.f String str2, @Y61.l @com.avito.android.barcode.di.e String str3) {
        this.f98726a = str;
        this.f98727b = str2;
        this.f98728c = str3;
        this.f98729d = barcodeFormat;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC14685b> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

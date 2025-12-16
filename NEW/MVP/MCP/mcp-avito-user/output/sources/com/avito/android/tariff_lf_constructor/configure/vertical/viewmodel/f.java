package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import pD0.InterfaceC46937a;
import zD0.C50442b;

/* compiled from: ConstructorConfigureVerticalRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/viewmodel/f;", "Lcom/avito/android/tariff_lf_constructor/configure/vertical/viewmodel/e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46937a f300661a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.a f300662b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f300663c;

    /* compiled from: ConstructorConfigureVerticalRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/util/P2;", "", "Lcom/avito/conveyor_item/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/util/P2;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.ConstructorConfigureVerticalRepositoryImpl$getTariffConfigureVerticals$2", f = "ConstructorConfigureVerticalRepository.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super P2<? super List<? extends com.avito.conveyor_item.a>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f300664q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super P2<? super List<? extends com.avito.conveyor_item.a>>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f300664q;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC46937a interfaceC46937a = fVar.f300661a;
                this.f300664q = 1;
                obj = interfaceC46937a.j(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(fVar.f300662b.a((C50442b) ((TypedResult.Success) typedResult).getResult()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public f(@Y61.k InterfaceC46937a interfaceC46937a, @Y61.k com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.a aVar, @Y61.k R0 r02) {
        this.f300661a = interfaceC46937a;
        this.f300662b = aVar;
        this.f300663c = r02;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel.e
    @Y61.l
    public final Object a(@Y61.k Continuation<? super P2<? super List<? extends com.avito.conveyor_item.a>>> continuation) {
        return C43259k.g(this.f300663c.a(), new a(null), continuation);
    }
}

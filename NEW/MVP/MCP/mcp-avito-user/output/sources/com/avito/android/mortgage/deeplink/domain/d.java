package com.avito.android.mortgage.deeplink.domain;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.DocumentsForm;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: DocumentsFormRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/deeplink/domain/d;", "Lcom/avito/android/mortgage/deeplink/domain/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f198814a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f198815b;

    /* compiled from: DocumentsFormRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/mortgage/api/model/DocumentsForm;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.deeplink.domain.DocumentsFormRepositoryImpl$getDocumentsForm$2", f = "DocumentsFormRepository.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<DocumentsForm>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198816q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f198818s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f198819t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f198818s = str;
            this.f198819t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f198818s, this.f198819t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<DocumentsForm>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f198816q;
            if (i12 == 0) {
                C42729a0.b(obj);
                IZ.a aVar = d.this.f198814a.get();
                this.f198816q = 1;
                obj = aVar.a(this.f198818s, this.f198819t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public d(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f198814a = eVar;
        this.f198815b = r02;
    }

    @Override // com.avito.android.mortgage.deeplink.domain.c
    @l
    public final Object a(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<DocumentsForm>> continuation) {
        return C43259k.g(this.f198815b.a(), new a(str, str2, null), continuation);
    }
}

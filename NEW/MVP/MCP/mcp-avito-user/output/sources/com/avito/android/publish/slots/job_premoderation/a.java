package com.avito.android.publish.slots.job_premoderation;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.job_premoderation.JobPremoderationSlot;
import com.avito.android.remote.model.job_premoderation.VacancySimilarItemResponse;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.R0;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;

/* compiled from: JobPremoderationSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/job_premoderation/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/job_premoderation/JobPremoderationSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends k<JobPremoderationSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JobPremoderationSlot f244416b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final N0 f244417c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.publish.slots.job_premoderation.item.a f244418d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f244419e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f244420f;

    /* compiled from: JobPremoderationSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.job_premoderation.JobPremoderationSlotWrapper$1$1", f = "JobPremoderationSlotWrapper.kt", i = {}, l = {46, 50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.slots.job_premoderation.a$a, reason: collision with other inner class name */
    public static final class C7321a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f244421q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ H0 f244422r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f244423s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ R0 f244424t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f244425u;

        /* compiled from: JobPremoderationSlotWrapper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.publish.slots.job_premoderation.JobPremoderationSlotWrapper$1$1$1", f = "JobPremoderationSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.publish.slots.job_premoderation.a$a$a, reason: collision with other inner class name */
        public static final class C7322a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ a f244426q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f244427r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AttributedText f244428s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f244429t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ VacancySimilarItemResponse.Item f244430u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7322a(a aVar, String str, AttributedText attributedText, String str2, VacancySimilarItemResponse.Item item, Continuation<? super C7322a> continuation) {
                super(2, continuation);
                this.f244426q = aVar;
                this.f244427r = str;
                this.f244428s = attributedText;
                this.f244429t = str2;
                this.f244430u = item;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7322a(this.f244426q, this.f244427r, this.f244428s, this.f244429t, this.f244430u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C7322a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                VacancySimilarItemResponse.Item item = this.f244430u;
                com.avito.android.publish.slots.job_premoderation.item.a aVar = new com.avito.android.publish.slots.job_premoderation.item.a(this.f244427r, this.f244428s, this.f244429t, item.getTitle(), item.getSalary(), item.getAdditionalInfo(), item.getUri());
                a aVar2 = this.f244426q;
                aVar2.f244418d = aVar;
                aVar2.f244419e.accept(new f.b(SlotType.JOB_PREMODERATION, null));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7321a(H0 h02, String str, R0 r02, a aVar, Continuation<? super C7321a> continuation) {
            super(2, continuation);
            this.f244422r = h02;
            this.f244423s = str;
            this.f244424t = r02;
            this.f244425u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new C7321a(this.f244422r, this.f244423s, this.f244424t, this.f244425u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C7321a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f244421q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f244421q = 1;
                obj = this.f244422r.k(this.f244423s, this);
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
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                VacancySimilarItemResponse vacancySimilarItemResponse = (VacancySimilarItemResponse) ((TypedResult.Success) typedResult).getResult();
                String title = vacancySimilarItemResponse.getTitle();
                AttributedText description = vacancySimilarItemResponse.getDescription();
                String itemHeader = vacancySimilarItemResponse.getItemHeader();
                VacancySimilarItemResponse.Item item = vacancySimilarItemResponse.getItem();
                if (title != null && description != null && itemHeader != null && item != null) {
                    AbstractC43129d1 abstractC43129d1B = this.f244424t.b();
                    C7322a c7322a = new C7322a(this.f244425u, title, description, itemHeader, item, null);
                    this.f244421q = 2;
                    if (C43259k.g(abstractC43129d1B, c7322a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k JobPremoderationSlot jobPremoderationSlot, @Y61.k C0 c02, @Y61.k H0 h02, @Y61.k R0 r02) {
        this.f244416b = jobPremoderationSlot;
        com.jakewharton.rxrelay3.c<f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244419e = cVar;
        this.f244420f = new C41981q0(cVar);
        String str = c02.f231865c0;
        if (str != null) {
            this.f244417c = C43259k.d(U.a(r02.c()), null, null, new C7321a(h02, str, r02, this, null), 3);
        }
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f244420f;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        N0 n02 = this.f244417c;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244416b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        com.avito.android.publish.slots.job_premoderation.item.a aVar = this.f244418d;
        return aVar != null ? Collections.singletonList(new com.avito.android.publish.slots.job_premoderation.item.b(this.f244416b.getId(), aVar)) : C42784z0.f406748b;
    }
}

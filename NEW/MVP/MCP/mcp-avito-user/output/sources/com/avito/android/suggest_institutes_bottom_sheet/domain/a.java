package com.avito.android.suggest_institutes_bottom_sheet.domain;

import KQ.c;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rA0.C47519a;

/* compiled from: SuggestInstitutesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/domain/a;", "", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f292019a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JQ.a f292020b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SelectedSuggestInstitute f292021c;

    /* compiled from: SuggestInstitutesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "LrA0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.suggest_institutes_bottom_sheet.domain.SuggestInstitutesInteractor$getSuggests$1", f = "SuggestInstitutesInteractor.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.suggest_institutes_bottom_sheet.domain.a$a, reason: collision with other inner class name */
    public static final class C8851a extends SuspendLambda implements p<InterfaceC43172j<? super List<? extends C47519a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292022q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f292023r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f292025t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8851a(String str, Continuation<? super C8851a> continuation) {
            super(2, continuation);
            this.f292025t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8851a c8851a = a.this.new C8851a(this.f292025t, continuation);
            c8851a.f292023r = obj;
            return c8851a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super List<? extends C47519a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8851a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            List listSingletonList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f292022q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f292023r;
                KQ.a aVar2 = new KQ.a(Boxing.boxLong(aVar.f292019a), this.f292025t);
                this.f292023r = interfaceC43172j;
                this.f292022q = 1;
                obj = aVar.f292020b.a(aVar2, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f292023r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                c cVar = (c) ((TypedResult.Success) typedResult).getResult();
                aVar.getClass();
                if (cVar.a().isEmpty()) {
                    listSingletonList = Collections.singletonList(new C47519a(this.f292025t, false, true, null, 10, null));
                } else {
                    List<KQ.b> listA = cVar.a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    for (KQ.b bVar : listA) {
                        arrayList.add(new C47519a(bVar.getTitle(), L.f(aVar.f292021c.f291980c, bVar.getTitle()), L.f(bVar.getIsCustom(), Boolean.TRUE), null, 8, null));
                    }
                    listSingletonList = arrayList;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                listSingletonList = Collections.singletonList(new C47519a(this.f292025t, false, true, null, 10, null));
            }
            this.f292023r = null;
            this.f292022q = 2;
            if (interfaceC43172j.emit(listSingletonList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Named("LIMIT") long j12, @k JQ.a aVar, @k SelectedSuggestInstitute selectedSuggestInstitute) {
        this.f292019a = j12;
        this.f292020b = aVar;
        this.f292021c = selectedSuggestInstitute;
    }

    @k
    public final C43210w a() {
        String str = this.f292021c.f291980c;
        return new C43210w((str == null || C43066x.K(str)) ? C42784z0.f406748b : Collections.singletonList(new C47519a(str, true, false, null, 12, null)));
    }

    @k
    public final InterfaceC43160i<List<C47519a>> b(@k String str) {
        return C43175k.G(new C8851a(str, null));
    }
}

package com.avito.android.developments_catalog.residential_complex_search;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lx.InterfaceC43844a;
import tx.C48734a;

/* compiled from: ResidentialComplexInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/i;", "Lcom/avito/android/developments_catalog/residential_complex_search/h;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43844a f139189a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C48734a f139190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f139191c;

    /* compiled from: ResidentialComplexInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_catalog.residential_complex_search.ResidentialComplexInteractorImpl$getResidentialComplexSuggest$1", f = "ResidentialComplexInteractor.kt", i = {0, 1}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ResidentialComplexInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f139192q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f139193r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f139194s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ i f139195t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f139194s = str;
            this.f139195t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f139194s, this.f139195t, continuation);
            aVar.f139193r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ResidentialComplexInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00fc A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_catalog.residential_complex_search.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@k InterfaceC43844a interfaceC43844a, @k C48734a c48734a, @k R0 r02) {
        this.f139189a = interfaceC43844a;
        this.f139190b = c48734a;
        this.f139191c = r02;
    }

    @Override // com.avito.android.developments_catalog.residential_complex_search.h
    @k
    public final InterfaceC43160i<ResidentialComplexInternalAction> a(@k String str) {
        return C43175k.I(this.f139191c.a(), C43175k.G(new a(str, this, null)));
    }
}

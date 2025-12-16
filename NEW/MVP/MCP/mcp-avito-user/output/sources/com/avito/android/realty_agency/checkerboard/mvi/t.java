package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.InterfaceC19561c;
import androidx.compose.runtime.internal.P;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ri0.InterfaceC47661a;

/* compiled from: CheckerboardBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/t;", "Lcom/avito/android/arch/mvi/b;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements com.avito.android.arch.mvi.b<InterfaceC19561c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f251318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f251319b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CheckerboardArguments f251320c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.checkerboard.mvi.use_case.b f251321d;

    /* compiled from: CheckerboardBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardBootstrap$produce$1", f = "CheckerboardBootstrap.kt", i = {0, 0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 34}, m = "invokeSuspend", n = {"$this$flow", "buildingToSection"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Q f251322q;

        /* renamed from: r, reason: collision with root package name */
        public int f251323r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f251324s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = t.this.new a(continuation);
            aVar.f251324s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.mvi.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public t(@Y61.k y yVar, @Y61.k InterfaceC47661a interfaceC47661a, @Y61.k CheckerboardArguments checkerboardArguments, @Y61.k com.avito.android.realty_agency.checkerboard.mvi.use_case.b bVar) {
        this.f251318a = yVar;
        this.f251319b = interfaceC47661a;
        this.f251320c = checkerboardArguments;
        this.f251321d = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC19561c> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

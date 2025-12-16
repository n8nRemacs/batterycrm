package com.avito.android.vas_performance.screens.visual_v2.domain;

import RL0.c;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import eL0.InterfaceC40020a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SetVisualVasV2AutoprolongUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/domain/e;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f321230a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40020a f321231b;

    /* compiled from: SetVisualVasV2AutoprolongUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_performance.screens.visual_v2.domain.SetVisualVasV2AutoprolongUseCase$invoke$1", f = "SetVisualVasV2AutoprolongUseCase.kt", i = {0, 1, 2, 2}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 32, 41, 48, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super VisualVasV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC40020a.AbstractC11070a f321232q;

        /* renamed from: r, reason: collision with root package name */
        public int f321233r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f321234s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f321235t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e f321236u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f321237v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f321238w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f321239x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ c.a.C0957a.C0958a.C0959a f321240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, e eVar, long j12, String str2, boolean z12, c.a.C0957a.C0958a.C0959a c0959a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f321235t = str;
            this.f321236u = eVar;
            this.f321237v = j12;
            this.f321238w = str2;
            this.f321239x = z12;
            this.f321240y = c0959a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f321235t, this.f321236u, this.f321237v, this.f321238w, this.f321239x, this.f321240y, continuation);
            aVar.f321234s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super VisualVasV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.visual_v2.domain.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k R0 r02, @k InterfaceC40020a interfaceC40020a) {
        this.f321230a = r02;
        this.f321231b = interfaceC40020a;
    }

    @k
    public final InterfaceC43160i<VisualVasV2InternalAction> a(long j12, @k String str, boolean z12, @k c.a.C0957a.C0958a.C0959a c0959a, @k String str2) {
        return C43175k.I(this.f321230a.a(), C43175k.G(new a(str2, this, j12, str, z12, c0959a, null)));
    }
}

package com.avito.android.installments.fakedoor;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsFakedoorInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/fakedoor/e;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<XN.a> f172526a;

    /* renamed from: b, reason: collision with root package name */
    public final long f172527b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f172528c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f172529d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f172530e;

    /* renamed from: f, reason: collision with root package name */
    public final long f172531f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f172532g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f172533h;

    /* compiled from: InstallmentsFakedoorInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTN/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.installments.fakedoor.InstallmentsFakedoorInteractor$requestFakedoorFlow$1", f = "InstallmentsFakedoorInteractor.kt", i = {0, 1}, l = {34, 35, 44, 48}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TN.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f172534q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f172535r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f172535r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TN.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installments.fakedoor.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k h31.e<XN.a> eVar, @com.avito.android.installments.fakedoor.di.h long j12, @com.avito.android.installments.fakedoor.di.g @Y61.k String str, @Y61.k @com.avito.android.installments.fakedoor.di.a DeepLink deepLink, @com.avito.android.installments.fakedoor.di.b @Y61.k String str2, @com.avito.android.installments.fakedoor.di.i long j13, @com.avito.android.installments.fakedoor.di.d @Y61.k String str3, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f172526a = eVar;
        this.f172527b = j12;
        this.f172528c = str;
        this.f172529d = deepLink;
        this.f172530e = str2;
        this.f172531f = j13;
        this.f172532g = str3;
        this.f172533h = interfaceC28373a;
    }

    @Y61.k
    public final InterfaceC43160i<TN.b> a() {
        return C43175k.G(new a(null));
    }
}

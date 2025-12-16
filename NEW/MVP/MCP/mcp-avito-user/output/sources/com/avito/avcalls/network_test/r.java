package com.avito.avcalls.network_test;

import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: NetworkTestRunner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.network_test.NetworkTestRunner$runNetworkTest$1", f = "NetworkTestRunner.kt", i = {0, 1, 1, 1}, l = {36, 40}, m = "invokeSuspend", n = {"configFetchStart", Navigation.CONFIG, "configFetchStart", "configFetchEnd"}, s = {"J$0", "L$0", "J$0", "J$1"})
/* loaded from: classes5.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f333031q;

    /* renamed from: r, reason: collision with root package name */
    public long f333032r;

    /* renamed from: s, reason: collision with root package name */
    public a f333033s;

    /* renamed from: t, reason: collision with root package name */
    public int f333034t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f333035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f333036v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f333037w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C43238h f333038x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_avcalls.impl_module.network_test.j f333039y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, String str, String str2, C43238h c43238h, com.avito.android.iac_avcalls.impl_module.network_test.j jVar, Continuation continuation) {
        super(2, continuation);
        this.f333035u = oVar;
        this.f333036v = str;
        this.f333037w = str2;
        this.f333038x = c43238h;
        this.f333039y = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43238h c43238h = this.f333038x;
        com.avito.android.iac_avcalls.impl_module.network_test.j jVar = this.f333039y;
        return new r(this.f333035u, this.f333036v, this.f333037w, c43238h, jVar, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.network_test.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

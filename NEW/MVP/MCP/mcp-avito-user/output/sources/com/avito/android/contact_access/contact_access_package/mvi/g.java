package com.avito.android.contact_access.contact_access_package.mvi;

import Dr.AbstractC13435b;
import Y41.p;
import com.avito.android.contact_access.contact_access_package.mvi.entity.ContactAccessPackageState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ContactAccessPackageActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDr/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.contact_access.contact_access_package.mvi.ContactAccessPackageActor$process$1", f = "ContactAccessPackageActor.kt", i = {0, 0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 30, 34, 40, 51, 60}, m = "invokeSuspend", n = {"$this$flow", "isEmployee", "$this$flow"}, s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super Dr.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f125896q;

    /* renamed from: r, reason: collision with root package name */
    public int f125897r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f125898s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC13435b f125899t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContactAccessPackageState f125900u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f125901v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC13435b abstractC13435b, ContactAccessPackageState contactAccessPackageState, h hVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f125899t = abstractC13435b;
        this.f125900u = contactAccessPackageState;
        this.f125901v = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f125899t, this.f125900u, this.f125901v, continuation);
        gVar.f125898s = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Dr.c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.contact_access.contact_access_package.mvi.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

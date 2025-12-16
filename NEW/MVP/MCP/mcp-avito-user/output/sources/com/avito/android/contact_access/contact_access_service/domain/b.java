package com.avito.android.contact_access.contact_access_service.domain;

import Y41.q;
import com.avito.android.remote.model.ContactAccessService;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.contact_access.contact_access_service.domain.ContactAccessServiceInteractorImpl$loadService$$inlined$flatMapLatest$1", f = "ContactAccessServiceInteractor.kt", i = {}, l = {222, 230, 189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class b extends SuspendLambda implements q<InterfaceC43172j<? super P2<? super ContactAccessService>>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f125953q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f125954r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f125955s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f125956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Continuation continuation, f fVar) {
        super(3, continuation);
        this.f125956t = fVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super P2<? super ContactAccessService>> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        b bVar = new b(continuation, this.f125956t);
        bVar.f125954r = interfaceC43172j;
        bVar.f125955s = bool;
        return bVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0225  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.contact_access.contact_access_service.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

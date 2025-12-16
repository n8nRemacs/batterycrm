package com.avito.android.edit_count_field.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uy.C49127c;
import uy.InterfaceC49125a;

/* compiled from: EditCountFieldActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_count_field.mvi.EditCountFieldActor$process$1", f = "EditCountFieldActor.kt", i = {0, 1, 1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "isValid"}, s = {"L$0", "L$0", "Z$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super EditCountFieldInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f146625q;

    /* renamed from: r, reason: collision with root package name */
    public int f146626r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f146627s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49125a f146628t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f146629u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C49127c f146630v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC49125a interfaceC49125a, c cVar, C49127c c49127c, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f146628t = interfaceC49125a;
        this.f146629u = cVar;
        this.f146630v = c49127c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f146628t, this.f146629u, this.f146630v, continuation);
        aVar.f146627s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EditCountFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_count_field.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

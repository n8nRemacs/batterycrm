package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.SetProfileNameActor$handleDeeplinkResult$1", f = "SetProfileNameActor.kt", i = {}, l = {JfifUtil.MARKER_EOI, 235, 251, 260, 274}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SetProfileNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212129q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f212130r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f212131s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f212132t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f212133u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, InterfaceC14249c interfaceC14249c, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f212131s = str;
        this.f212132t = interfaceC14249c;
        this.f212133u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f212131s, this.f212132t, this.f212133u, continuation);
        cVar.f212130r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SetProfileNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

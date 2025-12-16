package com.avito.android.passport.profile_add.merge.domain;

import Y41.p;
import Y61.l;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PassportAccountsMergeInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$getProfilesList$1", f = "PassportAccountsMergeInteractor.kt", i = {0, 1}, l = {166, 167, 170, 181, 190}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super ProfilesListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213027q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213028r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f213029s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MergeFlow f213030t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, MergeFlow mergeFlow, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f213029s = bVar;
        this.f213030t = mergeFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f213029s, this.f213030t, continuation);
        eVar.f213028r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ProfilesListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

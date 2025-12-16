package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.adapter.toggle.RegularToggleItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processRegularToggleItemAction$1", f = "ExtendedProfileSettingsActor.kt", i = {0, 1, 2, 3, 3, 4, 4}, l = {437, 446, 452, 463, 468, 475}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "error", "$this$flow", "error"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.profile_settings_extended.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33498t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Throwable f230741q;

    /* renamed from: r, reason: collision with root package name */
    public int f230742r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f230743s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33480a f230744t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RegularToggleItem f230745u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33498t(C33480a c33480a, RegularToggleItem regularToggleItem, Continuation<? super C33498t> continuation) {
        super(2, continuation);
        this.f230744t = c33480a;
        this.f230745u = regularToggleItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33498t c33498t = new C33498t(this.f230744t, this.f230745u, continuation);
        c33498t.f230743s = obj;
        return c33498t;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33498t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.C33498t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

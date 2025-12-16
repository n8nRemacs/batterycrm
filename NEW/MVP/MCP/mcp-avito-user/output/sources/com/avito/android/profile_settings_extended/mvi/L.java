package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$swapGalleryItems$1", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {491}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class L extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230480q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230481r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile_settings_extended.entity.u f230482s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f230483t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f230484u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f230485v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(com.avito.android.profile_settings_extended.entity.u uVar, String str, String str2, String str3, Continuation<? super L> continuation) {
        super(2, continuation);
        this.f230482s = uVar;
        this.f230483t = str;
        this.f230484u = str2;
        this.f230485v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        L l12 = new L(this.f230482s, this.f230483t, this.f230484u, this.f230485v, continuation);
        l12.f230481r = obj;
        return l12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((L) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.L.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

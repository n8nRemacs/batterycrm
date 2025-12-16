package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.analytics.ExtendedProfileAddAddressEvent;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processGeoV2Action$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C33480a f230726q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yc0.p f230727r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C33480a c33480a, yc0.p pVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f230726q = c33480a;
        this.f230727r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f230726q, this.f230727r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C33480a c33480a = this.f230726q;
        String strA = c33480a.f230510k.a();
        if (strA != null) {
            c33480a.f230512m.c(new ExtendedProfileAddAddressEvent(strA, ExtendedProfileAddAddressEvent.ActionType.f229968e));
        }
        c33480a.e(null, this.f230727r.f443326a, null);
        return G0.f406611a;
    }
}

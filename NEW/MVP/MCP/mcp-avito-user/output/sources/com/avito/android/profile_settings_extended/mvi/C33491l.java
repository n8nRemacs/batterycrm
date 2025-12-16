package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yc0.InterfaceC50220d;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processBasicInfoV2Action$2", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {770}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33491l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230707q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230708r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50220d f230709s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33491l(InterfaceC50220d interfaceC50220d, Continuation<? super C33491l> continuation) {
        super(2, continuation);
        this.f230709s = interfaceC50220d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33491l c33491l = new C33491l(this.f230709s, continuation);
        c33491l.f230708r = obj;
        return c33491l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33491l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230707q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230708r;
            BasicInfoV2Item basicInfoV2Item = ((InterfaceC50220d.k) this.f230709s).f443241a;
            ModerationStatus moderationStatus = basicInfoV2Item.f229213i;
            if (moderationStatus instanceof ModerationStatus.ModerationFailed ? true : moderationStatus instanceof ModerationStatus.ModerationPending) {
                ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenUserNameModerationStatusMenu openUserNameModerationStatusMenu = new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenUserNameModerationStatusMenu(basicInfoV2Item);
                this.f230707q = 1;
                if (interfaceC43172j.emit(openUserNameModerationStatusMenu, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                boolean z12 = moderationStatus instanceof ModerationStatus.ModerationPassed;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

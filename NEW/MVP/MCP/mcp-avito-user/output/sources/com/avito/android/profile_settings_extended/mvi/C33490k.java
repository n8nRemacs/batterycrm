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
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processBasicInfoV2Action$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {752, 757}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33490k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230704q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230705r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50220d f230706s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33490k(InterfaceC50220d interfaceC50220d, Continuation<? super C33490k> continuation) {
        super(2, continuation);
        this.f230706s = interfaceC50220d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33490k c33490k = new C33490k(this.f230706s, continuation);
        c33490k.f230705r = obj;
        return c33490k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33490k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230704q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230705r;
            BasicInfoV2Item basicInfoV2Item = ((InterfaceC50220d.a) this.f230706s).f443230a;
            ModerationStatus moderationStatus = basicInfoV2Item.f229214j.f229224d;
            if (moderationStatus instanceof ModerationStatus.ModerationFailed ? true : moderationStatus instanceof ModerationStatus.ModerationPending) {
                ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenAvatarModerationStatusMenu openAvatarModerationStatusMenu = new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenAvatarModerationStatusMenu(basicInfoV2Item);
                this.f230704q = 1;
                if (interfaceC43172j.emit(openAvatarModerationStatusMenu, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(moderationStatus instanceof ModerationStatus.ModerationPassed) && moderationStatus != null) {
                    z12 = false;
                }
                if (z12) {
                    ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenBasicInfoEditor openBasicInfoEditor = new ExtendedProfileSettingsInternalAction.BasicInfoV2InternalAction.OpenBasicInfoEditor(basicInfoV2Item);
                    this.f230704q = 2;
                    if (interfaceC43172j.emit(openBasicInfoEditor, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

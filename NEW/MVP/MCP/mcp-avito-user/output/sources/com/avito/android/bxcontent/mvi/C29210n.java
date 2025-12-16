package com.avito.android.bxcontent.mvi;

import Ju.InterfaceC14249c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: BxContentActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "event", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$subscribeOnDeeplinkHandlerResult$1", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29210n extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112487q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29105a f112488r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29210n(C29105a c29105a, Continuation<? super C29210n> continuation) {
        super(2, continuation);
        this.f112488r = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29210n c29210n = new C29210n(this.f112488r, continuation);
        c29210n.f112487q = obj;
        return c29210n;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((C29210n) create(c43501a, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f112487q;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof JobApplyCreateLink.b.a;
        C29105a c29105a = this.f112488r;
        com.avito.android.deeplink_handler.handler.composite.a aVar = c29105a.f111527a;
        if (z12) {
            b.a.a(aVar, ((JobApplyCreateLink.b.a) interfaceC14249c).f134084b, null, c29105a.h(), 2);
        } else if (interfaceC14249c instanceof JobApplyCreateLink.b.C4032b) {
            b.a.a(aVar, ((JobApplyCreateLink.b.C4032b) interfaceC14249c).f134085b, null, null, 6);
        } else if (interfaceC14249c instanceof CvValidationLink.b.C3943b) {
            b.a.a(aVar, new CreateChannelLink(((CvValidationLink.b.C3943b) interfaceC14249c).f131799b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null), null, c29105a.h(), 2);
        }
        boolean zBooleanValue = c29105a.f111538l.w().invoke().booleanValue();
        InterfaceC14249c interfaceC14249c2 = c43501a.f413261b;
        if (zBooleanValue) {
            boolean zF2 = kotlin.jvm.internal.L.f(interfaceC14249c2, IacMiuiDisplayOnLockedScreenPermissionLink.b.c.f169085b) ? true : kotlin.jvm.internal.L.f(interfaceC14249c2, IacMiuiDisplayOnLockedScreenPermissionLink.b.a.f169083b);
            com.avito.android.onboarding.q qVar = c29105a.f111521E;
            if (zF2) {
                qVar.b((3 & 1) != 0, (3 & 2) != 0);
            } else {
                if (kotlin.jvm.internal.L.f(interfaceC14249c2, IacMiuiDisplayOnLockedScreenPermissionLink.b.C5003b.f169084b) ? true : kotlin.jvm.internal.L.f(interfaceC14249c2, IacMiuiDisplayOnLockedScreenPermissionLink.b.d.f169086b)) {
                    qVar.b((3 & 1) != 0, (3 & 2) != 0);
                }
            }
        }
        com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
        String str = aVar2.f134521b;
        boolean zF3 = kotlin.jvm.internal.L.f(str, "main_start_onboarding_miui_sheet_request_key");
        com.avito.android.main_start_onboarding.a aVar3 = c29105a.f111548v;
        Bundle bundle = aVar2.f134522c;
        if (zF3) {
            if ((interfaceC14249c2 instanceof InterfaceC14249c.b) && bundle != null) {
                MainStartOnboardingStep mainStartOnboardingStep = (MainStartOnboardingStep) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("main_start_onboarding_miui_sheet_bundle_key", MainStartOnboardingStep.class) : bundle.getParcelable("main_start_onboarding_miui_sheet_bundle_key"));
                if (mainStartOnboardingStep != null) {
                    aVar3.c(mainStartOnboardingStep);
                }
            }
        } else if (kotlin.jvm.internal.L.f(str, "main_start_onboarding_notification_request_key") && bundle != null) {
            MainStartOnboardingStep mainStartOnboardingStep2 = (MainStartOnboardingStep) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("main_start_onboarding_notification_bundle_key", MainStartOnboardingStep.class) : bundle.getParcelable("main_start_onboarding_notification_bundle_key"));
            if (mainStartOnboardingStep2 != null) {
                aVar3.c(mainStartOnboardingStep2);
            }
        }
        return C43175k.w();
    }
}

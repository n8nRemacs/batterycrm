package com.avito.android.profile.user_profile.mvi;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import com.avito.android.O1;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.safety.deeplink.SafetySettingsLink;
import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import com.avito.android.wallet.page.deeplink.WalletLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import l90.l;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$deeplinkHandlerFlow$$inlined$flatMapLatest$1", f = "UserProfileActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile.user_profile.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33392e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226406q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f226407r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f226408s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33388a f226409t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33392e(C33388a c33388a, Continuation continuation) {
        super(3, continuation);
        this.f226409t = c33388a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, C43501a c43501a, Continuation<? super G0> continuation) {
        C33392e c33392e = new C33392e(this.f226409t, continuation);
        c33392e.f226407r = interfaceC43172j;
        c33392e.f226408s = c43501a;
        return c33392e.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226406q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f226407r;
            C43501a c43501a = (C43501a) this.f226408s;
            boolean zF2 = kotlin.jvm.internal.L.f(c43501a.f413260a.f134521b, "req_deep_link_user_profile");
            C33388a c33388a = this.f226409t;
            if (zF2) {
                interfaceC43160iD = C33388a.d(c33388a, 3);
            } else {
                com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
                String str = aVar.f134521b;
                boolean zF3 = kotlin.jvm.internal.L.f(str, "req_user_address");
                InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                if (zF3 && (interfaceC14249c instanceof UserAddressLink.Result.Success)) {
                    interfaceC43160iD = C43175k.G(new C33393f(c43501a, c33388a, null));
                } else if (kotlin.jvm.internal.L.f(str, "req_social_networks") && (interfaceC14249c instanceof AbstractC14250d.c)) {
                    interfaceC43160iD = C33388a.d(c33388a, 3);
                } else if (interfaceC14249c instanceof l.b) {
                    interfaceC43160iD = C43175k.G(new C33394g(c43501a, c33388a, null));
                } else if (aVar.f134520a instanceof SafetySettingsLink) {
                    interfaceC43160iD = C43175k.G(new C33395h(c43501a, c33388a, null));
                } else if (interfaceC14249c instanceof O1.a) {
                    interfaceC43160iD = C33388a.d(c33388a, 3);
                } else if (interfaceC14249c instanceof WalletLink.a) {
                    WalletLink.a aVar2 = (WalletLink.a) interfaceC14249c;
                    if (aVar2.equals(WalletLink.a.b.f327766b)) {
                        interfaceC43160iD = C33388a.d(c33388a, 3);
                    } else {
                        if (!(aVar2 instanceof WalletLink.a.C10160a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str2 = ((WalletLink.a.C10160a) aVar2).f327765b;
                        interfaceC43160iD = str2 != null ? new C43210w(new UserProfileInternalAction.ShowSnackBar(str2)) : C43175k.w();
                    }
                } else {
                    interfaceC43160iD = interfaceC14249c instanceof ServiceBookingCalendarMonthLink.c.b ? C33388a.d(c33388a, 3) : C43175k.w();
                }
            }
            this.f226406q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
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

package com.avito.android.extended_profile.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.PublicRatingDetailsLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.auth.PhoneAddLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.extended_profile.InterfaceC30394c;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_phone_dialog.deep_linking.d;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$deeplinkHandlerFlow$1", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30453c extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150139q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30451a f150140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.extended_profile.mvi.entity.a> f150141s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30453c(Y41.a aVar, C30451a c30451a, Continuation continuation) {
        super(2, continuation);
        this.f150140r = c30451a;
        this.f150141s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30453c c30453c = new C30453c(this.f150141s, this.f150140r, continuation);
        c30453c.f150139q = obj;
        return c30453c;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
        return ((C30453c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f150139q).f413261b;
        boolean z12 = interfaceC14249c instanceof d.b.C4431d;
        C30451a c30451a = this.f150140r;
        if (z12) {
            return new C43210w(new ExtendedProfileInternalAction.ShowPhoneDialog(((d.b.C4431d) interfaceC14249c).f151579c, c30451a.f150086t.a()));
        }
        if (interfaceC14249c instanceof PublicRatingDetailsLink.b.C3980b) {
            String str = ((PublicRatingDetailsLink.b.C3980b) interfaceC14249c).f132857b;
            return str != null ? new C43210w(new ExtendedProfileInternalAction.ShowCustomToastBar(com.avito.android.printable_text.b.f(str), ToastBarPosition.f181047e, null, 4, null)) : C43175k.w();
        }
        if (interfaceC14249c instanceof PhoneAddLink.c.C4027c) {
            return c30451a.f150071e.a(c30451a.f150070d, c30451a.f150069c, c30451a.f150067a, c30451a.f150068b, true);
        }
        boolean z13 = interfaceC14249c instanceof JobApplyCreateLink.b.a;
        Y41.a<com.avito.android.extended_profile.mvi.entity.a> aVar = this.f150141s;
        return z13 ? InterfaceC30394c.a.a(c30451a.f150084r, aVar.invoke(), ((JobApplyCreateLink.b.a) interfaceC14249c).f134084b, 4) : interfaceC14249c instanceof JobApplyCreateLink.b.C4032b ? InterfaceC30394c.a.a(c30451a.f150084r, aVar.invoke(), ((JobApplyCreateLink.b.C4032b) interfaceC14249c).f134085b, 4) : interfaceC14249c instanceof CvValidationLink.b.C3943b ? InterfaceC30394c.a.a(c30451a.f150084r, aVar.invoke(), new CreateChannelLink(((CvValidationLink.b.C3943b) interfaceC14249c).f131799b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null), 4) : C43175k.w();
    }
}

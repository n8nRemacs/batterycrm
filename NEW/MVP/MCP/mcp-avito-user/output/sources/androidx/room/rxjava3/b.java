package androidx.room.rxjava3;

import Oq.InterfaceC14725a;
import arrow.core.AbstractC23662a;
import arrow.core.X0;
import com.avito.android.account.C27672j;
import com.avito.android.advert.deeplinks.delivery.q;
import com.avito.android.analytics.clickstream.event.FirebaseUploadErrorClickStreamEventType;
import com.avito.android.analytics.clickstream.k0;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.MessageListLoadingException;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.menu.C32115g;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.conversation.mvi.voice.E;
import com.avito.android.messenger.support.j;
import com.avito.android.messenger.support.k;
import com.avito.android.publish.edit_advert_request.a;
import com.avito.android.push.impl_module.fcm.FcmTokenReceivingException;
import com.avito.android.push.impl_module.fcm.i;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import fg0.InterfaceC40417a;
import fg0.f;
import i91.C41257b;
import io.reactivex.rxjava3.internal.operators.maybe.K;
import kotlin.G0;
import kotlin.text.C43066x;
import l41.o;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54390c;

    public /* synthetic */ b(k kVar, j.b bVar) {
        this.f54389b = 14;
        this.f54390c = kVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object obj2 = this.f54390c;
        switch (this.f54389b) {
            case 0:
                return (K) obj2;
            case 1:
                return new P2.a(((C27672j) obj2).f68151g.a((Throwable) obj));
            case 2:
                return new P2.a(((q) obj2).f68962c.a((Throwable) obj));
            case 3:
                Throwable th2 = (Throwable) obj;
                k0 k0Var = (k0) obj2;
                if (k0Var.f89811b.g().invoke().booleanValue()) {
                    Throwable cause = th2.getCause();
                    k0Var.f89812c.c(new cc.d(String.valueOf(cause != null ? cause.getMessage() : null), FirebaseUploadErrorClickStreamEventType.f89785d));
                }
                return ShortTask.Status.f274031c;
            case 4:
                return new P2.a(((com.avito.android.beduin.common.component.photo_picker.data.d) obj2).f101965d.a((Throwable) obj));
            case 5:
                InterfaceC31860t.a aVar = (InterfaceC31860t.a) obj2;
                return InterfaceC31860t.a.a(aVar, null, aVar.f188565b - 1, 1);
            case 6:
                return (InterfaceC31987a.C5631a) obj2;
            case 7:
                Throwable th3 = (Throwable) obj;
                C32115g c32115g = (C32115g) obj2;
                c32115g.f191437d0.accept(new AbstractC23662a.b(th3));
                V2.f318762a.a(c32115g.f207131E, "MarkChannelAsDeletedLocallyAction failed", th3);
                return G0.f406611a;
            case 8:
                V2.f318762a.a("AddQuickReplyElementProvider", "Error in AddQuickReplyAction(" + ((c.a) obj2).f191731d + ')', (Throwable) obj);
                return G0.f406611a;
            case 9:
                Throwable th4 = (Throwable) obj;
                C32141e c32141e = (C32141e) obj2;
                c32141e.f192913g0.e();
                c32141e.f192914h0.e();
                V2.f318762a.j(c32141e.f207131E, "FirstPageLoadError: " + th4, null);
                InterfaceC14725a.C0808a.a(c32141e.f192910d0, new MessageListLoadingException("Failed to load messages", th4), null, 6);
                return InterfaceC32129a.c.b.f192126a;
            case 10:
                Throwable th5 = (Throwable) obj;
                com.avito.android.messenger.conversation.mvi.quick_replies.f fVar = (com.avito.android.messenger.conversation.mvi.quick_replies.f) obj2;
                fVar.f194103Z.postValue(InterfaceC35741a1.a.a(fVar.f194101X, th5, null, null, 6));
                V2.f318762a.j(fVar.f207131E, "LoadMutator failed", th5);
                return d.a.C5744a.f194092a;
            case 11:
                return (SendMessagePresenter.State) obj2;
            case 12:
                Throwable th6 = (Throwable) obj;
                com.avito.android.messenger.conversation.mvi.video.j jVar = (com.avito.android.messenger.conversation.mvi.video.j) obj2;
                jVar.f195008c0.accept(th6);
                X2.f318778a.a(jVar.f207131E, "BubbleClickMutator error", th6);
                return G0.f406611a;
            case 13:
                X2.f318778a.a(((E) obj2).f207131E, "fileStorageHelper.readFileInfoByContentUri() failed!", (Throwable) obj);
                return X0.f56264b;
            case 14:
                k kVar = (k) obj2;
                kVar.f197403Y.postValue(InterfaceC35741a1.a.a(kVar.f197402X, (Throwable) obj, null, null, 6));
                return new j.b(j.a.C5814a.f197394a);
            case 15:
                return obj2;
            case 16:
                int i12 = com.avito.android.publish.edit_advert_request.a.f235450e;
                return new a.InterfaceC7097a.b(new TypedResult.Success((EditAdvertResult.Ok) obj2));
            case 17:
                return new P2.a(((com.avito.android.publish.slots.contact_info.d) obj2).f243228f.a((Throwable) obj));
            case 18:
                i.a aVar2 = i.f245950g;
                String message = ((Throwable) obj).getMessage();
                FcmTokenReceivingException fisAuth = message != null ? C43066x.q(message, "FIS_AUTH_ERROR", false) ? new FcmTokenReceivingException.FisAuth() : C43066x.q(message, "TOO_MANY_REGISTRATIONS", false) ? new FcmTokenReceivingException.TooManyRegistration() : C43066x.q(message, "AUTHENTICATION_FAILED", false) ? new FcmTokenReceivingException.AuthenticationFailed() : C43066x.q(message, "PHONE_REGISTRATION_ERROR", false) ? new FcmTokenReceivingException.PhoneRegistration() : C43066x.q(message, "SERVICE_NOT_AVAILABLE", false) ? new FcmTokenReceivingException.ServiceNotAvailable() : new FcmTokenReceivingException.UnidentifiedRootMessage() : new FcmTokenReceivingException.NullRootMessage();
                String message2 = fisAuth.getMessage();
                String str = message2 == null ? "Can't receive push token" : message2;
                String message3 = fisAuth.getMessage();
                ((i) obj2).f245954c.c(new NonFatalErrorEvent(str, fisAuth, null, new NonFatalErrorEvent.a.b(InterfaceC40417a.class, message3 == null ? "Can't receive push token" : message3, 0, 4, null), 4, null));
                return new f.a(fisAuth.f245944b);
            case 19:
                int i13 = com.avito.android.push.impl_module.token.providing.f.f245991c;
                ((com.avito.android.push.impl_module.token.providing.f) obj2).f245993b.c(new y.a("calls.empty_token", 0L, 2, null));
                return new fg0.e("", null);
            case 20:
                return new P2.a(((com.avito.android.user_advert.advert.delegate.auto_publish.g) obj2).f308531f.a((Throwable) obj));
            case 21:
                return new P2.a(((com.avito.android.user_advert.advert.delegate.installments.f) obj2).f308610f.a((Throwable) obj));
            case 22:
                return new P2.a(((com.avito.android.user_advert.advert.realty_verification.c) obj2).f310594c.a((Throwable) obj));
            case 23:
                return new P2.a(((com.avito.android.verification.verification_input_inn.g) obj2).f325615c.a((Throwable) obj));
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return ((C41257b) obj2).f398411c;
            default:
                return (InterfaceC47751d.b) obj2;
        }
    }

    public /* synthetic */ b(Object obj, int i12) {
        this.f54389b = i12;
        this.f54390c = obj;
    }
}

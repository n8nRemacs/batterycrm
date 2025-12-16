package com.avito.android.messenger.blacklist.mvi;

import android.content.Intent;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.view.C23060r0;
import com.avito.android.R;
import com.avito.android.category_parameters.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.conversation.mvi.voice.C32306a;
import com.avito.android.messenger.deeplink.O0;
import com.avito.android.messenger.service.direct_reply.DirectReplyIntentService;
import com.avito.android.preloading.j;
import com.avito.android.publish.file_uploader.C33855c;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.util.X2;
import com.avito.android.verification.links.mts.VerificationMTSLink;
import com.avito.android.verification.links.mts.i;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.G0;
import l41.InterfaceC43543a;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.blacklist.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C31684n implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f186481c;

    public /* synthetic */ C31684n(Object obj, int i12) {
        this.f186480b = i12;
        this.f186481c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.avito.android.publish.details.auction.d$a, java.lang.Object] */
    @Override // l41.InterfaceC43543a
    public final void run() {
        DeepLink deepLink;
        g0 = null;
        G0 g02 = null;
        switch (this.f186480b) {
            case 0:
                ((hu.akarnokd.rxjava3.schedulers.c) this.f186481c).g();
                return;
            case 1:
                ((com.avito.android.messenger.conversation.mvi.in_app_calls.a) this.f186481c).f191358c0.accept(Boolean.FALSE);
                return;
            case 2:
                X2 x22 = X2.f318778a;
                StringBuilder sb2 = new StringBuilder("Message saved to database: channelId=");
                ChatMessage chatMessage = (ChatMessage) this.f186481c;
                sb2.append(chatMessage.getChannelId());
                sb2.append(", remoteId=");
                sb2.append(chatMessage.getId());
                x22.i("MessageSyncAgent", sb2.toString(), null);
                return;
            case 3:
                InterfaceC23144m interfaceC23144m = ((C32306a) this.f186481c).f195101N;
                if (interfaceC23144m != null) {
                    interfaceC23144m.stop();
                    return;
                }
                return;
            case 4:
                O0 o02 = (O0) this.f186481c;
                o02.f195391j.g(o02.d(), false);
                C23060r0 c23060r0 = o02.f395446d;
                (c23060r0 != null ? c23060r0 : null).d("sendingStatus");
                return;
            case 5:
                ((DirectReplyIntentService) this.f186481c).a(R.string.messenger_direct_reply_successful);
                return;
            case 6:
                ((InterfaceC23144m) this.f186481c).stop();
                return;
            case 7:
                com.avito.android.preloading.j jVar = (com.avito.android.preloading.j) this.f186481c;
                synchronized (jVar.f221857d) {
                    jVar.f221859f = null;
                    jVar.f221858e = null;
                    G0 g03 = G0.f406611a;
                }
                return;
            case 8:
                j.a aVar = com.avito.android.preloading.j.f221853g;
                ((Y41.a) this.f186481c).invoke();
                return;
            case 9:
                ((com.avito.android.progress_info_toast_bar.presenter.b) this.f186481c).f231566h = null;
                return;
            case 10:
                ?? r02 = ((com.avito.android.publish.details.auction.e) this.f186481c).f233479m;
                if (r02 != 0) {
                    r02.E0();
                    return;
                }
                return;
            case 11:
                int i12 = C33855c.f235676d;
                DisposableHelper.a((io.reactivex.rxjava3.internal.observers.y) this.f186481c);
                return;
            case 12:
                ((com.avito.android.publish.slots.fashion_authentication_check_banner.item.j) this.f186481c).Sq();
                return;
            case 13:
                ((com.avito.android.publish.slots.universal_beduin.i) this.f186481c).f245060m.accept(new f.b(SlotType.UNIVERSAL_BEDUIN, null));
                return;
            case 14:
                com.avito.android.rating.publish.deep_linking.d dVar = (com.avito.android.rating.publish.deep_linking.d) this.f186481c;
                dVar.f247629h.g(dVar.d(), false);
                return;
            case 15:
                ((com.facebook.datasource.c) this.f186481c).close();
                return;
            case 16:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a aVar2 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a) this.f186481c;
                aVar2.f256899h.g(aVar2.d(), false);
                return;
            case 17:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.a aVar3 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.a) this.f186481c;
                aVar3.f256932h.g(aVar3.d(), false);
                return;
            case 18:
                com.avito.android.safety.sessions.social_logout.w wVar = ((com.avito.android.safety.sessions.social_logout.q) this.f186481c).f258051g;
                if (wVar != null) {
                    Button button = wVar.f258066d;
                    button.setLoading(false);
                    button.setClickable(true);
                    return;
                }
                return;
            case 19:
                com.avito.android.tariff.cpa.deeplink.d dVar2 = (com.avito.android.tariff.cpa.deeplink.d) this.f186481c;
                dVar2.f294568g.g(dVar2.d(), false);
                return;
            case 20:
                com.avito.android.tariff.cpa.deeplink.k kVar = (com.avito.android.tariff.cpa.deeplink.k) this.f186481c;
                kVar.f294584g.g(kVar.d(), false);
                return;
            case 21:
                com.avito.android.vas_performance.ui.stickers.buy.v vVar = (com.avito.android.vas_performance.ui.stickers.buy.v) this.f186481c;
                vVar.f321976R.postValue(new kotlin.Q<>(vVar.f321977S, Boolean.FALSE));
                return;
            case 22:
                int i13 = com.avito.android.verification.links.alfa.b.f324148s;
                com.avito.android.verification.links.alfa.b bVar = (com.avito.android.verification.links.alfa.b) this.f186481c;
                bVar.f324154k.g(bVar.d(), false);
                return;
            case 23:
                com.avito.android.verification.links.download.c cVar = (com.avito.android.verification.links.download.c) this.f186481c;
                cVar.f324190g.g(cVar.d(), false);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.verification.links.mts.f fVar = (com.avito.android.verification.links.mts.f) this.f186481c;
                fVar.f324302k.g(fVar.d(), false);
                VerificationMTSLink verificationMTSLinkC = fVar.c();
                if (verificationMTSLinkC != null && (deepLink = verificationMTSLinkC.f324286d) != null) {
                    fVar.i(i.c.f324318b, fVar.f324300i, deepLink);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    fVar.f324298g.X(-1, new Intent());
                    fVar.j(i.b.f324317b);
                    return;
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                com.avito.android.verification.links.remove.e eVar = (com.avito.android.verification.links.remove.e) this.f186481c;
                eVar.f324372g.g(eVar.d(), false);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.verification.links.restore.e eVar2 = (com.avito.android.verification.links.restore.e) this.f186481c;
                eVar2.f324391g.g(eVar2.d(), false);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i14 = com.avito.android.verification.links.sber_business.a.f324407o;
                com.avito.android.verification.links.sber_business.a aVar4 = (com.avito.android.verification.links.sber_business.a) this.f186481c;
                aVar4.f324411i.g(aVar4.d(), false);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i15 = com.avito.android.verification.links.sber_finish.c.f324445p;
                com.avito.android.verification.links.sber_finish.c cVar2 = (com.avito.android.verification.links.sber_finish.c) this.f186481c;
                cVar2.f324448h.g(cVar2.d(), false);
                return;
            default:
                com.avito.android.verification.links.tinkoff_finish.b bVar2 = (com.avito.android.verification.links.tinkoff_finish.b) this.f186481c;
                bVar2.f324560g.g(bVar2.d(), false);
                return;
        }
    }
}

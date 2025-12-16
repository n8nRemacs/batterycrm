package Fc1;

import Ju.AbstractC14250d;
import com.avito.android.ab_groups.q;
import com.avito.android.advert.C28245z;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.advert_core.task.FirstTimeRunTask;
import com.avito.android.analytics.statsd.y;
import com.avito.android.authorization.deep_linking.C28649c;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.image.enhancement.C30979j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.password_tip.PasswordTipInput;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.util.Arrays;
import kotlin.collections.C42784z0;
import l41.InterfaceC43543a;
import oJ.C44656c;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class E0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4894c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ E0(Y41.l lVar) {
        this.f4893b = 9;
        this.f4894c = (kotlin.jvm.internal.H) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // l41.InterfaceC43543a
    public final void run() {
        Object obj = this.f4894c;
        switch (this.f4893b) {
            case 0:
                ((F0) obj).f4931c.a();
                break;
            case 1:
                ((com.avito.android.ab_groups.q) obj).f67677K.postValue(new q.d.c(C42784z0.f406748b));
                break;
            case 2:
                com.avito.android.advert.item.Z0 z02 = ((C28245z) obj).f81075A;
                if (z02 != null) {
                    z02.v();
                    break;
                }
                break;
            case 3:
                ((com.avito.android.advert.d0) obj).Ic(true);
                break;
            case 4:
                com.avito.android.advert.deeplinks.a aVar = (com.avito.android.advert.deeplinks.a) obj;
                aVar.f68882f.g(aVar.d(), false);
                break;
            case 5:
                ((com.avito.android.advert.item.creditinfo.buzzoola.v) obj).f74995P = false;
                break;
            case 6:
                C28266e c28266e = (C28266e) obj;
                com.avito.android.advert_core.advert.c cVar = c28266e.f83171O;
                if (cVar != null) {
                    cVar.la();
                }
                c28266e.f83192e0 = null;
                break;
            case 7:
                FirstTimeRunTask.execute$lambda$0((FirstTimeRunTask) obj);
                break;
            case 8:
                ((com.avito.android.async_phone.s) obj).c();
                break;
            case 9:
                int i12 = com.avito.android.async_phone.public_module.loading_helper.a.f92237c;
                ((kotlin.jvm.internal.H) obj).invoke(PhoneLoadingState.f430441b);
                break;
            case 10:
                int i13 = com.avito.android.auth_passwordless.links.e.f92633j;
                ((com.avito.android.auth_passwordless.links.e) obj).j(AbstractC14250d.c.f9171c);
                break;
            case 11:
                com.avito.android.authorization.change_password.m mVar = (com.avito.android.authorization.change_password.m) obj;
                com.avito.android.authorization.change_password.s sVar = mVar.f93360e;
                if (sVar != null) {
                    PasswordTipInput passwordTipInput = sVar.f93379d;
                    com.avito.android.util.D6.k(passwordTipInput);
                    passwordTipInput.e();
                    passwordTipInput.setClickable(true);
                    Button button = sVar.f93378c;
                    button.setClickable(true);
                    button.setLoading(false);
                }
                com.avito.android.authorization.change_password.s sVar2 = mVar.f93360e;
                if (sVar2 != null) {
                    PasswordTipInput passwordTipInput2 = sVar2.f93379d;
                    Input input = passwordTipInput2.f213951b;
                    int[] f179312e = input.getF179312E();
                    Input.f179303W.getClass();
                    int[] iArr = Input.f179304a0;
                    if (!Arrays.equals(f179312e, iArr)) {
                        input.setState(iArr);
                    }
                    passwordTipInput2.c(passwordTipInput2.getText(), true);
                }
                mVar.f93364i = false;
                break;
            case 12:
                C28649c c28649c = (C28649c) obj;
                c28649c.f93753f.g(c28649c.d(), false);
                break;
            case 13:
                ((com.avito.android.authorization.deep_linking.A) obj).f93656j.g(null, false);
                break;
            case 14:
                com.avito.android.authorization.deep_linking.S s5 = (com.avito.android.authorization.deep_linking.S) obj;
                s5.f93710g.g(s5.d(), false);
                break;
            case 15:
                ((com.avito.android.authorization.gorelkin.n) obj).f93945O.postValue(m.b.d.f93938a);
                break;
            case 16:
                LoginActivity loginActivity = ((com.avito.android.authorization.login.u) obj).f94061A;
                if (loginActivity != null) {
                    loginActivity.a2(-1);
                    break;
                }
                break;
            case 17:
                com.avito.android.authorization.select_social.n nVar = (com.avito.android.authorization.select_social.n) obj;
                nVar.f94557n = null;
                com.avito.android.authorization.select_social.s sVar3 = nVar.f94553j;
                if (sVar3 != null) {
                    sVar3.a();
                    break;
                }
                break;
            case 18:
                ((com.avito.android.auto_reseller_contacts.deepLink.m) obj).f95748h.g(null, false);
                break;
            case 19:
                com.avito.android.deep_linking.universal_deeplink.e eVar = (com.avito.android.deep_linking.universal_deeplink.e) obj;
                eVar.f134049k.g(eVar.d(), false);
                break;
            case 20:
                com.avito.android.developments_advice.deeplink.d dVar = (com.avito.android.developments_advice.deeplink.d) obj;
                dVar.f136028l.g(dVar.d(), false);
                break;
            case 21:
                int i14 = com.avito.android.extended_profile_phone_dialog.deep_linking.d.f151566n;
                com.avito.android.extended_profile_phone_dialog.deep_linking.d dVar2 = (com.avito.android.extended_profile_phone_dialog.deep_linking.d) obj;
                dVar2.f151567f.g(dVar2.d(), false);
                break;
            case 22:
                com.avito.android.home.default_search_location.s sVar4 = (com.avito.android.home.default_search_location.s) obj;
                sVar4.f162407l.e();
                sVar4.f162411p = false;
                break;
            case 23:
                com.avito.android.iac_dialer.impl_module.audio.ringtone.a aVar2 = (com.avito.android.iac_dialer.impl_module.audio.ringtone.a) obj;
                if (aVar2.f165850c.getAndSet(false)) {
                    aVar2.f165848a.unregisterReceiver(aVar2);
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.iac_dialer.impl_module.audio.ringtone.i iVar = (com.avito.android.iac_dialer.impl_module.audio.ringtone.i) obj;
                if (iVar.f165874c.getAndSet(false)) {
                    iVar.f165872a.unregisterReceiver(iVar);
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((File) obj).delete();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                C44656c c44656c = C44656c.f419703a;
                IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164282c;
                c44656c.getClass();
                com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request.c cVar2 = (com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request.c) obj;
                cVar2.f168231i.c(new y.a(cVar2.f168230h.a("calls", "iac_enable", "{{%app_ver%}}", "true", C44656c.d(iacEnablingScenario)).f91030a, 1L));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((C30979j) obj).c();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Input) obj).setOnEditorActionListener(null);
                break;
            default:
                com.avito.android.loyalty.links.badges.e eVar2 = (com.avito.android.loyalty.links.badges.e) obj;
                eVar2.f183219f.g(eVar2.d(), false);
                break;
        }
    }

    public /* synthetic */ E0(Object obj, int i12) {
        this.f4893b = i12;
        this.f4894c = obj;
    }
}

package hD;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: AuthFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhD/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_authorization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hD.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40806a extends A0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f397105l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f397106b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f397107c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f397108d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f397109e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f397110f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f397111g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f397112h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final A0.a f397113i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final A0.a f397114j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final A0.a f397115k;

    static {
        h0 h0Var = new h0(C40806a.class, "useCredentialsManager", "getUseCredentialsManager()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f397105l = new n[]{n0Var.i(h0Var), C0.k(C40806a.class, "autoSendCode", "getAutoSendCode()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "loginSuggests", "getLoginSuggests()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "authFakeSocial", "getAuthFakeSocial()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "changeLegalLinks", "getChangeLegalLinks()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "showActualizePhonesScreen", "getShowActualizePhonesScreen()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "useConfirmResetPasswordV2", "getUseConfirmResetPasswordV2()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "useVkIdSocial", "getUseVkIdSocial()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "showVkGroupDialog", "getShowVkGroupDialog()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "esiaSDKForVerificationAndAuthorization", "getEsiaSDKForVerificationAndAuthorization()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "enablePasswordlessLogin", "getEnablePasswordlessLogin()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C40806a.class, "passwordlessLoginMode", "getPasswordlessLoginMode()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C40806a() {
        Owners owners = Owners.f210496i;
        Boolean bool = Boolean.TRUE;
        this.f397106b = A0.u(this, "Google credentials manager", "useCredentialsManager", bool, false, 0, owners, 40);
        this.f397107c = A0.u(this, "Автоматически отправляет код в CodeConfirmation, вызывает флаки в тестах", "autoSendCode", bool, false, 0, owners, 40);
        this.f397108d = A0.u(this, "Подсказки при авторизации", "login_suggests", bool, false, 0, owners, 40);
        Boolean bool2 = Boolean.FALSE;
        this.f397109e = A0.u(this, "Дополнительная иконка и логика фейковой соцсети для E2E тестов входа через соцсети", "authFakeSocial", bool2, false, 0, owners, 40);
        this.f397110f = A0.u(this, "Отображение нового data_policy документа в вебвью вместо старого richtext", "changeLegalLinks", bool, false, 0, owners, 56);
        this.f397111g = A0.u(this, "Отображение экрана актуализации телефонов на старте приложения и после авторизации", "showActualizePhonesScreen", bool, false, 0, owners, 56);
        this.f397112h = A0.u(this, "Использовать вторую версию ручки 2/recover/by_phone/confirm, поддержать безусловный переход по диплинку при ответе deep-link", "useConfirmResetPasswordV2", bool, false, 0, owners, 56);
        this.f397113i = A0.u(this, "Использовать SDK VK ID вместо SDK Vkontakte", "useVkIdSocial", bool, false, 0, owners, 56);
        this.f397114j = A0.u(this, "Показывать диалог подписки на сообщество Авито в ВК после входа через VK ID. Тоггл useVkIdSocial должен быть включен для корректной работы.", "showVkGroupDialog", bool2, false, 0, owners, 56);
        this.f397115k = A0.u(this, "Взаимодействие с ЕСИА ГУ с использованием SDK", "esiaSDKForVerificationAndAuthorization", bool2, false, 0, Owners.f210413H3, 56);
        Owners owners2 = Owners.f210536s;
        A0.u(this, "Включает A/B тест для беспарольного входа через звонок", "enablePasswordlessLogin", bool2, true, 0, owners2, 40);
        A0.u(this, "Беспарольный вход. Переключатель групп", "passwordlessLoginMode", new OptionSet("control", C42745f0.U("control", "test_voicecode", "test_call")), false, 0, owners2, 40);
    }

    @k
    public final DE0.a<Boolean> v() {
        n<Object> nVar = f397105l[3];
        return this.f397109e.a();
    }

    @k
    public final DE0.a<Boolean> w() {
        n<Object> nVar = f397105l[7];
        return this.f397113i.a();
    }
}

package com.avito.android.iac_dialer.impl_module.splitter.features;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: IacDialerFeatures.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/splitter/features/a;", "Lcom/avito/android/A0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a extends A0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f166390j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35950u f166391b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f166392c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f166393d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f166394e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f166395f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f166396g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f166397h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final A0.a f166398i;

    static {
        h0 h0Var = new h0(a.class, "dontEnableSpeakerPhoneOnVideoCall", "getDontEnableSpeakerPhoneOnVideoCall()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f166390j = new n[]{n0Var.i(h0Var), C0.k(a.class, "coreTelecomIncomingCallsForBuyers", "getCoreTelecomIncomingCallsForBuyers()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "coreTelecomIncomingCallsForSellers", "getCoreTelecomIncomingCallsForSellers()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "abCoreTelecomIncomingCallsForceTestGroup", "getAbCoreTelecomIncomingCallsForceTestGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "abCoreTelecomOutgoingCalls", "getAbCoreTelecomOutgoingCalls()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "abCoreTelecomOutgoingCallsForceTestGroup", "getAbCoreTelecomOutgoingCallsForceTestGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "enrichCallFinishScreenInFinalLinkInteractor", "getEnrichCallFinishScreenInFinalLinkInteractor()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a(@k InterfaceC35950u interfaceC35950u) {
        this.f166391b = interfaceC35950u;
        interfaceC35950u.getF125491k().getClass();
        Owners owners = Owners.f210442S;
        this.f166392c = A0.u(this, "Не включать автоматически громкую связь при начале видео-звонка", "iacDontEnableSpeakerPhoneOnVideoCall", false, false, 0, owners, 40);
        this.f166393d = A0.u(this, "Использовать для входящих звонков CoreTelecom для байеров", "iac_core_telecom_incoming_calls", Boolean.TRUE, false, 0, owners, 56);
        Boolean bool = Boolean.FALSE;
        this.f166394e = A0.u(this, "Использовать для входящих звонков CoreTelecom для селлеров", "iac_core_telecom_incoming_calls_enable_for_sellers", bool, false, 0, owners, 56);
        this.f166395f = A0.u(this, "В тесте iac_core_telecom_incoming_calls принудительно выбрать тестовую группу", "iac_core_telecom_incoming_calls_TEST_GROUP", bool, false, 0, owners, 40);
        this.f166396g = A0.u(this, "Использовать для исходящих звонков CoreTelecom", "iac_core_telecom_outgoing_calls", bool, false, 0, owners, 56);
        this.f166397h = A0.u(this, "В тесте iac_core_telecom_outgoing_calls принудительно выбрать тестовую группу", "iac_core_telecom_outgoing_calls_TEST_GROUP", bool, false, 0, owners, 40);
        this.f166398i = A0.u(this, "Вызывать 1/ip-calls/enrich/callFinishScreen в FinalLinkInteractor", "iac_enrichCallFinishScreenInFinalLinkInteractor", bool, false, 0, owners, 56);
    }
}

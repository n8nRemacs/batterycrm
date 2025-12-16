package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import com.avito.android.permissions.PermissionState;
import com.avito.android.permissions.z;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40161a;
import j.e0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.o;
import l41.r;
import nJ.J;
import nJ.O;
import rv.C47920c;

/* compiled from: IacPermissionMicAskLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_permission_mic_ask/a;", "Lev/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_permission_mic_ask/IacPermissionMicAskLink;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacPermissionMicAskLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f168245f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f168246g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.h f168247h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f168248i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final z f168249j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f168250k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f168251l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    @k
    public String f168252m = "";

    /* compiled from: IacPermissionMicAskLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_permission_mic_ask/a$a;", "", "<init>", "()V", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask.a$a, reason: collision with other inner class name */
    public static final class C4976a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C4976a f168253a = new C4976a();

        /* renamed from: b, reason: collision with root package name */
        @e0
        public static final int f168254b = R.string.iac_incoming_call_ability_public_mic_dialog_title;

        /* renamed from: c, reason: collision with root package name */
        @e0
        public static final int f168255c = R.string.iac_incoming_call_ability_public_mic_dialog_body;

        /* renamed from: d, reason: collision with root package name */
        @e0
        public static final int f168256d = R.string.iac_incoming_call_ability_public_mic_dialog_btn_settings;

        /* renamed from: e, reason: collision with root package name */
        @e0
        public static final int f168257e = R.string.iac_incoming_call_ability_public_mic_dialog_btn_cancel;
    }

    /* compiled from: IacPermissionMicAskLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: IacPermissionMicAskLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "it", "", "test", "(Ljava/util/Map;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f168258b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Map) obj).containsKey("android.permission.RECORD_AUDIO");
        }
    }

    /* compiled from: IacPermissionMicAskLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lrv/c;", "it", "apply", "(Ljava/util/Map;)Lrv/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f168259b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            C47920c c47920c = (C47920c) ((Map) obj).get("android.permission.RECORD_AUDIO");
            if (c47920c != null) {
                return c47920c;
            }
            C47920c.f437160c.getClass();
            return new C47920c(false, false);
        }
    }

    /* compiled from: IacPermissionMicAskLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/c;", "permissionResult", "Lkotlin/G0;", "accept", "(Lrv/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47920c c47920c = (C47920c) obj;
            PermissionState permissionState = c47920c.f437161a ? PermissionState.f215104b : c47920c.f437162b ? PermissionState.f215105c : PermissionState.f215106d;
            a aVar = a.this;
            aVar.f168249j.c(permissionState, "android.permission.RECORD_AUDIO");
            aVar.f168248i.c(new J(permissionState.b(), null, null, null, null, aVar.f168252m, 30, null));
            aVar.j(AbstractC14250d.c.f9171c);
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k a.d dVar, @k a.h hVar, @k InterfaceC28373a interfaceC28373a, @k z zVar, @k InterfaceC35845m2 interfaceC35845m2) {
        this.f168245f = interfaceC4053a;
        this.f168246g = dVar;
        this.f168247h = hVar;
        this.f168248i = interfaceC28373a;
        this.f168249j = zVar;
        this.f168250k = interfaceC35845m2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacPermissionMicAskLink iacPermissionMicAskLink = (IacPermissionMicAskLink) deepLink;
        this.f168252m = iacPermissionMicAskLink.f168402c;
        int iOrdinal = this.f168249j.b("android.permission.RECORD_AUDIO").ordinal();
        if (iOrdinal == 0) {
            j(AbstractC14250d.c.f9171c);
            return;
        }
        if (iOrdinal == 1) {
            this.f168247h.o0("android.permission.RECORD_AUDIO");
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        if (!iacPermissionMicAskLink.f168401b) {
            j(AbstractC14250d.c.f9171c);
            return;
        }
        this.f168248i.c(new O(CallsPopupType.f164278c, null, iacPermissionMicAskLink.f168402c, 2, null));
        this.f168246g.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask.e(this, iacPermissionMicAskLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f168251l.b(this.f168247h.W1().N(c.f168258b).d0(d.f168259b).t0(new e()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f168251l.e();
    }
}

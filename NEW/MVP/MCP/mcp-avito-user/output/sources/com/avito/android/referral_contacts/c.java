package com.avito.android.referral_contacts;

import Y61.k;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.remote.model.ParametrizedEvent;
import fv.C40482a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: ReferralContactsPermissionRequester.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/c;", "", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f252375c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f252376a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PermissionSystemRequestLink f252377b;

    /* compiled from: ReferralContactsPermissionRequester.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/referral_contacts/c$a;", "", "<init>", "()V", "", "requestKey", "Ljava/lang/String;", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ReferralContactsPermissionRequester.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/c$a$a;", "", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.referral_contacts.c$a$a, reason: collision with other inner class name */
        public static final class C7572a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C7572a f252378a = new C7572a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252379b = C42727D.c(C7573a.f252388l);

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252380c = C42727D.c(e.f252392l);

            /* renamed from: d, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252381d = C42727D.c(f.f252393l);

            /* renamed from: e, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252382e = C42727D.c(d.f252391l);

            /* renamed from: f, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252383f = C42727D.c(C7574c.f252390l);

            /* renamed from: g, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252384g = C42727D.c(b.f252389l);

            /* renamed from: h, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252385h = C42727D.c(g.f252394l);

            /* renamed from: i, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252386i = C42727D.c(h.f252395l);

            /* renamed from: j, reason: collision with root package name */
            @k
            public static final InterfaceC42726C f252387j = C42727D.c(i.f252396l);

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$a, reason: collision with other inner class name */
            public static final class C7573a extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final C7573a f252388l = new C7573a();

                public C7573a() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("alreadyGranted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$b */
            public static final class b extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final b f252389l = new b();

                public b() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("customSettingsPopupAccepted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$c, reason: collision with other inner class name */
            public static final class C7574c extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final C7574c f252390l = new C7574c();

                public C7574c() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("customSettingsPopupDenied");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$d */
            public static final class d extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final d f252391l = new d();

                public d() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("customSettingsPopupDisplayed");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$e */
            public static final class e extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final e f252392l = new e();

                public e() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("requestedAndGranted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$f */
            public static final class f extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final f f252393l = new f();

                public f() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("requestedAndNotGranted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$g */
            public static final class g extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final g f252394l = new g();

                public g() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("returnedFromSettingsAndGranted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$h */
            public static final class h extends N implements Y41.a<ChainEventLink> {

                /* renamed from: l, reason: collision with root package name */
                public static final h f252395l = new h();

                public h() {
                    super(0);
                }

                @Override // Y41.a
                public final ChainEventLink invoke() {
                    return new ChainEventLink("returnedFromSettingsAndNotGranted");
                }
            }

            /* compiled from: ReferralContactsPermissionRequester.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.referral_contacts.c$a$a$i */
            public static final class i extends N implements Y41.a<List<? extends ChainEventLink>> {

                /* renamed from: l, reason: collision with root package name */
                public static final i f252396l = new i();

                public i() {
                    super(0);
                }

                @Override // Y41.a
                public final List<? extends ChainEventLink> invoke() {
                    C7572a.f252378a.getClass();
                    return C42745f0.U((ChainEventLink) C7572a.f252379b.getValue(), (ChainEventLink) C7572a.f252380c.getValue(), (ChainEventLink) C7572a.f252381d.getValue(), (ChainEventLink) C7572a.f252383f.getValue(), (ChainEventLink) C7572a.f252385h.getValue(), (ChainEventLink) C7572a.f252386i.getValue());
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f252375c = "ReferralContactsPermissionRequester_" + UUID.randomUUID();
    }

    @Inject
    public c(@k h hVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f252376a = aVar;
        List listSingletonList = Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169265b);
        a.C7572a.f252378a.getClass();
        Q q12 = new Q(listSingletonList, (ChainEventLink) a.C7572a.f252379b.getValue());
        Q q13 = new Q(Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169267d), (ChainEventLink) a.C7572a.f252380c.getValue());
        Q q14 = new Q(C42745f0.U(PermissionSystemRequestLink.ResultValue.f169268e, PermissionSystemRequestLink.ResultValue.f169269f), (ChainEventLink) a.C7572a.f252381d.getValue());
        List listSingletonList2 = Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c);
        ChainEventLink chainEventLink = (ChainEventLink) a.C7572a.f252382e.getValue();
        DialogDeepLink.ControlsDirection controlsDirection = DialogDeepLink.ControlsDirection.f133265c;
        String f252501b = hVar.getF252501b();
        this.f252377b = new PermissionSystemRequestLink("android.permission.READ_CONTACTS", C42745f0.U(q12, q13, q14, new Q(listSingletonList2, new RunMultipleLink(chainEventLink, new DialogDeepLink(controlsDirection, false, false, hVar.getF252502c(), C42745f0.U(new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink(new RunMultipleLink((ChainEventLink) a.C7572a.f252384g.getValue(), new PermissionSystemSettingsLink("android.permission.READ_CONTACTS", C42745f0.U(new Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169280c), (ChainEventLink) a.C7572a.f252385h.getValue()), new Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169281d), (ChainEventLink) a.C7572a.f252386i.getValue())), (List) null, (ParametrizedEvent) null, 12, (C42822w) null))), hVar.getF252503d(), DialogDeepLink.DialogButtonStyle.PRIMARY), new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink((ChainEventLink) a.C7572a.f252383f.getValue()), hVar.getF252504e(), DialogDeepLink.DialogButtonStyle.SECONDARY)), f252501b, null, null, null, null, 960, null)))), (List) null, 4, (C42822w) null);
    }

    @k
    public final e a() {
        return new e(C43175k.Z(new d(C40482a.a(this.f252376a)), new f(3, null)));
    }
}

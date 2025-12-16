package com.avito.android.profile_phones.phones_list;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kv.C43501a;

/* compiled from: IacPhoneListMicRequestRequester.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/a;", "", "<init>", "()V", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33413a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C33413a f227434a = new C33413a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f227435b = new AtomicInteger(0);

    /* compiled from: IacPhoneListMicRequestRequester.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/a$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.a$a, reason: collision with other inner class name */
    public static final class C6914a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C6914a f227436a = new C6914a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227437b = C42727D.c(C6915a.f227446l);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227438c = C42727D.c(e.f227450l);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227439d = C42727D.c(f.f227451l);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227440e = C42727D.c(d.f227449l);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227441f = C42727D.c(c.f227448l);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227442g = C42727D.c(b.f227447l);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227443h = C42727D.c(g.f227452l);

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227444i = C42727D.c(h.f227453l);

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C f227445j = C42727D.c(i.f227454l);

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$a, reason: collision with other inner class name */
        public static final class C6915a extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final C6915a f227446l = new C6915a();

            public C6915a() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("alreadyGranted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$b */
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f227447l = new b();

            public b() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("customSettingsPopupAccepted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$c */
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f227448l = new c();

            public c() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("customSettingsPopupDenied");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$d */
        public static final class d extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f227449l = new d();

            public d() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("customSettingsPopupDisplayed");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$e */
        public static final class e extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final e f227450l = new e();

            public e() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("requestedAndGranted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$f */
        public static final class f extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final f f227451l = new f();

            public f() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("requestedAndNotGranted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$g */
        public static final class g extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final g f227452l = new g();

            public g() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("returnedFromSettingsAndGranted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$h */
        public static final class h extends kotlin.jvm.internal.N implements Y41.a<ChainEventLink> {

            /* renamed from: l, reason: collision with root package name */
            public static final h f227453l = new h();

            public h() {
                super(0);
            }

            @Override // Y41.a
            public final ChainEventLink invoke() {
                return new ChainEventLink("returnedFromSettingsAndNotGranted");
            }
        }

        /* compiled from: IacPhoneListMicRequestRequester.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phones_list.a$a$i */
        public static final class i extends kotlin.jvm.internal.N implements Y41.a<List<? extends ChainEventLink>> {

            /* renamed from: l, reason: collision with root package name */
            public static final i f227454l = new i();

            public i() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends ChainEventLink> invoke() {
                C6914a.f227436a.getClass();
                return C42745f0.U((ChainEventLink) C6914a.f227437b.getValue(), (ChainEventLink) C6914a.f227438c.getValue(), (ChainEventLink) C6914a.f227439d.getValue(), (ChainEventLink) C6914a.f227441f.getValue(), (ChainEventLink) C6914a.f227443h.getValue(), (ChainEventLink) C6914a.f227444i.getValue());
            }
        }
    }

    /* compiled from: IacPhoneListMicRequestRequester.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000f\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkv/a;", "it", "Ljava/util/Optional;", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "Lj41/e;", "apply", "(Lkv/a;)Ljava/util/Optional;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.phones_list.a$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f227455b;

        public b(String str) {
            this.f227455b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = ((C43501a) obj).f413260a;
            DeepLink deepLink = aVar.f134520a;
            return (kotlin.jvm.internal.L.f(aVar.f134521b, this.f227455b) && (deepLink instanceof ChainEventLink)) ? Optional.of(deepLink) : Optional.empty();
        }
    }

    /* compiled from: IacPhoneListMicRequestRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chainEventLink", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phones_list.a$c */
    public static final class c<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f227456b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            C6914a.f227436a.getClass();
            return ((List) C6914a.f227445j.getValue()).contains((ChainEventLink) obj);
        }
    }

    /* compiled from: IacPhoneListMicRequestRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "chainEventLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.phones_list.a$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<ChainEventLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f227457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227458m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227459n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227460o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227461p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227462q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227463r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227464s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f227465t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.a<G0> aVar5, Y41.a<G0> aVar6, Y41.a<G0> aVar7, Y41.a<G0> aVar8) {
            super(1);
            this.f227457l = str;
            this.f227458m = (kotlin.jvm.internal.N) aVar;
            this.f227459n = (kotlin.jvm.internal.N) aVar2;
            this.f227460o = (kotlin.jvm.internal.N) aVar3;
            this.f227461p = (kotlin.jvm.internal.N) aVar4;
            this.f227462q = (kotlin.jvm.internal.N) aVar5;
            this.f227463r = (kotlin.jvm.internal.N) aVar6;
            this.f227464s = (kotlin.jvm.internal.N) aVar7;
            this.f227465t = (kotlin.jvm.internal.N) aVar8;
        }

        /* JADX WARN: Type inference failed for: r5v11, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v3, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v4, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v5, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v6, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v7, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v8, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v9, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(ChainEventLink chainEventLink) {
            ChainEventLink chainEventLink2 = chainEventLink;
            V2.f318762a.c("IacPhoneListMicRequestRequester", this.f227457l + " chainEventLink.eventValue=" + chainEventLink2.f169242b, null);
            C6914a.f227436a.getClass();
            if (chainEventLink2.equals((ChainEventLink) C6914a.f227437b.getValue())) {
                this.f227458m.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227438c.getValue())) {
                this.f227459n.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227439d.getValue())) {
                this.f227460o.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227440e.getValue())) {
                this.f227461p.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227442g.getValue())) {
                this.f227462q.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227441f.getValue())) {
                this.f227463r.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227443h.getValue())) {
                this.f227464s.invoke();
            } else if (chainEventLink2.equals((ChainEventLink) C6914a.f227444i.getValue())) {
                this.f227465t.invoke();
            }
            return G0.f406611a;
        }
    }

    public static void a(@Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @Y61.k Y41.a aVar6, @Y61.k Y41.a aVar7, @Y61.k Y41.a aVar8, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar9, @Y61.k io.reactivex.rxjava3.disposables.c cVar, @Y61.k Resources resources) {
        String str = "IacPhoneListMicRequestRequester_" + f227435b.incrementAndGet();
        V2.f318762a.c("IacPhoneListMicRequestRequester", str + " started", null);
        List listSingletonList = Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169265b);
        C6914a.f227436a.getClass();
        PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", C42745f0.U(new kotlin.Q(listSingletonList, (ChainEventLink) C6914a.f227437b.getValue()), new kotlin.Q(Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169267d), (ChainEventLink) C6914a.f227438c.getValue()), new kotlin.Q(C42745f0.U(PermissionSystemRequestLink.ResultValue.f169268e, PermissionSystemRequestLink.ResultValue.f169269f), (ChainEventLink) C6914a.f227439d.getValue()), new kotlin.Q(Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c), new RunMultipleLink((ChainEventLink) C6914a.f227440e.getValue(), new DialogDeepLink(DialogDeepLink.ControlsDirection.f133265c, false, false, resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_body), C42745f0.U(new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink(new RunMultipleLink((ChainEventLink) C6914a.f227442g.getValue(), new PermissionSystemSettingsLink("android.permission.RECORD_AUDIO", C42745f0.U(new kotlin.Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169280c), (ChainEventLink) C6914a.f227443h.getValue()), new kotlin.Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169281d), (ChainEventLink) C6914a.f227444i.getValue())), (List) null, (ParametrizedEvent) null, 12, (C42822w) null))), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_btn_settings), DialogDeepLink.DialogButtonStyle.PRIMARY), new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink((ChainEventLink) C6914a.f227441f.getValue()), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_btn_cancel), DialogDeepLink.DialogButtonStyle.SECONDARY)), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_title), null, null, null, null, 960, null)))), (List) null, 4, (C42822w) null);
        io.reactivex.rxjava3.core.z<C43501a> zVarV9 = aVar9.V9();
        b bVar = new b(str);
        zVarV9.getClass();
        cVar.b(A1.h(new io.reactivex.rxjava3.internal.jdk8.x(zVarV9, bVar).B0(c.f227456b), null, new d(str, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8), 3));
        b.a.a(aVar9, permissionSystemRequestLink, str, null, 4);
    }
}

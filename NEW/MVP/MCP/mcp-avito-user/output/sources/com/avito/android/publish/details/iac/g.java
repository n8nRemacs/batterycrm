package com.avito.android.publish.details.iac;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.iac.l;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.jdk8.x;
import io.reactivex.rxjava3.internal.operators.observable.S;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kv.C43501a;

/* compiled from: IacPermissionRequestHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/iac/g;", "Lcom/avito/android/publish/details/iac/e;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements com.avito.android.publish.details.iac.e {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f234714f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<AtomicInteger> f234715g = C42727D.c(a.f234721l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f234716a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.iac.a f234717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f234718c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f234719d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f234720e = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicInteger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<AtomicInteger> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f234721l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final AtomicInteger invoke() {
            return new AtomicInteger(0);
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/details/iac/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f234722l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f234723l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.a<G0> aVar) {
            super(0);
            this.f234723l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f234723l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacPermissionRequestSource f234725m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f234726n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(IacPermissionRequestSource iacPermissionRequestSource, Y41.a<G0> aVar) {
            super(0);
            this.f234725m = iacPermissionRequestSource;
            this.f234726n = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            g.this.f234716a.Y(true, this.f234725m);
            this.f234726n.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ IacPermissionRequestSource f234728m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f234729n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(IacPermissionRequestSource iacPermissionRequestSource, Y41.a<G0> aVar) {
            super(0);
            this.f234728m = iacPermissionRequestSource;
            this.f234729n = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            g.this.f234716a.Y(false, this.f234728m);
            this.f234729n.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.iac.g$g, reason: collision with other inner class name */
    public static final class C7090g extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f234731m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7090g(Y41.a<G0> aVar) {
            super(0);
            this.f234731m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC33535v interfaceC33535v = g.this.f234716a;
            CallsPopupType callsPopupType = CallsPopupType.f164277b;
            IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164281b;
            interfaceC33535v.T();
            this.f234731m.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f234733m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Y41.a<G0> aVar) {
            super(0);
            this.f234733m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC33535v interfaceC33535v = g.this.f234716a;
            CallsPopupType callsPopupType = CallsPopupType.f164277b;
            IacEnablingScenario iacEnablingScenario = IacEnablingScenario.f164281b;
            interfaceC33535v.f0();
            this.f234733m.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f234734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Y41.a<G0> aVar) {
            super(0);
            this.f234734l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f234734l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f234735l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Y41.a<G0> aVar) {
            super(0);
            this.f234735l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f234735l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: IacPermissionRequestHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f234736l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.a<G0> aVar) {
            super(0);
            this.f234736l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f234736l.invoke();
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.publish.details.iac.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k Resources resources) {
        this.f234716a = interfaceC33535v;
        this.f234717b = aVar;
        this.f234718c = aVar2;
        this.f234719d = resources;
    }

    @Override // com.avito.android.publish.details.iac.e
    public final void a(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.publish.details.iac.k kVar = com.avito.android.publish.details.iac.k.f234746a;
        c cVar = c.f234722l;
        kVar.getClass();
        StringBuilder sb2 = new StringBuilder("IacPublishAppSettingsMicPermissionRequester_");
        f234714f.getClass();
        sb2.append(f234715g.getValue().incrementAndGet());
        String string = sb2.toString();
        V2.f318762a.c("IacPublishAppSettingsMicPermissionRequester", string + " started", null);
        PermissionSystemSettingsLink permissionSystemSettingsLink = new PermissionSystemSettingsLink("android.permission.RECORD_AUDIO", (List) null, (List) null, (ParametrizedEvent) null, 14, (C42822w) null);
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f234718c;
        this.f234720e.b(A1.i(new S(aVar2.V9().N(new com.avito.android.publish.details.iac.i(string))), null, new com.avito.android.publish.details.iac.j(string, aVar, aVar, cVar), 3));
        b.a.a(aVar2, permissionSystemSettingsLink, string, null, 4);
    }

    @Override // com.avito.android.publish.details.iac.e
    public final void b(@Y61.k IacPermissionRequestSource iacPermissionRequestSource, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4, @Y61.k Y41.a<G0> aVar5, @Y61.k Y41.a<G0> aVar6, @Y61.k Y41.a<G0> aVar7, @Y61.k Y41.a<G0> aVar8) throws Resources.NotFoundException {
        if (iacPermissionRequestSource == IacPermissionRequestSource.f234701b || iacPermissionRequestSource == IacPermissionRequestSource.f234704e) {
            this.f234717b.b();
        }
        l lVar = l.f234747a;
        d dVar = new d(aVar);
        e eVar = new e(iacPermissionRequestSource, aVar2);
        f fVar = new f(iacPermissionRequestSource, aVar3);
        C7090g c7090g = new C7090g(aVar4);
        h hVar = new h(aVar5);
        i iVar = new i(aVar6);
        j jVar = new j(aVar7);
        k kVar = new k(aVar8);
        lVar.getClass();
        StringBuilder sb2 = new StringBuilder("IacPublishMicRequestRequester_");
        f234714f.getClass();
        sb2.append(f234715g.getValue().incrementAndGet());
        String string = sb2.toString();
        V2.f318762a.c("IacPublishMicRequestRequester", string + " started", null);
        List listSingletonList = Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169265b);
        l.a.f234748a.getClass();
        Q q12 = new Q(listSingletonList, (ChainEventLink) l.a.f234749b.getValue());
        Q q13 = new Q(Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169267d), (ChainEventLink) l.a.f234750c.getValue());
        Q q14 = new Q(C42745f0.U(PermissionSystemRequestLink.ResultValue.f169268e, PermissionSystemRequestLink.ResultValue.f169269f), (ChainEventLink) l.a.f234751d.getValue());
        List listSingletonList2 = Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169266c);
        ChainEventLink chainEventLink = (ChainEventLink) l.a.f234752e.getValue();
        DialogDeepLink.ControlsDirection controlsDirection = DialogDeepLink.ControlsDirection.f133265c;
        Resources resources = this.f234719d;
        PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", C42745f0.U(q12, q13, q14, new Q(listSingletonList2, new RunMultipleLink(chainEventLink, new DialogDeepLink(controlsDirection, false, false, resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_body), C42745f0.U(new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink(new RunMultipleLink((ChainEventLink) l.a.f234754g.getValue(), new PermissionSystemSettingsLink("android.permission.RECORD_AUDIO", C42745f0.U(new Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169280c), (ChainEventLink) l.a.f234755h.getValue()), new Q(Collections.singletonList(PermissionSystemSettingsLink.ResultValue.f169281d), (ChainEventLink) l.a.f234756i.getValue())), (List) null, (ParametrizedEvent) null, 12, (C42822w) null))), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_btn_settings), DialogDeepLink.DialogButtonStyle.PRIMARY), new DialogDeepLink.DialogButton(new IgnoreInDialogRouterLink((ChainEventLink) l.a.f234753f.getValue()), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_btn_cancel), DialogDeepLink.DialogButtonStyle.SECONDARY)), resources.getString(R.string.iac_incoming_call_ability_public_mic_dialog_title), null, null, null, null, 960, null)))), (List) null, 4, (C42822w) null);
        com.avito.android.deeplink_handler.handler.composite.a aVar9 = this.f234718c;
        z<C43501a> zVarV9 = aVar9.V9();
        m mVar = new m(string);
        zVarV9.getClass();
        this.f234720e.b(A1.h(new x(zVarV9, mVar).B0(n.f234768b), null, new o(string, dVar, eVar, fVar, c7090g, hVar, iVar, jVar, kVar), 3));
        b.a.a(aVar9, permissionSystemRequestLink, string, null, 4);
    }

    @Override // com.avito.android.publish.details.iac.e
    public final void dismiss() {
        V2.f318762a.c("IacPublishPermissionRequestHelper", "dismiss", null);
        this.f234720e.e();
    }
}

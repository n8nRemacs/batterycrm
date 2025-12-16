package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallData;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_onboarding.IacMicOnboardingLink;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.IacCallMethodsDialogFragmentResult;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mJ.AbstractC43972a;
import nJ.C44268c;
import nJ.M;
import nJ.N;
import rv.C47919b;
import vN.C49237a;

/* compiled from: IacShowCallMethodsDialogSheetLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/z;", "Lev/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacShowCallMethodsDialogSheetLink;", "a", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z extends AbstractC40161a<IacShowCallMethodsDialogSheetLink> {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f168657p = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.f f168658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.a f168659g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.d f168660h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f168661i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final F f168662j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.z f168663k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f168664l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C49237a f168665m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f168666n = C22026a.c(new StringBuilder("(handleId="), this.f395444b, ')');

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f168667o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: IacShowCallMethodsDialogSheetLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/z$a;", "", "<init>", "()V", "", "NO_VIDEO_BUTTON_NAME", "Ljava/lang/String;", "TAG", "WITH_VIDEO_BUTTON_NAME", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public z(@Y61.k a.f fVar, @Y61.k com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.a aVar, @Y61.k a.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12, @Y61.k com.avito.android.permissions.z zVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k C49237a c49237a) {
        this.f168658f = fVar;
        this.f168659g = aVar;
        this.f168660h = dVar;
        this.f168661i = interfaceC28373a;
        this.f168662j = f12;
        this.f168663k = zVar;
        this.f168664l = aVar2;
        this.f168665m = c49237a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink = (IacShowCallMethodsDialogSheetLink) deepLink;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacShowCallMethodsDialogSheetLinkHandler", this.f168666n + " New deeplink in handler: " + iacShowCallMethodsDialogSheetLink, null);
        IacMakeCallLink iacMakeCallLink = iacShowCallMethodsDialogSheetLink.f168693b;
        y.a aVar = new y.a(this.f168662j.a("calls", "outgoing_call_funnel", "{{%app_ver%}}", iacMakeCallLink.f168711b.f166836f, "call_options_shown").f91030a, 1L);
        InterfaceC28373a interfaceC28373a = this.f168661i;
        interfaceC28373a.c(aVar);
        IacCallInfo iacCallInfo = iacMakeCallLink.f168711b;
        String str2 = iacCallInfo.f166836f;
        IacItemInfo iacItemInfo = iacCallInfo.f166834d;
        String str3 = iacItemInfo != null ? iacItemInfo.f166858b : null;
        IacCanCallData iacCanCallData = iacCallInfo.f166842l;
        String str4 = iacCanCallData != null ? iacCanCallData.f166855b : null;
        com.avito.android.permissions.z zVar = this.f168663k;
        interfaceC28373a.c(new M(str2, str3, iacCallInfo.f166832b, str4, Boolean.valueOf(zVar.b("android.permission.RECORD_AUDIO").b())));
        C49237a c49237a = this.f168665m;
        c49237a.getClass();
        kotlin.reflect.n<Object> nVar = C49237a.f440707l[3];
        if (((Boolean) c49237a.f440711d.a().getValue()).booleanValue() && iacCanCallData != null && iacCanCallData.f166856c && L.f(iacCanCallData.f166857d, "videoCall")) {
            interfaceC28373a.c(new N(iacCallInfo.f166836f, iacItemInfo != null ? iacItemInfo.f166858b : null, iacCallInfo.f166843m, Boolean.valueOf(zVar.b("android.permission.RECORD_AUDIO").b()), Boolean.valueOf(zVar.b("android.permission.CAMERA").b())));
        }
        this.f168660h.w1(this.f168659g.a(iacShowCallMethodsDialogSheetLink, this.f395444b), this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f168658f.l1(this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.z.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47919b c47919b = (C47919b) obj;
                int i12 = z.f168657p;
                z zVar = z.this;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacShowCallMethodsDialogSheetLinkHandler", zVar.f168666n + " New fragmentResult in handler: " + c47919b, null);
                IacCallMethodsDialogFragmentResult.f168451b.getClass();
                int i13 = Build.VERSION.SDK_INT;
                Bundle bundle = c47919b.f437159b;
                IacCallMethodsDialogFragmentResult iacCallMethodsDialogFragmentResult = (IacCallMethodsDialogFragmentResult) (i13 >= 34 ? (Parcelable) bundle.getParcelable("callMethods.dialogs.IacCallMethodsDialogFragmentResult", IacCallMethodsDialogFragmentResult.class) : bundle.getParcelable("callMethods.dialogs.IacCallMethodsDialogFragmentResult"));
                if (iacCallMethodsDialogFragmentResult == null) {
                    return;
                }
                boolean z12 = iacCallMethodsDialogFragmentResult instanceof IacCallMethodsDialogFragmentResult.OnCallMethodsDialogCanceled;
                InterfaceC28373a interfaceC28373a = zVar.f168661i;
                com.avito.android.permissions.z zVar2 = zVar.f168663k;
                if (z12) {
                    zVar.j(IacShowCallMethodsDialogSheetLink.b.a.f168694b);
                } else {
                    boolean z13 = iacCallMethodsDialogFragmentResult instanceof IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected;
                    com.avito.android.deeplink_handler.handler.composite.a aVar = zVar.f168664l;
                    if (z13) {
                        C49237a c49237a = zVar.f168665m;
                        c49237a.getClass();
                        kotlin.reflect.n<Object> nVar = C49237a.f440707l[3];
                        if (((Boolean) c49237a.f440711d.a().getValue()).booleanValue()) {
                            IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected onInAppCallMethodSelected = (IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected) iacCallMethodsDialogFragmentResult;
                            IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink = onInAppCallMethodSelected.f168453c;
                            IacCanCallData iacCanCallData = iacShowCallMethodsDialogSheetLink.f168693b.f168711b.f166842l;
                            if (iacCanCallData != null && iacCanCallData.f166856c && L.f(iacCanCallData.f166857d, "videoCall")) {
                                IacCallInfo iacCallInfo = iacShowCallMethodsDialogSheetLink.f168693b.f168711b;
                                String str = iacCallInfo.f166836f;
                                IacItemInfo iacItemInfo = iacCallInfo.f166834d;
                                interfaceC28373a.c(new nJ.L(str, iacItemInfo != null ? iacItemInfo.f166858b : null, onInAppCallMethodSelected.f168454d ? "with_video" : "no_video", iacCallInfo.f166843m, Boolean.valueOf(zVar2.b("android.permission.RECORD_AUDIO").b()), Boolean.valueOf(zVar2.b("android.permission.CAMERA").b())));
                            }
                        }
                        IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected onInAppCallMethodSelected2 = (IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected) iacCallMethodsDialogFragmentResult;
                        zVar.i(IacShowCallMethodsDialogSheetLink.b.C4989b.f168695b, aVar, new IacMakeCallLink(IacCallInfo.a(onInAppCallMethodSelected2.f168453c.f168693b.f168711b, null, onInAppCallMethodSelected2.f168454d, null, null, null, 8159)));
                    } else if (iacCallMethodsDialogFragmentResult instanceof IacCallMethodsDialogFragmentResult.OnOnboardingClicked) {
                        b.a.a(aVar, new IacMicOnboardingLink(), null, null, 6);
                    }
                }
                if (z12) {
                    return;
                }
                if (!(iacCallMethodsDialogFragmentResult instanceof IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected)) {
                    if (iacCallMethodsDialogFragmentResult instanceof IacCallMethodsDialogFragmentResult.OnOnboardingClicked) {
                        IacItemInfo iacItemInfo2 = ((IacCallMethodsDialogFragmentResult.OnOnboardingClicked) iacCallMethodsDialogFragmentResult).f168455c.f168693b.f168711b.f166834d;
                        interfaceC28373a.c(new nJ.x(iacItemInfo2 != null ? iacItemInfo2.f166858b : null, IacEnablingScenario.f164284e));
                        return;
                    }
                    return;
                }
                IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink2 = ((IacCallMethodsDialogFragmentResult.OnInAppCallMethodSelected) iacCallMethodsDialogFragmentResult).f168453c;
                interfaceC28373a.c(new y.a(zVar.f168662j.a("calls", "outgoing_call_funnel", "{{%app_ver%}}", iacShowCallMethodsDialogSheetLink2.f168693b.f168711b.f166836f, "call_options_contacted").f91030a, 1L));
                IacCallInfo iacCallInfo2 = iacShowCallMethodsDialogSheetLink2.f168693b.f168711b;
                String str2 = iacCallInfo2.f166836f;
                AbstractC43972a.C11822a c11822a = AbstractC43972a.C11822a.f414450b;
                IacItemInfo iacItemInfo3 = iacCallInfo2.f166834d;
                interfaceC28373a.c(new C44268c(str2, c11822a, iacItemInfo3 != null ? iacItemInfo3.f166858b : null, iacCallInfo2.f166832b, Boolean.valueOf(zVar2.b("android.permission.RECORD_AUDIO").b())));
            }
        };
        final V2 v22 = V2.f318762a;
        this.f168667o.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.z.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f168667o.e();
    }
}

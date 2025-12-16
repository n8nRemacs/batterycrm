package com.avito.android.iac_problems.impl_module.deeplink.miui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_problems.impl_module.miui_permission.IacMiuiPermissionBottomSheetDialogResult;
import com.avito.android.iac_problems.impl_module.miui_permission.IacMiuiPermissionBottomSheetFragment;
import com.avito.android.iac_problems.impl_module.miui_permission.ui.MiuiBottomsheetRemoteImageLanguage;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import io.reactivex.rxjava3.kotlin.A1;
import jJ.InterfaceC42261a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import nJ.C44262A;
import nM.InterfaceC44291a;
import oM.C44664a;
import pM.InterfaceC46977a;
import rv.C47919b;

/* compiled from: IacMiuiDisplayOnLockedScreenPermissionLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/deeplink/miui/a;", "Lev/a;", "Lcom/avito/android/iac_problems/public_module/deeplink/IacMiuiDisplayOnLockedScreenPermissionLink;", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<IacMiuiDisplayOnLockedScreenPermissionLink> {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f168716u = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.f f168717f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f168718g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44291a f168719h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f168720i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f168721j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f168722k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46977a f168723l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final F f168724m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f168725n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final k f168726o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final PL.a f168727p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42261a f168728q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final String f168729r = C22026a.c(new StringBuilder("(handleId="), this.f395444b, ')');

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f168730s = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public String f168731t = "unknown";

    /* compiled from: IacMiuiDisplayOnLockedScreenPermissionLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/deeplink/miui/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_problems.impl_module.deeplink.miui.a$a, reason: collision with other inner class name */
    public static final class C4995a {
        public /* synthetic */ C4995a(C42822w c42822w) {
            this();
        }

        public C4995a() {
        }
    }

    static {
        new C4995a(null);
    }

    @Inject
    public a(@Y61.k a.f fVar, @Y61.k a.d dVar, @Y61.k InterfaceC44291a interfaceC44291a, @Y61.k com.avito.android.app_foreground_provider.util_module.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k InterfaceC46977a interfaceC46977a, @Y61.k F f12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k k kVar, @Y61.k PL.a aVar2, @Y61.k InterfaceC42261a interfaceC42261a) {
        this.f168717f = fVar;
        this.f168718g = dVar;
        this.f168719h = interfaceC44291a;
        this.f168720i = aVar;
        this.f168721j = interfaceC4053a;
        this.f168722k = interfaceC35845m2;
        this.f168723l = interfaceC46977a;
        this.f168724m = f12;
        this.f168725n = interfaceC28373a;
        this.f168726o = kVar;
        this.f168727p = aVar2;
        this.f168728q = interfaceC42261a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        IacMiuiDisplayOnLockedScreenPermissionLink iacMiuiDisplayOnLockedScreenPermissionLink = (IacMiuiDisplayOnLockedScreenPermissionLink) deepLink;
        MiuiBottomsheetRemoteImageLanguage miuiBottomsheetRemoteImageLanguage = null;
        V2.f318762a.c("IacMiuiDisplayOnLockedScreenPermissionLinkHandler", this.f168729r + " New deeplink in handler: " + iacMiuiDisplayOnLockedScreenPermissionLink, null);
        String str2 = iacMiuiDisplayOnLockedScreenPermissionLink.f169082b;
        this.f168731t = str2;
        if (!this.f168719h.e()) {
            j(IacMiuiDisplayOnLockedScreenPermissionLink.b.c.f169085b);
            return;
        }
        y.a aVar = new y.a(this.f168724m.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", str2, "showDialog").f91030a, 1L);
        InterfaceC28373a interfaceC28373a = this.f168725n;
        interfaceC28373a.c(aVar);
        String language = this.f168728q.P4().getLanguage();
        if (C43066x.h0(language, "ru", true)) {
            miuiBottomsheetRemoteImageLanguage = MiuiBottomsheetRemoteImageLanguage.f168810b;
        } else if (C43066x.h0(language, "uz", true)) {
            miuiBottomsheetRemoteImageLanguage = MiuiBottomsheetRemoteImageLanguage.f168811c;
        }
        if (miuiBottomsheetRemoteImageLanguage == null) {
            j(IacMiuiDisplayOnLockedScreenPermissionLink.b.c.f169085b);
            return;
        }
        IacMiuiPermissionBottomSheetFragment.a aVar2 = IacMiuiPermissionBottomSheetFragment.f168779j0;
        String str3 = this.f395444b;
        aVar2.getClass();
        IacMiuiPermissionBottomSheetFragment iacMiuiPermissionBottomSheetFragment = new IacMiuiPermissionBottomSheetFragment();
        Bundle bundleM = com.avito.android.actions_sheet.a.m("request_key", str3);
        bundleM.putInt("language", miuiBottomsheetRemoteImageLanguage.ordinal());
        iacMiuiPermissionBottomSheetFragment.setArguments(bundleM);
        this.f168718g.w1(iacMiuiPermissionBottomSheetFragment, this.f395444b);
        this.f168726o.a(new C44262A(C44664a.a(this.f168723l.c()), "miui_locked_screen"), new com.avito.android.iac_problems.impl_module.deeplink.miui.b(1, interfaceC28373a, InterfaceC28373a.class, "track", "track(Lcom/avito/android/analytics/Event;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f168717f.l1(this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.iac_problems.impl_module.deeplink.miui.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47919b c47919b = (C47919b) obj;
                int i12 = a.f168716u;
                a aVar = a.this;
                V2.f318762a.c("IacMiuiDisplayOnLockedScreenPermissionLinkHandler", aVar.f168729r + " New fragmentResult in handler: " + c47919b, null);
                IacMiuiPermissionBottomSheetDialogResult.f168776b.getClass();
                int i13 = Build.VERSION.SDK_INT;
                Bundle bundle = c47919b.f437159b;
                IacMiuiPermissionBottomSheetDialogResult iacMiuiPermissionBottomSheetDialogResult = (IacMiuiPermissionBottomSheetDialogResult) (i13 >= 34 ? (Parcelable) bundle.getParcelable("com.avito.android.iac_problems.impl_module.miui_permission.KEY_RESULT", IacMiuiPermissionBottomSheetDialogResult.class) : bundle.getParcelable("com.avito.android.iac_problems.impl_module.miui_permission.KEY_RESULT"));
                if (L.f(iacMiuiPermissionBottomSheetDialogResult, IacMiuiPermissionBottomSheetDialogResult.Closed.f168777c)) {
                    aVar.j(IacMiuiDisplayOnLockedScreenPermissionLink.b.a.f169083b);
                } else if (iacMiuiPermissionBottomSheetDialogResult instanceof IacMiuiPermissionBottomSheetDialogResult.RoutedToSettings) {
                    aVar.f168725n.c(new y.a(aVar.f168724m.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", aVar.f168731t, "openSettings").f91030a, 1L));
                    aVar.f168730s.b(A1.h(aVar.f168720i.b().d0(com.avito.android.iac_problems.impl_module.deeplink.miui.c.f168734b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L).N(d.f168735b).z0(1L), null, new f(aVar), 3));
                    aVar.f168721j.R(aVar.f168722k.i(), com.avito.android.deeplink_handler.view.b.f134588l);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f168730s.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.iac_problems.impl_module.deeplink.miui.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f168730s.e();
    }
}

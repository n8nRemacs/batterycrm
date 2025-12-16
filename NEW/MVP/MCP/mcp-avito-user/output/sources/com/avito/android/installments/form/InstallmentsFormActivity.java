package com.avito.android.installments.form;

import Cd.C13243a;
import WN.a;
import WN.b;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.CancellationDialog;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.di.C29972i;
import com.avito.android.installments.form.di.b;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormState;
import com.avito.android.lib.design.modal.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35961v3;
import com.avito.android.util.C35974x2;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import com.avito.android.webview.C36149b;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import cv.InterfaceC39417a;
import i.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: InstallmentsFormActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installments/form/InstallmentsFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InstallmentsFormActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f172577A = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public p f172578m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.web_handler.b f172579n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public w f172580o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.cookie_provider.e f172581p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f172582q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.installments.form.m f172583r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public u f172584s;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f172587v;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public ValueCallback<Uri[]> f172589x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Void> f172590y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f172591z;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final O0 f172585t = new O0(m0.f406844a.b(t.class), new k(), new j(new m()), new l());

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Object f172586u = C35961v3.a(this);

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f172588w = C42727D.c(new b());

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/ClipboardManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ClipboardManager> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ClipboardManager invoke() {
            Object systemService = InstallmentsFormActivity.this.getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                return (ClipboardManager) systemService;
            }
            return null;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<ValueCallback<Uri[]>, G0> {
        @Override // Y41.l
        public final G0 invoke(ValueCallback<Uri[]> valueCallback) {
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            int i12 = InstallmentsFormActivity.f172577A;
            installmentsFormActivity.c2().accept(new a.j(valueCallback));
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Uri, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Uri uri) {
            boolean z12;
            Uri uri2 = uri;
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            com.avito.android.deep_linking.x xVar = installmentsFormActivity.f172582q;
            if (xVar == null) {
                xVar = null;
            }
            DeepLink deepLinkE = xVar.e(uri2);
            if (deepLinkE instanceof NoMatchLink) {
                z12 = false;
            } else {
                installmentsFormActivity.c2().accept(new a.d(deepLinkE));
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            int i12 = InstallmentsFormActivity.f172577A;
            installmentsFormActivity.c2().accept(a.f.f17896a);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<PowerWebViewStateChangeEvent, G0> {
        @Override // Y41.l
        public final G0 invoke(PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            PowerWebViewStateChangeEvent powerWebViewStateChangeEvent2 = powerWebViewStateChangeEvent;
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            int i12 = InstallmentsFormActivity.f172577A;
            installmentsFormActivity.getClass();
            int iOrdinal = powerWebViewStateChangeEvent2.f392937a.ordinal();
            if (iOrdinal == 0) {
                com.avito.android.installments.form.m mVar = installmentsFormActivity.f172583r;
                (mVar != null ? mVar : null).f();
            } else if (iOrdinal == 1) {
                com.avito.android.installments.form.m mVar2 = installmentsFormActivity.f172583r;
                (mVar2 != null ? mVar2 : null).b();
            } else if (iOrdinal == 3) {
                String str = "HTTP error: code:" + powerWebViewStateChangeEvent2.f392941e + " message:" + powerWebViewStateChangeEvent2.f392942f;
                com.avito.android.installments.form.m mVar3 = installmentsFormActivity.f172583r;
                if (mVar3 == null) {
                    mVar3 = null;
                }
                mVar3.c(new RuntimeException(str));
                V2.f318762a.e(str, null);
            }
            installmentsFormActivity.c2().accept(new a.k(powerWebViewStateChangeEvent2));
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.p<String, String, G0> {
        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            int i12 = InstallmentsFormActivity.f172577A;
            installmentsFormActivity.c2().accept(new a.h(str, str2));
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<WN.b, G0> {
        public final void f(@Y61.k WN.b bVar) {
            String string;
            String string2;
            String string3;
            String string4;
            InstallmentsFormActivity installmentsFormActivity = (InstallmentsFormActivity) this.receiver;
            int i12 = InstallmentsFormActivity.f172577A;
            installmentsFormActivity.getClass();
            if (bVar instanceof b.e) {
                CancellationDialog cancellationDialog = installmentsFormActivity.b2().f172606j;
                if (cancellationDialog == null || (string = cancellationDialog.getTitle()) == null) {
                    string = installmentsFormActivity.getString(R.string.close_form_dialog_title);
                }
                String str = string;
                if (cancellationDialog == null || (string2 = cancellationDialog.getSubtitle()) == null) {
                    string2 = installmentsFormActivity.getString(R.string.close_form_dialog_description);
                }
                String str2 = string2;
                if (cancellationDialog == null || (string3 = cancellationDialog.getPrimaryButtonTitle()) == null) {
                    string3 = installmentsFormActivity.getString(R.string.close_form_dialog_no);
                }
                String str3 = string3;
                if (cancellationDialog == null || (string4 = cancellationDialog.getSecondaryButtonTitle()) == null) {
                    string4 = installmentsFormActivity.getString(R.string.close_form_dialog_yes);
                }
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, installmentsFormActivity, new com.avito.android.installments.form.d(str, str2, str3, string4, installmentsFormActivity));
                com.avito.android.lib.util.g.a(aVarC);
                installmentsFormActivity.f172587v = aVarC;
                return;
            }
            if (bVar instanceof b.h) {
                installmentsFormActivity.f172589x = ((b.h) bVar).f17910a;
                if (androidx.core.content.d.checkSelfPermission(installmentsFormActivity, "android.permission.CAMERA") == 0) {
                    installmentsFormActivity.f172590y.b(null);
                    return;
                } else {
                    installmentsFormActivity.f172591z.b("android.permission.CAMERA");
                    return;
                }
            }
            if (bVar instanceof b.f) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                View viewK1 = installmentsFormActivity.K1();
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.permission_camera, new Serializable[0]);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, viewK1, printableTextC, null, null, null, f.c.a.b(), 0, null, null, false, false, null, null, 4078);
                return;
            }
            if (bVar instanceof b.C1269b) {
                installmentsFormActivity.a2(null, true);
                return;
            }
            if (bVar instanceof b.a) {
                installmentsFormActivity.a2(((b.a) bVar).f17903a, false);
                return;
            }
            if (bVar instanceof b.c) {
                p pVar = installmentsFormActivity.f172578m;
                if (pVar != null) {
                    String str4 = ((b.c) bVar).f17905a;
                    pVar.f172812h.b(str4);
                    pVar.f172805a.e(str4);
                    pVar.f172815k.loadUrl(str4);
                    return;
                }
                return;
            }
            if (!(bVar instanceof b.d)) {
                if (bVar instanceof b.g) {
                    com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, installmentsFormActivity, new com.avito.android.installments.form.g(installmentsFormActivity, ((b.g) bVar).f17909a)));
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", ((b.d) bVar).f17906a);
            V2 v22 = V2.f318762a;
            C35974x2.d(intent);
            try {
                installmentsFormActivity.startActivity(intent);
            } catch (Exception e12) {
                v22.f(e12);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(WN.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<InstallmentsFormState, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InstallmentsFormState installmentsFormState) {
            InstallmentsFormState installmentsFormState2 = installmentsFormState;
            p pVar = InstallmentsFormActivity.this.f172578m;
            if (pVar != null) {
                int iOrdinal = installmentsFormState2.f172768a.ordinal();
                com.avito.android.installments.form.loader.c cVar = pVar.f172816l;
                if (iOrdinal == 0) {
                    C42670a.d(cVar.f172712f);
                    com.avito.android.installments.form.loader.d dVar = cVar.f172709c;
                    if (dVar == null) {
                        if (dVar != null) {
                            dVar.cancel();
                        }
                        com.avito.android.installments.form.loader.d dVar2 = new com.avito.android.installments.form.loader.d(cVar, kotlin.time.e.e(cVar.f172710d), kotlin.time.e.e(com.avito.android.installments.form.loader.c.f172706h));
                        cVar.f172709c = dVar2;
                        dVar2.start();
                    }
                } else if (iOrdinal == 1) {
                    cVar.f172712f.b();
                    com.avito.android.installments.form.loader.d dVar3 = cVar.f172709c;
                    if (dVar3 != null) {
                        dVar3.cancel();
                    }
                    cVar.f172709c = null;
                } else if (iOrdinal == 2) {
                    cVar.b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f172594l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f172594l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f172594l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return InstallmentsFormActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return InstallmentsFormActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/installments/form/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/installments/form/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<t> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = InstallmentsFormActivity.this.f172584s;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public InstallmentsFormActivity() {
        final int i12 = 0;
        this.f172590y = registerForActivityResult(new C36149b(), new androidx.view.result.a(this) { // from class: com.avito.android.installments.form.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InstallmentsFormActivity f172609c;

            {
                this.f172609c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                InstallmentsFormActivity installmentsFormActivity = this.f172609c;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = installmentsFormActivity.f172589x;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            installmentsFormActivity.f172589x = null;
                            installmentsFormActivity.c2().accept(a.c.f17893a);
                            break;
                        } else {
                            int i13 = InstallmentsFormActivity.f172577A;
                            installmentsFormActivity.c2().accept(new a.b(installmentsFormActivity.f172589x));
                            break;
                        }
                }
            }
        });
        final int i13 = 1;
        this.f172591z = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.installments.form.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InstallmentsFormActivity f172609c;

            {
                this.f172609c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                InstallmentsFormActivity installmentsFormActivity = this.f172609c;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = installmentsFormActivity.f172589x;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            installmentsFormActivity.f172589x = null;
                            installmentsFormActivity.c2().accept(a.c.f17893a);
                            break;
                        } else {
                            int i132 = InstallmentsFormActivity.f172577A;
                            installmentsFormActivity.c2().accept(new a.b(installmentsFormActivity.f172589x));
                            break;
                        }
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_installments_form;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        boolean z12 = bundle != null;
        b.a aVarA = com.avito.android.installments.form.di.a.a();
        com.avito.android.installments.form.di.c cVar = (com.avito.android.installments.form.di.c) C29972i.a(C29972i.b(this), com.avito.android.installments.form.di.c.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Uri uri = b2().f172598b;
        String string = uri != null ? uri.toString() : null;
        String str = b2().f172599c;
        Map<String, Object> mapC = b2().f172601e;
        if (mapC == null) {
            mapC = kotlin.collections.P0.c();
        }
        Map<String, Object> map = mapC;
        Map<String, Map<String, Integer>> mapC2 = b2().f172602f;
        if (mapC2 == null) {
            mapC2 = kotlin.collections.P0.c();
        }
        aVarA.a(cVar, interfaceC39417aA, string, str, z12, map, mapC2, b2().f172605i, com.avito.android.analytics.screens.s.a(this), b2().f172603g).a(this);
        com.avito.android.installments.form.m mVar = this.f172583r;
        (mVar != null ? mVar : null).a(fA2.b());
    }

    public final void a2(ArrayList arrayList, boolean z12) {
        int i12 = z12 ? -1 : 0;
        ArrayList<String> arrayListA = C35755b0.a(arrayList);
        if (O2.a(arrayListA)) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("extra_post_message_actions", arrayListA);
            G0 g02 = G0.f406611a;
            setResult(i12, intent);
        } else {
            setResult(i12);
        }
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final InstallmentsFormScreenParams b2() {
        return (InstallmentsFormScreenParams) this.f172586u.getValue();
    }

    public final t c2() {
        return (t) this.f172585t.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        c2().accept(a.C1268a.f17891a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.installments.form.m mVar = this.f172583r;
        if (mVar == null) {
            mVar = null;
        }
        mVar.e();
        View viewK1 = K1();
        com.avito.android.credits.web_handler.b bVar = this.f172579n;
        com.avito.android.credits.web_handler.b bVar2 = bVar != null ? bVar : null;
        c cVar = new c(1, this, InstallmentsFormActivity.class, "onShowFileChooser", "onShowFileChooser(Landroid/webkit/ValueCallback;)V", 0);
        d dVar = new d(1, this, InstallmentsFormActivity.class, "onUri", "onUri(Landroid/net/Uri;)Z", 0);
        e eVar = new e(0, this, InstallmentsFormActivity.class, "onErrorRetryButtonClick", "onErrorRetryButtonClick()V", 0);
        f fVar = new f(1, this, InstallmentsFormActivity.class, "onWebViewStateChanged", "onWebViewStateChanged(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", 0);
        g gVar = new g(2, this, InstallmentsFormActivity.class, "onPostMessage", "onPostMessage(Ljava/lang/String;Ljava/lang/String;)V", 0);
        Loader loader = b2().f172604h;
        w wVar = this.f172580o;
        w wVar2 = wVar != null ? wVar : null;
        com.avito.android.cookie_provider.e eVar2 = this.f172581p;
        this.f172578m = new p(viewK1, bVar2, cVar, dVar, eVar, fVar, gVar, loader, wVar2, eVar2 != null ? eVar2 : null, b2().f172607k);
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        String str = b2().f172600d;
        if (str != null) {
            textView.setText(str);
        }
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 6));
        }
        com.avito.android.arch.mvi.android.f.a(c2(), this, Lifecycle.State.f46681d, new h(1, this, InstallmentsFormActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormOneTimeEvent;)V", 0), new i());
        com.avito.android.installments.form.m mVar2 = this.f172583r;
        (mVar2 != null ? mVar2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        this.f172587v = null;
        p pVar = this.f172578m;
        if (pVar != null) {
            pVar.f172817m.e();
            pVar.f172805a.b();
            com.avito.android.installments.form.loader.c cVar = pVar.f172816l;
            cVar.f172711e = null;
            cVar.f172708b = null;
            com.avito.android.installments.form.loader.d dVar = cVar.f172709c;
            if (dVar != null) {
                dVar.cancel();
            }
            cVar.f172709c = null;
            PowerWebView powerWebView = pVar.f172815k;
            powerWebView.setWebResourceErrorHandlerDelegate(null);
            powerWebView.setSslErrorHandlerDelegate(null);
            powerWebView.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(@Y61.k Bundle bundle) {
        p pVar;
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("installments-web");
        if (bundle2 == null || (pVar = this.f172578m) == null) {
            return;
        }
        pVar.f172815k.restoreState(bundle2);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        p pVar = this.f172578m;
        if (pVar != null) {
            pVar.f172815k.saveState(bundle2);
        }
        bundle.putBundle("installments-web", bundle2);
    }
}

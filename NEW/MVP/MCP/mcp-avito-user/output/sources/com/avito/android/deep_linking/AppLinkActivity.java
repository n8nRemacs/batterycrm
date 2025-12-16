package com.avito.android.deep_linking;

import Fu.InterfaceC13834a;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import arrow.core.AbstractC23662a;
import com.avito.android.CalledFrom;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35853n2;
import com.avito.android.util.L5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import vz.InterfaceC49400a;

/* compiled from: AppLinkActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/AppLinkActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/deep_linking/p;", "Lcom/avito/android/analytics/screens/j$b;", "Lvz/f;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AppLinkActivity extends com.avito.android.ui.activity.a implements InterfaceC29693p, InterfaceC28477j.b, vz.f {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f132801m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f132802n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public C35853n2 f132803o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC29673k f132804p;

    /* compiled from: AppLinkActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements Y41.l<CharSequence, G0> {
        @Override // Y41.l
        public final G0 invoke(CharSequence charSequence) {
            L5.b((AppLinkActivity) this.receiver, charSequence, 0);
            return G0.f406611a;
        }
    }

    /* compiled from: AppLinkActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Intent, G0> {
        @Override // Y41.l
        public final G0 invoke(Intent intent) {
            ((AppLinkActivity) this.receiver).startActivity(intent);
            return G0.f406611a;
        }
    }

    @Override // vz.f
    @Y61.k
    public final InterfaceC49400a G0() {
        return InterfaceC49400a.C12800a.f441061a;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29693p
    public final void S0(@Y61.k Uri uri) {
        V v12 = V.f132879a;
        C35853n2 c35853n2 = this.f132803o;
        if (c35853n2 == null) {
            c35853n2 = null;
        }
        C35853n2 c35853n22 = c35853n2;
        Resources resources = getResources();
        a aVar = new a(1, this, L5.class, "showToast", "showToast(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;", 9);
        b bVar = new b(1, this, AppLinkActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
        v12.getClass();
        V.a(c35853n22, resources, uri, aVar, bVar);
    }

    @Override // com.avito.android.deep_linking.InterfaceC29693p
    public final void a(@Y61.k DeepLink deepLink) {
        Bundle bundleM = com.avito.android.actions_sheet.a.m("screen_source", "appLink");
        com.avito.android.util.H.c(bundleM, new CalledFrom.AppLinking(deepLink.getPath()));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f132802n;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, bundleM, 2);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        com.google.firebase.dynamiclinks.c cVar;
        super.onCreate(bundle);
        setContentView(R.layout.app_link);
        ((InterfaceC13834a.b) C29972i.a(C29972i.b(this), InterfaceC13834a.b.class)).M9().a(cv.c.c(this)).a(this);
        U u12 = U.f132876a;
        Intent intent = getIntent();
        C29663a c29663a = new C29663a(this);
        u12.getClass();
        try {
            synchronized (com.google.firebase.dynamiclinks.c.class) {
                com.google.firebase.g gVarC = com.google.firebase.g.c();
                synchronized (com.google.firebase.dynamiclinks.c.class) {
                    cVar = (com.google.firebase.dynamiclinks.c) gVarC.b(com.google.firebase.dynamiclinks.c.class);
                }
                cVar.a(intent).c(new T(c29663a)).e(new T(c29663a));
            }
            cVar.a(intent).c(new T(c29663a)).e(new T(c29663a));
        } catch (RuntimeException e12) {
            AbstractC23662a.f56267a.getClass();
            c29663a.invoke(new AbstractC23662a.b(e12));
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC29673k interfaceC29673k = this.f132804p;
        if (interfaceC29673k == null) {
            interfaceC29673k = null;
        }
        interfaceC29673k.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        InterfaceC29673k interfaceC29673k = this.f132804p;
        if (interfaceC29673k == null) {
            interfaceC29673k = null;
        }
        interfaceC29673k.a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        InterfaceC29673k interfaceC29673k = this.f132804p;
        if (interfaceC29673k == null) {
            interfaceC29673k = null;
        }
        interfaceC29673k.c0();
        super.onStop();
    }
}

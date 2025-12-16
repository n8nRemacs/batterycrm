package com.avito.android.onboarding.dialog.deeplinks;

import Y61.k;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.onboarding.OnboardingLink;
import com.avito.android.onboarding.dialog.OnboardingDialogFragment;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import rv.C47919b;

/* compiled from: OnboardingDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/deeplinks/a;", "Lev/a;", "Lcom/avito/android/onboarding/OnboardingLink;", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<OnboardingLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f208755l = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f208756f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f208757g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f208758h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding.dialog.deeplinks.c f208759i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final x f208760j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f208761k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: OnboardingDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/onboarding/dialog/deeplinks/a$a;", "", "<init>", "()V", "", "ONBOARDING_TAG", "Ljava/lang/String;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.onboarding.dialog.deeplinks.a$a, reason: collision with other inner class name */
    public static final class C6231a {
        public /* synthetic */ C6231a(C42822w c42822w) {
            this();
        }

        public C6231a() {
        }
    }

    static {
        new C6231a(null);
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.onboarding.dialog.deeplinks.c cVar, @k x xVar) {
        this.f208756f = dVar;
        this.f208757g = fVar;
        this.f208758h = aVar;
        this.f208759i = cVar;
        this.f208760j = xVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OnboardingLink onboardingLink = (OnboardingLink) deepLink;
        OnboardingDialogFragment.a aVar = OnboardingDialogFragment.f208709q0;
        String str2 = onboardingLink.f208694b;
        aVar.getClass();
        this.f208756f.w1(OnboardingDialogFragment.a.a(str2, onboardingLink.f208695c, onboardingLink.f208696d, onboardingLink.f208697e), "OnboardingDeepLinkHandler");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f208757g.l1("OnboardingDeepLinkHandler");
        l41.g gVar = new l41.g() { // from class: com.avito.android.onboarding.dialog.deeplinks.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                int i12 = a.f208755l;
                a aVar = a.this;
                int i13 = Build.VERSION.SDK_INT;
                Bundle bundle = ((C47919b) obj).f437159b;
                Uri uri = (Uri) (i13 >= 34 ? (Parcelable) bundle.getParcelable("key_onboarding_uri", Uri.class) : bundle.getParcelable("key_onboarding_uri"));
                ToastMessageLink toastMessageLink = (ToastMessageLink) (i13 >= 34 ? (Parcelable) bundle.getParcelable("key_onboarding_toast_link", ToastMessageLink.class) : bundle.getParcelable("key_onboarding_toast_link"));
                String string = bundle.getString("key_onboarding_id");
                String string2 = bundle.getString("key_onboarding_context");
                if (string != null) {
                    com.avito.android.onboarding.dialog.deeplinks.c cVar = aVar.f208759i;
                    C43259k.d(cVar.f208769b, null, null, new com.avito.android.onboarding.dialog.deeplinks.b(cVar, string, string2, null), 3);
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar.f208758h;
                if (toastMessageLink != null) {
                    aVar.i(OnboardingLink.b.C6223b.f208699b, aVar2, toastMessageLink);
                } else if (uri == null) {
                    aVar.j(OnboardingLink.b.a.f208698b);
                } else {
                    aVar.i(OnboardingLink.b.C6223b.f208699b, aVar2, aVar.f208760j.e(uri));
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f208761k.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.onboarding.dialog.deeplinks.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f208761k.e();
    }
}

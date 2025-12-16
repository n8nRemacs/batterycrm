package com.avito.android.passport.remove_draft;

import Ju.InterfaceC14247a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportRemoveDraftLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.perf_const.PassportRemoveDraftScreen;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/remove_draft/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportRemoveDraftLink;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<PassportRemoveDraftLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f213882f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f213883g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f213884h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f213885i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f213886j;

    /* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/remove_draft/a$a;", "", "a", "b", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport.remove_draft.a$a, reason: collision with other inner class name */
    public interface InterfaceC6412a {

        /* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/remove_draft/a$a$a;", "LJu/a$a;", "Lcom/avito/android/passport/remove_draft/a$a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.remove_draft.a$a$a, reason: collision with other inner class name */
        public static final class C6413a implements InterfaceC14247a.InterfaceC0545a, InterfaceC6412a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6413a f213887b = new C6413a();
        }

        /* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/remove_draft/a$a$b;", "LJu/a$b;", "Lcom/avito/android/passport/remove_draft/a$a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.remove_draft.a$a$b */
        public static final class b implements InterfaceC14247a.b, InterfaceC6412a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f213888b = new b();
        }
    }

    @Inject
    public a(@Y61.k k kVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC28481c interfaceC28481c, @Y61.k R0 r02) {
        this.f213882f = kVar;
        this.f213883g = gVar;
        this.f213884h = iVar;
        this.f213885i = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
        PassportRemoveDraftScreen passportRemoveDraftScreen = PassportRemoveDraftScreen.f211164d;
        r.f90693e.getClass();
        this.f213886j = interfaceC28481c.a(new C28478k(passportRemoveDraftScreen, r.a.a(), "passportRemoveDraft"));
    }

    /* JADX WARN: Failed to inline method: com.avito.android.deeplink_handler.view.a.i.a.c(com.avito.android.deeplink_handler.view.a$i, int, com.avito.android.component.toast.f$c):void */
    /* JADX WARN: Not passed register '(r0v7 com.avito.android.component.toast.f$c)' in method call: com.avito.android.deeplink_handler.view.a.i.a.c(com.avito.android.deeplink_handler.view.a$i, int, com.avito.android.component.toast.f$c):void */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.passport.remove_draft.a r13, com.avito.android.deep_linking.links.PassportRemoveDraftLink r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.remove_draft.a.k(com.avito.android.passport.remove_draft.a, com.avito.android.deep_linking.links.PassportRemoveDraftLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f213885i, null, null, new b(this, (PassportRemoveDraftLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f213885i, null);
    }
}

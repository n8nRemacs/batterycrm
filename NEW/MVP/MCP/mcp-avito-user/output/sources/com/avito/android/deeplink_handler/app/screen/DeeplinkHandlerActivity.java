package com.avito.android.deeplink_handler.app.screen;

import Y41.l;
import Y61.k;
import Zu.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.InterfaceC23040h0;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35967w2;
import com.avito.android.util.C35974x2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkHandlerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink_handler/app/screen/DeeplinkHandlerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkHandlerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.app.screen.a f134477m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f134478n;

    /* compiled from: DeeplinkHandlerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deeplink_handler/app/screen/DeeplinkHandlerActivity$a;", "", "<init>", "()V", "", "EXTRA_DEEPLINK", "Ljava/lang/String;", "", "REQ_DEEPLINK", "I", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeeplinkHandlerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/deeplink_handler/app/screen/DeeplinkHandlerActivity$b", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.C4058a f134479b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeeplinkHandlerActivity f134480c;

        public b(a.C4058a c4058a, DeeplinkHandlerActivity deeplinkHandlerActivity) {
            this.f134480c = deeplinkHandlerActivity;
            this.f134479b = c4058a;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar) {
            this.f134479b.J(intent, i12, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@k Intent intent, @k l<? super Exception, G0> lVar) {
            DeeplinkHandlerActivity deeplinkHandlerActivity = this.f134480c;
            try {
                C35974x2.d(intent);
                deeplinkHandlerActivity.startActivityForResult(intent, 1);
            } catch (Exception e12) {
                lVar.invoke(e12);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @k Intent intent) {
            this.f134479b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@k l<? super Context, G0> lVar) {
            this.f134479b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f134479b.s1();
        }
    }

    /* compiled from: DeeplinkHandlerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<G0, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            DeeplinkHandlerActivity deeplinkHandlerActivity = DeeplinkHandlerActivity.this;
            if (!deeplinkHandlerActivity.f134478n) {
                deeplinkHandlerActivity.setResult(-1);
            }
            if (!deeplinkHandlerActivity.isFinishing()) {
                deeplinkHandlerActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeeplinkHandlerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f134482b;

        public d(l lVar) {
            this.f134482b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f134482b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f134482b;
        }

        public final int hashCode() {
            return this.f134482b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f134482b.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    @k
    public final a.InterfaceC4053a N1() {
        return new b(new a.C4058a(this), this);
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: R1 */
    public final boolean getF304546k() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ((a.b) C29972i.a(C29972i.b(this), a.b.class)).Ia().a(cv.c.c(this), this, C35967w2.a(getIntent())).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        setResult(i13, intent);
        this.f134478n = true;
        super.onActivityResult(i12, i13, intent);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra(Constants.DEEPLINK);
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DeepLink deepLink = (DeepLink) parcelableExtra;
            com.avito.android.deeplink_handler.app.screen.a aVar = this.f134477m;
            if (aVar == null) {
                aVar = null;
            }
            aVar.g(deepLink);
        }
        com.avito.android.deeplink_handler.app.screen.a aVar2 = this.f134477m;
        (aVar2 != null ? aVar2 : null).Z0().observe(this, new d(new c()));
    }
}

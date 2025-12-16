package com.avito.android.auto_select.deeplink;

import Ju.AbstractC14250d;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.AutoSelectBookingCompletionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RefreshLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: AutoSelectBookingCompletionLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_select/deeplink/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutoSelectBookingCompletionLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f96034f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f96035g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f96036h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f96037i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public y f96038j;

    /* compiled from: AutoSelectBookingCompletionLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (i12 >= 34 ? (Parcelable) bundle.getParcelable("redirect_link_v2", DeepLink.class) : bundle.getParcelable("redirect_link_v2"));
            boolean z12 = bundle.getBoolean("refresh_on_close");
            b bVar = b.this;
            com.avito.android.deeplink_handler.handler.composite.a aVar = bVar.f96036h;
            if (deepLink != null) {
                bVar.i(AutoSelectBookingCompletionLink.b.a.f133031b, aVar, deepLink);
            } else if (z12) {
                bVar.i(WebViewLink.a.b.f133865b, aVar, new RefreshLink());
            } else {
                bVar.j(AbstractC14250d.c.f9171c);
            }
        }
    }

    @Inject
    public b(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C25719a c25719a) {
        this.f96034f = dVar;
        this.f96035g = fVar;
        this.f96036h = aVar;
        this.f96037i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutoSelectBookingCompletionLink autoSelectBookingCompletionLink = (AutoSelectBookingCompletionLink) deepLink;
        this.f96037i.b(autoSelectBookingCompletionLink, this, null, new com.avito.android.auto_select.deeplink.a(this, autoSelectBookingCompletionLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f96038j = (y) this.f96035g.l1(this.f395444b).t0(new a());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f96038j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}

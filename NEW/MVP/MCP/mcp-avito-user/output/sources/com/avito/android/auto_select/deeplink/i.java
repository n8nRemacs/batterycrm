package com.avito.android.auto_select.deeplink;

import Ju.AbstractC14250d;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.AutoSelectConfirmationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: AutoSelectConfirmationLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_select/deeplink/i;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AutoSelectConfirmationLink;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends AbstractC40161a<AutoSelectConfirmationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f96048f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f96049g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f96050h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f96051i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public y f96052j;

    /* compiled from: AutoSelectConfirmationLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (i12 >= 34 ? (Parcelable) bundle.getParcelable("redirect_link", DeepLink.class) : bundle.getParcelable("redirect_link"));
            i iVar = i.this;
            if (deepLink != null) {
                iVar.i(AutoSelectConfirmationLink.b.a.f133033b, iVar.f96050h, deepLink);
            } else {
                iVar.j(AbstractC14250d.c.f9171c);
            }
        }
    }

    @Inject
    public i(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C25719a c25719a) {
        this.f96048f = dVar;
        this.f96049g = fVar;
        this.f96050h = aVar;
        this.f96051i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutoSelectConfirmationLink autoSelectConfirmationLink = (AutoSelectConfirmationLink) deepLink;
        this.f96051i.b(autoSelectConfirmationLink, this, null, new h(this, autoSelectConfirmationLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f96052j = (y) this.f96049g.l1("auto_select_confirmation_result").t0(new a());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f96052j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}

package com.avito.android.autoteka.deeplinks.previewsearch;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import com.avito.android.autoteka.presentation.previewsearch.AutotekaPreviewSearchActivity;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AutotekaPreviewSearchDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/previewsearch/a;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40161a<AutotekaPreviewSearchLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f96290f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96291g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f96292h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f96293i;

    /* compiled from: AutotekaPreviewSearchDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.deeplinks.previewsearch.a$a, reason: collision with other inner class name */
    public static final class C2849a<T> implements r {
        public C2849a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: AutotekaPreviewSearchDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            if (((C47918a) obj).f437156b == -1) {
                aVar.j(AutotekaPreviewSearchLink.b.C2846b.f96232b);
            } else {
                aVar.j(AutotekaPreviewSearchLink.b.a.f96231b);
            }
        }
    }

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f96290f = context;
        this.f96291g = interfaceC4053a;
        this.f96292h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaPreviewSearchDetails autotekaPreviewSearchDetails = ((AutotekaPreviewSearchLink) deepLink).f96230b;
        Intent intent = new Intent(this.f96290f, (Class<?>) AutotekaPreviewSearchActivity.class);
        intent.putExtra("KeyAutotekaPreviewDetails", autotekaPreviewSearchDetails);
        intent.addFlags(67108864);
        this.f96291g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f96293i = (y) this.f96292h.Q().N(new C2849a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f96293i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}

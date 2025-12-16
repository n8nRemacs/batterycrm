package com.avito.android.barcode;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ShowBarcodeLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ShowBarcodeLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ShowBarcodeLink;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC40161a<ShowBarcodeLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f98668f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f98669g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.barcode.a f98670h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f98671i;

    /* compiled from: ShowBarcodeLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(f.this);
        }
    }

    /* compiled from: ShowBarcodeLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            f.this.j(ShowBarcodeLink.b.f133663b);
        }
    }

    @Inject
    public f(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.barcode.a aVar) {
        this.f98668f = bVar;
        this.f98669g = interfaceC4053a;
        this.f98670h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ShowBarcodeLink showBarcodeLink = (ShowBarcodeLink) deepLink;
        BarcodeFormat.a aVar = BarcodeFormat.f98754c;
        String str2 = showBarcodeLink.f133660c;
        aVar.getClass();
        BarcodeFormat barcodeFormatA = BarcodeFormat.a.a(str2);
        if (barcodeFormatA != null) {
            this.f98669g.J(this.f98670h.a(barcodeFormatA, showBarcodeLink.f133659b, showBarcodeLink.f133661d, showBarcodeLink.f133662e), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f98671i = (y) this.f98668f.Q().N(new a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f98671i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f98671i = null;
    }
}

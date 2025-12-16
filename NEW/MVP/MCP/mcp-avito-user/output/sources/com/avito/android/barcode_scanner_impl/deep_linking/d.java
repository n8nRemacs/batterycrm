package com.avito.android.barcode_scanner_impl.deep_linking;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.barcode_scanner_public.BarcodeScannerLink;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import com.avito.android.beduin_shared.common.action.BeduinApplyTransformAction;
import com.avito.android.beduin_shared.common.action.BeduinSendActionsToFormAction;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import dh.InterfaceC39726b;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: BarcodeScannerLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/deep_linking/d;", "Lev/a;", "Lcom/avito/android/barcode_scanner_public/BarcodeScannerLink;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC40161a<BarcodeScannerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f98871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f98872g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC39726b f98873h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC49066a f98874i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f98875j;

    /* compiled from: BarcodeScannerLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: BarcodeScannerLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("BARCODE_VALUE_RESULT_KEY") : null;
            d dVar = d.this;
            if (c47918a.f437156b != -1 || stringExtra == null) {
                dVar.j(BarcodeScannerLink.b.a.f99047b);
                return;
            }
            BarcodeScannerLink barcodeScannerLinkC = dVar.c();
            String str = barcodeScannerLinkC != null ? barcodeScannerLinkC.f99045b : null;
            BarcodeScannerLink barcodeScannerLinkC2 = dVar.c();
            String str2 = barcodeScannerLinkC2 != null ? barcodeScannerLinkC2.f99046c : null;
            if (str != null && str2 != null) {
                dVar.f98874i.a(str, Collections.singletonList(new BeduinSendActionsToFormAction(str, Collections.singletonList(new BeduinApplyTransformAction(str2, str, Collections.singletonList(new TextTransform(stringExtra)))))));
            }
            dVar.j(new BarcodeScannerLink.b.C2983b(stringExtra));
        }
    }

    @Inject
    public d(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC39726b interfaceC39726b, @k InterfaceC49066a interfaceC49066a) {
        this.f98871f = bVar;
        this.f98872g = interfaceC4053a;
        this.f98873h = interfaceC39726b;
        this.f98874i = interfaceC49066a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f98872g.J(this.f98873h.a(new BarcodeScannerParams(com.avito.android.printable_text.a.a(R.string.scanner_description_znak), BarcodeScannerType.f99053b, true)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f98875j = (y) this.f98871f.Q().N(new a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f98875j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f98875j = null;
    }
}

package com.avito.android.serp.adapter.gallery;

import com.adjust.sdk.Constants;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import or0.C44851a;

/* compiled from: GalleryHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$ActiveButton;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$ActiveButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class u extends N implements Y41.l<GalleryHeaderWidget.ActiveButton, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f270073l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270074m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, int i12) {
        super(1);
        this.f270073l = tVar;
        this.f270074m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(GalleryHeaderWidget.ActiveButton activeButton) {
        GalleryHeaderWidget.ActiveButton activeButton2 = activeButton;
        m mVar = this.f270073l.f270069j;
        if (mVar != null) {
            n nVar = mVar.f270042a;
            b.a.a(nVar.f270046b, activeButton2.getDeepLink(), null, null, 6);
            p pVar = mVar.f270043b;
            String strTE = pVar.TE(this.f270074m);
            d.a.a(nVar.f270047c, Integer.valueOf(mVar.f270044c), "gallery_header_widget", strTE, null, null, null, null, mVar.f270045d.f270010g, 120);
            nVar.f270048d.c(new C44851a(pVar.Xn(), activeButton2.getText(), strTE, nVar.f270049e));
        }
        return G0.f406611a;
    }
}

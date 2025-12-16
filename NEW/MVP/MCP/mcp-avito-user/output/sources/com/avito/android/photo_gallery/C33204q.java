package com.avito.android.photo_gallery;

import android.net.Uri;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/q;", "Lcom/avito/android/photo_gallery/autoteka_teaser/b;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_gallery.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33204q implements com.avito.android.photo_gallery.autoteka_teaser.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyPhotoGalleryActivity f217575a;

    public C33204q(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
        this.f217575a = legacyPhotoGalleryActivity;
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void a() {
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f217575a;
        String str = legacyPhotoGalleryActivity.f216546O;
        if (str == null) {
            return;
        }
        yf.m mVar = legacyPhotoGalleryActivity.f216580w;
        if (mVar == null) {
            mVar = null;
        }
        FromBlock fromBlock = FromBlock.f96083c;
        legacyPhotoGalleryActivity.startActivity(mVar.a(103, str));
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void b(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str) {
        z zVar = this.f217575a.f216558a0;
        if (zVar != null) {
            b.a.a(zVar.f217732d, new AutotekaBuyReportLink(uri.toString(), str, null, null, 12, null), null, null, 6);
            zVar.f217736h.l(zVar.f217730b, uri.toString(), fromBlock);
        }
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void d(@Y61.k FromBlock fromBlock) {
        AutotekaReportLink exampleReportLink;
        Uri url;
        z zVar;
        LegacyPhotoGalleryActivity.a aVar = LegacyPhotoGalleryActivity.f216531m0;
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f217575a;
        AutotekaTeaserResult autotekaTeaserResult = legacyPhotoGalleryActivity.d2().f216607r;
        if (autotekaTeaserResult == null || (exampleReportLink = autotekaTeaserResult.getExampleReportLink()) == null || (url = exampleReportLink.getUrl()) == null || (zVar = legacyPhotoGalleryActivity.f216558a0) == null) {
            return;
        }
        String strValueOf = String.valueOf(fromBlock.f96095b);
        Uri.Builder builderBuildUpon = url.buildUpon();
        builderBuildUpon.appendQueryParameter("fromBlock", strValueOf);
        b.a.a(zVar.f217732d, new AutotekaBuyReportLink(builderBuildUpon.build().toString(), null, null, null), null, null, 6);
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void e(@Y61.k DeepLink deepLink) {
        z zVar = this.f217575a.f216558a0;
        if (zVar != null) {
            b.a.a(zVar.f217732d, deepLink, null, null, 6);
        }
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void f(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str) {
        z zVar = this.f217575a.f216558a0;
        if (zVar != null) {
            b.a.a(zVar.f217732d, new AutotekaBuyReportLink(uri.toString(), str, null, null, 12, null), null, null, 6);
            zVar.f217736h.l(zVar.f217730b, uri.toString(), fromBlock);
        }
    }

    @Override // com.avito.android.photo_gallery.autoteka_teaser.b
    public final void c() {
    }
}

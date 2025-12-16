package sN0;

import Y61.k;
import Y61.l;
import com.avito.android.video_snippets.g;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VideoSnippetQueueUtilsImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsN0/c;", "LsN0/b;", "_avito_video-snippets-utils_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: sN0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48081c implements InterfaceC48080b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final tN0.b f437634a;

    @Inject
    public C48081c(@k tN0.b bVar) {
        this.f437634a = bVar;
    }

    @Override // sN0.InterfaceC48080b
    public final boolean a(float f12, @k String str, @l Map.Entry<String, g.c> entry, @l Float f13) {
        if (f12 >= 0.2f) {
            if ((!L.f(entry != null ? entry.getKey() : null, str) || entry.getValue().f326091e < 0.8f || f12 >= 0.8f) && (f12 >= 0.8f || f13 == null || f13.floatValue() < f12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad  */
    @Override // sN0.InterfaceC48080b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(@Y61.l com.avito.android.serp.adapter.l1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r5
            com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem r0 = (com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L3d
            java.util.List r0 = r0.getGalleryItemsList()
            if (r0 == 0) goto L3d
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r3 == 0) goto L1a
            goto L2a
        L29:
            r2 = r1
        L2a:
            boolean r0 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r0 != 0) goto L2f
            r2 = r1
        L2f:
            com.avito.android.remote.model.VideoGalleryItemModel r2 = (com.avito.android.remote.model.VideoGalleryItemModel) r2
            if (r2 == 0) goto L3d
            java.lang.String r0 = r2.getVideoUrl()
            if (r0 != 0) goto L3a
            goto L3d
        L3a:
            r1 = r0
            goto Lbb
        L3d:
            boolean r0 = r5 instanceof com.avito.android.serp.adapter.AdvertItem
            if (r0 == 0) goto L45
            r0 = r5
            com.avito.android.serp.adapter.AdvertItem r0 = (com.avito.android.serp.adapter.AdvertItem) r0
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 == 0) goto L72
            java.util.List<com.avito.android.remote.model.ConstructorAdvertGalleryItemModel> r0 = r0.f268406T
            if (r0 == 0) goto L72
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r3 == 0) goto L54
            goto L64
        L63:
            r2 = r1
        L64:
            boolean r0 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r0 != 0) goto L69
            r2 = r1
        L69:
            com.avito.android.remote.model.VideoGalleryItemModel r2 = (com.avito.android.remote.model.VideoGalleryItemModel) r2
            if (r2 == 0) goto L72
            java.lang.String r0 = r2.getVideoUrl()
            goto L73
        L72:
            r0 = r1
        L73:
            if (r0 != 0) goto L3a
            boolean r0 = r5 instanceof com.avito.android.serp.adapter.advert_xl.AdvertXlItem
            if (r0 == 0) goto L7d
            r0 = r5
            com.avito.android.serp.adapter.advert_xl.AdvertXlItem r0 = (com.avito.android.serp.adapter.advert_xl.AdvertXlItem) r0
            goto L7e
        L7d:
            r0 = r1
        L7e:
            if (r0 == 0) goto Laa
            java.util.List<com.avito.android.remote.model.ConstructorAdvertGalleryItemModel> r0 = r0.f268781e
            if (r0 == 0) goto Laa
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L8c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r3 == 0) goto L8c
            goto L9c
        L9b:
            r2 = r1
        L9c:
            boolean r0 = r2 instanceof com.avito.android.remote.model.VideoGalleryItemModel
            if (r0 != 0) goto La1
            r2 = r1
        La1:
            com.avito.android.remote.model.VideoGalleryItemModel r2 = (com.avito.android.remote.model.VideoGalleryItemModel) r2
            if (r2 == 0) goto Laa
            java.lang.String r0 = r2.getVideoUrl()
            goto Lab
        Laa:
            r0 = r1
        Lab:
            if (r0 != 0) goto L3a
            boolean r0 = r5 instanceof com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem
            if (r0 == 0) goto Lb4
            com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem r5 = (com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem) r5
            goto Lb5
        Lb4:
            r5 = r1
        Lb5:
            if (r5 == 0) goto Lbb
            java.lang.String r1 = r5.getVideoUrlString()
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sN0.C48081c.b(com.avito.android.serp.adapter.l1):java.lang.String");
    }

    @Override // sN0.InterfaceC48080b
    public final void c(@k List<String> list) {
        this.f437634a.a(list);
    }
}

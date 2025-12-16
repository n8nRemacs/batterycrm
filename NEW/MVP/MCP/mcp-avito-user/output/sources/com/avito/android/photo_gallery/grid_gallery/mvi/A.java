package com.avito.android.photo_gallery.grid_gallery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "LT70/d;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements com.avito.android.arch.mvi.t<GridGalleryInternalAction, T70.d> {
    @Inject
    public A() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    @Override // com.avito.android.arch.mvi.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T70.d b(com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction r31) {
        /*
            r30 = this;
            r0 = r31
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction) r0
            boolean r1 = r0 instanceof com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.CloseScreen
            if (r1 == 0) goto L15
            T70.d$a r1 = new T70.d$a
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction$CloseScreen r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.CloseScreen) r0
            int r2 = r0.f217322b
            java.lang.Long r0 = r0.f217323c
            r1.<init>(r2, r0)
            goto Lcb
        L15:
            boolean r1 = r0 instanceof com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.OpenFullScreenGallery
            r2 = 0
            if (r1 == 0) goto La0
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction$OpenFullScreenGallery r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.OpenFullScreenGallery) r0
            com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams r1 = r0.f217327b
            java.util.List<com.avito.android.remote.model.Image> r4 = r1.f217125c
            java.util.List<com.avito.android.remote.model.beduin_teaser.BeduinTeaser> r3 = r1.f217142t
            if (r3 == 0) goto L4e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L45
            java.lang.Object r6 = r3.next()
            com.avito.android.remote.model.beduin_teaser.BeduinTeaser r6 = (com.avito.android.remote.model.beduin_teaser.BeduinTeaser) r6
            com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser r6 = r6.getFullscreen()
            if (r6 == 0) goto L2f
            r5.add(r6)
            goto L2f
        L45:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L4e
            r22 = r5
            goto L50
        L4e:
            r22 = r2
        L50:
            com.avito.android.photo_gallery.LegacyPhotoGalleryOpenParams r2 = new com.avito.android.photo_gallery.LegacyPhotoGalleryOpenParams
            r3 = r2
            com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar r5 = r1.f217146x
            r26 = r5
            r27 = 0
            int r5 = r0.f217328c
            java.util.List<java.lang.Integer> r6 = r1.f217127e
            java.util.List<com.avito.android.remote.model.Image> r7 = r1.f217128f
            java.lang.Boolean r8 = r1.f217129g
            r9 = 0
            com.avito.android.remote.model.Video r10 = r1.f217130h
            com.avito.android.remote.model.NativeVideo r11 = r1.f217131i
            java.lang.String r12 = r1.f217132j
            java.lang.String r13 = r1.f217133k
            com.avito.android.analytics.provider.clickstream.TreeClickStreamParent r14 = r1.f217134l
            com.avito.android.remote.model.AdvertActions r15 = r1.f217135m
            com.avito.android.remote.model.advert_details.ContactBarData r0 = r1.f217136n
            r16 = r0
            com.avito.android.remote.model.advert_details.GalleryBuyButtonData r0 = r1.f217137o
            r17 = r0
            java.lang.Long r0 = r1.f217138p
            r18 = r0
            java.lang.String r0 = r1.f217139q
            r19 = r0
            com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult r0 = r1.f217140r
            r20 = r0
            com.avito.android.remote.model.model_card.GalleryTeaser r0 = r1.f217141s
            r21 = r0
            boolean r0 = r1.f217143u
            r23 = r0
            com.avito.android.remote.model.AddedByAvitoParams r0 = r1.f217144v
            r24 = r0
            java.util.List<com.avito.android.remote.model.images_groups.ImageGroup> r0 = r1.f217145w
            r25 = r0
            r28 = 8388640(0x800020, float:1.1754988E-38)
            r29 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            T70.d$c r1 = new T70.d$c
            r1.<init>(r2)
            goto Lcb
        La0:
            boolean r1 = r0 instanceof com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.SmoothScrollToItem
            if (r1 == 0) goto Lae
            T70.d$e r1 = new T70.d$e
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction$SmoothScrollToItem r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.SmoothScrollToItem) r0
            int r0 = r0.f217330b
            r1.<init>(r0)
            goto Lcb
        Lae:
            boolean r1 = r0 instanceof com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.ScrollToItem
            if (r1 == 0) goto Lbc
            T70.d$d r1 = new T70.d$d
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction$ScrollToItem r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.ScrollToItem) r0
            int r0 = r0.f217329b
            r1.<init>(r0)
            goto Lcb
        Lbc:
            boolean r1 = r0 instanceof com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.OpenDeeplink
            if (r1 == 0) goto Lca
            T70.d$b r1 = new T70.d$b
            com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction$OpenDeeplink r0 = (com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction.OpenDeeplink) r0
            com.avito.android.deep_linking.links.DeepLink r0 = r0.f217326b
            r1.<init>(r0)
            goto Lcb
        Lca:
            r1 = r2
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.grid_gallery.mvi.A.b(java.lang.Object):java.lang.Object");
    }
}

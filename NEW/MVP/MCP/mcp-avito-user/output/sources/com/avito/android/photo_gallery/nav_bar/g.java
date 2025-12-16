package com.avito.android.photo_gallery.nav_bar;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.photo_gallery.nav_bar.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhotoGalleryNavBarDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarDropdownMenuItem;", "popupMenuItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_gallery/nav_bar/PhotoGalleryNavBarDropdownMenuItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<PhotoGalleryNavBarDropdownMenuItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f217561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar) {
        super(1);
        this.f217561l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem) {
        DeepLink deepLink;
        PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem2 = photoGalleryNavBarDropdownMenuItem;
        a aVar = this.f217561l;
        aVar.getClass();
        PhotoGalleryNavBarMenuItemType photoGalleryNavBarMenuItemType = photoGalleryNavBarDropdownMenuItem2.f217489b;
        int i12 = photoGalleryNavBarMenuItemType == null ? -1 : a.C6525a.f217548a[photoGalleryNavBarMenuItemType.ordinal()];
        if (i12 == 3) {
            aVar.e();
        } else if (i12 == 5 && (deepLink = photoGalleryNavBarDropdownMenuItem2.f217492e) != null) {
            b.a.a(aVar.f217528g, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}

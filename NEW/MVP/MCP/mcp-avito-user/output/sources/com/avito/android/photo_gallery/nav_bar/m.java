package com.avito.android.photo_gallery.nav_bar;

import android.widget.PopupWindow;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: PhotoGalleryToolbarPopup.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<PopupWindow> f217570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhotoGalleryNavBarDropdownMenuItem, G0> f217571m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PhotoGalleryNavBarDropdownMenuItem f217572n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(l0.h<PopupWindow> hVar, Y41.l<? super PhotoGalleryNavBarDropdownMenuItem, G0> lVar, PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem) {
        super(0);
        this.f217570l = hVar;
        this.f217571m = lVar;
        this.f217572n = photoGalleryNavBarDropdownMenuItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PopupWindow popupWindow = this.f217570l.f406842b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f217571m.invoke(this.f217572n);
        return G0.f406611a;
    }
}

package com.avito.android.user_advert.advert;

import Zd.InterfaceC19542a;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import javax.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class B implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsActivity f308209b;

    public /* synthetic */ B(MyAdvertDetailsActivity myAdvertDetailsActivity, int i12) {
        this.f308208a = i12;
        this.f308209b = myAdvertDetailsActivity;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f308208a) {
            case 0:
                PhotoGalleryIntentFactory photoGalleryIntentFactory = this.f308209b.f308336v;
                if (photoGalleryIntentFactory != null) {
                    return photoGalleryIntentFactory;
                }
                return null;
            case 1:
                InterfaceC35426j0 interfaceC35426j0 = this.f308209b.f308326q;
                if (interfaceC35426j0 != null) {
                    return interfaceC35426j0;
                }
                return null;
            case 2:
                InterfaceC35426j0 interfaceC35426j02 = this.f308209b.f308326q;
                if (interfaceC35426j02 != null) {
                    return interfaceC35426j02;
                }
                return null;
            case 3:
                InterfaceC19542a interfaceC19542a = this.f308209b.f308340x;
                if (interfaceC19542a != null) {
                    return interfaceC19542a;
                }
                return null;
            default:
                InterfaceC35426j0 interfaceC35426j03 = this.f308209b.f308326q;
                if (interfaceC35426j03 != null) {
                    return interfaceC35426j03;
                }
                return null;
        }
    }
}

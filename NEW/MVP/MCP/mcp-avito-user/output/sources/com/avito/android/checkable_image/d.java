package com.avito.android.checkable_image;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.C27291k;
import com.avito.android.photo_gallery.ui.PhotoGallery;
import com.avito.android.remote.model.Video;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardReceipt;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.material.internal.CheckableImageButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f118074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f118075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f118076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f118077f;

    public /* synthetic */ d(int i12, Object obj, int i13, Object obj2, Object obj3) {
        this.f118073b = i13;
        this.f118075d = obj;
        this.f118076e = obj2;
        this.f118074c = i12;
        this.f118077f = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Object obj = this.f118076e;
        Object obj2 = this.f118075d;
        Object obj3 = this.f118077f;
        int i12 = this.f118074c;
        switch (this.f118073b) {
            case 0:
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj2;
                if (checkableImageButton.f356716b) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) ((Y41.l) obj).invoke(checkableImageButton);
                if (viewGroup.isAttachedToWindow()) {
                    q.c(checkableImageButton, viewGroup, (C27291k) ((l0.h) obj3).f406842b, i12);
                    return;
                }
                return;
            case 1:
                int i13 = PhotoGallery.f217675i;
                int size = ((ArrayList) obj).size();
                Video video = (Video) obj3;
                PhotoGallery photoGallery = (PhotoGallery) obj2;
                photoGallery.getClass();
                if (size > 1 || video != null) {
                    if (i12 > -1) {
                        photoGallery.b(i12);
                    } else {
                        photoGallery.b(photoGallery.getPager().getCurrentItem());
                    }
                    com.avito.android.photo_gallery.ui.h hVar = photoGallery.f217678d;
                    (hVar != null ? hVar : null).getView().setVisibility(0);
                } else {
                    com.avito.android.photo_gallery.ui.h hVar2 = photoGallery.f217678d;
                    (hVar2 != null ? hVar2 : null).getView().setVisibility(8);
                }
                photoGallery.setVisibility(0);
                return;
            case 2:
                r rVar = (r) obj;
                Runnable runnable = (Runnable) obj3;
                com.google.android.datatransport.runtime.scheduling.jobscheduling.i iVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.i) obj2;
                GX0.a aVar = iVar.f343209f;
                try {
                    try {
                        com.google.android.datatransport.runtime.scheduling.persistence.d dVar = iVar.f343206c;
                        Objects.requireNonNull(dVar);
                        aVar.b(new com.avito.android.str_seller_orders.orders_seller.d(dVar, 19));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar.f343204a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            aVar.b(new com.avito.android.avl.view.g(iVar, rVar, i12));
                        } else {
                            iVar.a(rVar, i12);
                        }
                    } catch (SynchronizationException unused) {
                        iVar.f343207d.b(rVar, i12 + 1);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    runnable.run();
                    throw th2;
                }
            default:
                com.geetest.gtc4.b.a((String) obj2, (GeeGuardReceipt) obj, i12, (GeeGuard.CallbackHandler) obj3);
                return;
        }
    }

    public /* synthetic */ d(View view, Object obj, Object obj2, int i12, int i13) {
        this.f118073b = i13;
        this.f118075d = view;
        this.f118076e = obj;
        this.f118077f = obj2;
        this.f118074c = i12;
    }
}

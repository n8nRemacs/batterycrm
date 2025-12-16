package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.photo_cache.PhotoUpload;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PhotoPickerResultHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photoUploads", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32222l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32228o f194527b;

    public C32222l(C32228o c32228o) {
        this.f194527b = c32228o;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32228o c32228o = this.f194527b;
        c32228o.getClass();
        Iterator<T> it = ((List) obj).iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            Uri uri = ((PhotoUpload) it.next()).f216308j;
            if (uri != null) {
                if (c32228o.f194536c.a(uri)) {
                    i12++;
                } else {
                    i13++;
                }
            }
        }
        InterfaceC28373a interfaceC28373a = c32228o.f194538e;
        if (i12 > 0) {
            interfaceC28373a.c(new y.a("messenger.photo.camera", i12));
        }
        if (i13 > 0) {
            interfaceC28373a.c(new y.a("messenger.photo.gallery", i13));
        }
    }
}

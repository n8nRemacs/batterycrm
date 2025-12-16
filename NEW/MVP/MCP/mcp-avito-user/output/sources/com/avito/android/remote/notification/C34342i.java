package com.avito.android.remote.notification;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: NotificationBitmapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/i;", "Lcom/facebook/imagepipeline/datasource/c;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.notification.i, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34342i extends com.facebook.imagepipeline.datasource.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C34343j f254055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c<P2<NotificationImages>> f254056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f254057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254058d;

    public C34342i(C34343j c34343j, com.jakewharton.rxrelay3.c<P2<NotificationImages>> cVar, int i12, int i13) {
        this.f254055a = c34343j;
        this.f254056b = cVar;
        this.f254057c = i12;
        this.f254058d = i13;
    }

    @Override // com.facebook.datasource.e
    public final void a(@Y61.k com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> fVar) {
        C34343j.c(this.f254055a, this.f254056b);
    }

    @Override // com.facebook.imagepipeline.datasource.c
    public final void g(@Y61.l Bitmap bitmap) {
        com.jakewharton.rxrelay3.c<P2<NotificationImages>> cVar = this.f254056b;
        C34343j c34343j = this.f254055a;
        if (bitmap == null) {
            C34343j.c(c34343j, cVar);
            return;
        }
        Bitmap bitmapB = C34343j.b(c34343j, bitmap, this.f254057c, this.f254058d);
        int f318657c = (int) (c34343j.f254059a.getF318657c() * 64);
        Bitmap bitmapB2 = C34343j.b(c34343j, bitmap, f318657c, f318657c);
        androidx.core.graphics.drawable.g gVarA = androidx.core.graphics.drawable.h.a(c34343j.f254061c.getResources(), bitmapB2);
        gVarA.f44758k = true;
        gVarA.f44757j = true;
        gVarA.f44754g = Math.min(gVarA.f44760m, gVarA.f44759l) / 2;
        gVarA.f44751d.setShader(gVarA.f44752e);
        gVarA.invalidateSelf();
        gVarA.b(f318657c / 2.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(f318657c, f318657c, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        gVarA.setBounds(0, 0, f318657c, f318657c);
        gVarA.draw(canvas);
        cVar.accept(new P2.b(new NotificationImages(bitmapB, bitmapB2, bitmapCreateBitmap)));
    }
}

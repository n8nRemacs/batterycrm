package com.avito.android.remote.notification;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.P2;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationBitmapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/j;", "Lcom/avito/android/remote/notification/f;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.notification.j, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34343j implements InterfaceC34339f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f254059a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f254060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f254061c;

    @Inject
    public C34343j(@Y61.k L0 l02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Context context) {
        this.f254059a = l02;
        this.f254060b = interfaceC35745a5;
        this.f254061c = context;
    }

    public static final Bitmap b(C34343j c34343j, Bitmap bitmap, int i12, int i13) {
        c34343j.getClass();
        float width = bitmap.getWidth() / i12;
        float height = bitmap.getHeight() / i13;
        if (width >= 1.0f && height >= 1.0f) {
            float fMin = Math.min(width, height);
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / fMin), (int) (bitmap.getHeight() / fMin), false);
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return bitmap.copy(config, false);
    }

    public static final void c(C34343j c34343j, com.jakewharton.rxrelay3.d dVar) {
        c34343j.getClass();
        dVar.accept(new P2.a(new ApiError.Custom(null, 1, null)));
    }

    @Override // com.avito.android.remote.notification.InterfaceC34339f
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.P a(@Y61.k Image image) {
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        L0 l02 = this.f254059a;
        int f318657c = (int) (l02.getF318657c() * 448);
        int f318657c2 = (int) (l02.getF318657c() * 186);
        Uri uriD = C35829k2.b(image, Math.min(l02.c(), f318657c), f318657c2, 0.0f, 2, 44).d();
        io.reactivex.rxjava3.core.H hA2 = this.f254060b.a();
        if (uriD == null) {
            return cVar.x0(hA2).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C34340g(this, cVar));
        }
        com.facebook.imagepipeline.core.p pVarA = com.facebook.drawee.backends.pipeline.d.a();
        com.facebook.common.internal.i<ImageRequest, Uri> iVar = ImageRequest.f340780o;
        com.facebook.datasource.c cVarA = pVarA.a(ImageRequestBuilder.b(uriD).a(), C34338e.f254048a);
        return cVar.x0(hA2).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C34341h(cVarA, new C34342i(this, cVar, f318657c, f318657c2), new androidx.media3.exoplayer.audio.o(hA2, 4))).J(new C31684n(cVarA, 15), io.reactivex.rxjava3.internal.functions.a.f401994d);
    }
}

package com.vk.push.core.data.imageloader;

import T11.f;
import Y41.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

/* compiled from: ImageDownloaderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.data.imageloader.ImageDownloaderImpl$download$2", f = "ImageDownloaderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super Bitmap>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f367018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f367019r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f367018q = str;
        this.f367019r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new c(this.f367018q, this.f367019r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Bitmap> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        b bVar = this.f367019r;
        String str = this.f367018q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        try {
            if (C43066x.K(str)) {
                throw new IllegalArgumentException("You have to provide a valid URL");
            }
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection.getContentLength() <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                return BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
            }
            ((f) bVar.f367017a.getValue()).a("Image size exceeds 1048576 bytes", null);
            return null;
        } catch (Exception e12) {
            ((f) bVar.f367017a.getValue()).error("Could not download image", e12);
            return null;
        }
    }
}

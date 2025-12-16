package com.avito.android.image_loader.fresco;

import com.avito.android.util.V2;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FrescoLoggingListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image_loader/fresco/f;", "Lcom/avito/android/image_loader/fresco/j;", "<init>", "()V", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements j {
    @Override // aX0.InterfaceC19835f
    public final void i(@Y61.l ImageRequest imageRequest, @Y61.l Object obj, @Y61.l String str, boolean z12) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("-> ");
        sb2.append(imageRequest != null ? imageRequest.f340782b : null);
        v22.c("FrescoLoggingListener", sb2.toString(), null);
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final boolean j(@Y61.l String str) {
        return false;
    }

    @Override // aX0.InterfaceC19835f
    public final void k(@Y61.l ImageRequest imageRequest, @Y61.l String str, @Y61.l Throwable th2, boolean z12) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Failed to load ");
        sb2.append(imageRequest != null ? imageRequest.f340782b : null);
        String string = sb2.toString();
        if (th2 == null) {
            th2 = new Exception("FrescoRequestListener: onRequestFailure");
        }
        v22.a("FrescoLoggingListener", string, th2);
    }

    @Override // aX0.InterfaceC19835f
    public final void d(@Y61.l String str) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void h(@Y61.l String str) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void a(@Y61.l String str, @Y61.l String str2) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void g(@Y61.l String str, @Y61.l String str2) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void b(@Y61.l String str, @Y61.l String str2, @Y61.l Map<String, String> map) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void c(@Y61.l String str, @Y61.l String str2, boolean z12) {
    }

    @Override // aX0.InterfaceC19835f
    public final void e(@Y61.l ImageRequest imageRequest, @Y61.l String str, boolean z12) {
    }

    @Override // com.facebook.imagepipeline.producers.n0
    public final void f(@Y61.l String str, @Y61.l String str2, @Y61.l Throwable th2, @Y61.l Map<String, String> map) {
    }
}

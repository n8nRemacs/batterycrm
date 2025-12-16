package com.avito.android.photo_picker;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CameraInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/a;", "", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC33224a {

    /* compiled from: CameraInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.a$a, reason: collision with other inner class name */
    public static final class C6572a {
    }

    @Y61.k
    List<FlashMode> a();

    /* renamed from: b */
    boolean getF218887g();

    int c(@Y61.k com.avito.android.device_orientation.c cVar);

    void d(@Y61.k u80.g gVar);

    void destroy();

    void e(@Y61.k com.avito.android.device_orientation.c cVar, @Y61.k u80.c cVar2);

    @Y61.l
    u80.c f(@Y61.k SurfaceTexture surfaceTexture, @Y61.k u80.c cVar, @Y61.k com.avito.android.device_orientation.c cVar2, @Y61.k u80.c cVar3);

    /* renamed from: g */
    boolean getF218886f();

    /* renamed from: h */
    boolean getF218885e();

    @Y61.k
    io.reactivex.rxjava3.core.z<byte[]> i(boolean z12);

    @Y61.k
    C41948f0 j(@Y61.k FlashMode flashMode);

    void k(@Y61.k RectF rectF, @Y61.l RectF rectF2);

    void l();
}

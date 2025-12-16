package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoSink;
import xJ.C49846a;

/* compiled from: SurfaceViewRendererApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/a;", "Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements AvCallsSurfaceViewRendererApi {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f164428a = new a();

    /* compiled from: SurfaceViewRendererApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4809a {
        static {
            int[] iArr = new int[AvCallsSurfaceViewRendererApi.ScalingTypeAspect.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect = AvCallsSurfaceViewRendererApi.ScalingTypeAspect.f164620b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect2 = AvCallsSurfaceViewRendererApi.ScalingTypeAspect.f164620b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    @k
    public final View a(@k Context context) {
        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
        surfaceViewRenderer.init(C49846a.f442334a.a().getEglBaseContext(), null);
        return surfaceViewRenderer;
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void b(@k View view, boolean z12) {
        if (view instanceof SurfaceViewRenderer) {
            ((SurfaceViewRenderer) view).setEnableHardwareScaler(z12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void c(@k View view) {
        if (view instanceof SurfaceViewRenderer) {
            VideoSink videoSink = (VideoSink) view;
            synchronized (d.f164436a) {
                Iterator it = d.f164437b.entrySet().iterator();
                while (it.hasNext()) {
                    ((c) ((Map.Entry) it.next()).getValue()).b(videoSink);
                }
            }
            ((SurfaceViewRenderer) view).release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void d(@k View view, @k String str, boolean z12, @k String str2) {
        if (view instanceof SurfaceViewRenderer) {
            VideoSink videoSink = (VideoSink) view;
            synchronized (d.f164436a) {
                try {
                    ProxyKey proxyKey = new ProxyKey(str, z12);
                    boolean z13 = false;
                    for (Map.Entry entry : d.f164437b.entrySet()) {
                        if (L.f(entry.getKey(), proxyKey)) {
                            ((c) entry.getValue()).a(videoSink, str2);
                            z13 = true;
                        } else {
                            ((c) entry.getValue()).b(videoSink);
                        }
                    }
                    if (!z13) {
                        LinkedHashMap linkedHashMap = d.f164437b;
                        c cVar = (c) linkedHashMap.get(proxyKey);
                        if (cVar == null) {
                            cVar = new c(proxyKey);
                            linkedHashMap.put(proxyKey, cVar);
                        }
                        cVar.a(videoSink, str2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void e(@k View view, @k AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect) {
        RendererCommon.ScalingType scalingType;
        if (view instanceof SurfaceViewRenderer) {
            SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) view;
            int iOrdinal = scalingTypeAspect.ordinal();
            if (iOrdinal == 0) {
                scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            } else if (iOrdinal == 1) {
                scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scalingType = RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
            }
            surfaceViewRenderer.setScalingType(scalingType);
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void f(@k View view, boolean z12) {
        if (view instanceof SurfaceViewRenderer) {
            ((SurfaceViewRenderer) view).setMirror(z12);
        }
    }
}

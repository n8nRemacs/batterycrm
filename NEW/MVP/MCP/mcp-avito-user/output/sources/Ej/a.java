package EJ;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi;
import com.avito.avcalls.android.video.g;
import com.avito.avcalls.android.video.view_api.SurfaceViewRendererApi;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: AvCallsSurfaceViewRendererApiImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEJ/a;", "Lcom/avito/android/iac_avcalls/public_module/video/AvCallsSurfaceViewRendererApi;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements AvCallsSurfaceViewRendererApi {

    /* compiled from: AvCallsSurfaceViewRendererApiImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EJ.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0225a {
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

    @Inject
    public a() {
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    @k
    public final View a(@k Context context) {
        SurfaceViewRendererApi.f332517a.getClass();
        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
        surfaceViewRenderer.init(g.f332484a.a().getEglBaseContext(), null);
        return surfaceViewRenderer;
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void b(@k View view, boolean z12) {
        SurfaceViewRendererApi.f332517a.getClass();
        if (view instanceof SurfaceViewRenderer) {
            ((SurfaceViewRenderer) view).setEnableHardwareScaler(z12);
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void c(@k View view) {
        SurfaceViewRendererApi.f332517a.getClass();
        SurfaceViewRendererApi.b(view);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void d(@k View view, @k String str, boolean z12, @k String str2) {
        SurfaceViewRendererApi.f332517a.getClass();
        SurfaceViewRendererApi.a(view, str, z12, str2);
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void e(@k View view, @k AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect) {
        SurfaceViewRendererApi.ScalingType scalingType;
        RendererCommon.ScalingType scalingType2;
        SurfaceViewRendererApi surfaceViewRendererApi = SurfaceViewRendererApi.f332517a;
        int iOrdinal = scalingTypeAspect.ordinal();
        if (iOrdinal == 0) {
            scalingType = SurfaceViewRendererApi.ScalingType.f332518b;
        } else if (iOrdinal == 1) {
            scalingType = SurfaceViewRendererApi.ScalingType.f332519c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scalingType = SurfaceViewRendererApi.ScalingType.f332520d;
        }
        surfaceViewRendererApi.getClass();
        if (view instanceof SurfaceViewRenderer) {
            SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) view;
            int iOrdinal2 = scalingType.ordinal();
            if (iOrdinal2 == 0) {
                scalingType2 = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            } else if (iOrdinal2 == 1) {
                scalingType2 = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scalingType2 = RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
            }
            surfaceViewRenderer.setScalingType(scalingType2);
        }
    }

    @Override // com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi
    public final void f(@k View view, boolean z12) {
        SurfaceViewRendererApi.f332517a.getClass();
        if (view instanceof SurfaceViewRenderer) {
            ((SurfaceViewRenderer) view).setMirror(z12);
        }
    }
}

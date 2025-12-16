package com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_avcalls.public_module.video.AvCallsSurfaceViewRendererApi;
import com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.IacUIVideoRendererState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: IacSurfaceViewRendererApi.kt */
@Singleton
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/video_renderers/a;", "", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AvCallsSurfaceViewRendererApi f166287a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Context, View> f166288b = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<View, IacUIVideoRendererState, G0> f166289c = new d();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<View, G0> f166290d = new c();

    /* compiled from: IacSurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/video_renderers/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a$a, reason: collision with other inner class name */
    public static final class C4936a {
        public /* synthetic */ C4936a(C42822w c42822w) {
            this();
        }

        public C4936a() {
        }
    }

    /* compiled from: IacSurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<Context, View> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final View invoke(Context context) {
            View viewA = a.this.f166287a.a(context);
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacUI", "videoRendererViewFactory: view.hash=" + viewA.hashCode(), null);
            return viewA;
        }
    }

    /* compiled from: IacSurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<View, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacUI", "videoRendererViewRelease: view.hash=" + view2.hashCode(), null);
            a.this.f166287a.c(view2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacSurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Landroid/view/View;Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<View, IacUIVideoRendererState, G0> {

        /* compiled from: IacSurfaceViewRendererApi.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a$d$a, reason: collision with other inner class name */
        public /* synthetic */ class C4937a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166294a;

            static {
                int[] iArr = new int[IacUIVideoRendererState.ScalingTypeAspect.values().length];
                try {
                    iArr[IacUIVideoRendererState.ScalingTypeAspect.FIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IacUIVideoRendererState.ScalingTypeAspect.FILL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IacUIVideoRendererState.ScalingTypeAspect.BALANCED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f166294a = iArr;
            }
        }

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(View view, IacUIVideoRendererState iacUIVideoRendererState) {
            AvCallsSurfaceViewRendererApi.ScalingTypeAspect scalingTypeAspect;
            View view2 = view;
            IacUIVideoRendererState iacUIVideoRendererState2 = iacUIVideoRendererState;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacUI", "videoRendererViewUpdate: view.hash=" + view2.hashCode() + ", state=" + iacUIVideoRendererState2, null);
            a aVar = a.this;
            aVar.f166287a.f(view2, iacUIVideoRendererState2.getMirror());
            int i12 = C4937a.f166294a[iacUIVideoRendererState2.getScalingType().ordinal()];
            if (i12 == 1) {
                scalingTypeAspect = AvCallsSurfaceViewRendererApi.ScalingTypeAspect.f164620b;
            } else if (i12 == 2) {
                scalingTypeAspect = AvCallsSurfaceViewRendererApi.ScalingTypeAspect.f164621c;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                scalingTypeAspect = AvCallsSurfaceViewRendererApi.ScalingTypeAspect.f164622d;
            }
            AvCallsSurfaceViewRendererApi avCallsSurfaceViewRendererApi = aVar.f166287a;
            avCallsSurfaceViewRendererApi.e(view2, scalingTypeAspect);
            avCallsSurfaceViewRendererApi.b(view2, iacUIVideoRendererState2.getHardwareScalerEnabled());
            avCallsSurfaceViewRendererApi.d(view2, iacUIVideoRendererState2.getCallId(), iacUIVideoRendererState2.isLocal(), iacUIVideoRendererState2.getPlacementTag().toString());
            ((SurfaceView) view2).setZOrderMediaOverlay(iacUIVideoRendererState2.getPlacementTag() == IacUIVideoRendererState.PlacementTag.Pip);
            return G0.f406611a;
        }
    }

    static {
        new C4936a(null);
    }

    @Inject
    public a(@k AvCallsSurfaceViewRendererApi avCallsSurfaceViewRendererApi) {
        this.f166287a = avCallsSurfaceViewRendererApi;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f166287a, ((a) obj).f166287a);
    }

    public final int hashCode() {
        return this.f166287a.hashCode();
    }

    @k
    public final String toString() {
        return "IacSurfaceViewRendererApi(avCallsSurfaceViewRendererApi=" + this.f166287a + ')';
    }
}

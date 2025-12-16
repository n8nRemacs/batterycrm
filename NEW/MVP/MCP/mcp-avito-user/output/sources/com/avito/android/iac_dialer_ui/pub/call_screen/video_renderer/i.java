package com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer;

import Y61.k;
import com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.IacUIVideoRendererState;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIVideoRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final IacUIVideoRendererState f167393a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final IacUIVideoRendererState f167394b;

    /* compiled from: IacUIVideoRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167395a;

        static {
            int[] iArr = new int[IacUIVideoRendererState.PlacementTag.values().length];
            try {
                iArr[IacUIVideoRendererState.PlacementTag.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacUIVideoRendererState.PlacementTag.Pip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167395a = iArr;
        }
    }

    static {
        IacUIVideoRendererState.PlacementTag placementTag = IacUIVideoRendererState.PlacementTag.FullScreen;
        IacUIVideoRendererState.ScalingTypeAspect scalingTypeAspect = IacUIVideoRendererState.ScalingTypeAspect.FILL;
        f167393a = new IacUIVideoRendererState(placementTag, "", false, false, false, scalingTypeAspect);
        f167394b = new IacUIVideoRendererState(IacUIVideoRendererState.PlacementTag.Pip, "", false, false, false, scalingTypeAspect);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
    @androidx.compose.runtime.InterfaceC22132o
    @android.annotation.SuppressLint({"ComposeAndroidView"})
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.IacUIVideoRendererState r16, @Y61.k Y41.l r17, @Y61.k Y41.p r18, @Y61.k Y41.l r19, @Y61.l androidx.compose.ui.v r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.i.a(com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.IacUIVideoRendererState, Y41.l, Y41.p, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}

package Ba1;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.text.style.LineHeightSpan;
import android.view.inspector.InspectionCompanion;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Ba1.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13127e {
    public static /* synthetic */ BlendModeColorFilter c(BlendMode blendMode) {
        return new BlendModeColorFilter(-3355444, blendMode);
    }

    public static /* synthetic */ HardwareRenderer f() {
        return new HardwareRenderer();
    }

    public static /* synthetic */ RenderNode i() {
        return new RenderNode("BlurEffect");
    }

    public static /* synthetic */ MediaSession k(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ LineHeightSpan.Standard n(int i12) {
        return new LineHeightSpan.Standard(i12);
    }

    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException o() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }
}

package ta1;

import Y41.l;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class g extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar) {
        super(1);
        this.f439288l = iVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        C48629c c48629c = (C48629c) this.f439288l.f436523j0.getValue();
        c48629c.getClass();
        RectF rectF = new RectF();
        ((Path) obj).computeBounds(rectF, true);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        c48629c.f439281d = rect;
        return G0.f406611a;
    }
}

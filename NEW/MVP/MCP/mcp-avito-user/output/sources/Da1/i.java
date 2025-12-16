package da1;

import aa1.n;
import aa1.p;
import android.graphics.Rect;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393924l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        super(1);
        this.f393924l = mVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393924l;
        n nVarF5 = mVar.f5();
        nVarF5.getClass();
        nVarF5.f20966k = rect;
        aa1.e eVarG5 = mVar.g5();
        eVarG5.getClass();
        p pVar = eVarG5.f20927a;
        pVar.getClass();
        pVar.f20975f = rect;
        return G0.f406611a;
    }
}

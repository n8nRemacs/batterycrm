package ET0;

import android.graphics.Rect;
import android.view.View;
import com.avito.beduin.v2.logger.LogLevel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4024b;

    public /* synthetic */ j(int i12) {
        this.f4024b = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        switch (this.f4024b) {
            case 0:
                view.setClipBounds(new Rect(0, 0, i14 - i12, i15 - i13));
                break;
            default:
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (RU0.b.f14469c <= 0) {
                    RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":GridLayoutAdapter"), "child size: " + view.getWidth() + " x " + view.getHeight());
                    break;
                }
                break;
        }
    }
}

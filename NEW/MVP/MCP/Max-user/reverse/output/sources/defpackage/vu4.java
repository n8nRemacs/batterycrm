package defpackage;

import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vu4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ DevMenuFeatureTogglesPageScreen c;

    public /* synthetic */ vu4(List list, DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen) {
        this.b = list;
        this.c = devMenuFeatureTogglesPageScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = this.c;
                devMenuFeatureTogglesPageScreen.z0().post(new vu4(this.b, devMenuFeatureTogglesPageScreen));
                break;
            default:
                int size = this.b.size();
                DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen2 = this.c;
                if (size == 1) {
                    devMenuFeatureTogglesPageScreen2.z0().Y();
                }
                devMenuFeatureTogglesPageScreen2.z0().x0(0);
                break;
        }
    }

    public /* synthetic */ vu4(DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen, List list) {
        this.c = devMenuFeatureTogglesPageScreen;
        this.b = list;
    }
}

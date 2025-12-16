package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes2.dex */
public final class ldf implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ sid b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ldf(sid sidVar, Object obj, int i) {
        this.a = i;
        this.b = sidVar;
        this.c = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.a;
        Object obj = this.c;
        sid sidVar = this.b;
        switch (i) {
            case 0:
                int i2 = configuration.orientation;
                if (i2 != sidVar.a && i2 != 0) {
                    sidVar.a = i2;
                    WeakHashMap weakHashMap = hfh.a;
                    teh.c((View) obj);
                    break;
                }
                break;
            case 1:
                v6h v6hVar = (v6h) obj;
                int i3 = configuration.orientation;
                if (i3 != sidVar.a && i3 != 0) {
                    sidVar.a = i3;
                    ViewParent parent = v6hVar.getParent();
                    uh9 uh9Var = parent instanceof uh9 ? (uh9) parent : null;
                    if (uh9Var != null) {
                        uh9Var.addOnLayoutChangeListener(new p6h(v6hVar, 1));
                        break;
                    }
                }
                break;
            default:
                int i4 = configuration.orientation;
                if (i4 != sidVar.a && i4 != 0) {
                    sidVar.a = i4;
                    VideoWebViewScreen.H0((VideoWebViewScreen) obj, i4);
                    break;
                }
                break;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        int i = this.a;
    }
}

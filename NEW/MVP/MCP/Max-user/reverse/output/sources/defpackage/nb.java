package defpackage;

import android.view.View;
import kotlinx.coroutines.internal.ContextScope;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class nb implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nb(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return svi.a((ContextScope) this.b, (x74) this.c, i84.a, new mb(obj, null, (qb) this.d));
            case 1:
                return svi.a((ContextScope) this.b, (x74) this.c, i84.a, new re9(obj, null, (myb) this.d));
            case 2:
                return svi.a((ContextScope) this.b, (x74) this.c, i84.b, new te9(obj, null, (s5i) this.d));
            default:
                ((rah) this.b).dispose();
                String str = ((VideoMessageWidget) this.c).X;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.o;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "last updating blur for video message screen after stable position", null);
                    }
                }
                ((View) this.d).getBackground().invalidateSelf();
                return qqg.a;
        }
    }
}

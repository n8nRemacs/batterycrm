package defpackage;

import android.os.Bundle;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public final /* synthetic */ class ji6 implements jyd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jyd
    public final Bundle a() {
        switch (this.a) {
            case 0:
                return ((c) this.b).Y();
            default:
                return eyd.a((eyd) this.b);
        }
    }
}

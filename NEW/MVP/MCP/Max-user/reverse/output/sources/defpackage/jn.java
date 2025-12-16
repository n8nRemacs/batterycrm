package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class jn implements jyd {
    public final /* synthetic */ int a;
    public final Object b;

    public jn(pn pnVar) {
        this.a = 1;
        this.b = new LinkedHashSet();
        pnVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.jyd
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((ln) this.b).C().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public jn(ln lnVar) {
        this.a = 0;
        this.b = lnVar;
    }
}

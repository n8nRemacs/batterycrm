package androidx.view;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import j.K;
import j.N;
import j.P;

/* compiled from: ViewModelProviders.java */
@Deprecated
/* loaded from: classes.dex */
public class R0 {

    /* compiled from: ViewModelProviders.java */
    @Deprecated
    public static class a extends P0.a {
    }

    @Deprecated
    public R0() {
    }

    @N
    @K
    @Deprecated
    public static P0 a(@N Fragment fragment, @P P0.c cVar) {
        if (cVar == null) {
            cVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new P0(fragment.getF42820b(), cVar);
    }

    @N
    @K
    @Deprecated
    public static P0 b(@N ActivityC22955m activityC22955m, @P P0.c cVar) {
        if (cVar == null) {
            cVar = activityC22955m.getDefaultViewModelProviderFactory();
        }
        return new P0(activityC22955m.getF42820b(), cVar);
    }
}

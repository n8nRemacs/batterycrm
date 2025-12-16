package androidx.datastore.preferences;

import Y41.l;
import cb1.C27169h;
import kotlin.Metadata;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.t1;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static e a(String str, W0.b bVar, C27169h.d dVar, int i12) {
        l lVar = dVar;
        if ((i12 & 4) != 0) {
            lVar = a.f45555l;
        }
        return new e(str, bVar, lVar, U.a(C43262l0.f411947c.plus(t1.b())));
    }
}

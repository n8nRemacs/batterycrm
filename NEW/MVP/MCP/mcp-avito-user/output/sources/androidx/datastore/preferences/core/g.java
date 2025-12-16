package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.f;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PreferencesFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
@X41.i
/* loaded from: classes.dex */
public final class g {
    @X41.i
    @Y61.k
    public static final a a(@Y61.k f.b<?>... bVarArr) {
        a aVar = new a(null, false, 1, null);
        f.b[] bVarArr2 = (f.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        aVar.c();
        for (f.b bVar : bVarArr2) {
            bVar.getClass();
            aVar.d(null, null);
        }
        return aVar;
    }
}

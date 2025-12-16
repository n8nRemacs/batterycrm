package com.avito.beduin.v2.theme;

import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;

/* compiled from: ThemeColorDeclaration.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s {
    @Y61.k
    public static final r a(@Y61.k G g12) {
        String string = g12.getString(FontStyleKt.LIGHT);
        if (string == null) {
            string = t.f338374a.f338366a;
        }
        String string2 = g12.getString("dark");
        if (string2 == null) {
            string2 = string;
        }
        return new r(string, string2, g12.getString("token"));
    }

    @Y61.k
    public static final f<r.b> b(@Y61.k G g12, @Y61.k String str) {
        return h.b(g12, str, x.f338378a);
    }
}

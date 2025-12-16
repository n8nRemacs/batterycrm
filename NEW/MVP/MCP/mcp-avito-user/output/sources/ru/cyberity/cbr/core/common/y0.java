package ru.cyberity.cbr.core.common;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43059p;

/* compiled from: TINValidator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000eR\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/common/y0;", "", "<init>", "()V", "", "", "Lru/cyberity/cbr/core/data/model/remote/n;", "tinInfo", "Lkotlin/G0;", "a", "(Ljava/util/Map;)V", "tin", "country", "", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/text/p;", "Ljava/util/Map;", "formats", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private Map<String, C43059p> formats = P0.c();

    public final boolean a(@Y61.k String tin, @Y61.l String country) {
        C43059p c43059p = this.formats.get(country != null ? country.toUpperCase(Locale.ROOT) : Boolean.TRUE);
        if (c43059p != null) {
            return c43059p.e(tin);
        }
        return true;
    }

    public final void a(@Y61.k Map<String, ru.cyberity.cbr.core.data.model.remote.n> tinInfo) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ru.cyberity.cbr.core.data.model.remote.n> entry : tinInfo.entrySet()) {
            String strD = entry.getValue().d();
            Q q12 = strD != null ? new Q(entry.getKey().toUpperCase(Locale.ROOT), new C43059p(strD)) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        this.formats = P0.p(arrayList);
    }
}

package com.avito.beduin.v2.avito.component.circularCounter.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/h;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/g;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.beduin.v2.theme.d<g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h f334102a = new h();

    @Y61.l
    public static g b(@Y61.k G g12) {
        String string = g12.getString("type");
        if (!L.f(string, "Text")) {
            if (!L.f(string, "Image")) {
                return null;
            }
            j.f334106a.getClass();
            return j.b(g12);
        }
        l.f334109a.getClass();
        String string2 = g12.getString("value");
        if (string2 == null) {
            return null;
        }
        return new k(string2);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ g a(G g12) {
        return b(g12);
    }
}

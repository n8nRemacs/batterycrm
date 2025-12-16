package O61;

import Q61.v;
import java.util.HashMap;

/* compiled from: NodeRendererMap.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12009a = new HashMap(32);

    public final void a(v vVar) {
        T61.a aVar = (T61.a) this.f12009a.get(vVar.getClass());
        if (aVar != null) {
            aVar.k(vVar);
        }
    }
}

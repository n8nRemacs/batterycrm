package NZ0;

import j.N;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11601a = new HashMap();

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final wZ0.b f11602a;

        @RX0.a
        public a(@N wZ0.b bVar) {
            this.f11602a = bVar;
        }
    }

    @RX0.a
    public e(@N Set<a> set) {
        for (a aVar : set) {
            HashMap map = this.f11601a;
            aVar.getClass();
            map.put(NZ0.a.class, aVar.f11602a);
        }
    }
}

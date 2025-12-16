package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes8.dex */
public interface m {

    /* compiled from: ResolutionScope.kt */
    @s0
    public static final class a {
        public static Collection a(m mVar, d dVar, int i12) {
            if ((i12 & 1) != 0) {
                dVar = d.f409663l;
            }
            j.f409683a.getClass();
            return mVar.e(dVar, j.a.f409685b);
        }
    }

    @Y61.k
    Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @Y61.l
    InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b);
}

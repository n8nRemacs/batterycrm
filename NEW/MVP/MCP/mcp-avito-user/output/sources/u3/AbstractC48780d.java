package u3;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import u3.j;

/* compiled from: AbTestWithClientExposureConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu3/d;", "Lu3/j;", "GROUP", "Lu3/b;", "Lu3/m;", "Lu3/a;", "<init>", "()V", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC48780d<GROUP extends j> implements InterfaceC48778b<m<GROUP>, C48777a> {
    @Y61.l
    public abstract GROUP c();

    @Y61.l
    public final GROUP d(@Y61.k String str) {
        for (j jVar : e()) {
            GROUP group = (GROUP) jVar;
            if (L.f(group.getF106999b(), str)) {
                return group;
            }
        }
        return null;
    }

    @Y61.k
    public abstract GROUP[] e();

    @Y61.k
    public abstract GROUP f();

    public abstract boolean g();
}

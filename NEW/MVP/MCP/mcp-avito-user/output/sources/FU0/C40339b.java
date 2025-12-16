package fU0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.component.G;
import fU0.AbstractC40338a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Marker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfU0/b;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fU0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40339b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C40339b f395886a = new C40339b();

    @l
    public static AbstractC40338a a(@k G g12) {
        String string;
        Set<String> setB = g12.b();
        if (setB.contains("tag")) {
            String string2 = g12.getString("tag");
            if (string2 != null) {
                return new AbstractC40338a.b(string2);
            }
            return null;
        }
        if (!setB.contains("perf_tag") || (string = g12.getString("perf_tag")) == null) {
            return null;
        }
        return new AbstractC40338a.C11153a(string);
    }
}

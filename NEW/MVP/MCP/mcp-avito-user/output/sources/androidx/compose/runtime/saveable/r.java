package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/r;", "", "a", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface r {

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/r$a;", "", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();
    }

    boolean a(@Y61.k Object obj);

    @Y61.k
    Map<String, List<Object>> c();

    @Y61.k
    a d(@Y61.k String str, @Y61.k Y41.a<? extends Object> aVar);

    @Y61.l
    Object f(@Y61.k String str);
}

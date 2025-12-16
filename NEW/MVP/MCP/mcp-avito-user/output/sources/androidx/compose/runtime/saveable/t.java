package androidx.compose.runtime.saveable;

import androidx.compose.runtime.J3;
import androidx.compose.runtime.S;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SaveableStateRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J3 f38604a = S.d(a.f38605l);

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/r;", "invoke", "()Landroidx/compose/runtime/saveable/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f38605l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ r invoke() {
            return null;
        }
    }

    @Y61.k
    public static final r a(@Y61.l Map<String, ? extends List<? extends Object>> map, @Y61.k Y41.l<Object, Boolean> lVar) {
        return new s(map, lVar);
    }
}

package androidx.compose.runtime.saveable;

import androidx.collection.R0;
import androidx.collection.i1;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.saveable.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: SaveableStateRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/s;", "Landroidx/compose/runtime/saveable/r;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N f38598a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final R0<String, List<Object>> f38599b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public R0<String, List<Y41.a<Object>>> f38600c;

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/saveable/s$a", "Landroidx/compose/runtime/saveable/r$a;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ R0<String, List<Y41.a<Object>>> f38601a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38602b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N f38603c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(R0<String, List<Y41.a<Object>>> r02, String str, Y41.a<? extends Object> aVar) {
            this.f38601a = r02;
            this.f38602b = str;
            this.f38603c = (N) aVar;
        }

        @Override // androidx.compose.runtime.saveable.r.a
        public final void a() {
            R0<String, List<Y41.a<Object>>> r02 = this.f38601a;
            String str = this.f38602b;
            List<Y41.a<Object>> listK = r02.k(str);
            if (listK != null) {
                listK.remove(this.f38603c);
            }
            List<Y41.a<Object>> list = listK;
            if (list == null || list.isEmpty()) {
                return;
            }
            r02.m(str, listK);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.l Map<String, ? extends List<? extends Object>> map, @Y61.k Y41.l<Object, Boolean> lVar) {
        R0<String, List<Object>> r02;
        this.f38598a = (N) lVar;
        if (map == null || map.isEmpty()) {
            r02 = null;
        } else {
            J3 j32 = t.f38604a;
            r02 = new R0<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                r02.m(entry.getKey(), entry.getValue());
            }
        }
        this.f38599b = r02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.runtime.saveable.r
    public final boolean a(@Y61.k Object obj) {
        return ((Boolean) this.f38598a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> c() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.s.c():java.util.Map");
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.k
    public final r.a d(@Y61.k String str, @Y61.k Y41.a<? extends Object> aVar) {
        J3 j32 = t.f38604a;
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (!C43044a.d(str.charAt(i12))) {
                R0<String, List<Y41.a<Object>>> r0B = this.f38600c;
                if (r0B == null) {
                    r0B = i1.b();
                    this.f38600c = r0B;
                }
                List<Y41.a<Object>> listE = r0B.e(str);
                if (listE == null) {
                    listE = new ArrayList<>();
                    r0B.m(str, listE);
                }
                listE.add(aVar);
                return new a(r0B, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // androidx.compose.runtime.saveable.r
    @Y61.l
    public final Object f(@Y61.k String str) {
        R0<String, List<Object>> r02 = this.f38599b;
        List<Object> listK = r02 != null ? r02.k(str) : null;
        List<Object> list = listK;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listK.size() > 1 && r02 != null) {
            List<Object> listSubList = listK.subList(1, listK.size());
            int i12 = r02.i(str);
            if (i12 < 0) {
                i12 = ~i12;
            }
            Object[] objArr = r02.f25723c;
            Object obj = objArr[i12];
            r02.f25722b[i12] = str;
            objArr[i12] = listSubList;
        }
        return listK.get(0);
    }
}

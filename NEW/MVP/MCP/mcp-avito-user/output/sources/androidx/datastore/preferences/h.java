package androidx.datastore.preferences;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.datastore.preferences.core.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final LinkedHashSet f45581a = new LinkedHashSet();

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/datastore/migrations/d;", "sharedPrefs", "Landroidx/datastore/preferences/core/f;", "currentData", "<anonymous>", "(Landroidx/datastore/migrations/d;Landroidx/datastore/preferences/core/f;)Landroidx/datastore/preferences/core/f;"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements q<androidx.datastore.migrations.d, androidx.datastore.preferences.core.f, Continuation<? super androidx.datastore.preferences.core.f>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ androidx.datastore.migrations.d f45582q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ androidx.datastore.preferences.core.f f45583r;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(androidx.datastore.migrations.d dVar, androidx.datastore.preferences.core.f fVar, Continuation<? super androidx.datastore.preferences.core.f> continuation) {
            a aVar = new a(3, continuation);
            aVar.f45582q = dVar;
            aVar.f45583r = fVar;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            androidx.datastore.migrations.d dVar = this.f45582q;
            androidx.datastore.preferences.core.f fVar = this.f45583r;
            Set<f.a<?>> setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(C42745f0.q(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).f45565a);
            }
            Map<String, ?> all = dVar.f45542a.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, ?> next = it2.next();
                String key = next.getKey();
                LinkedHashSet linkedHashSet = dVar.f45543b;
                if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key2 = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Set) {
                    value = C42745f0.P0((Iterable) value);
                }
                linkedHashMap2.put(key2, value);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (Boxing.boxBoolean(!arrayList.contains((String) entry2.getKey())).booleanValue()) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            androidx.datastore.preferences.core.a aVar = new androidx.datastore.preferences.core.a(new LinkedHashMap(fVar.a()), false);
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                String str = (String) entry3.getKey();
                Object value2 = entry3.getValue();
                if (value2 instanceof Boolean) {
                    aVar.d(new f.a<>(str), value2);
                } else if (value2 instanceof Float) {
                    aVar.d(new f.a<>(str), value2);
                } else if (value2 instanceof Integer) {
                    aVar.d(new f.a<>(str), value2);
                } else if (value2 instanceof Long) {
                    aVar.d(new f.a<>(str), value2);
                } else if (value2 instanceof String) {
                    aVar.d(new f.a<>(str), value2);
                } else if (value2 instanceof Set) {
                    f.a<?> aVar2 = new f.a<>(str);
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    aVar.d(aVar2, (Set) value2);
                } else {
                    continue;
                }
            }
            return new androidx.datastore.preferences.core.a(new LinkedHashMap(Collections.unmodifiableMap(aVar.f45556a)), true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/preferences/core/f;", "prefs", "", "<anonymous>", "(Landroidx/datastore/preferences/core/f;)Z"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<androidx.datastore.preferences.core.f, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f45584q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Set<String> f45585r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f45585r = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f45585r, continuation);
            bVar.f45584q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(androidx.datastore.preferences.core.f fVar, Continuation<? super Boolean> continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Set<f.a<?>> setKeySet = ((androidx.datastore.preferences.core.f) this.f45584q).a().keySet();
            ArrayList arrayList = new ArrayList(C42745f0.q(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).f45565a);
            }
            LinkedHashSet linkedHashSet = h.f45581a;
            boolean z12 = true;
            Set<String> set = this.f45585r;
            if (set != linkedHashSet) {
                Set<String> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z12 = false;
                } else {
                    Iterator<T> it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (Boxing.boxBoolean(!arrayList.contains((String) it2.next())).booleanValue()) {
                            break;
                        }
                    }
                    z12 = false;
                }
            }
            return Boxing.boxBoolean(z12);
        }
    }

    public static final q<androidx.datastore.migrations.d, androidx.datastore.preferences.core.f, Continuation<? super androidx.datastore.preferences.core.f>, Object> a() {
        return new a(3, null);
    }

    public static final p<androidx.datastore.preferences.core.f, Continuation<? super Boolean>, Object> b(Set<String> set) {
        return new b(set, null);
    }
}

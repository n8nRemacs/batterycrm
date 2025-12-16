package com.avito.android.remote.parse.adapter.inline_filters;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterTypeAdapterFactory;", "Lcom/google/gson/r;", "a", "b", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InlineFilterTypeAdapterFactory implements r {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f254266c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f254267b;

    /* compiled from: InlineFilterTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterTypeAdapterFactory$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFilterTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/parse/adapter/inline_filters/InlineFilterTypeAdapterFactory$b;", "", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f254268b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f254269c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f254270d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f254271e;

        static {
            b bVar = new b("INT", 0);
            f254268b = bVar;
            b bVar2 = new b("BOOLEAN", 1);
            f254269c = bVar2;
            b[] bVarArr = {bVar, bVar2};
            f254270d = bVarArr;
            f254271e = c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f254270d.clone();
        }
    }

    public InlineFilterTypeAdapterFactory(@k Map<String, ? extends Class<?>> map) {
        this.f254267b = map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k final Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (!L.f(aVar.getRawType(), Filter.class)) {
            return null;
        }
        ?? r12 = this.f254267b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(r12.size()));
        for (Map.Entry entry : r12.entrySet()) {
            linkedHashMap.put(entry.getKey(), gson.h(this, com.google.gson.reflect.a.get((Class) entry.getValue())));
        }
        final TypeAdapter<T> typeAdapterH = gson.h(this, com.google.gson.reflect.a.get(Filter.class));
        return (TypeAdapter<T>) new TypeAdapter<Filter>() { // from class: com.avito.android.remote.parse.adapter.inline_filters.InlineFilterTypeAdapterFactory$create$1

            /* compiled from: InlineFilterTypeAdapterFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class a {
                static {
                    int[] iArr = new int[InlineFilterTypeAdapterFactory.b.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        InlineFilterTypeAdapterFactory.b bVar = InlineFilterTypeAdapterFactory.b.f254268b;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0070. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[PHI: r14
  0x0124: PHI (r14v15 com.google.gson.i) = 
  (r14v1 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v4 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v5 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v6 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v10 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v11 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v12 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v13 com.google.gson.i)
  (r14v1 com.google.gson.i)
  (r14v1 com.google.gson.i)
 binds: [B:3:0x0054, B:10:0x006a, B:55:0x0115, B:54:0x0114, B:51:0x0105, B:50:0x0104, B:47:0x00ea, B:46:0x00e9, B:40:0x00d7, B:32:0x00c3, B:29:0x00b3, B:28:0x00b1, B:25:0x00a1, B:24:0x009f, B:21:0x008f, B:20:0x008d, B:17:0x007d, B:16:0x007b, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Enum] */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v24 */
            /* JADX WARN: Type inference failed for: r2v25 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v8 */
            @Override // com.google.gson.TypeAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.avito.android.remote.model.search.Filter read(com.google.gson.stream.a r36) {
                /*
                    Method dump skipped, instructions count: 688
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.inline_filters.InlineFilterTypeAdapterFactory$create$1.read(com.google.gson.stream.a):java.lang.Object");
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, Filter filter) {
                throw new UnsupportedOperationException();
            }
        }.nullSafe();
    }
}

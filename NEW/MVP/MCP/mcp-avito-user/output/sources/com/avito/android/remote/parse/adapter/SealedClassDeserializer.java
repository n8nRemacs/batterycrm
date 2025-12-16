package com.avito.android.remote.parse.adapter;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;

/* compiled from: SealedClassDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SealedClassDeserializer;", "", "T", "Lcom/google/gson/h;", "a", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SealedClassDeserializer<T> implements com.google.gson.h<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f254229d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, T> f254230a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, kotlin.reflect.d<? extends T>> f254231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final T f254232c;

    /* compiled from: SealedClassDeserializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SealedClassDeserializer$a;", "", "T", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f254233a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f254234b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public T f254235c;

        @kotlin.X
        public final void a(@Y61.k String str) {
            if (this.f254233a.containsKey(str) || this.f254234b.containsKey(str)) {
                throw new IllegalStateException(AK.c.k("Name \"", str, "\" is registered already!").toString());
            }
        }

        @Y61.k
        public final SealedClassDeserializer<T> b() {
            return new SealedClassDeserializer<>(this.f254233a, this.f254234b, this.f254235c, null);
        }
    }

    /* compiled from: SealedClassDeserializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SealedClassDeserializer$b;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public SealedClassDeserializer() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SealedClassDeserializer(Map map, Map map2, Object obj, C42822w c42822w) {
        this.f254230a = map;
        this.f254231b = map2;
        this.f254232c = obj;
    }

    @Override // com.google.gson.h
    @Y61.k
    public final T deserialize(@Y61.k com.google.gson.i iVar, @Y61.k Type type, @Y61.k com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.internal.x<String, com.google.gson.i> xVar = kVarI.f362194b;
        Set<String> setKeySet = xVar.keySet();
        Iterator<T> it = setKeySet.iterator();
        String str = null;
        boolean z12 = false;
        String str2 = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                String str3 = (String) next;
                if (xVar.containsKey(str3)) {
                    com.google.gson.i iVarD = kVarI.D(str3);
                    iVarD.getClass();
                    if (iVarD instanceof com.google.gson.j) {
                        continue;
                    } else {
                        if (z12) {
                            break;
                        }
                        z12 = true;
                        str2 = next;
                    }
                }
            } else if (z12) {
                str = str2;
            }
        }
        String str4 = str;
        if (str4 == null) {
            throw new JsonParseException("Object must contain exactly one not-null field: " + setKeySet);
        }
        T t12 = this.f254230a.get(str4);
        if (t12 != null) {
            return t12;
        }
        kotlin.reflect.d<? extends T> dVar = this.f254231b.get(str4);
        if (dVar != null) {
            return (T) gVar.b(kVarI.I(str4), ((InterfaceC42819t) dVar).f());
        }
        T t13 = this.f254232c;
        if (t13 != null) {
            return t13;
        }
        throw new JsonParseException(AK.c.k("Matching subclass for name \"", str4, "\" was not found!"));
    }
}

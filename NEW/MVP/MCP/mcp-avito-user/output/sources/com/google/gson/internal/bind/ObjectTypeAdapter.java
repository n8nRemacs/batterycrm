package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.x;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final r f362046c = new AnonymousClass1(ToNumberPolicy.f361980b);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f362047a;

    /* renamed from: b, reason: collision with root package name */
    public final q f362048b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ToNumberPolicy f362049b;

        public AnonymousClass1(ToNumberPolicy toNumberPolicy) {
            this.f362049b = toNumberPolicy;
        }

        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.f362049b, null);
            }
            return null;
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362050a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f362050a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362050a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362050a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362050a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362050a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362050a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, q qVar, AnonymousClass1 anonymousClass1) {
        this.f362047a = gson;
        this.f362048b = qVar;
    }

    public static r a(ToNumberPolicy toNumberPolicy) {
        return toNumberPolicy == ToNumberPolicy.f361980b ? f362046c : new AnonymousClass1(toNumberPolicy);
    }

    public final Serializable b(com.google.gson.stream.a aVar, JsonToken jsonToken) {
        int iOrdinal = jsonToken.ordinal();
        if (iOrdinal == 5) {
            return aVar.B();
        }
        if (iOrdinal == 6) {
            return this.f362048b.a(aVar);
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(aVar.o());
        }
        if (iOrdinal == 8) {
            aVar.z();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(com.google.gson.stream.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        JsonToken jsonTokenF = aVar.F();
        int iOrdinal = jsonTokenF.ordinal();
        if (iOrdinal == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iOrdinal != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new x();
        }
        if (arrayList == null) {
            return b(aVar, jsonTokenF);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String strX = arrayList instanceof Map ? aVar.x() : null;
                JsonToken jsonTokenF2 = aVar.F();
                int iOrdinal2 = jsonTokenF2.ordinal();
                if (iOrdinal2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iOrdinal2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new x();
                }
                boolean z12 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = b(aVar, jsonTokenF2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strX, arrayList2);
                }
                if (z12) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.f();
                } else {
                    aVar.g();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.j();
            return;
        }
        TypeAdapter typeAdapterG = this.f362047a.g(obj.getClass());
        if (!(typeAdapterG instanceof ObjectTypeAdapter)) {
            typeAdapterG.write(cVar, obj);
        } else {
            cVar.c();
            cVar.g();
        }
    }
}

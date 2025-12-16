package com.google.gson.internal.bind;

import com.avito.android.gson.ListTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.C;
import com.google.gson.internal.C37623a;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes6.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final o<T> f362060a;

    /* renamed from: b, reason: collision with root package name */
    public final h<T> f362061b;

    /* renamed from: c, reason: collision with root package name */
    public final Gson f362062c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.reflect.a<T> f362063d;

    /* renamed from: e, reason: collision with root package name */
    public final r f362064e;

    /* renamed from: f, reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f362065f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public volatile TypeAdapter<T> f362066g;

    public static final class SingleTypeFactory implements r {

        /* renamed from: b, reason: collision with root package name */
        public final com.google.gson.reflect.a<?> f362067b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f362068c;

        /* renamed from: d, reason: collision with root package name */
        public final Class<?> f362069d;

        /* renamed from: e, reason: collision with root package name */
        public final o<?> f362070e;

        /* renamed from: f, reason: collision with root package name */
        public final h<?> f362071f;

        public SingleTypeFactory(Object obj, com.google.gson.reflect.a<?> aVar, boolean z12, Class<?> cls) {
            o<?> oVar = obj instanceof o ? (o) obj : null;
            this.f362070e = oVar;
            h<?> hVar = obj instanceof h ? (h) obj : null;
            this.f362071f = hVar;
            C37623a.a((oVar == null && hVar == null) ? false : true);
            this.f362067b = aVar;
            this.f362068c = z12;
            this.f362069d = cls;
        }

        @Override // com.google.gson.r
        public final <T> TypeAdapter<T> a(Gson gson, com.google.gson.reflect.a<T> aVar) {
            com.google.gson.reflect.a<?> aVar2 = this.f362067b;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f362068c && aVar2.getType() == aVar.getRawType()) : this.f362069d.isAssignableFrom(aVar.getRawType())) {
                return new TreeTypeAdapter(this.f362070e, this.f362071f, gson, aVar, this);
            }
            return null;
        }
    }

    public final class b implements n, g {
        public b(a aVar) {
        }

        @Override // com.google.gson.n
        public final i a(Object obj, Type type) {
            Gson gson = TreeTypeAdapter.this.f362062c;
            gson.getClass();
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            gson.n(obj, type, bVar);
            return bVar.y();
        }

        @Override // com.google.gson.g
        public final <R> R b(i iVar, Type type) {
            Gson gson = TreeTypeAdapter.this.f362062c;
            gson.getClass();
            if (iVar == null) {
                return null;
            }
            return (R) gson.c(new com.google.gson.internal.bind.a(iVar), type);
        }

        @Override // com.google.gson.n
        public final i c(Object obj) {
            Gson gson = TreeTypeAdapter.this.f362062c;
            gson.getClass();
            if (obj == null) {
                return j.f362193b;
            }
            Class<?> cls = obj.getClass();
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            gson.n(obj, cls, bVar);
            return bVar.y();
        }
    }

    public TreeTypeAdapter(o<T> oVar, h<T> hVar, Gson gson, com.google.gson.reflect.a<T> aVar, r rVar) {
        this.f362060a = oVar;
        this.f362061b = hVar;
        this.f362062c = gson;
        this.f362063d = aVar;
        this.f362064e = rVar;
    }

    public static r a(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    public static r b(ListTypeAdapter listTypeAdapter) {
        return new SingleTypeFactory(listTypeAdapter, null, false, List.class);
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(com.google.gson.stream.a aVar) {
        h<T> hVar = this.f362061b;
        if (hVar == null) {
            TypeAdapter<T> typeAdapterH = this.f362066g;
            if (typeAdapterH == null) {
                typeAdapterH = this.f362062c.h(this.f362064e, this.f362063d);
                this.f362066g = typeAdapterH;
            }
            return typeAdapterH.read(aVar);
        }
        i iVarA = C.a(aVar);
        iVarA.getClass();
        if (iVarA instanceof j) {
            return null;
        }
        return hVar.deserialize(iVarA, this.f362063d.getType(), this.f362065f);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.c cVar, T t12) throws IOException {
        o<T> oVar = this.f362060a;
        if (oVar == null) {
            TypeAdapter<T> typeAdapterH = this.f362066g;
            if (typeAdapterH == null) {
                typeAdapterH = this.f362062c.h(this.f362064e, this.f362063d);
                this.f362066g = typeAdapterH;
            }
            typeAdapterH.write(cVar, t12);
            return;
        }
        if (t12 == null) {
            cVar.j();
            return;
        }
        this.f362063d.getType();
        TypeAdapters.f362103z.write(cVar, oVar.a(t12, this.f362065f));
    }
}

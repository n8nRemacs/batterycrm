package io.noties.markwon;

import io.noties.markwon.l;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MarkwonSpansFactoryImpl.java */
/* loaded from: classes8.dex */
class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends Q61.v>, B> f401921a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    public static class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f401922a = new HashMap(3);

        @Override // io.noties.markwon.l.a
        @N
        public final <N extends Q61.v> l.a a(@N Class<N> cls, @P B b12) {
            this.f401922a.put(cls, b12);
            return this;
        }
    }

    /* compiled from: MarkwonSpansFactoryImpl.java */
    public static class b implements B {
        @Override // io.noties.markwon.B
        @P
        public final Object a(@N g gVar, @N y yVar) {
            throw null;
        }
    }

    public m(@N Map<Class<? extends Q61.v>, B> map) {
        this.f401921a = map;
    }

    @Override // io.noties.markwon.l
    @P
    public final <N extends Q61.v> B a(@N Class<N> cls) {
        return this.f401921a.get(cls);
    }
}

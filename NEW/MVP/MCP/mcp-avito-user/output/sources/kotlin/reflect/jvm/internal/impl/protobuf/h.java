package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.camera.camera2.internal.G;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes8.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409358a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f409358a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f409358a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC11678a<BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.d f409359b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
        /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType e() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType j(MessageType messagetype);
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType> {

        /* renamed from: c, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.g<f> f409360c = kotlin.reflect.jvm.internal.impl.protobuf.g.f409352d;

        /* renamed from: d, reason: collision with root package name */
        public boolean f409361d;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void l(MessageType messagetype) {
            t tVar;
            if (!this.f409361d) {
                this.f409360c = this.f409360c.clone();
                this.f409361d = true;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar = this.f409360c;
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar2 = messagetype.f409362b;
            gVar.getClass();
            int i12 = 0;
            while (true) {
                int size = gVar2.f409353a.f409406c.size();
                tVar = gVar2.f409353a;
                if (i12 >= size) {
                    break;
                }
                gVar.g(tVar.f409406c.get(i12));
                i12++;
            }
            Iterator<Map.Entry<Object, Object>> it = tVar.c().iterator();
            while (it.hasNext()) {
                gVar.g((Map.Entry) it.next());
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public interface e<MessageType extends d> extends p {
    }

    /* compiled from: GeneratedMessageLite.java */
    public static final class f implements g.b<f> {

        /* renamed from: b, reason: collision with root package name */
        public final int f409366b;

        /* renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f409367c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f409368d;

        public f(int i12, WireFormat.FieldType fieldType, boolean z12) {
            this.f409366b = i12;
            this.f409367c = fieldType;
            this.f409368d = z12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final b G2(o.a aVar, o oVar) {
            return ((b) aVar).j((h) oVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f409366b - ((f) obj).f409366b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f409367c.f409315b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final WireFormat.FieldType getLiteType() {
            return this.f409367c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final int getNumber() {
            return this.f409366b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final boolean isPacked() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public final boolean isRepeated() {
            return this.f409368d;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static class g<ContainingType extends o, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final d f409369a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f409370b;

        /* renamed from: c, reason: collision with root package name */
        public final h f409371c;

        /* renamed from: d, reason: collision with root package name */
        public final f f409372d;

        /* renamed from: e, reason: collision with root package name */
        public final Method f409373e;

        /* JADX WARN: Multi-variable type inference failed */
        public g(d dVar, Object obj, h hVar, f fVar, Class cls) {
            if (dVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.f409367c == WireFormat.FieldType.f409306n && hVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f409369a = dVar;
            this.f409370b = obj;
            this.f409371c = hVar;
            this.f409372d = fVar;
            if (!i.a.class.isAssignableFrom(cls)) {
                this.f409373e = null;
                return;
            }
            try {
                this.f409373e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e12) {
                String name = cls.getName();
                throw new RuntimeException(G.g(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e12);
            }
        }

        public final Object a(Object obj) {
            if (this.f409372d.f409367c.f409315b != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f409373e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e12);
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        public final Object b(Object obj) {
            return this.f409372d.f409367c.f409315b == WireFormat.JavaType.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    public static g b(d dVar, h hVar, int i12, WireFormat.FieldType fieldType, Class cls) {
        return new g(dVar, Collections.emptyList(), hVar, new f(i12, fieldType, true), cls);
    }

    public static g c(d dVar, Serializable serializable, h hVar, int i12, WireFormat.FieldType fieldType, Class cls) {
        return new g(dVar, serializable, hVar, new f(i12, fieldType, false), cls);
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements e<MessageType> {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.g<f> f409362b;

        /* compiled from: GeneratedMessageLite.java */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<f, Object>> f409363a;

            /* renamed from: b, reason: collision with root package name */
            public Map.Entry<f, Object> f409364b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f409365c;

            public a(d dVar, boolean z12, a aVar) {
                Iterator it;
                kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar = dVar.f409362b;
                boolean z13 = gVar.f409355c;
                t tVar = gVar.f409353a;
                if (z13) {
                    Iterator it2 = tVar.entrySet().iterator();
                    j.c cVar = new j.c();
                    cVar.f409376b = it2;
                    it = cVar;
                } else {
                    it = tVar.entrySet().iterator();
                }
                this.f409363a = it;
                if (it.hasNext()) {
                    this.f409364b = (Map.Entry) it.next();
                }
                this.f409365c = z12;
            }

            public final void a(int i12, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<f, Object> entry = this.f409364b;
                    if (entry == null || entry.getKey().f409366b >= i12) {
                        return;
                    }
                    f key = this.f409364b.getKey();
                    if (this.f409365c && key.f409367c.f409315b == WireFormat.JavaType.MESSAGE && !key.f409368d) {
                        o oVar = (o) this.f409364b.getValue();
                        codedOutputStream.x(1, 3);
                        codedOutputStream.x(2, 0);
                        codedOutputStream.v(key.f409366b);
                        codedOutputStream.o(3, oVar);
                        codedOutputStream.x(1, 4);
                    } else {
                        Object value = this.f409364b.getValue();
                        kotlin.reflect.jvm.internal.impl.protobuf.g gVar = kotlin.reflect.jvm.internal.impl.protobuf.g.f409352d;
                        WireFormat.FieldType fieldType = key.f409367c;
                        int i13 = key.f409366b;
                        if (key.f409368d) {
                            Iterator it = ((List) value).iterator();
                            while (it.hasNext()) {
                                kotlin.reflect.jvm.internal.impl.protobuf.g.k(codedOutputStream, fieldType, i13, it.next());
                            }
                        } else if (value instanceof j) {
                            kotlin.reflect.jvm.internal.impl.protobuf.g.k(codedOutputStream, fieldType, i13, ((j) value).a());
                        } else {
                            kotlin.reflect.jvm.internal.impl.protobuf.g.k(codedOutputStream, fieldType, i13, value);
                        }
                    }
                    Iterator<Map.Entry<f, Object>> it2 = this.f409363a;
                    if (it2.hasNext()) {
                        this.f409364b = it2.next();
                    } else {
                        this.f409364b = null;
                    }
                }
            }
        }

        public d() {
            this.f409362b = new kotlin.reflect.jvm.internal.impl.protobuf.g<>();
        }

        public final boolean e() {
            int i12 = 0;
            while (true) {
                t tVar = this.f409362b.f409353a;
                if (i12 >= tVar.f409406c.size()) {
                    Iterator<Map.Entry<Object, Object>> it = tVar.c().iterator();
                    while (it.hasNext()) {
                        if (!kotlin.reflect.jvm.internal.impl.protobuf.g.f(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!kotlin.reflect.jvm.internal.impl.protobuf.g.f(tVar.f409406c.get(i12))) {
                    return false;
                }
                i12++;
            }
        }

        public final int f() {
            t tVar;
            int i12 = 0;
            int iD2 = 0;
            while (true) {
                tVar = this.f409362b.f409353a;
                if (i12 >= tVar.f409406c.size()) {
                    break;
                }
                u<K, V>.b bVar = tVar.f409406c.get(i12);
                iD2 += kotlin.reflect.jvm.internal.impl.protobuf.g.d((g.b) bVar.getKey(), bVar.getValue());
                i12++;
            }
            for (Map.Entry<Object, Object> entry : tVar.c()) {
                iD2 += kotlin.reflect.jvm.internal.impl.protobuf.g.d((g.b) entry.getKey(), entry.getValue());
            }
            return iD2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type g(g<MessageType, Type> gVar) {
            o(gVar);
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar2 = this.f409362b;
            f fVar = gVar.f409372d;
            Type type = (Type) gVar2.e(fVar);
            if (type == null) {
                return gVar.f409370b;
            }
            if (!fVar.f409368d) {
                return (Type) gVar.a(type);
            }
            if (fVar.f409367c.f409315b != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r12.add(gVar.a(it.next()));
            }
            return r12;
        }

        public final <Type> Type h(g<MessageType, List<Type>> gVar, int i12) {
            o(gVar);
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar2 = this.f409362b;
            gVar2.getClass();
            f fVar = gVar.f409372d;
            if (!fVar.f409368d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = gVar2.e(fVar);
            if (objE != null) {
                return (Type) gVar.a(((List) objE).get(i12));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <Type> int i(g<MessageType, List<Type>> gVar) {
            o(gVar);
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar2 = this.f409362b;
            gVar2.getClass();
            f fVar = gVar.f409372d;
            if (!fVar.f409368d) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = gVar2.e(fVar);
            if (objE == null) {
                return 0;
            }
            return ((List) objE).size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean k(g<MessageType, Type> gVar) {
            o(gVar);
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar2 = this.f409362b;
            gVar2.getClass();
            f fVar = gVar.f409372d;
            if (fVar.f409368d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return gVar2.f409353a.get(fVar) != null;
        }

        public final void l() {
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar = this.f409362b;
            if (gVar.f409354b) {
                return;
            }
            gVar.f409353a.e();
            gVar.f409354b = true;
        }

        public final d<MessageType>.a m() {
            return new a(this, false, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean n(kotlin.reflect.jvm.internal.impl.protobuf.e r9, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.f r11, int r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.d.n(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
        }

        public final void o(g<MessageType, ?> gVar) {
            if (gVar.f409369a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public d(c<MessageType, ?> cVar) {
            kotlin.reflect.jvm.internal.impl.protobuf.g<f> gVar = cVar.f409360c;
            if (!gVar.f409354b) {
                gVar.f409353a.e();
                gVar.f409354b = true;
            }
            cVar.f409361d = false;
            this.f409362b = cVar.f409360c;
        }
    }
}

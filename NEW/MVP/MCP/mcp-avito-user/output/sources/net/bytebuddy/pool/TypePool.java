package net.bytebuddy.pool;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import c61.AbstractC26949b;
import c61.C26948a;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.SoftReference;
import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.enumeration.a;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.field.b;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.method.c;
import net.bytebuddy.description.method.d;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.a;
import net.bytebuddy.description.type.b;
import net.bytebuddy.description.type.c;
import net.bytebuddy.description.type.d;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.D;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.jar.asm.x;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.utility.JavaType;
import okhttp3.internal.http2.Settings;
import shark.AndroidResourceIdNames;

/* loaded from: classes7.dex */
public interface TypePool {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Empty implements TypePool {

        /* renamed from: b, reason: collision with root package name */
        public static final Empty f418835b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Empty[] f418836c;

        static {
            Empty empty = new Empty("INSTANCE", 0);
            f418835b = empty;
            f418836c = new Empty[]{empty};
        }

        public Empty() {
            throw null;
        }

        public static Empty valueOf(String str) {
            return (Empty) Enum.valueOf(Empty.class, str);
        }

        public static Empty[] values() {
            return (Empty[]) f418836c.clone();
        }

        @Override // net.bytebuddy.pool.TypePool
        public final Resolution a(String str) {
            return new Resolution.a(str);
        }
    }

    public interface Resolution {

        public static class NoSuchTypeException extends IllegalStateException {
            private static final long serialVersionUID = 1;
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final String f418837a;

            public a(String str) {
                this.f418837a = str;
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final TypeDescription a() {
                throw new NoSuchTypeException("Cannot resolve type description for " + this.f418837a);
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final boolean b() {
                return false;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418837a.equals(((a) obj).f418837a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418837a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final TypeDescription f418838a;

            public b(TypeDescription typeDescription) {
                this.f418838a = typeDescription;
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final TypeDescription a() {
                return this.f418838a;
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final boolean b() {
                return true;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418838a.equals(((b) obj).f418838a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f418838a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        TypeDescription a();

        boolean b();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class b implements TypePool {

        /* renamed from: c, reason: collision with root package name */
        public static final Map<String, TypeDescription> f418839c;

        /* renamed from: d, reason: collision with root package name */
        public static final Map<String, String> f418840d;

        /* renamed from: b, reason: collision with root package name */
        public final CacheProvider f418841b;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final Resolution f418842a;

            /* renamed from: b, reason: collision with root package name */
            public final int f418843b;

            public a(Resolution resolution, int i12) {
                this.f418842a = resolution;
                this.f418843b = i12;
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final TypeDescription a() {
                return TypeDescription.c.z0(this.f418842a.a(), this.f418843b);
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final boolean b() {
                return this.f418842a.b();
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f418843b == aVar.f418843b && this.f418842a.equals(aVar.f418842a);
            }

            public final int hashCode() {
                return ((this.f418842a.hashCode() + (getClass().hashCode() * 31)) * 31) + this.f418843b;
            }
        }

        /* renamed from: net.bytebuddy.pool.TypePool$b$b, reason: collision with other inner class name */
        public interface InterfaceC12142b {
            @net.bytebuddy.utility.nullability.b
            String a();
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class c extends b {

            /* renamed from: e, reason: collision with root package name */
            public final TypePool f418844e;

            public c(CacheProvider cacheProvider, TypePool typePool) {
                super(cacheProvider);
                this.f418844e = typePool;
            }

            @Override // net.bytebuddy.pool.TypePool.b, net.bytebuddy.pool.TypePool
            public final Resolution a(String str) {
                Resolution resolutionA = this.f418844e.a(str);
                return resolutionA.b() ? resolutionA : super.a(str);
            }

            @Override // net.bytebuddy.pool.TypePool.b
            public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418844e.equals(((c) obj).f418844e);
                }
                return false;
            }

            @Override // net.bytebuddy.pool.TypePool.b
            public int hashCode() {
                return this.f418844e.hashCode() + (super.hashCode() * 31);
            }
        }

        static {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
            for (int i12 = 0; i12 < 9; i12++) {
                Class cls = clsArr[i12];
                map.put(cls.getName(), TypeDescription.d.A0(cls));
                map2.put(B.i(cls), cls.getName());
            }
            f418839c = Collections.unmodifiableMap(map);
            f418840d = Collections.unmodifiableMap(map2);
        }

        public b(CacheProvider cacheProvider) {
            this.f418841b = cacheProvider;
        }

        @Override // net.bytebuddy.pool.TypePool
        public Resolution a(String str) {
            if (str.contains("/")) {
                throw new IllegalArgumentException(str.concat(" contains the illegal character '/'"));
            }
            int i12 = 0;
            while (str.startsWith("[")) {
                i12++;
                str = str.substring(1);
            }
            if (i12 > 0) {
                String str2 = f418840d.get(str);
                str = str2 == null ? androidx.compose.ui.graphics.colorspace.e.h(1, 1, str) : str2;
            }
            TypeDescription typeDescription = f418839c.get(str);
            Resolution resolutionA = typeDescription == null ? this.f418841b.a(str) : new Resolution.b(typeDescription);
            if (resolutionA == null) {
                resolutionA = b(str, c(str));
            }
            return i12 == 0 ? resolutionA : new a(resolutionA, i12);
        }

        public Resolution b(String str, Resolution resolution) {
            return this.f418841b.b(str, resolution);
        }

        public abstract Resolution c(String str);

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418841b.equals(((b) obj).f418841b);
            }
            return false;
        }

        public int hashCode() {
            return this.f418841b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends b.c {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f418845g = 0;

        /* renamed from: f, reason: collision with root package name */
        @HashCodeAndEqualsPlugin.ValueHandling
        @net.bytebuddy.utility.nullability.b
        public final ClassLoader f418846f;

        public c(CacheProvider.b bVar, TypePool typePool, @net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            super(bVar, typePool);
            this.f418846f = classLoader;
        }

        @Override // net.bytebuddy.pool.TypePool.b
        public final Resolution c(String str) {
            try {
                return new Resolution.b(TypeDescription.d.A0(Class.forName(str, false, this.f418846f)));
            } catch (ClassNotFoundException unused) {
                return new Resolution.a(str);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x002e A[RETURN] */
        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = 1
                if (r4 != r5) goto Lc
                return r0
            Lc:
                if (r5 != 0) goto Lf
                return r1
            Lf:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L1a
                return r1
            L1a:
                net.bytebuddy.pool.TypePool$c r5 = (net.bytebuddy.pool.TypePool.c) r5
                java.lang.ClassLoader r2 = r4.f418846f
                java.lang.ClassLoader r5 = r5.f418846f
                if (r5 == 0) goto L2b
                if (r2 == 0) goto L2d
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2e
                return r1
            L2b:
                if (r2 == 0) goto L2e
            L2d:
                return r1
            L2e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.pool.TypePool.c.equals(java.lang.Object):boolean");
        }

        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            ClassLoader classLoader = this.f418846f;
            return classLoader != null ? iHashCode + classLoader.hashCode() : iHashCode;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d extends b.c {
        @Override // net.bytebuddy.pool.TypePool.b
        public final Resolution c(String str) {
            throw null;
        }

        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        public final int hashCode() {
            super.hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class e extends b {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Resolution {

            /* renamed from: a, reason: collision with root package name */
            public final String f418847a;

            public a(String str) {
                this.f418847a = str;
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final TypeDescription a() {
                return new b(this.f418847a);
            }

            @Override // net.bytebuddy.pool.TypePool.Resolution
            public final boolean b() {
                throw null;
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                if (this.f418847a.equals(((a) obj).f418847a)) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                getClass().hashCode();
                throw null;
            }
        }

        public static class b extends TypeDescription.b.a.AbstractC11997a {

            /* renamed from: e, reason: collision with root package name */
            public final String f418848e;

            public b(String str) {
                this.f418848e = str;
            }

            @Override // net.bytebuddy.description.d.InterfaceC11969d
            public final String getName() {
                return this.f418848e;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b.a.AbstractC11997a
            @k.c
            public final TypeDescription z0() {
                throw null;
            }
        }

        @Override // net.bytebuddy.pool.TypePool.b
        public final Resolution c(String str) {
            return new a(str);
        }

        @Override // net.bytebuddy.pool.TypePool.b
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        @Override // net.bytebuddy.pool.TypePool.b
        public final int hashCode() {
            super.hashCode();
            throw null;
        }
    }

    Resolution a(String str);

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default extends b.c {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f418443h = 0;

        /* renamed from: f, reason: collision with root package name */
        public final ClassFileLocator f418444f;

        /* renamed from: g, reason: collision with root package name */
        public final ReaderMode f418445g;

        public enum ReaderMode {
            EXTENDED(4),
            FAST(1);


            /* renamed from: b, reason: collision with root package name */
            public final int f418726b;

            ReaderMode(int i12) {
                this.f418726b = i12;
            }
        }

        public interface a {

            /* renamed from: net.bytebuddy.pool.TypePool$Default$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC12124a implements a {

                /* renamed from: b, reason: collision with root package name */
                public final String f418727b;

                /* renamed from: c, reason: collision with root package name */
                public final HashMap f418728c = new HashMap();

                /* renamed from: net.bytebuddy.pool.TypePool$Default$a$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC12125a extends AbstractC12124a {

                    /* renamed from: d, reason: collision with root package name */
                    public final String f418729d;

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$a$a$a$a, reason: collision with other inner class name */
                    public static abstract class AbstractC12126a extends AbstractC12125a {

                        /* renamed from: e, reason: collision with root package name */
                        public final int f418730e;

                        /* renamed from: net.bytebuddy.pool.TypePool$Default$a$a$a$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC12127a extends AbstractC12126a {

                            /* renamed from: f, reason: collision with root package name */
                            public final int f418731f;

                            public AbstractC12127a(String str, @net.bytebuddy.utility.nullability.b C c12, int i12, int i13) {
                                super(str, c12, i12);
                                this.f418731f = i13;
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a.AbstractC12125a.AbstractC12126a
                            public final Map<Integer, Map<String, List<LazyTypeDescription.a>>> d() {
                                Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.a>>>> mapE = e();
                                int i12 = this.f418731f;
                                Map<Integer, Map<String, List<LazyTypeDescription.a>>> map = mapE.get(Integer.valueOf(i12));
                                if (map != null) {
                                    return map;
                                }
                                HashMap map2 = new HashMap();
                                mapE.put(Integer.valueOf(i12), map2);
                                return map2;
                            }

                            public abstract Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.a>>>> e();
                        }

                        public AbstractC12126a(String str, @net.bytebuddy.utility.nullability.b C c12, int i12) {
                            super(str, c12);
                            this.f418730e = i12;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a.AbstractC12125a
                        public final Map<String, List<LazyTypeDescription.a>> b() {
                            Map<Integer, Map<String, List<LazyTypeDescription.a>>> mapD = d();
                            int i12 = this.f418730e;
                            Map<String, List<LazyTypeDescription.a>> map = mapD.get(Integer.valueOf(i12));
                            if (map != null) {
                                return map;
                            }
                            HashMap map2 = new HashMap();
                            mapD.put(Integer.valueOf(i12), map2);
                            return map2;
                        }

                        public abstract Map<Integer, Map<String, List<LazyTypeDescription.a>>> d();
                    }

                    public AbstractC12125a(String str, @net.bytebuddy.utility.nullability.b C c12) {
                        super(str);
                        this.f418729d = c12 == null ? "" : c12.toString();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a
                    public final List<LazyTypeDescription.a> a() {
                        Map<String, List<LazyTypeDescription.a>> mapB = b();
                        String str = this.f418729d;
                        List<LazyTypeDescription.a> list = mapB.get(str);
                        if (list != null) {
                            return list;
                        }
                        ArrayList arrayList = new ArrayList();
                        mapB.put(str, arrayList);
                        return arrayList;
                    }

                    public abstract Map<String, List<LazyTypeDescription.a>> b();
                }

                public AbstractC12124a(String str) {
                    this.f418727b = str;
                }

                public abstract List<LazyTypeDescription.a> a();

                @Override // net.bytebuddy.pool.TypePool.Default.a
                public final void c(String str, AnnotationValue.b bVar) {
                    this.f418728c.put(str, bVar);
                }

                @Override // net.bytebuddy.pool.TypePool.Default.a
                public final void onComplete() {
                    a().add(new LazyTypeDescription.a(this.f418727b, this.f418728c));
                }
            }

            public static class b extends AbstractC12124a {

                /* renamed from: d, reason: collision with root package name */
                public final ArrayList f418732d;

                /* renamed from: net.bytebuddy.pool.TypePool$Default$a$b$a, reason: collision with other inner class name */
                public static class C12128a extends AbstractC12124a {

                    /* renamed from: d, reason: collision with root package name */
                    public final int f418733d;

                    /* renamed from: e, reason: collision with root package name */
                    public final HashMap f418734e;

                    public C12128a(String str, int i12, HashMap map) {
                        super(str);
                        this.f418733d = i12;
                        this.f418734e = map;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a
                    public final List<LazyTypeDescription.a> a() {
                        int i12 = this.f418733d;
                        Integer numValueOf = Integer.valueOf(i12);
                        HashMap map = this.f418734e;
                        List<LazyTypeDescription.a> list = (List) map.get(numValueOf);
                        if (list != null) {
                            return list;
                        }
                        ArrayList arrayList = new ArrayList();
                        map.put(Integer.valueOf(i12), arrayList);
                        return arrayList;
                    }
                }

                public b(String str, ArrayList arrayList) {
                    super(str);
                    this.f418732d = arrayList;
                }

                @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a
                public final List<LazyTypeDescription.a> a() {
                    return this.f418732d;
                }
            }

            public static class c extends AbstractC12124a.AbstractC12125a {

                /* renamed from: e, reason: collision with root package name */
                public final HashMap f418735e;

                /* renamed from: net.bytebuddy.pool.TypePool$Default$a$c$a, reason: collision with other inner class name */
                public static class C12129a extends AbstractC12124a.AbstractC12125a.AbstractC12126a {

                    /* renamed from: f, reason: collision with root package name */
                    public final HashMap f418736f;

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$a$c$a$a, reason: collision with other inner class name */
                    public static class C12130a extends AbstractC12124a.AbstractC12125a.AbstractC12126a.AbstractC12127a {

                        /* renamed from: g, reason: collision with root package name */
                        public final HashMap f418737g;

                        public C12130a(String str, @net.bytebuddy.utility.nullability.b C c12, int i12, int i13, HashMap map) {
                            super(str, c12, i12, i13);
                            this.f418737g = map;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a.AbstractC12125a.AbstractC12126a.AbstractC12127a
                        public final Map<Integer, Map<Integer, Map<String, List<LazyTypeDescription.a>>>> e() {
                            return this.f418737g;
                        }
                    }

                    public C12129a(String str, @net.bytebuddy.utility.nullability.b C c12, int i12, HashMap map) {
                        super(str, c12, i12);
                        this.f418736f = map;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a.AbstractC12125a.AbstractC12126a
                    public final Map<Integer, Map<String, List<LazyTypeDescription.a>>> d() {
                        return this.f418736f;
                    }
                }

                public c(String str, @net.bytebuddy.utility.nullability.b C c12, HashMap map) {
                    super(str, c12);
                    this.f418735e = map;
                }

                @Override // net.bytebuddy.pool.TypePool.Default.a.AbstractC12124a.AbstractC12125a
                public final Map<String, List<LazyTypeDescription.a>> b() {
                    return this.f418735e;
                }
            }

            void c(String str, AnnotationValue.b bVar);

            void onComplete();
        }

        public static class b extends c.a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final c f418738a;

            /* renamed from: b, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.d
            public InterfaceC12137b.a f418739b;

            public static abstract class a<T extends LazyTypeDescription.GenericTypeToken.Resolution> extends c.a implements c {

                /* renamed from: a, reason: collision with root package name */
                public final ArrayList f418740a = new ArrayList();

                /* renamed from: b, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public String f418741b;

                /* renamed from: c, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public ArrayList f418742c;

                /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$a, reason: collision with other inner class name */
                public static class C12131a implements c {

                    /* renamed from: a, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public LazyTypeDescription.GenericTypeToken f418743a;

                    @Override // net.bytebuddy.pool.TypePool.Default.c
                    public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                        this.f418743a = genericTypeToken;
                    }
                }

                /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$b, reason: collision with other inner class name */
                public static class C12132b extends a<LazyTypeDescription.GenericTypeToken.Resolution.b> {

                    /* renamed from: d, reason: collision with root package name */
                    public final ArrayList f418744d = new ArrayList();

                    /* renamed from: e, reason: collision with root package name */
                    public final ArrayList f418745e = new ArrayList();

                    /* renamed from: f, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public LazyTypeDescription.GenericTypeToken f418746f;

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$b$a, reason: collision with other inner class name */
                    public class C12133a implements c {
                        public C12133a() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            C12132b.this.f418745e.add(genericTypeToken);
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return C12132b.this.equals(C12132b.this);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return C12132b.this.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$b$b, reason: collision with other inner class name */
                    public class C12134b implements c {
                        public C12134b() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            C12132b.this.f418744d.add(genericTypeToken);
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return C12132b.this.equals(C12132b.this);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return C12132b.this.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$b$c */
                    public class c implements c {
                        public c() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            C12132b.this.f418746f = genericTypeToken;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return C12132b.this.equals(C12132b.this);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return C12132b.this.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                    public final AbstractC26949b g() {
                        return new b(new C12133a());
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                    public final AbstractC26949b l() {
                        return new b(new C12134b());
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                    public final AbstractC26949b m() {
                        r();
                        return new b(new c());
                    }
                }

                public static class c implements c {

                    /* renamed from: a, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public LazyTypeDescription.GenericTypeToken f418750a;

                    @Override // net.bytebuddy.pool.TypePool.Default.c
                    public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                        this.f418750a = genericTypeToken;
                    }
                }

                public static class d extends a<LazyTypeDescription.GenericTypeToken.Resolution.d> {

                    /* renamed from: d, reason: collision with root package name */
                    public final ArrayList f418751d = new ArrayList();

                    /* renamed from: e, reason: collision with root package name */
                    @net.bytebuddy.utility.nullability.d
                    public LazyTypeDescription.GenericTypeToken f418752e;

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$d$a, reason: collision with other inner class name */
                    public class C12135a implements c {
                        public C12135a() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            d.this.f418751d.add(genericTypeToken);
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return d.this.equals(d.this);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return d.this.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$a$d$b, reason: collision with other inner class name */
                    public class C12136b implements c {
                        public C12136b() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            d.this.f418752e = genericTypeToken;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return d.this.equals(d.this);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return d.this.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                    public final AbstractC26949b j() {
                        return new b(new C12135a());
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                    public final AbstractC26949b n() {
                        r();
                        return new b(new C12136b());
                    }
                }

                @Override // net.bytebuddy.pool.TypePool.Default.c
                public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                    ArrayList arrayList = this.f418742c;
                    if (arrayList != null) {
                        arrayList.add(genericTypeToken);
                        return;
                    }
                    throw new IllegalStateException("Did not expect " + genericTypeToken + " before finding formal parameter");
                }

                @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                public final AbstractC26949b d() {
                    return new b(this);
                }

                @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                public final void h(String str) {
                    r();
                    this.f418741b = str;
                    this.f418742c = new ArrayList();
                }

                @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
                public final AbstractC26949b k() {
                    return new b(this);
                }

                public final void r() {
                    String str = this.f418741b;
                    if (str != null) {
                        this.f418740a.add(new LazyTypeDescription.GenericTypeToken.e.b(str, this.f418742c));
                    }
                }
            }

            /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b, reason: collision with other inner class name */
            public interface InterfaceC12137b {

                /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$a */
                public static abstract class a implements InterfaceC12137b {

                    /* renamed from: a, reason: collision with root package name */
                    public final ArrayList f418755a = new ArrayList();

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$a$a, reason: collision with other inner class name */
                    public class C12138a implements c {
                        public C12138a() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            a.this.f418755a.add(genericTypeToken);
                        }
                    }

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$a$b, reason: collision with other inner class name */
                    public class C12139b implements c {
                        public C12139b() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            a.this.f418755a.add(new LazyTypeDescription.GenericTypeToken.b(genericTypeToken));
                        }
                    }

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$a$c */
                    public class c implements c {
                        public c() {
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.c
                        public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                            a.this.f418755a.add(new LazyTypeDescription.GenericTypeToken.f(genericTypeToken));
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$b, reason: collision with other inner class name */
                public static class C12140b extends a {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418759b;

                    /* renamed from: c, reason: collision with root package name */
                    public final a f418760c;

                    public C12140b(String str, a aVar) {
                        this.f418759b = str;
                        this.f418760c = aVar;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final boolean a() {
                        return (this.f418755a.isEmpty() && this.f418760c.a()) ? false : true;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final LazyTypeDescription.GenericTypeToken b() {
                        boolean zA2 = a();
                        a aVar = this.f418760c;
                        return (zA2 || aVar.a()) ? new LazyTypeDescription.GenericTypeToken.c.b(getName(), this.f418755a, aVar.b()) : new LazyTypeDescription.GenericTypeToken.d(getName());
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        C12140b c12140b = (C12140b) obj;
                        return this.f418759b.equals(c12140b.f418759b) && this.f418760c.equals(c12140b.f418760c);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final String getName() {
                        return this.f418760c.getName() + '$' + this.f418759b.replace('/', '.');
                    }

                    public final int hashCode() {
                        return this.f418760c.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418759b);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.pool.TypePool$Default$b$b$c */
                public static class c extends a {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418761b;

                    public c(String str) {
                        this.f418761b = str;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final boolean a() {
                        return !this.f418755a.isEmpty();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final LazyTypeDescription.GenericTypeToken b() {
                        return a() ? new LazyTypeDescription.GenericTypeToken.c(getName(), this.f418755a) : new LazyTypeDescription.GenericTypeToken.d(getName());
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418761b.equals(((c) obj).f418761b);
                        }
                        return false;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.b.InterfaceC12137b
                    public final String getName() {
                        return this.f418761b.replace('/', '.');
                    }

                    public final int hashCode() {
                        return this.f418761b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                boolean a();

                LazyTypeDescription.GenericTypeToken b();

                String getName();
            }

            public b(c cVar) {
                this.f418738a = cVar;
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c
            public final void a(LazyTypeDescription.GenericTypeToken genericTypeToken) {
                this.f418738a.a(new LazyTypeDescription.GenericTypeToken.a(genericTypeToken));
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final AbstractC26949b b() {
                return new b(this);
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void c(char c12) {
                LazyTypeDescription.GenericTypeToken.ForPrimitiveType forPrimitiveType;
                if (c12 == 'F') {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.FLOAT;
                } else if (c12 == 'S') {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.SHORT;
                } else if (c12 == 'V') {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.VOID;
                } else if (c12 == 'Z') {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BOOLEAN;
                } else if (c12 == 'I') {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.INTEGER;
                } else if (c12 != 'J') {
                    switch (c12) {
                        case 'B':
                            forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BYTE;
                            break;
                        case 'C':
                            forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.CHAR;
                            break;
                        case 'D':
                            forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.DOUBLE;
                            break;
                        default:
                            LazyTypeDescription.GenericTypeToken.ForPrimitiveType forPrimitiveType2 = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.BOOLEAN;
                            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Not a valid primitive type descriptor: ", c12));
                    }
                } else {
                    forPrimitiveType = LazyTypeDescription.GenericTypeToken.ForPrimitiveType.LONG;
                }
                this.f418738a.a(forPrimitiveType);
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void e(String str) {
                this.f418739b = new InterfaceC12137b.c(str);
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void f() {
                this.f418738a.a(this.f418739b.b());
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void i(String str) {
                this.f418739b = new InterfaceC12137b.C12140b(str, this.f418739b);
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final AbstractC26949b o(char c12) {
                if (c12 == '+') {
                    InterfaceC12137b.a aVar = this.f418739b;
                    aVar.getClass();
                    return new b(aVar.new c());
                }
                if (c12 == '-') {
                    InterfaceC12137b.a aVar2 = this.f418739b;
                    aVar2.getClass();
                    return new b(aVar2.new C12139b());
                }
                if (c12 != '=') {
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.l("Unknown wildcard: ", c12));
                }
                InterfaceC12137b.a aVar3 = this.f418739b;
                aVar3.getClass();
                return new b(aVar3.new C12138a());
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void p() {
                this.f418739b.f418755a.add(LazyTypeDescription.GenericTypeToken.ForUnboundWildcard.f418491b);
            }

            @Override // net.bytebuddy.pool.TypePool.Default.c.a, c61.AbstractC26949b
            public final void q(String str) {
                this.f418738a.a(new LazyTypeDescription.GenericTypeToken.e(str));
            }
        }

        public interface c {

            public static class a extends AbstractC26949b {
                public a() {
                    int i12 = net.bytebuddy.utility.e.f418981b;
                    if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
                        throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
                    }
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b b() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void c(char c12) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b d() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void e(String str) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void f() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b g() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void h(String str) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void i(String str) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b j() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b k() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b l() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b m() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b n() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public AbstractC26949b o(char c12) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void p() {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }

                @Override // c61.AbstractC26949b
                public void q(String str) {
                    throw new IllegalStateException("Unexpected token in generic signature");
                }
            }

            void a(LazyTypeDescription.GenericTypeToken genericTypeToken);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public final B[] f418762a;

            /* renamed from: b, reason: collision with root package name */
            public final HashMap f418763b = new HashMap();

            public d(B[] bArr) {
                this.f418762a = bArr;
            }
        }

        public Default(CacheProvider cacheProvider, ClassFileLocator classFileLocator, ReaderMode readerMode) {
            super(cacheProvider, Empty.f418835b);
            this.f418444f = classFileLocator;
            this.f418445g = readerMode;
        }

        @Override // net.bytebuddy.pool.TypePool.b
        public Resolution c(String str) {
            try {
                ClassFileLocator.h hVarK = this.f418444f.K(str);
                return hVarK.b() ? new Resolution.b(d(hVarK.a())) : new Resolution.a(str);
            } catch (IOException e12) {
                throw new IllegalStateException("Error while reading class file", e12);
            }
        }

        public final LazyTypeDescription d(byte[] bArr) {
            net.bytebuddy.jar.asm.e eVarA = net.bytebuddy.utility.e.a(bArr);
            e eVar = new e();
            eVarA.a(this.f418445g.f418726b, eVar);
            if (eVar.f418773m == null || eVar.f418784x == null) {
                throw new IllegalStateException("Internal name or class file version were not set");
            }
            HashMap map = eVar.f418764d;
            Map mapEmptyMap = (Map) map.remove(-1);
            int i12 = eVar.f418771k;
            int i13 = eVar.f418772l;
            String str = eVar.f418773m;
            String str2 = eVar.f418774n;
            String[] strArr = eVar.f418776p;
            String str3 = eVar.f418775o;
            LazyTypeDescription.TypeContainment typeContainment = eVar.f418780t;
            String str4 = eVar.f418781u;
            ArrayList arrayList = eVar.f418782v;
            boolean z12 = eVar.f418777q;
            String str5 = eVar.f418778r;
            ArrayList arrayList2 = eVar.f418779s;
            if (mapEmptyMap == null) {
                mapEmptyMap = Collections.emptyMap();
            }
            return new LazyTypeDescription(this, i12, i13, str, str2, strArr, str3, typeContainment, str4, arrayList, z12, str5, arrayList2, mapEmptyMap, map, eVar.f418765e, eVar.f418766f, eVar.f418767g, eVar.f418768h, eVar.f418769i, eVar.f418770j, eVar.f418783w);
        }

        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r52 = (Default) obj;
            return this.f418445g.equals(r52.f418445g) && this.f418444f.equals(r52.f418444f);
        }

        @Override // net.bytebuddy.pool.TypePool.b.c, net.bytebuddy.pool.TypePool.b
        public final int hashCode() {
            return this.f418445g.hashCode() + ((this.f418444f.hashCode() + (super.hashCode() * 31)) * 31);
        }

        public static class LazyTypeDescription extends TypeDescription.b.a {

            /* renamed from: A, reason: collision with root package name */
            public final ArrayList f418453A;

            /* renamed from: e, reason: collision with root package name */
            public final Default f418454e;

            /* renamed from: f, reason: collision with root package name */
            public final int f418455f;

            /* renamed from: g, reason: collision with root package name */
            public final int f418456g;

            /* renamed from: h, reason: collision with root package name */
            public final String f418457h;

            /* renamed from: i, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f418458i;

            /* renamed from: j, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f418459j;

            /* renamed from: k, reason: collision with root package name */
            public final GenericTypeToken.Resolution.d f418460k;

            /* renamed from: l, reason: collision with root package name */
            public final List<String> f418461l;

            /* renamed from: m, reason: collision with root package name */
            public final TypeContainment f418462m;

            /* renamed from: n, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f418463n;

            /* renamed from: o, reason: collision with root package name */
            public final ArrayList f418464o;

            /* renamed from: p, reason: collision with root package name */
            public final boolean f418465p;

            /* renamed from: q, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public final String f418466q;

            /* renamed from: r, reason: collision with root package name */
            public final ArrayList f418467r;

            /* renamed from: s, reason: collision with root package name */
            public final Map<String, List<a>> f418468s;

            /* renamed from: t, reason: collision with root package name */
            public final HashMap f418469t;

            /* renamed from: u, reason: collision with root package name */
            public final HashMap f418470u;

            /* renamed from: v, reason: collision with root package name */
            public final HashMap f418471v;

            /* renamed from: w, reason: collision with root package name */
            public final ArrayList f418472w;

            /* renamed from: x, reason: collision with root package name */
            public final ArrayList f418473x;

            /* renamed from: y, reason: collision with root package name */
            public final ArrayList f418474y;

            /* renamed from: z, reason: collision with root package name */
            public final ArrayList f418475z;

            public interface TypeContainment {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class SelfContained implements TypeContainment {

                    /* renamed from: b, reason: collision with root package name */
                    public static final SelfContained f418583b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ SelfContained[] f418584c;

                    static {
                        SelfContained selfContained = new SelfContained("INSTANCE", 0);
                        f418583b = selfContained;
                        f418584c = new SelfContained[]{selfContained};
                    }

                    public SelfContained() {
                        throw null;
                    }

                    public static SelfContained valueOf(String str) {
                        return (SelfContained) Enum.valueOf(SelfContained.class, str);
                    }

                    public static SelfContained[] values() {
                        return (SelfContained[]) f418584c.clone();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean H() {
                        return false;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.b
                    public final a.d a(Default r12) {
                        return null;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.b
                    public final TypeDescription b(Default r12) {
                        TypeDescription.d dVar = TypeDescription.f416317A2;
                        return null;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean c() {
                        return true;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements TypeContainment {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418585b;

                    /* renamed from: c, reason: collision with root package name */
                    public final String f418586c;

                    /* renamed from: d, reason: collision with root package name */
                    public final String f418587d;

                    public a(String str, String str2, String str3) {
                        this.f418585b = str.replace('/', '.');
                        this.f418586c = str2;
                        this.f418587d = str3;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean H() {
                        return true;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final a.d a(Default r62) {
                        TypeDescription typeDescriptionB = b(r62);
                        if (typeDescriptionB == null) {
                            throw new IllegalStateException("Could not resolve enclosing type " + this.f418585b);
                        }
                        net.bytebuddy.description.method.b<a.d> bVarQ = typeDescriptionB.q();
                        String str = this.f418586c;
                        InterfaceC44410t.a.AbstractC12113a abstractC12113aX = "<init>".equals(str) ? MethodSortMatcher.Sort.f418387e.f418392c : "<clinit>".equals(str) ? MethodSortMatcher.Sort.f418388f.f418392c : C44411u.x(str);
                        String str2 = this.f418587d;
                        net.bytebuddy.description.method.b bVarP1 = bVarQ.P1(abstractC12113aX.a(C44411u.d(str2)));
                        if (!bVarP1.isEmpty()) {
                            return (a.d) bVarP1.M2();
                        }
                        throw new IllegalStateException(str + str2 + " not declared by " + typeDescriptionB);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final TypeDescription b(Default r22) {
                        return r22.a(this.f418585b).a();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean c() {
                        return false;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        a aVar = (a) obj;
                        return this.f418585b.equals(aVar.f418585b) && this.f418586c.equals(aVar.f418586c) && this.f418587d.equals(aVar.f418587d);
                    }

                    public final int hashCode() {
                        return this.f418587d.hashCode() + H.d(H.d(getClass().hashCode() * 31, 31, this.f418585b), 31, this.f418586c);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements TypeContainment {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418588b;

                    /* renamed from: c, reason: collision with root package name */
                    public final boolean f418589c;

                    public b(String str, boolean z12) {
                        this.f418588b = str.replace('/', '.');
                        this.f418589c = z12;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean H() {
                        return this.f418589c;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    @net.bytebuddy.utility.nullability.b
                    public final a.d a(Default r12) {
                        return null;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final TypeDescription b(Default r22) {
                        return r22.a(this.f418588b).a();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.TypeContainment
                    public final boolean c() {
                        return false;
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f418589c == bVar.f418589c && this.f418588b.equals(bVar.f418588b);
                    }

                    public final int hashCode() {
                        return H.d(getClass().hashCode() * 31, 31, this.f418588b) + (this.f418589c ? 1 : 0);
                    }
                }

                boolean H();

                @net.bytebuddy.utility.nullability.b
                a.d a(Default r12);

                @net.bytebuddy.utility.nullability.b
                TypeDescription b(Default r12);

                boolean c();
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                public final String f418590a;

                /* renamed from: b, reason: collision with root package name */
                public final HashMap f418591b;

                /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$a$a, reason: collision with other inner class name */
                public interface InterfaceC12119a {

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$a$a$a, reason: collision with other inner class name */
                    public static class C12120a implements InterfaceC12119a {

                        /* renamed from: a, reason: collision with root package name */
                        public final String f418592a;

                        public C12120a(String str) {
                            this.f418592a = str;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.a.InterfaceC12119a
                        public final AnnotationDescription a() {
                            throw new IllegalStateException("Annotation type is not available: " + this.f418592a);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.a.InterfaceC12119a
                        public final boolean b() {
                            return false;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f418592a.equals(((C12120a) obj).f418592a);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f418592a.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$a$a$b */
                    public static class b implements InterfaceC12119a {

                        /* renamed from: a, reason: collision with root package name */
                        public final AnnotationDescription f418593a;

                        public b(AnnotationDescription annotationDescription) {
                            this.f418593a = annotationDescription;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.a.InterfaceC12119a
                        public final AnnotationDescription a() {
                            return this.f418593a;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.a.InterfaceC12119a
                        public final boolean b() {
                            return true;
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj != null && getClass() == obj.getClass()) {
                                return this.f418593a.equals(((b) obj).f418593a);
                            }
                            return false;
                        }

                        public final int hashCode() {
                            return this.f418593a.hashCode() + (getClass().hashCode() * 31);
                        }
                    }

                    AnnotationDescription a();

                    boolean b();
                }

                public a(String str, HashMap map) {
                    this.f418590a = str;
                    this.f418591b = map;
                }

                public static InterfaceC12119a a(a aVar, TypePool typePool) {
                    Resolution resolutionA = typePool.a(aVar.b());
                    return resolutionA.b() ? new InterfaceC12119a.b(new d(typePool, resolutionA.a(), aVar.f418591b, null)) : new InterfaceC12119a.C12120a(aVar.b());
                }

                public final String b() {
                    String str = this.f418590a;
                    return str.substring(1, str.length() - 1).replace('/', '.');
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f418590a.equals(aVar.f418590a) && this.f418591b.equals(aVar.f418591b);
                }

                public final int hashCode() {
                    return this.f418591b.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418590a);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class b {

                /* renamed from: a, reason: collision with root package name */
                public final String f418594a;

                /* renamed from: b, reason: collision with root package name */
                public final int f418595b;

                /* renamed from: c, reason: collision with root package name */
                public final String f418596c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final String f418597d;

                /* renamed from: e, reason: collision with root package name */
                public final GenericTypeToken.Resolution.a f418598e;

                /* renamed from: f, reason: collision with root package name */
                public final HashMap f418599f;

                /* renamed from: g, reason: collision with root package name */
                public final ArrayList f418600g;

                public b(String str, int i12, String str2, @net.bytebuddy.utility.nullability.b String str3, HashMap map, ArrayList arrayList) {
                    this.f418595b = i12 & (-131073);
                    this.f418594a = str;
                    this.f418596c = str2;
                    this.f418597d = str3;
                    boolean z12 = TypeDescription.b.f416496c;
                    GenericTypeToken.Resolution.a c12116a = GenericTypeToken.Resolution.Raw.f418498b;
                    if (!z12 && str3 != null) {
                        b.a.C12131a c12131a = new b.a.C12131a();
                        try {
                            C26948a.b(str3, 0, new b(c12131a));
                            c12116a = new GenericTypeToken.Resolution.a.C12116a(c12131a.f418743a);
                        } catch (RuntimeException unused) {
                            c12116a = GenericTypeToken.Resolution.Malformed.f418496b;
                        }
                    }
                    this.f418598e = c12116a;
                    this.f418599f = map;
                    this.f418600g = arrayList;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f418595b == bVar.f418595b && this.f418594a.equals(bVar.f418594a) && this.f418596c.equals(bVar.f418596c) && this.f418597d.equals(bVar.f418597d) && this.f418598e.equals(bVar.f418598e) && this.f418599f.equals(bVar.f418599f) && this.f418600g.equals(bVar.f418600g);
                }

                public final int hashCode() {
                    return this.f418600g.hashCode() + ((this.f418599f.hashCode() + ((this.f418598e.hashCode() + H.d(H.d((H.d(getClass().hashCode() * 31, 31, this.f418594a) + this.f418595b) * 31, 31, this.f418596c), 31, this.f418597d)) * 31)) * 31);
                }
            }

            public class c extends b.a<a.c> {
                public c() {
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    LazyTypeDescription lazyTypeDescription = LazyTypeDescription.this;
                    b bVar = (b) lazyTypeDescription.f418473x.get(i12);
                    bVar.getClass();
                    return lazyTypeDescription.new f(bVar.f418594a, bVar.f418595b, bVar.f418596c, bVar.f418597d, bVar.f418598e, bVar.f418599f, bVar.f418600g, null);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return LazyTypeDescription.this.f418473x.size();
                }
            }

            public static class d extends AnnotationDescription.b {

                /* renamed from: e, reason: collision with root package name */
                public final TypePool f418602e;

                /* renamed from: f, reason: collision with root package name */
                public final TypeDescription f418603f;

                /* renamed from: g, reason: collision with root package name */
                public final Map<String, AnnotationValue<?, ?>> f418604g;

                public static class a<S extends Annotation> extends d implements AnnotationDescription.g<S> {

                    /* renamed from: h, reason: collision with root package name */
                    public final Class<S> f418605h;

                    public a() {
                        throw null;
                    }

                    public a(TypePool typePool, Class cls, Map map, a aVar) {
                        super(typePool, TypeDescription.d.A0(cls), map, null);
                        this.f418605h = cls;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.d, net.bytebuddy.description.annotation.AnnotationDescription
                    public final /* bridge */ /* synthetic */ AnnotationDescription.g c(Class cls) {
                        return c(cls);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationDescription.g
                    public final S load() {
                        Class<S> cls = this.f418605h;
                        return (S) AnnotationDescription.c.a(cls.getClassLoader(), cls, this.f418604g);
                    }
                }

                public d() {
                    throw null;
                }

                public d(TypePool typePool, TypeDescription typeDescription, Map map, a aVar) {
                    this.f418602e = typePool;
                    this.f418603f = typeDescription;
                    this.f418604g = map;
                }

                public static a.c h(TypePool typePool, List list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a.InterfaceC12119a interfaceC12119aA = a.a((a) it.next(), typePool);
                        if (interfaceC12119aA.b() && interfaceC12119aA.a().a().X()) {
                            arrayList.add(interfaceC12119aA.a());
                        }
                    }
                    return new a.c(arrayList);
                }

                public static net.bytebuddy.description.annotation.a i(TypePool typePool, @net.bytebuddy.utility.nullability.b List<? extends a> list) {
                    return list == null ? new a.b() : h(typePool, list);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public final TypeDescription a() {
                    return this.f418603f;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                public final AnnotationValue<?, ?> d(a.d dVar) {
                    TypeDescription typeDescriptionF5 = dVar.n().f5();
                    TypeDescription typeDescription = this.f418603f;
                    if (typeDescriptionF5.equals(typeDescription)) {
                        AnnotationValue<?, ?> annotationValue = this.f418604g.get(dVar.getName());
                        if (annotationValue != null) {
                            return annotationValue.q(dVar);
                        }
                        AnnotationValue<?, ?> defaultValue = ((a.d) typeDescription.q().P1(C44411u.e(dVar)).M2()).getDefaultValue();
                        return defaultValue == null ? new AnnotationValue.i(dVar.getName(), typeDescription) : defaultValue;
                    }
                    throw new IllegalArgumentException(dVar + " is not declared by " + typeDescription);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationDescription
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public final <T extends Annotation> a<T> c(Class<T> cls) {
                    TypeDescription typeDescription = this.f418603f;
                    if (typeDescription.Q2(cls)) {
                        return new a<>(this.f418602e, cls, this.f418604g, null);
                    }
                    throw new IllegalArgumentException(cls + " does not represent " + typeDescription);
                }
            }

            public static abstract class e<U, V> extends AnnotationValue.b<U, V> {

                /* renamed from: a, reason: collision with root package name */
                public transient /* synthetic */ int f418606a;

                public static class a extends e<AnnotationDescription, Annotation> {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418607b;

                    /* renamed from: c, reason: collision with root package name */
                    public final a f418608c;

                    /* renamed from: d, reason: collision with root package name */
                    public transient /* synthetic */ AnnotationValue.b f418609d;

                    public a(TypePool typePool, a aVar, a aVar2) {
                        super();
                        this.f418607b = typePool;
                        this.f418608c = aVar;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.e
                    @k.c
                    public final AnnotationValue<AnnotationDescription, Annotation> c() {
                        AnnotationValue.b hVar = null;
                        if (this.f418609d == null) {
                            a aVar = this.f418608c;
                            a.InterfaceC12119a interfaceC12119aA = a.a(aVar, this.f418607b);
                            hVar = !interfaceC12119aA.b() ? new AnnotationValue.h(aVar.b()) : !interfaceC12119aA.a().a().X() ? new d(interfaceC12119aA.a().a().getName(), AnnotationValue.Sort.ANNOTATION, null) : new AnnotationValue.c(interfaceC12119aA.a());
                        }
                        if (hVar == null) {
                            return this.f418609d;
                        }
                        this.f418609d = hVar;
                        return hVar;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.Sort o() {
                        return AnnotationValue.Sort.ANNOTATION;
                    }
                }

                public static class b extends e<Object, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418610b;

                    /* renamed from: c, reason: collision with root package name */
                    public final b.InterfaceC12142b f418611c;

                    /* renamed from: d, reason: collision with root package name */
                    public final List<AnnotationValue<?, ?>> f418612d;

                    /* renamed from: e, reason: collision with root package name */
                    public transient /* synthetic */ AnnotationValue.b f418613e;

                    public b() {
                        throw null;
                    }

                    public b(TypePool typePool, b.InterfaceC12142b interfaceC12142b, List list, a aVar) {
                        super();
                        this.f418610b = typePool;
                        this.f418611c = interfaceC12142b;
                        this.f418612d = list;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.e
                    @net.bytebuddy.build.k.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final net.bytebuddy.description.annotation.AnnotationValue<java.lang.Object, java.lang.Object> c() {
                        /*
                            Method dump skipped, instructions count: 362
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.e.b.c():net.bytebuddy.description.annotation.AnnotationValue");
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.Sort o() {
                        return AnnotationValue.Sort.ARRAY;
                    }
                }

                public static class c extends e<net.bytebuddy.description.enumeration.a, Enum<?>> {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418614b;

                    /* renamed from: c, reason: collision with root package name */
                    public final String f418615c;

                    /* renamed from: d, reason: collision with root package name */
                    public final String f418616d;

                    /* renamed from: e, reason: collision with root package name */
                    public transient /* synthetic */ AnnotationValue.b f418617e;

                    public c(TypePool typePool, String str, String str2, a aVar) {
                        super();
                        this.f418614b = typePool;
                        this.f418615c = str;
                        this.f418616d = str2;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.e
                    @k.c
                    public final AnnotationValue<net.bytebuddy.description.enumeration.a, Enum<?>> c() {
                        AnnotationValue.b dVar = null;
                        if (this.f418617e == null) {
                            TypePool typePool = this.f418614b;
                            String str = this.f418615c;
                            Resolution resolutionA = typePool.a(str);
                            if (resolutionA.b()) {
                                boolean zI2 = resolutionA.a().I();
                                String str2 = this.f418616d;
                                dVar = !zI2 ? new d(r.r(str, ".", str2), AnnotationValue.Sort.ENUMERATION, null) : resolutionA.a().x().P1(C44411u.x(str2)).isEmpty() ? new AnnotationValue.e.b(str2, resolutionA.a()) : new AnnotationValue.e(new a.c(str2, resolutionA.a()));
                            } else {
                                dVar = new AnnotationValue.h(str);
                            }
                        }
                        if (dVar == null) {
                            return this.f418617e;
                        }
                        this.f418617e = dVar;
                        return dVar;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.Sort o() {
                        return AnnotationValue.Sort.ENUMERATION;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class d<W, X> extends AnnotationValue.b<W, X> {

                    /* renamed from: a, reason: collision with root package name */
                    public final String f418618a;

                    /* renamed from: b, reason: collision with root package name */
                    public final AnnotationValue.Sort f418619b;

                    public d(String str, AnnotationValue.Sort sort, a aVar) {
                        this.f418618a = str;
                        this.f418619b = sort;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final W a() {
                        throw new IllegalStateException("Expected filtering of this unresolved property");
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        d dVar = (d) obj;
                        return this.f418619b.equals(dVar.f418619b) && this.f418618a.equals(dVar.f418618a);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.State getState() {
                        return AnnotationValue.State.f416103c;
                    }

                    public final int hashCode() {
                        return this.f418619b.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418618a);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.Sort o() {
                        return AnnotationValue.Sort.NONE;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue<W, X> p(a.d dVar, TypeDefinition typeDefinition) {
                        return new AnnotationValue.g(dVar, dVar.getReturnType().w2() ? AnnotationValue.RenderingDispatcher.f416081e.a(this.f418619b) : this.f418618a);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.k<X> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
                        throw new IllegalStateException("Expected filtering of this unresolved property");
                    }
                }

                /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$e$e, reason: collision with other inner class name */
                public static class C12121e extends e<TypeDescription, Class<?>> {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418620b;

                    /* renamed from: c, reason: collision with root package name */
                    public final String f418621c;

                    /* renamed from: d, reason: collision with root package name */
                    public transient /* synthetic */ AnnotationValue.b f418622d;

                    public C12121e(TypePool typePool, String str, a aVar) {
                        super();
                        this.f418620b = typePool;
                        this.f418621c = str;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.e
                    @k.c
                    public final AnnotationValue<TypeDescription, Class<?>> c() {
                        AnnotationValue.b jVar;
                        if (this.f418622d != null) {
                            jVar = null;
                        } else {
                            TypePool typePool = this.f418620b;
                            String str = this.f418621c;
                            Resolution resolutionA = typePool.a(str);
                            jVar = resolutionA.b() ? new AnnotationValue.j(resolutionA.a()) : new AnnotationValue.h(str);
                        }
                        if (jVar == null) {
                            return this.f418622d;
                        }
                        this.f418622d = jVar;
                        return jVar;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationValue
                    public final AnnotationValue.Sort o() {
                        return AnnotationValue.Sort.TYPE;
                    }
                }

                public e() {
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public final U a() {
                    return c().a();
                }

                public abstract AnnotationValue<U, V> c();

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    return c().equals(obj);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public final AnnotationValue.State getState() {
                    return c().getState();
                }

                @k.c
                public final int hashCode() {
                    int iHashCode = this.f418606a != 0 ? 0 : c().hashCode();
                    if (iHashCode == 0) {
                        return this.f418606a;
                    }
                    this.f418606a = iHashCode;
                    return iHashCode;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public final AnnotationValue<U, V> p(a.d dVar, TypeDefinition typeDefinition) {
                    return c().p(dVar, typeDefinition);
                }

                @Override // net.bytebuddy.description.annotation.AnnotationValue
                public final AnnotationValue.k<V> r(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
                    return c().r(classLoader);
                }

                public final String toString() {
                    return c().toString();
                }
            }

            public class f extends a.c.AbstractC11972a {

                /* renamed from: c, reason: collision with root package name */
                public final String f418623c;

                /* renamed from: d, reason: collision with root package name */
                public final int f418624d;

                /* renamed from: e, reason: collision with root package name */
                public final String f418625e;

                /* renamed from: f, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418626f;

                /* renamed from: g, reason: collision with root package name */
                public final GenericTypeToken.Resolution.a f418627g;

                /* renamed from: h, reason: collision with root package name */
                public final Map<String, List<a>> f418628h;

                /* renamed from: i, reason: collision with root package name */
                public final List<a> f418629i;

                public f() {
                    throw null;
                }

                public f(String str, int i12, String str2, String str3, GenericTypeToken.Resolution.a aVar, Map map, List list, a aVar2) {
                    this.f418624d = i12;
                    this.f418623c = str;
                    this.f418625e = str2;
                    this.f418626f = str3;
                    this.f418627g = aVar;
                    this.f418628h = map;
                    this.f418629i = list;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return d.i(LazyTypeDescription.this.f418454e, this.f418629i);
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return this.f418624d;
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String getName() {
                    return this.f418623c;
                }

                @Override // net.bytebuddy.description.field.a
                public final TypeDescription.Generic getType() {
                    return this.f418627g.h(this.f418625e, LazyTypeDescription.this.f418454e, this.f418628h, this);
                }

                @Override // net.bytebuddy.description.field.a.AbstractC11971a, net.bytebuddy.description.d.a
                @net.bytebuddy.utility.nullability.b
                public final String h() {
                    return this.f418626f;
                }

                @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return LazyTypeDescription.this;
                }

                @Override // net.bytebuddy.description.field.a.c.AbstractC11972a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return LazyTypeDescription.this;
                }
            }

            public class g extends a.d.AbstractC11975a {

                /* renamed from: c, reason: collision with root package name */
                public final String f418631c;

                /* renamed from: d, reason: collision with root package name */
                public final int f418632d;

                /* renamed from: e, reason: collision with root package name */
                public final String f418633e;

                /* renamed from: f, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418634f;

                /* renamed from: g, reason: collision with root package name */
                public final GenericTypeToken.Resolution.b f418635g;

                /* renamed from: h, reason: collision with root package name */
                public final ArrayList f418636h;

                /* renamed from: i, reason: collision with root package name */
                public final List<String> f418637i;

                /* renamed from: j, reason: collision with root package name */
                public final Map<Integer, Map<String, List<a>>> f418638j;

                /* renamed from: k, reason: collision with root package name */
                public final Map<Integer, Map<Integer, Map<String, List<a>>>> f418639k;

                /* renamed from: l, reason: collision with root package name */
                public final Map<String, List<a>> f418640l;

                /* renamed from: m, reason: collision with root package name */
                public final Map<Integer, Map<String, List<a>>> f418641m;

                /* renamed from: n, reason: collision with root package name */
                public final Map<Integer, Map<String, List<a>>> f418642n;

                /* renamed from: o, reason: collision with root package name */
                public final Map<String, List<a>> f418643o;

                /* renamed from: p, reason: collision with root package name */
                public final List<a> f418644p;

                /* renamed from: q, reason: collision with root package name */
                public final Map<Integer, List<a>> f418645q;

                /* renamed from: r, reason: collision with root package name */
                public final String[] f418646r;

                /* renamed from: s, reason: collision with root package name */
                public final Integer[] f418647s;

                /* renamed from: t, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final AnnotationValue<?, ?> f418648t;

                public class a extends TypeDescription.Generic.d {

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeDescription f418650c;

                    public a(TypeDescription typeDescription) {
                        this.f418650c = typeDescription;
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public final TypeDescription f5() {
                        return this.f418650c;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < this.f418650c.G5(); i12++) {
                            sb2.append('.');
                        }
                        g gVar = g.this;
                        return d.i(LazyTypeDescription.this.f418454e, gVar.f418643o.get(sb2.toString()));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    @net.bytebuddy.utility.nullability.b
                    public final TypeDescription.Generic getOwnerType() {
                        TypeDescription typeDescriptionN = this.f418650c.n();
                        if (typeDescriptionN == null) {
                            return null;
                        }
                        return g.this.new a(typeDescriptionN);
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final /* bridge */ /* synthetic */ TypeDefinition m() {
                        return null;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                    @net.bytebuddy.utility.nullability.b
                    public final TypeDescription.Generic m() {
                        return null;
                    }
                }

                public class b extends c.InterfaceC11982c.a {

                    /* renamed from: c, reason: collision with root package name */
                    public final int f418652c;

                    public b(int i12) {
                        this.f418652c = i12;
                    }

                    @Override // net.bytebuddy.description.method.c
                    public final net.bytebuddy.description.method.a U() {
                        return g.this;
                    }

                    @Override // net.bytebuddy.description.d.c
                    public final boolean g() {
                        return g.this.f418646r[this.f418652c] != null;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        g gVar = g.this;
                        return d.i(LazyTypeDescription.this.f418454e, gVar.f418645q.get(Integer.valueOf(this.f418652c)));
                    }

                    @Override // net.bytebuddy.description.method.c
                    public final int getIndex() {
                        return this.f418652c;
                    }

                    @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.c
                    public final int getModifiers() {
                        if (t()) {
                            return g.this.f418647s[this.f418652c].intValue();
                        }
                        return 0;
                    }

                    @Override // net.bytebuddy.description.method.c.a, net.bytebuddy.description.d.InterfaceC11969d
                    public final String getName() {
                        return g() ? g.this.f418646r[this.f418652c] : super.getName();
                    }

                    @Override // net.bytebuddy.description.method.c
                    public final TypeDescription.Generic getType() {
                        g gVar = g.this;
                        return gVar.f418635g.c(gVar.f418636h, LazyTypeDescription.this.f418454e, gVar.f418641m, gVar).get(this.f418652c);
                    }

                    @Override // net.bytebuddy.description.method.c
                    public final boolean t() {
                        return g.this.f418647s[this.f418652c] != null;
                    }
                }

                public class c extends d.a<c.InterfaceC11982c> {
                    public c(a aVar) {
                    }

                    @Override // net.bytebuddy.description.method.d.a, net.bytebuddy.description.method.d
                    public final boolean U5() {
                        for (int i12 = 0; i12 < size(); i12++) {
                            g gVar = g.this;
                            if (gVar.f418646r[i12] == null || gVar.f418647s[i12] == null) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return g.this.new b(i12);
                    }

                    @Override // net.bytebuddy.description.method.d.a, net.bytebuddy.description.method.d
                    public final d.f p2() {
                        g gVar = g.this;
                        return gVar.f418635g.c(gVar.f418636h, LazyTypeDescription.this.f418454e, gVar.f418641m, gVar);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return g.this.f418636h.size();
                    }
                }

                public class d extends TypeDescription.Generic.OfParameterizedType {

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeDescription f418655c;

                    public class a extends d.f.a {

                        /* renamed from: b, reason: collision with root package name */
                        public final d.f f418657b;

                        /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$g$d$a$a, reason: collision with other inner class name */
                        public class C12122a extends TypeDescription.Generic.e {

                            /* renamed from: c, reason: collision with root package name */
                            public final TypeDescription.Generic f418659c;

                            /* renamed from: d, reason: collision with root package name */
                            public final int f418660d;

                            public C12122a(TypeDescription.Generic generic, int i12) {
                                this.f418659c = generic;
                                this.f418660d = i12;
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final TypeVariableSource A3() {
                                return this.f418659c.A3();
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final String g0() {
                                return this.f418659c.g0();
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                                d dVar = d.this;
                                g gVar = g.this;
                                Default r22 = LazyTypeDescription.this.f418454e;
                                StringBuilder sb2 = new StringBuilder();
                                StringBuilder sb3 = new StringBuilder();
                                for (int i12 = 0; i12 < dVar.f418655c.G5(); i12++) {
                                    sb3.append('.');
                                }
                                sb2.append(sb3.toString());
                                sb2.append(this.f418660d);
                                sb2.append(';');
                                return d.i(r22, gVar.f418643o.get(sb2.toString()));
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final d.f getUpperBounds() {
                                return this.f418659c.getUpperBounds();
                            }
                        }

                        public a(d.f fVar) {
                            this.f418657b = fVar;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public final Object get(int i12) {
                            return new C12122a(this.f418657b.get(i12), i12);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return this.f418657b.size();
                        }
                    }

                    public d(TypeDescription typeDescription) {
                        this.f418655c = typeDescription;
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    public final d.f J() {
                        return new a(this.f418655c.r());
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public final TypeDescription f5() {
                        return this.f418655c;
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        g gVar = g.this;
                        Default r12 = LazyTypeDescription.this.f418454e;
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < this.f418655c.G5(); i12++) {
                            sb2.append('.');
                        }
                        return d.i(r12, gVar.f418643o.get(sb2.toString()));
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic
                    @net.bytebuddy.utility.nullability.b
                    public final TypeDescription.Generic getOwnerType() {
                        TypeDescription typeDescription = this.f418655c;
                        TypeDescription typeDescriptionN = typeDescription.n();
                        if (typeDescriptionN == null) {
                            return null;
                        }
                        boolean zB2 = typeDescription.b();
                        g gVar = g.this;
                        return (zB2 || !typeDescriptionN.Q()) ? gVar.new a(typeDescriptionN) : gVar.new d(typeDescriptionN);
                    }
                }

                public g() {
                    throw null;
                }

                public g(String str, int i12, String str2, String str3, GenericTypeToken.Resolution.b bVar, String[] strArr, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, List list, Map map7, List list2, AnnotationValue annotationValue, a aVar) {
                    this.f418632d = i12;
                    this.f418631c = str;
                    B bO2 = B.o(str2);
                    String strH = bO2.h();
                    B bW2 = B.w(B.r(strH), strH.length(), strH);
                    B[] bArrC = bO2.c();
                    this.f418633e = bW2.h();
                    this.f418636h = new ArrayList(bArrC.length);
                    int i13 = 0;
                    for (B b12 : bArrC) {
                        this.f418636h.add(b12.h());
                    }
                    this.f418634f = str3;
                    this.f418635g = bVar;
                    if (strArr == null) {
                        this.f418637i = Collections.emptyList();
                    } else {
                        this.f418637i = new ArrayList(strArr.length);
                        for (String str4 : strArr) {
                            this.f418637i.add(B.p(str4).h());
                        }
                    }
                    this.f418638j = map;
                    this.f418639k = map2;
                    this.f418640l = map3;
                    this.f418641m = map4;
                    this.f418642n = map5;
                    this.f418643o = map6;
                    this.f418644p = list;
                    this.f418645q = map7;
                    this.f418646r = new String[bArrC.length];
                    this.f418647s = new Integer[bArrC.length];
                    if (list2.size() == bArrC.length) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            l.a aVar2 = (l.a) it.next();
                            this.f418646r[i13] = aVar2.f418692a;
                            this.f418647s[i13] = aVar2.f418693b;
                            i13++;
                        }
                    }
                    this.f418648t = annotationValue;
                }

                @Override // net.bytebuddy.description.method.a
                public final d.f N() {
                    return this.f418635g.f(this.f418637i, LazyTypeDescription.this.f418454e, this.f418642n, this);
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String V() {
                    return this.f418631c;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return d.h(LazyTypeDescription.this.f418454e, this.f418644p);
                }

                @Override // net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.b
                public final AnnotationValue<?, ?> getDefaultValue() {
                    return this.f418648t;
                }

                @Override // net.bytebuddy.description.c
                public final int getModifiers() {
                    return this.f418632d;
                }

                @Override // net.bytebuddy.description.method.a
                public final net.bytebuddy.description.method.d<c.InterfaceC11982c> getParameters() {
                    return new c(null);
                }

                @Override // net.bytebuddy.description.method.a
                public final TypeDescription.Generic getReturnType() {
                    return this.f418635g.e(this.f418633e, LazyTypeDescription.this.f418454e, this.f418640l, this);
                }

                @Override // net.bytebuddy.description.method.a.AbstractC11974a, net.bytebuddy.description.d.a
                @net.bytebuddy.utility.nullability.b
                public final String h() {
                    return this.f418634f;
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.method.a
                @net.bytebuddy.utility.nullability.b
                public final TypeDescription.Generic l() {
                    if (b()) {
                        TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                        return null;
                    }
                    boolean zV02 = v0();
                    LazyTypeDescription lazyTypeDescription = LazyTypeDescription.this;
                    if (!zV02) {
                        return lazyTypeDescription.Q() ? new d(lazyTypeDescription) : new a(lazyTypeDescription);
                    }
                    TypeDescription typeDescriptionH5 = lazyTypeDescription.H5();
                    return typeDescriptionH5 == null ? lazyTypeDescription.Q() ? new d(lazyTypeDescription) : new a(lazyTypeDescription) : (lazyTypeDescription.b() || !lazyTypeDescription.Q()) ? new a(typeDescriptionH5) : new d(typeDescriptionH5);
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return LazyTypeDescription.this;
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public final d.f r() {
                    return this.f418635g.a(LazyTypeDescription.this.f418454e, this, this.f418638j, this.f418639k);
                }

                @Override // net.bytebuddy.description.method.a.d.AbstractC11975a, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDescription n() {
                    return LazyTypeDescription.this;
                }
            }

            public static class h extends d.b {

                /* renamed from: b, reason: collision with root package name */
                public final LazyTypeDescription f418662b;

                /* renamed from: c, reason: collision with root package name */
                public final Default f418663c;

                /* renamed from: d, reason: collision with root package name */
                public final ArrayList f418664d;

                public h(LazyTypeDescription lazyTypeDescription, Default r22, ArrayList arrayList) {
                    this.f418662b = lazyTypeDescription;
                    this.f418663c = r22;
                    this.f418664d = arrayList;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    if (i12 == 0) {
                        return this.f418662b;
                    }
                    return this.f418663c.a((String) this.f418664d.get(i12 - 1)).a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return this.f418664d.size() + 1;
                }

                @Override // net.bytebuddy.description.type.d.b, net.bytebuddy.description.type.d
                public final String[] t1() {
                    ArrayList arrayList = this.f418664d;
                    int i12 = 1;
                    String[] strArr = new String[arrayList.size() + 1];
                    strArr[0] = this.f418662b.V();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        strArr[i12] = ((String) it.next()).replace('.', '/');
                        i12++;
                    }
                    return strArr;
                }
            }

            public static class i extends a.AbstractC11998a {

                /* renamed from: b, reason: collision with root package name */
                public final TypePool f418665b;

                /* renamed from: c, reason: collision with root package name */
                public final String f418666c;

                public i(TypePool typePool, String str, a aVar) {
                    this.f418665b = typePool;
                    this.f418666c = str;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    Resolution resolutionA = this.f418665b.a(AK.c.s(new StringBuilder(), this.f418666c, ".package-info"));
                    return resolutionA.b() ? resolutionA.a().getDeclaredAnnotations() : new a.b();
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String getName() {
                    return this.f418666c;
                }
            }

            public class j extends b.c.a {

                /* renamed from: b, reason: collision with root package name */
                public final String f418667b;

                /* renamed from: c, reason: collision with root package name */
                public final String f418668c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418669d;

                /* renamed from: e, reason: collision with root package name */
                public final GenericTypeToken.Resolution.c f418670e;

                /* renamed from: f, reason: collision with root package name */
                public final Map<String, List<a>> f418671f;

                /* renamed from: g, reason: collision with root package name */
                public final List<a> f418672g;

                public j() {
                    throw null;
                }

                public j(String str, String str2, String str3, GenericTypeToken.Resolution.c cVar, Map map, List list, a aVar) {
                    this.f418667b = str;
                    this.f418668c = str2;
                    this.f418669d = str3;
                    this.f418670e = cVar;
                    this.f418671f = map;
                    this.f418672g = list;
                }

                @Override // net.bytebuddy.description.d
                public final String R() {
                    return this.f418667b;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return d.h(LazyTypeDescription.this.f418454e, this.f418672g);
                }

                @Override // net.bytebuddy.description.type.b
                public final TypeDescription.Generic getType() {
                    return this.f418670e.d(this.f418668c, LazyTypeDescription.this.f418454e, this.f418671f, this);
                }

                @Override // net.bytebuddy.description.type.b.a, net.bytebuddy.description.d.a
                @net.bytebuddy.utility.nullability.b
                public final String h() {
                    return this.f418669d;
                }

                @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
                @I41.g
                public final TypeDefinition n() {
                    return LazyTypeDescription.this;
                }
            }

            public static class k extends d.b {

                /* renamed from: b, reason: collision with root package name */
                public final TypePool f418674b;

                /* renamed from: c, reason: collision with root package name */
                public final List<String> f418675c;

                public k(TypePool typePool, List<String> list) {
                    this.f418674b = typePool;
                    this.f418675c = list;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    return p.A0(this.f418674b, this.f418675c.get(i12));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return this.f418675c.size();
                }

                @Override // net.bytebuddy.description.type.d.b, net.bytebuddy.description.type.d
                @net.bytebuddy.utility.nullability.b
                public final String[] t1() {
                    List<String> list = this.f418675c;
                    int size = list.size();
                    String[] strArr = new String[size];
                    Iterator<String> it = list.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        strArr[i12] = B.v(it.next()).k();
                        i12++;
                    }
                    if (size == 0) {
                        return null;
                    }
                    return strArr;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class l {

                /* renamed from: a, reason: collision with root package name */
                public final String f418676a;

                /* renamed from: b, reason: collision with root package name */
                public final int f418677b;

                /* renamed from: c, reason: collision with root package name */
                public final String f418678c;

                /* renamed from: d, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final String f418679d;

                /* renamed from: e, reason: collision with root package name */
                public final GenericTypeToken.Resolution.b f418680e;

                /* renamed from: f, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String[] f418681f;

                /* renamed from: g, reason: collision with root package name */
                public final HashMap f418682g;

                /* renamed from: h, reason: collision with root package name */
                public final HashMap f418683h;

                /* renamed from: i, reason: collision with root package name */
                public final HashMap f418684i;

                /* renamed from: j, reason: collision with root package name */
                public final HashMap f418685j;

                /* renamed from: k, reason: collision with root package name */
                public final HashMap f418686k;

                /* renamed from: l, reason: collision with root package name */
                public final HashMap f418687l;

                /* renamed from: m, reason: collision with root package name */
                public final ArrayList f418688m;

                /* renamed from: n, reason: collision with root package name */
                public final HashMap f418689n;

                /* renamed from: o, reason: collision with root package name */
                public final ArrayList f418690o;

                /* renamed from: p, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final AnnotationValue.b f418691p;

                @HashCodeAndEqualsPlugin.Enhance
                public static class a {

                    /* renamed from: a, reason: collision with root package name */
                    @HashCodeAndEqualsPlugin.ValueHandling
                    @net.bytebuddy.utility.nullability.b
                    public final String f418692a;

                    /* renamed from: b, reason: collision with root package name */
                    @HashCodeAndEqualsPlugin.ValueHandling
                    @net.bytebuddy.utility.nullability.b
                    public final Integer f418693b;

                    public a() {
                        this(null, null);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                    
                        if (r2 != null) goto L18;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                        /*
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$l$a r5 = (net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.l.a) r5
                            java.lang.Integer r2 = r4.f418693b
                            java.lang.Integer r3 = r5.f418693b
                            if (r3 == 0) goto L24
                            if (r2 == 0) goto L26
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L24:
                            if (r2 == 0) goto L27
                        L26:
                            return r1
                        L27:
                            java.lang.String r2 = r4.f418692a
                            java.lang.String r5 = r5.f418692a
                            if (r5 == 0) goto L36
                            if (r2 == 0) goto L38
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L39
                            return r1
                        L36:
                            if (r2 == 0) goto L39
                        L38:
                            return r1
                        L39:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.l.a.equals(java.lang.Object):boolean");
                    }

                    public final int hashCode() {
                        int iHashCode = getClass().hashCode() * 31;
                        String str = this.f418692a;
                        if (str != null) {
                            iHashCode += str.hashCode();
                        }
                        int i12 = iHashCode * 31;
                        Integer num = this.f418693b;
                        return num != null ? i12 + num.hashCode() : i12;
                    }

                    public a(@net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b Integer num) {
                        this.f418692a = str;
                        this.f418693b = num;
                    }
                }

                public l(String str, int i12, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr, HashMap map, HashMap map2, HashMap map3, HashMap map4, HashMap map5, HashMap map6, ArrayList arrayList, HashMap map7, ArrayList arrayList2, @net.bytebuddy.utility.nullability.b AnnotationValue.b bVar) {
                    this.f418677b = (-131073) & i12;
                    this.f418676a = str;
                    this.f418678c = str2;
                    this.f418679d = str3;
                    boolean z12 = TypeDescription.b.f416496c;
                    GenericTypeToken.Resolution.b.a aVar = GenericTypeToken.Resolution.Raw.f418498b;
                    if (!z12 && str3 != null) {
                        try {
                            b.a.C12132b c12132b = new b.a.C12132b();
                            new C26948a(str3).a(c12132b);
                            aVar = new GenericTypeToken.Resolution.b.a(c12132b.f418746f, c12132b.f418744d, c12132b.f418745e, c12132b.f418740a);
                        } catch (RuntimeException unused) {
                            aVar = GenericTypeToken.Resolution.Malformed.f418496b;
                        }
                    }
                    this.f418680e = aVar;
                    this.f418681f = strArr;
                    this.f418682g = map;
                    this.f418683h = map2;
                    this.f418684i = map3;
                    this.f418685j = map4;
                    this.f418686k = map5;
                    this.f418687l = map6;
                    this.f418688m = arrayList;
                    this.f418689n = map7;
                    this.f418690o = arrayList2;
                    this.f418691p = bVar;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    l lVar = (l) obj;
                    return this.f418677b == lVar.f418677b && this.f418676a.equals(lVar.f418676a) && this.f418678c.equals(lVar.f418678c) && this.f418679d.equals(lVar.f418679d) && this.f418680e.equals(lVar.f418680e) && Arrays.equals(this.f418681f, lVar.f418681f) && this.f418682g.equals(lVar.f418682g) && this.f418683h.equals(lVar.f418683h) && this.f418684i.equals(lVar.f418684i) && this.f418685j.equals(lVar.f418685j) && this.f418686k.equals(lVar.f418686k) && this.f418687l.equals(lVar.f418687l) && this.f418688m.equals(lVar.f418688m) && this.f418689n.equals(lVar.f418689n) && this.f418690o.equals(lVar.f418690o) && this.f418691p.equals(lVar.f418691p);
                }

                public final int hashCode() {
                    return this.f418691p.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418690o, (this.f418689n.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418688m, (this.f418687l.hashCode() + ((this.f418686k.hashCode() + ((this.f418685j.hashCode() + ((this.f418684i.hashCode() + ((this.f418683h.hashCode() + ((this.f418682g.hashCode() + ((((this.f418680e.hashCode() + H.d(H.d((H.d(getClass().hashCode() * 31, 31, this.f418676a) + this.f418677b) * 31, 31, this.f418678c), 31, this.f418679d)) * 31) + Arrays.hashCode(this.f418681f)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31, 31);
                }
            }

            public class m extends b.a<a.d> {
                public m() {
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    LazyTypeDescription lazyTypeDescription = LazyTypeDescription.this;
                    l lVar = (l) lazyTypeDescription.f418474y.get(i12);
                    lVar.getClass();
                    HashMap map = lVar.f418689n;
                    return lazyTypeDescription.new g(lVar.f418676a, lVar.f418677b, lVar.f418678c, lVar.f418679d, lVar.f418680e, lVar.f418681f, lVar.f418682g, lVar.f418683h, lVar.f418684i, lVar.f418685j, lVar.f418686k, lVar.f418687l, lVar.f418688m, map, lVar.f418690o, lVar.f418691p, null);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return LazyTypeDescription.this.f418474y.size();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class n {

                /* renamed from: a, reason: collision with root package name */
                public final String f418695a;

                /* renamed from: b, reason: collision with root package name */
                public final String f418696b;

                /* renamed from: c, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.d
                public final String f418697c;

                /* renamed from: d, reason: collision with root package name */
                public final GenericTypeToken.Resolution.c f418698d;

                /* renamed from: e, reason: collision with root package name */
                public final HashMap f418699e;

                /* renamed from: f, reason: collision with root package name */
                public final ArrayList f418700f;

                public n(String str, String str2, @net.bytebuddy.utility.nullability.b String str3, HashMap map, ArrayList arrayList) {
                    this.f418695a = str;
                    this.f418696b = str2;
                    this.f418697c = str3;
                    boolean z12 = TypeDescription.b.f416496c;
                    GenericTypeToken.Resolution.c aVar = GenericTypeToken.Resolution.Raw.f418498b;
                    if (!z12 && str3 != null) {
                        b.a.c cVar = new b.a.c();
                        try {
                            C26948a.b(str3, 0, new b(cVar));
                            aVar = new GenericTypeToken.Resolution.c.a(cVar.f418750a);
                        } catch (RuntimeException unused) {
                            aVar = GenericTypeToken.Resolution.Malformed.f418496b;
                        }
                    }
                    this.f418698d = aVar;
                    this.f418699e = map;
                    this.f418700f = arrayList;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    n nVar = (n) obj;
                    return this.f418695a.equals(nVar.f418695a) && this.f418696b.equals(nVar.f418696b) && this.f418697c.equals(nVar.f418697c) && this.f418698d.equals(nVar.f418698d) && this.f418699e.equals(nVar.f418699e) && this.f418700f.equals(nVar.f418700f);
                }

                public final int hashCode() {
                    return this.f418700f.hashCode() + ((this.f418699e.hashCode() + ((this.f418698d.hashCode() + H.d(H.d(H.d(getClass().hashCode() * 31, 31, this.f418695a), 31, this.f418696b), 31, this.f418697c)) * 31)) * 31);
                }
            }

            public class o extends c.a<b.c> {
                public o() {
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i12) {
                    LazyTypeDescription lazyTypeDescription = LazyTypeDescription.this;
                    n nVar = (n) lazyTypeDescription.f418475z.get(i12);
                    nVar.getClass();
                    return lazyTypeDescription.new j(nVar.f418695a, nVar.f418696b, nVar.f418697c, nVar.f418698d, nVar.f418699e, nVar.f418700f, null);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return LazyTypeDescription.this.f418475z.size();
                }
            }

            public static class p extends TypeDescription.Generic.b.g {

                /* renamed from: c, reason: collision with root package name */
                public final TypePool f418702c;

                /* renamed from: d, reason: collision with root package name */
                public final GenericTypeToken f418703d;

                /* renamed from: e, reason: collision with root package name */
                public final String f418704e;

                /* renamed from: f, reason: collision with root package name */
                public final Map<String, List<a>> f418705f;

                /* renamed from: g, reason: collision with root package name */
                public final TypeVariableSource f418706g;

                /* renamed from: h, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription.Generic f418707h;

                /* renamed from: i, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription f418708i;

                public static class a extends TypeDescription.Generic.b.g {

                    /* renamed from: c, reason: collision with root package name */
                    public final Default f418709c;

                    /* renamed from: d, reason: collision with root package name */
                    public final String f418710d;

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$p$a$a, reason: collision with other inner class name */
                    public static class C12123a extends d.f.a {

                        /* renamed from: b, reason: collision with root package name */
                        public final Default f418711b;

                        /* renamed from: c, reason: collision with root package name */
                        public final List<String> f418712c;

                        public C12123a(Default r12, List list) {
                            this.f418711b = r12;
                            this.f418712c = list;
                        }

                        @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
                        public final net.bytebuddy.description.type.d f1() {
                            return new k(this.f418711b, this.f418712c);
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public final Object get(int i12) {
                            return new a(this.f418711b, this.f418712c.get(i12));
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return this.f418712c.size();
                        }
                    }

                    public a(Default r12, String str) {
                        this.f418709c = r12;
                        this.f418710d = str;
                    }

                    @Override // net.bytebuddy.description.type.TypeDefinition
                    public final TypeDescription f5() {
                        return p.A0(this.f418709c, this.f418710d);
                    }

                    @Override // net.bytebuddy.description.annotation.AnnotationSource
                    public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                        throw new GenericSignatureFormatError();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                    public final TypeDescription.Generic y0() {
                        throw new GenericSignatureFormatError();
                    }
                }

                public static class b extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418713b;

                    /* renamed from: c, reason: collision with root package name */
                    public final List<GenericTypeToken> f418714c;

                    /* renamed from: d, reason: collision with root package name */
                    public final List<String> f418715d;

                    /* renamed from: e, reason: collision with root package name */
                    public final TypeVariableSource f418716e;

                    /* renamed from: f, reason: collision with root package name */
                    public final Map<Integer, Map<String, List<a>>> f418717f;

                    public b() {
                        throw null;
                    }

                    public b(TypePool typePool, List list, Map map, List list2, TypeVariableSource typeVariableSource, a aVar) {
                        this.f418713b = typePool;
                        this.f418714c = list;
                        this.f418717f = map;
                        this.f418715d = list2;
                        this.f418716e = typeVariableSource;
                    }

                    @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
                    public final net.bytebuddy.description.type.d f1() {
                        return new k(this.f418713b, this.f418715d);
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        List<String> list = this.f418715d;
                        int size = list.size();
                        List<GenericTypeToken> list2 = this.f418714c;
                        int size2 = list2.size();
                        TypePool typePool = this.f418713b;
                        if (size != size2) {
                            return p.A0(typePool, list.get(i12)).P0();
                        }
                        GenericTypeToken genericTypeToken = list2.get(i12);
                        return p.z0(list.get(i12), this.f418717f.get(Integer.valueOf(i12)), this.f418716e, genericTypeToken, typePool);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f418715d.size();
                    }
                }

                public static class c extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final Default f418718b;

                    /* renamed from: c, reason: collision with root package name */
                    public final ArrayList f418719c;

                    /* renamed from: d, reason: collision with root package name */
                    public final TypeVariableSource.a f418720d;

                    /* renamed from: e, reason: collision with root package name */
                    public final Map<Integer, Map<String, List<a>>> f418721e;

                    /* renamed from: f, reason: collision with root package name */
                    public final Map<Integer, Map<Integer, Map<String, List<a>>>> f418722f;

                    public c(Default r12, ArrayList arrayList, TypeVariableSource.a aVar, Map map, Map map2) {
                        this.f418718b = r12;
                        this.f418719c = arrayList;
                        this.f418720d = aVar;
                        this.f418721e = map;
                        this.f418722f = map2;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        GenericTypeToken.h hVar = (GenericTypeToken.h) this.f418719c.get(i12);
                        Map<String, List<a>> map = this.f418721e.get(Integer.valueOf(i12));
                        Map<Integer, Map<String, List<a>>> map2 = this.f418722f.get(Integer.valueOf(i12));
                        return hVar.a(this.f418718b, this.f418720d, map, map2);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f418719c.size();
                    }
                }

                public p(String str, Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                    this.f418702c = typePool;
                    this.f418703d = genericTypeToken;
                    this.f418704e = str;
                    this.f418705f = map;
                    this.f418706g = typeVariableSource;
                }

                public static TypeDescription A0(TypePool typePool, String str) {
                    B bV2 = B.v(str);
                    return typePool.a(bV2.t() == 9 ? bV2.k().replace('/', '.') : bV2.f()).a();
                }

                public static p z0(String str, @net.bytebuddy.utility.nullability.b Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                    if (map == null) {
                        map = Collections.emptyMap();
                    }
                    return new p(str, map, typeVariableSource, genericTypeToken, typePool);
                }

                @Override // net.bytebuddy.description.type.TypeDefinition
                @k.c
                public final TypeDescription f5() {
                    TypeDescription typeDescriptionA0 = this.f418708i != null ? null : A0(this.f418702c, this.f418704e);
                    if (typeDescriptionA0 == null) {
                        return this.f418708i;
                    }
                    this.f418708i = typeDescriptionA0;
                    return typeDescriptionA0;
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                    return y0().getDeclaredAnnotations();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.b
                @k.c
                public final TypeDescription.Generic y0() {
                    TypeDescription.Generic genericA;
                    if (this.f418707h != null) {
                        genericA = null;
                    } else {
                        genericA = this.f418703d.a(this.f418702c, this.f418706g, "", this.f418705f);
                    }
                    if (genericA == null) {
                        return this.f418707h;
                    }
                    this.f418707h = genericA;
                    return genericA;
                }
            }

            public LazyTypeDescription(Default r92, int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String[] strArr, @net.bytebuddy.utility.nullability.b String str3, TypeContainment typeContainment, @net.bytebuddy.utility.nullability.b String str4, ArrayList arrayList, boolean z12, @net.bytebuddy.utility.nullability.b String str5, ArrayList arrayList2, Map map, HashMap map2, HashMap map3, HashMap map4, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7) {
                this.f418454e = r92;
                this.f418455f = i12 & (-33);
                this.f418456g = (-131105) & i13;
                this.f418457h = B.p(str).f();
                this.f418458i = str2 == null ? null : B.p(str2).h();
                this.f418459j = str3;
                GenericTypeToken.Resolution.d.a aVar = GenericTypeToken.Resolution.Raw.f418498b;
                if (!TypeDescription.b.f416496c && str3 != null) {
                    try {
                        b.a.d dVar = new b.a.d();
                        new C26948a(str3).a(dVar);
                        aVar = new GenericTypeToken.Resolution.d.a(dVar.f418752e, dVar.f418751d, dVar.f418740a);
                    } catch (RuntimeException unused) {
                        aVar = GenericTypeToken.Resolution.Malformed.f418496b;
                    }
                }
                this.f418460k = aVar;
                if (strArr == null) {
                    this.f418461l = Collections.emptyList();
                } else {
                    this.f418461l = new ArrayList(strArr.length);
                    for (String str6 : strArr) {
                        this.f418461l.add(B.p(str6).h());
                    }
                }
                this.f418462m = typeContainment;
                this.f418463n = str4 == null ? null : str4.replace('/', '.');
                this.f418464o = arrayList;
                this.f418465p = z12;
                this.f418466q = str5 != null ? B.p(str5).f() : null;
                this.f418467r = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.f418467r.add(B.p((String) it.next()).f());
                }
                this.f418468s = map;
                this.f418469t = map2;
                this.f418470u = map3;
                this.f418471v = map4;
                this.f418472w = arrayList3;
                this.f418473x = arrayList4;
                this.f418474y = arrayList5;
                this.f418475z = arrayList6;
                this.f418453A = new ArrayList(arrayList7.size());
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    this.f418453A.add(B.p((String) it2.next()).h());
                }
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final boolean A() {
                return (this.f418455f & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 && JavaType.f418908l.f418912b.getDescriptor().equals(this.f418458i);
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final net.bytebuddy.description.type.d A2() {
                return new k(this.f418454e, this.f418453A);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
            public final boolean B() {
                return !this.f418453A.isEmpty();
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            @net.bytebuddy.utility.nullability.b
            public final TypeDescription.Generic C3() {
                String str = this.f418458i;
                if (str == null || x0(512)) {
                    TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
                    return null;
                }
                return this.f418460k.b(str, this.f418454e, this.f418468s, this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final boolean D5() {
                return this.f418465p;
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final TypeDescription G() {
                String str = this.f418466q;
                return str == null ? this : this.f418454e.a(str).a();
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final boolean H() {
                return !this.f418465p && this.f418462m.H();
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.b
            public final TypeDescription H5() {
                return this.f418462m.b(this.f418454e);
            }

            @Override // net.bytebuddy.description.type.TypeDefinition
            public final d.f J0() {
                return this.f418460k.i(this.f418461l, this.f418454e, this.f418469t, this);
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final net.bytebuddy.description.type.d J2() {
                return new k(this.f418454e, this.f418464o);
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final net.bytebuddy.description.type.d L() {
                Default r02 = this.f418454e;
                String str = this.f418466q;
                return str == null ? new h(this, r02, this.f418467r) : r02.a(str).a().L();
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.b
            public final a.d e3() {
                return this.f418462m.a(this.f418454e);
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription
            public final int f(boolean z12) {
                int i12 = this.f418455f;
                return z12 ? i12 | 32 : i12;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                return d.h(this.f418454e, this.f418472w);
            }

            @Override // net.bytebuddy.description.c
            public final int getModifiers() {
                return this.f418456g;
            }

            @Override // net.bytebuddy.description.d.InterfaceC11969d
            public final String getName() {
                return this.f418457h;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.d.a
            @net.bytebuddy.utility.nullability.b
            public final String h() {
                return this.f418459j;
            }

            @Override // net.bytebuddy.description.type.TypeDescription.b, net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
            @net.bytebuddy.utility.nullability.b
            public final TypeDescription n() {
                String str = this.f418463n;
                if (str == null) {
                    return null;
                }
                return this.f418454e.a(str).a();
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.method.b<a.d> q() {
                return new m();
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public final d.f r() {
                return this.f418460k.a(this.f418454e, this, this.f418470u, this.f418471v);
            }

            @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
            public final net.bytebuddy.description.field.b<a.c> x() {
                return new c();
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            @net.bytebuddy.utility.nullability.b
            public final net.bytebuddy.description.type.a y5() {
                String str = this.f418457h;
                int iLastIndexOf = str.lastIndexOf(46);
                return new i(this.f418454e, iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf), null);
            }

            @Override // net.bytebuddy.description.type.TypeDescription
            public final net.bytebuddy.description.type.c<b.c> z() {
                return new o();
            }

            public interface GenericTypeToken {

                public enum ForPrimitiveType implements GenericTypeToken {
                    BOOLEAN(Boolean.TYPE),
                    BYTE(Byte.TYPE),
                    SHORT(Short.TYPE),
                    CHAR(Character.TYPE),
                    INTEGER(Integer.TYPE),
                    LONG(Long.TYPE),
                    FLOAT(Float.TYPE),
                    DOUBLE(Double.TYPE),
                    VOID(Void.TYPE);


                    /* renamed from: b, reason: collision with root package name */
                    public final TypeDescription f418486b;

                    public static class a extends TypeDescription.Generic.d {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418487c;

                        /* renamed from: d, reason: collision with root package name */
                        public final String f418488d;

                        /* renamed from: e, reason: collision with root package name */
                        public final Map<String, List<a>> f418489e;

                        /* renamed from: f, reason: collision with root package name */
                        public final TypeDescription f418490f;

                        public a(TypePool typePool, String str, Map<String, List<a>> map, TypeDescription typeDescription) {
                            this.f418487c = typePool;
                            this.f418488d = str;
                            this.f418489e = map;
                            this.f418490f = typeDescription;
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        public final TypeDescription f5() {
                            return this.f418490f;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418487c, this.f418489e.get(this.f418488d));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        @net.bytebuddy.utility.nullability.b
                        public final TypeDescription.Generic getOwnerType() {
                            return null;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                        @net.bytebuddy.utility.nullability.b
                        public final /* bridge */ /* synthetic */ TypeDefinition m() {
                            return null;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                        @net.bytebuddy.utility.nullability.b
                        public final TypeDescription.Generic m() {
                            return null;
                        }
                    }

                    ForPrimitiveType(Class cls) {
                        this.f418486b = TypeDescription.d.A0(cls);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new a(typePool, str, map, this.f418486b);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r32) {
                        throw new IllegalStateException("A primitive type cannot be a type variable bound: " + this);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("A primitive type cannot be the owner of a nested type: " + this);
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class ForUnboundWildcard implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public static final ForUnboundWildcard f418491b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final /* synthetic */ ForUnboundWildcard[] f418492c;

                    public static class a extends TypeDescription.Generic.f {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418493c;

                        /* renamed from: d, reason: collision with root package name */
                        public final String f418494d;

                        /* renamed from: e, reason: collision with root package name */
                        public final Map<String, List<a>> f418495e;

                        public a(TypePool typePool, String str, Map<String, List<a>> map) {
                            this.f418493c = typePool;
                            this.f418494d = str;
                            this.f418495e = map;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418493c, this.f418495e.get(this.f418494d));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getLowerBounds() {
                            return new d.f.b();
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            return new d.f.c(TypeDescription.Generic.f416323x2);
                        }
                    }

                    static {
                        ForUnboundWildcard forUnboundWildcard = new ForUnboundWildcard("INSTANCE", 0);
                        f418491b = forUnboundWildcard;
                        f418492c = new ForUnboundWildcard[]{forUnboundWildcard};
                    }

                    public ForUnboundWildcard() {
                        throw null;
                    }

                    public static ForUnboundWildcard valueOf(String str) {
                        return (ForUnboundWildcard) Enum.valueOf(ForUnboundWildcard.class, str);
                    }

                    public static ForUnboundWildcard[] values() {
                        return (ForUnboundWildcard[]) f418492c.clone();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, @net.bytebuddy.utility.nullability.b Map<String, List<a>> map) {
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        return new a(typePool, str, map);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r32) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("An unbound wildcard cannot be the owner of a nested type: " + this);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class a implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final GenericTypeToken f418516b;

                    /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$a$a, reason: collision with other inner class name */
                    public static class C12117a extends TypeDescription.Generic.c {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418517c;

                        /* renamed from: d, reason: collision with root package name */
                        public final TypeVariableSource f418518d;

                        /* renamed from: e, reason: collision with root package name */
                        public final String f418519e;

                        /* renamed from: f, reason: collision with root package name */
                        public final Map<String, List<a>> f418520f;

                        /* renamed from: g, reason: collision with root package name */
                        public final GenericTypeToken f418521g;

                        public C12117a(String str, Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                            this.f418517c = typePool;
                            this.f418518d = typeVariableSource;
                            this.f418519e = str;
                            this.f418520f = map;
                            this.f418521g = genericTypeToken;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418517c, this.f418520f.get(this.f418519e));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                        public final TypeDescription.Generic m() {
                            String strC = C22026a.c(new StringBuilder(), this.f418519e, '[');
                            return this.f418521g.a(this.f418517c, this.f418518d, strC, this.f418520f);
                        }
                    }

                    public a(GenericTypeToken genericTypeToken) {
                        this.f418516b = genericTypeToken;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new C12117a(str, map, typeVariableSource, this.f418516b, typePool);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r32) {
                        throw new IllegalStateException("A generic array type cannot be a type variable bound: " + this);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("A generic array type cannot be the owner of a nested type: " + this);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418516b.equals(((a) obj).f418516b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f418516b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final GenericTypeToken f418522b;

                    public static class a extends TypeDescription.Generic.f {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418523c;

                        /* renamed from: d, reason: collision with root package name */
                        public final TypeVariableSource f418524d;

                        /* renamed from: e, reason: collision with root package name */
                        public final String f418525e;

                        /* renamed from: f, reason: collision with root package name */
                        public final Map<String, List<a>> f418526f;

                        /* renamed from: g, reason: collision with root package name */
                        public final GenericTypeToken f418527g;

                        public a(String str, Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                            this.f418523c = typePool;
                            this.f418524d = typeVariableSource;
                            this.f418525e = str;
                            this.f418526f = map;
                            this.f418527g = genericTypeToken;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418523c, this.f418526f.get(this.f418525e));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getLowerBounds() {
                            Map<String, List<a>> map = this.f418526f;
                            GenericTypeToken genericTypeToken = this.f418527g;
                            TypePool typePool = this.f418523c;
                            return new g.a(this.f418525e, map, this.f418524d, genericTypeToken, typePool);
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            return new d.f.c(TypeDescription.Generic.f416323x2);
                        }
                    }

                    public b(GenericTypeToken genericTypeToken) {
                        this.f418522b = genericTypeToken;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new a(str, map, typeVariableSource, this.f418522b, typePool);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r32) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("A lower bound wildcard cannot be the owner of a nested type: " + this);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418522b.equals(((b) obj).f418522b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f418522b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418528b;

                    /* renamed from: c, reason: collision with root package name */
                    public final ArrayList f418529c;

                    public static class a extends TypeDescription.Generic.OfParameterizedType {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418530c;

                        /* renamed from: d, reason: collision with root package name */
                        public final TypeVariableSource f418531d;

                        /* renamed from: e, reason: collision with root package name */
                        public final String f418532e;

                        /* renamed from: f, reason: collision with root package name */
                        public final Map<String, List<a>> f418533f;

                        /* renamed from: g, reason: collision with root package name */
                        public final String f418534g;

                        /* renamed from: h, reason: collision with root package name */
                        public final ArrayList f418535h;

                        public a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map map, String str2, ArrayList arrayList) {
                            this.f418530c = typePool;
                            this.f418531d = typeVariableSource;
                            this.f418532e = str;
                            this.f418533f = map;
                            this.f418534g = str2;
                            this.f418535h = arrayList;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f J() {
                            ArrayList arrayList = this.f418535h;
                            return new g(this.f418530c, this.f418531d, this.f418532e, this.f418533f, arrayList);
                        }

                        @Override // net.bytebuddy.description.type.TypeDefinition
                        public final TypeDescription f5() {
                            return this.f418530c.a(this.f418534g).a();
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418530c, this.f418533f.get(this.f418532e));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        @net.bytebuddy.utility.nullability.b
                        public final TypeDescription.Generic getOwnerType() {
                            TypeDescription typeDescriptionH5 = this.f418530c.a(this.f418534g).a().H5();
                            if (typeDescriptionH5 == null) {
                                return null;
                            }
                            return typeDescriptionH5.P0();
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class b implements GenericTypeToken {

                        /* renamed from: b, reason: collision with root package name */
                        public final String f418536b;

                        /* renamed from: c, reason: collision with root package name */
                        public final ArrayList f418537c;

                        /* renamed from: d, reason: collision with root package name */
                        public final GenericTypeToken f418538d;

                        public static class a extends TypeDescription.Generic.OfParameterizedType {

                            /* renamed from: c, reason: collision with root package name */
                            public final TypePool f418539c;

                            /* renamed from: d, reason: collision with root package name */
                            public final TypeVariableSource f418540d;

                            /* renamed from: e, reason: collision with root package name */
                            public final String f418541e;

                            /* renamed from: f, reason: collision with root package name */
                            public final Map<String, List<a>> f418542f;

                            /* renamed from: g, reason: collision with root package name */
                            public final String f418543g;

                            /* renamed from: h, reason: collision with root package name */
                            public final ArrayList f418544h;

                            /* renamed from: i, reason: collision with root package name */
                            public final GenericTypeToken f418545i;

                            public a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map map, String str2, ArrayList arrayList, GenericTypeToken genericTypeToken) {
                                this.f418539c = typePool;
                                this.f418540d = typeVariableSource;
                                this.f418541e = str;
                                this.f418542f = map;
                                this.f418543g = str2;
                                this.f418544h = arrayList;
                                this.f418545i = genericTypeToken;
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final d.f J() {
                                return new g(this.f418539c, this.f418540d, this.f418541e + this.f418545i.c(), this.f418542f, this.f418544h);
                            }

                            @Override // net.bytebuddy.description.type.TypeDefinition
                            public final TypeDescription f5() {
                                return this.f418539c.a(this.f418543g).a();
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                                return d.i(this.f418539c, this.f418542f.get(this.f418541e + this.f418545i.c()));
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            @net.bytebuddy.utility.nullability.b
                            public final TypeDescription.Generic getOwnerType() {
                                return this.f418545i.a(this.f418539c, this.f418540d, this.f418541e, this.f418542f);
                            }
                        }

                        public b(String str, ArrayList arrayList, GenericTypeToken genericTypeToken) {
                            this.f418536b = str;
                            this.f418537c = arrayList;
                            this.f418538d = genericTypeToken;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                            return new a(typePool, typeVariableSource, str, map, this.f418536b, this.f418537c, this.f418538d);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public final boolean b(Default r22) {
                            return !r22.a(this.f418536b).a().E();
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                        public final String c() {
                            return this.f418538d.c() + '.';
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            b bVar = (b) obj;
                            return this.f418536b.equals(bVar.f418536b) && this.f418537c.equals(bVar.f418537c) && this.f418538d.equals(bVar.f418538d);
                        }

                        public final int hashCode() {
                            return this.f418538d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418537c, H.d(getClass().hashCode() * 31, 31, this.f418536b), 31);
                        }
                    }

                    public c(String str, ArrayList arrayList) {
                        this.f418528b = str;
                        this.f418529c = arrayList;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new a(typePool, typeVariableSource, str, map, this.f418528b, this.f418529c);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r22) {
                        return !r22.a(this.f418528b).a().E();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        return String.valueOf('.');
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        c cVar = (c) obj;
                        return this.f418528b.equals(cVar.f418528b) && this.f418529c.equals(cVar.f418529c);
                    }

                    public final int hashCode() {
                        return this.f418529c.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418528b);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class d implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418546b;

                    public d(String str) {
                        this.f418546b = str;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new Resolution.Raw.a(typePool, str, map, typePool.a(this.f418546b).a());
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r22) {
                        return !r22.a(this.f418546b).a().E();
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("A non-generic type cannot be the owner of a nested type: " + this);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418546b.equals(((d) obj).f418546b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f418546b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class e implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418547b;

                    public static class a extends TypeDescription.Generic.e {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418548c;

                        /* renamed from: d, reason: collision with root package name */
                        public final List<a> f418549d;

                        /* renamed from: e, reason: collision with root package name */
                        public final TypeDescription.Generic f418550e;

                        public a(TypePool typePool, List<a> list, TypeDescription.Generic generic) {
                            this.f418548c = typePool;
                            this.f418549d = list;
                            this.f418550e = generic;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final TypeVariableSource A3() {
                            return this.f418550e.A3();
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final String g0() {
                            return this.f418550e.g0();
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418548c, this.f418549d);
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            return this.f418550e.getUpperBounds();
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class b implements h {

                        /* renamed from: a, reason: collision with root package name */
                        public final String f418551a;

                        /* renamed from: b, reason: collision with root package name */
                        public final ArrayList f418552b;

                        public static class a extends TypeDescription.Generic.e {

                            /* renamed from: c, reason: collision with root package name */
                            public final Default f418553c;

                            /* renamed from: d, reason: collision with root package name */
                            public final TypeVariableSource.a f418554d;

                            /* renamed from: e, reason: collision with root package name */
                            public final Map<String, List<a>> f418555e;

                            /* renamed from: f, reason: collision with root package name */
                            public final Map<Integer, Map<String, List<a>>> f418556f;

                            /* renamed from: g, reason: collision with root package name */
                            public final String f418557g;

                            /* renamed from: h, reason: collision with root package name */
                            public final ArrayList f418558h;

                            /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$e$b$a$a, reason: collision with other inner class name */
                            public static class C12118a extends d.f.a {

                                /* renamed from: b, reason: collision with root package name */
                                public final Default f418559b;

                                /* renamed from: c, reason: collision with root package name */
                                public final TypeVariableSource.a f418560c;

                                /* renamed from: d, reason: collision with root package name */
                                public final Map<Integer, Map<String, List<a>>> f418561d;

                                /* renamed from: e, reason: collision with root package name */
                                public final ArrayList f418562e;

                                public C12118a(Default r12, TypeVariableSource.a aVar, Map map, ArrayList arrayList) {
                                    this.f418559b = r12;
                                    this.f418560c = aVar;
                                    this.f418561d = map;
                                    this.f418562e = arrayList;
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public final Object get(int i12) {
                                    Integer numValueOf = Integer.valueOf(i12);
                                    Map<Integer, Map<String, List<a>>> map = this.f418561d;
                                    boolean zContainsKey = map.containsKey(numValueOf);
                                    ArrayList arrayList = this.f418562e;
                                    Default r32 = this.f418559b;
                                    Map<String, List<a>> mapEmptyMap = (zContainsKey || map.containsKey(Integer.valueOf(i12 + 1))) ? map.get(Integer.valueOf((!((GenericTypeToken) arrayList.get(0)).b(r32) ? 1 : 0) + i12)) : Collections.emptyMap();
                                    GenericTypeToken genericTypeToken = (GenericTypeToken) arrayList.get(i12);
                                    if (mapEmptyMap == null) {
                                        mapEmptyMap = Collections.emptyMap();
                                    }
                                    return genericTypeToken.a(r32, this.f418560c, "", mapEmptyMap);
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public final int size() {
                                    return this.f418562e.size();
                                }
                            }

                            public a(Default r12, TypeVariableSource.a aVar, Map map, Map map2, String str, ArrayList arrayList) {
                                this.f418553c = r12;
                                this.f418554d = aVar;
                                this.f418555e = map;
                                this.f418556f = map2;
                                this.f418557g = str;
                                this.f418558h = arrayList;
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final TypeVariableSource A3() {
                                return this.f418554d;
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final String g0() {
                                return this.f418557g;
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                                return d.i(this.f418553c, this.f418555e.get(""));
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            public final d.f getUpperBounds() {
                                ArrayList arrayList = this.f418558h;
                                return new C12118a(this.f418553c, this.f418554d, this.f418556f, arrayList);
                            }
                        }

                        public b(String str, ArrayList arrayList) {
                            this.f418551a = str;
                            this.f418552b = arrayList;
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.h
                        public final a a(Default r92, TypeVariableSource.a aVar, @net.bytebuddy.utility.nullability.b Map map, @net.bytebuddy.utility.nullability.b Map map2) {
                            if (map == null) {
                                map = Collections.emptyMap();
                            }
                            Map map3 = map;
                            if (map2 == null) {
                                map2 = Collections.emptyMap();
                            }
                            return new a(r92, aVar, map3, map2, this.f418551a, this.f418552b);
                        }

                        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            b bVar = (b) obj;
                            return this.f418551a.equals(bVar.f418551a) && this.f418552b.equals(bVar.f418552b);
                        }

                        public final int hashCode() {
                            return this.f418552b.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418551a);
                        }
                    }

                    public static class c extends TypeDescription.Generic.e {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypeVariableSource f418563c;

                        /* renamed from: d, reason: collision with root package name */
                        public final TypePool f418564d;

                        /* renamed from: e, reason: collision with root package name */
                        public final String f418565e;

                        /* renamed from: f, reason: collision with root package name */
                        public final List<a> f418566f;

                        public c(TypeVariableSource typeVariableSource, TypePool typePool, String str, List<a> list) {
                            this.f418563c = typeVariableSource;
                            this.f418564d = typePool;
                            this.f418565e = str;
                            this.f418566f = list;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final TypeVariableSource A3() {
                            return this.f418563c;
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final String g0() {
                            return this.f418565e;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418564d, this.f418566f);
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            throw new IllegalStateException("Cannot resolve bounds of unresolved type variable " + this + " by " + this.f418563c);
                        }
                    }

                    public e(String str) {
                        this.f418547b = str;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        String str2 = this.f418547b;
                        TypeDescription.Generic genericW0 = typeVariableSource.w0(str2);
                        return genericW0 == null ? new c(typeVariableSource, typePool, str2, map.get(str)) : new a(typePool, map.get(str), genericW0);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r12) {
                        return true;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("A type variable cannot be the owner of a nested type: " + this);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418547b.equals(((e) obj).f418547b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f418547b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class f implements GenericTypeToken {

                    /* renamed from: b, reason: collision with root package name */
                    public final GenericTypeToken f418567b;

                    public static class a extends TypeDescription.Generic.f {

                        /* renamed from: c, reason: collision with root package name */
                        public final TypePool f418568c;

                        /* renamed from: d, reason: collision with root package name */
                        public final TypeVariableSource f418569d;

                        /* renamed from: e, reason: collision with root package name */
                        public final String f418570e;

                        /* renamed from: f, reason: collision with root package name */
                        public final Map<String, List<a>> f418571f;

                        /* renamed from: g, reason: collision with root package name */
                        public final GenericTypeToken f418572g;

                        public a(String str, Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                            this.f418568c = typePool;
                            this.f418569d = typeVariableSource;
                            this.f418570e = str;
                            this.f418571f = map;
                            this.f418572g = genericTypeToken;
                        }

                        @Override // net.bytebuddy.description.annotation.AnnotationSource
                        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                            return d.i(this.f418568c, this.f418571f.get(this.f418570e));
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getLowerBounds() {
                            return new d.f.b();
                        }

                        @Override // net.bytebuddy.description.type.TypeDescription.Generic
                        public final d.f getUpperBounds() {
                            Map<String, List<a>> map = this.f418571f;
                            GenericTypeToken genericTypeToken = this.f418572g;
                            TypePool typePool = this.f418568c;
                            return new g.a(this.f418570e, map, this.f418569d, genericTypeToken, typePool);
                        }
                    }

                    public f(GenericTypeToken genericTypeToken) {
                        this.f418567b = genericTypeToken;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map) {
                        return new a(str, map, typeVariableSource, this.f418567b, typePool);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final boolean b(Default r32) {
                        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken
                    public final String c() {
                        throw new IllegalStateException("An upper bound wildcard cannot be the owner of a nested type: " + this);
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj != null && getClass() == obj.getClass()) {
                            return this.f418567b.equals(((f) obj).f418567b);
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.f418567b.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                public static class g extends d.f.a {

                    /* renamed from: b, reason: collision with root package name */
                    public final TypePool f418573b;

                    /* renamed from: c, reason: collision with root package name */
                    public final TypeVariableSource f418574c;

                    /* renamed from: d, reason: collision with root package name */
                    public final String f418575d;

                    /* renamed from: e, reason: collision with root package name */
                    public final Map<String, List<a>> f418576e;

                    /* renamed from: f, reason: collision with root package name */
                    public final ArrayList f418577f;

                    public static class a extends d.f.a {

                        /* renamed from: b, reason: collision with root package name */
                        public final TypePool f418578b;

                        /* renamed from: c, reason: collision with root package name */
                        public final TypeVariableSource f418579c;

                        /* renamed from: d, reason: collision with root package name */
                        public final String f418580d;

                        /* renamed from: e, reason: collision with root package name */
                        public final Map<String, List<a>> f418581e;

                        /* renamed from: f, reason: collision with root package name */
                        public final GenericTypeToken f418582f;

                        public a(String str, Map map, TypeVariableSource typeVariableSource, GenericTypeToken genericTypeToken, TypePool typePool) {
                            this.f418578b = typePool;
                            this.f418579c = typeVariableSource;
                            this.f418580d = str;
                            this.f418581e = map;
                            this.f418582f = genericTypeToken;
                        }

                        @Override // java.util.AbstractList, java.util.List
                        public final Object get(int i12) {
                            if (i12 != 0) {
                                throw new IndexOutOfBoundsException(AK.c.g(i12, "index = "));
                            }
                            String strC = C22026a.c(new StringBuilder(), this.f418580d, '*');
                            return this.f418582f.a(this.f418578b, this.f418579c, strC, this.f418581e);
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return 1;
                        }
                    }

                    public g(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map map, ArrayList arrayList) {
                        this.f418573b = typePool;
                        this.f418574c = typeVariableSource;
                        this.f418575d = str;
                        this.f418576e = map;
                        this.f418577f = arrayList;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i12) {
                        return ((GenericTypeToken) this.f418577f.get(i12)).a(this.f418573b, this.f418574c, this.f418575d + i12 + ';', this.f418576e);
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return this.f418577f.size();
                    }
                }

                public interface h {
                    e.b.a a(Default r12, TypeVariableSource.a aVar, Map map, Map map2);
                }

                TypeDescription.Generic a(TypePool typePool, TypeVariableSource typeVariableSource, String str, Map<String, List<a>> map);

                boolean b(Default r12);

                String c();

                public interface Resolution {

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class Malformed implements d, a, b, c {

                        /* renamed from: b, reason: collision with root package name */
                        public static final Malformed f418496b;

                        /* renamed from: c, reason: collision with root package name */
                        public static final /* synthetic */ Malformed[] f418497c;

                        static {
                            Malformed malformed = new Malformed("INSTANCE", 0);
                            f418496b = malformed;
                            f418497c = new Malformed[]{malformed};
                        }

                        public Malformed() {
                            throw null;
                        }

                        public static Malformed valueOf(String str) {
                            return (Malformed) Enum.valueOf(Malformed.class, str);
                        }

                        public static Malformed[] values() {
                            return (Malformed[]) f418497c.clone();
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public final d.f a(Default r12, TypeVariableSource typeVariableSource, Map map, Map map2) {
                            throw new GenericSignatureFormatError();
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                        public final TypeDescription.Generic b(String str, Default r22, Map map, LazyTypeDescription lazyTypeDescription) {
                            return new p.a(r22, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final d.f c(ArrayList arrayList, Default r22, Map map, a.d dVar) {
                            return new p.a.C12123a(r22, arrayList);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.c
                        public final TypeDescription.Generic d(String str, Default r22, Map map, b.c cVar) {
                            return new p.a(r22, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final TypeDescription.Generic e(String str, Default r22, Map map, a.d dVar) {
                            return new p.a(r22, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final d.f f(List list, Default r22, Map map, a.d dVar) {
                            return new p.a.C12123a(r22, list);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.a
                        public final TypeDescription.Generic h(String str, Default r22, Map map, a.c cVar) {
                            return new p.a(r22, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                        public final d.f i(List list, Default r22, HashMap map, LazyTypeDescription lazyTypeDescription) {
                            return new p.a.C12123a(r22, list);
                        }
                    }

                    public interface a {

                        @HashCodeAndEqualsPlugin.Enhance
                        /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$a$a, reason: collision with other inner class name */
                        public static class C12116a implements a {

                            /* renamed from: b, reason: collision with root package name */
                            public final GenericTypeToken f418507b;

                            public C12116a(GenericTypeToken genericTypeToken) {
                                this.f418507b = genericTypeToken;
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj != null && getClass() == obj.getClass()) {
                                    return this.f418507b.equals(((C12116a) obj).f418507b);
                                }
                                return false;
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.a
                            public final TypeDescription.Generic h(String str, Default r32, Map map, a.c cVar) {
                                return p.z0(str, map, LazyTypeDescription.this, this.f418507b, r32);
                            }

                            public final int hashCode() {
                                return this.f418507b.hashCode() + (getClass().hashCode() * 31);
                            }
                        }

                        TypeDescription.Generic h(String str, Default r22, Map map, a.c cVar);
                    }

                    public interface b extends Resolution {

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class a implements b {

                            /* renamed from: b, reason: collision with root package name */
                            public final GenericTypeToken f418508b;

                            /* renamed from: c, reason: collision with root package name */
                            public final ArrayList f418509c;

                            /* renamed from: d, reason: collision with root package name */
                            public final ArrayList f418510d;

                            /* renamed from: e, reason: collision with root package name */
                            public final ArrayList f418511e;

                            public a(GenericTypeToken genericTypeToken, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
                                this.f418508b = genericTypeToken;
                                this.f418509c = arrayList;
                                this.f418510d = arrayList2;
                                this.f418511e = arrayList3;
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public final d.f a(Default r82, TypeVariableSource typeVariableSource, Map map, Map map2) {
                                return new p.c(r82, this.f418511e, (TypeVariableSource.a) typeVariableSource, map, map2);
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                            public final d.f c(ArrayList arrayList, Default r102, Map map, a.d dVar) {
                                return new p.b(r102, this.f418509c, map, arrayList, dVar, null);
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                            public final TypeDescription.Generic e(String str, Default r32, Map map, a.d dVar) {
                                return p.z0(str, map, dVar, this.f418508b, r32);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                a aVar = (a) obj;
                                return this.f418508b.equals(aVar.f418508b) && this.f418509c.equals(aVar.f418509c) && this.f418510d.equals(aVar.f418510d) && this.f418511e.equals(aVar.f418511e);
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                            public final d.f f(List list, Default r102, Map map, a.d dVar) {
                                ArrayList arrayList = this.f418510d;
                                if (!arrayList.isEmpty()) {
                                    return new p.b(r102, arrayList, map, list, dVar, null);
                                }
                                if (map == null) {
                                    map = Collections.emptyMap();
                                }
                                return new Raw.a.C12115a(r102, map, list);
                            }

                            public final int hashCode() {
                                return this.f418511e.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418510d, androidx.compose.ui.graphics.colorspace.e.g(this.f418509c, (this.f418508b.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
                            }
                        }

                        d.f c(ArrayList arrayList, Default r22, Map map, a.d dVar);

                        TypeDescription.Generic e(String str, Default r22, Map map, a.d dVar);

                        d.f f(List list, Default r22, Map map, a.d dVar);
                    }

                    public interface c {

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class a implements c {

                            /* renamed from: b, reason: collision with root package name */
                            public final GenericTypeToken f418512b;

                            public a(GenericTypeToken genericTypeToken) {
                                this.f418512b = genericTypeToken;
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.c
                            public final TypeDescription.Generic d(String str, Default r32, Map map, b.c cVar) {
                                return p.z0(str, map, LazyTypeDescription.this, this.f418512b, r32);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj != null && getClass() == obj.getClass()) {
                                    return this.f418512b.equals(((a) obj).f418512b);
                                }
                                return false;
                            }

                            public final int hashCode() {
                                return this.f418512b.hashCode() + (getClass().hashCode() * 31);
                            }
                        }

                        TypeDescription.Generic d(String str, Default r22, Map map, b.c cVar);
                    }

                    public interface d extends Resolution {

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class a implements d {

                            /* renamed from: b, reason: collision with root package name */
                            public final GenericTypeToken f418513b;

                            /* renamed from: c, reason: collision with root package name */
                            public final ArrayList f418514c;

                            /* renamed from: d, reason: collision with root package name */
                            public final ArrayList f418515d;

                            public a(GenericTypeToken genericTypeToken, ArrayList arrayList, ArrayList arrayList2) {
                                this.f418513b = genericTypeToken;
                                this.f418514c = arrayList;
                                this.f418515d = arrayList2;
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                            public final d.f a(Default r82, TypeVariableSource typeVariableSource, Map map, Map map2) {
                                return new p.c(r82, this.f418515d, (TypeVariableSource.a) typeVariableSource, map, map2);
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                            public final TypeDescription.Generic b(String str, Default r32, Map map, LazyTypeDescription lazyTypeDescription) {
                                return p.z0(str, map, lazyTypeDescription, this.f418513b, r32);
                            }

                            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                a aVar = (a) obj;
                                return this.f418513b.equals(aVar.f418513b) && this.f418514c.equals(aVar.f418514c) && this.f418515d.equals(aVar.f418515d);
                            }

                            public final int hashCode() {
                                return this.f418515d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f418514c, (this.f418513b.hashCode() + (getClass().hashCode() * 31)) * 31, 31);
                            }

                            @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                            public final d.f i(List list, Default r102, HashMap map, LazyTypeDescription lazyTypeDescription) {
                                return new p.b(r102, this.f418514c, map, list, lazyTypeDescription, null);
                            }
                        }

                        TypeDescription.Generic b(String str, Default r22, Map map, LazyTypeDescription lazyTypeDescription);

                        d.f i(List list, Default r22, HashMap map, LazyTypeDescription lazyTypeDescription);
                    }

                    d.f a(Default r12, TypeVariableSource typeVariableSource, Map map, Map map2);

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public static final class Raw implements d, a, b, c {

                        /* renamed from: b, reason: collision with root package name */
                        public static final Raw f418498b;

                        /* renamed from: c, reason: collision with root package name */
                        public static final /* synthetic */ Raw[] f418499c;

                        static {
                            Raw raw = new Raw("INSTANCE", 0);
                            f418498b = raw;
                            f418499c = new Raw[]{raw};
                        }

                        public Raw() {
                            throw null;
                        }

                        public static Raw valueOf(String str) {
                            return (Raw) Enum.valueOf(Raw.class, str);
                        }

                        public static Raw[] values() {
                            return (Raw[]) f418499c.clone();
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution
                        public final d.f a(Default r12, TypeVariableSource typeVariableSource, Map map, Map map2) {
                            return new d.f.b();
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                        public final TypeDescription.Generic b(String str, Default r22, Map map, LazyTypeDescription lazyTypeDescription) {
                            return a.y0(r22, map, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final d.f c(ArrayList arrayList, Default r22, Map map, a.d dVar) {
                            if (map == null) {
                                map = Collections.emptyMap();
                            }
                            return new a.C12115a(r22, map, arrayList);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.c
                        public final TypeDescription.Generic d(String str, Default r22, Map map, b.c cVar) {
                            return a.y0(r22, map, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final TypeDescription.Generic e(String str, Default r22, Map map, a.d dVar) {
                            return a.y0(r22, map, str);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.b
                        public final d.f f(List list, Default r22, Map map, a.d dVar) {
                            if (map == null) {
                                map = Collections.emptyMap();
                            }
                            return new a.C12115a(r22, map, list);
                        }

                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.a
                        public final TypeDescription.Generic h(String str, Default r22, Map map, a.c cVar) {
                            return a.y0(r22, map, str);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
                        @Override // net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.Resolution.d
                        public final d.f i(List list, Default r22, HashMap map, LazyTypeDescription lazyTypeDescription) {
                            HashMap mapEmptyMap = map;
                            if (map == null) {
                                mapEmptyMap = Collections.emptyMap();
                            }
                            return new a.C12115a(r22, mapEmptyMap, list);
                        }

                        public static class a extends TypeDescription.Generic.d {

                            /* renamed from: c, reason: collision with root package name */
                            public final TypePool f418500c;

                            /* renamed from: d, reason: collision with root package name */
                            public final String f418501d;

                            /* renamed from: e, reason: collision with root package name */
                            public final Map<String, List<a>> f418502e;

                            /* renamed from: f, reason: collision with root package name */
                            public final TypeDescription f418503f;

                            public a(TypePool typePool, String str, Map<String, List<a>> map, TypeDescription typeDescription) {
                                this.f418500c = typePool;
                                this.f418501d = str;
                                this.f418502e = map;
                                this.f418503f = typeDescription;
                            }

                            public static a y0(Default r22, @net.bytebuddy.utility.nullability.b Map map, String str) {
                                if (map == null) {
                                    map = Collections.emptyMap();
                                }
                                return new a(r22, "", map, p.A0(r22, str));
                            }

                            @Override // net.bytebuddy.description.type.TypeDefinition
                            public final TypeDescription f5() {
                                return this.f418503f;
                            }

                            @Override // net.bytebuddy.description.annotation.AnnotationSource
                            public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
                                StringBuilder sb2 = new StringBuilder(this.f418501d);
                                for (int i12 = 0; i12 < this.f418503f.G5(); i12++) {
                                    sb2.append('.');
                                }
                                return d.i(this.f418500c, this.f418502e.get(sb2.toString()));
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic
                            @net.bytebuddy.utility.nullability.b
                            public final TypeDescription.Generic getOwnerType() {
                                TypeDescription typeDescriptionN = this.f418503f.n();
                                if (typeDescriptionN == null) {
                                    return null;
                                }
                                return new a(this.f418500c, this.f418501d, this.f418502e, typeDescriptionN);
                            }

                            @Override // net.bytebuddy.description.type.TypeDescription.Generic.a, net.bytebuddy.description.type.TypeDefinition
                            @net.bytebuddy.utility.nullability.b
                            public final TypeDescription.Generic m() {
                                TypeDescription typeDescriptionM = this.f418503f.m();
                                if (typeDescriptionM == null) {
                                    return null;
                                }
                                return new a(this.f418500c, C22026a.c(new StringBuilder(), this.f418501d, '['), this.f418502e, typeDescriptionM);
                            }

                            /* renamed from: net.bytebuddy.pool.TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw$a$a, reason: collision with other inner class name */
                            public static class C12115a extends d.f.a {

                                /* renamed from: b, reason: collision with root package name */
                                public final Default f418504b;

                                /* renamed from: c, reason: collision with root package name */
                                public final Map<Integer, Map<String, List<a>>> f418505c;

                                /* renamed from: d, reason: collision with root package name */
                                public final List<String> f418506d;

                                public C12115a(Default r12, Map map, List list) {
                                    this.f418504b = r12;
                                    this.f418505c = map;
                                    this.f418506d = list;
                                }

                                @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
                                public final net.bytebuddy.description.type.d f1() {
                                    return new k(this.f418504b, this.f418506d);
                                }

                                @Override // java.util.AbstractList, java.util.List
                                public final Object get(int i12) {
                                    return a.y0(this.f418504b, this.f418505c.get(Integer.valueOf(i12)), this.f418506d.get(i12));
                                }

                                @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
                                public final int p() {
                                    Iterator<String> it = this.f418506d.iterator();
                                    int iS2 = 0;
                                    while (it.hasNext()) {
                                        iS2 += B.v(it.next()).s();
                                    }
                                    return iS2;
                                }

                                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                                public final int size() {
                                    return this.f418506d.size();
                                }

                                @Override // net.bytebuddy.description.type.d.f.a, net.bytebuddy.description.type.d.f
                                public final d.f N1() {
                                    return this;
                                }
                            }
                        }
                    }
                }
            }
        }

        public class e extends net.bytebuddy.jar.asm.f {

            /* renamed from: d, reason: collision with root package name */
            public final HashMap f418764d;

            /* renamed from: e, reason: collision with root package name */
            public final HashMap f418765e;

            /* renamed from: f, reason: collision with root package name */
            public final HashMap f418766f;

            /* renamed from: g, reason: collision with root package name */
            public final ArrayList f418767g;

            /* renamed from: h, reason: collision with root package name */
            public final ArrayList f418768h;

            /* renamed from: i, reason: collision with root package name */
            public final ArrayList f418769i;

            /* renamed from: j, reason: collision with root package name */
            public final ArrayList f418770j;

            /* renamed from: k, reason: collision with root package name */
            public int f418771k;

            /* renamed from: l, reason: collision with root package name */
            public int f418772l;

            /* renamed from: m, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String f418773m;

            /* renamed from: n, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String f418774n;

            /* renamed from: o, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String f418775o;

            /* renamed from: p, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String[] f418776p;

            /* renamed from: q, reason: collision with root package name */
            public boolean f418777q;

            /* renamed from: r, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String f418778r;

            /* renamed from: s, reason: collision with root package name */
            public final ArrayList f418779s;

            /* renamed from: t, reason: collision with root package name */
            public LazyTypeDescription.TypeContainment f418780t;

            /* renamed from: u, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public String f418781u;

            /* renamed from: v, reason: collision with root package name */
            public final ArrayList f418782v;

            /* renamed from: w, reason: collision with root package name */
            public final ArrayList f418783w;

            /* renamed from: x, reason: collision with root package name */
            @net.bytebuddy.utility.nullability.b
            public ClassFileVersion f418784x;

            public class a extends AbstractC44388a {

                /* renamed from: c, reason: collision with root package name */
                public final a f418786c;

                /* renamed from: d, reason: collision with root package name */
                public final ComponentTypeLocator f418787d;

                /* renamed from: net.bytebuddy.pool.TypePool$Default$e$a$a, reason: collision with other inner class name */
                public class C12141a implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418789b;

                    /* renamed from: c, reason: collision with root package name */
                    public final String f418790c;

                    /* renamed from: d, reason: collision with root package name */
                    public final HashMap f418791d = new HashMap();

                    public C12141a(String str, String str2) {
                        this.f418789b = str;
                        this.f418790c = str2;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a
                    public final void c(String str, AnnotationValue.b bVar) {
                        this.f418791d.put(str, bVar);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a
                    public final void onComplete() {
                        a aVar = a.this;
                        aVar.f418786c.c(this.f418790c, new LazyTypeDescription.e.a(Default.this, new LazyTypeDescription.a(this.f418789b, this.f418791d), null));
                    }
                }

                public class b implements a {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418793b;

                    /* renamed from: c, reason: collision with root package name */
                    public final b.InterfaceC12142b f418794c;

                    /* renamed from: d, reason: collision with root package name */
                    public final ArrayList f418795d = new ArrayList();

                    public b(String str, b.InterfaceC12142b interfaceC12142b, a aVar) {
                        this.f418793b = str;
                        this.f418794c = interfaceC12142b;
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a
                    public final void c(String str, AnnotationValue.b bVar) {
                        this.f418795d.add(bVar);
                    }

                    @Override // net.bytebuddy.pool.TypePool.Default.a
                    public final void onComplete() {
                        a aVar = a.this;
                        aVar.f418786c.c(this.f418793b, new LazyTypeDescription.e.b(Default.this, this.f418794c, this.f418795d, null));
                    }
                }

                public a() {
                    throw null;
                }

                public a(e eVar, String str, ArrayList arrayList, ComponentTypeLocator.a aVar) {
                    this(new a.b(str, arrayList), aVar);
                }

                @Override // net.bytebuddy.jar.asm.AbstractC44388a
                public final void a(Object obj, String str) {
                    boolean z12 = obj instanceof B;
                    a aVar = this.f418786c;
                    if (!z12) {
                        aVar.c(str, AnnotationValue.ForConstant.c(obj));
                    } else {
                        B b12 = (B) obj;
                        aVar.c(str, new LazyTypeDescription.e.C12121e(Default.this, b12.t() == 9 ? b12.k().replace('/', '.') : b12.f(), null));
                    }
                }

                @Override // net.bytebuddy.jar.asm.AbstractC44388a
                public final AbstractC44388a b(String str, String str2) {
                    C12141a c12141a = new C12141a(str2, str);
                    e eVar = e.this;
                    return eVar.new a(c12141a, new ComponentTypeLocator.a(Default.this, str2));
                }

                @Override // net.bytebuddy.jar.asm.AbstractC44388a
                public final AbstractC44388a c(String str) {
                    return e.this.new a(new b(str, this.f418787d.T3(str), null), ComponentTypeLocator.Illegal.f418446b);
                }

                @Override // net.bytebuddy.jar.asm.AbstractC44388a
                public final void d() {
                    this.f418786c.onComplete();
                }

                @Override // net.bytebuddy.jar.asm.AbstractC44388a
                public final void e(String str, String str2, String str3) {
                    this.f418786c.c(str, new LazyTypeDescription.e.c(Default.this, str2.substring(1, str2.length() - 1).replace('/', '.'), str3, null));
                }

                public a(a aVar, ComponentTypeLocator componentTypeLocator) {
                    super(net.bytebuddy.utility.e.f418981b, null);
                    this.f418786c = aVar;
                    this.f418787d = componentTypeLocator;
                }
            }

            public class b extends m {

                /* renamed from: c, reason: collision with root package name */
                public final int f418797c;

                /* renamed from: d, reason: collision with root package name */
                public final String f418798d;

                /* renamed from: e, reason: collision with root package name */
                public final String f418799e;

                /* renamed from: f, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418800f;

                /* renamed from: g, reason: collision with root package name */
                public final HashMap f418801g;

                /* renamed from: h, reason: collision with root package name */
                public final ArrayList f418802h;

                public b(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
                    super(net.bytebuddy.utility.e.f418981b, null);
                    this.f418797c = i12;
                    this.f418798d = str;
                    this.f418799e = str2;
                    this.f418800f = str3;
                    this.f418801g = new HashMap();
                    this.f418802h = new ArrayList();
                }

                @Override // net.bytebuddy.jar.asm.m
                public final AbstractC44388a a(String str, boolean z12) {
                    ArrayList arrayList = this.f418802h;
                    e eVar = e.this;
                    return new a(eVar, str, arrayList, new ComponentTypeLocator.a(Default.this, str));
                }

                @Override // net.bytebuddy.jar.asm.m
                public final void c() {
                    ArrayList arrayList = e.this.f418768h;
                    HashMap map = this.f418801g;
                    ArrayList arrayList2 = this.f418802h;
                    arrayList.add(new LazyTypeDescription.b(this.f418798d, this.f418797c, this.f418799e, this.f418800f, map, arrayList2));
                }

                @Override // net.bytebuddy.jar.asm.m
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a d(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                    D d12 = new D(i12);
                    if (d12.a() == 19) {
                        a.c cVar = new a.c(str, c12, this.f418801g);
                        e eVar = e.this;
                        return eVar.new a(cVar, new ComponentTypeLocator.a(Default.this, str));
                    }
                    throw new IllegalStateException("Unexpected type reference on field: " + d12.a());
                }
            }

            public class d extends x {

                /* renamed from: c, reason: collision with root package name */
                public final String f418824c;

                /* renamed from: d, reason: collision with root package name */
                public final String f418825d;

                /* renamed from: e, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418826e;

                /* renamed from: f, reason: collision with root package name */
                public final HashMap f418827f;

                /* renamed from: g, reason: collision with root package name */
                public final ArrayList f418828g;

                public d(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
                    super(net.bytebuddy.utility.e.f418981b, null);
                    this.f418824c = str;
                    this.f418825d = str2;
                    this.f418826e = str3;
                    this.f418827f = new HashMap();
                    this.f418828g = new ArrayList();
                }

                @Override // net.bytebuddy.jar.asm.x
                public final AbstractC44388a a(String str, boolean z12) {
                    ArrayList arrayList = this.f418828g;
                    e eVar = e.this;
                    return new a(eVar, str, arrayList, new ComponentTypeLocator.a(Default.this, str));
                }

                @Override // net.bytebuddy.jar.asm.x
                public final void c() {
                    ArrayList arrayList = e.this.f418770j;
                    HashMap map = this.f418827f;
                    ArrayList arrayList2 = this.f418828g;
                    arrayList.add(new LazyTypeDescription.n(this.f418824c, this.f418825d, this.f418826e, map, arrayList2));
                }

                @Override // net.bytebuddy.jar.asm.x
                public final AbstractC44388a d(int i12, C c12, String str, boolean z12) {
                    D d12 = new D(i12);
                    if (d12.a() == 19) {
                        a.c cVar = new a.c(str, c12, this.f418827f);
                        e eVar = e.this;
                        return eVar.new a(cVar, new ComponentTypeLocator.a(Default.this, str));
                    }
                    throw new IllegalStateException("Unexpected type reference on record component: " + d12.a());
                }
            }

            public e() {
                super(net.bytebuddy.utility.e.f418981b, null);
                this.f418764d = new HashMap();
                this.f418765e = new HashMap();
                this.f418766f = new HashMap();
                this.f418767g = new ArrayList();
                this.f418768h = new ArrayList();
                this.f418769i = new ArrayList();
                this.f418770j = new ArrayList();
                this.f418777q = false;
                this.f418780t = LazyTypeDescription.TypeContainment.SelfContained.f418583b;
                this.f418779s = new ArrayList();
                this.f418782v = new ArrayList();
                this.f418783w = new ArrayList();
            }

            @Override // net.bytebuddy.jar.asm.f
            @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
            public final void c(int i12, int i13, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                this.f418772l = 65535 & i13;
                this.f418771k = i13;
                this.f418773m = str;
                this.f418775o = str2;
                this.f418774n = str3;
                this.f418776p = strArr;
                this.f418784x = ClassFileVersion.f(i12);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final AbstractC44388a d(String str, boolean z12) {
                return new a(this, str, this.f418767g, new ComponentTypeLocator.a(Default.this, str));
            }

            @Override // net.bytebuddy.jar.asm.f
            public final m g(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b Object obj) {
                return new b(i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, str, str2, str3);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void h(int i12, String str, @net.bytebuddy.utility.nullability.b String str2, @net.bytebuddy.utility.nullability.b String str3) {
                if (str.equals(this.f418773m)) {
                    if (str2 != null) {
                        this.f418781u = str2;
                        if (this.f418780t.c()) {
                            this.f418780t = new LazyTypeDescription.TypeContainment.b(str2, false);
                        }
                    }
                    if (str3 == null && !this.f418780t.c()) {
                        this.f418777q = true;
                    }
                    this.f418772l = i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    return;
                }
                if (str2 == null || str3 == null || !str2.equals(this.f418773m)) {
                    return;
                }
                this.f418782v.add("L" + str + ";");
            }

            @Override // net.bytebuddy.jar.asm.f
            @net.bytebuddy.utility.nullability.b
            public final s i(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                if (!str.equals("<clinit>")) {
                    return new c(i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, str, str2, str3, strArr);
                }
                int i13 = Default.f418443h;
                return null;
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void k(String str) {
                this.f418778r = str;
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void l(String str) {
                this.f418779s.add(str);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void m(@net.bytebuddy.utility.nullability.b String str, @net.bytebuddy.utility.nullability.b String str2, String str3) {
                if (str2 != null && !str2.equals("<clinit>")) {
                    this.f418780t = new LazyTypeDescription.TypeContainment.a(str, str2, str3);
                } else if (str != null) {
                    this.f418780t = new LazyTypeDescription.TypeContainment.b(str, true);
                }
            }

            @Override // net.bytebuddy.jar.asm.f
            public final void n(String str) {
                this.f418783w.add(str);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final x o(String str, String str2, @net.bytebuddy.utility.nullability.b String str3) {
                return new d(str, str2, str3);
            }

            @Override // net.bytebuddy.jar.asm.f
            public final AbstractC44388a q(int i12, @net.bytebuddy.utility.nullability.b C c12, String str, boolean z12) {
                a c12129a;
                D d12 = new D(i12);
                int iA2 = d12.a();
                if (iA2 == 0) {
                    c12129a = new a.c.C12129a(str, c12, (i12 & 16711680) >> 16, this.f418765e);
                } else if (iA2 == 16) {
                    c12129a = new a.c.C12129a(str, c12, (short) ((i12 & 16776960) >> 8), this.f418764d);
                } else {
                    if (iA2 != 17) {
                        throw new IllegalArgumentException("Unexpected type reference: " + d12.a());
                    }
                    c12129a = new a.c.C12129a.C12130a(str, c12, (65280 & i12) >> 8, (i12 & 16711680) >> 16, this.f418766f);
                }
                return new a(c12129a, new ComponentTypeLocator.a(Default.this, str));
            }

            public class c extends s implements a {

                /* renamed from: d, reason: collision with root package name */
                public final int f418804d;

                /* renamed from: e, reason: collision with root package name */
                public final String f418805e;

                /* renamed from: f, reason: collision with root package name */
                public final String f418806f;

                /* renamed from: g, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String f418807g;

                /* renamed from: h, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public final String[] f418808h;

                /* renamed from: i, reason: collision with root package name */
                public final HashMap f418809i;

                /* renamed from: j, reason: collision with root package name */
                public final HashMap f418810j;

                /* renamed from: k, reason: collision with root package name */
                public final HashMap f418811k;

                /* renamed from: l, reason: collision with root package name */
                public final HashMap f418812l;

                /* renamed from: m, reason: collision with root package name */
                public final HashMap f418813m;

                /* renamed from: n, reason: collision with root package name */
                public final HashMap f418814n;

                /* renamed from: o, reason: collision with root package name */
                public final ArrayList f418815o;

                /* renamed from: p, reason: collision with root package name */
                public final HashMap f418816p;

                /* renamed from: q, reason: collision with root package name */
                public final ArrayList f418817q;

                /* renamed from: r, reason: collision with root package name */
                public final d f418818r;

                /* renamed from: s, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public net.bytebuddy.jar.asm.r f418819s;

                /* renamed from: t, reason: collision with root package name */
                public int f418820t;

                /* renamed from: u, reason: collision with root package name */
                public int f418821u;

                /* renamed from: v, reason: collision with root package name */
                @net.bytebuddy.utility.nullability.b
                public AnnotationValue.b f418822v;

                public c(int i12, String str, String str2, @net.bytebuddy.utility.nullability.b String str3, @net.bytebuddy.utility.nullability.b String[] strArr) {
                    super(net.bytebuddy.utility.e.f418981b, null);
                    this.f418804d = i12;
                    this.f418805e = str;
                    this.f418806f = str2;
                    this.f418807g = str3;
                    this.f418808h = strArr;
                    this.f418809i = new HashMap();
                    this.f418810j = new HashMap();
                    this.f418811k = new HashMap();
                    this.f418812l = new HashMap();
                    this.f418813m = new HashMap();
                    this.f418814n = new HashMap();
                    this.f418815o = new ArrayList();
                    this.f418816p = new HashMap();
                    this.f418817q = new ArrayList();
                    this.f418818r = new d(B.o(str2).c());
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void C(int i12, String str) {
                    this.f418817q.add(new LazyTypeDescription.l.a(str, Integer.valueOf(i12)));
                }

                @Override // net.bytebuddy.jar.asm.s
                public final AbstractC44388a D(int i12, String str, boolean z12) {
                    int i13 = i12 + (z12 ? this.f418820t : this.f418821u);
                    HashMap map = this.f418816p;
                    e eVar = e.this;
                    return eVar.new a(new a.b.C12128a(str, i13, map), new ComponentTypeLocator.a(Default.this, str));
                }

                @Override // net.bytebuddy.jar.asm.s
                @net.bytebuddy.utility.nullability.b
                public final AbstractC44388a H(int i12, C c12, String str, boolean z12) {
                    a c12129a;
                    D d12 = new D(i12);
                    int iA2 = d12.a();
                    if (iA2 != 1) {
                        switch (iA2) {
                            case 18:
                                c12129a = new a.c.C12129a.C12130a(str, c12, (65280 & i12) >> 8, (i12 & 16711680) >> 16, this.f418810j);
                                break;
                            case 19:
                                return null;
                            case 20:
                                c12129a = new a.c(str, c12, this.f418811k);
                                break;
                            case 21:
                                c12129a = new a.c(str, c12, this.f418814n);
                                break;
                            case 22:
                                c12129a = new a.c.C12129a(str, c12, (i12 & 16711680) >> 16, this.f418812l);
                                break;
                            case 23:
                                c12129a = new a.c.C12129a(str, c12, (i12 & 16776960) >> 8, this.f418813m);
                                break;
                            default:
                                throw new IllegalStateException("Unexpected type reference on method: " + d12.a());
                        }
                    } else {
                        c12129a = new a.c.C12129a(str, c12, (i12 & 16711680) >> 16, this.f418809i);
                    }
                    e eVar = e.this;
                    return eVar.new a(c12129a, new ComponentTypeLocator.a(Default.this, str));
                }

                @Override // net.bytebuddy.pool.TypePool.Default.a
                public final void c(String str, AnnotationValue.b bVar) {
                    this.f418822v = bVar;
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void d(int i12, boolean z12) {
                    String str = this.f418806f;
                    if (z12) {
                        this.f418820t = B.o(str).c().length - i12;
                    } else {
                        this.f418821u = B.o(str).c().length - i12;
                    }
                }

                @Override // net.bytebuddy.jar.asm.s
                public final AbstractC44388a e(String str, boolean z12) {
                    ArrayList arrayList = this.f418815o;
                    e eVar = e.this;
                    return new a(eVar, str, arrayList, new ComponentTypeLocator.a(Default.this, str));
                }

                @Override // net.bytebuddy.jar.asm.s
                public final AbstractC44388a f() {
                    return e.this.new a(this, new ComponentTypeLocator.b(this.f418806f));
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void i() {
                    HashMap map;
                    ArrayList arrayList;
                    d dVar;
                    LazyTypeDescription.l.a aVar;
                    ArrayList arrayList2 = e.this.f418769i;
                    HashMap map2 = this.f418809i;
                    HashMap map3 = this.f418810j;
                    HashMap map4 = this.f418811k;
                    HashMap map5 = this.f418812l;
                    HashMap map6 = this.f418813m;
                    HashMap map7 = this.f418814n;
                    ArrayList arrayList3 = this.f418815o;
                    HashMap map8 = this.f418816p;
                    ArrayList arrayList4 = this.f418817q;
                    if (arrayList4.isEmpty()) {
                        int i12 = (this.f418804d & 8) != 0 ? 1 : 0;
                        d dVar2 = this.f418818r;
                        dVar2.getClass();
                        B[] bArr = dVar2.f418762a;
                        ArrayList arrayList5 = new ArrayList(bArr.length);
                        int iS2 = i12 ^ 1;
                        int length = bArr.length;
                        map = map8;
                        int i13 = 0;
                        while (i13 < length) {
                            B b12 = bArr[i13];
                            int i14 = length;
                            B[] bArr2 = bArr;
                            String str = (String) dVar2.f418763b.get(Integer.valueOf(iS2));
                            if (str == null) {
                                aVar = new LazyTypeDescription.l.a();
                                dVar = dVar2;
                            } else {
                                dVar = dVar2;
                                aVar = new LazyTypeDescription.l.a(str, null);
                            }
                            arrayList5.add(aVar);
                            iS2 += b12.s();
                            i13++;
                            length = i14;
                            bArr = bArr2;
                            dVar2 = dVar;
                        }
                        arrayList = arrayList5;
                    } else {
                        map = map8;
                        arrayList = arrayList4;
                    }
                    arrayList2.add(new LazyTypeDescription.l(this.f418805e, this.f418804d, this.f418806f, this.f418807g, this.f418808h, map2, map3, map4, map5, map6, map7, arrayList3, map, arrayList, this.f418822v));
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void s(net.bytebuddy.jar.asm.r rVar) {
                    ReaderMode readerMode = Default.this.f418445g;
                    readerMode.getClass();
                    if (readerMode == ReaderMode.EXTENDED && this.f418819s == null) {
                        this.f418819s = rVar;
                    }
                }

                @Override // net.bytebuddy.jar.asm.s
                public final void v(String str, String str2, String str3, net.bytebuddy.jar.asm.r rVar, net.bytebuddy.jar.asm.r rVar2, int i12) {
                    ReaderMode readerMode = Default.this.f418445g;
                    readerMode.getClass();
                    if (readerMode == ReaderMode.EXTENDED && rVar == this.f418819s) {
                        this.f418818r.f418763b.put(Integer.valueOf(i12), str);
                    }
                }

                @Override // net.bytebuddy.pool.TypePool.Default.a
                public final void onComplete() {
                }
            }
        }

        public interface ComponentTypeLocator {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Illegal implements ComponentTypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public static final Illegal f418446b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ Illegal[] f418447c;

                static {
                    Illegal illegal = new Illegal("INSTANCE", 0);
                    f418446b = illegal;
                    f418447c = new Illegal[]{illegal};
                }

                public Illegal() {
                    throw null;
                }

                public static Illegal valueOf(String str) {
                    return (Illegal) Enum.valueOf(Illegal.class, str);
                }

                public static Illegal[] values() {
                    return (Illegal[]) f418447c.clone();
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public final b.InterfaceC12142b T3(String str) {
                    throw new IllegalStateException(G.f("Unexpected lookup of component type for ", str));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements ComponentTypeLocator {

                /* renamed from: b, reason: collision with root package name */
                public final TypePool f418448b;

                /* renamed from: c, reason: collision with root package name */
                public final String f418449c;

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.pool.TypePool$Default$ComponentTypeLocator$a$a, reason: collision with other inner class name */
                public class C12114a implements b.InterfaceC12142b {

                    /* renamed from: b, reason: collision with root package name */
                    public final String f418450b;

                    public C12114a(String str) {
                        this.f418450b = str;
                    }

                    @Override // net.bytebuddy.pool.TypePool.b.InterfaceC12142b
                    @net.bytebuddy.utility.nullability.b
                    public final String a() {
                        a aVar = a.this;
                        TypeDescription typeDescriptionM = ((a.d) aVar.f418448b.a(aVar.f418449c).a().q().P1(C44411u.x(this.f418450b)).M2()).getReturnType().f5().m();
                        if (typeDescriptionM == null) {
                            return null;
                        }
                        return typeDescriptionM.getName();
                    }

                    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        C12114a c12114a = (C12114a) obj;
                        return this.f418450b.equals(c12114a.f418450b) && a.this.equals(a.this);
                    }

                    public final int hashCode() {
                        return a.this.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418450b);
                    }
                }

                public a(TypePool typePool, String str) {
                    this.f418448b = typePool;
                    this.f418449c = str.substring(1, str.length() - 1).replace('/', '.');
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public final b.InterfaceC12142b T3(String str) {
                    return new C12114a(str);
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f418449c.equals(aVar.f418449c) && this.f418448b.equals(aVar.f418448b);
                }

                public final int hashCode() {
                    return this.f418449c.hashCode() + ((this.f418448b.hashCode() + (getClass().hashCode() * 31)) * 31);
                }
            }

            b.InterfaceC12142b T3(String str);

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements ComponentTypeLocator, b.InterfaceC12142b {

                /* renamed from: b, reason: collision with root package name */
                public final String f418452b;

                public b(String str) {
                    String strH = B.o(str).h();
                    this.f418452b = androidx.compose.ui.graphics.colorspace.e.h(2, 0, B.w(B.r(strH), strH.length(), strH).f());
                }

                @Override // net.bytebuddy.pool.TypePool.b.InterfaceC12142b
                public final String a() {
                    return this.f418452b;
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && getClass() == obj.getClass()) {
                        return this.f418452b.equals(((b) obj).f418452b);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f418452b.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator
                public final b.InterfaceC12142b T3(String str) {
                    return this;
                }
            }
        }

        public static class f extends Default {

            @HashCodeAndEqualsPlugin.Enhance
            public class a implements Resolution {

                /* renamed from: a, reason: collision with root package name */
                public final String f418830a;

                public a(String str) {
                    this.f418830a = str;
                }

                @Override // net.bytebuddy.pool.TypePool.Resolution
                public final TypeDescription a() {
                    return f.this.new b(this.f418830a);
                }

                @Override // net.bytebuddy.pool.TypePool.Resolution
                public final boolean b() {
                    return f.this.e(this.f418830a).b();
                }

                public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.f418830a.equals(aVar.f418830a) && f.this.equals(f.this);
                }

                public final int hashCode() {
                    return f.this.hashCode() + H.d(getClass().hashCode() * 31, 31, this.f418830a);
                }
            }

            public class b extends TypeDescription.b.a.AbstractC11997a {

                /* renamed from: e, reason: collision with root package name */
                public final String f418832e;

                /* renamed from: g, reason: collision with root package name */
                public transient /* synthetic */ TypeDescription f418834g;

                public b(String str) {
                    this.f418832e = str;
                }

                @Override // net.bytebuddy.description.d.InterfaceC11969d
                public final String getName() {
                    return this.f418832e;
                }

                @Override // net.bytebuddy.description.type.TypeDescription.b.a.AbstractC11997a
                @k.c
                public final TypeDescription z0() {
                    TypeDescription typeDescriptionA = this.f418834g != null ? null : f.this.e(this.f418832e).a();
                    if (typeDescriptionA == null) {
                        return this.f418834g;
                    }
                    this.f418834g = typeDescriptionA;
                    return typeDescriptionA;
                }
            }

            @Override // net.bytebuddy.pool.TypePool.Default, net.bytebuddy.pool.TypePool.b
            public final Resolution c(String str) {
                return new a(str);
            }

            public final Resolution e(String str) {
                CacheProvider cacheProvider = this.f418841b;
                Resolution resolutionA = cacheProvider.a(str);
                return resolutionA == null ? cacheProvider.b(str, super.c(str)) : resolutionA;
            }

            @Override // net.bytebuddy.pool.TypePool.b
            public final Resolution b(String str, Resolution resolution) {
                return resolution;
            }
        }
    }

    public interface CacheProvider {

        public static class a implements CacheProvider {
            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.b
            public final Resolution a(String str) {
                throw null;
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public final Resolution b(String str, Resolution resolution) {
                throw null;
            }
        }

        public static class b implements CacheProvider {

            /* renamed from: b, reason: collision with root package name */
            public final ConcurrentHashMap f418441b = new ConcurrentHashMap();

            public static class a implements CacheProvider {

                /* renamed from: b, reason: collision with root package name */
                public final AtomicReference<SoftReference<b>> f418442b = new AtomicReference<>(new SoftReference(new b()));

                @Override // net.bytebuddy.pool.TypePool.CacheProvider
                @net.bytebuddy.utility.nullability.b
                public final Resolution a(String str) {
                    b bVar = this.f418442b.get().get();
                    if (bVar == null) {
                        return null;
                    }
                    return bVar.a(str);
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
                
                    r1 = r0.get();
                    r2 = r1.get();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
                
                    if (r2 == null) goto L17;
                 */
                @Override // net.bytebuddy.pool.TypePool.CacheProvider
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final net.bytebuddy.pool.TypePool.Resolution b(java.lang.String r6, net.bytebuddy.pool.TypePool.Resolution r7) {
                    /*
                        r5 = this;
                        java.util.concurrent.atomic.AtomicReference<java.lang.ref.SoftReference<net.bytebuddy.pool.TypePool$CacheProvider$b>> r0 = r5.f418442b
                        java.lang.Object r1 = r0.get()
                        java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                        java.lang.Object r2 = r1.get()
                        net.bytebuddy.pool.TypePool$CacheProvider$b r2 = (net.bytebuddy.pool.TypePool.CacheProvider.b) r2
                        if (r2 != 0) goto L36
                        net.bytebuddy.pool.TypePool$CacheProvider$b r3 = new net.bytebuddy.pool.TypePool$CacheProvider$b
                        r3.<init>()
                    L15:
                        java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference
                        r4.<init>(r3)
                    L1a:
                        boolean r2 = r0.compareAndSet(r1, r4)
                        if (r2 == 0) goto L22
                        r2 = r3
                        goto L36
                    L22:
                        java.lang.Object r2 = r0.get()
                        if (r2 == r1) goto L1a
                        java.lang.Object r1 = r0.get()
                        java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1
                        java.lang.Object r2 = r1.get()
                        net.bytebuddy.pool.TypePool$CacheProvider$b r2 = (net.bytebuddy.pool.TypePool.CacheProvider.b) r2
                        if (r2 == 0) goto L15
                    L36:
                        net.bytebuddy.pool.TypePool$Resolution r6 = r2.b(r6, r7)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.pool.TypePool.CacheProvider.b.a.b(java.lang.String, net.bytebuddy.pool.TypePool$Resolution):net.bytebuddy.pool.TypePool$Resolution");
                }
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.b
            public final Resolution a(String str) {
                return (Resolution) this.f418441b.get(str);
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public final Resolution b(String str, Resolution resolution) {
                Resolution resolution2 = (Resolution) this.f418441b.putIfAbsent(str, resolution);
                return resolution2 == null ? resolution : resolution2;
            }
        }

        @net.bytebuddy.utility.nullability.b
        Resolution a(String str);

        Resolution b(String str, Resolution resolution);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements CacheProvider {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f418440b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f418440b.clone();
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            @net.bytebuddy.utility.nullability.b
            public final Resolution a(String str) {
                return null;
            }

            @Override // net.bytebuddy.pool.TypePool.CacheProvider
            public final Resolution b(String str, Resolution resolution) {
                return resolution;
            }
        }
    }
}

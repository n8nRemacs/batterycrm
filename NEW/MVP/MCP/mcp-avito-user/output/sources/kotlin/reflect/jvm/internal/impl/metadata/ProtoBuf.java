package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* loaded from: classes8.dex */
public final class ProtoBuf {

    public static final class Class extends h.d<Class> implements kotlin.reflect.jvm.internal.impl.metadata.d {

        /* renamed from: K, reason: collision with root package name */
        public static final Class f408627K;

        /* renamed from: L, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Class> f408628L = new a();

        /* renamed from: A, reason: collision with root package name */
        public List<Integer> f408629A;

        /* renamed from: B, reason: collision with root package name */
        public int f408630B;

        /* renamed from: C, reason: collision with root package name */
        public List<Type> f408631C;

        /* renamed from: D, reason: collision with root package name */
        public List<Integer> f408632D;

        /* renamed from: E, reason: collision with root package name */
        public int f408633E;

        /* renamed from: F, reason: collision with root package name */
        public k f408634F;

        /* renamed from: G, reason: collision with root package name */
        public List<Integer> f408635G;

        /* renamed from: H, reason: collision with root package name */
        public m f408636H;

        /* renamed from: I, reason: collision with root package name */
        public byte f408637I;

        /* renamed from: J, reason: collision with root package name */
        public int f408638J;

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408639c;

        /* renamed from: d, reason: collision with root package name */
        public int f408640d;

        /* renamed from: e, reason: collision with root package name */
        public int f408641e;

        /* renamed from: f, reason: collision with root package name */
        public int f408642f;

        /* renamed from: g, reason: collision with root package name */
        public int f408643g;

        /* renamed from: h, reason: collision with root package name */
        public List<TypeParameter> f408644h;

        /* renamed from: i, reason: collision with root package name */
        public List<Type> f408645i;

        /* renamed from: j, reason: collision with root package name */
        public List<Integer> f408646j;

        /* renamed from: k, reason: collision with root package name */
        public int f408647k;

        /* renamed from: l, reason: collision with root package name */
        public List<Integer> f408648l;

        /* renamed from: m, reason: collision with root package name */
        public int f408649m;

        /* renamed from: n, reason: collision with root package name */
        public List<Type> f408650n;

        /* renamed from: o, reason: collision with root package name */
        public List<Integer> f408651o;

        /* renamed from: p, reason: collision with root package name */
        public int f408652p;

        /* renamed from: q, reason: collision with root package name */
        public List<b> f408653q;

        /* renamed from: r, reason: collision with root package name */
        public List<e> f408654r;

        /* renamed from: s, reason: collision with root package name */
        public List<h> f408655s;

        /* renamed from: t, reason: collision with root package name */
        public List<j> f408656t;

        /* renamed from: u, reason: collision with root package name */
        public List<d> f408657u;

        /* renamed from: v, reason: collision with root package name */
        public List<Integer> f408658v;

        /* renamed from: w, reason: collision with root package name */
        public int f408659w;

        /* renamed from: x, reason: collision with root package name */
        public int f408660x;

        /* renamed from: y, reason: collision with root package name */
        public Type f408661y;

        /* renamed from: z, reason: collision with root package name */
        public int f408662z;

        public enum Kind implements i.a {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            /* JADX INFO: Fake field, exist only in values array */
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            /* JADX INFO: Fake field, exist only in values array */
            OBJECT(5),
            COMPANION_OBJECT(6);


            /* renamed from: b, reason: collision with root package name */
            public final int f408669b;

            public static class a implements i.b<Kind> {
            }

            static {
                new a();
            }

            Kind(int i12) {
                this.f408669b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408669b;
            }
        }

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Class(eVar, fVar);
            }
        }

        public static final class b extends h.c<Class, b> implements kotlin.reflect.jvm.internal.impl.metadata.d {

            /* renamed from: e, reason: collision with root package name */
            public int f408673e;

            /* renamed from: g, reason: collision with root package name */
            public int f408675g;

            /* renamed from: h, reason: collision with root package name */
            public int f408676h;

            /* renamed from: u, reason: collision with root package name */
            public int f408689u;

            /* renamed from: w, reason: collision with root package name */
            public int f408691w;

            /* renamed from: f, reason: collision with root package name */
            public int f408674f = 6;

            /* renamed from: i, reason: collision with root package name */
            public List<TypeParameter> f408677i = Collections.emptyList();

            /* renamed from: j, reason: collision with root package name */
            public List<Type> f408678j = Collections.emptyList();

            /* renamed from: k, reason: collision with root package name */
            public List<Integer> f408679k = Collections.emptyList();

            /* renamed from: l, reason: collision with root package name */
            public List<Integer> f408680l = Collections.emptyList();

            /* renamed from: m, reason: collision with root package name */
            public List<Type> f408681m = Collections.emptyList();

            /* renamed from: n, reason: collision with root package name */
            public List<Integer> f408682n = Collections.emptyList();

            /* renamed from: o, reason: collision with root package name */
            public List<b> f408683o = Collections.emptyList();

            /* renamed from: p, reason: collision with root package name */
            public List<e> f408684p = Collections.emptyList();

            /* renamed from: q, reason: collision with root package name */
            public List<h> f408685q = Collections.emptyList();

            /* renamed from: r, reason: collision with root package name */
            public List<j> f408686r = Collections.emptyList();

            /* renamed from: s, reason: collision with root package name */
            public List<d> f408687s = Collections.emptyList();

            /* renamed from: t, reason: collision with root package name */
            public List<Integer> f408688t = Collections.emptyList();

            /* renamed from: v, reason: collision with root package name */
            public Type f408690v = Type.f408776u;

            /* renamed from: x, reason: collision with root package name */
            public List<Integer> f408692x = Collections.emptyList();

            /* renamed from: y, reason: collision with root package name */
            public List<Type> f408693y = Collections.emptyList();

            /* renamed from: z, reason: collision with root package name */
            public List<Integer> f408694z = Collections.emptyList();

            /* renamed from: A, reason: collision with root package name */
            public k f408670A = k.f409053h;

            /* renamed from: B, reason: collision with root package name */
            public List<Integer> f408671B = Collections.emptyList();

            /* renamed from: C, reason: collision with root package name */
            public m f408672C = m.f409083f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                Class classM = m();
                if (classM.isInitialized()) {
                    return classM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((Class) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final Class m() {
                Class r02 = new Class(this, (a) null);
                int i12 = this.f408673e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                r02.f408641e = this.f408674f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                r02.f408642f = this.f408675g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                r02.f408643g = this.f408676h;
                if ((i12 & 8) == 8) {
                    this.f408677i = Collections.unmodifiableList(this.f408677i);
                    this.f408673e &= -9;
                }
                r02.f408644h = this.f408677i;
                if ((this.f408673e & 16) == 16) {
                    this.f408678j = Collections.unmodifiableList(this.f408678j);
                    this.f408673e &= -17;
                }
                r02.f408645i = this.f408678j;
                if ((this.f408673e & 32) == 32) {
                    this.f408679k = Collections.unmodifiableList(this.f408679k);
                    this.f408673e &= -33;
                }
                r02.f408646j = this.f408679k;
                if ((this.f408673e & 64) == 64) {
                    this.f408680l = Collections.unmodifiableList(this.f408680l);
                    this.f408673e &= -65;
                }
                r02.f408648l = this.f408680l;
                if ((this.f408673e & 128) == 128) {
                    this.f408681m = Collections.unmodifiableList(this.f408681m);
                    this.f408673e &= -129;
                }
                r02.f408650n = this.f408681m;
                if ((this.f408673e & 256) == 256) {
                    this.f408682n = Collections.unmodifiableList(this.f408682n);
                    this.f408673e &= -257;
                }
                r02.f408651o = this.f408682n;
                if ((this.f408673e & 512) == 512) {
                    this.f408683o = Collections.unmodifiableList(this.f408683o);
                    this.f408673e &= -513;
                }
                r02.f408653q = this.f408683o;
                if ((this.f408673e & 1024) == 1024) {
                    this.f408684p = Collections.unmodifiableList(this.f408684p);
                    this.f408673e &= -1025;
                }
                r02.f408654r = this.f408684p;
                if ((this.f408673e & 2048) == 2048) {
                    this.f408685q = Collections.unmodifiableList(this.f408685q);
                    this.f408673e &= -2049;
                }
                r02.f408655s = this.f408685q;
                if ((this.f408673e & 4096) == 4096) {
                    this.f408686r = Collections.unmodifiableList(this.f408686r);
                    this.f408673e &= -4097;
                }
                r02.f408656t = this.f408686r;
                if ((this.f408673e & 8192) == 8192) {
                    this.f408687s = Collections.unmodifiableList(this.f408687s);
                    this.f408673e &= -8193;
                }
                r02.f408657u = this.f408687s;
                if ((this.f408673e & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f408688t = Collections.unmodifiableList(this.f408688t);
                    this.f408673e &= -16385;
                }
                r02.f408658v = this.f408688t;
                if ((i12 & 32768) == 32768) {
                    i13 |= 8;
                }
                r02.f408660x = this.f408689u;
                if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) == 65536) {
                    i13 |= 16;
                }
                r02.f408661y = this.f408690v;
                if ((i12 & 131072) == 131072) {
                    i13 |= 32;
                }
                r02.f408662z = this.f408691w;
                if ((this.f408673e & 262144) == 262144) {
                    this.f408692x = Collections.unmodifiableList(this.f408692x);
                    this.f408673e &= -262145;
                }
                r02.f408629A = this.f408692x;
                if ((this.f408673e & 524288) == 524288) {
                    this.f408693y = Collections.unmodifiableList(this.f408693y);
                    this.f408673e &= -524289;
                }
                r02.f408631C = this.f408693y;
                if ((this.f408673e & 1048576) == 1048576) {
                    this.f408694z = Collections.unmodifiableList(this.f408694z);
                    this.f408673e &= -1048577;
                }
                r02.f408632D = this.f408694z;
                if ((i12 & 2097152) == 2097152) {
                    i13 |= 64;
                }
                r02.f408634F = this.f408670A;
                if ((this.f408673e & 4194304) == 4194304) {
                    this.f408671B = Collections.unmodifiableList(this.f408671B);
                    this.f408673e &= -4194305;
                }
                r02.f408635G = this.f408671B;
                if ((i12 & 8388608) == 8388608) {
                    i13 |= 128;
                }
                r02.f408636H = this.f408672C;
                r02.f408640d = i13;
                return r02;
            }

            public final void n(Class r92) {
                m mVar;
                k kVar;
                Type type;
                if (r92 == Class.f408627K) {
                    return;
                }
                int i12 = r92.f408640d;
                if ((i12 & 1) == 1) {
                    int i13 = r92.f408641e;
                    this.f408673e = 1 | this.f408673e;
                    this.f408674f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = r92.f408642f;
                    this.f408673e = 2 | this.f408673e;
                    this.f408675g = i14;
                }
                if ((i12 & 4) == 4) {
                    int i15 = r92.f408643g;
                    this.f408673e = 4 | this.f408673e;
                    this.f408676h = i15;
                }
                if (!r92.f408644h.isEmpty()) {
                    if (this.f408677i.isEmpty()) {
                        this.f408677i = r92.f408644h;
                        this.f408673e &= -9;
                    } else {
                        if ((this.f408673e & 8) != 8) {
                            this.f408677i = new ArrayList(this.f408677i);
                            this.f408673e |= 8;
                        }
                        this.f408677i.addAll(r92.f408644h);
                    }
                }
                if (!r92.f408645i.isEmpty()) {
                    if (this.f408678j.isEmpty()) {
                        this.f408678j = r92.f408645i;
                        this.f408673e &= -17;
                    } else {
                        if ((this.f408673e & 16) != 16) {
                            this.f408678j = new ArrayList(this.f408678j);
                            this.f408673e |= 16;
                        }
                        this.f408678j.addAll(r92.f408645i);
                    }
                }
                if (!r92.f408646j.isEmpty()) {
                    if (this.f408679k.isEmpty()) {
                        this.f408679k = r92.f408646j;
                        this.f408673e &= -33;
                    } else {
                        if ((this.f408673e & 32) != 32) {
                            this.f408679k = new ArrayList(this.f408679k);
                            this.f408673e |= 32;
                        }
                        this.f408679k.addAll(r92.f408646j);
                    }
                }
                if (!r92.f408648l.isEmpty()) {
                    if (this.f408680l.isEmpty()) {
                        this.f408680l = r92.f408648l;
                        this.f408673e &= -65;
                    } else {
                        if ((this.f408673e & 64) != 64) {
                            this.f408680l = new ArrayList(this.f408680l);
                            this.f408673e |= 64;
                        }
                        this.f408680l.addAll(r92.f408648l);
                    }
                }
                if (!r92.f408650n.isEmpty()) {
                    if (this.f408681m.isEmpty()) {
                        this.f408681m = r92.f408650n;
                        this.f408673e &= -129;
                    } else {
                        if ((this.f408673e & 128) != 128) {
                            this.f408681m = new ArrayList(this.f408681m);
                            this.f408673e |= 128;
                        }
                        this.f408681m.addAll(r92.f408650n);
                    }
                }
                if (!r92.f408651o.isEmpty()) {
                    if (this.f408682n.isEmpty()) {
                        this.f408682n = r92.f408651o;
                        this.f408673e &= -257;
                    } else {
                        if ((this.f408673e & 256) != 256) {
                            this.f408682n = new ArrayList(this.f408682n);
                            this.f408673e |= 256;
                        }
                        this.f408682n.addAll(r92.f408651o);
                    }
                }
                if (!r92.f408653q.isEmpty()) {
                    if (this.f408683o.isEmpty()) {
                        this.f408683o = r92.f408653q;
                        this.f408673e &= -513;
                    } else {
                        if ((this.f408673e & 512) != 512) {
                            this.f408683o = new ArrayList(this.f408683o);
                            this.f408673e |= 512;
                        }
                        this.f408683o.addAll(r92.f408653q);
                    }
                }
                if (!r92.f408654r.isEmpty()) {
                    if (this.f408684p.isEmpty()) {
                        this.f408684p = r92.f408654r;
                        this.f408673e &= -1025;
                    } else {
                        if ((this.f408673e & 1024) != 1024) {
                            this.f408684p = new ArrayList(this.f408684p);
                            this.f408673e |= 1024;
                        }
                        this.f408684p.addAll(r92.f408654r);
                    }
                }
                if (!r92.f408655s.isEmpty()) {
                    if (this.f408685q.isEmpty()) {
                        this.f408685q = r92.f408655s;
                        this.f408673e &= -2049;
                    } else {
                        if ((this.f408673e & 2048) != 2048) {
                            this.f408685q = new ArrayList(this.f408685q);
                            this.f408673e |= 2048;
                        }
                        this.f408685q.addAll(r92.f408655s);
                    }
                }
                if (!r92.f408656t.isEmpty()) {
                    if (this.f408686r.isEmpty()) {
                        this.f408686r = r92.f408656t;
                        this.f408673e &= -4097;
                    } else {
                        if ((this.f408673e & 4096) != 4096) {
                            this.f408686r = new ArrayList(this.f408686r);
                            this.f408673e |= 4096;
                        }
                        this.f408686r.addAll(r92.f408656t);
                    }
                }
                if (!r92.f408657u.isEmpty()) {
                    if (this.f408687s.isEmpty()) {
                        this.f408687s = r92.f408657u;
                        this.f408673e &= -8193;
                    } else {
                        if ((this.f408673e & 8192) != 8192) {
                            this.f408687s = new ArrayList(this.f408687s);
                            this.f408673e |= 8192;
                        }
                        this.f408687s.addAll(r92.f408657u);
                    }
                }
                if (!r92.f408658v.isEmpty()) {
                    if (this.f408688t.isEmpty()) {
                        this.f408688t = r92.f408658v;
                        this.f408673e &= -16385;
                    } else {
                        if ((this.f408673e & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                            this.f408688t = new ArrayList(this.f408688t);
                            this.f408673e |= Http2.INITIAL_MAX_FRAME_SIZE;
                        }
                        this.f408688t.addAll(r92.f408658v);
                    }
                }
                int i16 = r92.f408640d;
                if ((i16 & 8) == 8) {
                    int i17 = r92.f408660x;
                    this.f408673e |= 32768;
                    this.f408689u = i17;
                }
                if ((i16 & 16) == 16) {
                    Type type2 = r92.f408661y;
                    if ((this.f408673e & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 65536 || (type = this.f408690v) == Type.f408776u) {
                        this.f408690v = type2;
                    } else {
                        Type.b bVarR = Type.r(type);
                        bVarR.n(type2);
                        this.f408690v = bVarR.m();
                    }
                    this.f408673e |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                }
                if ((r92.f408640d & 32) == 32) {
                    int i18 = r92.f408662z;
                    this.f408673e |= 131072;
                    this.f408691w = i18;
                }
                if (!r92.f408629A.isEmpty()) {
                    if (this.f408692x.isEmpty()) {
                        this.f408692x = r92.f408629A;
                        this.f408673e &= -262145;
                    } else {
                        if ((this.f408673e & 262144) != 262144) {
                            this.f408692x = new ArrayList(this.f408692x);
                            this.f408673e |= 262144;
                        }
                        this.f408692x.addAll(r92.f408629A);
                    }
                }
                if (!r92.f408631C.isEmpty()) {
                    if (this.f408693y.isEmpty()) {
                        this.f408693y = r92.f408631C;
                        this.f408673e &= -524289;
                    } else {
                        if ((this.f408673e & 524288) != 524288) {
                            this.f408693y = new ArrayList(this.f408693y);
                            this.f408673e |= 524288;
                        }
                        this.f408693y.addAll(r92.f408631C);
                    }
                }
                if (!r92.f408632D.isEmpty()) {
                    if (this.f408694z.isEmpty()) {
                        this.f408694z = r92.f408632D;
                        this.f408673e &= -1048577;
                    } else {
                        if ((this.f408673e & 1048576) != 1048576) {
                            this.f408694z = new ArrayList(this.f408694z);
                            this.f408673e |= 1048576;
                        }
                        this.f408694z.addAll(r92.f408632D);
                    }
                }
                if ((r92.f408640d & 64) == 64) {
                    k kVar2 = r92.f408634F;
                    if ((this.f408673e & 2097152) != 2097152 || (kVar = this.f408670A) == k.f409053h) {
                        this.f408670A = kVar2;
                    } else {
                        k.b bVarE = k.e(kVar);
                        bVarE.l(kVar2);
                        this.f408670A = bVarE.k();
                    }
                    this.f408673e |= 2097152;
                }
                if (!r92.f408635G.isEmpty()) {
                    if (this.f408671B.isEmpty()) {
                        this.f408671B = r92.f408635G;
                        this.f408673e &= -4194305;
                    } else {
                        if ((this.f408673e & 4194304) != 4194304) {
                            this.f408671B = new ArrayList(this.f408671B);
                            this.f408673e |= 4194304;
                        }
                        this.f408671B.addAll(r92.f408635G);
                    }
                }
                if ((r92.f408640d & 128) == 128) {
                    m mVar2 = r92.f408636H;
                    if ((this.f408673e & 8388608) != 8388608 || (mVar = this.f408672C) == m.f409083f) {
                        this.f408672C = mVar2;
                    } else {
                        m.b bVar = new m.b();
                        bVar.l(mVar);
                        bVar.l(mVar2);
                        this.f408672C = bVar.k();
                    }
                    this.f408673e |= 8388608;
                }
                l(r92);
                this.f409359b = this.f409359b.b(r92.f408639c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.f408628L     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            Class r02 = new Class(0);
            f408627K = r02;
            r02.p();
        }

        public Class() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408640d & 1) == 1) {
                codedOutputStream.m(1, this.f408641e);
            }
            if (this.f408646j.size() > 0) {
                codedOutputStream.v(18);
                codedOutputStream.v(this.f408647k);
            }
            for (int i12 = 0; i12 < this.f408646j.size(); i12++) {
                codedOutputStream.n(this.f408646j.get(i12).intValue());
            }
            if ((this.f408640d & 2) == 2) {
                codedOutputStream.m(3, this.f408642f);
            }
            if ((this.f408640d & 4) == 4) {
                codedOutputStream.m(4, this.f408643g);
            }
            for (int i13 = 0; i13 < this.f408644h.size(); i13++) {
                codedOutputStream.o(5, this.f408644h.get(i13));
            }
            for (int i14 = 0; i14 < this.f408645i.size(); i14++) {
                codedOutputStream.o(6, this.f408645i.get(i14));
            }
            if (this.f408648l.size() > 0) {
                codedOutputStream.v(58);
                codedOutputStream.v(this.f408649m);
            }
            for (int i15 = 0; i15 < this.f408648l.size(); i15++) {
                codedOutputStream.n(this.f408648l.get(i15).intValue());
            }
            for (int i16 = 0; i16 < this.f408653q.size(); i16++) {
                codedOutputStream.o(8, this.f408653q.get(i16));
            }
            for (int i17 = 0; i17 < this.f408654r.size(); i17++) {
                codedOutputStream.o(9, this.f408654r.get(i17));
            }
            for (int i18 = 0; i18 < this.f408655s.size(); i18++) {
                codedOutputStream.o(10, this.f408655s.get(i18));
            }
            for (int i19 = 0; i19 < this.f408656t.size(); i19++) {
                codedOutputStream.o(11, this.f408656t.get(i19));
            }
            for (int i22 = 0; i22 < this.f408657u.size(); i22++) {
                codedOutputStream.o(13, this.f408657u.get(i22));
            }
            if (this.f408658v.size() > 0) {
                codedOutputStream.v(130);
                codedOutputStream.v(this.f408659w);
            }
            for (int i23 = 0; i23 < this.f408658v.size(); i23++) {
                codedOutputStream.n(this.f408658v.get(i23).intValue());
            }
            if ((this.f408640d & 8) == 8) {
                codedOutputStream.m(17, this.f408660x);
            }
            if ((this.f408640d & 16) == 16) {
                codedOutputStream.o(18, this.f408661y);
            }
            if ((this.f408640d & 32) == 32) {
                codedOutputStream.m(19, this.f408662z);
            }
            for (int i24 = 0; i24 < this.f408650n.size(); i24++) {
                codedOutputStream.o(20, this.f408650n.get(i24));
            }
            if (this.f408651o.size() > 0) {
                codedOutputStream.v(170);
                codedOutputStream.v(this.f408652p);
            }
            for (int i25 = 0; i25 < this.f408651o.size(); i25++) {
                codedOutputStream.n(this.f408651o.get(i25).intValue());
            }
            if (this.f408629A.size() > 0) {
                codedOutputStream.v(178);
                codedOutputStream.v(this.f408630B);
            }
            for (int i26 = 0; i26 < this.f408629A.size(); i26++) {
                codedOutputStream.n(this.f408629A.get(i26).intValue());
            }
            for (int i27 = 0; i27 < this.f408631C.size(); i27++) {
                codedOutputStream.o(23, this.f408631C.get(i27));
            }
            if (this.f408632D.size() > 0) {
                codedOutputStream.v(194);
                codedOutputStream.v(this.f408633E);
            }
            for (int i28 = 0; i28 < this.f408632D.size(); i28++) {
                codedOutputStream.n(this.f408632D.get(i28).intValue());
            }
            if ((this.f408640d & 64) == 64) {
                codedOutputStream.o(30, this.f408634F);
            }
            for (int i29 = 0; i29 < this.f408635G.size(); i29++) {
                codedOutputStream.m(31, this.f408635G.get(i29).intValue());
            }
            if ((this.f408640d & 128) == 128) {
                codedOutputStream.o(32, this.f408636H);
            }
            aVarM.a(19000, codedOutputStream);
            codedOutputStream.r(this.f408639c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408627K;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408638J;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408640d & 1) == 1 ? CodedOutputStream.b(1, this.f408641e) : 0;
            int iC2 = 0;
            for (int i13 = 0; i13 < this.f408646j.size(); i13++) {
                iC2 += CodedOutputStream.c(this.f408646j.get(i13).intValue());
            }
            int iD2 = iB2 + iC2;
            if (!this.f408646j.isEmpty()) {
                iD2 = iD2 + 1 + CodedOutputStream.c(iC2);
            }
            this.f408647k = iC2;
            if ((this.f408640d & 2) == 2) {
                iD2 += CodedOutputStream.b(3, this.f408642f);
            }
            if ((this.f408640d & 4) == 4) {
                iD2 += CodedOutputStream.b(4, this.f408643g);
            }
            for (int i14 = 0; i14 < this.f408644h.size(); i14++) {
                iD2 += CodedOutputStream.d(5, this.f408644h.get(i14));
            }
            for (int i15 = 0; i15 < this.f408645i.size(); i15++) {
                iD2 += CodedOutputStream.d(6, this.f408645i.get(i15));
            }
            int iC3 = 0;
            for (int i16 = 0; i16 < this.f408648l.size(); i16++) {
                iC3 += CodedOutputStream.c(this.f408648l.get(i16).intValue());
            }
            int iD3 = iD2 + iC3;
            if (!this.f408648l.isEmpty()) {
                iD3 = iD3 + 1 + CodedOutputStream.c(iC3);
            }
            this.f408649m = iC3;
            for (int i17 = 0; i17 < this.f408653q.size(); i17++) {
                iD3 += CodedOutputStream.d(8, this.f408653q.get(i17));
            }
            for (int i18 = 0; i18 < this.f408654r.size(); i18++) {
                iD3 += CodedOutputStream.d(9, this.f408654r.get(i18));
            }
            for (int i19 = 0; i19 < this.f408655s.size(); i19++) {
                iD3 += CodedOutputStream.d(10, this.f408655s.get(i19));
            }
            for (int i22 = 0; i22 < this.f408656t.size(); i22++) {
                iD3 += CodedOutputStream.d(11, this.f408656t.get(i22));
            }
            for (int i23 = 0; i23 < this.f408657u.size(); i23++) {
                iD3 += CodedOutputStream.d(13, this.f408657u.get(i23));
            }
            int iC4 = 0;
            for (int i24 = 0; i24 < this.f408658v.size(); i24++) {
                iC4 += CodedOutputStream.c(this.f408658v.get(i24).intValue());
            }
            int iD4 = iD3 + iC4;
            if (!this.f408658v.isEmpty()) {
                iD4 = iD4 + 2 + CodedOutputStream.c(iC4);
            }
            this.f408659w = iC4;
            if ((this.f408640d & 8) == 8) {
                iD4 += CodedOutputStream.b(17, this.f408660x);
            }
            if ((this.f408640d & 16) == 16) {
                iD4 += CodedOutputStream.d(18, this.f408661y);
            }
            if ((this.f408640d & 32) == 32) {
                iD4 += CodedOutputStream.b(19, this.f408662z);
            }
            for (int i25 = 0; i25 < this.f408650n.size(); i25++) {
                iD4 += CodedOutputStream.d(20, this.f408650n.get(i25));
            }
            int iC5 = 0;
            for (int i26 = 0; i26 < this.f408651o.size(); i26++) {
                iC5 += CodedOutputStream.c(this.f408651o.get(i26).intValue());
            }
            int iC6 = iD4 + iC5;
            if (!this.f408651o.isEmpty()) {
                iC6 = iC6 + 2 + CodedOutputStream.c(iC5);
            }
            this.f408652p = iC5;
            int iC7 = 0;
            for (int i27 = 0; i27 < this.f408629A.size(); i27++) {
                iC7 += CodedOutputStream.c(this.f408629A.get(i27).intValue());
            }
            int iD5 = iC6 + iC7;
            if (!this.f408629A.isEmpty()) {
                iD5 = iD5 + 2 + CodedOutputStream.c(iC7);
            }
            this.f408630B = iC7;
            for (int i28 = 0; i28 < this.f408631C.size(); i28++) {
                iD5 += CodedOutputStream.d(23, this.f408631C.get(i28));
            }
            int iC8 = 0;
            for (int i29 = 0; i29 < this.f408632D.size(); i29++) {
                iC8 += CodedOutputStream.c(this.f408632D.get(i29).intValue());
            }
            int iD6 = iD5 + iC8;
            if (!this.f408632D.isEmpty()) {
                iD6 = iD6 + 2 + CodedOutputStream.c(iC8);
            }
            this.f408633E = iC8;
            if ((this.f408640d & 64) == 64) {
                iD6 += CodedOutputStream.d(30, this.f408634F);
            }
            int iC9 = 0;
            for (int i32 = 0; i32 < this.f408635G.size(); i32++) {
                iC9 += CodedOutputStream.c(this.f408635G.get(i32).intValue());
            }
            int iF2 = androidx.compose.ui.graphics.colorspace.e.f(2, iD6 + iC9, this.f408635G);
            if ((this.f408640d & 128) == 128) {
                iF2 += CodedOutputStream.d(32, this.f408636H);
            }
            int size = this.f408639c.size() + f() + iF2;
            this.f408638J = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408637I;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if ((this.f408640d & 2) != 2) {
                this.f408637I = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f408644h.size(); i12++) {
                if (!this.f408644h.get(i12).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f408645i.size(); i13++) {
                if (!this.f408645i.get(i13).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f408650n.size(); i14++) {
                if (!this.f408650n.get(i14).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < this.f408653q.size(); i15++) {
                if (!this.f408653q.get(i15).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < this.f408654r.size(); i16++) {
                if (!this.f408654r.get(i16).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < this.f408655s.size(); i17++) {
                if (!this.f408655s.get(i17).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i18 = 0; i18 < this.f408656t.size(); i18++) {
                if (!this.f408656t.get(i18).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            for (int i19 = 0; i19 < this.f408657u.size(); i19++) {
                if (!this.f408657u.get(i19).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            if ((this.f408640d & 16) == 16 && !this.f408661y.isInitialized()) {
                this.f408637I = (byte) 0;
                return false;
            }
            for (int i22 = 0; i22 < this.f408631C.size(); i22++) {
                if (!this.f408631C.get(i22).isInitialized()) {
                    this.f408637I = (byte) 0;
                    return false;
                }
            }
            if ((this.f408640d & 64) == 64 && !this.f408634F.isInitialized()) {
                this.f408637I = (byte) 0;
                return false;
            }
            if (e()) {
                this.f408637I = (byte) 1;
                return true;
            }
            this.f408637I = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        public final void p() {
            this.f408641e = 6;
            this.f408642f = 0;
            this.f408643g = 0;
            this.f408644h = Collections.emptyList();
            this.f408645i = Collections.emptyList();
            this.f408646j = Collections.emptyList();
            this.f408648l = Collections.emptyList();
            this.f408650n = Collections.emptyList();
            this.f408651o = Collections.emptyList();
            this.f408653q = Collections.emptyList();
            this.f408654r = Collections.emptyList();
            this.f408655s = Collections.emptyList();
            this.f408656t = Collections.emptyList();
            this.f408657u = Collections.emptyList();
            this.f408658v = Collections.emptyList();
            this.f408660x = 0;
            this.f408661y = Type.f408776u;
            this.f408662z = 0;
            this.f408629A = Collections.emptyList();
            this.f408631C = Collections.emptyList();
            this.f408632D = Collections.emptyList();
            this.f408634F = k.f409053h;
            this.f408635G = Collections.emptyList();
            this.f408636H = m.f409083f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public Class(h.c cVar, a aVar) {
            super(cVar);
            this.f408647k = -1;
            this.f408649m = -1;
            this.f408652p = -1;
            this.f408659w = -1;
            this.f408630B = -1;
            this.f408633E = -1;
            this.f408637I = (byte) -1;
            this.f408638J = -1;
            this.f408639c = cVar.f409359b;
        }

        public Class(int i12) {
            this.f408647k = -1;
            this.f408649m = -1;
            this.f408652p = -1;
            this.f408659w = -1;
            this.f408630B = -1;
            this.f408633E = -1;
            this.f408637I = (byte) -1;
            this.f408638J = -1;
            this.f408639c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v23 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v29 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v31 */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v35 */
        /* JADX WARN: Type inference failed for: r8v37 */
        /* JADX WARN: Type inference failed for: r8v39 */
        /* JADX WARN: Type inference failed for: r8v41 */
        /* JADX WARN: Type inference failed for: r8v43 */
        /* JADX WARN: Type inference failed for: r8v45 */
        /* JADX WARN: Type inference failed for: r8v47 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v9 */
        public Class(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            boolean z12;
            this.f408647k = -1;
            this.f408649m = -1;
            this.f408652p = -1;
            this.f408659w = -1;
            this.f408630B = -1;
            this.f408633E = -1;
            this.f408637I = (byte) -1;
            this.f408638J = -1;
            p();
            d.b bVarR = kotlin.reflect.jvm.internal.impl.protobuf.d.r();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVarR, 1);
            boolean z13 = false;
            char c12 = 0;
            while (true) {
                ?? N12 = 64;
                if (!z13) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            switch (iN2) {
                                case 0:
                                    z12 = true;
                                    z13 = true;
                                    c12 = c12;
                                case 8:
                                    z12 = true;
                                    this.f408640d |= 1;
                                    this.f408641e = eVar.f();
                                    c12 = c12;
                                case 16:
                                    int i12 = (c12 == true ? 1 : 0) & 32;
                                    char c13 = c12;
                                    if (i12 != 32) {
                                        this.f408646j = new ArrayList();
                                        c13 = (c12 == true ? 1 : 0) | ' ';
                                    }
                                    this.f408646j.add(Integer.valueOf(eVar.f()));
                                    c12 = c13;
                                    z12 = true;
                                    c12 = c12;
                                case 18:
                                    int iD2 = eVar.d(eVar.k());
                                    int i13 = (c12 == true ? 1 : 0) & 32;
                                    char c14 = c12;
                                    if (i13 != 32) {
                                        c14 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408646j = new ArrayList();
                                            c14 = (c12 == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408646j.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD2);
                                    c12 = c14;
                                    z12 = true;
                                    c12 = c12;
                                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                    this.f408640d |= 2;
                                    this.f408642f = eVar.f();
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 32:
                                    this.f408640d |= 4;
                                    this.f408643g = eVar.f();
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 42:
                                    int i14 = (c12 == true ? 1 : 0) & 8;
                                    char c15 = c12;
                                    if (i14 != 8) {
                                        this.f408644h = new ArrayList();
                                        c15 = (c12 == true ? 1 : 0) | '\b';
                                    }
                                    this.f408644h.add(eVar.g(TypeParameter.f408831o, fVar));
                                    c12 = c15;
                                    z12 = true;
                                    c12 = c12;
                                case 50:
                                    int i15 = (c12 == true ? 1 : 0) & 16;
                                    char c16 = c12;
                                    if (i15 != 16) {
                                        this.f408645i = new ArrayList();
                                        c16 = (c12 == true ? 1 : 0) | 16;
                                    }
                                    this.f408645i.add(eVar.g(Type.f408777v, fVar));
                                    c12 = c16;
                                    z12 = true;
                                    c12 = c12;
                                case 56:
                                    int i16 = (c12 == true ? 1 : 0) & 64;
                                    char c17 = c12;
                                    if (i16 != 64) {
                                        this.f408648l = new ArrayList();
                                        c17 = (c12 == true ? 1 : 0) | '@';
                                    }
                                    this.f408648l.add(Integer.valueOf(eVar.f()));
                                    c12 = c17;
                                    z12 = true;
                                    c12 = c12;
                                case 58:
                                    int iD3 = eVar.d(eVar.k());
                                    int i17 = (c12 == true ? 1 : 0) & 64;
                                    char c18 = c12;
                                    if (i17 != 64) {
                                        c18 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408648l = new ArrayList();
                                            c18 = (c12 == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408648l.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD3);
                                    c12 = c18;
                                    z12 = true;
                                    c12 = c12;
                                case 66:
                                    int i18 = (c12 == true ? 1 : 0) & 512;
                                    char c19 = c12;
                                    if (i18 != 512) {
                                        this.f408653q = new ArrayList();
                                        c19 = (c12 == true ? 1 : 0) | 512;
                                    }
                                    this.f408653q.add(eVar.g(b.f408887k, fVar));
                                    c12 = c19;
                                    z12 = true;
                                    c12 = c12;
                                case 74:
                                    int i19 = (c12 == true ? 1 : 0) & 1024;
                                    char c22 = c12;
                                    if (i19 != 1024) {
                                        this.f408654r = new ArrayList();
                                        c22 = (c12 == true ? 1 : 0) | 1024;
                                    }
                                    this.f408654r.add(eVar.g(e.f408917w, fVar));
                                    c12 = c22;
                                    z12 = true;
                                    c12 = c12;
                                case 82:
                                    int i22 = (c12 == true ? 1 : 0) & 2048;
                                    char c23 = c12;
                                    if (i22 != 2048) {
                                        this.f408655s = new ArrayList();
                                        c23 = (c12 == true ? 1 : 0) | 2048;
                                    }
                                    this.f408655s.add(eVar.g(h.f408985w, fVar));
                                    c12 = c23;
                                    z12 = true;
                                    c12 = c12;
                                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                    int i23 = (c12 == true ? 1 : 0) & 4096;
                                    char c24 = c12;
                                    if (i23 != 4096) {
                                        this.f408656t = new ArrayList();
                                        c24 = (c12 == true ? 1 : 0) | 4096;
                                    }
                                    this.f408656t.add(eVar.g(j.f409029q, fVar));
                                    c12 = c24;
                                    z12 = true;
                                    c12 = c12;
                                case 106:
                                    int i24 = (c12 == true ? 1 : 0) & 8192;
                                    char c25 = c12;
                                    if (i24 != 8192) {
                                        this.f408657u = new ArrayList();
                                        c25 = (c12 == true ? 1 : 0) | 8192;
                                    }
                                    this.f408657u.add(eVar.g(d.f408908i, fVar));
                                    c12 = c25;
                                    z12 = true;
                                    c12 = c12;
                                case 128:
                                    int i25 = (c12 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                                    char c26 = c12;
                                    if (i25 != 16384) {
                                        this.f408658v = new ArrayList();
                                        c26 = (c12 == true ? 1 : 0) | 16384;
                                    }
                                    this.f408658v.add(Integer.valueOf(eVar.f()));
                                    c12 = c26;
                                    z12 = true;
                                    c12 = c12;
                                case 130:
                                    int iD4 = eVar.d(eVar.k());
                                    int i26 = (c12 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                                    char c27 = c12;
                                    if (i26 != 16384) {
                                        c27 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408658v = new ArrayList();
                                            c27 = (c12 == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408658v.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD4);
                                    c12 = c27;
                                    z12 = true;
                                    c12 = c12;
                                case 136:
                                    this.f408640d |= 8;
                                    this.f408660x = eVar.f();
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 146:
                                    Type.b builder = (this.f408640d & 16) == 16 ? this.f408661y.toBuilder() : null;
                                    Type type = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f408661y = type;
                                    if (builder != null) {
                                        builder.n(type);
                                        this.f408661y = builder.m();
                                    }
                                    this.f408640d |= 16;
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 152:
                                    this.f408640d |= 32;
                                    this.f408662z = eVar.f();
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 162:
                                    int i27 = (c12 == true ? 1 : 0) & 128;
                                    char c28 = c12;
                                    if (i27 != 128) {
                                        this.f408650n = new ArrayList();
                                        c28 = (c12 == true ? 1 : 0) | 128;
                                    }
                                    this.f408650n.add(eVar.g(Type.f408777v, fVar));
                                    c12 = c28;
                                    z12 = true;
                                    c12 = c12;
                                case 168:
                                    int i28 = (c12 == true ? 1 : 0) & 256;
                                    char c29 = c12;
                                    if (i28 != 256) {
                                        this.f408651o = new ArrayList();
                                        c29 = (c12 == true ? 1 : 0) | 256;
                                    }
                                    this.f408651o.add(Integer.valueOf(eVar.f()));
                                    c12 = c29;
                                    z12 = true;
                                    c12 = c12;
                                case 170:
                                    int iD5 = eVar.d(eVar.k());
                                    int i29 = (c12 == true ? 1 : 0) & 256;
                                    char c32 = c12;
                                    if (i29 != 256) {
                                        c32 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408651o = new ArrayList();
                                            c32 = (c12 == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408651o.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD5);
                                    c12 = c32;
                                    z12 = true;
                                    c12 = c12;
                                case 176:
                                    int i32 = (c12 == true ? 1 : 0) & 262144;
                                    char c33 = c12;
                                    if (i32 != 262144) {
                                        this.f408629A = new ArrayList();
                                        c33 = (c12 == true ? 1 : 0) | 0;
                                    }
                                    this.f408629A.add(Integer.valueOf(eVar.f()));
                                    c12 = c33;
                                    z12 = true;
                                    c12 = c12;
                                case 178:
                                    int iD6 = eVar.d(eVar.k());
                                    int i33 = (c12 == true ? 1 : 0) & 262144;
                                    char c34 = c12;
                                    if (i33 != 262144) {
                                        c34 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408629A = new ArrayList();
                                            c34 = (c12 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408629A.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD6);
                                    c12 = c34;
                                    z12 = true;
                                    c12 = c12;
                                case 186:
                                    int i34 = (c12 == true ? 1 : 0) & 524288;
                                    char c35 = c12;
                                    if (i34 != 524288) {
                                        this.f408631C = new ArrayList();
                                        c35 = (c12 == true ? 1 : 0) | 0;
                                    }
                                    this.f408631C.add(eVar.g(Type.f408777v, fVar));
                                    c12 = c35;
                                    z12 = true;
                                    c12 = c12;
                                case 192:
                                    int i35 = (c12 == true ? 1 : 0) & 1048576;
                                    char c36 = c12;
                                    if (i35 != 1048576) {
                                        this.f408632D = new ArrayList();
                                        c36 = (c12 == true ? 1 : 0) | 0;
                                    }
                                    this.f408632D.add(Integer.valueOf(eVar.f()));
                                    c12 = c36;
                                    z12 = true;
                                    c12 = c12;
                                case 194:
                                    int iD7 = eVar.d(eVar.k());
                                    int i36 = (c12 == true ? 1 : 0) & 1048576;
                                    char c37 = c12;
                                    if (i36 != 1048576) {
                                        c37 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408632D = new ArrayList();
                                            c37 = (c12 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408632D.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD7);
                                    c12 = c37;
                                    z12 = true;
                                    c12 = c12;
                                case 242:
                                    k.b bVarF = (this.f408640d & 64) == 64 ? this.f408634F.f() : null;
                                    k kVar = (k) eVar.g(k.f409054i, fVar);
                                    this.f408634F = kVar;
                                    if (bVarF != null) {
                                        bVarF.l(kVar);
                                        this.f408634F = bVarF.k();
                                    }
                                    this.f408640d |= 64;
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                case 248:
                                    int i37 = (c12 == true ? 1 : 0) & 4194304;
                                    char c38 = c12;
                                    if (i37 != 4194304) {
                                        this.f408635G = new ArrayList();
                                        c38 = (c12 == true ? 1 : 0) | 0;
                                    }
                                    this.f408635G.add(Integer.valueOf(eVar.f()));
                                    c12 = c38;
                                    z12 = true;
                                    c12 = c12;
                                case 250:
                                    int iD8 = eVar.d(eVar.k());
                                    int i38 = (c12 == true ? 1 : 0) & 4194304;
                                    char c39 = c12;
                                    if (i38 != 4194304) {
                                        c39 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408635G = new ArrayList();
                                            c39 = (c12 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408635G.add(Integer.valueOf(eVar.f()));
                                    }
                                    eVar.c(iD8);
                                    c12 = c39;
                                    z12 = true;
                                    c12 = c12;
                                case 258:
                                    m.b bVarE = (this.f408640d & 128) == 128 ? this.f408636H.e() : null;
                                    m mVar = (m) eVar.g(m.f409084g, fVar);
                                    this.f408636H = mVar;
                                    if (bVarE != null) {
                                        bVarE.l(mVar);
                                        this.f408636H = bVarE.k();
                                    }
                                    this.f408640d |= 128;
                                    c12 = c12;
                                    z12 = true;
                                    c12 = c12;
                                default:
                                    N12 = n(eVar, codedOutputStreamJ, fVar, iN2);
                                    c12 = c12;
                                    if (N12 == 0) {
                                        z13 = true;
                                        c12 = c12;
                                    }
                                    z12 = true;
                                    c12 = c12;
                            }
                        } catch (Throwable th2) {
                            if (((c12 == true ? 1 : 0) & 32) == 32) {
                                this.f408646j = Collections.unmodifiableList(this.f408646j);
                            }
                            if (((c12 == true ? 1 : 0) & 8) == 8) {
                                this.f408644h = Collections.unmodifiableList(this.f408644h);
                            }
                            if (((c12 == true ? 1 : 0) & 16) == 16) {
                                this.f408645i = Collections.unmodifiableList(this.f408645i);
                            }
                            if (((c12 == true ? 1 : 0) & 64) == N12) {
                                this.f408648l = Collections.unmodifiableList(this.f408648l);
                            }
                            if (((c12 == true ? 1 : 0) & 512) == 512) {
                                this.f408653q = Collections.unmodifiableList(this.f408653q);
                            }
                            if (((c12 == true ? 1 : 0) & 1024) == 1024) {
                                this.f408654r = Collections.unmodifiableList(this.f408654r);
                            }
                            if (((c12 == true ? 1 : 0) & 2048) == 2048) {
                                this.f408655s = Collections.unmodifiableList(this.f408655s);
                            }
                            if (((c12 == true ? 1 : 0) & 4096) == 4096) {
                                this.f408656t = Collections.unmodifiableList(this.f408656t);
                            }
                            if (((c12 == true ? 1 : 0) & 8192) == 8192) {
                                this.f408657u = Collections.unmodifiableList(this.f408657u);
                            }
                            if (((c12 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                                this.f408658v = Collections.unmodifiableList(this.f408658v);
                            }
                            if (((c12 == true ? 1 : 0) & 128) == 128) {
                                this.f408650n = Collections.unmodifiableList(this.f408650n);
                            }
                            if (((c12 == true ? 1 : 0) & 256) == 256) {
                                this.f408651o = Collections.unmodifiableList(this.f408651o);
                            }
                            if (((c12 == true ? 1 : 0) & 262144) == 262144) {
                                this.f408629A = Collections.unmodifiableList(this.f408629A);
                            }
                            if (((c12 == true ? 1 : 0) & 524288) == 524288) {
                                this.f408631C = Collections.unmodifiableList(this.f408631C);
                            }
                            if (((c12 == true ? 1 : 0) & 1048576) == 1048576) {
                                this.f408632D = Collections.unmodifiableList(this.f408632D);
                            }
                            if (((c12 == true ? 1 : 0) & 4194304) == 4194304) {
                                this.f408635G = Collections.unmodifiableList(this.f408635G);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f408639c = bVarR.c();
                                throw th3;
                            }
                            this.f408639c = bVarR.c();
                            l();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e12) {
                        e12.f409295b = this;
                        throw e12;
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } else {
                    if (((c12 == true ? 1 : 0) & 32) == 32) {
                        this.f408646j = Collections.unmodifiableList(this.f408646j);
                    }
                    if (((c12 == true ? 1 : 0) & 8) == 8) {
                        this.f408644h = Collections.unmodifiableList(this.f408644h);
                    }
                    if (((c12 == true ? 1 : 0) & 16) == 16) {
                        this.f408645i = Collections.unmodifiableList(this.f408645i);
                    }
                    if (((c12 == true ? 1 : 0) & 64) == 64) {
                        this.f408648l = Collections.unmodifiableList(this.f408648l);
                    }
                    if (((c12 == true ? 1 : 0) & 512) == 512) {
                        this.f408653q = Collections.unmodifiableList(this.f408653q);
                    }
                    if (((c12 == true ? 1 : 0) & 1024) == 1024) {
                        this.f408654r = Collections.unmodifiableList(this.f408654r);
                    }
                    if (((c12 == true ? 1 : 0) & 2048) == 2048) {
                        this.f408655s = Collections.unmodifiableList(this.f408655s);
                    }
                    if (((c12 == true ? 1 : 0) & 4096) == 4096) {
                        this.f408656t = Collections.unmodifiableList(this.f408656t);
                    }
                    if (((c12 == true ? 1 : 0) & 8192) == 8192) {
                        this.f408657u = Collections.unmodifiableList(this.f408657u);
                    }
                    if (((c12 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.f408658v = Collections.unmodifiableList(this.f408658v);
                    }
                    if (((c12 == true ? 1 : 0) & 128) == 128) {
                        this.f408650n = Collections.unmodifiableList(this.f408650n);
                    }
                    if (((c12 == true ? 1 : 0) & 256) == 256) {
                        this.f408651o = Collections.unmodifiableList(this.f408651o);
                    }
                    if (((c12 == true ? 1 : 0) & 262144) == 262144) {
                        this.f408629A = Collections.unmodifiableList(this.f408629A);
                    }
                    if (((c12 == true ? 1 : 0) & 524288) == 524288) {
                        this.f408631C = Collections.unmodifiableList(this.f408631C);
                    }
                    if (((c12 == true ? 1 : 0) & 1048576) == 1048576) {
                        this.f408632D = Collections.unmodifiableList(this.f408632D);
                    }
                    if (((c12 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.f408635G = Collections.unmodifiableList(this.f408635G);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f408639c = bVarR.c();
                        throw th4;
                    }
                    this.f408639c = bVarR.c();
                    l();
                    return;
                }
            }
        }
    }

    public enum MemberKind implements i.a {
        /* JADX INFO: Fake field, exist only in values array */
        DECLARATION(0),
        /* JADX INFO: Fake field, exist only in values array */
        FAKE_OVERRIDE(1),
        /* JADX INFO: Fake field, exist only in values array */
        DELEGATION(2),
        /* JADX INFO: Fake field, exist only in values array */
        SYNTHESIZED(3);


        /* renamed from: b, reason: collision with root package name */
        public final int f408747b;

        public static class a implements i.b<MemberKind> {
        }

        static {
            new a();
        }

        MemberKind(int i12) {
            this.f408747b = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.f408747b;
        }
    }

    public enum Modality implements i.a {
        /* JADX INFO: Fake field, exist only in values array */
        FINAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN(1),
        /* JADX INFO: Fake field, exist only in values array */
        ABSTRACT(2),
        /* JADX INFO: Fake field, exist only in values array */
        SEALED(3);


        /* renamed from: b, reason: collision with root package name */
        public final int f408749b;

        public static class a implements i.b<Modality> {
        }

        static {
            new a();
        }

        Modality(int i12) {
            this.f408749b = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.f408749b;
        }
    }

    public enum Visibility implements i.a {
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE(1),
        /* JADX INFO: Fake field, exist only in values array */
        PROTECTED(2),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLIC(3),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE_TO_THIS(4),
        /* JADX INFO: Fake field, exist only in values array */
        LOCAL(5);


        /* renamed from: b, reason: collision with root package name */
        public final int f408885b;

        public static class a implements i.b<Visibility> {
        }

        static {
            new a();
        }

        Visibility(int i12) {
            this.f408885b = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.f408885b;
        }
    }

    public static final class Annotation extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.c {

        /* renamed from: h, reason: collision with root package name */
        public static final Annotation f408561h;

        /* renamed from: i, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Annotation> f408562i = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408563b;

        /* renamed from: c, reason: collision with root package name */
        public int f408564c;

        /* renamed from: d, reason: collision with root package name */
        public int f408565d;

        /* renamed from: e, reason: collision with root package name */
        public List<Argument> f408566e;

        /* renamed from: f, reason: collision with root package name */
        public byte f408567f;

        /* renamed from: g, reason: collision with root package name */
        public int f408568g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Annotation(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<Annotation, b> implements kotlin.reflect.jvm.internal.impl.metadata.c {

            /* renamed from: c, reason: collision with root package name */
            public int f408624c;

            /* renamed from: d, reason: collision with root package name */
            public int f408625d;

            /* renamed from: e, reason: collision with root package name */
            public List<Argument> f408626e = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                Annotation annotationK = k();
                if (annotationK.isInitialized()) {
                    return annotationK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((Annotation) hVar);
                return this;
            }

            public final Annotation k() {
                Annotation annotation = new Annotation(this, null);
                int i12 = this.f408624c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                annotation.f408565d = this.f408625d;
                if ((i12 & 2) == 2) {
                    this.f408626e = Collections.unmodifiableList(this.f408626e);
                    this.f408624c &= -3;
                }
                annotation.f408566e = this.f408626e;
                annotation.f408564c = i13;
                return annotation;
            }

            public final void l(Annotation annotation) {
                if (annotation == Annotation.f408561h) {
                    return;
                }
                if ((annotation.f408564c & 1) == 1) {
                    int i12 = annotation.f408565d;
                    this.f408624c = 1 | this.f408624c;
                    this.f408625d = i12;
                }
                if (!annotation.f408566e.isEmpty()) {
                    if (this.f408626e.isEmpty()) {
                        this.f408626e = annotation.f408566e;
                        this.f408624c &= -3;
                    } else {
                        if ((this.f408624c & 2) != 2) {
                            this.f408626e = new ArrayList(this.f408626e);
                            this.f408624c |= 2;
                        }
                        this.f408626e.addAll(annotation.f408566e);
                    }
                }
                this.f409359b = this.f409359b.b(annotation.f408563b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.f408562i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            Annotation annotation = new Annotation();
            f408561h = annotation;
            annotation.f408565d = 0;
            annotation.f408566e = Collections.emptyList();
        }

        public Annotation(h.b bVar, a aVar) {
            this.f408567f = (byte) -1;
            this.f408568g = -1;
            this.f408563b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f408564c & 1) == 1) {
                codedOutputStream.m(1, this.f408565d);
            }
            for (int i12 = 0; i12 < this.f408566e.size(); i12++) {
                codedOutputStream.o(2, this.f408566e.get(i12));
            }
            codedOutputStream.r(this.f408563b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408568g;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408564c & 1) == 1 ? CodedOutputStream.b(1, this.f408565d) : 0;
            for (int i13 = 0; i13 < this.f408566e.size(); i13++) {
                iB2 += CodedOutputStream.d(2, this.f408566e.get(i13));
            }
            int size = this.f408563b.size() + iB2;
            this.f408568g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408567f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if ((this.f408564c & 1) != 1) {
                this.f408567f = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f408566e.size(); i12++) {
                if (!this.f408566e.get(i12).isInitialized()) {
                    this.f408567f = (byte) 0;
                    return false;
                }
            }
            this.f408567f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.b {

            /* renamed from: h, reason: collision with root package name */
            public static final Argument f408569h;

            /* renamed from: i, reason: collision with root package name */
            public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Argument> f408570i = new a();

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.reflect.jvm.internal.impl.protobuf.d f408571b;

            /* renamed from: c, reason: collision with root package name */
            public int f408572c;

            /* renamed from: d, reason: collision with root package name */
            public int f408573d;

            /* renamed from: e, reason: collision with root package name */
            public Value f408574e;

            /* renamed from: f, reason: collision with root package name */
            public byte f408575f;

            /* renamed from: g, reason: collision with root package name */
            public int f408576g;

            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new Argument(eVar, fVar, null);
                }
            }

            public static final class b extends h.b<Argument, b> implements kotlin.reflect.jvm.internal.impl.metadata.b {

                /* renamed from: c, reason: collision with root package name */
                public int f408621c;

                /* renamed from: d, reason: collision with root package name */
                public int f408622d;

                /* renamed from: e, reason: collision with root package name */
                public Value f408623e = Value.f408577q;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                    Argument argumentK = k();
                    if (argumentK.isInitialized()) {
                        return argumentK;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: clone */
                public final Object e() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: e */
                public final a.AbstractC11678a clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: f */
                public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: i */
                public final h.b clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                    l((Argument) hVar);
                    return this;
                }

                public final Argument k() {
                    Argument argument = new Argument(this, null);
                    int i12 = this.f408621c;
                    int i13 = (i12 & 1) != 1 ? 0 : 1;
                    argument.f408573d = this.f408622d;
                    if ((i12 & 2) == 2) {
                        i13 |= 2;
                    }
                    argument.f408574e = this.f408623e;
                    argument.f408572c = i13;
                    return argument;
                }

                public final void l(Argument argument) {
                    Value value;
                    if (argument == Argument.f408569h) {
                        return;
                    }
                    int i12 = argument.f408572c;
                    if ((i12 & 1) == 1) {
                        int i13 = argument.f408573d;
                        this.f408621c = 1 | this.f408621c;
                        this.f408622d = i13;
                    }
                    if ((i12 & 2) == 2) {
                        Value value2 = argument.f408574e;
                        if ((this.f408621c & 2) != 2 || (value = this.f408623e) == Value.f408577q) {
                            this.f408623e = value2;
                        } else {
                            Value.b bVar = new Value.b();
                            bVar.l(value);
                            bVar.l(value2);
                            this.f408623e = bVar.k();
                        }
                        this.f408621c |= 2;
                    }
                    this.f409359b = this.f409359b.b(argument.f408571b);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.f408570i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r2.l(r3)
                        return
                    Lf:
                        r3 = move-exception
                        goto L19
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L17
                    L17:
                        r3 = move-exception
                        r0 = r4
                    L19:
                        if (r0 == 0) goto L1e
                        r2.l(r0)
                    L1e:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
                }
            }

            static {
                Argument argument = new Argument();
                f408569h = argument;
                argument.f408573d = 0;
                argument.f408574e = Value.f408577q;
            }

            public Argument(h.b bVar, a aVar) {
                this.f408575f = (byte) -1;
                this.f408576g = -1;
                this.f408571b = bVar.f409359b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f408572c & 1) == 1) {
                    codedOutputStream.m(1, this.f408573d);
                }
                if ((this.f408572c & 2) == 2) {
                    codedOutputStream.o(2, this.f408574e);
                }
                codedOutputStream.r(this.f408571b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final int getSerializedSize() {
                int i12 = this.f408576g;
                if (i12 != -1) {
                    return i12;
                }
                int iB2 = (this.f408572c & 1) == 1 ? CodedOutputStream.b(1, this.f408573d) : 0;
                if ((this.f408572c & 2) == 2) {
                    iB2 += CodedOutputStream.d(2, this.f408574e);
                }
                int size = this.f408571b.size() + iB2;
                this.f408576g = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b12 = this.f408575f;
                if (b12 == 1) {
                    return true;
                }
                if (b12 == 0) {
                    return false;
                }
                int i12 = this.f408572c;
                if ((i12 & 1) != 1) {
                    this.f408575f = (byte) 0;
                    return false;
                }
                if ((i12 & 2) != 2) {
                    this.f408575f = (byte) 0;
                    return false;
                }
                if (this.f408574e.isInitialized()) {
                    this.f408575f = (byte) 1;
                    return true;
                }
                this.f408575f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a newBuilderForType() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a toBuilder() {
                b bVar = new b();
                bVar.l(this);
                return bVar;
            }

            public static final class Value extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.a {

                /* renamed from: q, reason: collision with root package name */
                public static final Value f408577q;

                /* renamed from: r, reason: collision with root package name */
                public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Value> f408578r = new a();

                /* renamed from: b, reason: collision with root package name */
                public final kotlin.reflect.jvm.internal.impl.protobuf.d f408579b;

                /* renamed from: c, reason: collision with root package name */
                public int f408580c;

                /* renamed from: d, reason: collision with root package name */
                public Type f408581d;

                /* renamed from: e, reason: collision with root package name */
                public long f408582e;

                /* renamed from: f, reason: collision with root package name */
                public float f408583f;

                /* renamed from: g, reason: collision with root package name */
                public double f408584g;

                /* renamed from: h, reason: collision with root package name */
                public int f408585h;

                /* renamed from: i, reason: collision with root package name */
                public int f408586i;

                /* renamed from: j, reason: collision with root package name */
                public int f408587j;

                /* renamed from: k, reason: collision with root package name */
                public Annotation f408588k;

                /* renamed from: l, reason: collision with root package name */
                public List<Value> f408589l;

                /* renamed from: m, reason: collision with root package name */
                public int f408590m;

                /* renamed from: n, reason: collision with root package name */
                public int f408591n;

                /* renamed from: o, reason: collision with root package name */
                public byte f408592o;

                /* renamed from: p, reason: collision with root package name */
                public int f408593p;

                public enum Type implements i.a {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);


                    /* renamed from: b, reason: collision with root package name */
                    public final int f408608b;

                    public static class a implements i.b<Type> {
                    }

                    static {
                        new a();
                    }

                    Type(int i12) {
                        this.f408608b = i12;
                    }

                    public static Type a(int i12) {
                        switch (i12) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                    public final int getNumber() {
                        return this.f408608b;
                    }
                }

                public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                    public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                        return new Value(eVar, fVar, null);
                    }
                }

                public static final class b extends h.b<Value, b> implements kotlin.reflect.jvm.internal.impl.metadata.a {

                    /* renamed from: c, reason: collision with root package name */
                    public int f408609c;

                    /* renamed from: e, reason: collision with root package name */
                    public long f408611e;

                    /* renamed from: f, reason: collision with root package name */
                    public float f408612f;

                    /* renamed from: g, reason: collision with root package name */
                    public double f408613g;

                    /* renamed from: h, reason: collision with root package name */
                    public int f408614h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f408615i;

                    /* renamed from: j, reason: collision with root package name */
                    public int f408616j;

                    /* renamed from: m, reason: collision with root package name */
                    public int f408619m;

                    /* renamed from: n, reason: collision with root package name */
                    public int f408620n;

                    /* renamed from: d, reason: collision with root package name */
                    public Type f408610d = Type.BYTE;

                    /* renamed from: k, reason: collision with root package name */
                    public Annotation f408617k = Annotation.f408561h;

                    /* renamed from: l, reason: collision with root package name */
                    public List<Value> f408618l = Collections.emptyList();

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                    public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                        Value valueK = k();
                        if (valueK.isInitialized()) {
                            return valueK;
                        }
                        throw new UninitializedMessageException();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                    /* renamed from: clone */
                    public final Object e() {
                        b bVar = new b();
                        bVar.l(k());
                        return bVar;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                    public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                        m(eVar, fVar);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                    /* renamed from: e */
                    public final a.AbstractC11678a clone() {
                        b bVar = new b();
                        bVar.l(k());
                        return bVar;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                    /* renamed from: f */
                    public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                        m(eVar, fVar);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: i */
                    public final h.b clone() {
                        b bVar = new b();
                        bVar.l(k());
                        return bVar;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                        l((Value) hVar);
                        return this;
                    }

                    public final Value k() {
                        Value value = new Value(this, null);
                        int i12 = this.f408609c;
                        int i13 = (i12 & 1) != 1 ? 0 : 1;
                        value.f408581d = this.f408610d;
                        if ((i12 & 2) == 2) {
                            i13 |= 2;
                        }
                        value.f408582e = this.f408611e;
                        if ((i12 & 4) == 4) {
                            i13 |= 4;
                        }
                        value.f408583f = this.f408612f;
                        if ((i12 & 8) == 8) {
                            i13 |= 8;
                        }
                        value.f408584g = this.f408613g;
                        if ((i12 & 16) == 16) {
                            i13 |= 16;
                        }
                        value.f408585h = this.f408614h;
                        if ((i12 & 32) == 32) {
                            i13 |= 32;
                        }
                        value.f408586i = this.f408615i;
                        if ((i12 & 64) == 64) {
                            i13 |= 64;
                        }
                        value.f408587j = this.f408616j;
                        if ((i12 & 128) == 128) {
                            i13 |= 128;
                        }
                        value.f408588k = this.f408617k;
                        if ((i12 & 256) == 256) {
                            this.f408618l = Collections.unmodifiableList(this.f408618l);
                            this.f408609c &= -257;
                        }
                        value.f408589l = this.f408618l;
                        if ((i12 & 512) == 512) {
                            i13 |= 256;
                        }
                        value.f408590m = this.f408619m;
                        if ((i12 & 1024) == 1024) {
                            i13 |= 512;
                        }
                        value.f408591n = this.f408620n;
                        value.f408580c = i13;
                        return value;
                    }

                    public final void l(Value value) {
                        Annotation annotation;
                        if (value == Value.f408577q) {
                            return;
                        }
                        if ((value.f408580c & 1) == 1) {
                            Type type = value.f408581d;
                            type.getClass();
                            this.f408609c = 1 | this.f408609c;
                            this.f408610d = type;
                        }
                        int i12 = value.f408580c;
                        if ((i12 & 2) == 2) {
                            long j12 = value.f408582e;
                            this.f408609c |= 2;
                            this.f408611e = j12;
                        }
                        if ((i12 & 4) == 4) {
                            float f12 = value.f408583f;
                            this.f408609c = 4 | this.f408609c;
                            this.f408612f = f12;
                        }
                        if ((i12 & 8) == 8) {
                            double d12 = value.f408584g;
                            this.f408609c |= 8;
                            this.f408613g = d12;
                        }
                        if ((i12 & 16) == 16) {
                            int i13 = value.f408585h;
                            this.f408609c = 16 | this.f408609c;
                            this.f408614h = i13;
                        }
                        if ((i12 & 32) == 32) {
                            int i14 = value.f408586i;
                            this.f408609c = 32 | this.f408609c;
                            this.f408615i = i14;
                        }
                        if ((i12 & 64) == 64) {
                            int i15 = value.f408587j;
                            this.f408609c = 64 | this.f408609c;
                            this.f408616j = i15;
                        }
                        if ((i12 & 128) == 128) {
                            Annotation annotation2 = value.f408588k;
                            if ((this.f408609c & 128) != 128 || (annotation = this.f408617k) == Annotation.f408561h) {
                                this.f408617k = annotation2;
                            } else {
                                b bVar = new b();
                                bVar.l(annotation);
                                bVar.l(annotation2);
                                this.f408617k = bVar.k();
                            }
                            this.f408609c |= 128;
                        }
                        if (!value.f408589l.isEmpty()) {
                            if (this.f408618l.isEmpty()) {
                                this.f408618l = value.f408589l;
                                this.f408609c &= -257;
                            } else {
                                if ((this.f408609c & 256) != 256) {
                                    this.f408618l = new ArrayList(this.f408618l);
                                    this.f408609c |= 256;
                                }
                                this.f408618l.addAll(value.f408589l);
                            }
                        }
                        int i16 = value.f408580c;
                        if ((i16 & 256) == 256) {
                            int i17 = value.f408590m;
                            this.f408609c |= 512;
                            this.f408619m = i17;
                        }
                        if ((i16 & 512) == 512) {
                            int i18 = value.f408591n;
                            this.f408609c |= 1024;
                            this.f408620n = i18;
                        }
                        this.f409359b = this.f409359b.b(value.f408579b);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.f408578r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            r2.l(r3)
                            return
                        Lf:
                            r3 = move-exception
                            goto L19
                        L11:
                            r3 = move-exception
                            kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> Lf
                            throw r3     // Catch: java.lang.Throwable -> L17
                        L17:
                            r3 = move-exception
                            r0 = r4
                        L19:
                            if (r0 == 0) goto L1e
                            r2.l(r0)
                        L1e:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
                    }
                }

                static {
                    Value value = new Value();
                    f408577q = value;
                    value.e();
                }

                public Value(h.b bVar, a aVar) {
                    this.f408592o = (byte) -1;
                    this.f408593p = -1;
                    this.f408579b = bVar.f409359b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final void a(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.f408580c & 1) == 1) {
                        codedOutputStream.l(1, this.f408581d.f408608b);
                    }
                    if ((this.f408580c & 2) == 2) {
                        long j12 = this.f408582e;
                        codedOutputStream.x(2, 0);
                        codedOutputStream.w((j12 >> 63) ^ (j12 << 1));
                    }
                    if ((this.f408580c & 4) == 4) {
                        float f12 = this.f408583f;
                        codedOutputStream.x(3, 5);
                        codedOutputStream.t(Float.floatToRawIntBits(f12));
                    }
                    if ((this.f408580c & 8) == 8) {
                        double d12 = this.f408584g;
                        codedOutputStream.x(4, 1);
                        codedOutputStream.u(Double.doubleToRawLongBits(d12));
                    }
                    if ((this.f408580c & 16) == 16) {
                        codedOutputStream.m(5, this.f408585h);
                    }
                    if ((this.f408580c & 32) == 32) {
                        codedOutputStream.m(6, this.f408586i);
                    }
                    if ((this.f408580c & 64) == 64) {
                        codedOutputStream.m(7, this.f408587j);
                    }
                    if ((this.f408580c & 128) == 128) {
                        codedOutputStream.o(8, this.f408588k);
                    }
                    for (int i12 = 0; i12 < this.f408589l.size(); i12++) {
                        codedOutputStream.o(9, this.f408589l.get(i12));
                    }
                    if ((this.f408580c & 512) == 512) {
                        codedOutputStream.m(10, this.f408591n);
                    }
                    if ((this.f408580c & 256) == 256) {
                        codedOutputStream.m(11, this.f408590m);
                    }
                    codedOutputStream.r(this.f408579b);
                }

                public final void e() {
                    this.f408581d = Type.BYTE;
                    this.f408582e = 0L;
                    this.f408583f = 0.0f;
                    this.f408584g = 0.0d;
                    this.f408585h = 0;
                    this.f408586i = 0;
                    this.f408587j = 0;
                    this.f408588k = Annotation.f408561h;
                    this.f408589l = Collections.emptyList();
                    this.f408590m = 0;
                    this.f408591n = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final int getSerializedSize() {
                    int i12 = this.f408593p;
                    if (i12 != -1) {
                        return i12;
                    }
                    int iA2 = (this.f408580c & 1) == 1 ? CodedOutputStream.a(1, this.f408581d.f408608b) : 0;
                    if ((this.f408580c & 2) == 2) {
                        long j12 = this.f408582e;
                        iA2 += CodedOutputStream.g((j12 >> 63) ^ (j12 << 1)) + CodedOutputStream.h(2);
                    }
                    if ((this.f408580c & 4) == 4) {
                        iA2 += CodedOutputStream.h(3) + 4;
                    }
                    if ((this.f408580c & 8) == 8) {
                        iA2 += CodedOutputStream.h(4) + 8;
                    }
                    if ((this.f408580c & 16) == 16) {
                        iA2 += CodedOutputStream.b(5, this.f408585h);
                    }
                    if ((this.f408580c & 32) == 32) {
                        iA2 += CodedOutputStream.b(6, this.f408586i);
                    }
                    if ((this.f408580c & 64) == 64) {
                        iA2 += CodedOutputStream.b(7, this.f408587j);
                    }
                    if ((this.f408580c & 128) == 128) {
                        iA2 += CodedOutputStream.d(8, this.f408588k);
                    }
                    for (int i13 = 0; i13 < this.f408589l.size(); i13++) {
                        iA2 += CodedOutputStream.d(9, this.f408589l.get(i13));
                    }
                    if ((this.f408580c & 512) == 512) {
                        iA2 += CodedOutputStream.b(10, this.f408591n);
                    }
                    if ((this.f408580c & 256) == 256) {
                        iA2 += CodedOutputStream.b(11, this.f408590m);
                    }
                    int size = this.f408579b.size() + iA2;
                    this.f408593p = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                public final boolean isInitialized() {
                    byte b12 = this.f408592o;
                    if (b12 == 1) {
                        return true;
                    }
                    if (b12 == 0) {
                        return false;
                    }
                    if ((this.f408580c & 128) == 128 && !this.f408588k.isInitialized()) {
                        this.f408592o = (byte) 0;
                        return false;
                    }
                    for (int i12 = 0; i12 < this.f408589l.size(); i12++) {
                        if (!this.f408589l.get(i12).isInitialized()) {
                            this.f408592o = (byte) 0;
                            return false;
                        }
                    }
                    this.f408592o = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final o.a newBuilderForType() {
                    return new b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final o.a toBuilder() {
                    b bVar = new b();
                    bVar.l(this);
                    return bVar;
                }

                public Value() {
                    this.f408592o = (byte) -1;
                    this.f408593p = -1;
                    this.f408579b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                public Value(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
                    b bVar;
                    this.f408592o = (byte) -1;
                    this.f408593p = -1;
                    e();
                    d.b bVar2 = new d.b();
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar2, 1);
                    boolean z12 = false;
                    char c12 = 0;
                    while (true) {
                        ?? Q12 = 256;
                        if (!z12) {
                            try {
                                try {
                                    int iN2 = eVar.n();
                                    switch (iN2) {
                                        case 0:
                                            z12 = true;
                                        case 8:
                                            int iK2 = eVar.k();
                                            Type typeA = Type.a(iK2);
                                            if (typeA == null) {
                                                codedOutputStreamJ.v(iN2);
                                                codedOutputStreamJ.v(iK2);
                                            } else {
                                                this.f408580c |= 1;
                                                this.f408581d = typeA;
                                            }
                                        case 16:
                                            this.f408580c |= 2;
                                            long jL2 = eVar.l();
                                            this.f408582e = (-(jL2 & 1)) ^ (jL2 >>> 1);
                                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                            this.f408580c |= 4;
                                            this.f408583f = Float.intBitsToFloat(eVar.i());
                                        case 33:
                                            this.f408580c |= 8;
                                            this.f408584g = Double.longBitsToDouble(eVar.j());
                                        case 40:
                                            this.f408580c |= 16;
                                            this.f408585h = eVar.k();
                                        case 48:
                                            this.f408580c |= 32;
                                            this.f408586i = eVar.k();
                                        case 56:
                                            this.f408580c |= 64;
                                            this.f408587j = eVar.k();
                                        case 66:
                                            if ((this.f408580c & 128) == 128) {
                                                Annotation annotation = this.f408588k;
                                                annotation.getClass();
                                                bVar = new b();
                                                bVar.l(annotation);
                                            } else {
                                                bVar = null;
                                            }
                                            Annotation annotation2 = (Annotation) eVar.g(Annotation.f408562i, fVar);
                                            this.f408588k = annotation2;
                                            if (bVar != null) {
                                                bVar.l(annotation2);
                                                this.f408588k = bVar.k();
                                            }
                                            this.f408580c |= 128;
                                        case 74:
                                            if ((c12 & 256) != 256) {
                                                this.f408589l = new ArrayList();
                                                c12 = 256;
                                            }
                                            this.f408589l.add(eVar.g(f408578r, fVar));
                                        case 80:
                                            this.f408580c |= 512;
                                            this.f408591n = eVar.k();
                                        case 88:
                                            this.f408580c |= 256;
                                            this.f408590m = eVar.k();
                                        default:
                                            Q12 = eVar.q(iN2, codedOutputStreamJ);
                                            if (Q12 == 0) {
                                                z12 = true;
                                            }
                                    }
                                } catch (InvalidProtocolBufferException e12) {
                                    e12.f409295b = this;
                                    throw e12;
                                } catch (IOException e13) {
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                                    invalidProtocolBufferException.f409295b = this;
                                    throw invalidProtocolBufferException;
                                }
                            } catch (Throwable th2) {
                                if ((c12 & 256) == Q12) {
                                    this.f408589l = Collections.unmodifiableList(this.f408589l);
                                }
                                try {
                                    codedOutputStreamJ.i();
                                } catch (IOException unused) {
                                } catch (Throwable th3) {
                                    this.f408579b = bVar2.c();
                                    throw th3;
                                }
                                this.f408579b = bVar2.c();
                                throw th2;
                            }
                        } else {
                            if ((c12 & 256) == 256) {
                                this.f408589l = Collections.unmodifiableList(this.f408589l);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused2) {
                            } catch (Throwable th4) {
                                this.f408579b = bVar2.c();
                                throw th4;
                            }
                            this.f408579b = bVar2.c();
                            return;
                        }
                    }
                }
            }

            public Argument() {
                this.f408575f = (byte) -1;
                this.f408576g = -1;
                this.f408571b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
            }

            public Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
                Value.b bVar;
                this.f408575f = (byte) -1;
                this.f408576g = -1;
                boolean z12 = false;
                this.f408573d = 0;
                this.f408574e = Value.f408577q;
                d.b bVar2 = new d.b();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar2, 1);
                while (!z12) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f408572c |= 1;
                                    this.f408573d = eVar.k();
                                } else if (iN2 != 18) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if ((this.f408572c & 2) == 2) {
                                        Value value = this.f408574e;
                                        value.getClass();
                                        bVar = new Value.b();
                                        bVar.l(value);
                                    } else {
                                        bVar = null;
                                    }
                                    Value value2 = (Value) eVar.g(Value.f408578r, fVar);
                                    this.f408574e = value2;
                                    if (bVar != null) {
                                        bVar.l(value2);
                                        this.f408574e = bVar.k();
                                    }
                                    this.f408572c |= 2;
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        } catch (IOException e13) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                            invalidProtocolBufferException.f409295b = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408571b = bVar2.c();
                            throw th3;
                        }
                        this.f408571b = bVar2.c();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f408571b = bVar2.c();
                    throw th4;
                }
                this.f408571b = bVar2.c();
            }
        }

        public Annotation() {
            this.f408567f = (byte) -1;
            this.f408568g = -1;
            this.f408563b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Annotation(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408567f = (byte) -1;
            this.f408568g = -1;
            boolean z12 = false;
            this.f408565d = 0;
            this.f408566e = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            char c12 = 0;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f408564c |= 1;
                                    this.f408565d = eVar.k();
                                } else if (iN2 != 18) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if ((c12 & 2) != 2) {
                                        this.f408566e = new ArrayList();
                                        c12 = 2;
                                    }
                                    this.f408566e.add(eVar.g(Argument.f408570i, fVar));
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if ((c12 & 2) == 2) {
                        this.f408566e = Collections.unmodifiableList(this.f408566e);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408563b = bVar.c();
                        throw th3;
                    }
                    this.f408563b = bVar.c();
                    throw th2;
                }
            }
            if ((c12 & 2) == 2) {
                this.f408566e = Collections.unmodifiableList(this.f408566e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408563b = bVar.c();
                throw th4;
            }
            this.f408563b = bVar.c();
        }
    }

    public static final class QualifiedNameTable extends kotlin.reflect.jvm.internal.impl.protobuf.h implements o {

        /* renamed from: f, reason: collision with root package name */
        public static final QualifiedNameTable f408750f;

        /* renamed from: g, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<QualifiedNameTable> f408751g = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408752b;

        /* renamed from: c, reason: collision with root package name */
        public List<QualifiedName> f408753c;

        /* renamed from: d, reason: collision with root package name */
        public byte f408754d;

        /* renamed from: e, reason: collision with root package name */
        public int f408755e;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new QualifiedNameTable(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<QualifiedNameTable, b> implements o {

            /* renamed from: c, reason: collision with root package name */
            public int f408774c;

            /* renamed from: d, reason: collision with root package name */
            public List<QualifiedName> f408775d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                QualifiedNameTable qualifiedNameTableK = k();
                if (qualifiedNameTableK.isInitialized()) {
                    return qualifiedNameTableK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((QualifiedNameTable) hVar);
                return this;
            }

            public final QualifiedNameTable k() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this, null);
                if ((this.f408774c & 1) == 1) {
                    this.f408775d = Collections.unmodifiableList(this.f408775d);
                    this.f408774c &= -2;
                }
                qualifiedNameTable.f408753c = this.f408775d;
                return qualifiedNameTable;
            }

            public final void l(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.f408750f) {
                    return;
                }
                if (!qualifiedNameTable.f408753c.isEmpty()) {
                    if (this.f408775d.isEmpty()) {
                        this.f408775d = qualifiedNameTable.f408753c;
                        this.f408774c &= -2;
                    } else {
                        if ((this.f408774c & 1) != 1) {
                            this.f408775d = new ArrayList(this.f408775d);
                            this.f408774c |= 1;
                        }
                        this.f408775d.addAll(qualifiedNameTable.f408753c);
                    }
                }
                this.f409359b = this.f409359b.b(qualifiedNameTable.f408752b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.f408751g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f408750f = qualifiedNameTable;
            qualifiedNameTable.f408753c = Collections.emptyList();
        }

        public QualifiedNameTable(h.b bVar, a aVar) {
            this.f408754d = (byte) -1;
            this.f408755e = -1;
            this.f408752b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f408753c.size(); i12++) {
                codedOutputStream.o(1, this.f408753c.get(i12));
            }
            codedOutputStream.r(this.f408752b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408755e;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = 0;
            for (int i13 = 0; i13 < this.f408753c.size(); i13++) {
                iD2 += CodedOutputStream.d(1, this.f408753c.get(i13));
            }
            int size = this.f408752b.size() + iD2;
            this.f408755e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408754d;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408753c.size(); i12++) {
                if (!this.f408753c.get(i12).isInitialized()) {
                    this.f408754d = (byte) 0;
                    return false;
                }
            }
            this.f408754d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public static final class QualifiedName extends kotlin.reflect.jvm.internal.impl.protobuf.h implements n {

            /* renamed from: i, reason: collision with root package name */
            public static final QualifiedName f408756i;

            /* renamed from: j, reason: collision with root package name */
            public static final kotlin.reflect.jvm.internal.impl.protobuf.q<QualifiedName> f408757j = new a();

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.reflect.jvm.internal.impl.protobuf.d f408758b;

            /* renamed from: c, reason: collision with root package name */
            public int f408759c;

            /* renamed from: d, reason: collision with root package name */
            public int f408760d;

            /* renamed from: e, reason: collision with root package name */
            public int f408761e;

            /* renamed from: f, reason: collision with root package name */
            public Kind f408762f;

            /* renamed from: g, reason: collision with root package name */
            public byte f408763g;

            /* renamed from: h, reason: collision with root package name */
            public int f408764h;

            public enum Kind implements i.a {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);


                /* renamed from: b, reason: collision with root package name */
                public final int f408769b;

                public static class a implements i.b<Kind> {
                }

                static {
                    new a();
                }

                Kind(int i12) {
                    this.f408769b = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.f408769b;
                }
            }

            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new QualifiedName(eVar, fVar, null);
                }
            }

            public static final class b extends h.b<QualifiedName, b> implements n {

                /* renamed from: c, reason: collision with root package name */
                public int f408770c;

                /* renamed from: e, reason: collision with root package name */
                public int f408772e;

                /* renamed from: d, reason: collision with root package name */
                public int f408771d = -1;

                /* renamed from: f, reason: collision with root package name */
                public Kind f408773f = Kind.PACKAGE;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                    QualifiedName qualifiedNameK = k();
                    if (qualifiedNameK.isInitialized()) {
                        return qualifiedNameK;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: clone */
                public final Object e() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: e */
                public final a.AbstractC11678a clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: f */
                public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: i */
                public final h.b clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                    l((QualifiedName) hVar);
                    return this;
                }

                public final QualifiedName k() {
                    QualifiedName qualifiedName = new QualifiedName(this, null);
                    int i12 = this.f408770c;
                    int i13 = (i12 & 1) != 1 ? 0 : 1;
                    qualifiedName.f408760d = this.f408771d;
                    if ((i12 & 2) == 2) {
                        i13 |= 2;
                    }
                    qualifiedName.f408761e = this.f408772e;
                    if ((i12 & 4) == 4) {
                        i13 |= 4;
                    }
                    qualifiedName.f408762f = this.f408773f;
                    qualifiedName.f408759c = i13;
                    return qualifiedName;
                }

                public final void l(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.f408756i) {
                        return;
                    }
                    int i12 = qualifiedName.f408759c;
                    if ((i12 & 1) == 1) {
                        int i13 = qualifiedName.f408760d;
                        this.f408770c = 1 | this.f408770c;
                        this.f408771d = i13;
                    }
                    if ((i12 & 2) == 2) {
                        int i14 = qualifiedName.f408761e;
                        this.f408770c = 2 | this.f408770c;
                        this.f408772e = i14;
                    }
                    if ((i12 & 4) == 4) {
                        Kind kind = qualifiedName.f408762f;
                        kind.getClass();
                        this.f408770c = 4 | this.f408770c;
                        this.f408773f = kind;
                    }
                    this.f409359b = this.f409359b.b(qualifiedName.f408758b);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.f408757j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r2.l(r3)
                        return
                    Lf:
                        r3 = move-exception
                        goto L19
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L17
                    L17:
                        r3 = move-exception
                        r0 = r4
                    L19:
                        if (r0 == 0) goto L1e
                        r2.l(r0)
                    L1e:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f408756i = qualifiedName;
                qualifiedName.f408760d = -1;
                qualifiedName.f408761e = 0;
                qualifiedName.f408762f = Kind.PACKAGE;
            }

            public QualifiedName(h.b bVar, a aVar) {
                this.f408763g = (byte) -1;
                this.f408764h = -1;
                this.f408758b = bVar.f409359b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f408759c & 1) == 1) {
                    codedOutputStream.m(1, this.f408760d);
                }
                if ((this.f408759c & 2) == 2) {
                    codedOutputStream.m(2, this.f408761e);
                }
                if ((this.f408759c & 4) == 4) {
                    codedOutputStream.l(3, this.f408762f.f408769b);
                }
                codedOutputStream.r(this.f408758b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final int getSerializedSize() {
                int i12 = this.f408764h;
                if (i12 != -1) {
                    return i12;
                }
                int iB2 = (this.f408759c & 1) == 1 ? CodedOutputStream.b(1, this.f408760d) : 0;
                if ((this.f408759c & 2) == 2) {
                    iB2 += CodedOutputStream.b(2, this.f408761e);
                }
                if ((this.f408759c & 4) == 4) {
                    iB2 += CodedOutputStream.a(3, this.f408762f.f408769b);
                }
                int size = this.f408758b.size() + iB2;
                this.f408764h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b12 = this.f408763g;
                if (b12 == 1) {
                    return true;
                }
                if (b12 == 0) {
                    return false;
                }
                if ((this.f408759c & 2) == 2) {
                    this.f408763g = (byte) 1;
                    return true;
                }
                this.f408763g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a newBuilderForType() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a toBuilder() {
                b bVar = new b();
                bVar.l(this);
                return bVar;
            }

            public QualifiedName() {
                this.f408763g = (byte) -1;
                this.f408764h = -1;
                this.f408758b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
            }

            public QualifiedName(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
                Kind kind;
                this.f408763g = (byte) -1;
                this.f408764h = -1;
                this.f408760d = -1;
                boolean z12 = false;
                this.f408761e = 0;
                this.f408762f = Kind.PACKAGE;
                d.b bVar = new d.b();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
                while (!z12) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f408759c |= 1;
                                    this.f408760d = eVar.k();
                                } else if (iN2 == 16) {
                                    this.f408759c |= 2;
                                    this.f408761e = eVar.k();
                                } else if (iN2 != 24) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    int iK2 = eVar.k();
                                    if (iK2 == 0) {
                                        kind = Kind.CLASS;
                                    } else if (iK2 != 1) {
                                        kind = iK2 != 2 ? null : Kind.LOCAL;
                                    } else {
                                        kind = Kind.PACKAGE;
                                    }
                                    if (kind == null) {
                                        codedOutputStreamJ.v(iN2);
                                        codedOutputStreamJ.v(iK2);
                                    } else {
                                        this.f408759c |= 4;
                                        this.f408762f = kind;
                                    }
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        } catch (IOException e13) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                            invalidProtocolBufferException.f409295b = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408758b = bVar.c();
                            throw th3;
                        }
                        this.f408758b = bVar.c();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f408758b = bVar.c();
                    throw th4;
                }
                this.f408758b = bVar.c();
            }
        }

        public QualifiedNameTable() {
            this.f408754d = (byte) -1;
            this.f408755e = -1;
            this.f408752b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QualifiedNameTable(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408754d = (byte) -1;
            this.f408755e = -1;
            this.f408753c = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 != 10) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if (!z13) {
                                        this.f408753c = new ArrayList();
                                        z13 = true;
                                    }
                                    this.f408753c.add(eVar.g(QualifiedName.f408757j, fVar));
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (z13) {
                        this.f408753c = Collections.unmodifiableList(this.f408753c);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408752b = bVar.c();
                        throw th3;
                    }
                    this.f408752b = bVar.c();
                    throw th2;
                }
            }
            if (z13) {
                this.f408753c = Collections.unmodifiableList(this.f408753c);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408752b = bVar.c();
                throw th4;
            }
            this.f408752b = bVar.c();
        }
    }

    public static final class Type extends h.d<Type> implements s {

        /* renamed from: u, reason: collision with root package name */
        public static final Type f408776u;

        /* renamed from: v, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Type> f408777v = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408778c;

        /* renamed from: d, reason: collision with root package name */
        public int f408779d;

        /* renamed from: e, reason: collision with root package name */
        public List<Argument> f408780e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f408781f;

        /* renamed from: g, reason: collision with root package name */
        public int f408782g;

        /* renamed from: h, reason: collision with root package name */
        public Type f408783h;

        /* renamed from: i, reason: collision with root package name */
        public int f408784i;

        /* renamed from: j, reason: collision with root package name */
        public int f408785j;

        /* renamed from: k, reason: collision with root package name */
        public int f408786k;

        /* renamed from: l, reason: collision with root package name */
        public int f408787l;

        /* renamed from: m, reason: collision with root package name */
        public int f408788m;

        /* renamed from: n, reason: collision with root package name */
        public Type f408789n;

        /* renamed from: o, reason: collision with root package name */
        public int f408790o;

        /* renamed from: p, reason: collision with root package name */
        public Type f408791p;

        /* renamed from: q, reason: collision with root package name */
        public int f408792q;

        /* renamed from: r, reason: collision with root package name */
        public int f408793r;

        /* renamed from: s, reason: collision with root package name */
        public byte f408794s;

        /* renamed from: t, reason: collision with root package name */
        public int f408795t;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Type(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<Type, b> implements s {

            /* renamed from: e, reason: collision with root package name */
            public int f408815e;

            /* renamed from: f, reason: collision with root package name */
            public List<Argument> f408816f = Collections.emptyList();

            /* renamed from: g, reason: collision with root package name */
            public boolean f408817g;

            /* renamed from: h, reason: collision with root package name */
            public int f408818h;

            /* renamed from: i, reason: collision with root package name */
            public Type f408819i;

            /* renamed from: j, reason: collision with root package name */
            public int f408820j;

            /* renamed from: k, reason: collision with root package name */
            public int f408821k;

            /* renamed from: l, reason: collision with root package name */
            public int f408822l;

            /* renamed from: m, reason: collision with root package name */
            public int f408823m;

            /* renamed from: n, reason: collision with root package name */
            public int f408824n;

            /* renamed from: o, reason: collision with root package name */
            public Type f408825o;

            /* renamed from: p, reason: collision with root package name */
            public int f408826p;

            /* renamed from: q, reason: collision with root package name */
            public Type f408827q;

            /* renamed from: r, reason: collision with root package name */
            public int f408828r;

            /* renamed from: s, reason: collision with root package name */
            public int f408829s;

            public b() {
                Type type = Type.f408776u;
                this.f408819i = type;
                this.f408825o = type;
                this.f408827q = type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                Type typeM = m();
                if (typeM.isInitialized()) {
                    return typeM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((Type) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final Type m() {
                Type type = new Type(this, null);
                int i12 = this.f408815e;
                if ((i12 & 1) == 1) {
                    this.f408816f = Collections.unmodifiableList(this.f408816f);
                    this.f408815e &= -2;
                }
                type.f408780e = this.f408816f;
                int i13 = (i12 & 2) != 2 ? 0 : 1;
                type.f408781f = this.f408817g;
                if ((i12 & 4) == 4) {
                    i13 |= 2;
                }
                type.f408782g = this.f408818h;
                if ((i12 & 8) == 8) {
                    i13 |= 4;
                }
                type.f408783h = this.f408819i;
                if ((i12 & 16) == 16) {
                    i13 |= 8;
                }
                type.f408784i = this.f408820j;
                if ((i12 & 32) == 32) {
                    i13 |= 16;
                }
                type.f408785j = this.f408821k;
                if ((i12 & 64) == 64) {
                    i13 |= 32;
                }
                type.f408786k = this.f408822l;
                if ((i12 & 128) == 128) {
                    i13 |= 64;
                }
                type.f408787l = this.f408823m;
                if ((i12 & 256) == 256) {
                    i13 |= 128;
                }
                type.f408788m = this.f408824n;
                if ((i12 & 512) == 512) {
                    i13 |= 256;
                }
                type.f408789n = this.f408825o;
                if ((i12 & 1024) == 1024) {
                    i13 |= 512;
                }
                type.f408790o = this.f408826p;
                if ((i12 & 2048) == 2048) {
                    i13 |= 1024;
                }
                type.f408791p = this.f408827q;
                if ((i12 & 4096) == 4096) {
                    i13 |= 2048;
                }
                type.f408792q = this.f408828r;
                if ((i12 & 8192) == 8192) {
                    i13 |= 4096;
                }
                type.f408793r = this.f408829s;
                type.f408779d = i13;
                return type;
            }

            public final b n(Type type) {
                Type type2;
                Type type3;
                Type type4;
                Type type5 = Type.f408776u;
                if (type == type5) {
                    return this;
                }
                if (!type.f408780e.isEmpty()) {
                    if (this.f408816f.isEmpty()) {
                        this.f408816f = type.f408780e;
                        this.f408815e &= -2;
                    } else {
                        if ((this.f408815e & 1) != 1) {
                            this.f408816f = new ArrayList(this.f408816f);
                            this.f408815e |= 1;
                        }
                        this.f408816f.addAll(type.f408780e);
                    }
                }
                int i12 = type.f408779d;
                if ((i12 & 1) == 1) {
                    boolean z12 = type.f408781f;
                    this.f408815e |= 2;
                    this.f408817g = z12;
                }
                if ((i12 & 2) == 2) {
                    int i13 = type.f408782g;
                    this.f408815e |= 4;
                    this.f408818h = i13;
                }
                if ((i12 & 4) == 4) {
                    Type type6 = type.f408783h;
                    if ((this.f408815e & 8) != 8 || (type4 = this.f408819i) == type5) {
                        this.f408819i = type6;
                    } else {
                        b bVarR = Type.r(type4);
                        bVarR.n(type6);
                        this.f408819i = bVarR.m();
                    }
                    this.f408815e |= 8;
                }
                if ((type.f408779d & 8) == 8) {
                    int i14 = type.f408784i;
                    this.f408815e |= 16;
                    this.f408820j = i14;
                }
                if (type.p()) {
                    int i15 = type.f408785j;
                    this.f408815e |= 32;
                    this.f408821k = i15;
                }
                int i16 = type.f408779d;
                if ((i16 & 32) == 32) {
                    int i17 = type.f408786k;
                    this.f408815e |= 64;
                    this.f408822l = i17;
                }
                if ((i16 & 64) == 64) {
                    int i18 = type.f408787l;
                    this.f408815e |= 128;
                    this.f408823m = i18;
                }
                if ((i16 & 128) == 128) {
                    int i19 = type.f408788m;
                    this.f408815e |= 256;
                    this.f408824n = i19;
                }
                if ((i16 & 256) == 256) {
                    Type type7 = type.f408789n;
                    if ((this.f408815e & 512) != 512 || (type3 = this.f408825o) == type5) {
                        this.f408825o = type7;
                    } else {
                        b bVarR2 = Type.r(type3);
                        bVarR2.n(type7);
                        this.f408825o = bVarR2.m();
                    }
                    this.f408815e |= 512;
                }
                int i22 = type.f408779d;
                if ((i22 & 512) == 512) {
                    int i23 = type.f408790o;
                    this.f408815e |= 1024;
                    this.f408826p = i23;
                }
                if ((i22 & 1024) == 1024) {
                    Type type8 = type.f408791p;
                    if ((this.f408815e & 2048) != 2048 || (type2 = this.f408827q) == type5) {
                        this.f408827q = type8;
                    } else {
                        b bVarR3 = Type.r(type2);
                        bVarR3.n(type8);
                        this.f408827q = bVarR3.m();
                    }
                    this.f408815e |= 2048;
                }
                int i24 = type.f408779d;
                if ((i24 & 2048) == 2048) {
                    int i25 = type.f408792q;
                    this.f408815e |= 4096;
                    this.f408828r = i25;
                }
                if ((i24 & 4096) == 4096) {
                    int i26 = type.f408793r;
                    this.f408815e |= 8192;
                    this.f408829s = i26;
                }
                l(type);
                this.f409359b = this.f409359b.b(type.f408778c);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.f408777v     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            Type type = new Type(0);
            f408776u = type;
            type.q();
        }

        public Type() {
            throw null;
        }

        public Type(h.c cVar, a aVar) {
            super(cVar);
            this.f408794s = (byte) -1;
            this.f408795t = -1;
            this.f408778c = cVar.f409359b;
        }

        public static b r(Type type) {
            b bVar = new b();
            bVar.n(type);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408779d & 4096) == 4096) {
                codedOutputStream.m(1, this.f408793r);
            }
            for (int i12 = 0; i12 < this.f408780e.size(); i12++) {
                codedOutputStream.o(2, this.f408780e.get(i12));
            }
            if ((this.f408779d & 1) == 1) {
                boolean z12 = this.f408781f;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z12 ? 1 : 0);
            }
            if ((this.f408779d & 2) == 2) {
                codedOutputStream.m(4, this.f408782g);
            }
            if ((this.f408779d & 4) == 4) {
                codedOutputStream.o(5, this.f408783h);
            }
            if ((this.f408779d & 16) == 16) {
                codedOutputStream.m(6, this.f408785j);
            }
            if ((this.f408779d & 32) == 32) {
                codedOutputStream.m(7, this.f408786k);
            }
            if ((this.f408779d & 8) == 8) {
                codedOutputStream.m(8, this.f408784i);
            }
            if ((this.f408779d & 64) == 64) {
                codedOutputStream.m(9, this.f408787l);
            }
            if ((this.f408779d & 256) == 256) {
                codedOutputStream.o(10, this.f408789n);
            }
            if ((this.f408779d & 512) == 512) {
                codedOutputStream.m(11, this.f408790o);
            }
            if ((this.f408779d & 128) == 128) {
                codedOutputStream.m(12, this.f408788m);
            }
            if ((this.f408779d & 1024) == 1024) {
                codedOutputStream.o(13, this.f408791p);
            }
            if ((this.f408779d & 2048) == 2048) {
                codedOutputStream.m(14, this.f408792q);
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f408778c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408776u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408795t;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408779d & 4096) == 4096 ? CodedOutputStream.b(1, this.f408793r) : 0;
            for (int i13 = 0; i13 < this.f408780e.size(); i13++) {
                iB2 += CodedOutputStream.d(2, this.f408780e.get(i13));
            }
            if ((this.f408779d & 1) == 1) {
                iB2 += CodedOutputStream.h(3) + 1;
            }
            if ((this.f408779d & 2) == 2) {
                iB2 += CodedOutputStream.b(4, this.f408782g);
            }
            if ((this.f408779d & 4) == 4) {
                iB2 += CodedOutputStream.d(5, this.f408783h);
            }
            if ((this.f408779d & 16) == 16) {
                iB2 += CodedOutputStream.b(6, this.f408785j);
            }
            if ((this.f408779d & 32) == 32) {
                iB2 += CodedOutputStream.b(7, this.f408786k);
            }
            if ((this.f408779d & 8) == 8) {
                iB2 += CodedOutputStream.b(8, this.f408784i);
            }
            if ((this.f408779d & 64) == 64) {
                iB2 += CodedOutputStream.b(9, this.f408787l);
            }
            if ((this.f408779d & 256) == 256) {
                iB2 += CodedOutputStream.d(10, this.f408789n);
            }
            if ((this.f408779d & 512) == 512) {
                iB2 += CodedOutputStream.b(11, this.f408790o);
            }
            if ((this.f408779d & 128) == 128) {
                iB2 += CodedOutputStream.b(12, this.f408788m);
            }
            if ((this.f408779d & 1024) == 1024) {
                iB2 += CodedOutputStream.d(13, this.f408791p);
            }
            if ((this.f408779d & 2048) == 2048) {
                iB2 += CodedOutputStream.b(14, this.f408792q);
            }
            int size = this.f408778c.size() + f() + iB2;
            this.f408795t = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408794s;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408780e.size(); i12++) {
                if (!this.f408780e.get(i12).isInitialized()) {
                    this.f408794s = (byte) 0;
                    return false;
                }
            }
            if ((this.f408779d & 4) == 4 && !this.f408783h.isInitialized()) {
                this.f408794s = (byte) 0;
                return false;
            }
            if ((this.f408779d & 256) == 256 && !this.f408789n.isInitialized()) {
                this.f408794s = (byte) 0;
                return false;
            }
            if ((this.f408779d & 1024) == 1024 && !this.f408791p.isInitialized()) {
                this.f408794s = (byte) 0;
                return false;
            }
            if (e()) {
                this.f408794s = (byte) 1;
                return true;
            }
            this.f408794s = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        public final boolean p() {
            return (this.f408779d & 16) == 16;
        }

        public final void q() {
            this.f408780e = Collections.emptyList();
            this.f408781f = false;
            this.f408782g = 0;
            Type type = f408776u;
            this.f408783h = type;
            this.f408784i = 0;
            this.f408785j = 0;
            this.f408786k = 0;
            this.f408787l = 0;
            this.f408788m = 0;
            this.f408789n = type;
            this.f408790o = 0;
            this.f408791p = type;
            this.f408792q = 0;
            this.f408793r = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final b toBuilder() {
            return r(this);
        }

        public static final class Argument extends kotlin.reflect.jvm.internal.impl.protobuf.h implements q {

            /* renamed from: i, reason: collision with root package name */
            public static final Argument f408796i;

            /* renamed from: j, reason: collision with root package name */
            public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Argument> f408797j = new a();

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.reflect.jvm.internal.impl.protobuf.d f408798b;

            /* renamed from: c, reason: collision with root package name */
            public int f408799c;

            /* renamed from: d, reason: collision with root package name */
            public Projection f408800d;

            /* renamed from: e, reason: collision with root package name */
            public Type f408801e;

            /* renamed from: f, reason: collision with root package name */
            public int f408802f;

            /* renamed from: g, reason: collision with root package name */
            public byte f408803g;

            /* renamed from: h, reason: collision with root package name */
            public int f408804h;

            public enum Projection implements i.a {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);


                /* renamed from: b, reason: collision with root package name */
                public final int f408810b;

                public static class a implements i.b<Projection> {
                }

                static {
                    new a();
                }

                Projection(int i12) {
                    this.f408810b = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.f408810b;
                }
            }

            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                    return new Argument(eVar, fVar, null);
                }
            }

            public static final class b extends h.b<Argument, b> implements q {

                /* renamed from: c, reason: collision with root package name */
                public int f408811c;

                /* renamed from: d, reason: collision with root package name */
                public Projection f408812d = Projection.INV;

                /* renamed from: e, reason: collision with root package name */
                public Type f408813e = Type.f408776u;

                /* renamed from: f, reason: collision with root package name */
                public int f408814f;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                    Argument argumentK = k();
                    if (argumentK.isInitialized()) {
                        return argumentK;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: clone */
                public final Object e() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: e */
                public final a.AbstractC11678a clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
                /* renamed from: f */
                public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                    m(eVar, fVar);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: i */
                public final h.b clone() {
                    b bVar = new b();
                    bVar.l(k());
                    return bVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                    l((Argument) hVar);
                    return this;
                }

                public final Argument k() {
                    Argument argument = new Argument(this, null);
                    int i12 = this.f408811c;
                    int i13 = (i12 & 1) != 1 ? 0 : 1;
                    argument.f408800d = this.f408812d;
                    if ((i12 & 2) == 2) {
                        i13 |= 2;
                    }
                    argument.f408801e = this.f408813e;
                    if ((i12 & 4) == 4) {
                        i13 |= 4;
                    }
                    argument.f408802f = this.f408814f;
                    argument.f408799c = i13;
                    return argument;
                }

                public final void l(Argument argument) {
                    Type type;
                    if (argument == Argument.f408796i) {
                        return;
                    }
                    if ((argument.f408799c & 1) == 1) {
                        Projection projection = argument.f408800d;
                        projection.getClass();
                        this.f408811c = 1 | this.f408811c;
                        this.f408812d = projection;
                    }
                    if ((argument.f408799c & 2) == 2) {
                        Type type2 = argument.f408801e;
                        if ((this.f408811c & 2) != 2 || (type = this.f408813e) == Type.f408776u) {
                            this.f408813e = type2;
                        } else {
                            b bVarR = Type.r(type);
                            bVarR.n(type2);
                            this.f408813e = bVarR.m();
                        }
                        this.f408811c |= 2;
                    }
                    if ((argument.f408799c & 4) == 4) {
                        int i12 = argument.f408802f;
                        this.f408811c = 4 | this.f408811c;
                        this.f408814f = i12;
                    }
                    this.f409359b = this.f409359b.b(argument.f408798b);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.f408797j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r2.l(r3)
                        return
                    Lf:
                        r3 = move-exception
                        goto L19
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L17
                    L17:
                        r3 = move-exception
                        r0 = r4
                    L19:
                        if (r0 == 0) goto L1e
                        r2.l(r0)
                    L1e:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
                }
            }

            static {
                Argument argument = new Argument();
                f408796i = argument;
                argument.f408800d = Projection.INV;
                argument.f408801e = Type.f408776u;
                argument.f408802f = 0;
            }

            public Argument(h.b bVar, a aVar) {
                this.f408803g = (byte) -1;
                this.f408804h = -1;
                this.f408798b = bVar.f409359b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f408799c & 1) == 1) {
                    codedOutputStream.l(1, this.f408800d.f408810b);
                }
                if ((this.f408799c & 2) == 2) {
                    codedOutputStream.o(2, this.f408801e);
                }
                if ((this.f408799c & 4) == 4) {
                    codedOutputStream.m(3, this.f408802f);
                }
                codedOutputStream.r(this.f408798b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final int getSerializedSize() {
                int i12 = this.f408804h;
                if (i12 != -1) {
                    return i12;
                }
                int iA2 = (this.f408799c & 1) == 1 ? CodedOutputStream.a(1, this.f408800d.f408810b) : 0;
                if ((this.f408799c & 2) == 2) {
                    iA2 += CodedOutputStream.d(2, this.f408801e);
                }
                if ((this.f408799c & 4) == 4) {
                    iA2 += CodedOutputStream.b(3, this.f408802f);
                }
                int size = this.f408798b.size() + iA2;
                this.f408804h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b12 = this.f408803g;
                if (b12 == 1) {
                    return true;
                }
                if (b12 == 0) {
                    return false;
                }
                if ((this.f408799c & 2) != 2 || this.f408801e.isInitialized()) {
                    this.f408803g = (byte) 1;
                    return true;
                }
                this.f408803g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a newBuilderForType() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final o.a toBuilder() {
                b bVar = new b();
                bVar.l(this);
                return bVar;
            }

            public Argument() {
                this.f408803g = (byte) -1;
                this.f408804h = -1;
                this.f408798b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
            }

            public Argument(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
                this.f408803g = (byte) -1;
                this.f408804h = -1;
                this.f408800d = Projection.INV;
                this.f408801e = Type.f408776u;
                boolean z12 = false;
                this.f408802f = 0;
                d.b bVar = new d.b();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
                while (!z12) {
                    try {
                        try {
                            try {
                                int iN2 = eVar.n();
                                if (iN2 != 0) {
                                    b bVarR = null;
                                    Projection projection = null;
                                    if (iN2 == 8) {
                                        int iK2 = eVar.k();
                                        if (iK2 == 0) {
                                            projection = Projection.IN;
                                        } else if (iK2 == 1) {
                                            projection = Projection.OUT;
                                        } else if (iK2 == 2) {
                                            projection = Projection.INV;
                                        } else if (iK2 == 3) {
                                            projection = Projection.STAR;
                                        }
                                        if (projection == null) {
                                            codedOutputStreamJ.v(iN2);
                                            codedOutputStreamJ.v(iK2);
                                        } else {
                                            this.f408799c |= 1;
                                            this.f408800d = projection;
                                        }
                                    } else if (iN2 == 18) {
                                        if ((this.f408799c & 2) == 2) {
                                            Type type = this.f408801e;
                                            type.getClass();
                                            bVarR = Type.r(type);
                                        }
                                        Type type2 = (Type) eVar.g(Type.f408777v, fVar);
                                        this.f408801e = type2;
                                        if (bVarR != null) {
                                            bVarR.n(type2);
                                            this.f408801e = bVarR.m();
                                        }
                                        this.f408799c |= 2;
                                    } else if (iN2 != 24) {
                                        if (!eVar.q(iN2, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        this.f408799c |= 4;
                                        this.f408802f = eVar.k();
                                    }
                                }
                                z12 = true;
                            } catch (InvalidProtocolBufferException e12) {
                                e12.f409295b = this;
                                throw e12;
                            }
                        } catch (IOException e13) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                            invalidProtocolBufferException.f409295b = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408798b = bVar.c();
                            throw th3;
                        }
                        this.f408798b = bVar.c();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f408798b = bVar.c();
                    throw th4;
                }
                this.f408798b = bVar.c();
            }
        }

        public Type(int i12) {
            this.f408794s = (byte) -1;
            this.f408795t = -1;
            this.f408778c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Type(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408794s = (byte) -1;
            this.f408795t = -1;
            q();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        kotlin.reflect.jvm.internal.impl.protobuf.q<Type> qVar = f408777v;
                        b bVarR = null;
                        switch (iN2) {
                            case 0:
                                break;
                            case 8:
                                this.f408779d |= 4096;
                                this.f408793r = eVar.k();
                                continue;
                            case 18:
                                if (!z13) {
                                    this.f408780e = new ArrayList();
                                    z13 = true;
                                }
                                this.f408780e.add(eVar.g(Argument.f408797j, fVar));
                                continue;
                            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                this.f408779d |= 1;
                                this.f408781f = eVar.l() != 0;
                                continue;
                            case 32:
                                this.f408779d |= 2;
                                this.f408782g = eVar.k();
                                continue;
                            case 42:
                                if ((this.f408779d & 4) == 4) {
                                    Type type = this.f408783h;
                                    type.getClass();
                                    bVarR = r(type);
                                }
                                Type type2 = (Type) eVar.g(qVar, fVar);
                                this.f408783h = type2;
                                if (bVarR != null) {
                                    bVarR.n(type2);
                                    this.f408783h = bVarR.m();
                                }
                                this.f408779d |= 4;
                                continue;
                            case 48:
                                this.f408779d |= 16;
                                this.f408785j = eVar.k();
                                continue;
                            case 56:
                                this.f408779d |= 32;
                                this.f408786k = eVar.k();
                                continue;
                            case 64:
                                this.f408779d |= 8;
                                this.f408784i = eVar.k();
                                continue;
                            case 72:
                                this.f408779d |= 64;
                                this.f408787l = eVar.k();
                                continue;
                            case 82:
                                if ((this.f408779d & 256) == 256) {
                                    Type type3 = this.f408789n;
                                    type3.getClass();
                                    bVarR = r(type3);
                                }
                                Type type4 = (Type) eVar.g(qVar, fVar);
                                this.f408789n = type4;
                                if (bVarR != null) {
                                    bVarR.n(type4);
                                    this.f408789n = bVarR.m();
                                }
                                this.f408779d |= 256;
                                continue;
                            case 88:
                                this.f408779d |= 512;
                                this.f408790o = eVar.k();
                                continue;
                            case 96:
                                this.f408779d |= 128;
                                this.f408788m = eVar.k();
                                continue;
                            case 106:
                                if ((this.f408779d & 1024) == 1024) {
                                    Type type5 = this.f408791p;
                                    type5.getClass();
                                    bVarR = r(type5);
                                }
                                Type type6 = (Type) eVar.g(qVar, fVar);
                                this.f408791p = type6;
                                if (bVarR != null) {
                                    bVarR.n(type6);
                                    this.f408791p = bVarR.m();
                                }
                                this.f408779d |= 1024;
                                continue;
                            case 112:
                                this.f408779d |= 2048;
                                this.f408792q = eVar.k();
                                continue;
                            default:
                                if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                    break;
                                }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if (z13) {
                            this.f408780e = Collections.unmodifiableList(this.f408780e);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408778c = bVar.c();
                            throw th3;
                        }
                        this.f408778c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if (z13) {
                this.f408780e = Collections.unmodifiableList(this.f408780e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408778c = bVar.c();
                throw th4;
            }
            this.f408778c = bVar.c();
            l();
        }
    }

    public static final class Effect extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.g {

        /* renamed from: j, reason: collision with root package name */
        public static final Effect f408695j;

        /* renamed from: k, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Effect> f408696k = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408697b;

        /* renamed from: c, reason: collision with root package name */
        public int f408698c;

        /* renamed from: d, reason: collision with root package name */
        public EffectType f408699d;

        /* renamed from: e, reason: collision with root package name */
        public List<Expression> f408700e;

        /* renamed from: f, reason: collision with root package name */
        public Expression f408701f;

        /* renamed from: g, reason: collision with root package name */
        public InvocationKind f408702g;

        /* renamed from: h, reason: collision with root package name */
        public byte f408703h;

        /* renamed from: i, reason: collision with root package name */
        public int f408704i;

        public enum EffectType implements i.a {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408709b;

            public static class a implements i.b<EffectType> {
            }

            static {
                new a();
            }

            EffectType(int i12) {
                this.f408709b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408709b;
            }
        }

        public enum InvocationKind implements i.a {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408714b;

            public static class a implements i.b<InvocationKind> {
            }

            static {
                new a();
            }

            InvocationKind(int i12) {
                this.f408714b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408714b;
            }
        }

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Effect(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<Effect, b> implements kotlin.reflect.jvm.internal.impl.metadata.g {

            /* renamed from: c, reason: collision with root package name */
            public int f408715c;

            /* renamed from: d, reason: collision with root package name */
            public EffectType f408716d = EffectType.RETURNS_CONSTANT;

            /* renamed from: e, reason: collision with root package name */
            public List<Expression> f408717e = Collections.emptyList();

            /* renamed from: f, reason: collision with root package name */
            public Expression f408718f = Expression.f408720m;

            /* renamed from: g, reason: collision with root package name */
            public InvocationKind f408719g = InvocationKind.AT_MOST_ONCE;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                Effect effectK = k();
                if (effectK.isInitialized()) {
                    return effectK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((Effect) hVar);
                return this;
            }

            public final Effect k() {
                Effect effect = new Effect(this, null);
                int i12 = this.f408715c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                effect.f408699d = this.f408716d;
                if ((i12 & 2) == 2) {
                    this.f408717e = Collections.unmodifiableList(this.f408717e);
                    this.f408715c &= -3;
                }
                effect.f408700e = this.f408717e;
                if ((i12 & 4) == 4) {
                    i13 |= 2;
                }
                effect.f408701f = this.f408718f;
                if ((i12 & 8) == 8) {
                    i13 |= 4;
                }
                effect.f408702g = this.f408719g;
                effect.f408698c = i13;
                return effect;
            }

            public final void l(Effect effect) {
                Expression expression;
                if (effect == Effect.f408695j) {
                    return;
                }
                if ((effect.f408698c & 1) == 1) {
                    EffectType effectType = effect.f408699d;
                    effectType.getClass();
                    this.f408715c |= 1;
                    this.f408716d = effectType;
                }
                if (!effect.f408700e.isEmpty()) {
                    if (this.f408717e.isEmpty()) {
                        this.f408717e = effect.f408700e;
                        this.f408715c &= -3;
                    } else {
                        if ((this.f408715c & 2) != 2) {
                            this.f408717e = new ArrayList(this.f408717e);
                            this.f408715c |= 2;
                        }
                        this.f408717e.addAll(effect.f408700e);
                    }
                }
                if ((effect.f408698c & 2) == 2) {
                    Expression expression2 = effect.f408701f;
                    if ((this.f408715c & 4) != 4 || (expression = this.f408718f) == Expression.f408720m) {
                        this.f408718f = expression2;
                    } else {
                        Expression.b bVar = new Expression.b();
                        bVar.l(expression);
                        bVar.l(expression2);
                        this.f408718f = bVar.k();
                    }
                    this.f408715c |= 4;
                }
                if ((effect.f408698c & 4) == 4) {
                    InvocationKind invocationKind = effect.f408702g;
                    invocationKind.getClass();
                    this.f408715c |= 8;
                    this.f408719g = invocationKind;
                }
                this.f409359b = this.f409359b.b(effect.f408697b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.f408696k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            Effect effect = new Effect();
            f408695j = effect;
            effect.f408699d = EffectType.RETURNS_CONSTANT;
            effect.f408700e = Collections.emptyList();
            effect.f408701f = Expression.f408720m;
            effect.f408702g = InvocationKind.AT_MOST_ONCE;
        }

        public Effect(h.b bVar, a aVar) {
            this.f408703h = (byte) -1;
            this.f408704i = -1;
            this.f408697b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f408698c & 1) == 1) {
                codedOutputStream.l(1, this.f408699d.f408709b);
            }
            for (int i12 = 0; i12 < this.f408700e.size(); i12++) {
                codedOutputStream.o(2, this.f408700e.get(i12));
            }
            if ((this.f408698c & 2) == 2) {
                codedOutputStream.o(3, this.f408701f);
            }
            if ((this.f408698c & 4) == 4) {
                codedOutputStream.l(4, this.f408702g.f408714b);
            }
            codedOutputStream.r(this.f408697b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408704i;
            if (i12 != -1) {
                return i12;
            }
            int iA2 = (this.f408698c & 1) == 1 ? CodedOutputStream.a(1, this.f408699d.f408709b) : 0;
            for (int i13 = 0; i13 < this.f408700e.size(); i13++) {
                iA2 += CodedOutputStream.d(2, this.f408700e.get(i13));
            }
            if ((this.f408698c & 2) == 2) {
                iA2 += CodedOutputStream.d(3, this.f408701f);
            }
            if ((this.f408698c & 4) == 4) {
                iA2 += CodedOutputStream.a(4, this.f408702g.f408714b);
            }
            int size = this.f408697b.size() + iA2;
            this.f408704i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408703h;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408700e.size(); i12++) {
                if (!this.f408700e.get(i12).isInitialized()) {
                    this.f408703h = (byte) 0;
                    return false;
                }
            }
            if ((this.f408698c & 2) != 2 || this.f408701f.isInitialized()) {
                this.f408703h = (byte) 1;
                return true;
            }
            this.f408703h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public Effect() {
            this.f408703h = (byte) -1;
            this.f408704i = -1;
            this.f408697b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Effect(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408703h = (byte) -1;
            this.f408704i = -1;
            this.f408699d = EffectType.RETURNS_CONSTANT;
            this.f408700e = Collections.emptyList();
            this.f408701f = Expression.f408720m;
            this.f408702g = InvocationKind.AT_MOST_ONCE;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            char c12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            InvocationKind invocationKind = null;
                            EffectType effectType = null;
                            Expression.b bVar2 = null;
                            if (iN2 == 8) {
                                int iK2 = eVar.k();
                                if (iK2 == 0) {
                                    effectType = EffectType.RETURNS_CONSTANT;
                                } else if (iK2 == 1) {
                                    effectType = EffectType.CALLS;
                                } else if (iK2 == 2) {
                                    effectType = EffectType.RETURNS_NOT_NULL;
                                }
                                if (effectType == null) {
                                    codedOutputStreamJ.v(iN2);
                                    codedOutputStreamJ.v(iK2);
                                } else {
                                    this.f408698c |= 1;
                                    this.f408699d = effectType;
                                }
                            } else if (iN2 == 18) {
                                int i12 = (c12 == true ? 1 : 0) & 2;
                                c12 = c12;
                                if (i12 != 2) {
                                    this.f408700e = new ArrayList();
                                    c12 = 2;
                                }
                                this.f408700e.add(eVar.g(Expression.f408721n, fVar));
                            } else if (iN2 == 26) {
                                if ((this.f408698c & 2) == 2) {
                                    Expression expression = this.f408701f;
                                    expression.getClass();
                                    bVar2 = new Expression.b();
                                    bVar2.l(expression);
                                }
                                Expression expression2 = (Expression) eVar.g(Expression.f408721n, fVar);
                                this.f408701f = expression2;
                                if (bVar2 != null) {
                                    bVar2.l(expression2);
                                    this.f408701f = bVar2.k();
                                }
                                this.f408698c |= 2;
                            } else if (iN2 != 32) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                int iK3 = eVar.k();
                                if (iK3 == 0) {
                                    invocationKind = InvocationKind.AT_MOST_ONCE;
                                } else if (iK3 == 1) {
                                    invocationKind = InvocationKind.EXACTLY_ONCE;
                                } else if (iK3 == 2) {
                                    invocationKind = InvocationKind.AT_LEAST_ONCE;
                                }
                                if (invocationKind == null) {
                                    codedOutputStreamJ.v(iN2);
                                    codedOutputStreamJ.v(iK3);
                                } else {
                                    this.f408698c |= 4;
                                    this.f408702g = invocationKind;
                                }
                            }
                        }
                        z12 = true;
                    } catch (InvalidProtocolBufferException e12) {
                        e12.f409295b = this;
                        throw e12;
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (((c12 == true ? 1 : 0) & 2) == 2) {
                        this.f408700e = Collections.unmodifiableList(this.f408700e);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408697b = bVar.c();
                        throw th3;
                    }
                    this.f408697b = bVar.c();
                    throw th2;
                }
            }
            if (((c12 == true ? 1 : 0) & 2) == 2) {
                this.f408700e = Collections.unmodifiableList(this.f408700e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408697b = bVar.c();
                throw th4;
            }
            this.f408697b = bVar.c();
        }
    }

    public static final class Expression extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.i {

        /* renamed from: m, reason: collision with root package name */
        public static final Expression f408720m;

        /* renamed from: n, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<Expression> f408721n = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408722b;

        /* renamed from: c, reason: collision with root package name */
        public int f408723c;

        /* renamed from: d, reason: collision with root package name */
        public int f408724d;

        /* renamed from: e, reason: collision with root package name */
        public int f408725e;

        /* renamed from: f, reason: collision with root package name */
        public ConstantValue f408726f;

        /* renamed from: g, reason: collision with root package name */
        public Type f408727g;

        /* renamed from: h, reason: collision with root package name */
        public int f408728h;

        /* renamed from: i, reason: collision with root package name */
        public List<Expression> f408729i;

        /* renamed from: j, reason: collision with root package name */
        public List<Expression> f408730j;

        /* renamed from: k, reason: collision with root package name */
        public byte f408731k;

        /* renamed from: l, reason: collision with root package name */
        public int f408732l;

        public enum ConstantValue implements i.a {
            TRUE(0),
            FALSE(1),
            NULL(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408737b;

            public static class a implements i.b<ConstantValue> {
            }

            static {
                new a();
            }

            ConstantValue(int i12) {
                this.f408737b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408737b;
            }
        }

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new Expression(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<Expression, b> implements kotlin.reflect.jvm.internal.impl.metadata.i {

            /* renamed from: c, reason: collision with root package name */
            public int f408738c;

            /* renamed from: d, reason: collision with root package name */
            public int f408739d;

            /* renamed from: e, reason: collision with root package name */
            public int f408740e;

            /* renamed from: h, reason: collision with root package name */
            public int f408743h;

            /* renamed from: f, reason: collision with root package name */
            public ConstantValue f408741f = ConstantValue.TRUE;

            /* renamed from: g, reason: collision with root package name */
            public Type f408742g = Type.f408776u;

            /* renamed from: i, reason: collision with root package name */
            public List<Expression> f408744i = Collections.emptyList();

            /* renamed from: j, reason: collision with root package name */
            public List<Expression> f408745j = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                Expression expressionK = k();
                if (expressionK.isInitialized()) {
                    return expressionK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((Expression) hVar);
                return this;
            }

            public final Expression k() {
                Expression expression = new Expression(this, null);
                int i12 = this.f408738c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                expression.f408724d = this.f408739d;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                expression.f408725e = this.f408740e;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                expression.f408726f = this.f408741f;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                expression.f408727g = this.f408742g;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                expression.f408728h = this.f408743h;
                if ((i12 & 32) == 32) {
                    this.f408744i = Collections.unmodifiableList(this.f408744i);
                    this.f408738c &= -33;
                }
                expression.f408729i = this.f408744i;
                if ((this.f408738c & 64) == 64) {
                    this.f408745j = Collections.unmodifiableList(this.f408745j);
                    this.f408738c &= -65;
                }
                expression.f408730j = this.f408745j;
                expression.f408723c = i13;
                return expression;
            }

            public final void l(Expression expression) {
                Type type;
                if (expression == Expression.f408720m) {
                    return;
                }
                int i12 = expression.f408723c;
                if ((i12 & 1) == 1) {
                    int i13 = expression.f408724d;
                    this.f408738c = 1 | this.f408738c;
                    this.f408739d = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = expression.f408725e;
                    this.f408738c = 2 | this.f408738c;
                    this.f408740e = i14;
                }
                if ((i12 & 4) == 4) {
                    ConstantValue constantValue = expression.f408726f;
                    constantValue.getClass();
                    this.f408738c = 4 | this.f408738c;
                    this.f408741f = constantValue;
                }
                if ((expression.f408723c & 8) == 8) {
                    Type type2 = expression.f408727g;
                    if ((this.f408738c & 8) != 8 || (type = this.f408742g) == Type.f408776u) {
                        this.f408742g = type2;
                    } else {
                        Type.b bVarR = Type.r(type);
                        bVarR.n(type2);
                        this.f408742g = bVarR.m();
                    }
                    this.f408738c |= 8;
                }
                if ((expression.f408723c & 16) == 16) {
                    int i15 = expression.f408728h;
                    this.f408738c = 16 | this.f408738c;
                    this.f408743h = i15;
                }
                if (!expression.f408729i.isEmpty()) {
                    if (this.f408744i.isEmpty()) {
                        this.f408744i = expression.f408729i;
                        this.f408738c &= -33;
                    } else {
                        if ((this.f408738c & 32) != 32) {
                            this.f408744i = new ArrayList(this.f408744i);
                            this.f408738c |= 32;
                        }
                        this.f408744i.addAll(expression.f408729i);
                    }
                }
                if (!expression.f408730j.isEmpty()) {
                    if (this.f408745j.isEmpty()) {
                        this.f408745j = expression.f408730j;
                        this.f408738c &= -65;
                    } else {
                        if ((this.f408738c & 64) != 64) {
                            this.f408745j = new ArrayList(this.f408745j);
                            this.f408738c |= 64;
                        }
                        this.f408745j.addAll(expression.f408730j);
                    }
                }
                this.f409359b = this.f409359b.b(expression.f408722b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.f408721n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            Expression expression = new Expression();
            f408720m = expression;
            expression.f408724d = 0;
            expression.f408725e = 0;
            expression.f408726f = ConstantValue.TRUE;
            expression.f408727g = Type.f408776u;
            expression.f408728h = 0;
            expression.f408729i = Collections.emptyList();
            expression.f408730j = Collections.emptyList();
        }

        public Expression(h.b bVar, a aVar) {
            this.f408731k = (byte) -1;
            this.f408732l = -1;
            this.f408722b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f408723c & 1) == 1) {
                codedOutputStream.m(1, this.f408724d);
            }
            if ((this.f408723c & 2) == 2) {
                codedOutputStream.m(2, this.f408725e);
            }
            if ((this.f408723c & 4) == 4) {
                codedOutputStream.l(3, this.f408726f.f408737b);
            }
            if ((this.f408723c & 8) == 8) {
                codedOutputStream.o(4, this.f408727g);
            }
            if ((this.f408723c & 16) == 16) {
                codedOutputStream.m(5, this.f408728h);
            }
            for (int i12 = 0; i12 < this.f408729i.size(); i12++) {
                codedOutputStream.o(6, this.f408729i.get(i12));
            }
            for (int i13 = 0; i13 < this.f408730j.size(); i13++) {
                codedOutputStream.o(7, this.f408730j.get(i13));
            }
            codedOutputStream.r(this.f408722b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408732l;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408723c & 1) == 1 ? CodedOutputStream.b(1, this.f408724d) : 0;
            if ((this.f408723c & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f408725e);
            }
            if ((this.f408723c & 4) == 4) {
                iB2 += CodedOutputStream.a(3, this.f408726f.f408737b);
            }
            if ((this.f408723c & 8) == 8) {
                iB2 += CodedOutputStream.d(4, this.f408727g);
            }
            if ((this.f408723c & 16) == 16) {
                iB2 += CodedOutputStream.b(5, this.f408728h);
            }
            for (int i13 = 0; i13 < this.f408729i.size(); i13++) {
                iB2 += CodedOutputStream.d(6, this.f408729i.get(i13));
            }
            for (int i14 = 0; i14 < this.f408730j.size(); i14++) {
                iB2 += CodedOutputStream.d(7, this.f408730j.get(i14));
            }
            int size = this.f408722b.size() + iB2;
            this.f408732l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408731k;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if ((this.f408723c & 8) == 8 && !this.f408727g.isInitialized()) {
                this.f408731k = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f408729i.size(); i12++) {
                if (!this.f408729i.get(i12).isInitialized()) {
                    this.f408731k = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f408730j.size(); i13++) {
                if (!this.f408730j.get(i13).isInitialized()) {
                    this.f408731k = (byte) 0;
                    return false;
                }
            }
            this.f408731k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public Expression() {
            this.f408731k = (byte) -1;
            this.f408732l = -1;
            this.f408722b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v6 */
        public Expression(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408731k = (byte) -1;
            this.f408732l = -1;
            boolean z12 = false;
            this.f408724d = 0;
            this.f408725e = 0;
            this.f408726f = ConstantValue.TRUE;
            this.f408727g = Type.f408776u;
            this.f408728h = 0;
            this.f408729i = Collections.emptyList();
            this.f408730j = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            char c12 = 0;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f408723c |= 1;
                                    this.f408724d = eVar.k();
                                } else if (iN2 != 16) {
                                    Type.b bVarR = null;
                                    ConstantValue constantValue = null;
                                    if (iN2 == 24) {
                                        int iK2 = eVar.k();
                                        if (iK2 == 0) {
                                            constantValue = ConstantValue.TRUE;
                                        } else if (iK2 == 1) {
                                            constantValue = ConstantValue.FALSE;
                                        } else if (iK2 == 2) {
                                            constantValue = ConstantValue.NULL;
                                        }
                                        if (constantValue == null) {
                                            codedOutputStreamJ.v(iN2);
                                            codedOutputStreamJ.v(iK2);
                                        } else {
                                            this.f408723c |= 4;
                                            this.f408726f = constantValue;
                                        }
                                    } else if (iN2 == 34) {
                                        if ((this.f408723c & 8) == 8) {
                                            Type type = this.f408727g;
                                            type.getClass();
                                            bVarR = Type.r(type);
                                        }
                                        Type type2 = (Type) eVar.g(Type.f408777v, fVar);
                                        this.f408727g = type2;
                                        if (bVarR != null) {
                                            bVarR.n(type2);
                                            this.f408727g = bVarR.m();
                                        }
                                        this.f408723c |= 8;
                                    } else if (iN2 != 40) {
                                        kotlin.reflect.jvm.internal.impl.protobuf.q<Expression> qVar = f408721n;
                                        if (iN2 == 50) {
                                            int i12 = (c12 == true ? 1 : 0) & 32;
                                            c12 = c12;
                                            if (i12 != 32) {
                                                this.f408729i = new ArrayList();
                                                c12 = (c12 == true ? 1 : 0) | ' ';
                                            }
                                            this.f408729i.add(eVar.g(qVar, fVar));
                                        } else if (iN2 != 58) {
                                            if (!eVar.q(iN2, codedOutputStreamJ)) {
                                            }
                                        } else {
                                            int i13 = (c12 == true ? 1 : 0) & 64;
                                            c12 = c12;
                                            if (i13 != 64) {
                                                this.f408730j = new ArrayList();
                                                c12 = (c12 == true ? 1 : 0) | '@';
                                            }
                                            this.f408730j.add(eVar.g(qVar, fVar));
                                        }
                                    } else {
                                        this.f408723c |= 16;
                                        this.f408728h = eVar.k();
                                    }
                                } else {
                                    this.f408723c |= 2;
                                    this.f408725e = eVar.k();
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (((c12 == true ? 1 : 0) & 32) == 32) {
                        this.f408729i = Collections.unmodifiableList(this.f408729i);
                    }
                    if (((c12 == true ? 1 : 0) & 64) == 64) {
                        this.f408730j = Collections.unmodifiableList(this.f408730j);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408722b = bVar.c();
                        throw th3;
                    }
                    this.f408722b = bVar.c();
                    throw th2;
                }
            }
            if (((c12 == true ? 1 : 0) & 32) == 32) {
                this.f408729i = Collections.unmodifiableList(this.f408729i);
            }
            if (((c12 == true ? 1 : 0) & 64) == 64) {
                this.f408730j = Collections.unmodifiableList(this.f408730j);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408722b = bVar.c();
                throw th4;
            }
            this.f408722b = bVar.c();
        }
    }

    public static final class VersionRequirement extends kotlin.reflect.jvm.internal.impl.protobuf.h implements w {

        /* renamed from: l, reason: collision with root package name */
        public static final VersionRequirement f408855l;

        /* renamed from: m, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<VersionRequirement> f408856m = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408857b;

        /* renamed from: c, reason: collision with root package name */
        public int f408858c;

        /* renamed from: d, reason: collision with root package name */
        public int f408859d;

        /* renamed from: e, reason: collision with root package name */
        public int f408860e;

        /* renamed from: f, reason: collision with root package name */
        public Level f408861f;

        /* renamed from: g, reason: collision with root package name */
        public int f408862g;

        /* renamed from: h, reason: collision with root package name */
        public int f408863h;

        /* renamed from: i, reason: collision with root package name */
        public VersionKind f408864i;

        /* renamed from: j, reason: collision with root package name */
        public byte f408865j;

        /* renamed from: k, reason: collision with root package name */
        public int f408866k;

        public enum Level implements i.a {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408871b;

            public static class a implements i.b<Level> {
            }

            static {
                new a();
            }

            Level(int i12) {
                this.f408871b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408871b;
            }
        }

        public enum VersionKind implements i.a {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408876b;

            public static class a implements i.b<VersionKind> {
            }

            static {
                new a();
            }

            VersionKind(int i12) {
                this.f408876b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408876b;
            }
        }

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new VersionRequirement(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<VersionRequirement, b> implements w {

            /* renamed from: c, reason: collision with root package name */
            public int f408877c;

            /* renamed from: d, reason: collision with root package name */
            public int f408878d;

            /* renamed from: e, reason: collision with root package name */
            public int f408879e;

            /* renamed from: g, reason: collision with root package name */
            public int f408881g;

            /* renamed from: h, reason: collision with root package name */
            public int f408882h;

            /* renamed from: f, reason: collision with root package name */
            public Level f408880f = Level.ERROR;

            /* renamed from: i, reason: collision with root package name */
            public VersionKind f408883i = VersionKind.LANGUAGE_VERSION;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                VersionRequirement versionRequirementK = k();
                if (versionRequirementK.isInitialized()) {
                    return versionRequirementK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((VersionRequirement) hVar);
                return this;
            }

            public final VersionRequirement k() {
                VersionRequirement versionRequirement = new VersionRequirement(this, null);
                int i12 = this.f408877c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                versionRequirement.f408859d = this.f408878d;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                versionRequirement.f408860e = this.f408879e;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                versionRequirement.f408861f = this.f408880f;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                versionRequirement.f408862g = this.f408881g;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                versionRequirement.f408863h = this.f408882h;
                if ((i12 & 32) == 32) {
                    i13 |= 32;
                }
                versionRequirement.f408864i = this.f408883i;
                versionRequirement.f408858c = i13;
                return versionRequirement;
            }

            public final void l(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.f408855l) {
                    return;
                }
                int i12 = versionRequirement.f408858c;
                if ((i12 & 1) == 1) {
                    int i13 = versionRequirement.f408859d;
                    this.f408877c = 1 | this.f408877c;
                    this.f408878d = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = versionRequirement.f408860e;
                    this.f408877c = 2 | this.f408877c;
                    this.f408879e = i14;
                }
                if ((i12 & 4) == 4) {
                    Level level = versionRequirement.f408861f;
                    level.getClass();
                    this.f408877c = 4 | this.f408877c;
                    this.f408880f = level;
                }
                int i15 = versionRequirement.f408858c;
                if ((i15 & 8) == 8) {
                    int i16 = versionRequirement.f408862g;
                    this.f408877c = 8 | this.f408877c;
                    this.f408881g = i16;
                }
                if ((i15 & 16) == 16) {
                    int i17 = versionRequirement.f408863h;
                    this.f408877c = 16 | this.f408877c;
                    this.f408882h = i17;
                }
                if ((i15 & 32) == 32) {
                    VersionKind versionKind = versionRequirement.f408864i;
                    versionKind.getClass();
                    this.f408877c = 32 | this.f408877c;
                    this.f408883i = versionKind;
                }
                this.f409359b = this.f409359b.b(versionRequirement.f408857b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.f408856m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            f408855l = versionRequirement;
            versionRequirement.f408859d = 0;
            versionRequirement.f408860e = 0;
            versionRequirement.f408861f = Level.ERROR;
            versionRequirement.f408862g = 0;
            versionRequirement.f408863h = 0;
            versionRequirement.f408864i = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement(h.b bVar, a aVar) {
            this.f408865j = (byte) -1;
            this.f408866k = -1;
            this.f408857b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f408858c & 1) == 1) {
                codedOutputStream.m(1, this.f408859d);
            }
            if ((this.f408858c & 2) == 2) {
                codedOutputStream.m(2, this.f408860e);
            }
            if ((this.f408858c & 4) == 4) {
                codedOutputStream.l(3, this.f408861f.f408871b);
            }
            if ((this.f408858c & 8) == 8) {
                codedOutputStream.m(4, this.f408862g);
            }
            if ((this.f408858c & 16) == 16) {
                codedOutputStream.m(5, this.f408863h);
            }
            if ((this.f408858c & 32) == 32) {
                codedOutputStream.l(6, this.f408864i.f408876b);
            }
            codedOutputStream.r(this.f408857b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408866k;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408858c & 1) == 1 ? CodedOutputStream.b(1, this.f408859d) : 0;
            if ((this.f408858c & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f408860e);
            }
            if ((this.f408858c & 4) == 4) {
                iB2 += CodedOutputStream.a(3, this.f408861f.f408871b);
            }
            if ((this.f408858c & 8) == 8) {
                iB2 += CodedOutputStream.b(4, this.f408862g);
            }
            if ((this.f408858c & 16) == 16) {
                iB2 += CodedOutputStream.b(5, this.f408863h);
            }
            if ((this.f408858c & 32) == 32) {
                iB2 += CodedOutputStream.a(6, this.f408864i.f408876b);
            }
            int size = this.f408857b.size() + iB2;
            this.f408866k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408865j;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f408865j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public VersionRequirement() {
            this.f408865j = (byte) -1;
            this.f408866k = -1;
            this.f408857b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public VersionRequirement(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408865j = (byte) -1;
            this.f408866k = -1;
            boolean z12 = false;
            this.f408859d = 0;
            this.f408860e = 0;
            this.f408861f = Level.ERROR;
            this.f408862g = 0;
            this.f408863h = 0;
            this.f408864i = VersionKind.LANGUAGE_VERSION;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f408858c |= 1;
                                    this.f408859d = eVar.k();
                                } else if (iN2 != 16) {
                                    VersionKind versionKind = null;
                                    Level level = null;
                                    if (iN2 == 24) {
                                        int iK2 = eVar.k();
                                        if (iK2 == 0) {
                                            level = Level.WARNING;
                                        } else if (iK2 == 1) {
                                            level = Level.ERROR;
                                        } else if (iK2 == 2) {
                                            level = Level.HIDDEN;
                                        }
                                        if (level == null) {
                                            codedOutputStreamJ.v(iN2);
                                            codedOutputStreamJ.v(iK2);
                                        } else {
                                            this.f408858c |= 4;
                                            this.f408861f = level;
                                        }
                                    } else if (iN2 == 32) {
                                        this.f408858c |= 8;
                                        this.f408862g = eVar.k();
                                    } else if (iN2 == 40) {
                                        this.f408858c |= 16;
                                        this.f408863h = eVar.k();
                                    } else if (iN2 != 48) {
                                        if (!eVar.q(iN2, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        int iK3 = eVar.k();
                                        if (iK3 == 0) {
                                            versionKind = VersionKind.LANGUAGE_VERSION;
                                        } else if (iK3 == 1) {
                                            versionKind = VersionKind.COMPILER_VERSION;
                                        } else if (iK3 == 2) {
                                            versionKind = VersionKind.API_VERSION;
                                        }
                                        if (versionKind == null) {
                                            codedOutputStreamJ.v(iN2);
                                            codedOutputStreamJ.v(iK3);
                                        } else {
                                            this.f408858c |= 32;
                                            this.f408864i = versionKind;
                                        }
                                    }
                                } else {
                                    this.f408858c |= 2;
                                    this.f408860e = eVar.k();
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408857b = bVar.c();
                        throw th3;
                    }
                    this.f408857b = bVar.c();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408857b = bVar.c();
                throw th4;
            }
            this.f408857b = bVar.c();
        }
    }

    public static final class b extends h.d<b> implements kotlin.reflect.jvm.internal.impl.metadata.e {

        /* renamed from: j, reason: collision with root package name */
        public static final b f408886j;

        /* renamed from: k, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<b> f408887k = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408888c;

        /* renamed from: d, reason: collision with root package name */
        public int f408889d;

        /* renamed from: e, reason: collision with root package name */
        public int f408890e;

        /* renamed from: f, reason: collision with root package name */
        public List<l> f408891f;

        /* renamed from: g, reason: collision with root package name */
        public List<Integer> f408892g;

        /* renamed from: h, reason: collision with root package name */
        public byte f408893h;

        /* renamed from: i, reason: collision with root package name */
        public int f408894i;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new b(eVar, fVar, null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$b$b, reason: collision with other inner class name */
        public static final class C11673b extends h.c<b, C11673b> implements kotlin.reflect.jvm.internal.impl.metadata.e {

            /* renamed from: e, reason: collision with root package name */
            public int f408895e;

            /* renamed from: f, reason: collision with root package name */
            public int f408896f = 6;

            /* renamed from: g, reason: collision with root package name */
            public List<l> f408897g = Collections.emptyList();

            /* renamed from: h, reason: collision with root package name */
            public List<Integer> f408898h = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                b bVarM = m();
                if (bVarM.isInitialized()) {
                    return bVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                C11673b c11673b = new C11673b();
                c11673b.n(m());
                return c11673b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                C11673b c11673b = new C11673b();
                c11673b.n(m());
                return c11673b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                C11673b c11673b = new C11673b();
                c11673b.n(m());
                return c11673b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((b) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                C11673b c11673b = new C11673b();
                c11673b.n(m());
                return c11673b;
            }

            public final b m() {
                b bVar = new b(this, null);
                int i12 = this.f408895e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                bVar.f408890e = this.f408896f;
                if ((i12 & 2) == 2) {
                    this.f408897g = Collections.unmodifiableList(this.f408897g);
                    this.f408895e &= -3;
                }
                bVar.f408891f = this.f408897g;
                if ((this.f408895e & 4) == 4) {
                    this.f408898h = Collections.unmodifiableList(this.f408898h);
                    this.f408895e &= -5;
                }
                bVar.f408892g = this.f408898h;
                bVar.f408889d = i13;
                return bVar;
            }

            public final void n(b bVar) {
                if (bVar == b.f408886j) {
                    return;
                }
                if ((bVar.f408889d & 1) == 1) {
                    int i12 = bVar.f408890e;
                    this.f408895e = 1 | this.f408895e;
                    this.f408896f = i12;
                }
                if (!bVar.f408891f.isEmpty()) {
                    if (this.f408897g.isEmpty()) {
                        this.f408897g = bVar.f408891f;
                        this.f408895e &= -3;
                    } else {
                        if ((this.f408895e & 2) != 2) {
                            this.f408897g = new ArrayList(this.f408897g);
                            this.f408895e |= 2;
                        }
                        this.f408897g.addAll(bVar.f408891f);
                    }
                }
                if (!bVar.f408892g.isEmpty()) {
                    if (this.f408898h.isEmpty()) {
                        this.f408898h = bVar.f408892g;
                        this.f408895e &= -5;
                    } else {
                        if ((this.f408895e & 4) != 4) {
                            this.f408898h = new ArrayList(this.f408898h);
                            this.f408895e |= 4;
                        }
                        this.f408898h.addAll(bVar.f408892g);
                    }
                }
                l(bVar);
                this.f409359b = this.f409359b.b(bVar.f408888c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b.f408887k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$b$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.b.C11673b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            b bVar = new b(0);
            f408886j = bVar;
            bVar.f408890e = 6;
            bVar.f408891f = Collections.emptyList();
            bVar.f408892g = Collections.emptyList();
        }

        public b() {
            throw null;
        }

        public b(h.c cVar, a aVar) {
            super(cVar);
            this.f408893h = (byte) -1;
            this.f408894i = -1;
            this.f408888c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408889d & 1) == 1) {
                codedOutputStream.m(1, this.f408890e);
            }
            for (int i12 = 0; i12 < this.f408891f.size(); i12++) {
                codedOutputStream.o(2, this.f408891f.get(i12));
            }
            for (int i13 = 0; i13 < this.f408892g.size(); i13++) {
                codedOutputStream.m(31, this.f408892g.get(i13).intValue());
            }
            aVarM.a(19000, codedOutputStream);
            codedOutputStream.r(this.f408888c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408886j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408894i;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408889d & 1) == 1 ? CodedOutputStream.b(1, this.f408890e) : 0;
            for (int i13 = 0; i13 < this.f408891f.size(); i13++) {
                iB2 += CodedOutputStream.d(2, this.f408891f.get(i13));
            }
            int iC2 = 0;
            for (int i14 = 0; i14 < this.f408892g.size(); i14++) {
                iC2 += CodedOutputStream.c(this.f408892g.get(i14).intValue());
            }
            int size = this.f408888c.size() + f() + androidx.compose.ui.graphics.colorspace.e.f(2, iB2 + iC2, this.f408892g);
            this.f408894i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408893h;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408891f.size(); i12++) {
                if (!this.f408891f.get(i12).isInitialized()) {
                    this.f408893h = (byte) 0;
                    return false;
                }
            }
            if (e()) {
                this.f408893h = (byte) 1;
                return true;
            }
            this.f408893h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new C11673b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            C11673b c11673b = new C11673b();
            c11673b.n(this);
            return c11673b;
        }

        public b(int i12) {
            this.f408893h = (byte) -1;
            this.f408894i = -1;
            this.f408888c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408893h = (byte) -1;
            this.f408894i = -1;
            this.f408890e = 6;
            this.f408891f = Collections.emptyList();
            this.f408892g = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            int i12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 8) {
                                this.f408889d |= 1;
                                this.f408890e = eVar.k();
                            } else if (iN2 == 18) {
                                if ((i12 & 2) != 2) {
                                    this.f408891f = new ArrayList();
                                    i12 |= 2;
                                }
                                this.f408891f.add(eVar.g(l.f409065n, fVar));
                            } else if (iN2 == 248) {
                                if ((i12 & 4) != 4) {
                                    this.f408892g = new ArrayList();
                                    i12 |= 4;
                                }
                                this.f408892g.add(Integer.valueOf(eVar.k()));
                            } else if (iN2 != 250) {
                                if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                }
                            } else {
                                int iD2 = eVar.d(eVar.k());
                                if ((i12 & 4) != 4 && eVar.b() > 0) {
                                    this.f408892g = new ArrayList();
                                    i12 |= 4;
                                }
                                while (eVar.b() > 0) {
                                    this.f408892g.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if ((i12 & 2) == 2) {
                            this.f408891f = Collections.unmodifiableList(this.f408891f);
                        }
                        if ((i12 & 4) == 4) {
                            this.f408892g = Collections.unmodifiableList(this.f408892g);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408888c = bVar.c();
                            throw th3;
                        }
                        this.f408888c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if ((i12 & 2) == 2) {
                this.f408891f = Collections.unmodifiableList(this.f408891f);
            }
            if ((i12 & 4) == 4) {
                this.f408892g = Collections.unmodifiableList(this.f408892g);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408888c = bVar.c();
                throw th4;
            }
            this.f408888c = bVar.c();
            l();
        }
    }

    public static final class c extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.metadata.f {

        /* renamed from: f, reason: collision with root package name */
        public static final c f408899f;

        /* renamed from: g, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<c> f408900g = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408901b;

        /* renamed from: c, reason: collision with root package name */
        public List<Effect> f408902c;

        /* renamed from: d, reason: collision with root package name */
        public byte f408903d;

        /* renamed from: e, reason: collision with root package name */
        public int f408904e;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new c(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.f {

            /* renamed from: c, reason: collision with root package name */
            public int f408905c;

            /* renamed from: d, reason: collision with root package name */
            public List<Effect> f408906d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                c cVarK = k();
                if (cVarK.isInitialized()) {
                    return cVarK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((c) hVar);
                return this;
            }

            public final c k() {
                c cVar = new c(this, null);
                if ((this.f408905c & 1) == 1) {
                    this.f408906d = Collections.unmodifiableList(this.f408906d);
                    this.f408905c &= -2;
                }
                cVar.f408902c = this.f408906d;
                return cVar;
            }

            public final void l(c cVar) {
                if (cVar == c.f408899f) {
                    return;
                }
                if (!cVar.f408902c.isEmpty()) {
                    if (this.f408906d.isEmpty()) {
                        this.f408906d = cVar.f408902c;
                        this.f408905c &= -2;
                    } else {
                        if ((this.f408905c & 1) != 1) {
                            this.f408906d = new ArrayList(this.f408906d);
                            this.f408905c |= 1;
                        }
                        this.f408906d.addAll(cVar.f408902c);
                    }
                }
                this.f409359b = this.f409359b.b(cVar.f408901b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.c.f408900g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$c$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.c.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.c.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            c cVar = new c();
            f408899f = cVar;
            cVar.f408902c = Collections.emptyList();
        }

        public c(h.b bVar, a aVar) {
            this.f408903d = (byte) -1;
            this.f408904e = -1;
            this.f408901b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f408902c.size(); i12++) {
                codedOutputStream.o(1, this.f408902c.get(i12));
            }
            codedOutputStream.r(this.f408901b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408904e;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = 0;
            for (int i13 = 0; i13 < this.f408902c.size(); i13++) {
                iD2 += CodedOutputStream.d(1, this.f408902c.get(i13));
            }
            int size = this.f408901b.size() + iD2;
            this.f408904e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408903d;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408902c.size(); i12++) {
                if (!this.f408902c.get(i12).isInitialized()) {
                    this.f408903d = (byte) 0;
                    return false;
                }
            }
            this.f408903d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public c() {
            this.f408903d = (byte) -1;
            this.f408904e = -1;
            this.f408901b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408903d = (byte) -1;
            this.f408904e = -1;
            this.f408902c = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 != 10) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if (!z13) {
                                        this.f408902c = new ArrayList();
                                        z13 = true;
                                    }
                                    this.f408902c.add(eVar.g(Effect.f408696k, fVar));
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (z13) {
                        this.f408902c = Collections.unmodifiableList(this.f408902c);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408901b = bVar.c();
                        throw th3;
                    }
                    this.f408901b = bVar.c();
                    throw th2;
                }
            }
            if (z13) {
                this.f408902c = Collections.unmodifiableList(this.f408902c);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408901b = bVar.c();
                throw th4;
            }
            this.f408901b = bVar.c();
        }
    }

    public static final class d extends h.d<d> implements kotlin.reflect.jvm.internal.impl.metadata.h {

        /* renamed from: h, reason: collision with root package name */
        public static final d f408907h;

        /* renamed from: i, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<d> f408908i = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408909c;

        /* renamed from: d, reason: collision with root package name */
        public int f408910d;

        /* renamed from: e, reason: collision with root package name */
        public int f408911e;

        /* renamed from: f, reason: collision with root package name */
        public byte f408912f;

        /* renamed from: g, reason: collision with root package name */
        public int f408913g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new d(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.h {

            /* renamed from: e, reason: collision with root package name */
            public int f408914e;

            /* renamed from: f, reason: collision with root package name */
            public int f408915f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                d dVar = new d(this, null);
                int i12 = (this.f408914e & 1) != 1 ? 0 : 1;
                dVar.f408911e = this.f408915f;
                dVar.f408910d = i12;
                if (dVar.isInitialized()) {
                    return dVar;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                d dVar = new d(this, null);
                int i12 = (this.f408914e & 1) != 1 ? 0 : 1;
                dVar.f408911e = this.f408915f;
                dVar.f408910d = i12;
                bVar.m(dVar);
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                n(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                d dVar = new d(this, null);
                int i12 = (this.f408914e & 1) != 1 ? 0 : 1;
                dVar.f408911e = this.f408915f;
                dVar.f408910d = i12;
                bVar.m(dVar);
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                n(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                d dVar = new d(this, null);
                int i12 = (this.f408914e & 1) != 1 ? 0 : 1;
                dVar.f408911e = this.f408915f;
                dVar.f408910d = i12;
                bVar.m(dVar);
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                m((d) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                d dVar = new d(this, null);
                int i12 = (this.f408914e & 1) != 1 ? 0 : 1;
                dVar.f408911e = this.f408915f;
                dVar.f408910d = i12;
                bVar.m(dVar);
                return bVar;
            }

            public final void m(d dVar) {
                if (dVar == d.f408907h) {
                    return;
                }
                if ((dVar.f408910d & 1) == 1) {
                    int i12 = dVar.f408911e;
                    this.f408914e = 1 | this.f408914e;
                    this.f408915f = i12;
                }
                l(dVar);
                this.f409359b = this.f409359b.b(dVar.f408909c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void n(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.d.f408908i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$d$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.d.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.m(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$d r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.d) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.m(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.d.b.n(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            d dVar = new d(0);
            f408907h = dVar;
            dVar.f408911e = 0;
        }

        public d() {
            throw null;
        }

        public d(h.c cVar, a aVar) {
            super(cVar);
            this.f408912f = (byte) -1;
            this.f408913g = -1;
            this.f408909c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408910d & 1) == 1) {
                codedOutputStream.m(1, this.f408911e);
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f408909c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408907h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408913g;
            if (i12 != -1) {
                return i12;
            }
            int size = this.f408909c.size() + f() + ((this.f408910d & 1) == 1 ? CodedOutputStream.b(1, this.f408911e) : 0);
            this.f408913g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408912f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if (e()) {
                this.f408912f = (byte) 1;
                return true;
            }
            this.f408912f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.m(this);
            return bVar;
        }

        public d(int i12) {
            this.f408912f = (byte) -1;
            this.f408913g = -1;
            this.f408909c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408912f = (byte) -1;
            this.f408913g = -1;
            boolean z12 = false;
            this.f408911e = 0;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 != 8) {
                                    if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                    }
                                } else {
                                    this.f408910d |= 1;
                                    this.f408911e = eVar.k();
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f408909c = bVar.c();
                        throw th3;
                    }
                    this.f408909c = bVar.c();
                    l();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408909c = bVar.c();
                throw th4;
            }
            this.f408909c = bVar.c();
            l();
        }
    }

    public static final class f extends h.d<f> implements kotlin.reflect.jvm.internal.impl.metadata.l {

        /* renamed from: l, reason: collision with root package name */
        public static final f f408952l;

        /* renamed from: m, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<f> f408953m = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408954c;

        /* renamed from: d, reason: collision with root package name */
        public int f408955d;

        /* renamed from: e, reason: collision with root package name */
        public List<e> f408956e;

        /* renamed from: f, reason: collision with root package name */
        public List<h> f408957f;

        /* renamed from: g, reason: collision with root package name */
        public List<j> f408958g;

        /* renamed from: h, reason: collision with root package name */
        public k f408959h;

        /* renamed from: i, reason: collision with root package name */
        public m f408960i;

        /* renamed from: j, reason: collision with root package name */
        public byte f408961j;

        /* renamed from: k, reason: collision with root package name */
        public int f408962k;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<f> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new f(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<f, b> implements kotlin.reflect.jvm.internal.impl.metadata.l {

            /* renamed from: e, reason: collision with root package name */
            public int f408963e;

            /* renamed from: f, reason: collision with root package name */
            public List<e> f408964f = Collections.emptyList();

            /* renamed from: g, reason: collision with root package name */
            public List<h> f408965g = Collections.emptyList();

            /* renamed from: h, reason: collision with root package name */
            public List<j> f408966h = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            public k f408967i = k.f409053h;

            /* renamed from: j, reason: collision with root package name */
            public m f408968j = m.f409083f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                f fVarM = m();
                if (fVarM.isInitialized()) {
                    return fVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((f) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final f m() {
                f fVar = new f(this, null);
                int i12 = this.f408963e;
                if ((i12 & 1) == 1) {
                    this.f408964f = Collections.unmodifiableList(this.f408964f);
                    this.f408963e &= -2;
                }
                fVar.f408956e = this.f408964f;
                if ((this.f408963e & 2) == 2) {
                    this.f408965g = Collections.unmodifiableList(this.f408965g);
                    this.f408963e &= -3;
                }
                fVar.f408957f = this.f408965g;
                if ((this.f408963e & 4) == 4) {
                    this.f408966h = Collections.unmodifiableList(this.f408966h);
                    this.f408963e &= -5;
                }
                fVar.f408958g = this.f408966h;
                int i13 = (i12 & 8) != 8 ? 0 : 1;
                fVar.f408959h = this.f408967i;
                if ((i12 & 16) == 16) {
                    i13 |= 2;
                }
                fVar.f408960i = this.f408968j;
                fVar.f408955d = i13;
                return fVar;
            }

            public final void n(f fVar) {
                m mVar;
                k kVar;
                if (fVar == f.f408952l) {
                    return;
                }
                if (!fVar.f408956e.isEmpty()) {
                    if (this.f408964f.isEmpty()) {
                        this.f408964f = fVar.f408956e;
                        this.f408963e &= -2;
                    } else {
                        if ((this.f408963e & 1) != 1) {
                            this.f408964f = new ArrayList(this.f408964f);
                            this.f408963e |= 1;
                        }
                        this.f408964f.addAll(fVar.f408956e);
                    }
                }
                if (!fVar.f408957f.isEmpty()) {
                    if (this.f408965g.isEmpty()) {
                        this.f408965g = fVar.f408957f;
                        this.f408963e &= -3;
                    } else {
                        if ((this.f408963e & 2) != 2) {
                            this.f408965g = new ArrayList(this.f408965g);
                            this.f408963e |= 2;
                        }
                        this.f408965g.addAll(fVar.f408957f);
                    }
                }
                if (!fVar.f408958g.isEmpty()) {
                    if (this.f408966h.isEmpty()) {
                        this.f408966h = fVar.f408958g;
                        this.f408963e &= -5;
                    } else {
                        if ((this.f408963e & 4) != 4) {
                            this.f408966h = new ArrayList(this.f408966h);
                            this.f408963e |= 4;
                        }
                        this.f408966h.addAll(fVar.f408958g);
                    }
                }
                if ((fVar.f408955d & 1) == 1) {
                    k kVar2 = fVar.f408959h;
                    if ((this.f408963e & 8) != 8 || (kVar = this.f408967i) == k.f409053h) {
                        this.f408967i = kVar2;
                    } else {
                        k.b bVarE = k.e(kVar);
                        bVarE.l(kVar2);
                        this.f408967i = bVarE.k();
                    }
                    this.f408963e |= 8;
                }
                if ((fVar.f408955d & 2) == 2) {
                    m mVar2 = fVar.f408960i;
                    if ((this.f408963e & 16) != 16 || (mVar = this.f408968j) == m.f409083f) {
                        this.f408968j = mVar2;
                    } else {
                        m.b bVar = new m.b();
                        bVar.l(mVar);
                        bVar.l(mVar2);
                        this.f408968j = bVar.k();
                    }
                    this.f408963e |= 16;
                }
                l(fVar);
                this.f409359b = this.f409359b.b(fVar.f408954c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$f> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f.f408953m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$f$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$f r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$f r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            f fVar = new f(0);
            f408952l = fVar;
            fVar.f408956e = Collections.emptyList();
            fVar.f408957f = Collections.emptyList();
            fVar.f408958g = Collections.emptyList();
            fVar.f408959h = k.f409053h;
            fVar.f408960i = m.f409083f;
        }

        public f() {
            throw null;
        }

        public f(h.c cVar, a aVar) {
            super(cVar);
            this.f408961j = (byte) -1;
            this.f408962k = -1;
            this.f408954c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            for (int i12 = 0; i12 < this.f408956e.size(); i12++) {
                codedOutputStream.o(3, this.f408956e.get(i12));
            }
            for (int i13 = 0; i13 < this.f408957f.size(); i13++) {
                codedOutputStream.o(4, this.f408957f.get(i13));
            }
            for (int i14 = 0; i14 < this.f408958g.size(); i14++) {
                codedOutputStream.o(5, this.f408958g.get(i14));
            }
            if ((this.f408955d & 1) == 1) {
                codedOutputStream.o(30, this.f408959h);
            }
            if ((this.f408955d & 2) == 2) {
                codedOutputStream.o(32, this.f408960i);
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f408954c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408952l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408962k;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = 0;
            for (int i13 = 0; i13 < this.f408956e.size(); i13++) {
                iD2 += CodedOutputStream.d(3, this.f408956e.get(i13));
            }
            for (int i14 = 0; i14 < this.f408957f.size(); i14++) {
                iD2 += CodedOutputStream.d(4, this.f408957f.get(i14));
            }
            for (int i15 = 0; i15 < this.f408958g.size(); i15++) {
                iD2 += CodedOutputStream.d(5, this.f408958g.get(i15));
            }
            if ((this.f408955d & 1) == 1) {
                iD2 += CodedOutputStream.d(30, this.f408959h);
            }
            if ((this.f408955d & 2) == 2) {
                iD2 += CodedOutputStream.d(32, this.f408960i);
            }
            int size = this.f408954c.size() + f() + iD2;
            this.f408962k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408961j;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f408956e.size(); i12++) {
                if (!this.f408956e.get(i12).isInitialized()) {
                    this.f408961j = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f408957f.size(); i13++) {
                if (!this.f408957f.get(i13).isInitialized()) {
                    this.f408961j = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f408958g.size(); i14++) {
                if (!this.f408958g.get(i14).isInitialized()) {
                    this.f408961j = (byte) 0;
                    return false;
                }
            }
            if ((this.f408955d & 1) == 1 && !this.f408959h.isInitialized()) {
                this.f408961j = (byte) 0;
                return false;
            }
            if (e()) {
                this.f408961j = (byte) 1;
                return true;
            }
            this.f408961j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public f(int i12) {
            this.f408961j = (byte) -1;
            this.f408962k = -1;
            this.f408954c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        public f(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408961j = (byte) -1;
            this.f408962k = -1;
            this.f408956e = Collections.emptyList();
            this.f408957f = Collections.emptyList();
            this.f408958g = Collections.emptyList();
            this.f408959h = k.f409053h;
            this.f408960i = m.f409083f;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            char c12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 26) {
                                int i12 = (c12 == true ? 1 : 0) & 1;
                                c12 = c12;
                                if (i12 != 1) {
                                    this.f408956e = new ArrayList();
                                    c12 = (c12 == true ? 1 : 0) | 1;
                                }
                                this.f408956e.add(eVar.g(e.f408917w, fVar));
                            } else if (iN2 == 34) {
                                int i13 = (c12 == true ? 1 : 0) & 2;
                                c12 = c12;
                                if (i13 != 2) {
                                    this.f408957f = new ArrayList();
                                    c12 = (c12 == true ? 1 : 0) | 2;
                                }
                                this.f408957f.add(eVar.g(h.f408985w, fVar));
                            } else if (iN2 != 42) {
                                m.b bVar2 = null;
                                k.b bVarE = null;
                                if (iN2 == 242) {
                                    if ((this.f408955d & 1) == 1) {
                                        k kVar = this.f408959h;
                                        kVar.getClass();
                                        bVarE = k.e(kVar);
                                    }
                                    k kVar2 = (k) eVar.g(k.f409054i, fVar);
                                    this.f408959h = kVar2;
                                    if (bVarE != null) {
                                        bVarE.l(kVar2);
                                        this.f408959h = bVarE.k();
                                    }
                                    this.f408955d |= 1;
                                } else if (iN2 != 258) {
                                    if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                    }
                                } else {
                                    if ((this.f408955d & 2) == 2) {
                                        m mVar = this.f408960i;
                                        mVar.getClass();
                                        bVar2 = new m.b();
                                        bVar2.l(mVar);
                                    }
                                    m mVar2 = (m) eVar.g(m.f409084g, fVar);
                                    this.f408960i = mVar2;
                                    if (bVar2 != null) {
                                        bVar2.l(mVar2);
                                        this.f408960i = bVar2.k();
                                    }
                                    this.f408955d |= 2;
                                }
                            } else {
                                int i14 = (c12 == true ? 1 : 0) & 4;
                                c12 = c12;
                                if (i14 != 4) {
                                    this.f408958g = new ArrayList();
                                    c12 = (c12 == true ? 1 : 0) | 4;
                                }
                                this.f408958g.add(eVar.g(j.f409029q, fVar));
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if (((c12 == true ? 1 : 0) & 1) == 1) {
                            this.f408956e = Collections.unmodifiableList(this.f408956e);
                        }
                        if (((c12 == true ? 1 : 0) & 2) == 2) {
                            this.f408957f = Collections.unmodifiableList(this.f408957f);
                        }
                        if (((c12 == true ? 1 : 0) & 4) == 4) {
                            this.f408958g = Collections.unmodifiableList(this.f408958g);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408954c = bVar.c();
                            throw th3;
                        }
                        this.f408954c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if (((c12 == true ? 1 : 0) & 1) == 1) {
                this.f408956e = Collections.unmodifiableList(this.f408956e);
            }
            if (((c12 == true ? 1 : 0) & 2) == 2) {
                this.f408957f = Collections.unmodifiableList(this.f408957f);
            }
            if (((c12 == true ? 1 : 0) & 4) == 4) {
                this.f408958g = Collections.unmodifiableList(this.f408958g);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408954c = bVar.c();
                throw th4;
            }
            this.f408954c = bVar.c();
            l();
        }
    }

    public static final class g extends h.d<g> implements kotlin.reflect.jvm.internal.impl.metadata.k {

        /* renamed from: k, reason: collision with root package name */
        public static final g f408969k;

        /* renamed from: l, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<g> f408970l = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408971c;

        /* renamed from: d, reason: collision with root package name */
        public int f408972d;

        /* renamed from: e, reason: collision with root package name */
        public i f408973e;

        /* renamed from: f, reason: collision with root package name */
        public QualifiedNameTable f408974f;

        /* renamed from: g, reason: collision with root package name */
        public f f408975g;

        /* renamed from: h, reason: collision with root package name */
        public List<Class> f408976h;

        /* renamed from: i, reason: collision with root package name */
        public byte f408977i;

        /* renamed from: j, reason: collision with root package name */
        public int f408978j;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<g> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new g(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<g, b> implements kotlin.reflect.jvm.internal.impl.metadata.k {

            /* renamed from: e, reason: collision with root package name */
            public int f408979e;

            /* renamed from: f, reason: collision with root package name */
            public i f408980f = i.f409020f;

            /* renamed from: g, reason: collision with root package name */
            public QualifiedNameTable f408981g = QualifiedNameTable.f408750f;

            /* renamed from: h, reason: collision with root package name */
            public f f408982h = f.f408952l;

            /* renamed from: i, reason: collision with root package name */
            public List<Class> f408983i = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                g gVarM = m();
                if (gVarM.isInitialized()) {
                    return gVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((g) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final g m() {
                g gVar = new g(this, null);
                int i12 = this.f408979e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                gVar.f408973e = this.f408980f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                gVar.f408974f = this.f408981g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                gVar.f408975g = this.f408982h;
                if ((i12 & 8) == 8) {
                    this.f408983i = Collections.unmodifiableList(this.f408983i);
                    this.f408979e &= -9;
                }
                gVar.f408976h = this.f408983i;
                gVar.f408972d = i13;
                return gVar;
            }

            public final void n(g gVar) {
                f fVar;
                QualifiedNameTable qualifiedNameTable;
                i iVar;
                if (gVar == g.f408969k) {
                    return;
                }
                if ((gVar.f408972d & 1) == 1) {
                    i iVar2 = gVar.f408973e;
                    if ((this.f408979e & 1) != 1 || (iVar = this.f408980f) == i.f409020f) {
                        this.f408980f = iVar2;
                    } else {
                        i.b bVar = new i.b();
                        bVar.l(iVar);
                        bVar.l(iVar2);
                        this.f408980f = bVar.k();
                    }
                    this.f408979e |= 1;
                }
                if ((gVar.f408972d & 2) == 2) {
                    QualifiedNameTable qualifiedNameTable2 = gVar.f408974f;
                    if ((this.f408979e & 2) != 2 || (qualifiedNameTable = this.f408981g) == QualifiedNameTable.f408750f) {
                        this.f408981g = qualifiedNameTable2;
                    } else {
                        QualifiedNameTable.b bVar2 = new QualifiedNameTable.b();
                        bVar2.l(qualifiedNameTable);
                        bVar2.l(qualifiedNameTable2);
                        this.f408981g = bVar2.k();
                    }
                    this.f408979e |= 2;
                }
                if ((gVar.f408972d & 4) == 4) {
                    f fVar2 = gVar.f408975g;
                    if ((this.f408979e & 4) != 4 || (fVar = this.f408982h) == f.f408952l) {
                        this.f408982h = fVar2;
                    } else {
                        f.b bVar3 = new f.b();
                        bVar3.n(fVar);
                        bVar3.n(fVar2);
                        this.f408982h = bVar3.m();
                    }
                    this.f408979e |= 4;
                }
                if (!gVar.f408976h.isEmpty()) {
                    if (this.f408983i.isEmpty()) {
                        this.f408983i = gVar.f408976h;
                        this.f408979e &= -9;
                    } else {
                        if ((this.f408979e & 8) != 8) {
                            this.f408983i = new ArrayList(this.f408983i);
                            this.f408979e |= 8;
                        }
                        this.f408983i.addAll(gVar.f408976h);
                    }
                }
                l(gVar);
                this.f409359b = this.f409359b.b(gVar.f408971c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g.f408970l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            g gVar = new g(0);
            f408969k = gVar;
            gVar.f408973e = i.f409020f;
            gVar.f408974f = QualifiedNameTable.f408750f;
            gVar.f408975g = f.f408952l;
            gVar.f408976h = Collections.emptyList();
        }

        public g() {
            throw null;
        }

        public g(h.c cVar, a aVar) {
            super(cVar);
            this.f408977i = (byte) -1;
            this.f408978j = -1;
            this.f408971c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408972d & 1) == 1) {
                codedOutputStream.o(1, this.f408973e);
            }
            if ((this.f408972d & 2) == 2) {
                codedOutputStream.o(2, this.f408974f);
            }
            if ((this.f408972d & 4) == 4) {
                codedOutputStream.o(3, this.f408975g);
            }
            for (int i12 = 0; i12 < this.f408976h.size(); i12++) {
                codedOutputStream.o(4, this.f408976h.get(i12));
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f408971c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408969k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408978j;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = (this.f408972d & 1) == 1 ? CodedOutputStream.d(1, this.f408973e) : 0;
            if ((this.f408972d & 2) == 2) {
                iD2 += CodedOutputStream.d(2, this.f408974f);
            }
            if ((this.f408972d & 4) == 4) {
                iD2 += CodedOutputStream.d(3, this.f408975g);
            }
            for (int i13 = 0; i13 < this.f408976h.size(); i13++) {
                iD2 += CodedOutputStream.d(4, this.f408976h.get(i13));
            }
            int size = this.f408971c.size() + f() + iD2;
            this.f408978j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408977i;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if ((this.f408972d & 2) == 2 && !this.f408974f.isInitialized()) {
                this.f408977i = (byte) 0;
                return false;
            }
            if ((this.f408972d & 4) == 4 && !this.f408975g.isInitialized()) {
                this.f408977i = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f408976h.size(); i12++) {
                if (!this.f408976h.get(i12).isInitialized()) {
                    this.f408977i = (byte) 0;
                    return false;
                }
            }
            if (e()) {
                this.f408977i = (byte) 1;
                return true;
            }
            this.f408977i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public g(int i12) {
            this.f408977i = (byte) -1;
            this.f408978j = -1;
            this.f408971c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408977i = (byte) -1;
            this.f408978j = -1;
            this.f408973e = i.f409020f;
            this.f408974f = QualifiedNameTable.f408750f;
            this.f408975g = f.f408952l;
            this.f408976h = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            char c12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            f.b bVar2 = null;
                            i.b bVar3 = null;
                            QualifiedNameTable.b bVar4 = null;
                            if (iN2 == 10) {
                                if ((this.f408972d & 1) == 1) {
                                    i iVar = this.f408973e;
                                    iVar.getClass();
                                    bVar3 = new i.b();
                                    bVar3.l(iVar);
                                }
                                i iVar2 = (i) eVar.g(i.f409021g, fVar);
                                this.f408973e = iVar2;
                                if (bVar3 != null) {
                                    bVar3.l(iVar2);
                                    this.f408973e = bVar3.k();
                                }
                                this.f408972d |= 1;
                            } else if (iN2 == 18) {
                                if ((this.f408972d & 2) == 2) {
                                    QualifiedNameTable qualifiedNameTable = this.f408974f;
                                    qualifiedNameTable.getClass();
                                    bVar4 = new QualifiedNameTable.b();
                                    bVar4.l(qualifiedNameTable);
                                }
                                QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) eVar.g(QualifiedNameTable.f408751g, fVar);
                                this.f408974f = qualifiedNameTable2;
                                if (bVar4 != null) {
                                    bVar4.l(qualifiedNameTable2);
                                    this.f408974f = bVar4.k();
                                }
                                this.f408972d |= 2;
                            } else if (iN2 == 26) {
                                if ((this.f408972d & 4) == 4) {
                                    f fVar2 = this.f408975g;
                                    fVar2.getClass();
                                    bVar2 = new f.b();
                                    bVar2.n(fVar2);
                                }
                                f fVar3 = (f) eVar.g(f.f408953m, fVar);
                                this.f408975g = fVar3;
                                if (bVar2 != null) {
                                    bVar2.n(fVar3);
                                    this.f408975g = bVar2.m();
                                }
                                this.f408972d |= 4;
                            } else if (iN2 != 34) {
                                if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                }
                            } else {
                                int i12 = (c12 == true ? 1 : 0) & '\b';
                                c12 = c12;
                                if (i12 != 8) {
                                    this.f408976h = new ArrayList();
                                    c12 = '\b';
                                }
                                this.f408976h.add(eVar.g(Class.f408628L, fVar));
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if (((c12 == true ? 1 : 0) & '\b') == 8) {
                            this.f408976h = Collections.unmodifiableList(this.f408976h);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408971c = bVar.c();
                            throw th3;
                        }
                        this.f408971c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if (((c12 == true ? 1 : 0) & '\b') == 8) {
                this.f408976h = Collections.unmodifiableList(this.f408976h);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408971c = bVar.c();
                throw th4;
            }
            this.f408971c = bVar.c();
            l();
        }
    }

    public static final class i extends kotlin.reflect.jvm.internal.impl.protobuf.h implements p {

        /* renamed from: f, reason: collision with root package name */
        public static final i f409020f;

        /* renamed from: g, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<i> f409021g = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409022b;

        /* renamed from: c, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.m f409023c;

        /* renamed from: d, reason: collision with root package name */
        public byte f409024d;

        /* renamed from: e, reason: collision with root package name */
        public int f409025e;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<i> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new i(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<i, b> implements p {

            /* renamed from: c, reason: collision with root package name */
            public int f409026c;

            /* renamed from: d, reason: collision with root package name */
            public kotlin.reflect.jvm.internal.impl.protobuf.m f409027d = kotlin.reflect.jvm.internal.impl.protobuf.l.f409378c;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                i iVarK = k();
                if (iVarK.isInitialized()) {
                    return iVarK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((i) hVar);
                return this;
            }

            public final i k() {
                i iVar = new i(this, null);
                if ((this.f409026c & 1) == 1) {
                    this.f409027d = this.f409027d.getUnmodifiableView();
                    this.f409026c &= -2;
                }
                iVar.f409023c = this.f409027d;
                return iVar;
            }

            public final void l(i iVar) {
                if (iVar == i.f409020f) {
                    return;
                }
                if (!iVar.f409023c.isEmpty()) {
                    if (this.f409027d.isEmpty()) {
                        this.f409027d = iVar.f409023c;
                        this.f409026c &= -2;
                    } else {
                        if ((this.f409026c & 1) != 1) {
                            this.f409027d = new kotlin.reflect.jvm.internal.impl.protobuf.l(this.f409027d);
                            this.f409026c |= 1;
                        }
                        this.f409027d.addAll(iVar.f409023c);
                    }
                }
                this.f409359b = this.f409359b.b(iVar.f409022b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$i> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.i.f409021g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$i$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.i.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$i r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$i r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.i) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.i.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            i iVar = new i();
            f409020f = iVar;
            iVar.f409023c = kotlin.reflect.jvm.internal.impl.protobuf.l.f409378c;
        }

        public i(h.b bVar, a aVar) {
            this.f409024d = (byte) -1;
            this.f409025e = -1;
            this.f409022b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f409023c.size(); i12++) {
                kotlin.reflect.jvm.internal.impl.protobuf.d byteString = this.f409023c.getByteString(i12);
                codedOutputStream.x(1, 2);
                codedOutputStream.v(byteString.size());
                codedOutputStream.r(byteString);
            }
            codedOutputStream.r(this.f409022b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409025e;
            if (i12 != -1) {
                return i12;
            }
            int size = 0;
            for (int i13 = 0; i13 < this.f409023c.size(); i13++) {
                kotlin.reflect.jvm.internal.impl.protobuf.d byteString = this.f409023c.getByteString(i13);
                size += byteString.size() + CodedOutputStream.f(byteString.size());
            }
            int size2 = this.f409022b.size() + this.f409023c.size() + size;
            this.f409025e = size2;
            return size2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409024d;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409024d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public i() {
            this.f409024d = (byte) -1;
            this.f409025e = -1;
            this.f409022b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public i(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f409024d = (byte) -1;
            this.f409025e = -1;
            this.f409023c = kotlin.reflect.jvm.internal.impl.protobuf.l.f409378c;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 != 10) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.d dVarE = eVar.e();
                                if (!z13) {
                                    this.f409023c = new kotlin.reflect.jvm.internal.impl.protobuf.l();
                                    z13 = true;
                                }
                                this.f409023c.B2(dVarE);
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if (z13) {
                            this.f409023c = this.f409023c.getUnmodifiableView();
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f409022b = bVar.c();
                            throw th3;
                        }
                        this.f409022b = bVar.c();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if (z13) {
                this.f409023c = this.f409023c.getUnmodifiableView();
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409022b = bVar.c();
                throw th4;
            }
            this.f409022b = bVar.c();
        }
    }

    public static final class j extends h.d<j> implements r {

        /* renamed from: p, reason: collision with root package name */
        public static final j f409028p;

        /* renamed from: q, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<j> f409029q = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409030c;

        /* renamed from: d, reason: collision with root package name */
        public int f409031d;

        /* renamed from: e, reason: collision with root package name */
        public int f409032e;

        /* renamed from: f, reason: collision with root package name */
        public int f409033f;

        /* renamed from: g, reason: collision with root package name */
        public List<TypeParameter> f409034g;

        /* renamed from: h, reason: collision with root package name */
        public Type f409035h;

        /* renamed from: i, reason: collision with root package name */
        public int f409036i;

        /* renamed from: j, reason: collision with root package name */
        public Type f409037j;

        /* renamed from: k, reason: collision with root package name */
        public int f409038k;

        /* renamed from: l, reason: collision with root package name */
        public List<Annotation> f409039l;

        /* renamed from: m, reason: collision with root package name */
        public List<Integer> f409040m;

        /* renamed from: n, reason: collision with root package name */
        public byte f409041n;

        /* renamed from: o, reason: collision with root package name */
        public int f409042o;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<j> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new j(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<j, b> implements r {

            /* renamed from: e, reason: collision with root package name */
            public int f409043e;

            /* renamed from: g, reason: collision with root package name */
            public int f409045g;

            /* renamed from: i, reason: collision with root package name */
            public Type f409047i;

            /* renamed from: j, reason: collision with root package name */
            public int f409048j;

            /* renamed from: k, reason: collision with root package name */
            public Type f409049k;

            /* renamed from: l, reason: collision with root package name */
            public int f409050l;

            /* renamed from: m, reason: collision with root package name */
            public List<Annotation> f409051m;

            /* renamed from: n, reason: collision with root package name */
            public List<Integer> f409052n;

            /* renamed from: f, reason: collision with root package name */
            public int f409044f = 6;

            /* renamed from: h, reason: collision with root package name */
            public List<TypeParameter> f409046h = Collections.emptyList();

            public b() {
                Type type = Type.f408776u;
                this.f409047i = type;
                this.f409049k = type;
                this.f409051m = Collections.emptyList();
                this.f409052n = Collections.emptyList();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                j jVarM = m();
                if (jVarM.isInitialized()) {
                    return jVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((j) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final j m() {
                j jVar = new j(this, null);
                int i12 = this.f409043e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                jVar.f409032e = this.f409044f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                jVar.f409033f = this.f409045g;
                if ((i12 & 4) == 4) {
                    this.f409046h = Collections.unmodifiableList(this.f409046h);
                    this.f409043e &= -5;
                }
                jVar.f409034g = this.f409046h;
                if ((i12 & 8) == 8) {
                    i13 |= 4;
                }
                jVar.f409035h = this.f409047i;
                if ((i12 & 16) == 16) {
                    i13 |= 8;
                }
                jVar.f409036i = this.f409048j;
                if ((i12 & 32) == 32) {
                    i13 |= 16;
                }
                jVar.f409037j = this.f409049k;
                if ((i12 & 64) == 64) {
                    i13 |= 32;
                }
                jVar.f409038k = this.f409050l;
                if ((this.f409043e & 128) == 128) {
                    this.f409051m = Collections.unmodifiableList(this.f409051m);
                    this.f409043e &= -129;
                }
                jVar.f409039l = this.f409051m;
                if ((this.f409043e & 256) == 256) {
                    this.f409052n = Collections.unmodifiableList(this.f409052n);
                    this.f409043e &= -257;
                }
                jVar.f409040m = this.f409052n;
                jVar.f409031d = i13;
                return jVar;
            }

            public final void n(j jVar) {
                Type type;
                Type type2;
                if (jVar == j.f409028p) {
                    return;
                }
                int i12 = jVar.f409031d;
                if ((i12 & 1) == 1) {
                    int i13 = jVar.f409032e;
                    this.f409043e = 1 | this.f409043e;
                    this.f409044f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = jVar.f409033f;
                    this.f409043e = 2 | this.f409043e;
                    this.f409045g = i14;
                }
                if (!jVar.f409034g.isEmpty()) {
                    if (this.f409046h.isEmpty()) {
                        this.f409046h = jVar.f409034g;
                        this.f409043e &= -5;
                    } else {
                        if ((this.f409043e & 4) != 4) {
                            this.f409046h = new ArrayList(this.f409046h);
                            this.f409043e |= 4;
                        }
                        this.f409046h.addAll(jVar.f409034g);
                    }
                }
                if ((jVar.f409031d & 4) == 4) {
                    Type type3 = jVar.f409035h;
                    if ((this.f409043e & 8) != 8 || (type2 = this.f409047i) == Type.f408776u) {
                        this.f409047i = type3;
                    } else {
                        Type.b bVarR = Type.r(type2);
                        bVarR.n(type3);
                        this.f409047i = bVarR.m();
                    }
                    this.f409043e |= 8;
                }
                int i15 = jVar.f409031d;
                if ((i15 & 8) == 8) {
                    int i16 = jVar.f409036i;
                    this.f409043e |= 16;
                    this.f409048j = i16;
                }
                if ((i15 & 16) == 16) {
                    Type type4 = jVar.f409037j;
                    if ((this.f409043e & 32) != 32 || (type = this.f409049k) == Type.f408776u) {
                        this.f409049k = type4;
                    } else {
                        Type.b bVarR2 = Type.r(type);
                        bVarR2.n(type4);
                        this.f409049k = bVarR2.m();
                    }
                    this.f409043e |= 32;
                }
                if ((jVar.f409031d & 32) == 32) {
                    int i17 = jVar.f409038k;
                    this.f409043e |= 64;
                    this.f409050l = i17;
                }
                if (!jVar.f409039l.isEmpty()) {
                    if (this.f409051m.isEmpty()) {
                        this.f409051m = jVar.f409039l;
                        this.f409043e &= -129;
                    } else {
                        if ((this.f409043e & 128) != 128) {
                            this.f409051m = new ArrayList(this.f409051m);
                            this.f409043e |= 128;
                        }
                        this.f409051m.addAll(jVar.f409039l);
                    }
                }
                if (!jVar.f409040m.isEmpty()) {
                    if (this.f409052n.isEmpty()) {
                        this.f409052n = jVar.f409040m;
                        this.f409043e &= -257;
                    } else {
                        if ((this.f409043e & 256) != 256) {
                            this.f409052n = new ArrayList(this.f409052n);
                            this.f409043e |= 256;
                        }
                        this.f409052n.addAll(jVar.f409040m);
                    }
                }
                l(jVar);
                this.f409359b = this.f409359b.b(jVar.f409030c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$j> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.j.f409029q     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$j$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.j.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$j r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.j) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$j r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.j) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.j.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            j jVar = new j(0);
            f409028p = jVar;
            jVar.p();
        }

        public j() {
            throw null;
        }

        public j(h.c cVar, a aVar) {
            super(cVar);
            this.f409041n = (byte) -1;
            this.f409042o = -1;
            this.f409030c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f409031d & 1) == 1) {
                codedOutputStream.m(1, this.f409032e);
            }
            if ((this.f409031d & 2) == 2) {
                codedOutputStream.m(2, this.f409033f);
            }
            for (int i12 = 0; i12 < this.f409034g.size(); i12++) {
                codedOutputStream.o(3, this.f409034g.get(i12));
            }
            if ((this.f409031d & 4) == 4) {
                codedOutputStream.o(4, this.f409035h);
            }
            if ((this.f409031d & 8) == 8) {
                codedOutputStream.m(5, this.f409036i);
            }
            if ((this.f409031d & 16) == 16) {
                codedOutputStream.o(6, this.f409037j);
            }
            if ((this.f409031d & 32) == 32) {
                codedOutputStream.m(7, this.f409038k);
            }
            for (int i13 = 0; i13 < this.f409039l.size(); i13++) {
                codedOutputStream.o(8, this.f409039l.get(i13));
            }
            for (int i14 = 0; i14 < this.f409040m.size(); i14++) {
                codedOutputStream.m(31, this.f409040m.get(i14).intValue());
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f409030c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f409028p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409042o;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f409031d & 1) == 1 ? CodedOutputStream.b(1, this.f409032e) : 0;
            if ((this.f409031d & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f409033f);
            }
            for (int i13 = 0; i13 < this.f409034g.size(); i13++) {
                iB2 += CodedOutputStream.d(3, this.f409034g.get(i13));
            }
            if ((this.f409031d & 4) == 4) {
                iB2 += CodedOutputStream.d(4, this.f409035h);
            }
            if ((this.f409031d & 8) == 8) {
                iB2 += CodedOutputStream.b(5, this.f409036i);
            }
            if ((this.f409031d & 16) == 16) {
                iB2 += CodedOutputStream.d(6, this.f409037j);
            }
            if ((this.f409031d & 32) == 32) {
                iB2 += CodedOutputStream.b(7, this.f409038k);
            }
            for (int i14 = 0; i14 < this.f409039l.size(); i14++) {
                iB2 += CodedOutputStream.d(8, this.f409039l.get(i14));
            }
            int iC2 = 0;
            for (int i15 = 0; i15 < this.f409040m.size(); i15++) {
                iC2 += CodedOutputStream.c(this.f409040m.get(i15).intValue());
            }
            int size = this.f409030c.size() + f() + androidx.compose.ui.graphics.colorspace.e.f(2, iB2 + iC2, this.f409040m);
            this.f409042o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409041n;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            if ((this.f409031d & 2) != 2) {
                this.f409041n = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f409034g.size(); i12++) {
                if (!this.f409034g.get(i12).isInitialized()) {
                    this.f409041n = (byte) 0;
                    return false;
                }
            }
            if ((this.f409031d & 4) == 4 && !this.f409035h.isInitialized()) {
                this.f409041n = (byte) 0;
                return false;
            }
            if ((this.f409031d & 16) == 16 && !this.f409037j.isInitialized()) {
                this.f409041n = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < this.f409039l.size(); i13++) {
                if (!this.f409039l.get(i13).isInitialized()) {
                    this.f409041n = (byte) 0;
                    return false;
                }
            }
            if (e()) {
                this.f409041n = (byte) 1;
                return true;
            }
            this.f409041n = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        public final void p() {
            this.f409032e = 6;
            this.f409033f = 0;
            this.f409034g = Collections.emptyList();
            Type type = Type.f408776u;
            this.f409035h = type;
            this.f409036i = 0;
            this.f409037j = type;
            this.f409038k = 0;
            this.f409039l = Collections.emptyList();
            this.f409040m = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public j(int i12) {
            this.f409041n = (byte) -1;
            this.f409042o = -1;
            this.f409030c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f409041n = (byte) -1;
            this.f409042o = -1;
            p();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                ?? N12 = 128;
                if (!z12) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            Type.b bVarR = null;
                            switch (iN2) {
                                case 0:
                                    z12 = true;
                                case 8:
                                    this.f409031d |= 1;
                                    this.f409032e = eVar.k();
                                case 16:
                                    this.f409031d |= 2;
                                    this.f409033f = eVar.k();
                                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    if ((i12 & 4) != 4) {
                                        this.f409034g = new ArrayList();
                                        i12 |= 4;
                                    }
                                    this.f409034g.add(eVar.g(TypeParameter.f408831o, fVar));
                                case 34:
                                    if ((this.f409031d & 4) == 4) {
                                        Type type = this.f409035h;
                                        type.getClass();
                                        bVarR = Type.r(type);
                                    }
                                    Type type2 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f409035h = type2;
                                    if (bVarR != null) {
                                        bVarR.n(type2);
                                        this.f409035h = bVarR.m();
                                    }
                                    this.f409031d |= 4;
                                case 40:
                                    this.f409031d |= 8;
                                    this.f409036i = eVar.k();
                                case 50:
                                    if ((this.f409031d & 16) == 16) {
                                        Type type3 = this.f409037j;
                                        type3.getClass();
                                        bVarR = Type.r(type3);
                                    }
                                    Type type4 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f409037j = type4;
                                    if (bVarR != null) {
                                        bVarR.n(type4);
                                        this.f409037j = bVarR.m();
                                    }
                                    this.f409031d |= 16;
                                case 56:
                                    this.f409031d |= 32;
                                    this.f409038k = eVar.k();
                                case 66:
                                    if ((i12 & 128) != 128) {
                                        this.f409039l = new ArrayList();
                                        i12 |= 128;
                                    }
                                    this.f409039l.add(eVar.g(Annotation.f408562i, fVar));
                                case 248:
                                    if ((i12 & 256) != 256) {
                                        this.f409040m = new ArrayList();
                                        i12 |= 256;
                                    }
                                    this.f409040m.add(Integer.valueOf(eVar.k()));
                                case 250:
                                    int iD2 = eVar.d(eVar.k());
                                    if ((i12 & 256) != 256 && eVar.b() > 0) {
                                        this.f409040m = new ArrayList();
                                        i12 |= 256;
                                    }
                                    while (eVar.b() > 0) {
                                        this.f409040m.add(Integer.valueOf(eVar.k()));
                                    }
                                    eVar.c(iD2);
                                    break;
                                default:
                                    N12 = n(eVar, codedOutputStreamJ, fVar, iN2);
                                    if (N12 == 0) {
                                        z12 = true;
                                    }
                            }
                        } catch (Throwable th2) {
                            if ((i12 & 4) == 4) {
                                this.f409034g = Collections.unmodifiableList(this.f409034g);
                            }
                            if ((i12 & 128) == N12) {
                                this.f409039l = Collections.unmodifiableList(this.f409039l);
                            }
                            if ((i12 & 256) == 256) {
                                this.f409040m = Collections.unmodifiableList(this.f409040m);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f409030c = bVar.c();
                                throw th3;
                            }
                            this.f409030c = bVar.c();
                            l();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e12) {
                        e12.f409295b = this;
                        throw e12;
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } else {
                    if ((i12 & 4) == 4) {
                        this.f409034g = Collections.unmodifiableList(this.f409034g);
                    }
                    if ((i12 & 128) == 128) {
                        this.f409039l = Collections.unmodifiableList(this.f409039l);
                    }
                    if ((i12 & 256) == 256) {
                        this.f409040m = Collections.unmodifiableList(this.f409040m);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f409030c = bVar.c();
                        throw th4;
                    }
                    this.f409030c = bVar.c();
                    l();
                    return;
                }
            }
        }
    }

    public static final class k extends kotlin.reflect.jvm.internal.impl.protobuf.h implements u {

        /* renamed from: h, reason: collision with root package name */
        public static final k f409053h;

        /* renamed from: i, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<k> f409054i = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409055b;

        /* renamed from: c, reason: collision with root package name */
        public int f409056c;

        /* renamed from: d, reason: collision with root package name */
        public List<Type> f409057d;

        /* renamed from: e, reason: collision with root package name */
        public int f409058e;

        /* renamed from: f, reason: collision with root package name */
        public byte f409059f;

        /* renamed from: g, reason: collision with root package name */
        public int f409060g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<k> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new k(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<k, b> implements u {

            /* renamed from: c, reason: collision with root package name */
            public int f409061c;

            /* renamed from: d, reason: collision with root package name */
            public List<Type> f409062d = Collections.emptyList();

            /* renamed from: e, reason: collision with root package name */
            public int f409063e = -1;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                k kVarK = k();
                if (kVarK.isInitialized()) {
                    return kVarK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((k) hVar);
                return this;
            }

            public final k k() {
                k kVar = new k(this, null);
                int i12 = this.f409061c;
                if ((i12 & 1) == 1) {
                    this.f409062d = Collections.unmodifiableList(this.f409062d);
                    this.f409061c &= -2;
                }
                kVar.f409057d = this.f409062d;
                int i13 = (i12 & 2) != 2 ? 0 : 1;
                kVar.f409058e = this.f409063e;
                kVar.f409056c = i13;
                return kVar;
            }

            public final void l(k kVar) {
                if (kVar == k.f409053h) {
                    return;
                }
                if (!kVar.f409057d.isEmpty()) {
                    if (this.f409062d.isEmpty()) {
                        this.f409062d = kVar.f409057d;
                        this.f409061c &= -2;
                    } else {
                        if ((this.f409061c & 1) != 1) {
                            this.f409062d = new ArrayList(this.f409062d);
                            this.f409061c |= 1;
                        }
                        this.f409062d.addAll(kVar.f409057d);
                    }
                }
                if ((kVar.f409056c & 1) == 1) {
                    int i12 = kVar.f409058e;
                    this.f409061c |= 2;
                    this.f409063e = i12;
                }
                this.f409359b = this.f409359b.b(kVar.f409055b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$k> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.k.f409054i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$k$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.k.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$k r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.k) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$k r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.k) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.k.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            k kVar = new k();
            f409053h = kVar;
            kVar.f409057d = Collections.emptyList();
            kVar.f409058e = -1;
        }

        public k(h.b bVar, a aVar) {
            this.f409059f = (byte) -1;
            this.f409060g = -1;
            this.f409055b = bVar.f409359b;
        }

        public static b e(k kVar) {
            b bVar = new b();
            bVar.l(kVar);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f409057d.size(); i12++) {
                codedOutputStream.o(1, this.f409057d.get(i12));
            }
            if ((this.f409056c & 1) == 1) {
                codedOutputStream.m(2, this.f409058e);
            }
            codedOutputStream.r(this.f409055b);
        }

        public final b f() {
            return e(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409060g;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = 0;
            for (int i13 = 0; i13 < this.f409057d.size(); i13++) {
                iB2 += CodedOutputStream.d(1, this.f409057d.get(i13));
            }
            if ((this.f409056c & 1) == 1) {
                iB2 += CodedOutputStream.b(2, this.f409058e);
            }
            int size = this.f409055b.size() + iB2;
            this.f409060g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409059f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            for (int i12 = 0; i12 < this.f409057d.size(); i12++) {
                if (!this.f409057d.get(i12).isInitialized()) {
                    this.f409059f = (byte) 0;
                    return false;
                }
            }
            this.f409059f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            return e(this);
        }

        public k() {
            this.f409059f = (byte) -1;
            this.f409060g = -1;
            this.f409055b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f409059f = (byte) -1;
            this.f409060g = -1;
            this.f409057d = Collections.emptyList();
            this.f409058e = -1;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 10) {
                                    if (!z13) {
                                        this.f409057d = new ArrayList();
                                        z13 = true;
                                    }
                                    this.f409057d.add(eVar.g(Type.f408777v, fVar));
                                } else if (iN2 != 16) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    this.f409056c |= 1;
                                    this.f409058e = eVar.k();
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (z13) {
                        this.f409057d = Collections.unmodifiableList(this.f409057d);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f409055b = bVar.c();
                        throw th3;
                    }
                    this.f409055b = bVar.c();
                    throw th2;
                }
            }
            if (z13) {
                this.f409057d = Collections.unmodifiableList(this.f409057d);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409055b = bVar.c();
                throw th4;
            }
            this.f409055b = bVar.c();
        }
    }

    public static final class l extends h.d<l> implements v {

        /* renamed from: m, reason: collision with root package name */
        public static final l f409064m;

        /* renamed from: n, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<l> f409065n = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409066c;

        /* renamed from: d, reason: collision with root package name */
        public int f409067d;

        /* renamed from: e, reason: collision with root package name */
        public int f409068e;

        /* renamed from: f, reason: collision with root package name */
        public int f409069f;

        /* renamed from: g, reason: collision with root package name */
        public Type f409070g;

        /* renamed from: h, reason: collision with root package name */
        public int f409071h;

        /* renamed from: i, reason: collision with root package name */
        public Type f409072i;

        /* renamed from: j, reason: collision with root package name */
        public int f409073j;

        /* renamed from: k, reason: collision with root package name */
        public byte f409074k;

        /* renamed from: l, reason: collision with root package name */
        public int f409075l;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<l> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new l(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<l, b> implements v {

            /* renamed from: e, reason: collision with root package name */
            public int f409076e;

            /* renamed from: f, reason: collision with root package name */
            public int f409077f;

            /* renamed from: g, reason: collision with root package name */
            public int f409078g;

            /* renamed from: h, reason: collision with root package name */
            public Type f409079h;

            /* renamed from: i, reason: collision with root package name */
            public int f409080i;

            /* renamed from: j, reason: collision with root package name */
            public Type f409081j;

            /* renamed from: k, reason: collision with root package name */
            public int f409082k;

            public b() {
                Type type = Type.f408776u;
                this.f409079h = type;
                this.f409081j = type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                l lVarM = m();
                if (lVarM.isInitialized()) {
                    return lVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((l) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final l m() {
                l lVar = new l(this, null);
                int i12 = this.f409076e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                lVar.f409068e = this.f409077f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                lVar.f409069f = this.f409078g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                lVar.f409070g = this.f409079h;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                lVar.f409071h = this.f409080i;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                lVar.f409072i = this.f409081j;
                if ((i12 & 32) == 32) {
                    i13 |= 32;
                }
                lVar.f409073j = this.f409082k;
                lVar.f409067d = i13;
                return lVar;
            }

            public final void n(l lVar) {
                Type type;
                Type type2;
                if (lVar == l.f409064m) {
                    return;
                }
                int i12 = lVar.f409067d;
                if ((i12 & 1) == 1) {
                    int i13 = lVar.f409068e;
                    this.f409076e = 1 | this.f409076e;
                    this.f409077f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = lVar.f409069f;
                    this.f409076e = 2 | this.f409076e;
                    this.f409078g = i14;
                }
                if ((i12 & 4) == 4) {
                    Type type3 = lVar.f409070g;
                    if ((this.f409076e & 4) != 4 || (type2 = this.f409079h) == Type.f408776u) {
                        this.f409079h = type3;
                    } else {
                        Type.b bVarR = Type.r(type2);
                        bVarR.n(type3);
                        this.f409079h = bVarR.m();
                    }
                    this.f409076e |= 4;
                }
                int i15 = lVar.f409067d;
                if ((i15 & 8) == 8) {
                    int i16 = lVar.f409071h;
                    this.f409076e = 8 | this.f409076e;
                    this.f409080i = i16;
                }
                if ((i15 & 16) == 16) {
                    Type type4 = lVar.f409072i;
                    if ((this.f409076e & 16) != 16 || (type = this.f409081j) == Type.f408776u) {
                        this.f409081j = type4;
                    } else {
                        Type.b bVarR2 = Type.r(type);
                        bVarR2.n(type4);
                        this.f409081j = bVarR2.m();
                    }
                    this.f409076e |= 16;
                }
                if ((lVar.f409067d & 32) == 32) {
                    int i17 = lVar.f409073j;
                    this.f409076e = 32 | this.f409076e;
                    this.f409082k = i17;
                }
                l(lVar);
                this.f409359b = this.f409359b.b(lVar.f409066c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$l> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l.f409065n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$l$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$l r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$l r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.l.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            l lVar = new l(0);
            f409064m = lVar;
            lVar.f409068e = 0;
            lVar.f409069f = 0;
            Type type = Type.f408776u;
            lVar.f409070g = type;
            lVar.f409071h = 0;
            lVar.f409072i = type;
            lVar.f409073j = 0;
        }

        public l() {
            throw null;
        }

        public l(h.c cVar, a aVar) {
            super(cVar);
            this.f409074k = (byte) -1;
            this.f409075l = -1;
            this.f409066c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f409067d & 1) == 1) {
                codedOutputStream.m(1, this.f409068e);
            }
            if ((this.f409067d & 2) == 2) {
                codedOutputStream.m(2, this.f409069f);
            }
            if ((this.f409067d & 4) == 4) {
                codedOutputStream.o(3, this.f409070g);
            }
            if ((this.f409067d & 16) == 16) {
                codedOutputStream.o(4, this.f409072i);
            }
            if ((this.f409067d & 8) == 8) {
                codedOutputStream.m(5, this.f409071h);
            }
            if ((this.f409067d & 32) == 32) {
                codedOutputStream.m(6, this.f409073j);
            }
            aVarM.a(200, codedOutputStream);
            codedOutputStream.r(this.f409066c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f409064m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409075l;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f409067d & 1) == 1 ? CodedOutputStream.b(1, this.f409068e) : 0;
            if ((this.f409067d & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f409069f);
            }
            if ((this.f409067d & 4) == 4) {
                iB2 += CodedOutputStream.d(3, this.f409070g);
            }
            if ((this.f409067d & 16) == 16) {
                iB2 += CodedOutputStream.d(4, this.f409072i);
            }
            if ((this.f409067d & 8) == 8) {
                iB2 += CodedOutputStream.b(5, this.f409071h);
            }
            if ((this.f409067d & 32) == 32) {
                iB2 += CodedOutputStream.b(6, this.f409073j);
            }
            int size = this.f409066c.size() + f() + iB2;
            this.f409075l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409074k;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            int i12 = this.f409067d;
            if ((i12 & 2) != 2) {
                this.f409074k = (byte) 0;
                return false;
            }
            if ((i12 & 4) == 4 && !this.f409070g.isInitialized()) {
                this.f409074k = (byte) 0;
                return false;
            }
            if ((this.f409067d & 16) == 16 && !this.f409072i.isInitialized()) {
                this.f409074k = (byte) 0;
                return false;
            }
            if (e()) {
                this.f409074k = (byte) 1;
                return true;
            }
            this.f409074k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public l(int i12) {
            this.f409074k = (byte) -1;
            this.f409075l = -1;
            this.f409066c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public l(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f409074k = (byte) -1;
            this.f409075l = -1;
            boolean z12 = false;
            this.f409068e = 0;
            this.f409069f = 0;
            Type type = Type.f408776u;
            this.f409070g = type;
            this.f409071h = 0;
            this.f409072i = type;
            this.f409073j = 0;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 8) {
                                this.f409067d |= 1;
                                this.f409068e = eVar.k();
                            } else if (iN2 != 16) {
                                Type.b bVarR = null;
                                if (iN2 == 26) {
                                    if ((this.f409067d & 4) == 4) {
                                        Type type2 = this.f409070g;
                                        type2.getClass();
                                        bVarR = Type.r(type2);
                                    }
                                    Type type3 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f409070g = type3;
                                    if (bVarR != null) {
                                        bVarR.n(type3);
                                        this.f409070g = bVarR.m();
                                    }
                                    this.f409067d |= 4;
                                } else if (iN2 == 34) {
                                    if ((this.f409067d & 16) == 16) {
                                        Type type4 = this.f409072i;
                                        type4.getClass();
                                        bVarR = Type.r(type4);
                                    }
                                    Type type5 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f409072i = type5;
                                    if (bVarR != null) {
                                        bVarR.n(type5);
                                        this.f409072i = bVarR.m();
                                    }
                                    this.f409067d |= 16;
                                } else if (iN2 == 40) {
                                    this.f409067d |= 8;
                                    this.f409071h = eVar.k();
                                } else if (iN2 != 48) {
                                    if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                    }
                                } else {
                                    this.f409067d |= 32;
                                    this.f409073j = eVar.k();
                                }
                            } else {
                                this.f409067d |= 2;
                                this.f409069f = eVar.k();
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f409066c = bVar.c();
                            throw th3;
                        }
                        this.f409066c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409066c = bVar.c();
                throw th4;
            }
            this.f409066c = bVar.c();
            l();
        }
    }

    public static final class m extends kotlin.reflect.jvm.internal.impl.protobuf.h implements x {

        /* renamed from: f, reason: collision with root package name */
        public static final m f409083f;

        /* renamed from: g, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<m> f409084g = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409085b;

        /* renamed from: c, reason: collision with root package name */
        public List<VersionRequirement> f409086c;

        /* renamed from: d, reason: collision with root package name */
        public byte f409087d;

        /* renamed from: e, reason: collision with root package name */
        public int f409088e;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<m> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new m(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<m, b> implements x {

            /* renamed from: c, reason: collision with root package name */
            public int f409089c;

            /* renamed from: d, reason: collision with root package name */
            public List<VersionRequirement> f409090d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                m mVarK = k();
                if (mVarK.isInitialized()) {
                    return mVarK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                l((m) hVar);
                return this;
            }

            public final m k() {
                m mVar = new m(this, null);
                if ((this.f409089c & 1) == 1) {
                    this.f409090d = Collections.unmodifiableList(this.f409090d);
                    this.f409089c &= -2;
                }
                mVar.f409086c = this.f409090d;
                return mVar;
            }

            public final void l(m mVar) {
                if (mVar == m.f409083f) {
                    return;
                }
                if (!mVar.f409086c.isEmpty()) {
                    if (this.f409090d.isEmpty()) {
                        this.f409090d = mVar.f409086c;
                        this.f409089c &= -2;
                    } else {
                        if ((this.f409089c & 1) != 1) {
                            this.f409090d = new ArrayList(this.f409090d);
                            this.f409089c |= 1;
                        }
                        this.f409090d.addAll(mVar.f409086c);
                    }
                }
                this.f409359b = this.f409359b.b(mVar.f409085b);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$m> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.m.f409084g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$m$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.m.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$m r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$m r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.m) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.l(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.m.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            m mVar = new m();
            f409083f = mVar;
            mVar.f409086c = Collections.emptyList();
        }

        public m(h.b bVar, a aVar) {
            this.f409087d = (byte) -1;
            this.f409088e = -1;
            this.f409085b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f409086c.size(); i12++) {
                codedOutputStream.o(1, this.f409086c.get(i12));
            }
            codedOutputStream.r(this.f409085b);
        }

        public final b e() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409088e;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = 0;
            for (int i13 = 0; i13 < this.f409086c.size(); i13++) {
                iD2 += CodedOutputStream.d(1, this.f409086c.get(i13));
            }
            int size = this.f409085b.size() + iD2;
            this.f409088e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409087d;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409087d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public m() {
            this.f409087d = (byte) -1;
            this.f409088e = -1;
            this.f409085b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f409087d = (byte) -1;
            this.f409088e = -1;
            this.f409086c = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            boolean z13 = false;
            while (!z12) {
                try {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 != 10) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    if (!z13) {
                                        this.f409086c = new ArrayList();
                                        z13 = true;
                                    }
                                    this.f409086c.add(eVar.g(VersionRequirement.f408856m, fVar));
                                }
                            }
                            z12 = true;
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        }
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f409295b = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (z13) {
                        this.f409086c = Collections.unmodifiableList(this.f409086c);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f409085b = bVar.c();
                        throw th3;
                    }
                    this.f409085b = bVar.c();
                    throw th2;
                }
            }
            if (z13) {
                this.f409086c = Collections.unmodifiableList(this.f409086c);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409085b = bVar.c();
                throw th4;
            }
            this.f409085b = bVar.c();
        }
    }

    public static final class TypeParameter extends h.d<TypeParameter> implements t {

        /* renamed from: n, reason: collision with root package name */
        public static final TypeParameter f408830n;

        /* renamed from: o, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<TypeParameter> f408831o = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408832c;

        /* renamed from: d, reason: collision with root package name */
        public int f408833d;

        /* renamed from: e, reason: collision with root package name */
        public int f408834e;

        /* renamed from: f, reason: collision with root package name */
        public int f408835f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f408836g;

        /* renamed from: h, reason: collision with root package name */
        public Variance f408837h;

        /* renamed from: i, reason: collision with root package name */
        public List<Type> f408838i;

        /* renamed from: j, reason: collision with root package name */
        public List<Integer> f408839j;

        /* renamed from: k, reason: collision with root package name */
        public int f408840k;

        /* renamed from: l, reason: collision with root package name */
        public byte f408841l;

        /* renamed from: m, reason: collision with root package name */
        public int f408842m;

        public enum Variance implements i.a {
            IN(0),
            OUT(1),
            INV(2);


            /* renamed from: b, reason: collision with root package name */
            public final int f408847b;

            public static class a implements i.b<Variance> {
            }

            static {
                new a();
            }

            Variance(int i12) {
                this.f408847b = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int getNumber() {
                return this.f408847b;
            }
        }

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new TypeParameter(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<TypeParameter, b> implements t {

            /* renamed from: e, reason: collision with root package name */
            public int f408848e;

            /* renamed from: f, reason: collision with root package name */
            public int f408849f;

            /* renamed from: g, reason: collision with root package name */
            public int f408850g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f408851h;

            /* renamed from: i, reason: collision with root package name */
            public Variance f408852i = Variance.INV;

            /* renamed from: j, reason: collision with root package name */
            public List<Type> f408853j = Collections.emptyList();

            /* renamed from: k, reason: collision with root package name */
            public List<Integer> f408854k = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                TypeParameter typeParameterM = m();
                if (typeParameterM.isInitialized()) {
                    return typeParameterM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((TypeParameter) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final TypeParameter m() {
                TypeParameter typeParameter = new TypeParameter(this, null);
                int i12 = this.f408848e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                typeParameter.f408834e = this.f408849f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                typeParameter.f408835f = this.f408850g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                typeParameter.f408836g = this.f408851h;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                typeParameter.f408837h = this.f408852i;
                if ((i12 & 16) == 16) {
                    this.f408853j = Collections.unmodifiableList(this.f408853j);
                    this.f408848e &= -17;
                }
                typeParameter.f408838i = this.f408853j;
                if ((this.f408848e & 32) == 32) {
                    this.f408854k = Collections.unmodifiableList(this.f408854k);
                    this.f408848e &= -33;
                }
                typeParameter.f408839j = this.f408854k;
                typeParameter.f408833d = i13;
                return typeParameter;
            }

            public final void n(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.f408830n) {
                    return;
                }
                int i12 = typeParameter.f408833d;
                if ((i12 & 1) == 1) {
                    int i13 = typeParameter.f408834e;
                    this.f408848e = 1 | this.f408848e;
                    this.f408849f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = typeParameter.f408835f;
                    this.f408848e = 2 | this.f408848e;
                    this.f408850g = i14;
                }
                if ((i12 & 4) == 4) {
                    boolean z12 = typeParameter.f408836g;
                    this.f408848e = 4 | this.f408848e;
                    this.f408851h = z12;
                }
                if ((i12 & 8) == 8) {
                    Variance variance = typeParameter.f408837h;
                    variance.getClass();
                    this.f408848e = 8 | this.f408848e;
                    this.f408852i = variance;
                }
                if (!typeParameter.f408838i.isEmpty()) {
                    if (this.f408853j.isEmpty()) {
                        this.f408853j = typeParameter.f408838i;
                        this.f408848e &= -17;
                    } else {
                        if ((this.f408848e & 16) != 16) {
                            this.f408853j = new ArrayList(this.f408853j);
                            this.f408848e |= 16;
                        }
                        this.f408853j.addAll(typeParameter.f408838i);
                    }
                }
                if (!typeParameter.f408839j.isEmpty()) {
                    if (this.f408854k.isEmpty()) {
                        this.f408854k = typeParameter.f408839j;
                        this.f408848e &= -33;
                    } else {
                        if ((this.f408848e & 32) != 32) {
                            this.f408854k = new ArrayList(this.f408854k);
                            this.f408848e |= 32;
                        }
                        this.f408854k.addAll(typeParameter.f408839j);
                    }
                }
                l(typeParameter);
                this.f409359b = this.f409359b.b(typeParameter.f408832c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.f408831o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(0);
            f408830n = typeParameter;
            typeParameter.f408834e = 0;
            typeParameter.f408835f = 0;
            typeParameter.f408836g = false;
            typeParameter.f408837h = Variance.INV;
            typeParameter.f408838i = Collections.emptyList();
            typeParameter.f408839j = Collections.emptyList();
        }

        public TypeParameter() {
            throw null;
        }

        public TypeParameter(h.c cVar, a aVar) {
            super(cVar);
            this.f408840k = -1;
            this.f408841l = (byte) -1;
            this.f408842m = -1;
            this.f408832c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408833d & 1) == 1) {
                codedOutputStream.m(1, this.f408834e);
            }
            if ((this.f408833d & 2) == 2) {
                codedOutputStream.m(2, this.f408835f);
            }
            if ((this.f408833d & 4) == 4) {
                boolean z12 = this.f408836g;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z12 ? 1 : 0);
            }
            if ((this.f408833d & 8) == 8) {
                codedOutputStream.l(4, this.f408837h.f408847b);
            }
            for (int i12 = 0; i12 < this.f408838i.size(); i12++) {
                codedOutputStream.o(5, this.f408838i.get(i12));
            }
            if (this.f408839j.size() > 0) {
                codedOutputStream.v(50);
                codedOutputStream.v(this.f408840k);
            }
            for (int i13 = 0; i13 < this.f408839j.size(); i13++) {
                codedOutputStream.n(this.f408839j.get(i13).intValue());
            }
            aVarM.a(1000, codedOutputStream);
            codedOutputStream.r(this.f408832c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408830n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408842m;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408833d & 1) == 1 ? CodedOutputStream.b(1, this.f408834e) : 0;
            if ((this.f408833d & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f408835f);
            }
            if ((this.f408833d & 4) == 4) {
                iB2 += CodedOutputStream.h(3) + 1;
            }
            if ((this.f408833d & 8) == 8) {
                iB2 += CodedOutputStream.a(4, this.f408837h.f408847b);
            }
            for (int i13 = 0; i13 < this.f408838i.size(); i13++) {
                iB2 += CodedOutputStream.d(5, this.f408838i.get(i13));
            }
            int iC2 = 0;
            for (int i14 = 0; i14 < this.f408839j.size(); i14++) {
                iC2 += CodedOutputStream.c(this.f408839j.get(i14).intValue());
            }
            int iC3 = iB2 + iC2;
            if (!this.f408839j.isEmpty()) {
                iC3 = iC3 + 1 + CodedOutputStream.c(iC2);
            }
            this.f408840k = iC2;
            int size = this.f408832c.size() + f() + iC3;
            this.f408842m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408841l;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            int i12 = this.f408833d;
            if ((i12 & 1) != 1) {
                this.f408841l = (byte) 0;
                return false;
            }
            if ((i12 & 2) != 2) {
                this.f408841l = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < this.f408838i.size(); i13++) {
                if (!this.f408838i.get(i13).isInitialized()) {
                    this.f408841l = (byte) 0;
                    return false;
                }
            }
            if (e()) {
                this.f408841l = (byte) 1;
                return true;
            }
            this.f408841l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public TypeParameter(int i12) {
            this.f408840k = -1;
            this.f408841l = (byte) -1;
            this.f408842m = -1;
            this.f408832c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TypeParameter(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            Variance variance;
            this.f408840k = -1;
            this.f408841l = (byte) -1;
            this.f408842m = -1;
            this.f408834e = 0;
            this.f408835f = 0;
            this.f408836g = false;
            this.f408837h = Variance.INV;
            this.f408838i = Collections.emptyList();
            this.f408839j = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            int i12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 8) {
                                this.f408833d |= 1;
                                this.f408834e = eVar.k();
                            } else if (iN2 == 16) {
                                this.f408833d |= 2;
                                this.f408835f = eVar.k();
                            } else if (iN2 == 24) {
                                this.f408833d |= 4;
                                this.f408836g = eVar.l() != 0;
                            } else if (iN2 == 32) {
                                int iK2 = eVar.k();
                                if (iK2 == 0) {
                                    variance = Variance.IN;
                                } else if (iK2 != 1) {
                                    variance = iK2 != 2 ? null : Variance.INV;
                                } else {
                                    variance = Variance.OUT;
                                }
                                if (variance == null) {
                                    codedOutputStreamJ.v(iN2);
                                    codedOutputStreamJ.v(iK2);
                                } else {
                                    this.f408833d |= 8;
                                    this.f408837h = variance;
                                }
                            } else if (iN2 == 42) {
                                if ((i12 & 16) != 16) {
                                    this.f408838i = new ArrayList();
                                    i12 |= 16;
                                }
                                this.f408838i.add(eVar.g(Type.f408777v, fVar));
                            } else if (iN2 == 48) {
                                if ((i12 & 32) != 32) {
                                    this.f408839j = new ArrayList();
                                    i12 |= 32;
                                }
                                this.f408839j.add(Integer.valueOf(eVar.k()));
                            } else if (iN2 != 50) {
                                if (!n(eVar, codedOutputStreamJ, fVar, iN2)) {
                                }
                            } else {
                                int iD2 = eVar.d(eVar.k());
                                if ((i12 & 32) != 32 && eVar.b() > 0) {
                                    this.f408839j = new ArrayList();
                                    i12 |= 32;
                                }
                                while (eVar.b() > 0) {
                                    this.f408839j.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if ((i12 & 16) == 16) {
                            this.f408838i = Collections.unmodifiableList(this.f408838i);
                        }
                        if ((i12 & 32) == 32) {
                            this.f408839j = Collections.unmodifiableList(this.f408839j);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408832c = bVar.c();
                            throw th3;
                        }
                        this.f408832c = bVar.c();
                        l();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f409295b = this;
                    throw e12;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f409295b = this;
                    throw invalidProtocolBufferException;
                }
            }
            if ((i12 & 16) == 16) {
                this.f408838i = Collections.unmodifiableList(this.f408838i);
            }
            if ((i12 & 32) == 32) {
                this.f408839j = Collections.unmodifiableList(this.f408839j);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f408832c = bVar.c();
                throw th4;
            }
            this.f408832c = bVar.c();
            l();
        }
    }

    public static final class e extends h.d<e> implements kotlin.reflect.jvm.internal.impl.metadata.j {

        /* renamed from: v, reason: collision with root package name */
        public static final e f408916v;

        /* renamed from: w, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<e> f408917w = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408918c;

        /* renamed from: d, reason: collision with root package name */
        public int f408919d;

        /* renamed from: e, reason: collision with root package name */
        public int f408920e;

        /* renamed from: f, reason: collision with root package name */
        public int f408921f;

        /* renamed from: g, reason: collision with root package name */
        public int f408922g;

        /* renamed from: h, reason: collision with root package name */
        public Type f408923h;

        /* renamed from: i, reason: collision with root package name */
        public int f408924i;

        /* renamed from: j, reason: collision with root package name */
        public List<TypeParameter> f408925j;

        /* renamed from: k, reason: collision with root package name */
        public Type f408926k;

        /* renamed from: l, reason: collision with root package name */
        public int f408927l;

        /* renamed from: m, reason: collision with root package name */
        public List<Type> f408928m;

        /* renamed from: n, reason: collision with root package name */
        public List<Integer> f408929n;

        /* renamed from: o, reason: collision with root package name */
        public int f408930o;

        /* renamed from: p, reason: collision with root package name */
        public List<l> f408931p;

        /* renamed from: q, reason: collision with root package name */
        public k f408932q;

        /* renamed from: r, reason: collision with root package name */
        public List<Integer> f408933r;

        /* renamed from: s, reason: collision with root package name */
        public c f408934s;

        /* renamed from: t, reason: collision with root package name */
        public byte f408935t;

        /* renamed from: u, reason: collision with root package name */
        public int f408936u;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new e(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<e, b> implements kotlin.reflect.jvm.internal.impl.metadata.j {

            /* renamed from: e, reason: collision with root package name */
            public int f408937e;

            /* renamed from: f, reason: collision with root package name */
            public int f408938f = 6;

            /* renamed from: g, reason: collision with root package name */
            public int f408939g = 6;

            /* renamed from: h, reason: collision with root package name */
            public int f408940h;

            /* renamed from: i, reason: collision with root package name */
            public Type f408941i;

            /* renamed from: j, reason: collision with root package name */
            public int f408942j;

            /* renamed from: k, reason: collision with root package name */
            public List<TypeParameter> f408943k;

            /* renamed from: l, reason: collision with root package name */
            public Type f408944l;

            /* renamed from: m, reason: collision with root package name */
            public int f408945m;

            /* renamed from: n, reason: collision with root package name */
            public List<Type> f408946n;

            /* renamed from: o, reason: collision with root package name */
            public List<Integer> f408947o;

            /* renamed from: p, reason: collision with root package name */
            public List<l> f408948p;

            /* renamed from: q, reason: collision with root package name */
            public k f408949q;

            /* renamed from: r, reason: collision with root package name */
            public List<Integer> f408950r;

            /* renamed from: s, reason: collision with root package name */
            public c f408951s;

            public b() {
                Type type = Type.f408776u;
                this.f408941i = type;
                this.f408943k = Collections.emptyList();
                this.f408944l = type;
                this.f408946n = Collections.emptyList();
                this.f408947o = Collections.emptyList();
                this.f408948p = Collections.emptyList();
                this.f408949q = k.f409053h;
                this.f408950r = Collections.emptyList();
                this.f408951s = c.f408899f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                e eVarM = m();
                if (eVarM.isInitialized()) {
                    return eVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((e) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final e m() {
                e eVar = new e(this, null);
                int i12 = this.f408937e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                eVar.f408920e = this.f408938f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                eVar.f408921f = this.f408939g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                eVar.f408922g = this.f408940h;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                eVar.f408923h = this.f408941i;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                eVar.f408924i = this.f408942j;
                if ((i12 & 32) == 32) {
                    this.f408943k = Collections.unmodifiableList(this.f408943k);
                    this.f408937e &= -33;
                }
                eVar.f408925j = this.f408943k;
                if ((i12 & 64) == 64) {
                    i13 |= 32;
                }
                eVar.f408926k = this.f408944l;
                if ((i12 & 128) == 128) {
                    i13 |= 64;
                }
                eVar.f408927l = this.f408945m;
                if ((this.f408937e & 256) == 256) {
                    this.f408946n = Collections.unmodifiableList(this.f408946n);
                    this.f408937e &= -257;
                }
                eVar.f408928m = this.f408946n;
                if ((this.f408937e & 512) == 512) {
                    this.f408947o = Collections.unmodifiableList(this.f408947o);
                    this.f408937e &= -513;
                }
                eVar.f408929n = this.f408947o;
                if ((this.f408937e & 1024) == 1024) {
                    this.f408948p = Collections.unmodifiableList(this.f408948p);
                    this.f408937e &= -1025;
                }
                eVar.f408931p = this.f408948p;
                if ((i12 & 2048) == 2048) {
                    i13 |= 128;
                }
                eVar.f408932q = this.f408949q;
                if ((this.f408937e & 4096) == 4096) {
                    this.f408950r = Collections.unmodifiableList(this.f408950r);
                    this.f408937e &= -4097;
                }
                eVar.f408933r = this.f408950r;
                if ((i12 & 8192) == 8192) {
                    i13 |= 256;
                }
                eVar.f408934s = this.f408951s;
                eVar.f408919d = i13;
                return eVar;
            }

            public final void n(e eVar) {
                c cVar;
                k kVar;
                Type type;
                Type type2;
                if (eVar == e.f408916v) {
                    return;
                }
                int i12 = eVar.f408919d;
                if ((i12 & 1) == 1) {
                    int i13 = eVar.f408920e;
                    this.f408937e = 1 | this.f408937e;
                    this.f408938f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = eVar.f408921f;
                    this.f408937e = 2 | this.f408937e;
                    this.f408939g = i14;
                }
                if ((i12 & 4) == 4) {
                    int i15 = eVar.f408922g;
                    this.f408937e = 4 | this.f408937e;
                    this.f408940h = i15;
                }
                if ((i12 & 8) == 8) {
                    Type type3 = eVar.f408923h;
                    if ((this.f408937e & 8) != 8 || (type2 = this.f408941i) == Type.f408776u) {
                        this.f408941i = type3;
                    } else {
                        Type.b bVarR = Type.r(type2);
                        bVarR.n(type3);
                        this.f408941i = bVarR.m();
                    }
                    this.f408937e |= 8;
                }
                if ((eVar.f408919d & 16) == 16) {
                    int i16 = eVar.f408924i;
                    this.f408937e = 16 | this.f408937e;
                    this.f408942j = i16;
                }
                if (!eVar.f408925j.isEmpty()) {
                    if (this.f408943k.isEmpty()) {
                        this.f408943k = eVar.f408925j;
                        this.f408937e &= -33;
                    } else {
                        if ((this.f408937e & 32) != 32) {
                            this.f408943k = new ArrayList(this.f408943k);
                            this.f408937e |= 32;
                        }
                        this.f408943k.addAll(eVar.f408925j);
                    }
                }
                if (eVar.p()) {
                    Type type4 = eVar.f408926k;
                    if ((this.f408937e & 64) != 64 || (type = this.f408944l) == Type.f408776u) {
                        this.f408944l = type4;
                    } else {
                        Type.b bVarR2 = Type.r(type);
                        bVarR2.n(type4);
                        this.f408944l = bVarR2.m();
                    }
                    this.f408937e |= 64;
                }
                if ((eVar.f408919d & 64) == 64) {
                    int i17 = eVar.f408927l;
                    this.f408937e |= 128;
                    this.f408945m = i17;
                }
                if (!eVar.f408928m.isEmpty()) {
                    if (this.f408946n.isEmpty()) {
                        this.f408946n = eVar.f408928m;
                        this.f408937e &= -257;
                    } else {
                        if ((this.f408937e & 256) != 256) {
                            this.f408946n = new ArrayList(this.f408946n);
                            this.f408937e |= 256;
                        }
                        this.f408946n.addAll(eVar.f408928m);
                    }
                }
                if (!eVar.f408929n.isEmpty()) {
                    if (this.f408947o.isEmpty()) {
                        this.f408947o = eVar.f408929n;
                        this.f408937e &= -513;
                    } else {
                        if ((this.f408937e & 512) != 512) {
                            this.f408947o = new ArrayList(this.f408947o);
                            this.f408937e |= 512;
                        }
                        this.f408947o.addAll(eVar.f408929n);
                    }
                }
                if (!eVar.f408931p.isEmpty()) {
                    if (this.f408948p.isEmpty()) {
                        this.f408948p = eVar.f408931p;
                        this.f408937e &= -1025;
                    } else {
                        if ((this.f408937e & 1024) != 1024) {
                            this.f408948p = new ArrayList(this.f408948p);
                            this.f408937e |= 1024;
                        }
                        this.f408948p.addAll(eVar.f408931p);
                    }
                }
                if ((eVar.f408919d & 128) == 128) {
                    k kVar2 = eVar.f408932q;
                    if ((this.f408937e & 2048) != 2048 || (kVar = this.f408949q) == k.f409053h) {
                        this.f408949q = kVar2;
                    } else {
                        k.b bVarE = k.e(kVar);
                        bVarE.l(kVar2);
                        this.f408949q = bVarE.k();
                    }
                    this.f408937e |= 2048;
                }
                if (!eVar.f408933r.isEmpty()) {
                    if (this.f408950r.isEmpty()) {
                        this.f408950r = eVar.f408933r;
                        this.f408937e &= -4097;
                    } else {
                        if ((this.f408937e & 4096) != 4096) {
                            this.f408950r = new ArrayList(this.f408950r);
                            this.f408937e |= 4096;
                        }
                        this.f408950r.addAll(eVar.f408933r);
                    }
                }
                if ((eVar.f408919d & 256) == 256) {
                    c cVar2 = eVar.f408934s;
                    if ((this.f408937e & 8192) != 8192 || (cVar = this.f408951s) == c.f408899f) {
                        this.f408951s = cVar2;
                    } else {
                        c.b bVar = new c.b();
                        bVar.l(cVar);
                        bVar.l(cVar2);
                        this.f408951s = bVar.k();
                    }
                    this.f408937e |= 8192;
                }
                l(eVar);
                this.f409359b = this.f409359b.b(eVar.f408918c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e.f408917w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            e eVar = new e(0);
            f408916v = eVar;
            eVar.q();
        }

        public e() {
            throw null;
        }

        public e(h.c cVar, a aVar) {
            super(cVar);
            this.f408930o = -1;
            this.f408935t = (byte) -1;
            this.f408936u = -1;
            this.f408918c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408919d & 2) == 2) {
                codedOutputStream.m(1, this.f408921f);
            }
            if ((this.f408919d & 4) == 4) {
                codedOutputStream.m(2, this.f408922g);
            }
            if ((this.f408919d & 8) == 8) {
                codedOutputStream.o(3, this.f408923h);
            }
            for (int i12 = 0; i12 < this.f408925j.size(); i12++) {
                codedOutputStream.o(4, this.f408925j.get(i12));
            }
            if ((this.f408919d & 32) == 32) {
                codedOutputStream.o(5, this.f408926k);
            }
            for (int i13 = 0; i13 < this.f408931p.size(); i13++) {
                codedOutputStream.o(6, this.f408931p.get(i13));
            }
            if ((this.f408919d & 16) == 16) {
                codedOutputStream.m(7, this.f408924i);
            }
            if ((this.f408919d & 64) == 64) {
                codedOutputStream.m(8, this.f408927l);
            }
            if ((this.f408919d & 1) == 1) {
                codedOutputStream.m(9, this.f408920e);
            }
            for (int i14 = 0; i14 < this.f408928m.size(); i14++) {
                codedOutputStream.o(10, this.f408928m.get(i14));
            }
            if (this.f408929n.size() > 0) {
                codedOutputStream.v(90);
                codedOutputStream.v(this.f408930o);
            }
            for (int i15 = 0; i15 < this.f408929n.size(); i15++) {
                codedOutputStream.n(this.f408929n.get(i15).intValue());
            }
            if ((this.f408919d & 128) == 128) {
                codedOutputStream.o(30, this.f408932q);
            }
            for (int i16 = 0; i16 < this.f408933r.size(); i16++) {
                codedOutputStream.m(31, this.f408933r.get(i16).intValue());
            }
            if ((this.f408919d & 256) == 256) {
                codedOutputStream.o(32, this.f408934s);
            }
            aVarM.a(19000, codedOutputStream);
            codedOutputStream.r(this.f408918c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408916v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f408936u;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408919d & 2) == 2 ? CodedOutputStream.b(1, this.f408921f) : 0;
            if ((this.f408919d & 4) == 4) {
                iB2 += CodedOutputStream.b(2, this.f408922g);
            }
            if ((this.f408919d & 8) == 8) {
                iB2 += CodedOutputStream.d(3, this.f408923h);
            }
            for (int i13 = 0; i13 < this.f408925j.size(); i13++) {
                iB2 += CodedOutputStream.d(4, this.f408925j.get(i13));
            }
            if ((this.f408919d & 32) == 32) {
                iB2 += CodedOutputStream.d(5, this.f408926k);
            }
            for (int i14 = 0; i14 < this.f408931p.size(); i14++) {
                iB2 += CodedOutputStream.d(6, this.f408931p.get(i14));
            }
            if ((this.f408919d & 16) == 16) {
                iB2 += CodedOutputStream.b(7, this.f408924i);
            }
            if ((this.f408919d & 64) == 64) {
                iB2 += CodedOutputStream.b(8, this.f408927l);
            }
            if ((this.f408919d & 1) == 1) {
                iB2 += CodedOutputStream.b(9, this.f408920e);
            }
            for (int i15 = 0; i15 < this.f408928m.size(); i15++) {
                iB2 += CodedOutputStream.d(10, this.f408928m.get(i15));
            }
            int iC2 = 0;
            for (int i16 = 0; i16 < this.f408929n.size(); i16++) {
                iC2 += CodedOutputStream.c(this.f408929n.get(i16).intValue());
            }
            int iD2 = iB2 + iC2;
            if (!this.f408929n.isEmpty()) {
                iD2 = iD2 + 1 + CodedOutputStream.c(iC2);
            }
            this.f408930o = iC2;
            if ((this.f408919d & 128) == 128) {
                iD2 += CodedOutputStream.d(30, this.f408932q);
            }
            int iC3 = 0;
            for (int i17 = 0; i17 < this.f408933r.size(); i17++) {
                iC3 += CodedOutputStream.c(this.f408933r.get(i17).intValue());
            }
            int iF2 = androidx.compose.ui.graphics.colorspace.e.f(2, iD2 + iC3, this.f408933r);
            if ((this.f408919d & 256) == 256) {
                iF2 += CodedOutputStream.d(32, this.f408934s);
            }
            int size = this.f408918c.size() + f() + iF2;
            this.f408936u = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f408935t;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            int i12 = this.f408919d;
            if ((i12 & 4) != 4) {
                this.f408935t = (byte) 0;
                return false;
            }
            if ((i12 & 8) == 8 && !this.f408923h.isInitialized()) {
                this.f408935t = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < this.f408925j.size(); i13++) {
                if (!this.f408925j.get(i13).isInitialized()) {
                    this.f408935t = (byte) 0;
                    return false;
                }
            }
            if (p() && !this.f408926k.isInitialized()) {
                this.f408935t = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < this.f408928m.size(); i14++) {
                if (!this.f408928m.get(i14).isInitialized()) {
                    this.f408935t = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < this.f408931p.size(); i15++) {
                if (!this.f408931p.get(i15).isInitialized()) {
                    this.f408935t = (byte) 0;
                    return false;
                }
            }
            if ((this.f408919d & 128) == 128 && !this.f408932q.isInitialized()) {
                this.f408935t = (byte) 0;
                return false;
            }
            if ((this.f408919d & 256) == 256 && !this.f408934s.isInitialized()) {
                this.f408935t = (byte) 0;
                return false;
            }
            if (e()) {
                this.f408935t = (byte) 1;
                return true;
            }
            this.f408935t = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        public final boolean p() {
            return (this.f408919d & 32) == 32;
        }

        public final void q() {
            this.f408920e = 6;
            this.f408921f = 6;
            this.f408922g = 0;
            Type type = Type.f408776u;
            this.f408923h = type;
            this.f408924i = 0;
            this.f408925j = Collections.emptyList();
            this.f408926k = type;
            this.f408927l = 0;
            this.f408928m = Collections.emptyList();
            this.f408929n = Collections.emptyList();
            this.f408931p = Collections.emptyList();
            this.f408932q = k.f409053h;
            this.f408933r = Collections.emptyList();
            this.f408934s = c.f408899f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public e(int i12) {
            this.f408930o = -1;
            this.f408935t = (byte) -1;
            this.f408936u = -1;
            this.f408918c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408930o = -1;
            this.f408935t = (byte) -1;
            this.f408936u = -1;
            q();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            char c12 = 0;
            while (true) {
                ?? N12 = 1024;
                if (!z12) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            Type.b bVarR = null;
                            c.b bVar2 = null;
                            k.b bVarE = null;
                            Type.b bVarR2 = null;
                            switch (iN2) {
                                case 0:
                                    z12 = true;
                                case 8:
                                    this.f408919d |= 2;
                                    this.f408921f = eVar.k();
                                case 16:
                                    this.f408919d |= 4;
                                    this.f408922g = eVar.k();
                                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    if ((this.f408919d & 8) == 8) {
                                        Type type = this.f408923h;
                                        type.getClass();
                                        bVarR = Type.r(type);
                                    }
                                    Type type2 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f408923h = type2;
                                    if (bVarR != null) {
                                        bVarR.n(type2);
                                        this.f408923h = bVarR.m();
                                    }
                                    this.f408919d |= 8;
                                case 34:
                                    int i12 = (c12 == true ? 1 : 0) & 32;
                                    c12 = c12;
                                    if (i12 != 32) {
                                        this.f408925j = new ArrayList();
                                        c12 = (c12 == true ? 1 : 0) | ' ';
                                    }
                                    this.f408925j.add(eVar.g(TypeParameter.f408831o, fVar));
                                case 42:
                                    if ((this.f408919d & 32) == 32) {
                                        Type type3 = this.f408926k;
                                        type3.getClass();
                                        bVarR2 = Type.r(type3);
                                    }
                                    Type type4 = (Type) eVar.g(Type.f408777v, fVar);
                                    this.f408926k = type4;
                                    if (bVarR2 != null) {
                                        bVarR2.n(type4);
                                        this.f408926k = bVarR2.m();
                                    }
                                    this.f408919d |= 32;
                                case 50:
                                    int i13 = (c12 == true ? 1 : 0) & 1024;
                                    c12 = c12;
                                    if (i13 != 1024) {
                                        this.f408931p = new ArrayList();
                                        c12 = (c12 == true ? 1 : 0) | 1024;
                                    }
                                    this.f408931p.add(eVar.g(l.f409065n, fVar));
                                case 56:
                                    this.f408919d |= 16;
                                    this.f408924i = eVar.k();
                                case 64:
                                    this.f408919d |= 64;
                                    this.f408927l = eVar.k();
                                case 72:
                                    this.f408919d |= 1;
                                    this.f408920e = eVar.k();
                                case 82:
                                    int i14 = (c12 == true ? 1 : 0) & 256;
                                    c12 = c12;
                                    if (i14 != 256) {
                                        this.f408928m = new ArrayList();
                                        c12 = (c12 == true ? 1 : 0) | 256;
                                    }
                                    this.f408928m.add(eVar.g(Type.f408777v, fVar));
                                case 88:
                                    int i15 = (c12 == true ? 1 : 0) & 512;
                                    c12 = c12;
                                    if (i15 != 512) {
                                        this.f408929n = new ArrayList();
                                        c12 = (c12 == true ? 1 : 0) | 512;
                                    }
                                    this.f408929n.add(Integer.valueOf(eVar.k()));
                                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                    int iD2 = eVar.d(eVar.k());
                                    int i16 = (c12 == true ? 1 : 0) & 512;
                                    c12 = c12;
                                    if (i16 != 512) {
                                        c12 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408929n = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408929n.add(Integer.valueOf(eVar.k()));
                                    }
                                    eVar.c(iD2);
                                case 242:
                                    if ((this.f408919d & 128) == 128) {
                                        k kVar = this.f408932q;
                                        kVar.getClass();
                                        bVarE = k.e(kVar);
                                    }
                                    k kVar2 = (k) eVar.g(k.f409054i, fVar);
                                    this.f408932q = kVar2;
                                    if (bVarE != null) {
                                        bVarE.l(kVar2);
                                        this.f408932q = bVarE.k();
                                    }
                                    this.f408919d |= 128;
                                case 248:
                                    int i17 = (c12 == true ? 1 : 0) & 4096;
                                    c12 = c12;
                                    if (i17 != 4096) {
                                        this.f408933r = new ArrayList();
                                        c12 = (c12 == true ? 1 : 0) | 4096;
                                    }
                                    this.f408933r.add(Integer.valueOf(eVar.k()));
                                case 250:
                                    int iD3 = eVar.d(eVar.k());
                                    int i18 = (c12 == true ? 1 : 0) & 4096;
                                    c12 = c12;
                                    if (i18 != 4096) {
                                        c12 = c12;
                                        if (eVar.b() > 0) {
                                            this.f408933r = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (eVar.b() > 0) {
                                        this.f408933r.add(Integer.valueOf(eVar.k()));
                                    }
                                    eVar.c(iD3);
                                case 258:
                                    if ((this.f408919d & 256) == 256) {
                                        c cVar = this.f408934s;
                                        cVar.getClass();
                                        bVar2 = new c.b();
                                        bVar2.l(cVar);
                                    }
                                    c cVar2 = (c) eVar.g(c.f408900g, fVar);
                                    this.f408934s = cVar2;
                                    if (bVar2 != null) {
                                        bVar2.l(cVar2);
                                        this.f408934s = bVar2.k();
                                    }
                                    this.f408919d |= 256;
                                default:
                                    N12 = n(eVar, codedOutputStreamJ, fVar, iN2);
                                    if (N12 == 0) {
                                        z12 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e12) {
                            e12.f409295b = this;
                            throw e12;
                        } catch (IOException e13) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                            invalidProtocolBufferException.f409295b = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th2) {
                        if (((c12 == true ? 1 : 0) & 32) == 32) {
                            this.f408925j = Collections.unmodifiableList(this.f408925j);
                        }
                        if (((c12 == true ? 1 : 0) & 1024) == N12) {
                            this.f408931p = Collections.unmodifiableList(this.f408931p);
                        }
                        if (((c12 == true ? 1 : 0) & 256) == 256) {
                            this.f408928m = Collections.unmodifiableList(this.f408928m);
                        }
                        if (((c12 == true ? 1 : 0) & 512) == 512) {
                            this.f408929n = Collections.unmodifiableList(this.f408929n);
                        }
                        if (((c12 == true ? 1 : 0) & 4096) == 4096) {
                            this.f408933r = Collections.unmodifiableList(this.f408933r);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408918c = bVar.c();
                            throw th3;
                        }
                        this.f408918c = bVar.c();
                        l();
                        throw th2;
                    }
                } else {
                    if (((c12 == true ? 1 : 0) & 32) == 32) {
                        this.f408925j = Collections.unmodifiableList(this.f408925j);
                    }
                    if (((c12 == true ? 1 : 0) & 1024) == 1024) {
                        this.f408931p = Collections.unmodifiableList(this.f408931p);
                    }
                    if (((c12 == true ? 1 : 0) & 256) == 256) {
                        this.f408928m = Collections.unmodifiableList(this.f408928m);
                    }
                    if (((c12 == true ? 1 : 0) & 512) == 512) {
                        this.f408929n = Collections.unmodifiableList(this.f408929n);
                    }
                    if (((c12 == true ? 1 : 0) & 4096) == 4096) {
                        this.f408933r = Collections.unmodifiableList(this.f408933r);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f408918c = bVar.c();
                        throw th4;
                    }
                    this.f408918c = bVar.c();
                    l();
                    return;
                }
            }
        }
    }

    public static final class h extends h.d<h> implements kotlin.reflect.jvm.internal.impl.metadata.m {

        /* renamed from: v, reason: collision with root package name */
        public static final h f408984v;

        /* renamed from: w, reason: collision with root package name */
        public static final kotlin.reflect.jvm.internal.impl.protobuf.q<h> f408985w = new a();

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f408986c;

        /* renamed from: d, reason: collision with root package name */
        public int f408987d;

        /* renamed from: e, reason: collision with root package name */
        public int f408988e;

        /* renamed from: f, reason: collision with root package name */
        public int f408989f;

        /* renamed from: g, reason: collision with root package name */
        public int f408990g;

        /* renamed from: h, reason: collision with root package name */
        public Type f408991h;

        /* renamed from: i, reason: collision with root package name */
        public int f408992i;

        /* renamed from: j, reason: collision with root package name */
        public List<TypeParameter> f408993j;

        /* renamed from: k, reason: collision with root package name */
        public Type f408994k;

        /* renamed from: l, reason: collision with root package name */
        public int f408995l;

        /* renamed from: m, reason: collision with root package name */
        public List<Type> f408996m;

        /* renamed from: n, reason: collision with root package name */
        public List<Integer> f408997n;

        /* renamed from: o, reason: collision with root package name */
        public int f408998o;

        /* renamed from: p, reason: collision with root package name */
        public l f408999p;

        /* renamed from: q, reason: collision with root package name */
        public int f409000q;

        /* renamed from: r, reason: collision with root package name */
        public int f409001r;

        /* renamed from: s, reason: collision with root package name */
        public List<Integer> f409002s;

        /* renamed from: t, reason: collision with root package name */
        public byte f409003t;

        /* renamed from: u, reason: collision with root package name */
        public int f409004u;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<h> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                return new h(eVar, fVar, null);
            }
        }

        public static final class b extends h.c<h, b> implements kotlin.reflect.jvm.internal.impl.metadata.m {

            /* renamed from: e, reason: collision with root package name */
            public int f409005e;

            /* renamed from: f, reason: collision with root package name */
            public int f409006f = 518;

            /* renamed from: g, reason: collision with root package name */
            public int f409007g = 2054;

            /* renamed from: h, reason: collision with root package name */
            public int f409008h;

            /* renamed from: i, reason: collision with root package name */
            public Type f409009i;

            /* renamed from: j, reason: collision with root package name */
            public int f409010j;

            /* renamed from: k, reason: collision with root package name */
            public List<TypeParameter> f409011k;

            /* renamed from: l, reason: collision with root package name */
            public Type f409012l;

            /* renamed from: m, reason: collision with root package name */
            public int f409013m;

            /* renamed from: n, reason: collision with root package name */
            public List<Type> f409014n;

            /* renamed from: o, reason: collision with root package name */
            public List<Integer> f409015o;

            /* renamed from: p, reason: collision with root package name */
            public l f409016p;

            /* renamed from: q, reason: collision with root package name */
            public int f409017q;

            /* renamed from: r, reason: collision with root package name */
            public int f409018r;

            /* renamed from: s, reason: collision with root package name */
            public List<Integer> f409019s;

            public b() {
                Type type = Type.f408776u;
                this.f409009i = type;
                this.f409011k = Collections.emptyList();
                this.f409012l = type;
                this.f409014n = Collections.emptyList();
                this.f409015o = Collections.emptyList();
                this.f409016p = l.f409064m;
                this.f409019s = Collections.emptyList();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final kotlin.reflect.jvm.internal.impl.protobuf.o build() {
                h hVarM = m();
                if (hVarM.isInitialized()) {
                    return hVarM;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws Throwable {
                o(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c, kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(kotlin.reflect.jvm.internal.impl.protobuf.h hVar) {
                n((h) hVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.c
            /* renamed from: k */
            public final h.c e() {
                b bVar = new b();
                bVar.n(m());
                return bVar;
            }

            public final h m() {
                h hVar = new h(this, null);
                int i12 = this.f409005e;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                hVar.f408988e = this.f409006f;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                hVar.f408989f = this.f409007g;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                hVar.f408990g = this.f409008h;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                hVar.f408991h = this.f409009i;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                hVar.f408992i = this.f409010j;
                if ((i12 & 32) == 32) {
                    this.f409011k = Collections.unmodifiableList(this.f409011k);
                    this.f409005e &= -33;
                }
                hVar.f408993j = this.f409011k;
                if ((i12 & 64) == 64) {
                    i13 |= 32;
                }
                hVar.f408994k = this.f409012l;
                if ((i12 & 128) == 128) {
                    i13 |= 64;
                }
                hVar.f408995l = this.f409013m;
                if ((this.f409005e & 256) == 256) {
                    this.f409014n = Collections.unmodifiableList(this.f409014n);
                    this.f409005e &= -257;
                }
                hVar.f408996m = this.f409014n;
                if ((this.f409005e & 512) == 512) {
                    this.f409015o = Collections.unmodifiableList(this.f409015o);
                    this.f409005e &= -513;
                }
                hVar.f408997n = this.f409015o;
                if ((i12 & 1024) == 1024) {
                    i13 |= 128;
                }
                hVar.f408999p = this.f409016p;
                if ((i12 & 2048) == 2048) {
                    i13 |= 256;
                }
                hVar.f409000q = this.f409017q;
                if ((i12 & 4096) == 4096) {
                    i13 |= 512;
                }
                hVar.f409001r = this.f409018r;
                if ((this.f409005e & 8192) == 8192) {
                    this.f409019s = Collections.unmodifiableList(this.f409019s);
                    this.f409005e &= -8193;
                }
                hVar.f409002s = this.f409019s;
                hVar.f408987d = i13;
                return hVar;
            }

            public final void n(h hVar) {
                l lVar;
                Type type;
                Type type2;
                if (hVar == h.f408984v) {
                    return;
                }
                int i12 = hVar.f408987d;
                if ((i12 & 1) == 1) {
                    int i13 = hVar.f408988e;
                    this.f409005e = 1 | this.f409005e;
                    this.f409006f = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = hVar.f408989f;
                    this.f409005e = 2 | this.f409005e;
                    this.f409007g = i14;
                }
                if ((i12 & 4) == 4) {
                    int i15 = hVar.f408990g;
                    this.f409005e = 4 | this.f409005e;
                    this.f409008h = i15;
                }
                if ((i12 & 8) == 8) {
                    Type type3 = hVar.f408991h;
                    if ((this.f409005e & 8) != 8 || (type2 = this.f409009i) == Type.f408776u) {
                        this.f409009i = type3;
                    } else {
                        Type.b bVarR = Type.r(type2);
                        bVarR.n(type3);
                        this.f409009i = bVarR.m();
                    }
                    this.f409005e |= 8;
                }
                if ((hVar.f408987d & 16) == 16) {
                    int i16 = hVar.f408992i;
                    this.f409005e = 16 | this.f409005e;
                    this.f409010j = i16;
                }
                if (!hVar.f408993j.isEmpty()) {
                    if (this.f409011k.isEmpty()) {
                        this.f409011k = hVar.f408993j;
                        this.f409005e &= -33;
                    } else {
                        if ((this.f409005e & 32) != 32) {
                            this.f409011k = new ArrayList(this.f409011k);
                            this.f409005e |= 32;
                        }
                        this.f409011k.addAll(hVar.f408993j);
                    }
                }
                if (hVar.p()) {
                    Type type4 = hVar.f408994k;
                    if ((this.f409005e & 64) != 64 || (type = this.f409012l) == Type.f408776u) {
                        this.f409012l = type4;
                    } else {
                        Type.b bVarR2 = Type.r(type);
                        bVarR2.n(type4);
                        this.f409012l = bVarR2.m();
                    }
                    this.f409005e |= 64;
                }
                if ((hVar.f408987d & 64) == 64) {
                    int i17 = hVar.f408995l;
                    this.f409005e |= 128;
                    this.f409013m = i17;
                }
                if (!hVar.f408996m.isEmpty()) {
                    if (this.f409014n.isEmpty()) {
                        this.f409014n = hVar.f408996m;
                        this.f409005e &= -257;
                    } else {
                        if ((this.f409005e & 256) != 256) {
                            this.f409014n = new ArrayList(this.f409014n);
                            this.f409005e |= 256;
                        }
                        this.f409014n.addAll(hVar.f408996m);
                    }
                }
                if (!hVar.f408997n.isEmpty()) {
                    if (this.f409015o.isEmpty()) {
                        this.f409015o = hVar.f408997n;
                        this.f409005e &= -513;
                    } else {
                        if ((this.f409005e & 512) != 512) {
                            this.f409015o = new ArrayList(this.f409015o);
                            this.f409005e |= 512;
                        }
                        this.f409015o.addAll(hVar.f408997n);
                    }
                }
                if ((hVar.f408987d & 128) == 128) {
                    l lVar2 = hVar.f408999p;
                    if ((this.f409005e & 1024) != 1024 || (lVar = this.f409016p) == l.f409064m) {
                        this.f409016p = lVar2;
                    } else {
                        l.b bVar = new l.b();
                        bVar.n(lVar);
                        bVar.n(lVar2);
                        this.f409016p = bVar.m();
                    }
                    this.f409005e |= 1024;
                }
                int i18 = hVar.f408987d;
                if ((i18 & 256) == 256) {
                    int i19 = hVar.f409000q;
                    this.f409005e |= 2048;
                    this.f409017q = i19;
                }
                if ((i18 & 512) == 512) {
                    int i22 = hVar.f409001r;
                    this.f409005e |= 4096;
                    this.f409018r = i22;
                }
                if (!hVar.f409002s.isEmpty()) {
                    if (this.f409019s.isEmpty()) {
                        this.f409019s = hVar.f409002s;
                        this.f409005e &= -8193;
                    } else {
                        if ((this.f409005e & 8192) != 8192) {
                            this.f409019s = new ArrayList(this.f409019s);
                            this.f409005e |= 8192;
                        }
                        this.f409019s.addAll(hVar.f409002s);
                    }
                }
                l(hVar);
                this.f409359b = this.f409359b.b(hVar.f408986c);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h.f408985w     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.n(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h.b.o(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            h hVar = new h(0);
            f408984v = hVar;
            hVar.q();
        }

        public h() {
            throw null;
        }

        public h(h.c cVar, a aVar) {
            super(cVar);
            this.f408998o = -1;
            this.f409003t = (byte) -1;
            this.f409004u = -1;
            this.f408986c = cVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            h.d<MessageType>.a aVarM = m();
            if ((this.f408987d & 2) == 2) {
                codedOutputStream.m(1, this.f408989f);
            }
            if ((this.f408987d & 4) == 4) {
                codedOutputStream.m(2, this.f408990g);
            }
            if ((this.f408987d & 8) == 8) {
                codedOutputStream.o(3, this.f408991h);
            }
            for (int i12 = 0; i12 < this.f408993j.size(); i12++) {
                codedOutputStream.o(4, this.f408993j.get(i12));
            }
            if ((this.f408987d & 32) == 32) {
                codedOutputStream.o(5, this.f408994k);
            }
            if ((this.f408987d & 128) == 128) {
                codedOutputStream.o(6, this.f408999p);
            }
            if ((this.f408987d & 256) == 256) {
                codedOutputStream.m(7, this.f409000q);
            }
            if ((this.f408987d & 512) == 512) {
                codedOutputStream.m(8, this.f409001r);
            }
            if ((this.f408987d & 16) == 16) {
                codedOutputStream.m(9, this.f408992i);
            }
            if ((this.f408987d & 64) == 64) {
                codedOutputStream.m(10, this.f408995l);
            }
            if ((this.f408987d & 1) == 1) {
                codedOutputStream.m(11, this.f408988e);
            }
            for (int i13 = 0; i13 < this.f408996m.size(); i13++) {
                codedOutputStream.o(12, this.f408996m.get(i13));
            }
            if (this.f408997n.size() > 0) {
                codedOutputStream.v(106);
                codedOutputStream.v(this.f408998o);
            }
            for (int i14 = 0; i14 < this.f408997n.size(); i14++) {
                codedOutputStream.n(this.f408997n.get(i14).intValue());
            }
            for (int i15 = 0; i15 < this.f409002s.size(); i15++) {
                codedOutputStream.m(31, this.f409002s.get(i15).intValue());
            }
            aVarM.a(19000, codedOutputStream);
            codedOutputStream.r(this.f408986c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final kotlin.reflect.jvm.internal.impl.protobuf.o getDefaultInstanceForType() {
            return f408984v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409004u;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f408987d & 2) == 2 ? CodedOutputStream.b(1, this.f408989f) : 0;
            if ((this.f408987d & 4) == 4) {
                iB2 += CodedOutputStream.b(2, this.f408990g);
            }
            if ((this.f408987d & 8) == 8) {
                iB2 += CodedOutputStream.d(3, this.f408991h);
            }
            for (int i13 = 0; i13 < this.f408993j.size(); i13++) {
                iB2 += CodedOutputStream.d(4, this.f408993j.get(i13));
            }
            if ((this.f408987d & 32) == 32) {
                iB2 += CodedOutputStream.d(5, this.f408994k);
            }
            if ((this.f408987d & 128) == 128) {
                iB2 += CodedOutputStream.d(6, this.f408999p);
            }
            if ((this.f408987d & 256) == 256) {
                iB2 += CodedOutputStream.b(7, this.f409000q);
            }
            if ((this.f408987d & 512) == 512) {
                iB2 += CodedOutputStream.b(8, this.f409001r);
            }
            if ((this.f408987d & 16) == 16) {
                iB2 += CodedOutputStream.b(9, this.f408992i);
            }
            if ((this.f408987d & 64) == 64) {
                iB2 += CodedOutputStream.b(10, this.f408995l);
            }
            if ((this.f408987d & 1) == 1) {
                iB2 += CodedOutputStream.b(11, this.f408988e);
            }
            for (int i14 = 0; i14 < this.f408996m.size(); i14++) {
                iB2 += CodedOutputStream.d(12, this.f408996m.get(i14));
            }
            int iC2 = 0;
            for (int i15 = 0; i15 < this.f408997n.size(); i15++) {
                iC2 += CodedOutputStream.c(this.f408997n.get(i15).intValue());
            }
            int iC3 = iB2 + iC2;
            if (!this.f408997n.isEmpty()) {
                iC3 = iC3 + 1 + CodedOutputStream.c(iC2);
            }
            this.f408998o = iC2;
            int iC4 = 0;
            for (int i16 = 0; i16 < this.f409002s.size(); i16++) {
                iC4 += CodedOutputStream.c(this.f409002s.get(i16).intValue());
            }
            int size = this.f408986c.size() + f() + androidx.compose.ui.graphics.colorspace.e.f(2, iC3 + iC4, this.f409002s);
            this.f409004u = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409003t;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            int i12 = this.f408987d;
            if ((i12 & 4) != 4) {
                this.f409003t = (byte) 0;
                return false;
            }
            if ((i12 & 8) == 8 && !this.f408991h.isInitialized()) {
                this.f409003t = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < this.f408993j.size(); i13++) {
                if (!this.f408993j.get(i13).isInitialized()) {
                    this.f409003t = (byte) 0;
                    return false;
                }
            }
            if (p() && !this.f408994k.isInitialized()) {
                this.f409003t = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < this.f408996m.size(); i14++) {
                if (!this.f408996m.get(i14).isInitialized()) {
                    this.f409003t = (byte) 0;
                    return false;
                }
            }
            if ((this.f408987d & 128) == 128 && !this.f408999p.isInitialized()) {
                this.f409003t = (byte) 0;
                return false;
            }
            if (e()) {
                this.f409003t = (byte) 1;
                return true;
            }
            this.f409003t = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new b();
        }

        public final boolean p() {
            return (this.f408987d & 32) == 32;
        }

        public final void q() {
            this.f408988e = 518;
            this.f408989f = 2054;
            this.f408990g = 0;
            Type type = Type.f408776u;
            this.f408991h = type;
            this.f408992i = 0;
            this.f408993j = Collections.emptyList();
            this.f408994k = type;
            this.f408995l = 0;
            this.f408996m = Collections.emptyList();
            this.f408997n = Collections.emptyList();
            this.f408999p = l.f409064m;
            this.f409000q = 0;
            this.f409001r = 0;
            this.f409002s = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            b bVar = new b();
            bVar.n(this);
            return bVar;
        }

        public h(int i12) {
            this.f408998o = -1;
            this.f409003t = (byte) -1;
            this.f409004u = -1;
            this.f408986c = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        public h(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, a aVar) {
            this.f408998o = -1;
            this.f409003t = (byte) -1;
            this.f409004u = -1;
            q();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            char c12 = 0;
            while (true) {
                ?? N12 = 256;
                if (!z12) {
                    try {
                        try {
                            try {
                                int iN2 = eVar.n();
                                Type.b bVarR = null;
                                l.b bVar2 = null;
                                Type.b bVarR2 = null;
                                switch (iN2) {
                                    case 0:
                                        z12 = true;
                                    case 8:
                                        this.f408987d |= 2;
                                        this.f408989f = eVar.k();
                                    case 16:
                                        this.f408987d |= 4;
                                        this.f408990g = eVar.k();
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        if ((this.f408987d & 8) == 8) {
                                            Type type = this.f408991h;
                                            type.getClass();
                                            bVarR = Type.r(type);
                                        }
                                        Type type2 = (Type) eVar.g(Type.f408777v, fVar);
                                        this.f408991h = type2;
                                        if (bVarR != null) {
                                            bVarR.n(type2);
                                            this.f408991h = bVarR.m();
                                        }
                                        this.f408987d |= 8;
                                    case 34:
                                        int i12 = (c12 == true ? 1 : 0) & 32;
                                        c12 = c12;
                                        if (i12 != 32) {
                                            this.f408993j = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | ' ';
                                        }
                                        this.f408993j.add(eVar.g(TypeParameter.f408831o, fVar));
                                    case 42:
                                        if ((this.f408987d & 32) == 32) {
                                            Type type3 = this.f408994k;
                                            type3.getClass();
                                            bVarR2 = Type.r(type3);
                                        }
                                        Type type4 = (Type) eVar.g(Type.f408777v, fVar);
                                        this.f408994k = type4;
                                        if (bVarR2 != null) {
                                            bVarR2.n(type4);
                                            this.f408994k = bVarR2.m();
                                        }
                                        this.f408987d |= 32;
                                    case 50:
                                        if ((this.f408987d & 128) == 128) {
                                            l lVar = this.f408999p;
                                            lVar.getClass();
                                            bVar2 = new l.b();
                                            bVar2.n(lVar);
                                        }
                                        l lVar2 = (l) eVar.g(l.f409065n, fVar);
                                        this.f408999p = lVar2;
                                        if (bVar2 != null) {
                                            bVar2.n(lVar2);
                                            this.f408999p = bVar2.m();
                                        }
                                        this.f408987d |= 128;
                                    case 56:
                                        this.f408987d |= 256;
                                        this.f409000q = eVar.k();
                                    case 64:
                                        this.f408987d |= 512;
                                        this.f409001r = eVar.k();
                                    case 72:
                                        this.f408987d |= 16;
                                        this.f408992i = eVar.k();
                                    case 80:
                                        this.f408987d |= 64;
                                        this.f408995l = eVar.k();
                                    case 88:
                                        this.f408987d |= 1;
                                        this.f408988e = eVar.k();
                                    case 98:
                                        int i13 = (c12 == true ? 1 : 0) & 256;
                                        c12 = c12;
                                        if (i13 != 256) {
                                            this.f408996m = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | 256;
                                        }
                                        this.f408996m.add(eVar.g(Type.f408777v, fVar));
                                    case 104:
                                        int i14 = (c12 == true ? 1 : 0) & 512;
                                        c12 = c12;
                                        if (i14 != 512) {
                                            this.f408997n = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | 512;
                                        }
                                        this.f408997n.add(Integer.valueOf(eVar.k()));
                                    case 106:
                                        int iD2 = eVar.d(eVar.k());
                                        int i15 = (c12 == true ? 1 : 0) & 512;
                                        c12 = c12;
                                        if (i15 != 512) {
                                            c12 = c12;
                                            if (eVar.b() > 0) {
                                                this.f408997n = new ArrayList();
                                                c12 = (c12 == true ? 1 : 0) | 512;
                                            }
                                        }
                                        while (eVar.b() > 0) {
                                            this.f408997n.add(Integer.valueOf(eVar.k()));
                                        }
                                        eVar.c(iD2);
                                    case 248:
                                        int i16 = (c12 == true ? 1 : 0) & 8192;
                                        c12 = c12;
                                        if (i16 != 8192) {
                                            this.f409002s = new ArrayList();
                                            c12 = (c12 == true ? 1 : 0) | 8192;
                                        }
                                        this.f409002s.add(Integer.valueOf(eVar.k()));
                                    case 250:
                                        int iD3 = eVar.d(eVar.k());
                                        int i17 = (c12 == true ? 1 : 0) & 8192;
                                        c12 = c12;
                                        if (i17 != 8192) {
                                            c12 = c12;
                                            if (eVar.b() > 0) {
                                                this.f409002s = new ArrayList();
                                                c12 = (c12 == true ? 1 : 0) | 8192;
                                            }
                                        }
                                        while (eVar.b() > 0) {
                                            this.f409002s.add(Integer.valueOf(eVar.k()));
                                        }
                                        eVar.c(iD3);
                                    default:
                                        N12 = n(eVar, codedOutputStreamJ, fVar, iN2);
                                        if (N12 == 0) {
                                            z12 = true;
                                        }
                                }
                            } catch (IOException e12) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                                invalidProtocolBufferException.f409295b = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e13) {
                            e13.f409295b = this;
                            throw e13;
                        }
                    } catch (Throwable th2) {
                        if (((c12 == true ? 1 : 0) & 32) == 32) {
                            this.f408993j = Collections.unmodifiableList(this.f408993j);
                        }
                        if (((c12 == true ? 1 : 0) & 256) == N12) {
                            this.f408996m = Collections.unmodifiableList(this.f408996m);
                        }
                        if (((c12 == true ? 1 : 0) & 512) == 512) {
                            this.f408997n = Collections.unmodifiableList(this.f408997n);
                        }
                        if (((c12 == true ? 1 : 0) & 8192) == 8192) {
                            this.f409002s = Collections.unmodifiableList(this.f409002s);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f408986c = bVar.c();
                            throw th3;
                        }
                        this.f408986c = bVar.c();
                        l();
                        throw th2;
                    }
                } else {
                    if (((c12 == true ? 1 : 0) & 32) == 32) {
                        this.f408993j = Collections.unmodifiableList(this.f408993j);
                    }
                    if (((c12 == true ? 1 : 0) & 256) == 256) {
                        this.f408996m = Collections.unmodifiableList(this.f408996m);
                    }
                    if (((c12 == true ? 1 : 0) & 512) == 512) {
                        this.f408997n = Collections.unmodifiableList(this.f408997n);
                    }
                    if (((c12 == true ? 1 : 0) & 8192) == 8192) {
                        this.f409002s = Collections.unmodifiableList(this.f409002s);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f408986c = bVar.c();
                        throw th4;
                    }
                    this.f408986c = bVar.c();
                    l();
                    return;
                }
            }
        }
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* loaded from: classes8.dex */
public final class JvmProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final h.g<ProtoBuf.b, c> f409145a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.g<ProtoBuf.e, c> f409146b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.g<ProtoBuf.e, Integer> f409147c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.g<ProtoBuf.h, d> f409148d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.g<ProtoBuf.h, Integer> f409149e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.g<ProtoBuf.Type, List<ProtoBuf.Annotation>> f409150f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.g<ProtoBuf.Type, Boolean> f409151g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.g<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f409152h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.g<ProtoBuf.Class, Integer> f409153i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.g<ProtoBuf.Class, List<ProtoBuf.h>> f409154j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.g<ProtoBuf.Class, Integer> f409155k;

    /* renamed from: l, reason: collision with root package name */
    public static final h.g<ProtoBuf.Class, Integer> f409156l;

    /* renamed from: m, reason: collision with root package name */
    public static final h.g<ProtoBuf.f, Integer> f409157m;

    /* renamed from: n, reason: collision with root package name */
    public static final h.g<ProtoBuf.f, List<ProtoBuf.h>> f409158n;

    static {
        ProtoBuf.b bVar = ProtoBuf.b.f408886j;
        c cVar = c.f409207h;
        WireFormat.FieldType fieldType = WireFormat.FieldType.f409306n;
        f409145a = h.c(bVar, cVar, cVar, 100, fieldType, c.class);
        ProtoBuf.e eVar = ProtoBuf.e.f408916v;
        f409146b = h.c(eVar, cVar, cVar, 100, fieldType, c.class);
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f409300h;
        f409147c = h.c(eVar, 0, null, UpdateStatusCode.DialogButton.CONFIRM, fieldType2, Integer.class);
        ProtoBuf.h hVar = ProtoBuf.h.f408984v;
        d dVar = d.f409218k;
        f409148d = h.c(hVar, dVar, dVar, 100, fieldType, d.class);
        f409149e = h.c(hVar, 0, null, UpdateStatusCode.DialogButton.CONFIRM, fieldType2, Integer.class);
        ProtoBuf.Type type = ProtoBuf.Type.f408776u;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.f408561h;
        f409150f = h.b(type, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        f409151g = h.c(type, Boolean.FALSE, null, UpdateStatusCode.DialogButton.CONFIRM, WireFormat.FieldType.f409303k, Boolean.class);
        f409152h = h.b(ProtoBuf.TypeParameter.f408830n, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Class r72 = ProtoBuf.Class.f408627K;
        f409153i = h.c(r72, 0, null, UpdateStatusCode.DialogButton.CONFIRM, fieldType2, Integer.class);
        f409154j = h.b(r72, hVar, 102, fieldType, ProtoBuf.h.class);
        f409155k = h.c(r72, 0, null, 103, fieldType2, Integer.class);
        f409156l = h.c(r72, 0, null, 104, fieldType2, Integer.class);
        ProtoBuf.f fVar = ProtoBuf.f.f408952l;
        f409157m = h.c(fVar, 0, null, UpdateStatusCode.DialogButton.CONFIRM, fieldType2, Integer.class);
        f409158n = h.b(fVar, hVar, 102, fieldType, ProtoBuf.h.class);
    }

    public static final class b extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.a {

        /* renamed from: h, reason: collision with root package name */
        public static final b f409196h;

        /* renamed from: i, reason: collision with root package name */
        public static final q<b> f409197i = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409198b;

        /* renamed from: c, reason: collision with root package name */
        public int f409199c;

        /* renamed from: d, reason: collision with root package name */
        public int f409200d;

        /* renamed from: e, reason: collision with root package name */
        public int f409201e;

        /* renamed from: f, reason: collision with root package name */
        public byte f409202f;

        /* renamed from: g, reason: collision with root package name */
        public int f409203g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new b(eVar, fVar, null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$b$b, reason: collision with other inner class name */
        public static final class C11676b extends h.b<b, C11676b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.a {

            /* renamed from: c, reason: collision with root package name */
            public int f409204c;

            /* renamed from: d, reason: collision with root package name */
            public int f409205d;

            /* renamed from: e, reason: collision with root package name */
            public int f409206e;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final o build() {
                b bVarK = k();
                if (bVarK.isInitialized()) {
                    return bVarK;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: clone */
            public final Object e() {
                C11676b c11676b = new C11676b();
                c11676b.l(k());
                return c11676b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: e */
            public final a.AbstractC11678a clone() {
                C11676b c11676b = new C11676b();
                c11676b.l(k());
                return c11676b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC11678a
            /* renamed from: f */
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
                m(eVar, fVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: i */
            public final h.b clone() {
                C11676b c11676b = new C11676b();
                c11676b.l(k());
                return c11676b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            public final /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((b) hVar);
                return this;
            }

            public final b k() {
                b bVar = new b(this, null);
                int i12 = this.f409204c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                bVar.f409200d = this.f409205d;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                bVar.f409201e = this.f409206e;
                bVar.f409199c = i13;
                return bVar;
            }

            public final void l(b bVar) {
                if (bVar == b.f409196h) {
                    return;
                }
                int i12 = bVar.f409199c;
                if ((i12 & 1) == 1) {
                    int i13 = bVar.f409200d;
                    this.f409204c = 1 | this.f409204c;
                    this.f409205d = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = bVar.f409201e;
                    this.f409204c = 2 | this.f409204c;
                    this.f409206e = i14;
                }
                this.f409359b = this.f409359b.b(bVar.f409198b);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$b> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b.f409197i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$b$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$b r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$b r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.b.C11676b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            b bVar = new b();
            f409196h = bVar;
            bVar.f409200d = 0;
            bVar.f409201e = 0;
        }

        public b(h.b bVar, a aVar) {
            this.f409202f = (byte) -1;
            this.f409203g = -1;
            this.f409198b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f409199c & 1) == 1) {
                codedOutputStream.m(1, this.f409200d);
            }
            if ((this.f409199c & 2) == 2) {
                codedOutputStream.m(2, this.f409201e);
            }
            codedOutputStream.r(this.f409198b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409203g;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f409199c & 1) == 1 ? CodedOutputStream.b(1, this.f409200d) : 0;
            if ((this.f409199c & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f409201e);
            }
            int size = this.f409198b.size() + iB2;
            this.f409203g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409202f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409202f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a newBuilderForType() {
            return new C11676b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final o.a toBuilder() {
            C11676b c11676b = new C11676b();
            c11676b.l(this);
            return c11676b;
        }

        public b() {
            this.f409202f = (byte) -1;
            this.f409203g = -1;
            this.f409198b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar, a aVar) {
            this.f409202f = (byte) -1;
            this.f409203g = -1;
            boolean z12 = false;
            this.f409200d = 0;
            this.f409201e = 0;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 8) {
                                this.f409199c |= 1;
                                this.f409200d = eVar.k();
                            } else if (iN2 != 16) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f409199c |= 2;
                                this.f409201e = eVar.k();
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f409198b = bVar.c();
                            throw th3;
                        }
                        this.f409198b = bVar.c();
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
                this.f409198b = bVar.c();
                throw th4;
            }
            this.f409198b = bVar.c();
        }
    }

    public static final class c extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

        /* renamed from: h, reason: collision with root package name */
        public static final c f409207h;

        /* renamed from: i, reason: collision with root package name */
        public static final q<c> f409208i = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409209b;

        /* renamed from: c, reason: collision with root package name */
        public int f409210c;

        /* renamed from: d, reason: collision with root package name */
        public int f409211d;

        /* renamed from: e, reason: collision with root package name */
        public int f409212e;

        /* renamed from: f, reason: collision with root package name */
        public byte f409213f;

        /* renamed from: g, reason: collision with root package name */
        public int f409214g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new c(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<c, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b {

            /* renamed from: c, reason: collision with root package name */
            public int f409215c;

            /* renamed from: d, reason: collision with root package name */
            public int f409216d;

            /* renamed from: e, reason: collision with root package name */
            public int f409217e;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final o build() {
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
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((c) hVar);
                return this;
            }

            public final c k() {
                c cVar = new c(this, null);
                int i12 = this.f409215c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                cVar.f409211d = this.f409216d;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                cVar.f409212e = this.f409217e;
                cVar.f409210c = i13;
                return cVar;
            }

            public final void l(c cVar) {
                if (cVar == c.f409207h) {
                    return;
                }
                int i12 = cVar.f409210c;
                if ((i12 & 1) == 1) {
                    int i13 = cVar.f409211d;
                    this.f409215c = 1 | this.f409215c;
                    this.f409216d = i13;
                }
                if ((i12 & 2) == 2) {
                    int i14 = cVar.f409212e;
                    this.f409215c = 2 | this.f409215c;
                    this.f409217e = i14;
                }
                this.f409359b = this.f409359b.b(cVar.f409209b);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$c> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c.f409208i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$c$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$c r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$c r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.c.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            c cVar = new c();
            f409207h = cVar;
            cVar.f409211d = 0;
            cVar.f409212e = 0;
        }

        public c(h.b bVar, a aVar) {
            this.f409213f = (byte) -1;
            this.f409214g = -1;
            this.f409209b = bVar.f409359b;
        }

        public static b e(c cVar) {
            b bVar = new b();
            bVar.l(cVar);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f409210c & 1) == 1) {
                codedOutputStream.m(1, this.f409211d);
            }
            if ((this.f409210c & 2) == 2) {
                codedOutputStream.m(2, this.f409212e);
            }
            codedOutputStream.r(this.f409209b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409214g;
            if (i12 != -1) {
                return i12;
            }
            int iB2 = (this.f409210c & 1) == 1 ? CodedOutputStream.b(1, this.f409211d) : 0;
            if ((this.f409210c & 2) == 2) {
                iB2 += CodedOutputStream.b(2, this.f409212e);
            }
            int size = this.f409209b.size() + iB2;
            this.f409214g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409213f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409213f = (byte) 1;
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

        public c() {
            this.f409213f = (byte) -1;
            this.f409214g = -1;
            this.f409209b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar, a aVar) {
            this.f409213f = (byte) -1;
            this.f409214g = -1;
            boolean z12 = false;
            this.f409211d = 0;
            this.f409212e = 0;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 8) {
                                this.f409210c |= 1;
                                this.f409211d = eVar.k();
                            } else if (iN2 != 16) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                this.f409210c |= 2;
                                this.f409212e = eVar.k();
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f409209b = bVar.c();
                            throw th3;
                        }
                        this.f409209b = bVar.c();
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
                this.f409209b = bVar.c();
                throw th4;
            }
            this.f409209b = bVar.c();
        }
    }

    public static final class d extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

        /* renamed from: k, reason: collision with root package name */
        public static final d f409218k;

        /* renamed from: l, reason: collision with root package name */
        public static final q<d> f409219l = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409220b;

        /* renamed from: c, reason: collision with root package name */
        public int f409221c;

        /* renamed from: d, reason: collision with root package name */
        public b f409222d;

        /* renamed from: e, reason: collision with root package name */
        public c f409223e;

        /* renamed from: f, reason: collision with root package name */
        public c f409224f;

        /* renamed from: g, reason: collision with root package name */
        public c f409225g;

        /* renamed from: h, reason: collision with root package name */
        public c f409226h;

        /* renamed from: i, reason: collision with root package name */
        public byte f409227i;

        /* renamed from: j, reason: collision with root package name */
        public int f409228j;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new d(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<d, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c {

            /* renamed from: c, reason: collision with root package name */
            public int f409229c;

            /* renamed from: d, reason: collision with root package name */
            public b f409230d = b.f409196h;

            /* renamed from: e, reason: collision with root package name */
            public c f409231e;

            /* renamed from: f, reason: collision with root package name */
            public c f409232f;

            /* renamed from: g, reason: collision with root package name */
            public c f409233g;

            /* renamed from: h, reason: collision with root package name */
            public c f409234h;

            public b() {
                c cVar = c.f409207h;
                this.f409231e = cVar;
                this.f409232f = cVar;
                this.f409233g = cVar;
                this.f409234h = cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final o build() {
                d dVarK = k();
                if (dVarK.isInitialized()) {
                    return dVarK;
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
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((d) hVar);
                return this;
            }

            public final d k() {
                d dVar = new d(this, null);
                int i12 = this.f409229c;
                int i13 = (i12 & 1) != 1 ? 0 : 1;
                dVar.f409222d = this.f409230d;
                if ((i12 & 2) == 2) {
                    i13 |= 2;
                }
                dVar.f409223e = this.f409231e;
                if ((i12 & 4) == 4) {
                    i13 |= 4;
                }
                dVar.f409224f = this.f409232f;
                if ((i12 & 8) == 8) {
                    i13 |= 8;
                }
                dVar.f409225g = this.f409233g;
                if ((i12 & 16) == 16) {
                    i13 |= 16;
                }
                dVar.f409226h = this.f409234h;
                dVar.f409221c = i13;
                return dVar;
            }

            public final void l(d dVar) {
                c cVar;
                c cVar2;
                c cVar3;
                c cVar4;
                b bVar;
                if (dVar == d.f409218k) {
                    return;
                }
                if ((dVar.f409221c & 1) == 1) {
                    b bVar2 = dVar.f409222d;
                    if ((this.f409229c & 1) != 1 || (bVar = this.f409230d) == b.f409196h) {
                        this.f409230d = bVar2;
                    } else {
                        b.C11676b c11676b = new b.C11676b();
                        c11676b.l(bVar);
                        c11676b.l(bVar2);
                        this.f409230d = c11676b.k();
                    }
                    this.f409229c |= 1;
                }
                if ((dVar.f409221c & 2) == 2) {
                    c cVar5 = dVar.f409223e;
                    if ((this.f409229c & 2) != 2 || (cVar4 = this.f409231e) == c.f409207h) {
                        this.f409231e = cVar5;
                    } else {
                        c.b bVarE = c.e(cVar4);
                        bVarE.l(cVar5);
                        this.f409231e = bVarE.k();
                    }
                    this.f409229c |= 2;
                }
                if ((dVar.f409221c & 4) == 4) {
                    c cVar6 = dVar.f409224f;
                    if ((this.f409229c & 4) != 4 || (cVar3 = this.f409232f) == c.f409207h) {
                        this.f409232f = cVar6;
                    } else {
                        c.b bVarE2 = c.e(cVar3);
                        bVarE2.l(cVar6);
                        this.f409232f = bVarE2.k();
                    }
                    this.f409229c |= 4;
                }
                if ((dVar.f409221c & 8) == 8) {
                    c cVar7 = dVar.f409225g;
                    if ((this.f409229c & 8) != 8 || (cVar2 = this.f409233g) == c.f409207h) {
                        this.f409233g = cVar7;
                    } else {
                        c.b bVarE3 = c.e(cVar2);
                        bVarE3.l(cVar7);
                        this.f409233g = bVarE3.k();
                    }
                    this.f409229c |= 8;
                }
                if ((dVar.f409221c & 16) == 16) {
                    c cVar8 = dVar.f409226h;
                    if ((this.f409229c & 16) != 16 || (cVar = this.f409234h) == c.f409207h) {
                        this.f409234h = cVar8;
                    } else {
                        c.b bVarE4 = c.e(cVar);
                        bVarE4.l(cVar8);
                        this.f409234h = bVarE4.k();
                    }
                    this.f409229c |= 16;
                }
                this.f409359b = this.f409359b.b(dVar.f409220b);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$d> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d.f409219l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$d$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$d r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$d r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            d dVar = new d();
            f409218k = dVar;
            dVar.f409222d = b.f409196h;
            c cVar = c.f409207h;
            dVar.f409223e = cVar;
            dVar.f409224f = cVar;
            dVar.f409225g = cVar;
            dVar.f409226h = cVar;
        }

        public d(h.b bVar, a aVar) {
            this.f409227i = (byte) -1;
            this.f409228j = -1;
            this.f409220b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f409221c & 1) == 1) {
                codedOutputStream.o(1, this.f409222d);
            }
            if ((this.f409221c & 2) == 2) {
                codedOutputStream.o(2, this.f409223e);
            }
            if ((this.f409221c & 4) == 4) {
                codedOutputStream.o(3, this.f409224f);
            }
            if ((this.f409221c & 8) == 8) {
                codedOutputStream.o(4, this.f409225g);
            }
            if ((this.f409221c & 16) == 16) {
                codedOutputStream.o(5, this.f409226h);
            }
            codedOutputStream.r(this.f409220b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409228j;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = (this.f409221c & 1) == 1 ? CodedOutputStream.d(1, this.f409222d) : 0;
            if ((this.f409221c & 2) == 2) {
                iD2 += CodedOutputStream.d(2, this.f409223e);
            }
            if ((this.f409221c & 4) == 4) {
                iD2 += CodedOutputStream.d(3, this.f409224f);
            }
            if ((this.f409221c & 8) == 8) {
                iD2 += CodedOutputStream.d(4, this.f409225g);
            }
            if ((this.f409221c & 16) == 16) {
                iD2 += CodedOutputStream.d(5, this.f409226h);
            }
            int size = this.f409220b.size() + iD2;
            this.f409228j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409227i;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409227i = (byte) 1;
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

        public d() {
            this.f409227i = (byte) -1;
            this.f409228j = -1;
            this.f409220b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        public d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar, a aVar) {
            this.f409227i = (byte) -1;
            this.f409228j = -1;
            this.f409222d = b.f409196h;
            c cVar = c.f409207h;
            this.f409223e = cVar;
            this.f409224f = cVar;
            this.f409225g = cVar;
            this.f409226h = cVar;
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            c.b bVarE = null;
                            b.C11676b c11676b = null;
                            c.b bVarE2 = null;
                            c.b bVarE3 = null;
                            c.b bVarE4 = null;
                            if (iN2 == 10) {
                                if ((this.f409221c & 1) == 1) {
                                    b bVar2 = this.f409222d;
                                    bVar2.getClass();
                                    c11676b = new b.C11676b();
                                    c11676b.l(bVar2);
                                }
                                b bVar3 = (b) eVar.g(b.f409197i, fVar);
                                this.f409222d = bVar3;
                                if (c11676b != null) {
                                    c11676b.l(bVar3);
                                    this.f409222d = c11676b.k();
                                }
                                this.f409221c |= 1;
                            } else if (iN2 == 18) {
                                if ((this.f409221c & 2) == 2) {
                                    c cVar2 = this.f409223e;
                                    cVar2.getClass();
                                    bVarE2 = c.e(cVar2);
                                }
                                c cVar3 = (c) eVar.g(c.f409208i, fVar);
                                this.f409223e = cVar3;
                                if (bVarE2 != null) {
                                    bVarE2.l(cVar3);
                                    this.f409223e = bVarE2.k();
                                }
                                this.f409221c |= 2;
                            } else if (iN2 == 26) {
                                if ((this.f409221c & 4) == 4) {
                                    c cVar4 = this.f409224f;
                                    cVar4.getClass();
                                    bVarE3 = c.e(cVar4);
                                }
                                c cVar5 = (c) eVar.g(c.f409208i, fVar);
                                this.f409224f = cVar5;
                                if (bVarE3 != null) {
                                    bVarE3.l(cVar5);
                                    this.f409224f = bVarE3.k();
                                }
                                this.f409221c |= 4;
                            } else if (iN2 == 34) {
                                if ((this.f409221c & 8) == 8) {
                                    c cVar6 = this.f409225g;
                                    cVar6.getClass();
                                    bVarE4 = c.e(cVar6);
                                }
                                c cVar7 = (c) eVar.g(c.f409208i, fVar);
                                this.f409225g = cVar7;
                                if (bVarE4 != null) {
                                    bVarE4.l(cVar7);
                                    this.f409225g = bVarE4.k();
                                }
                                this.f409221c |= 8;
                            } else if (iN2 != 42) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                if ((this.f409221c & 16) == 16) {
                                    c cVar8 = this.f409226h;
                                    cVar8.getClass();
                                    bVarE = c.e(cVar8);
                                }
                                c cVar9 = (c) eVar.g(c.f409208i, fVar);
                                this.f409226h = cVar9;
                                if (bVarE != null) {
                                    bVarE.l(cVar9);
                                    this.f409226h = bVarE.k();
                                }
                                this.f409221c |= 16;
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
                        this.f409220b = bVar.c();
                        throw th3;
                    }
                    this.f409220b = bVar.c();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409220b = bVar.c();
                throw th4;
            }
            this.f409220b = bVar.c();
        }
    }

    public static final class StringTableTypes extends h implements e {

        /* renamed from: h, reason: collision with root package name */
        public static final StringTableTypes f409159h;

        /* renamed from: i, reason: collision with root package name */
        public static final q<StringTableTypes> f409160i = new a();

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.protobuf.d f409161b;

        /* renamed from: c, reason: collision with root package name */
        public List<Record> f409162c;

        /* renamed from: d, reason: collision with root package name */
        public List<Integer> f409163d;

        /* renamed from: e, reason: collision with root package name */
        public int f409164e;

        /* renamed from: f, reason: collision with root package name */
        public byte f409165f;

        /* renamed from: g, reason: collision with root package name */
        public int f409166g;

        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                return new StringTableTypes(eVar, fVar, null);
            }
        }

        public static final class b extends h.b<StringTableTypes, b> implements e {

            /* renamed from: c, reason: collision with root package name */
            public int f409193c;

            /* renamed from: d, reason: collision with root package name */
            public List<Record> f409194d = Collections.emptyList();

            /* renamed from: e, reason: collision with root package name */
            public List<Integer> f409195e = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            public final o build() {
                StringTableTypes stringTableTypesK = k();
                if (stringTableTypesK.isInitialized()) {
                    return stringTableTypesK;
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
            public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
            public final /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((StringTableTypes) hVar);
                return this;
            }

            public final StringTableTypes k() {
                StringTableTypes stringTableTypes = new StringTableTypes(this, null);
                if ((this.f409193c & 1) == 1) {
                    this.f409194d = Collections.unmodifiableList(this.f409194d);
                    this.f409193c &= -2;
                }
                stringTableTypes.f409162c = this.f409194d;
                if ((this.f409193c & 2) == 2) {
                    this.f409195e = Collections.unmodifiableList(this.f409195e);
                    this.f409193c &= -3;
                }
                stringTableTypes.f409163d = this.f409195e;
                return stringTableTypes;
            }

            public final void l(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.f409159h) {
                    return;
                }
                if (!stringTableTypes.f409162c.isEmpty()) {
                    if (this.f409194d.isEmpty()) {
                        this.f409194d = stringTableTypes.f409162c;
                        this.f409193c &= -2;
                    } else {
                        if ((this.f409193c & 1) != 1) {
                            this.f409194d = new ArrayList(this.f409194d);
                            this.f409193c |= 1;
                        }
                        this.f409194d.addAll(stringTableTypes.f409162c);
                    }
                }
                if (!stringTableTypes.f409163d.isEmpty()) {
                    if (this.f409195e.isEmpty()) {
                        this.f409195e = stringTableTypes.f409163d;
                        this.f409193c &= -3;
                    } else {
                        if ((this.f409193c & 2) != 2) {
                            this.f409195e = new ArrayList(this.f409195e);
                            this.f409193c |= 2;
                        }
                        this.f409195e.addAll(stringTableTypes.f409163d);
                    }
                }
                this.f409359b = this.f409359b.b(stringTableTypes.f409161b);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.f409160i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.l(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f409159h = stringTableTypes;
            stringTableTypes.f409162c = Collections.emptyList();
            stringTableTypes.f409163d = Collections.emptyList();
        }

        public StringTableTypes(h.b bVar, a aVar) {
            this.f409164e = -1;
            this.f409165f = (byte) -1;
            this.f409166g = -1;
            this.f409161b = bVar.f409359b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final void a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i12 = 0; i12 < this.f409162c.size(); i12++) {
                codedOutputStream.o(1, this.f409162c.get(i12));
            }
            if (this.f409163d.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.f409164e);
            }
            for (int i13 = 0; i13 < this.f409163d.size(); i13++) {
                codedOutputStream.n(this.f409163d.get(i13).intValue());
            }
            codedOutputStream.r(this.f409161b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final int getSerializedSize() {
            int i12 = this.f409166g;
            if (i12 != -1) {
                return i12;
            }
            int iD2 = 0;
            for (int i13 = 0; i13 < this.f409162c.size(); i13++) {
                iD2 += CodedOutputStream.d(1, this.f409162c.get(i13));
            }
            int iC2 = 0;
            for (int i14 = 0; i14 < this.f409163d.size(); i14++) {
                iC2 += CodedOutputStream.c(this.f409163d.get(i14).intValue());
            }
            int iC3 = iD2 + iC2;
            if (!this.f409163d.isEmpty()) {
                iC3 = iC3 + 1 + CodedOutputStream.c(iC2);
            }
            this.f409164e = iC2;
            int size = this.f409161b.size() + iC3;
            this.f409166g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b12 = this.f409165f;
            if (b12 == 1) {
                return true;
            }
            if (b12 == 0) {
                return false;
            }
            this.f409165f = (byte) 1;
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

        public static final class Record extends h implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

            /* renamed from: n, reason: collision with root package name */
            public static final Record f409167n;

            /* renamed from: o, reason: collision with root package name */
            public static final q<Record> f409168o = new a();

            /* renamed from: b, reason: collision with root package name */
            public final kotlin.reflect.jvm.internal.impl.protobuf.d f409169b;

            /* renamed from: c, reason: collision with root package name */
            public int f409170c;

            /* renamed from: d, reason: collision with root package name */
            public int f409171d;

            /* renamed from: e, reason: collision with root package name */
            public int f409172e;

            /* renamed from: f, reason: collision with root package name */
            public Object f409173f;

            /* renamed from: g, reason: collision with root package name */
            public Operation f409174g;

            /* renamed from: h, reason: collision with root package name */
            public List<Integer> f409175h;

            /* renamed from: i, reason: collision with root package name */
            public int f409176i;

            /* renamed from: j, reason: collision with root package name */
            public List<Integer> f409177j;

            /* renamed from: k, reason: collision with root package name */
            public int f409178k;

            /* renamed from: l, reason: collision with root package name */
            public byte f409179l;

            /* renamed from: m, reason: collision with root package name */
            public int f409180m;

            public enum Operation implements i.a {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);


                /* renamed from: b, reason: collision with root package name */
                public final int f409185b;

                public static class a implements i.b<Operation> {
                }

                static {
                    new a();
                }

                Operation(int i12) {
                    this.f409185b = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int getNumber() {
                    return this.f409185b;
                }
            }

            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                public final Object a(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) {
                    return new Record(eVar, fVar, null);
                }
            }

            public static final class b extends h.b<Record, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d {

                /* renamed from: c, reason: collision with root package name */
                public int f409186c;

                /* renamed from: e, reason: collision with root package name */
                public int f409188e;

                /* renamed from: d, reason: collision with root package name */
                public int f409187d = 1;

                /* renamed from: f, reason: collision with root package name */
                public Object f409189f = "";

                /* renamed from: g, reason: collision with root package name */
                public Operation f409190g = Operation.NONE;

                /* renamed from: h, reason: collision with root package name */
                public List<Integer> f409191h = Collections.emptyList();

                /* renamed from: i, reason: collision with root package name */
                public List<Integer> f409192i = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                public final o build() {
                    Record recordK = k();
                    if (recordK.isInitialized()) {
                        return recordK;
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
                public final /* bridge */ /* synthetic */ o.a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
                public final /* bridge */ /* synthetic */ a.AbstractC11678a d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws Throwable {
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
                public final /* bridge */ /* synthetic */ h.b j(h hVar) {
                    l((Record) hVar);
                    return this;
                }

                public final Record k() {
                    Record record = new Record(this, null);
                    int i12 = this.f409186c;
                    int i13 = (i12 & 1) != 1 ? 0 : 1;
                    record.f409171d = this.f409187d;
                    if ((i12 & 2) == 2) {
                        i13 |= 2;
                    }
                    record.f409172e = this.f409188e;
                    if ((i12 & 4) == 4) {
                        i13 |= 4;
                    }
                    record.f409173f = this.f409189f;
                    if ((i12 & 8) == 8) {
                        i13 |= 8;
                    }
                    record.f409174g = this.f409190g;
                    if ((i12 & 16) == 16) {
                        this.f409191h = Collections.unmodifiableList(this.f409191h);
                        this.f409186c &= -17;
                    }
                    record.f409175h = this.f409191h;
                    if ((this.f409186c & 32) == 32) {
                        this.f409192i = Collections.unmodifiableList(this.f409192i);
                        this.f409186c &= -33;
                    }
                    record.f409177j = this.f409192i;
                    record.f409170c = i13;
                    return record;
                }

                public final void l(Record record) {
                    if (record == Record.f409167n) {
                        return;
                    }
                    int i12 = record.f409170c;
                    if ((i12 & 1) == 1) {
                        int i13 = record.f409171d;
                        this.f409186c = 1 | this.f409186c;
                        this.f409187d = i13;
                    }
                    if ((i12 & 2) == 2) {
                        int i14 = record.f409172e;
                        this.f409186c = 2 | this.f409186c;
                        this.f409188e = i14;
                    }
                    if ((i12 & 4) == 4) {
                        this.f409186c |= 4;
                        this.f409189f = record.f409173f;
                    }
                    if ((i12 & 8) == 8) {
                        Operation operation = record.f409174g;
                        operation.getClass();
                        this.f409186c = 8 | this.f409186c;
                        this.f409190g = operation;
                    }
                    if (!record.f409175h.isEmpty()) {
                        if (this.f409191h.isEmpty()) {
                            this.f409191h = record.f409175h;
                            this.f409186c &= -17;
                        } else {
                            if ((this.f409186c & 16) != 16) {
                                this.f409191h = new ArrayList(this.f409191h);
                                this.f409186c |= 16;
                            }
                            this.f409191h.addAll(record.f409175h);
                        }
                    }
                    if (!record.f409177j.isEmpty()) {
                        if (this.f409192i.isEmpty()) {
                            this.f409192i = record.f409177j;
                            this.f409186c &= -33;
                        } else {
                            if ((this.f409186c & 32) != 32) {
                                this.f409192i = new ArrayList(this.f409192i);
                                this.f409186c |= 32;
                            }
                            this.f409192i.addAll(record.f409177j);
                        }
                    }
                    this.f409359b = this.f409359b.b(record.f409169b);
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
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.f409168o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$a r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.a) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r2.l(r3)
                        return
                    Lf:
                        r3 = move-exception
                        goto L19
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.f409295b     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.b.m(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
                }
            }

            static {
                Record record = new Record();
                f409167n = record;
                record.f409171d = 1;
                record.f409172e = 0;
                record.f409173f = "";
                record.f409174g = Operation.NONE;
                record.f409175h = Collections.emptyList();
                record.f409177j = Collections.emptyList();
            }

            public Record(h.b bVar, a aVar) {
                this.f409176i = -1;
                this.f409178k = -1;
                this.f409179l = (byte) -1;
                this.f409180m = -1;
                this.f409169b = bVar.f409359b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final void a(CodedOutputStream codedOutputStream) throws IOException {
                kotlin.reflect.jvm.internal.impl.protobuf.d dVarD;
                getSerializedSize();
                if ((this.f409170c & 1) == 1) {
                    codedOutputStream.m(1, this.f409171d);
                }
                if ((this.f409170c & 2) == 2) {
                    codedOutputStream.m(2, this.f409172e);
                }
                if ((this.f409170c & 8) == 8) {
                    codedOutputStream.l(3, this.f409174g.f409185b);
                }
                if (this.f409175h.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.f409176i);
                }
                for (int i12 = 0; i12 < this.f409175h.size(); i12++) {
                    codedOutputStream.n(this.f409175h.get(i12).intValue());
                }
                if (this.f409177j.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.f409178k);
                }
                for (int i13 = 0; i13 < this.f409177j.size(); i13++) {
                    codedOutputStream.n(this.f409177j.get(i13).intValue());
                }
                if ((this.f409170c & 4) == 4) {
                    Object obj = this.f409173f;
                    if (obj instanceof String) {
                        dVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.d((String) obj);
                        this.f409173f = dVarD;
                    } else {
                        dVarD = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(dVarD.size());
                    codedOutputStream.r(dVarD);
                }
                codedOutputStream.r(this.f409169b);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final int getSerializedSize() {
                kotlin.reflect.jvm.internal.impl.protobuf.d dVarD;
                int i12 = this.f409180m;
                if (i12 != -1) {
                    return i12;
                }
                int iB2 = (this.f409170c & 1) == 1 ? CodedOutputStream.b(1, this.f409171d) : 0;
                if ((this.f409170c & 2) == 2) {
                    iB2 += CodedOutputStream.b(2, this.f409172e);
                }
                if ((this.f409170c & 8) == 8) {
                    iB2 += CodedOutputStream.a(3, this.f409174g.f409185b);
                }
                int iC2 = 0;
                for (int i13 = 0; i13 < this.f409175h.size(); i13++) {
                    iC2 += CodedOutputStream.c(this.f409175h.get(i13).intValue());
                }
                int iC3 = iB2 + iC2;
                if (!this.f409175h.isEmpty()) {
                    iC3 = iC3 + 1 + CodedOutputStream.c(iC2);
                }
                this.f409176i = iC2;
                int iC4 = 0;
                for (int i14 = 0; i14 < this.f409177j.size(); i14++) {
                    iC4 += CodedOutputStream.c(this.f409177j.get(i14).intValue());
                }
                int size = iC3 + iC4;
                if (!this.f409177j.isEmpty()) {
                    size = size + 1 + CodedOutputStream.c(iC4);
                }
                this.f409178k = iC4;
                if ((this.f409170c & 4) == 4) {
                    Object obj = this.f409173f;
                    if (obj instanceof String) {
                        dVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.d((String) obj);
                        this.f409173f = dVarD;
                    } else {
                        dVarD = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                    }
                    size += dVarD.size() + CodedOutputStream.f(dVarD.size()) + CodedOutputStream.h(6);
                }
                int size2 = this.f409169b.size() + size;
                this.f409180m = size2;
                return size2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b12 = this.f409179l;
                if (b12 == 1) {
                    return true;
                }
                if (b12 == 0) {
                    return false;
                }
                this.f409179l = (byte) 1;
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

            public Record() {
                this.f409176i = -1;
                this.f409178k = -1;
                this.f409179l = (byte) -1;
                this.f409180m = -1;
                this.f409169b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
            }

            public Record(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar, a aVar) {
                Operation operation;
                this.f409176i = -1;
                this.f409178k = -1;
                this.f409179l = (byte) -1;
                this.f409180m = -1;
                this.f409171d = 1;
                boolean z12 = false;
                this.f409172e = 0;
                this.f409173f = "";
                this.f409174g = Operation.NONE;
                this.f409175h = Collections.emptyList();
                this.f409177j = Collections.emptyList();
                d.b bVar = new d.b();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
                int i12 = 0;
                while (!z12) {
                    try {
                        try {
                            int iN2 = eVar.n();
                            if (iN2 != 0) {
                                if (iN2 == 8) {
                                    this.f409170c |= 1;
                                    this.f409171d = eVar.k();
                                } else if (iN2 == 16) {
                                    this.f409170c |= 2;
                                    this.f409172e = eVar.k();
                                } else if (iN2 == 24) {
                                    int iK2 = eVar.k();
                                    if (iK2 == 0) {
                                        operation = Operation.NONE;
                                    } else if (iK2 != 1) {
                                        operation = iK2 != 2 ? null : Operation.DESC_TO_CLASS_ID;
                                    } else {
                                        operation = Operation.INTERNAL_TO_CLASS_ID;
                                    }
                                    if (operation == null) {
                                        codedOutputStreamJ.v(iN2);
                                        codedOutputStreamJ.v(iK2);
                                    } else {
                                        this.f409170c |= 8;
                                        this.f409174g = operation;
                                    }
                                } else if (iN2 == 32) {
                                    if ((i12 & 16) != 16) {
                                        this.f409175h = new ArrayList();
                                        i12 |= 16;
                                    }
                                    this.f409175h.add(Integer.valueOf(eVar.k()));
                                } else if (iN2 == 34) {
                                    int iD2 = eVar.d(eVar.k());
                                    if ((i12 & 16) != 16 && eVar.b() > 0) {
                                        this.f409175h = new ArrayList();
                                        i12 |= 16;
                                    }
                                    while (eVar.b() > 0) {
                                        this.f409175h.add(Integer.valueOf(eVar.k()));
                                    }
                                    eVar.c(iD2);
                                } else if (iN2 == 40) {
                                    if ((i12 & 32) != 32) {
                                        this.f409177j = new ArrayList();
                                        i12 |= 32;
                                    }
                                    this.f409177j.add(Integer.valueOf(eVar.k()));
                                } else if (iN2 == 42) {
                                    int iD3 = eVar.d(eVar.k());
                                    if ((i12 & 32) != 32 && eVar.b() > 0) {
                                        this.f409177j = new ArrayList();
                                        i12 |= 32;
                                    }
                                    while (eVar.b() > 0) {
                                        this.f409177j.add(Integer.valueOf(eVar.k()));
                                    }
                                    eVar.c(iD3);
                                } else if (iN2 != 50) {
                                    if (!eVar.q(iN2, codedOutputStreamJ)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d dVarE = eVar.e();
                                    this.f409170c |= 4;
                                    this.f409173f = dVarE;
                                }
                            }
                            z12 = true;
                        } catch (Throwable th2) {
                            if ((i12 & 16) == 16) {
                                this.f409175h = Collections.unmodifiableList(this.f409175h);
                            }
                            if ((i12 & 32) == 32) {
                                this.f409177j = Collections.unmodifiableList(this.f409177j);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f409169b = bVar.c();
                                throw th3;
                            }
                            this.f409169b = bVar.c();
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
                    this.f409175h = Collections.unmodifiableList(this.f409175h);
                }
                if ((i12 & 32) == 32) {
                    this.f409177j = Collections.unmodifiableList(this.f409177j);
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f409169b = bVar.c();
                    throw th4;
                }
                this.f409169b = bVar.c();
            }
        }

        public StringTableTypes() {
            this.f409164e = -1;
            this.f409165f = (byte) -1;
            this.f409166g = -1;
            this.f409161b = kotlin.reflect.jvm.internal.impl.protobuf.d.f409332b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StringTableTypes(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar, a aVar) {
            this.f409164e = -1;
            this.f409165f = (byte) -1;
            this.f409166g = -1;
            this.f409162c = Collections.emptyList();
            this.f409163d = Collections.emptyList();
            d.b bVar = new d.b();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(bVar, 1);
            boolean z12 = false;
            int i12 = 0;
            while (!z12) {
                try {
                    try {
                        int iN2 = eVar.n();
                        if (iN2 != 0) {
                            if (iN2 == 10) {
                                if ((i12 & 1) != 1) {
                                    this.f409162c = new ArrayList();
                                    i12 |= 1;
                                }
                                this.f409162c.add(eVar.g(Record.f409168o, fVar));
                            } else if (iN2 == 40) {
                                if ((i12 & 2) != 2) {
                                    this.f409163d = new ArrayList();
                                    i12 |= 2;
                                }
                                this.f409163d.add(Integer.valueOf(eVar.k()));
                            } else if (iN2 != 42) {
                                if (!eVar.q(iN2, codedOutputStreamJ)) {
                                }
                            } else {
                                int iD2 = eVar.d(eVar.k());
                                if ((i12 & 2) != 2 && eVar.b() > 0) {
                                    this.f409163d = new ArrayList();
                                    i12 |= 2;
                                }
                                while (eVar.b() > 0) {
                                    this.f409163d.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD2);
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        if ((i12 & 1) == 1) {
                            this.f409162c = Collections.unmodifiableList(this.f409162c);
                        }
                        if ((i12 & 2) == 2) {
                            this.f409163d = Collections.unmodifiableList(this.f409163d);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f409161b = bVar.c();
                            throw th3;
                        }
                        this.f409161b = bVar.c();
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
            if ((i12 & 1) == 1) {
                this.f409162c = Collections.unmodifiableList(this.f409162c);
            }
            if ((i12 & 2) == 2) {
                this.f409163d = Collections.unmodifiableList(this.f409163d);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f409161b = bVar.c();
                throw th4;
            }
            this.f409161b = bVar.c();
        }
    }
}

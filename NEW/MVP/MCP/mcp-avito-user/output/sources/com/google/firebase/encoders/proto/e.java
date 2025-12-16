package com.google.firebase.encoders.proto;

import com.adjust.sdk.Constants;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.proto.Protobuf;
import j.N;
import j.P;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes6.dex */
final class e implements com.google.firebase.encoders.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f361571f = Charset.forName(Constants.ENCODING);

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.firebase.encoders.c f361572g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.firebase.encoders.c f361573h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f361574i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f361575a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f361576b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f361577c;

    /* renamed from: d, reason: collision with root package name */
    public final d f361578d;

    /* renamed from: e, reason: collision with root package name */
    public final g f361579e = new g(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f361580a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f361580a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f361580a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f361580a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        c.b bVar = new c.b("key");
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
        aVar.f361567a = 1;
        f361572g = C31685o.l(aVar, bVar);
        c.b bVar2 = new c.b("value");
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
        aVar2.f361567a = 2;
        f361573h = C31685o.l(aVar2, bVar2);
        f361574i = new d(0);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, d dVar) {
        this.f361575a = byteArrayOutputStream;
        this.f361576b = map;
        this.f361577c = map2;
        this.f361578d = dVar;
    }

    public static int e(com.google.firebase.encoders.c cVar) {
        Protobuf protobuf = (Protobuf) cVar.a(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(@N com.google.firebase.encoders.c cVar, int i12, boolean z12) throws IOException {
        if (z12 && i12 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) cVar.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            f(protobuf.tag() << 3);
            f(i12);
        } else if (iOrdinal == 1) {
            f(protobuf.tag() << 3);
            f((i12 << 1) ^ (i12 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            f((protobuf.tag() << 3) | 5);
            this.f361575a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i12).array());
        }
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, @P Object obj) throws IOException {
        c(cVar, obj, true);
        return this;
    }

    public final void b(@N com.google.firebase.encoders.c cVar, long j12, boolean z12) throws IOException {
        if (z12 && j12 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) cVar.a(Protobuf.class);
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            f(protobuf.tag() << 3);
            g(j12);
        } else if (iOrdinal == 1) {
            f(protobuf.tag() << 3);
            g((j12 >> 63) ^ (j12 << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            f((protobuf.tag() << 3) | 1);
            this.f361575a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j12).array());
        }
    }

    public final void c(@N com.google.firebase.encoders.c cVar, @P Object obj, boolean z12) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z12 && charSequence.length() == 0) {
                return;
            }
            f((e(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f361571f);
            f(bytes.length);
            this.f361575a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(f361574i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z12 && dDoubleValue == 0.0d) {
                return;
            }
            f((e(cVar) << 3) | 1);
            this.f361575a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z12 && fFloatValue == 0.0f) {
                return;
            }
            f((e(cVar) << 3) | 5);
            this.f361575a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            b(cVar, ((Number) obj).longValue(), z12);
            return;
        }
        if (obj instanceof Boolean) {
            a(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z12);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z12 && bArr.length == 0) {
                return;
            }
            f((e(cVar) << 3) | 2);
            f(bArr.length);
            this.f361575a.write(bArr);
            return;
        }
        com.google.firebase.encoders.d dVar = (com.google.firebase.encoders.d) this.f361576b.get(obj.getClass());
        if (dVar != null) {
            d(dVar, cVar, obj, z12);
            return;
        }
        com.google.firebase.encoders.f fVar = (com.google.firebase.encoders.f) this.f361577c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f361579e;
            gVar.f361588a = false;
            gVar.f361590c = cVar;
            gVar.f361589b = z12;
            fVar.encode(obj, gVar);
            return;
        }
        if (obj instanceof c) {
            a(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            a(cVar, ((Enum) obj).ordinal(), true);
        } else {
            d(this.f361578d, cVar, obj, z12);
        }
    }

    public final void d(com.google.firebase.encoders.d dVar, com.google.firebase.encoders.c cVar, Object obj, boolean z12) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f361575a;
            this.f361575a = bVar;
            try {
                dVar.encode(obj, this);
                this.f361575a = outputStream;
                long j12 = bVar.f361569b;
                bVar.close();
                if (z12 && j12 == 0) {
                    return;
                }
                f((e(cVar) << 3) | 2);
                g(j12);
                dVar.encode(obj, this);
            } catch (Throwable th2) {
                this.f361575a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void f(int i12) throws IOException {
        while ((i12 & (-128)) != 0) {
            this.f361575a.write((i12 & 127) | 128);
            i12 >>>= 7;
        }
        this.f361575a.write(i12 & 127);
    }

    public final void g(long j12) throws IOException {
        while (((-128) & j12) != 0) {
            this.f361575a.write((((int) j12) & 127) | 128);
            j12 >>>= 7;
        }
        this.f361575a.write(((int) j12) & 127);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, int i12) throws IOException {
        a(cVar, i12, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, long j12) throws IOException {
        b(cVar, j12, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final com.google.firebase.encoders.e add(@N com.google.firebase.encoders.c cVar, boolean z12) throws IOException {
        a(cVar, z12 ? 1 : 0, true);
        return this;
    }
}

package com.google.android.gms.internal.mlkit_vision_face;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.P0;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import j.N;
import j.P;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcw implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f353031f = Charset.forName(Constants.ENCODING);

    /* renamed from: g, reason: collision with root package name */
    public static final c f353032g = P0.s(1, new c.b("key"));

    /* renamed from: h, reason: collision with root package name */
    public static final c f353033h = P0.s(2, new c.b("value"));

    /* renamed from: i, reason: collision with root package name */
    public static final zzcv f353034i = zzcv.zza;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f353035a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f353036b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f353037c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcx f353038d;

    /* renamed from: e, reason: collision with root package name */
    public final zzda f353039e = new zzda(this);

    public zzcw(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, zzcx zzcxVar) {
        this.f353035a = byteArrayOutputStream;
        this.f353036b = map;
        this.f353037c = map2;
        this.f353038d = zzcxVar;
    }

    public static int g(c cVar) {
        zzcu zzcuVar = (zzcu) cVar.a(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void a(@N c cVar, double d12, boolean z12) {
        if (z12 && d12 == 0.0d) {
            return;
        }
        i((g(cVar) << 3) | 1);
        this.f353035a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d12).array());
    }

    @N
    public final e add(@N c cVar, double d12) {
        a(cVar, d12, true);
        return this;
    }

    public final void b(@N c cVar, float f12, boolean z12) {
        if (z12 && f12 == 0.0f) {
            return;
        }
        i((g(cVar) << 3) | 5);
        this.f353035a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f12).array());
    }

    public final void c(@N c cVar, @P Object obj, boolean z12) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z12 && charSequence.length() == 0) {
                return;
            }
            i((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f353031f);
            i(bytes.length);
            this.f353035a.write(bytes);
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
                h(f353034i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(cVar, ((Double) obj).doubleValue(), z12);
            return;
        }
        if (obj instanceof Float) {
            b(cVar, ((Float) obj).floatValue(), z12);
            return;
        }
        if (obj instanceof Number) {
            e(cVar, ((Number) obj).longValue(), z12);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z12);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z12 && bArr.length == 0) {
                return;
            }
            i((g(cVar) << 3) | 2);
            i(bArr.length);
            this.f353035a.write(bArr);
            return;
        }
        d dVar = (d) this.f353036b.get(obj.getClass());
        if (dVar != null) {
            h(dVar, cVar, obj, z12);
            return;
        }
        f fVar = (f) this.f353037c.get(obj.getClass());
        if (fVar != null) {
            zzda zzdaVar = this.f353039e;
            zzdaVar.f353047a = false;
            zzdaVar.f353049c = cVar;
            zzdaVar.f353048b = z12;
            fVar.encode(obj, zzdaVar);
            return;
        }
        if (obj instanceof zzcs) {
            d(cVar, ((zzcs) obj).zza(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            h(this.f353038d, cVar, obj, z12);
        }
    }

    public final void d(@N c cVar, int i12, boolean z12) {
        if (z12 && i12 == 0) {
            return;
        }
        zzcu zzcuVar = (zzcu) cVar.a(zzcu.class);
        if (zzcuVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = zzcuVar.zzb().ordinal();
        if (iOrdinal == 0) {
            i(zzcuVar.zza() << 3);
            i(i12);
        } else if (iOrdinal == 1) {
            i(zzcuVar.zza() << 3);
            i((i12 + i12) ^ (i12 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((zzcuVar.zza() << 3) | 5);
            this.f353035a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i12).array());
        }
    }

    public final void e(@N c cVar, long j12, boolean z12) {
        if (z12 && j12 == 0) {
            return;
        }
        zzcu zzcuVar = (zzcu) cVar.a(zzcu.class);
        if (zzcuVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = zzcuVar.zzb().ordinal();
        if (iOrdinal == 0) {
            i(zzcuVar.zza() << 3);
            j(j12);
        } else if (iOrdinal == 1) {
            i(zzcuVar.zza() << 3);
            j((j12 >> 63) ^ (j12 + j12));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((zzcuVar.zza() << 3) | 1);
            this.f353035a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j12).array());
        }
    }

    public final void f(@P Object obj) {
        if (obj == null) {
            return;
        }
        d dVar = (d) this.f353036b.get(obj.getClass());
        if (dVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.encode(obj, this);
    }

    public final void h(d dVar, c cVar, Object obj, boolean z12) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        zzcr zzcrVar = new zzcr();
        try {
            OutputStream outputStream = this.f353035a;
            this.f353035a = zzcrVar;
            try {
                dVar.encode(obj, this);
                this.f353035a = outputStream;
                long j12 = zzcrVar.f353029b;
                zzcrVar.close();
                if (z12 && j12 == 0) {
                    return;
                }
                i((g(cVar) << 3) | 2);
                j(j12);
                dVar.encode(obj, this);
            } catch (Throwable th2) {
                this.f353035a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzcrVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    public final void i(int i12) throws IOException {
        while ((i12 & (-128)) != 0) {
            this.f353035a.write((i12 & 127) | 128);
            i12 >>>= 7;
        }
        this.f353035a.write(i12 & 127);
    }

    @N
    public final e inline(@P Object obj) {
        f(obj);
        return this;
    }

    public final void j(long j12) throws IOException {
        while (((-128) & j12) != 0) {
            this.f353035a.write((((int) j12) & 127) | 128);
            j12 >>>= 7;
        }
        this.f353035a.write(((int) j12) & 127);
    }

    @N
    public final e nested(@N c cVar) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @N
    public final e add(@N c cVar, float f12) {
        b(cVar, f12, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final /* synthetic */ e add(@N c cVar, int i12) {
        d(cVar, i12, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final /* synthetic */ e add(@N c cVar, long j12) {
        e(cVar, j12, true);
        return this;
    }

    @N
    public final e nested(@N String str) {
        return nested(c.b(str));
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final e add(@N c cVar, @P Object obj) {
        c(cVar, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public final /* synthetic */ e add(@N c cVar, boolean z12) {
        d(cVar, z12 ? 1 : 0, true);
        return this;
    }

    @N
    public final e add(@N String str, double d12) {
        a(c.b(str), d12, true);
        return this;
    }

    @N
    public final e add(@N String str, int i12) {
        d(c.b(str), i12, true);
        return this;
    }

    @N
    public final e add(@N String str, long j12) {
        e(c.b(str), j12, true);
        return this;
    }

    @N
    public final e add(@N String str, @P Object obj) {
        c(c.b(str), obj, true);
        return this;
    }

    @N
    public final e add(@N String str, boolean z12) {
        d(c.b(str), z12 ? 1 : 0, true);
        return this;
    }
}

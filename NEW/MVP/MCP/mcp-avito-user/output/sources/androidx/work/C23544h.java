package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.room.T0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: Data_.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/h;", "", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23544h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f55508b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C23544h f55509c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashMap f55510a;

    /* compiled from: Data_.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/h$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f55511a = new LinkedHashMap();

        @Y61.k
        public final C23544h a() {
            C23544h c23544h = new C23544h(this.f55511a);
            C23544h.f55508b.getClass();
            b.c(c23544h);
            return c23544h;
        }

        @Y61.k
        public final void b(@Y61.k HashMap map) {
            Object[] objArr;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                LinkedHashMap linkedHashMap = this.f55511a;
                if (value == null) {
                    value = null;
                } else {
                    Class<?> cls = value.getClass();
                    n0 n0Var = m0.f406844a;
                    kotlin.reflect.d dVarB = n0Var.b(cls);
                    if (dVarB.equals(n0Var.b(Boolean.TYPE)) ? true : dVarB.equals(n0Var.b(Byte.TYPE)) ? true : dVarB.equals(n0Var.b(Integer.TYPE)) ? true : dVarB.equals(n0Var.b(Long.TYPE)) ? true : dVarB.equals(n0Var.b(Float.TYPE)) ? true : dVarB.equals(n0Var.b(Double.TYPE)) ? true : dVarB.equals(n0Var.b(String.class)) ? true : dVarB.equals(n0Var.b(Boolean[].class)) ? true : dVarB.equals(n0Var.b(Byte[].class)) ? true : dVarB.equals(n0Var.b(Integer[].class)) ? true : dVarB.equals(n0Var.b(Long[].class)) ? true : dVarB.equals(n0Var.b(Float[].class)) ? true : dVarB.equals(n0Var.b(Double[].class)) ? true : dVarB.equals(n0Var.b(String[].class))) {
                        continue;
                    } else {
                        int i12 = 0;
                        if (dVarB.equals(n0Var.b(boolean[].class))) {
                            boolean[] zArr = (boolean[]) value;
                            int i13 = r.f56205a;
                            int length = zArr.length;
                            objArr = new Boolean[length];
                            while (i12 < length) {
                                objArr[i12] = Boolean.valueOf(zArr[i12]);
                                i12++;
                            }
                        } else if (dVarB.equals(n0Var.b(byte[].class))) {
                            byte[] bArr = (byte[]) value;
                            int i14 = r.f56205a;
                            int length2 = bArr.length;
                            objArr = new Byte[length2];
                            while (i12 < length2) {
                                objArr[i12] = Byte.valueOf(bArr[i12]);
                                i12++;
                            }
                        } else if (dVarB.equals(n0Var.b(int[].class))) {
                            int[] iArr = (int[]) value;
                            int i15 = r.f56205a;
                            int length3 = iArr.length;
                            objArr = new Integer[length3];
                            while (i12 < length3) {
                                objArr[i12] = Integer.valueOf(iArr[i12]);
                                i12++;
                            }
                        } else if (dVarB.equals(n0Var.b(long[].class))) {
                            long[] jArr = (long[]) value;
                            int i16 = r.f56205a;
                            int length4 = jArr.length;
                            objArr = new Long[length4];
                            while (i12 < length4) {
                                objArr[i12] = Long.valueOf(jArr[i12]);
                                i12++;
                            }
                        } else if (dVarB.equals(n0Var.b(float[].class))) {
                            float[] fArr = (float[]) value;
                            int i17 = r.f56205a;
                            int length5 = fArr.length;
                            objArr = new Float[length5];
                            while (i12 < length5) {
                                objArr[i12] = Float.valueOf(fArr[i12]);
                                i12++;
                            }
                        } else {
                            if (!dVarB.equals(n0Var.b(double[].class))) {
                                throw new IllegalArgumentException("Key " + str + " has invalid type " + dVarB);
                            }
                            double[] dArr = (double[]) value;
                            int i18 = r.f56205a;
                            int length6 = dArr.length;
                            objArr = new Double[length6];
                            while (i12 < length6) {
                                objArr[i12] = Double.valueOf(dArr[i12]);
                                i12++;
                            }
                        }
                        value = objArr;
                    }
                }
                linkedHashMap.put(str, value);
            }
        }

        @Y61.k
        public final void c(@Y61.k String str, long j12) {
            this.f55511a.put(str, Long.valueOf(j12));
        }
    }

    /* compiled from: Data_.kt */
    @s0
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"Landroidx/work/h$b;", "", "<init>", "()V", "Landroidx/work/h;", "EMPTY", "Landroidx/work/h;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.h$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @T0
        @Y61.k
        public static C23544h a(@Y61.k byte[] bArr) throws IOException {
            if (bArr.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bArr.length == 0) {
                return C23544h.f55509c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i12 = 0;
                boolean z12 = bArr2[0] == ((byte) 16777132) && bArr2[1] == ((byte) (-21267));
                byteArrayInputStream.reset();
                if (z12) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i13 = objectInputStream.readInt();
                        while (i12 < i13) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i12++;
                        }
                        kotlin.io.c.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short s5 = dataInputStream.readShort();
                        if (s5 != -21521) {
                            throw new IllegalStateException(AK.c.g(s5, "Magic number doesn't match: ").toString());
                        }
                        short s12 = dataInputStream.readShort();
                        if (s12 != 1) {
                            throw new IllegalStateException(AK.c.g(s12, "Unsupported version number: ").toString());
                        }
                        int i14 = dataInputStream.readInt();
                        while (i12 < i14) {
                            linkedHashMap.put(dataInputStream.readUTF(), b(dataInputStream, dataInputStream.readByte()));
                            i12++;
                        }
                        kotlin.io.c.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException unused) {
                int i15 = r.f56205a;
                G.a().getClass();
            } catch (ClassNotFoundException unused2) {
                int i16 = r.f56205a;
                G.a().getClass();
            }
            return new C23544h(linkedHashMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Byte[]] */
        public static final Serializable b(DataInputStream dataInputStream, byte b12) throws IOException {
            ?? utf = 0;
            if (b12 != 0) {
                if (b12 == 1) {
                    utf = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (b12 == 2) {
                    utf = Byte.valueOf(dataInputStream.readByte());
                } else if (b12 == 3) {
                    utf = Integer.valueOf(dataInputStream.readInt());
                } else if (b12 == 4) {
                    utf = Long.valueOf(dataInputStream.readLong());
                } else if (b12 == 5) {
                    utf = Float.valueOf(dataInputStream.readFloat());
                } else if (b12 == 6) {
                    utf = Double.valueOf(dataInputStream.readDouble());
                } else if (b12 == 7) {
                    utf = dataInputStream.readUTF();
                } else {
                    int i12 = 0;
                    if (b12 == 8) {
                        int i13 = dataInputStream.readInt();
                        utf = new Boolean[i13];
                        while (i12 < i13) {
                            utf[i12] = Boolean.valueOf(dataInputStream.readBoolean());
                            i12++;
                        }
                    } else if (b12 == 9) {
                        int i14 = dataInputStream.readInt();
                        utf = new Byte[i14];
                        while (i12 < i14) {
                            utf[i12] = Byte.valueOf(dataInputStream.readByte());
                            i12++;
                        }
                    } else if (b12 == 10) {
                        int i15 = dataInputStream.readInt();
                        utf = new Integer[i15];
                        while (i12 < i15) {
                            utf[i12] = Integer.valueOf(dataInputStream.readInt());
                            i12++;
                        }
                    } else if (b12 == 11) {
                        int i16 = dataInputStream.readInt();
                        utf = new Long[i16];
                        while (i12 < i16) {
                            utf[i12] = Long.valueOf(dataInputStream.readLong());
                            i12++;
                        }
                    } else if (b12 == 12) {
                        int i17 = dataInputStream.readInt();
                        utf = new Float[i17];
                        while (i12 < i17) {
                            utf[i12] = Float.valueOf(dataInputStream.readFloat());
                            i12++;
                        }
                    } else if (b12 == 13) {
                        int i18 = dataInputStream.readInt();
                        utf = new Double[i18];
                        while (i12 < i18) {
                            utf[i12] = Double.valueOf(dataInputStream.readDouble());
                            i12++;
                        }
                    } else {
                        if (b12 != 14) {
                            throw new IllegalStateException(AK.c.g(b12, "Unsupported type "));
                        }
                        int i19 = dataInputStream.readInt();
                        String[] strArr = new String[i19];
                        while (i12 < i19) {
                            String utf2 = dataInputStream.readUTF();
                            if (kotlin.jvm.internal.L.f(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                utf2 = null;
                            }
                            strArr[i12] = utf2;
                            i12++;
                        }
                        utf = strArr;
                    }
                }
            }
            return (Serializable) utf;
        }

        @T0
        @X41.n
        @Y61.k
        @RestrictTo
        public static byte[] c(@Y61.k C23544h c23544h) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    HashMap map = c23544h.f55510a;
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        d(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.io.c.a(dataOutputStream, null);
                    return byteArray;
                } finally {
                }
            } catch (IOException unused) {
                int i12 = r.f56205a;
                G.a().getClass();
                return new byte[0];
            }
        }

        public static final void d(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i12;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + m0.f406844a.b(obj.getClass()).l0());
                }
                Object[] objArr = (Object[]) obj;
                Class<?> cls = objArr.getClass();
                n0 n0Var = m0.f406844a;
                kotlin.reflect.d dVarB = n0Var.b(cls);
                if (dVarB.equals(n0Var.b(Boolean[].class))) {
                    i12 = 8;
                } else if (dVarB.equals(n0Var.b(Byte[].class))) {
                    i12 = 9;
                } else if (dVarB.equals(n0Var.b(Integer[].class))) {
                    i12 = 10;
                } else if (dVarB.equals(n0Var.b(Long[].class))) {
                    i12 = 11;
                } else if (dVarB.equals(n0Var.b(Float[].class))) {
                    i12 = 12;
                } else if (dVarB.equals(n0Var.b(Double[].class))) {
                    i12 = 13;
                } else {
                    if (!dVarB.equals(n0Var.b(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + n0Var.b(objArr.getClass()).p0());
                    }
                    i12 = 14;
                }
                dataOutputStream.writeByte(i12);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i12 == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i12 == 9) {
                        Byte b12 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b12 != null ? b12.byteValue() : (byte) 0);
                    } else if (i12 == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i12 == 11) {
                        Long l12 = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l12 != null ? l12.longValue() : 0L);
                    } else if (i12 == 12) {
                        Float f12 = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f12 != null ? f12.floatValue() : 0.0f);
                    } else if (i12 == 13) {
                        Double d12 = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d12 != null ? d12.doubleValue() : 0.0d);
                    } else if (i12 == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }

        public b() {
        }
    }

    /* compiled from: Data_.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.h$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f55512l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
            Map.Entry<? extends String, ? extends Object> entry2 = entry;
            String key = entry2.getKey();
            Object value = entry2.getValue();
            StringBuilder sbZ = androidx.appcompat.app.r.z(key, " : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
            }
            sbZ.append(value);
            return sbZ.toString();
        }
    }

    public C23544h(@Y61.k C23544h c23544h) {
        this.f55510a = new HashMap(c23544h.f55510a);
    }

    public final boolean a(@Y61.k String str, boolean z12) {
        Object objValueOf = Boolean.valueOf(z12);
        Object obj = this.f55510a.get(str);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final long b(@Y61.k String str, long j12) {
        Object objValueOf = Long.valueOf(j12);
        Object obj = this.f55510a.get(str);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    @Y61.l
    public final String c(@Y61.k String str) {
        Object obj = this.f55510a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean d(@Y61.k String str) {
        Object obj = this.f55510a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@Y61.l java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L66
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<androidx.work.h> r3 = androidx.work.C23544h.class
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L14
            goto L66
        L14:
            androidx.work.h r9 = (androidx.work.C23544h) r9
            java.util.HashMap r2 = r8.f55510a
            java.util.Set r3 = r2.keySet()
            java.util.HashMap r9 = r9.f55510a
            java.util.Set r4 = r9.keySet()
            boolean r4 = kotlin.jvm.internal.L.f(r3, r4)
            if (r4 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L5d
            if (r4 != 0) goto L46
            goto L5d
        L46:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L58
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L58
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = kotlin.collections.C42756l.i(r6, r4)
            goto L62
        L58:
            boolean r4 = r5.equals(r4)
            goto L62
        L5d:
            if (r5 != r4) goto L61
            r4 = r0
            goto L62
        L61:
            r4 = r1
        L62:
            if (r4 != 0) goto L2d
            return r1
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C23544h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f55510a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    @Y61.k
    public final String toString() {
        return AK.c.s(new StringBuilder("Data {"), C42745f0.O(this.f55510a.entrySet(), null, null, null, c.f55512l, 31), "}");
    }

    public C23544h(@Y61.k LinkedHashMap linkedHashMap) {
        this.f55510a = new HashMap(linkedHashMap);
    }
}

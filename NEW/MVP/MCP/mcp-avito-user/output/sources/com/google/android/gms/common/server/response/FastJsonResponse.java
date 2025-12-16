package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import j.N;
import j.P;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @InterfaceC36733z
    public interface a<I, O> {
        @N
        String a(@N Object obj);

        @P
        Integer b(@N Object obj);
    }

    public static final void k(StringBuilder sb2, Field field, Object obj) {
        int i12 = field.f349557c;
        if (i12 == 11) {
            Class cls = field.f349563i;
            C36729v.j(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i12 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(r.a((String) obj));
            sb2.append("\"");
        }
    }

    @RX0.a
    @P
    public Object a(@N Field field) {
        String str = field.f349561g;
        if (field.f349563i == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + field.f349561g);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    @RX0.a
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@N Field field, @N String str, @P ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @RX0.a
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@N Field field, @N String str, @N T t12) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @RX0.a
    public boolean b(@N Field field) {
        if (field.f349559e != 11) {
            return isPrimitiveFieldSet(field.f349561g);
        }
        if (field.f349560f) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @RX0.a
    public void c(@N Field field, boolean z12) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @RX0.a
    public void d(@N Field field, @P byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @RX0.a
    public void e(@N Field field, int i12) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @RX0.a
    public void f(@N Field field, long j12) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @RX0.a
    public void g(@N Field field, @P String str) {
        throw new UnsupportedOperationException("String not supported");
    }

    @N
    @RX0.a
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @RX0.a
    @P
    public abstract Object getValueObject(@N String str);

    @RX0.a
    public void h(@N Field field, @P Map map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @RX0.a
    public void i(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @RX0.a
    public abstract boolean isPrimitiveFieldSet(@N String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Field field, @P Object obj) {
        a aVar = field.f349566l;
        C36729v.j(aVar);
        Integer numB = aVar.b(obj);
        C36729v.j(numB);
        int i12 = field.f349559e;
        switch (i12) {
            case 0:
                e(field, numB.intValue());
                return;
            case 1:
                n(field, (BigInteger) numB);
                return;
            case 2:
                f(field, ((Long) numB).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(AK.c.g(i12, "Unsupported type for conversion: "));
            case 4:
                q(field, ((Double) numB).doubleValue());
                return;
            case 5:
                l(field, (BigDecimal) numB);
                return;
            case 6:
                c(field, ((Boolean) numB).booleanValue());
                return;
            case 7:
                g(field, (String) numB);
                return;
            case 8:
            case 9:
                d(field, (byte[]) numB);
                return;
        }
    }

    public void l(@N Field field, @P BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void m(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void n(@N Field field, @P BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void o(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void p(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public void q(@N Field field, double d12) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void r(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void s(@N Field field, float f12) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void t(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    @N
    @RX0.a
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (b(field)) {
                Object objA = a(field);
                a aVar = field.f349566l;
                if (aVar != null) {
                    objA = aVar.a(objA);
                }
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (objA != null) {
                    switch (field.f349559e) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objA, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objA, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            s.a(sb2, (HashMap) objA);
                            break;
                        default:
                            if (field.f349558d) {
                                ArrayList arrayList = (ArrayList) objA;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    if (i12 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i12);
                                    if (obj != null) {
                                        k(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                k(sb2, field, objA);
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public void u(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void v(@N Field field, @P ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public final void zaA(@N Field field, @P String str) {
        if (field.f349566l != null) {
            j(field, str);
        } else {
            g(field, str);
        }
    }

    public final void zaB(@N Field field, @P Map map) {
        if (field.f349566l != null) {
            j(field, map);
        } else {
            h(field, map);
        }
    }

    public final void zaC(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            i(field, arrayList);
        }
    }

    public final void zaa(@N Field field, @P BigDecimal bigDecimal) {
        if (field.f349566l != null) {
            j(field, bigDecimal);
        } else {
            l(field, bigDecimal);
        }
    }

    public final void zac(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            m(field, arrayList);
        }
    }

    public final void zae(@N Field field, @P BigInteger bigInteger) {
        if (field.f349566l != null) {
            j(field, bigInteger);
        } else {
            n(field, bigInteger);
        }
    }

    public final void zag(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            o(field, arrayList);
        }
    }

    public final void zai(@N Field field, boolean z12) {
        if (field.f349566l != null) {
            j(field, Boolean.valueOf(z12));
        } else {
            c(field, z12);
        }
    }

    public final void zaj(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            p(field, arrayList);
        }
    }

    public final void zal(@N Field field, @P byte[] bArr) {
        if (field.f349566l != null) {
            j(field, bArr);
        } else {
            d(field, bArr);
        }
    }

    public final void zam(@N Field field, double d12) {
        if (field.f349566l != null) {
            j(field, Double.valueOf(d12));
        } else {
            q(field, d12);
        }
    }

    public final void zao(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            r(field, arrayList);
        }
    }

    public final void zaq(@N Field field, float f12) {
        if (field.f349566l != null) {
            j(field, Float.valueOf(f12));
        } else {
            s(field, f12);
        }
    }

    public final void zas(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            t(field, arrayList);
        }
    }

    public final void zau(@N Field field, int i12) {
        if (field.f349566l != null) {
            j(field, Integer.valueOf(i12));
        } else {
            e(field, i12);
        }
    }

    public final void zav(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            u(field, arrayList);
        }
    }

    public final void zax(@N Field field, long j12) {
        if (field.f349566l != null) {
            j(field, Long.valueOf(j12));
        } else {
            f(field, j12);
        }
    }

    public final void zay(@N Field field, @P ArrayList arrayList) {
        if (field.f349566l != null) {
            j(field, arrayList);
        } else {
            v(field, arrayList);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @SafeParcelable.a
    @RX0.a
    @InterfaceC36733z
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final j CREATOR = new j();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.h
        public final int f349556b;

        /* renamed from: c, reason: collision with root package name */
        @SafeParcelable.c
        public final int f349557c;

        /* renamed from: d, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f349558d;

        /* renamed from: e, reason: collision with root package name */
        @SafeParcelable.c
        public final int f349559e;

        /* renamed from: f, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f349560f;

        /* renamed from: g, reason: collision with root package name */
        @N
        @SafeParcelable.c
        public final String f349561g;

        /* renamed from: h, reason: collision with root package name */
        @SafeParcelable.c
        public final int f349562h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public final Class f349563i;

        /* renamed from: j, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final String f349564j;

        /* renamed from: k, reason: collision with root package name */
        public zan f349565k;

        /* renamed from: l, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final a f349566l;

        @SafeParcelable.b
        public Field(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e boolean z12, @SafeParcelable.e int i14, @SafeParcelable.e boolean z13, @SafeParcelable.e String str, @SafeParcelable.e int i15, @SafeParcelable.e @P String str2, @SafeParcelable.e @P zaa zaaVar) {
            this.f349556b = i12;
            this.f349557c = i13;
            this.f349558d = z12;
            this.f349559e = i14;
            this.f349560f = z13;
            this.f349561g = str;
            this.f349562h = i15;
            if (str2 == null) {
                this.f349563i = null;
                this.f349564j = null;
            } else {
                this.f349563i = SafeParcelResponse.class;
                this.f349564j = str2;
            }
            if (zaaVar == null) {
                this.f349566l = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f349552c;
            if (stringToIntConverter == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f349566l = stringToIntConverter;
        }

        @N
        @RX0.a
        public static Field h(int i12, @N String str) {
            return new Field(7, true, 7, true, str, i12, null);
        }

        @N
        public final String toString() {
            C36727t.a aVarB = C36727t.b(this);
            aVarB.a(Integer.valueOf(this.f349556b), "versionCode");
            aVarB.a(Integer.valueOf(this.f349557c), "typeIn");
            aVarB.a(Boolean.valueOf(this.f349558d), "typeInArray");
            aVarB.a(Integer.valueOf(this.f349559e), "typeOut");
            aVarB.a(Boolean.valueOf(this.f349560f), "typeOutArray");
            aVarB.a(this.f349561g, "outputFieldName");
            aVarB.a(Integer.valueOf(this.f349562h), "safeParcelFieldId");
            String str = this.f349564j;
            if (str == null) {
                str = null;
            }
            aVarB.a(str, "concreteTypeName");
            Class cls = this.f349563i;
            if (cls != null) {
                aVarB.a(cls.getCanonicalName(), "concreteType.class");
            }
            a aVar = this.f349566l;
            if (aVar != null) {
                aVarB.a(aVar.getClass().getCanonicalName(), "converterName");
            }
            return aVarB.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f349556b);
            TX0.a.q(parcel, 2, 4);
            parcel.writeInt(this.f349557c);
            TX0.a.q(parcel, 3, 4);
            parcel.writeInt(this.f349558d ? 1 : 0);
            TX0.a.q(parcel, 4, 4);
            parcel.writeInt(this.f349559e);
            TX0.a.q(parcel, 5, 4);
            parcel.writeInt(this.f349560f ? 1 : 0);
            TX0.a.j(parcel, 6, this.f349561g, false);
            TX0.a.q(parcel, 7, 4);
            parcel.writeInt(this.f349562h);
            zaa zaaVar = null;
            String str = this.f349564j;
            if (str == null) {
                str = null;
            }
            TX0.a.j(parcel, 8, str, false);
            a aVar = this.f349566l;
            if (aVar != null) {
                Parcelable.Creator<zaa> creator = zaa.CREATOR;
                if (!(aVar instanceof StringToIntConverter)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                zaaVar = new zaa((StringToIntConverter) aVar);
            }
            TX0.a.i(parcel, 9, zaaVar, i12, false);
            TX0.a.p(parcel, iO2);
        }

        public Field(int i12, boolean z12, int i13, boolean z13, @N String str, int i14, @P Class cls) {
            this.f349556b = 1;
            this.f349557c = i12;
            this.f349558d = z12;
            this.f349559e = i13;
            this.f349560f = z13;
            this.f349561g = str;
            this.f349562h = i14;
            this.f349563i = cls;
            if (cls == null) {
                this.f349564j = null;
            } else {
                this.f349564j = cls.getCanonicalName();
            }
            this.f349566l = null;
        }
    }
}

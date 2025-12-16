package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import j.N;
import j.P;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @N
    @RX0.a
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349567b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Parcel f349568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349569d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final zan f349570e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final String f349571f;

    /* renamed from: g, reason: collision with root package name */
    public int f349572g;

    /* renamed from: h, reason: collision with root package name */
    public int f349573h;

    @SafeParcelable.b
    public SafeParcelResponse(@SafeParcelable.e int i12, @SafeParcelable.e Parcel parcel, @SafeParcelable.e zan zanVar) {
        this.f349567b = i12;
        C36729v.j(parcel);
        this.f349568c = parcel;
        this.f349569d = 2;
        this.f349570e = zanVar;
        this.f349571f = zanVar == null ? null : zanVar.f349582d;
        this.f349572g = 2;
    }

    public static final void A(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        boolean z12 = field.f349558d;
        int i12 = field.f349557c;
        if (!z12) {
            z(sb2, i12, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 != 0) {
                sb2.append(",");
            }
            z(sb2, i12, arrayList.get(i13));
        }
        sb2.append("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    public static void y(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).f349562h, entry);
        }
        sb2.append('{');
        int iY2 = SafeParcelReader.y(parcel);
        boolean z12 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i12);
            if (entry2 != null) {
                if (z12) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                FastJsonResponse.a aVar = field.f349566l;
                BigInteger bigInteger = null;
                Object objA = null;
                Parcel[] parcelArr = null;
                boolean[] zArrCreateBooleanArray = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArrCreateDoubleArray = null;
                float[] fArrCreateFloatArray = null;
                long[] jArrCreateLongArray = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcelObtain = null;
                int i13 = field.f349559e;
                if (aVar != null) {
                    FastJsonResponse.a aVar2 = field.f349566l;
                    switch (i13) {
                        case 0:
                            Object objValueOf = Integer.valueOf(SafeParcelReader.s(parcel, i12));
                            if (aVar2 != 0) {
                                objValueOf = aVar2.a(objValueOf);
                            }
                            A(sb2, field, objValueOf);
                            break;
                        case 1:
                            int iW2 = SafeParcelReader.w(parcel, i12);
                            int iDataPosition = parcel.dataPosition();
                            if (iW2 != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iW2);
                                objA = new BigInteger(bArrCreateByteArray);
                            }
                            if (aVar2 != 0) {
                                objA = aVar2.a(objA);
                            }
                            A(sb2, field, objA);
                            break;
                        case 2:
                            Object objValueOf2 = Long.valueOf(SafeParcelReader.u(parcel, i12));
                            if (aVar2 != 0) {
                                objValueOf2 = aVar2.a(objValueOf2);
                            }
                            A(sb2, field, objValueOf2);
                            break;
                        case 3:
                            Object objValueOf3 = Float.valueOf(SafeParcelReader.p(parcel, i12));
                            if (aVar2 != 0) {
                                objValueOf3 = aVar2.a(objValueOf3);
                            }
                            A(sb2, field, objValueOf3);
                            break;
                        case 4:
                            Object objValueOf4 = Double.valueOf(SafeParcelReader.n(parcel, i12));
                            if (aVar2 != 0) {
                                objValueOf4 = aVar2.a(objValueOf4);
                            }
                            A(sb2, field, objValueOf4);
                            break;
                        case 5:
                            Object objA2 = SafeParcelReader.a(parcel, i12);
                            if (aVar2 != 0) {
                                objA2 = aVar2.a(objA2);
                            }
                            A(sb2, field, objA2);
                            break;
                        case 6:
                            Object objValueOf5 = Boolean.valueOf(SafeParcelReader.l(parcel, i12));
                            if (aVar2 != 0) {
                                objValueOf5 = aVar2.a(objValueOf5);
                            }
                            A(sb2, field, objValueOf5);
                            break;
                        case 7:
                            String strF = SafeParcelReader.f(parcel, i12);
                            if (aVar2 != 0) {
                                strF = aVar2.a(strF);
                            }
                            A(sb2, field, strF);
                            break;
                        case 8:
                        case 9:
                            Object objC = SafeParcelReader.c(parcel, i12);
                            if (aVar2 != 0) {
                                objC = aVar2.a(objC);
                            }
                            A(sb2, field, objC);
                            break;
                        case 10:
                            Bundle bundleB = SafeParcelReader.b(parcel, i12);
                            Object map2 = new HashMap();
                            for (String str2 : bundleB.keySet()) {
                                String string = bundleB.getString(str2);
                                C36729v.j(string);
                                map2.put(str2, string);
                            }
                            if (aVar2 != 0) {
                                map2 = aVar2.a(map2);
                            }
                            A(sb2, field, map2);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(AK.c.g(i13, "Unknown field out type = "));
                    }
                } else {
                    boolean z13 = field.f349560f;
                    String str3 = field.f349564j;
                    if (z13) {
                        sb2.append("[");
                        switch (i13) {
                            case 0:
                                int[] iArrD = SafeParcelReader.d(parcel, i12);
                                int length = iArrD.length;
                                for (int i14 = 0; i14 < length; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(iArrD[i14]);
                                }
                                break;
                            case 1:
                                int iW3 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iW3 != 0) {
                                    int i15 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[i15];
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        bigIntegerArr[i16] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(iDataPosition2 + iW3);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i17 = 0; i17 < length2; i17++) {
                                    if (i17 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i17]);
                                }
                                break;
                            case 2:
                                int iW4 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition3 = parcel.dataPosition();
                                if (iW4 != 0) {
                                    jArrCreateLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(iDataPosition3 + iW4);
                                }
                                int length3 = jArrCreateLongArray.length;
                                for (int i18 = 0; i18 < length3; i18++) {
                                    if (i18 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(jArrCreateLongArray[i18]);
                                }
                                break;
                            case 3:
                                int iW5 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition4 = parcel.dataPosition();
                                if (iW5 != 0) {
                                    fArrCreateFloatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(iDataPosition4 + iW5);
                                }
                                int length4 = fArrCreateFloatArray.length;
                                for (int i19 = 0; i19 < length4; i19++) {
                                    if (i19 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(fArrCreateFloatArray[i19]);
                                }
                                break;
                            case 4:
                                int iW6 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition5 = parcel.dataPosition();
                                if (iW6 != 0) {
                                    dArrCreateDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(iDataPosition5 + iW6);
                                }
                                int length5 = dArrCreateDoubleArray.length;
                                for (int i22 = 0; i22 < length5; i22++) {
                                    if (i22 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(dArrCreateDoubleArray[i22]);
                                }
                                break;
                            case 5:
                                int iW7 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition6 = parcel.dataPosition();
                                if (iW7 != 0) {
                                    int i23 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[i23];
                                    for (int i24 = 0; i24 < i23; i24++) {
                                        bigDecimalArr[i24] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(iDataPosition6 + iW7);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i25 = 0; i25 < length6; i25++) {
                                    if (i25 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i25]);
                                }
                                break;
                            case 6:
                                int iW8 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition7 = parcel.dataPosition();
                                if (iW8 != 0) {
                                    zArrCreateBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(iDataPosition7 + iW8);
                                }
                                int length7 = zArrCreateBooleanArray.length;
                                for (int i26 = 0; i26 < length7; i26++) {
                                    if (i26 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(zArrCreateBooleanArray[i26]);
                                }
                                break;
                            case 7:
                                String[] strArrG = SafeParcelReader.g(parcel, i12);
                                int length8 = strArrG.length;
                                for (int i27 = 0; i27 < length8; i27++) {
                                    if (i27 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(strArrG[i27]);
                                    sb2.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int iW9 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition8 = parcel.dataPosition();
                                if (iW9 != 0) {
                                    int i28 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[i28];
                                    for (int i29 = 0; i29 < i28; i29++) {
                                        int i32 = parcel.readInt();
                                        if (i32 != 0) {
                                            int iDataPosition9 = parcel.dataPosition();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            parcelObtain2.appendFrom(parcel, iDataPosition9, i32);
                                            parcelArr2[i29] = parcelObtain2;
                                            parcel.setDataPosition(iDataPosition9 + i32);
                                        } else {
                                            parcelArr2[i29] = null;
                                        }
                                    }
                                    parcel.setDataPosition(iDataPosition8 + iW9);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i33 = 0; i33 < length9; i33++) {
                                    if (i33 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i33].setDataPosition(0);
                                    C36729v.j(str3);
                                    C36729v.j(field.f349565k);
                                    Map map3 = (Map) field.f349565k.f349581c.get(str3);
                                    C36729v.j(map3);
                                    y(sb2, map3, parcelArr[i33]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb2.append("]");
                    } else {
                        switch (i13) {
                            case 0:
                                sb2.append(SafeParcelReader.s(parcel, i12));
                                break;
                            case 1:
                                int iW10 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition10 = parcel.dataPosition();
                                if (iW10 != 0) {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(iDataPosition10 + iW10);
                                    bigInteger = new BigInteger(bArrCreateByteArray2);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(SafeParcelReader.u(parcel, i12));
                                break;
                            case 3:
                                sb2.append(SafeParcelReader.p(parcel, i12));
                                break;
                            case 4:
                                sb2.append(SafeParcelReader.n(parcel, i12));
                                break;
                            case 5:
                                sb2.append(SafeParcelReader.a(parcel, i12));
                                break;
                            case 6:
                                sb2.append(SafeParcelReader.l(parcel, i12));
                                break;
                            case 7:
                                String strF2 = SafeParcelReader.f(parcel, i12);
                                sb2.append("\"");
                                sb2.append(r.a(strF2));
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] bArrC = SafeParcelReader.c(parcel, i12);
                                sb2.append("\"");
                                sb2.append(bArrC != null ? Base64.encodeToString(bArrC, 0) : null);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] bArrC2 = SafeParcelReader.c(parcel, i12);
                                sb2.append("\"");
                                sb2.append(bArrC2 != null ? Base64.encodeToString(bArrC2, 10) : null);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle bundleB2 = SafeParcelReader.b(parcel, i12);
                                Set<String> setKeySet = bundleB2.keySet();
                                sb2.append("{");
                                boolean z14 = true;
                                for (String str4 : setKeySet) {
                                    if (!z14) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(r.a(bundleB2.getString(str4)));
                                    sb2.append("\"");
                                    z14 = false;
                                }
                                sb2.append("}");
                                break;
                            case 11:
                                int iW11 = SafeParcelReader.w(parcel, i12);
                                int iDataPosition11 = parcel.dataPosition();
                                if (iW11 != 0) {
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain.appendFrom(parcel, iDataPosition11, iW11);
                                    parcel.setDataPosition(iDataPosition11 + iW11);
                                }
                                parcelObtain.setDataPosition(0);
                                C36729v.j(str3);
                                C36729v.j(field.f349565k);
                                Map map4 = (Map) field.f349565k.f349581c.get(str3);
                                C36729v.j(map4);
                                y(sb2, map4, parcelObtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z12 = true;
            }
        }
        if (parcel.dataPosition() != iY2) {
            throw new SafeParcelReader.ParseException(AK.c.g(iY2, "Overread allowed size end="), parcel);
        }
        sb2.append('}');
    }

    public static final void z(StringBuilder sb2, int i12, @P Object obj) {
        switch (i12) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                C36729v.j(obj);
                sb2.append(r.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                C36729v.j(obj);
                s.a(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(AK.c.g(i12, "Unknown type = "));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@N FastJsonResponse.Field field, @N String str, @P ArrayList<T> arrayList) {
        x(field);
        ArrayList arrayList2 = new ArrayList();
        C36729v.j(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i12)).w());
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i14 = 0; i14 < size2; i14++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i14);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(@N FastJsonResponse.Field field, @N String str, @N T t12) {
        x(field);
        Parcel parcelW = ((SafeParcelResponse) t12).w();
        Parcel parcel = this.f349568c;
        int i12 = field.f349562h;
        if (parcelW == null) {
            TX0.a.q(parcel, i12, 0);
            return;
        }
        int iO2 = TX0.a.o(parcel, i12);
        parcel.appendFrom(parcelW, 0, parcelW.dataSize());
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void c(@N FastJsonResponse.Field field, boolean z12) {
        x(field);
        Parcel parcel = this.f349568c;
        TX0.a.q(parcel, field.f349562h, 4);
        parcel.writeInt(z12 ? 1 : 0);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void d(@N FastJsonResponse.Field field, @P byte[] bArr) {
        x(field);
        TX0.a.b(this.f349568c, field.f349562h, bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void e(@N FastJsonResponse.Field field, int i12) {
        x(field);
        Parcel parcel = this.f349568c;
        TX0.a.q(parcel, field.f349562h, 4);
        parcel.writeInt(i12);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void f(@N FastJsonResponse.Field field, long j12) {
        x(field);
        Parcel parcel = this.f349568c;
        TX0.a.q(parcel, field.f349562h, 8);
        parcel.writeLong(j12);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void g(@N FastJsonResponse.Field field, @P String str) {
        x(field);
        TX0.a.j(this.f349568c, field.f349562h, str, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @P
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.f349570e;
        if (zanVar == null) {
            return null;
        }
        String str = this.f349571f;
        C36729v.j(str);
        return (Map) zanVar.f349581c.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @N
    public final Object getValueObject(@N String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void h(@N FastJsonResponse.Field field, @P Map map) {
        x(field);
        Bundle bundle = new Bundle();
        C36729v.j(map);
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        TX0.a.a(this.f349568c, field.f349562h, bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void i(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i12 = 0; i12 < size; i12++) {
            strArr[i12] = (String) arrayList.get(i12);
        }
        TX0.a.k(this.f349568c, field.f349562h, strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@N String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void l(@N FastJsonResponse.Field field, @P BigDecimal bigDecimal) {
        x(field);
        Parcel parcel = this.f349568c;
        int i12 = field.f349562h;
        if (bigDecimal == null) {
            TX0.a.q(parcel, i12, 0);
            return;
        }
        int iO2 = TX0.a.o(parcel, i12);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void m(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i12 = 0; i12 < size; i12++) {
            bigDecimalArr[i12] = (BigDecimal) arrayList.get(i12);
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeByteArray(bigDecimalArr[i14].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i14].scale());
        }
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void n(@N FastJsonResponse.Field field, @P BigInteger bigInteger) {
        x(field);
        Parcel parcel = this.f349568c;
        int i12 = field.f349562h;
        if (bigInteger == null) {
            TX0.a.q(parcel, i12, 0);
            return;
        }
        int iO2 = TX0.a.o(parcel, i12);
        parcel.writeByteArray(bigInteger.toByteArray());
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void o(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i12 = 0; i12 < size; i12++) {
            bigIntegerArr[i12] = (BigInteger) arrayList.get(i12);
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeByteArray(bigIntegerArr[i14].toByteArray());
        }
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void p(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i12 = 0; i12 < size; i12++) {
            zArr[i12] = ((Boolean) arrayList.get(i12)).booleanValue();
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeBooleanArray(zArr);
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void q(@N FastJsonResponse.Field field, double d12) {
        x(field);
        Parcel parcel = this.f349568c;
        TX0.a.q(parcel, field.f349562h, 8);
        parcel.writeDouble(d12);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void r(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i12 = 0; i12 < size; i12++) {
            dArr[i12] = ((Double) arrayList.get(i12)).doubleValue();
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeDoubleArray(dArr);
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void s(@N FastJsonResponse.Field field, float f12) {
        x(field);
        Parcel parcel = this.f349568c;
        TX0.a.q(parcel, field.f349562h, 4);
        parcel.writeFloat(f12);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void t(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i12 = 0; i12 < size; i12++) {
            fArr[i12] = ((Float) arrayList.get(i12)).floatValue();
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeFloatArray(fArr);
        TX0.a.p(parcel, iO2);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @N
    public final String toString() {
        zan zanVar = this.f349570e;
        C36729v.k(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelW = w();
        parcelW.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f349571f;
        C36729v.j(str);
        Map map = (Map) zanVar.f349581c.get(str);
        C36729v.j(map);
        y(sb2, map, parcelW);
        return sb2.toString();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void u(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        TX0.a.f(this.f349568c, field.f349562h, iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void v(@N FastJsonResponse.Field field, @P ArrayList arrayList) {
        x(field);
        C36729v.j(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i12 = 0; i12 < size; i12++) {
            jArr[i12] = ((Long) arrayList.get(i12)).longValue();
        }
        int i13 = field.f349562h;
        Parcel parcel = this.f349568c;
        int iO2 = TX0.a.o(parcel, i13);
        parcel.writeLongArray(jArr);
        TX0.a.p(parcel, iO2);
    }

    @N
    public final Parcel w() {
        int i12 = this.f349572g;
        Parcel parcel = this.f349568c;
        if (i12 == 0) {
            int iO2 = TX0.a.o(parcel, 20293);
            this.f349573h = iO2;
            TX0.a.p(parcel, iO2);
            this.f349572g = 2;
        } else if (i12 == 1) {
            TX0.a.p(parcel, this.f349573h);
            this.f349572g = 2;
        }
        return parcel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349567b);
        Parcel parcelW = w();
        if (parcelW != null) {
            int iO3 = TX0.a.o(parcel, 2);
            parcel.appendFrom(parcelW, 0, parcelW.dataSize());
            TX0.a.p(parcel, iO3);
        }
        TX0.a.i(parcel, 3, this.f349569d != 0 ? this.f349570e : null, i12, false);
        TX0.a.p(parcel, iO2);
    }

    public final void x(FastJsonResponse.Field field) {
        if (field.f349562h == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f349568c;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i12 = this.f349572g;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f349573h = TX0.a.o(parcel, 20293);
            this.f349572g = 1;
        }
    }
}

package com.avito.android.lib.design.input;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FormatterType.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/FormatterType;", "Landroid/os/Parcelable;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FormatterType implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179289f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179290g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179291h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179292i = new FormatterType(6, 2, null == true ? 1 : 0, 4, null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179293j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179294k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179295l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179296m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179297n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179298o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final FormatterType f179299p;

    /* renamed from: b, reason: collision with root package name */
    public final int f179300b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f179301c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final MaskParameters f179302d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f179288e = new a(null);

    @Y61.k
    public static final Parcelable.Creator<FormatterType> CREATOR = new b();

    /* compiled from: FormatterType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/input/FormatterType$a;", "", "<init>", "()V", "", "defaultDecimalSeparator", "C", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static FormatterType a(int i12) {
            FormatterType formatterType = FormatterType.f179289f;
            if (i12 == formatterType.f179300b) {
                return formatterType;
            }
            if (i12 == c().f179300b) {
                return c();
            }
            FormatterType formatterType2 = FormatterType.f179290g;
            if (i12 != formatterType2.f179300b) {
                if (i12 == d().f179300b) {
                    return d();
                }
                if (i12 == b().f179300b) {
                    return b();
                }
                formatterType2 = FormatterType.f179291h;
                if (i12 != formatterType2.f179300b) {
                    formatterType2 = FormatterType.f179292i;
                    if (i12 != formatterType2.f179300b) {
                        formatterType2 = FormatterType.f179293j;
                        if (i12 != formatterType2.f179300b) {
                            e eVar = e.f179396a;
                            Locale locale = Locale.getDefault();
                            eVar.getClass();
                            locale.getLanguage();
                            FormatterType formatterType3 = e.f179400e;
                            if (i12 == formatterType3.f179300b) {
                                Locale locale2 = Locale.getDefault();
                                eVar.getClass();
                                locale2.getLanguage();
                                return formatterType3;
                            }
                            formatterType2 = FormatterType.f179295l;
                            if (i12 != formatterType2.f179300b) {
                                formatterType2 = FormatterType.f179296m;
                                if (i12 != formatterType2.f179300b) {
                                    formatterType2 = FormatterType.f179297n;
                                    if (i12 != formatterType2.f179300b) {
                                        formatterType2 = FormatterType.f179298o;
                                        if (i12 != formatterType2.f179300b) {
                                            formatterType2 = FormatterType.f179299p;
                                            if (i12 != formatterType2.f179300b) {
                                                return formatterType;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return formatterType2;
        }

        @Y61.k
        public static FormatterType b() {
            e eVar = e.f179396a;
            Locale locale = Locale.getDefault();
            eVar.getClass();
            locale.getLanguage();
            return e.f179399d;
        }

        @Y61.k
        public static FormatterType c() {
            e eVar = e.f179396a;
            Locale locale = Locale.getDefault();
            eVar.getClass();
            locale.getLanguage();
            return e.f179397b;
        }

        @Y61.k
        public static FormatterType d() {
            e eVar = e.f179396a;
            Locale locale = Locale.getDefault();
            eVar.getClass();
            locale.getLanguage();
            return e.f179398c;
        }

        public a() {
        }
    }

    /* compiled from: FormatterType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FormatterType> {
        @Override // android.os.Parcelable.Creator
        public final FormatterType createFromParcel(Parcel parcel) {
            return new FormatterType(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MaskParameters.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FormatterType[] newArray(int i12) {
            return new FormatterType[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C42822w c42822w = null;
        String str = null;
        boolean z12 = false;
        boolean z13 = false;
        String str2 = null;
        char c12 = 0;
        f179289f = new FormatterType(0, 1, new MaskParameters(null, false, str, null, z12, null, z13, str2, c12, 0, null, 2047, c42822w));
        f179290g = new FormatterType(2, 3, new MaskParameters("+7", true, str, null == true ? 1 : 0, z12, "### ###-##-##", z13, str2, c12, null == true ? 1 : 0, "8", 988, c42822w));
        C42822w c42822w2 = null;
        String str3 = null;
        boolean z14 = false;
        char c13 = 0;
        int i12 = 0;
        String str4 = null;
        f179291h = new FormatterType(5, 2, new MaskParameters("", null == true ? 1 : 0, "₽", str3, z14, "### ### ### ### ### ### ###", true, "0", c13, i12, str4, 1818, c42822w2));
        int i13 = 2047;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z15 = false;
        String str8 = null;
        f179293j = new FormatterType(7, 524289, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, str7, z15, str8, c13, i12, str4, i13, c42822w2));
        f179294k = new FormatterType(8, 32, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, str7, z15, str8, c13, i12, str4, i13, c42822w2));
        int i14 = 2015;
        f179295l = new FormatterType(10, 2, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, "## ## ######", z15, str8, c13, i12, str4, i14, c42822w2));
        f179296m = new FormatterType(11, 2, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, "############", z15, str8, c13, i12, str4, i14, c42822w2));
        f179297n = new FormatterType(12, 2, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, "###-###", z15, str8, c13, i12, str4, i14, c42822w2));
        f179298o = new FormatterType(13, 2, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, "####", z15, "0", c13, i12, str4, 1887, c42822w2));
        f179299p = new FormatterType(14, 2, new MaskParameters(str5, null == true ? 1 : 0, str6, str3, z14, "### ### ### ##", z15, null, c13, i12, str4, 2015, c42822w2));
    }

    public FormatterType() {
        this(0, null, null, 7, null);
    }

    public static FormatterType a(FormatterType formatterType, MaskParameters maskParameters) {
        int i12 = formatterType.f179300b;
        Integer num = formatterType.f179301c;
        formatterType.getClass();
        return new FormatterType(i12, num, maskParameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatterType)) {
            return false;
        }
        FormatterType formatterType = (FormatterType) obj;
        return this.f179300b == formatterType.f179300b && L.f(this.f179301c, formatterType.f179301c) && L.f(this.f179302d, formatterType.f179302d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f179300b) * 31;
        Integer num = this.f179301c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        MaskParameters maskParameters = this.f179302d;
        return iHashCode2 + (maskParameters != null ? maskParameters.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "FormatterType(id=" + this.f179300b + ", inputType=" + this.f179301c + ", maskParameters=" + this.f179302d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f179300b);
        Integer num = this.f179301c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        MaskParameters maskParameters = this.f179302d;
        if (maskParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            maskParameters.writeToParcel(parcel, i12);
        }
    }

    public FormatterType(int i12, @Y61.l Integer num, @Y61.l MaskParameters maskParameters) {
        this.f179300b = i12;
        this.f179301c = num;
        this.f179302d = maskParameters;
    }

    public /* synthetic */ FormatterType(int i12, Integer num, MaskParameters maskParameters, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : maskParameters);
    }
}

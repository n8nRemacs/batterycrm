package ru.cyberity.ml.badphotos.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckPhotoQualityResult.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J|\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/cyberity/ml/badphotos/models/b;", "Landroid/os/Parcelable;", "", "checkResult", "checkModel", "", "checkScore", "", "checkTime", "lowThreshold", "highThreshold", "", "checkBadAttempts", "checkMaxBlockedAttempts", "", "isAutocaptured", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lru/cyberity/ml/badphotos/models/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "m", "b", "l", "c", "Ljava/lang/Float;", "n", "()Ljava/lang/Float;", "d", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "e", "q", "f", "p", "g", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "h", "k", "i", "Ljava/lang/Boolean;", "r", "()Ljava/lang/Boolean;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class b implements Parcelable {

    @k
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String checkResult;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String checkModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Float checkScore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final Long checkTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final Float lowThreshold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final Float highThreshold;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final Integer checkBadAttempts;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final Integer checkMaxBlockedAttempts;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private final Boolean isAutocaptured;

    /* compiled from: CheckPhotoQualityResult.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(string, string2, fValueOf, lValueOf, fValueOf2, fValueOf3, numValueOf, numValueOf2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i12) {
            return new b[i12];
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @k
    public final b a(@l String checkResult, @l String checkModel, @l Float checkScore, @l Long checkTime, @l Float lowThreshold, @l Float highThreshold, @l Integer checkBadAttempts, @l Integer checkMaxBlockedAttempts, @l Boolean isAutocaptured) {
        return new b(checkResult, checkModel, checkScore, checkTime, lowThreshold, highThreshold, checkBadAttempts, checkMaxBlockedAttempts, isAutocaptured);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.checkResult, bVar.checkResult) && L.f(this.checkModel, bVar.checkModel) && L.f(this.checkScore, bVar.checkScore) && L.f(this.checkTime, bVar.checkTime) && L.f(this.lowThreshold, bVar.lowThreshold) && L.f(this.highThreshold, bVar.highThreshold) && L.f(this.checkBadAttempts, bVar.checkBadAttempts) && L.f(this.checkMaxBlockedAttempts, bVar.checkMaxBlockedAttempts) && L.f(this.isAutocaptured, bVar.isAutocaptured);
    }

    public int hashCode() {
        String str = this.checkResult;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkModel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f12 = this.checkScore;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Long l12 = this.checkTime;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Float f13 = this.lowThreshold;
        int iHashCode5 = (iHashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.highThreshold;
        int iHashCode6 = (iHashCode5 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num = this.checkBadAttempts;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.checkMaxBlockedAttempts;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isAutocaptured;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Integer getCheckBadAttempts() {
        return this.checkBadAttempts;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Integer getCheckMaxBlockedAttempts() {
        return this.checkMaxBlockedAttempts;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getCheckModel() {
        return this.checkModel;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getCheckResult() {
        return this.checkResult;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final Float getCheckScore() {
        return this.checkScore;
    }

    @l
    /* renamed from: o, reason: from getter */
    public final Long getCheckTime() {
        return this.checkTime;
    }

    @l
    /* renamed from: q, reason: from getter */
    public final Float getLowThreshold() {
        return this.lowThreshold;
    }

    @l
    /* renamed from: r, reason: from getter */
    public final Boolean getIsAutocaptured() {
        return this.isAutocaptured;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CheckPhotoQualityResult(checkResult=");
        sb2.append(this.checkResult);
        sb2.append(", checkModel=");
        sb2.append(this.checkModel);
        sb2.append(", checkScore=");
        sb2.append(this.checkScore);
        sb2.append(", checkTime=");
        sb2.append(this.checkTime);
        sb2.append(", lowThreshold=");
        sb2.append(this.lowThreshold);
        sb2.append(", highThreshold=");
        sb2.append(this.highThreshold);
        sb2.append(", checkBadAttempts=");
        sb2.append(this.checkBadAttempts);
        sb2.append(", checkMaxBlockedAttempts=");
        sb2.append(this.checkMaxBlockedAttempts);
        sb2.append(", isAutocaptured=");
        return C0.g(sb2, this.isAutocaptured, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.checkResult);
        parcel.writeString(this.checkModel);
        Float f12 = this.checkScore;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Long l12 = this.checkTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Float f13 = this.lowThreshold;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f13);
        }
        Float f14 = this.highThreshold;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f14);
        }
        Integer num = this.checkBadAttempts;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.checkMaxBlockedAttempts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Boolean bool = this.isAutocaptured;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public b(@l String str, @l String str2, @l Float f12, @l Long l12, @l Float f13, @l Float f14, @l Integer num, @l Integer num2, @l Boolean bool) {
        this.checkResult = str;
        this.checkModel = str2;
        this.checkScore = f12;
        this.checkTime = l12;
        this.lowThreshold = f13;
        this.highThreshold = f14;
        this.checkBadAttempts = num;
        this.checkMaxBlockedAttempts = num2;
        this.isAutocaptured = bool;
    }

    public /* synthetic */ b(String str, String str2, Float f12, Long l12, Float f13, Float f14, Integer num, Integer num2, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : f12, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : f13, (i12 & 32) != 0 ? null : f14, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : num2, (i12 & 256) == 0 ? bool : null);
    }
}

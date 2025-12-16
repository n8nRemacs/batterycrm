package com.avito.android.mortgage.api.model.suggestions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FioSuggestion.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/suggestions/FioSuggestion;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "", "firstName", "middleName", "lastName", "", "withoutMiddleName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "d", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class FioSuggestion implements Suggestion {

    @k
    public static final Parcelable.Creator<FioSuggestion> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198264b;

    @c("firstName")
    @l
    private final String firstName;

    @c("lastName")
    @l
    private final String lastName;

    @c("middleName")
    @l
    private final String middleName;

    /* compiled from: FioSuggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FioSuggestion> {
        @Override // android.os.Parcelable.Creator
        public final FioSuggestion createFromParcel(Parcel parcel) {
            return new FioSuggestion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FioSuggestion[] newArray(int i12) {
            return new FioSuggestion[i12];
        }
    }

    public FioSuggestion(@l String str, @l String str2, @l String str3, boolean z12) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.f198264b = z12;
    }

    public static FioSuggestion a(FioSuggestion fioSuggestion, String str, String str2, String str3, int i12) {
        if ((i12 & 1) != 0) {
            str = fioSuggestion.firstName;
        }
        if ((i12 & 4) != 0) {
            str3 = fioSuggestion.lastName;
        }
        boolean z12 = (i12 & 8) != 0 ? fioSuggestion.f198264b : true;
        fioSuggestion.getClass();
        return new FioSuggestion(str, str2, str3, z12);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    @Override // com.avito.android.mortgage.api.model.suggestions.Suggestion
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0() {
        /*
            r4 = this;
            boolean r0 = r4.f198264b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = r4.middleName
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            java.lang.String r3 = r4.firstName
            if (r3 == 0) goto L27
            int r3 = r3.length()
            if (r3 != 0) goto L25
            goto L27
        L25:
            r3 = r2
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 != 0) goto L3d
            java.lang.String r3 = r4.lastName
            if (r3 == 0) goto L37
            int r3 = r3.length()
            if (r3 != 0) goto L35
            goto L37
        L35:
            r3 = r2
            goto L38
        L37:
            r3 = r1
        L38:
            if (r3 != 0) goto L3d
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.api.model.suggestions.FioSuggestion.c0():boolean");
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FioSuggestion)) {
            return false;
        }
        FioSuggestion fioSuggestion = (FioSuggestion) obj;
        return L.f(this.firstName, fioSuggestion.firstName) && L.f(this.middleName, fioSuggestion.middleName) && L.f(this.lastName, fioSuggestion.lastName) && this.f198264b == fioSuggestion.f198264b;
    }

    public final int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        return Boolean.hashCode(this.f198264b) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FioSuggestion(firstName=");
        sb2.append(this.firstName);
        sb2.append(", middleName=");
        sb2.append(this.middleName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", withoutMiddleName=");
        return r.x(sb2, this.f198264b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeInt(this.f198264b ? 1 : 0);
    }

    public /* synthetic */ FioSuggestion(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? false : z12);
    }
}

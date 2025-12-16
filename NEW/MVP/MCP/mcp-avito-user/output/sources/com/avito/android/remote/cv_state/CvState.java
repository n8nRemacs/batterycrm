package com.avito.android.remote.cv_state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvState.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/cv_state/CvState;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/cv_state/CvStateType;", "currentState", "", "states", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/cv_state/CvStateType;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/cv_state/CvStateType;", "c", "()Lcom/avito/android/remote/cv_state/CvStateType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvState implements Parcelable {

    @k
    public static final Parcelable.Creator<CvState> CREATOR = new a();

    @c("currentState")
    @l
    private final CvStateType currentState;

    @c("states")
    @k
    private final List<CvStateType> states;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: CvState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvState> {
        @Override // android.os.Parcelable.Creator
        public final CvState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            CvStateType cvStateTypeCreateFromParcel = parcel.readInt() == 0 ? null : CvStateType.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CvStateType.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CvState(string, string2, cvStateTypeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CvState[] newArray(int i12) {
            return new CvState[i12];
        }
    }

    public CvState(@k String str, @k String str2, @l CvStateType cvStateType, @k List<CvStateType> list) {
        this.title = str;
        this.subtitle = str2;
        this.currentState = cvStateType;
        this.states = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CvStateType getCurrentState() {
        return this.currentState;
    }

    @k
    public final List<CvStateType> d() {
        return this.states;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvState)) {
            return false;
        }
        CvState cvState = (CvState) obj;
        return L.f(this.title, cvState.title) && L.f(this.subtitle, cvState.subtitle) && L.f(this.currentState, cvState.currentState) && L.f(this.states, cvState.states);
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.subtitle);
        CvStateType cvStateType = this.currentState;
        return this.states.hashCode() + ((iD2 + (cvStateType == null ? 0 : cvStateType.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvState(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", currentState=");
        sb2.append(this.currentState);
        sb2.append(", states=");
        return H.p(sb2, this.states, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        CvStateType cvStateType = this.currentState;
        if (cvStateType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStateType.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.states, parcel);
        while (itJ.hasNext()) {
            ((CvStateType) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}

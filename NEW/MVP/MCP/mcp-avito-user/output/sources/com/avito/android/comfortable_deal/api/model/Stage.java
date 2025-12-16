package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Stage.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Stage;", "Landroid/os/Parcelable;", "", "name", "status", "Lcom/avito/android/comfortable_deal/api/model/DisplayStage;", "display", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/DisplayStage;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "d", "Lcom/avito/android/comfortable_deal/api/model/DisplayStage;", "c", "()Lcom/avito/android/comfortable_deal/api/model/DisplayStage;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Stage implements Parcelable {

    @k
    public static final Parcelable.Creator<Stage> CREATOR = new a();

    @c("display")
    @k
    private final DisplayStage display;

    @c("name")
    @k
    private final String name;

    @c("status")
    @k
    private final String status;

    /* compiled from: Stage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Stage> {
        @Override // android.os.Parcelable.Creator
        public final Stage createFromParcel(Parcel parcel) {
            return new Stage(parcel.readString(), parcel.readString(), DisplayStage.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Stage[] newArray(int i12) {
            return new Stage[i12];
        }
    }

    public Stage(@k String str, @k String str2, @k DisplayStage displayStage) {
        this.name = str;
        this.status = str2;
        this.display = displayStage;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DisplayStage getDisplay() {
        return this.display;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stage)) {
            return false;
        }
        Stage stage = (Stage) obj;
        return L.f(this.name, stage.name) && L.f(this.status, stage.status) && L.f(this.display, stage.display);
    }

    public final int hashCode() {
        return this.display.hashCode() + H.d(this.name.hashCode() * 31, 31, this.status);
    }

    @k
    public final String toString() {
        return "Stage(name=" + this.name + ", status=" + this.status + ", display=" + this.display + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        parcel.writeString(this.status);
        this.display.writeToParcel(parcel, i12);
    }
}

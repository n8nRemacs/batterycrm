package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaMiniReport;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/autoteka/model/MiniReportLoading;", "loading", "Lcom/avito/android/remote/autoteka/model/MiniReportNotFound;", "notFound", "Lcom/avito/android/remote/autoteka/model/MiniReportReady;", "ready", "<init>", "(Lcom/avito/android/remote/autoteka/model/MiniReportLoading;Lcom/avito/android/remote/autoteka/model/MiniReportNotFound;Lcom/avito/android/remote/autoteka/model/MiniReportReady;)V", "Lcom/avito/android/remote/autoteka/model/MiniReportLoading;", "c", "()Lcom/avito/android/remote/autoteka/model/MiniReportLoading;", "Lcom/avito/android/remote/autoteka/model/MiniReportNotFound;", "d", "()Lcom/avito/android/remote/autoteka/model/MiniReportNotFound;", "Lcom/avito/android/remote/autoteka/model/MiniReportReady;", "e", "()Lcom/avito/android/remote/autoteka/model/MiniReportReady;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaMiniReport implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaMiniReport> CREATOR = new a();

    @c("loading")
    @l
    private final MiniReportLoading loading;

    @c("notFound")
    @l
    private final MiniReportNotFound notFound;

    @c("ready")
    @l
    private final MiniReportReady ready;

    /* compiled from: AutotekaPreviewResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaMiniReport> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaMiniReport createFromParcel(Parcel parcel) {
            return new AutotekaMiniReport(parcel.readInt() == 0 ? null : MiniReportLoading.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MiniReportNotFound.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MiniReportReady.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaMiniReport[] newArray(int i12) {
            return new AutotekaMiniReport[i12];
        }
    }

    public AutotekaMiniReport(@l MiniReportLoading miniReportLoading, @l MiniReportNotFound miniReportNotFound, @l MiniReportReady miniReportReady) {
        this.loading = miniReportLoading;
        this.notFound = miniReportNotFound;
        this.ready = miniReportReady;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final MiniReportLoading getLoading() {
        return this.loading;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final MiniReportNotFound getNotFound() {
        return this.notFound;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final MiniReportReady getReady() {
        return this.ready;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaMiniReport)) {
            return false;
        }
        AutotekaMiniReport autotekaMiniReport = (AutotekaMiniReport) obj;
        return L.f(this.loading, autotekaMiniReport.loading) && L.f(this.notFound, autotekaMiniReport.notFound) && L.f(this.ready, autotekaMiniReport.ready);
    }

    public final int hashCode() {
        MiniReportLoading miniReportLoading = this.loading;
        int iHashCode = (miniReportLoading == null ? 0 : miniReportLoading.hashCode()) * 31;
        MiniReportNotFound miniReportNotFound = this.notFound;
        int iHashCode2 = (iHashCode + (miniReportNotFound == null ? 0 : miniReportNotFound.hashCode())) * 31;
        MiniReportReady miniReportReady = this.ready;
        return iHashCode2 + (miniReportReady != null ? miniReportReady.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AutotekaMiniReport(loading=" + this.loading + ", notFound=" + this.notFound + ", ready=" + this.ready + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        MiniReportLoading miniReportLoading = this.loading;
        if (miniReportLoading == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniReportLoading.writeToParcel(parcel, i12);
        }
        MiniReportNotFound miniReportNotFound = this.notFound;
        if (miniReportNotFound == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniReportNotFound.writeToParcel(parcel, i12);
        }
        MiniReportReady miniReportReady = this.ready;
        if (miniReportReady == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniReportReady.writeToParcel(parcel, i12);
        }
    }
}

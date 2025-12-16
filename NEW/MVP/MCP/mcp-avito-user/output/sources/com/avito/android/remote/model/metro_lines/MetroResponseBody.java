package com.avito.android.remote.model.metro_lines;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MetroResponseBody.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/metro_lines/MetroLine;", "lines", "Lcom/avito/android/remote/model/metro_lines/MetroStation;", "stations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getLines", "()Ljava/util/List;", "getStations", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MetroResponseBody implements Parcelable {

    @k
    public static final Parcelable.Creator<MetroResponseBody> CREATOR = new Creator();

    @c("lines")
    @k
    private final List<MetroLine> lines;

    @c("stations")
    @k
    private final List<MetroStation> stations;

    /* compiled from: MetroResponseBody.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MetroResponseBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MetroResponseBody createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(MetroLine.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(MetroStation.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new MetroResponseBody(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MetroResponseBody[] newArray(int i12) {
            return new MetroResponseBody[i12];
        }
    }

    public MetroResponseBody(@k List<MetroLine> list, @k List<MetroStation> list2) {
        this.lines = list;
        this.stations = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<MetroLine> getLines() {
        return this.lines;
    }

    @k
    public final List<MetroStation> getStations() {
        return this.stations;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.lines, parcel);
        while (itJ.hasNext()) {
            ((MetroLine) itJ.next()).writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.stations, parcel);
        while (itJ2.hasNext()) {
            ((MetroStation) itJ2.next()).writeToParcel(parcel, flags);
        }
    }
}

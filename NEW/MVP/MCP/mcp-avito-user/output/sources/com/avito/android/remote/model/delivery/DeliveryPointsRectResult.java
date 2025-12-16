package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Overlay;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryPointsRectResult.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryPointsRectResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/delivery/DeliveryPointRect;", "pins", "Lcom/avito/android/remote/model/delivery/Cluster;", "clusters", "Lcom/avito/android/remote/model/Overlay;", "overlay", "Lcom/avito/android/remote/model/delivery/DeliveryPreselectPoint;", "preferredLocation", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Overlay;Lcom/avito/android/remote/model/delivery/DeliveryPreselectPoint;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "getClusters", "Lcom/avito/android/remote/model/Overlay;", "getOverlay", "()Lcom/avito/android/remote/model/Overlay;", "Lcom/avito/android/remote/model/delivery/DeliveryPreselectPoint;", "getPreferredLocation", "()Lcom/avito/android/remote/model/delivery/DeliveryPreselectPoint;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryPointsRectResult implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryPointsRectResult> CREATOR = new Creator();

    @c("clusters")
    @k
    private final List<Cluster> clusters;

    @c("topOverlay")
    @l
    private final Overlay overlay;

    @c("pins")
    @k
    private final List<DeliveryPointRect> pins;

    @c("preferredLocation")
    @l
    private final DeliveryPreselectPoint preferredLocation;

    /* compiled from: DeliveryPointsRectResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryPointsRectResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPointsRectResult createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(DeliveryPointRect.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(Cluster.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new DeliveryPointsRectResult(arrayList, arrayList2, (Overlay) parcel.readParcelable(DeliveryPointsRectResult.class.getClassLoader()), parcel.readInt() == 0 ? null : DeliveryPreselectPoint.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryPointsRectResult[] newArray(int i12) {
            return new DeliveryPointsRectResult[i12];
        }
    }

    public DeliveryPointsRectResult(@k List<DeliveryPointRect> list, @k List<Cluster> list2, @l Overlay overlay, @l DeliveryPreselectPoint deliveryPreselectPoint) {
        this.pins = list;
        this.clusters = list2;
        this.overlay = overlay;
        this.preferredLocation = deliveryPreselectPoint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<Cluster> getClusters() {
        return this.clusters;
    }

    @l
    public final Overlay getOverlay() {
        return this.overlay;
    }

    @k
    public final List<DeliveryPointRect> getPins() {
        return this.pins;
    }

    @l
    public final DeliveryPreselectPoint getPreferredLocation() {
        return this.preferredLocation;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.pins, parcel);
        while (itJ.hasNext()) {
            ((DeliveryPointRect) itJ.next()).writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.clusters, parcel);
        while (itJ2.hasNext()) {
            ((Cluster) itJ2.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.overlay, flags);
        DeliveryPreselectPoint deliveryPreselectPoint = this.preferredLocation;
        if (deliveryPreselectPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryPreselectPoint.writeToParcel(parcel, flags);
        }
    }
}

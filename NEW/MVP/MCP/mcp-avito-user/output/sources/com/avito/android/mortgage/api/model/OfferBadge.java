package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OffersResult.kt */
@d
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/mortgage/api/model/OfferBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "leftCorner", "rightCorner", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "preset", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "", "text", "<init>", "(Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;Ljava/lang/String;)V", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "c", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "e", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "d", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "f", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<OfferBadge> CREATOR = new a();

    @c("leftCorner")
    @k
    private final DockingBadgeEdgeType leftCorner;

    @c("preset")
    @k
    private final DockingBadgeType.Predefined preset;

    @c("rightCorner")
    @k
    private final DockingBadgeEdgeType rightCorner;

    @c("size")
    @k
    private final DockingBadgeSize size;

    @c("text")
    @k
    private final String text;

    /* compiled from: OffersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OfferBadge> {
        @Override // android.os.Parcelable.Creator
        public final OfferBadge createFromParcel(Parcel parcel) {
            return new OfferBadge(DockingBadgeEdgeType.valueOf(parcel.readString()), DockingBadgeEdgeType.valueOf(parcel.readString()), (DockingBadgeType.Predefined) parcel.readParcelable(OfferBadge.class.getClassLoader()), DockingBadgeSize.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferBadge[] newArray(int i12) {
            return new OfferBadge[i12];
        }
    }

    public OfferBadge(@k DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2, @k DockingBadgeType.Predefined predefined, @k DockingBadgeSize dockingBadgeSize, @k String str) {
        this.leftCorner = dockingBadgeEdgeType;
        this.rightCorner = dockingBadgeEdgeType2;
        this.preset = predefined;
        this.size = dockingBadgeSize;
        this.text = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DockingBadgeEdgeType getLeftCorner() {
        return this.leftCorner;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DockingBadgeType.Predefined getPreset() {
        return this.preset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final DockingBadgeEdgeType getRightCorner() {
        return this.rightCorner;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.leftCorner.name());
        parcel.writeString(this.rightCorner.name());
        parcel.writeParcelable(this.preset, i12);
        parcel.writeString(this.size.name());
        parcel.writeString(this.text);
    }
}

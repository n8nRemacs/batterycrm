package com.avito.android.remote.model.advert_badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertBadgeBar.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBarParams;", "view", "", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadge;", "badges", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar$Position;", "position", "<init>", "(Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBarParams;Ljava/util/List;Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar$Position;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBarParams;", "getView", "()Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBarParams;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar$Position;", "getPosition", "()Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar$Position;", "Position", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertBadgeBar implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertBadgeBar> CREATOR = new Creator();

    @c("badges")
    @l
    private final List<AdvertBadge> badges;

    @c("position")
    @l
    private final Position position;

    @c("view")
    @l
    private final AdvertBadgeBarParams view;

    /* compiled from: AdvertBadgeBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertBadgeBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeBar createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AdvertBadgeBarParams advertBadgeBarParamsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertBadgeBarParams.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AdvertBadge.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertBadgeBar(advertBadgeBarParamsCreateFromParcel, arrayList, parcel.readInt() != 0 ? Position.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeBar[] newArray(int i12) {
            return new AdvertBadgeBar[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertBadgeBar.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeBar$Position;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "UNDER_GALLERY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Position implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @k
        public static final Parcelable.Creator<Position> CREATOR;

        @c("underGallery")
        public static final Position UNDER_GALLERY = new Position("UNDER_GALLERY", 0);

        /* compiled from: AdvertBadgeBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position createFromParcel(@k Parcel parcel) {
                return Position.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position[] newArray(int i12) {
                return new Position[i12];
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{UNDER_GALLERY};
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = kotlin.enums.c.a(positionArr$values);
            CREATOR = new Creator();
        }

        private Position(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public AdvertBadgeBar(@l AdvertBadgeBarParams advertBadgeBarParams, @l List<AdvertBadge> list, @l Position position) {
        this.view = advertBadgeBarParams;
        this.badges = list;
        this.position = position;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<AdvertBadge> getBadges() {
        return this.badges;
    }

    @l
    public final Position getPosition() {
        return this.position;
    }

    @l
    public final AdvertBadgeBarParams getView() {
        return this.view;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AdvertBadgeBarParams advertBadgeBarParams = this.view;
        if (advertBadgeBarParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertBadgeBarParams.writeToParcel(parcel, flags);
        }
        List<AdvertBadge> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdvertBadge) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Position position = this.position;
        if (position == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            position.writeToParcel(parcel, flags);
        }
    }
}

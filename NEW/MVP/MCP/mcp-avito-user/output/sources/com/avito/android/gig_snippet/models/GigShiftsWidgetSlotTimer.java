package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer;", "Landroid/os/Parcelable;", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer$Direction;", "direction", "<init>", "(Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer$Direction;)V", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer$Direction;", "c", "()Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer$Direction;", "Direction", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlotTimer implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlotTimer> CREATOR = new a();

    @c("direction")
    @k
    private final Direction direction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotTimer$Direction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UntilStart", "AfterStart", "UntilFinished", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        @c("afterStart")
        public static final Direction AfterStart;

        @c("untilFinished")
        public static final Direction UntilFinished;

        @c("untilStart")
        public static final Direction UntilStart;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f161077b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f161078c;

        static {
            Direction direction = new Direction("UntilStart", 0, "untilStart");
            UntilStart = direction;
            Direction direction2 = new Direction("AfterStart", 1, "afterStart");
            AfterStart = direction2;
            Direction direction3 = new Direction("UntilFinished", 2, "untilFinished");
            UntilFinished = direction3;
            Direction[] directionArr = {direction, direction2, direction3};
            f161077b = directionArr;
            f161078c = kotlin.enums.c.a(directionArr);
        }

        private Direction(String str, int i12, String str2) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f161077b.clone();
        }
    }

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlotTimer> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotTimer createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlotTimer(Direction.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotTimer[] newArray(int i12) {
            return new GigShiftsWidgetSlotTimer[i12];
        }
    }

    public GigShiftsWidgetSlotTimer(@k Direction direction) {
        this.direction = direction;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.direction.name());
    }
}

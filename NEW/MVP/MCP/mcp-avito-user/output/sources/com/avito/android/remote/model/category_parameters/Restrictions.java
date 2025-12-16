package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Restrictions.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Restrictions;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/Restrictions$Limit;", "limit", "<init>", "(Lcom/avito/android/remote/model/category_parameters/Restrictions$Limit;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/Restrictions$Limit;", "getLimit", "()Lcom/avito/android/remote/model/category_parameters/Restrictions$Limit;", "Limit", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Restrictions implements Parcelable {

    @k
    public static final Parcelable.Creator<Restrictions> CREATOR = new Creator();

    @c("limit")
    @l
    private final Limit limit;

    /* compiled from: Restrictions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Restrictions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Restrictions createFromParcel(@k Parcel parcel) {
            return new Restrictions(parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Restrictions[] newArray(int i12) {
            return new Restrictions[i12];
        }
    }

    /* compiled from: Restrictions.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Restrictions$Limit;", "Landroid/os/Parcelable;", "", "min", "max", "", "message", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getMin", "()Ljava/lang/Long;", "getMax", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Limit implements Parcelable {

        @k
        public static final Parcelable.Creator<Limit> CREATOR = new Creator();

        @c("max")
        @l
        private final Long max;

        @c("message")
        @l
        private final String message;

        @c("min")
        @l
        private final Long min;

        /* compiled from: Restrictions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Limit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Limit createFromParcel(@k Parcel parcel) {
                return new Limit(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Limit[] newArray(int i12) {
                return new Limit[i12];
            }
        }

        public Limit() {
            this(null, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Long getMax() {
            return this.max;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @l
        public final Long getMin() {
            return this.min;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.min;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.max;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.message);
        }

        public Limit(@l Long l12, @l Long l13, @l String str) {
            this.min = l12;
            this.max = l13;
            this.message = str;
        }

        public /* synthetic */ Limit(Long l12, Long l13, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : l13, (i12 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Restrictions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Limit getLimit() {
        return this.limit;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Limit limit = this.limit;
        if (limit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            limit.writeToParcel(parcel, flags);
        }
    }

    public Restrictions(@l Limit limit) {
        this.limit = limit;
    }

    public /* synthetic */ Restrictions(Limit limit, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : limit);
    }
}

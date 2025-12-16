package com.vk.id.group.subscription.compose.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupSubscriptionSheetStatus.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "Init", "Loaded", "Subscribing", "Failure", "Resubscribing", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Failure;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Init;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Resubscribing;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GroupSubscriptionSheetStatus implements Parcelable {

    /* compiled from: GroupSubscriptionSheetStatus.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Failure;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "<init>", "(Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "getData", "()Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Failure extends GroupSubscriptionSheetStatus {

        @Y61.k
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();

        @Y61.k
        private final GroupSubscriptionSheetStatusData data;

        /* compiled from: GroupSubscriptionSheetStatus.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure(GroupSubscriptionSheetStatusData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@Y61.k GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData) {
            super(null);
            this.data = groupSubscriptionSheetStatusData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && L.f(this.data, ((Failure) other).data);
        }

        @Y61.k
        public final GroupSubscriptionSheetStatusData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @Y61.k
        public String toString() {
            return "Failure(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel dest, int flags) {
            this.data.writeToParcel(dest, flags);
        }
    }

    /* compiled from: GroupSubscriptionSheetStatus.kt */
    @P
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Init;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Init extends GroupSubscriptionSheetStatus {

        @Y61.k
        public static final Init INSTANCE = new Init();

        @Y61.k
        public static final Parcelable.Creator<Init> CREATOR = new Creator();

        /* compiled from: GroupSubscriptionSheetStatus.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Init> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Init createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Init.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Init[] newArray(int i12) {
                return new Init[i12];
            }
        }

        private Init() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Init);
        }

        public int hashCode() {
            return -1098976538;
        }

        @Y61.k
        public String toString() {
            return "Init";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel dest, int flags) {
            dest.writeInt(1);
        }
    }

    /* compiled from: GroupSubscriptionSheetStatus.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "<init>", "(Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "getData", "()Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Loaded extends GroupSubscriptionSheetStatus {

        @Y61.k
        public static final Parcelable.Creator<Loaded> CREATOR = new Creator();

        @Y61.k
        private final GroupSubscriptionSheetStatusData data;

        /* compiled from: GroupSubscriptionSheetStatus.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Loaded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                return new Loaded(GroupSubscriptionSheetStatusData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i12) {
                return new Loaded[i12];
            }
        }

        public Loaded(@Y61.k GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData) {
            super(null);
            this.data = groupSubscriptionSheetStatusData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && L.f(this.data, ((Loaded) other).data);
        }

        @Y61.k
        public final GroupSubscriptionSheetStatusData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @Y61.k
        public String toString() {
            return "Loaded(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel dest, int flags) {
            this.data.writeToParcel(dest, flags);
        }
    }

    /* compiled from: GroupSubscriptionSheetStatus.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Resubscribing;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "<init>", "(Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "getData", "()Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Resubscribing extends GroupSubscriptionSheetStatus {

        @Y61.k
        public static final Parcelable.Creator<Resubscribing> CREATOR = new Creator();

        @Y61.k
        private final GroupSubscriptionSheetStatusData data;

        /* compiled from: GroupSubscriptionSheetStatus.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Resubscribing> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resubscribing createFromParcel(Parcel parcel) {
                return new Resubscribing(GroupSubscriptionSheetStatusData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resubscribing[] newArray(int i12) {
                return new Resubscribing[i12];
            }
        }

        public Resubscribing(@Y61.k GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData) {
            super(null);
            this.data = groupSubscriptionSheetStatusData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resubscribing) && L.f(this.data, ((Resubscribing) other).data);
        }

        @Y61.k
        public final GroupSubscriptionSheetStatusData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @Y61.k
        public String toString() {
            return "Resubscribing(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel dest, int flags) {
            this.data.writeToParcel(dest, flags);
        }
    }

    /* compiled from: GroupSubscriptionSheetStatus.kt */
    @P
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "<init>", "(Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "getData", "()Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Subscribing extends GroupSubscriptionSheetStatus {

        @Y61.k
        public static final Parcelable.Creator<Subscribing> CREATOR = new Creator();

        @Y61.k
        private final GroupSubscriptionSheetStatusData data;

        /* compiled from: GroupSubscriptionSheetStatus.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subscribing> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscribing createFromParcel(Parcel parcel) {
                return new Subscribing(GroupSubscriptionSheetStatusData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Subscribing[] newArray(int i12) {
                return new Subscribing[i12];
            }
        }

        public Subscribing(@Y61.k GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData) {
            super(null);
            this.data = groupSubscriptionSheetStatusData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Subscribing) && L.f(this.data, ((Subscribing) other).data);
        }

        @Y61.k
        public final GroupSubscriptionSheetStatusData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @Y61.k
        public String toString() {
            return "Subscribing(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel dest, int flags) {
            this.data.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ GroupSubscriptionSheetStatus(C42822w c42822w) {
        this();
    }

    private GroupSubscriptionSheetStatus() {
    }
}

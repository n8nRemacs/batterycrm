package com.avito.android.remote.model;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftInfo.kt */
@d
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0003/01B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/GigShiftInfo;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/GigShiftInfo$GigShift;", "shifts", "Lcom/avito/android/remote/model/GigShiftInfo$Seller;", "seller", "", "shiftsDescription", "Lcom/avito/android/remote/model/GigShiftInfo$Action;", "action", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/GigShiftInfo$Seller;Ljava/lang/String;Lcom/avito/android/remote/model/GigShiftInfo$Action;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/GigShiftInfo$Seller;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/avito/android/remote/model/GigShiftInfo$Action;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/GigShiftInfo$Seller;Ljava/lang/String;Lcom/avito/android/remote/model/GigShiftInfo$Action;)Lcom/avito/android/remote/model/GigShiftInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getShifts", "Lcom/avito/android/remote/model/GigShiftInfo$Seller;", "getSeller", "Ljava/lang/String;", "getShiftsDescription", "Lcom/avito/android/remote/model/GigShiftInfo$Action;", "getAction", "Action", "GigShift", "Seller", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigShiftInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftInfo> CREATOR = new Creator();

    @l
    private final Action action;

    @l
    private final Seller seller;

    @l
    private final List<GigShift> shifts;

    @l
    private final String shiftsDescription;

    /* compiled from: GigShiftInfo.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/GigShiftInfo$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/GigShiftInfo$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @l
        private final String title;

        @l
        private final DeepLink uri;

        /* compiled from: GigShiftInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = action.uri;
            }
            return action.copy(str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final Action copy(@l String title, @l DeepLink uri) {
            return new Action(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.title, action.title) && L.f(this.uri, action.uri);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: GigShiftInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigShiftInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftInfo createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(GigShift.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new GigShiftInfo(arrayList, parcel.readInt() == 0 ? null : Seller.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Action.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShiftInfo[] newArray(int i12) {
            return new GigShiftInfo[i12];
        }
    }

    /* compiled from: GigShiftInfo.kt */
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/GigShiftInfo$GigShift;", "Landroid/os/Parcelable;", "", "date", CrashHianalyticsData.TIME, "duration", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/GigShiftInfo$GigShift;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "getTime", "getDuration", "getPrice", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class GigShift implements Parcelable {

        @k
        public static final Parcelable.Creator<GigShift> CREATOR = new Creator();

        @l
        private final String date;

        @l
        private final String duration;

        @l
        private final String price;

        @l
        private final String time;

        /* compiled from: GigShiftInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GigShift> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigShift createFromParcel(@k Parcel parcel) {
                return new GigShift(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GigShift[] newArray(int i12) {
                return new GigShift[i12];
            }
        }

        public GigShift(@l String str, @l String str2, @l String str3, @l String str4) {
            this.date = str;
            this.time = str2;
            this.duration = str3;
            this.price = str4;
        }

        public static /* synthetic */ GigShift copy$default(GigShift gigShift, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = gigShift.date;
            }
            if ((i12 & 2) != 0) {
                str2 = gigShift.time;
            }
            if ((i12 & 4) != 0) {
                str3 = gigShift.duration;
            }
            if ((i12 & 8) != 0) {
                str4 = gigShift.price;
            }
            return gigShift.copy(str, str2, str3, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDuration() {
            return this.duration;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @k
        public final GigShift copy(@l String date, @l String time, @l String duration, @l String price) {
            return new GigShift(date, time, duration, price);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GigShift)) {
                return false;
            }
            GigShift gigShift = (GigShift) other;
            return L.f(this.date, gigShift.date) && L.f(this.time, gigShift.time) && L.f(this.duration, gigShift.duration) && L.f(this.price, gigShift.price);
        }

        @l
        public final String getDate() {
            return this.date;
        }

        @l
        public final String getDuration() {
            return this.duration;
        }

        @l
        public final String getPrice() {
            return this.price;
        }

        @l
        public final String getTime() {
            return this.time;
        }

        public int hashCode() {
            String str = this.date;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.time;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.duration;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.price;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("GigShift(date=");
            sb2.append(this.date);
            sb2.append(", time=");
            sb2.append(this.time);
            sb2.append(", duration=");
            sb2.append(this.duration);
            sb2.append(", price=");
            return C22026a.c(sb2, this.price, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.date);
            parcel.writeString(this.time);
            parcel.writeString(this.duration);
            parcel.writeString(this.price);
        }
    }

    /* compiled from: GigShiftInfo.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/GigShiftInfo$Seller;", "Landroid/os/Parcelable;", "", "name", "location", "Lcom/avito/android/remote/model/Image;", "logo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/GigShiftInfo$Seller;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getLocation", "Lcom/avito/android/remote/model/Image;", "getLogo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Seller implements Parcelable {

        @k
        public static final Parcelable.Creator<Seller> CREATOR = new Creator();

        @l
        private final String location;

        @l
        private final Image logo;

        @l
        private final String name;

        /* compiled from: GigShiftInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Seller> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Seller createFromParcel(@k Parcel parcel) {
                return new Seller(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Seller.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Seller[] newArray(int i12) {
                return new Seller[i12];
            }
        }

        public Seller(@l String str, @l String str2, @l Image image) {
            this.name = str;
            this.location = str2;
            this.logo = image;
        }

        public static /* synthetic */ Seller copy$default(Seller seller, String str, String str2, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = seller.name;
            }
            if ((i12 & 2) != 0) {
                str2 = seller.location;
            }
            if ((i12 & 4) != 0) {
                image = seller.logo;
            }
            return seller.copy(str, str2, image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getLogo() {
            return this.logo;
        }

        @k
        public final Seller copy(@l String name, @l String location, @l Image logo) {
            return new Seller(name, location, logo);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Seller)) {
                return false;
            }
            Seller seller = (Seller) other;
            return L.f(this.name, seller.name) && L.f(this.location, seller.location) && L.f(this.logo, seller.logo);
        }

        @l
        public final String getLocation() {
            return this.location;
        }

        @l
        public final Image getLogo() {
            return this.logo;
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.location;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.logo;
            return iHashCode2 + (image != null ? image.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Seller(name=");
            sb2.append(this.name);
            sb2.append(", location=");
            sb2.append(this.location);
            sb2.append(", logo=");
            return c.o(sb2, this.logo, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.location);
            parcel.writeParcelable(this.logo, flags);
        }
    }

    public GigShiftInfo(@l List<GigShift> list, @l Seller seller, @l String str, @l Action action) {
        this.shifts = list;
        this.seller = seller;
        this.shiftsDescription = str;
        this.action = action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GigShiftInfo copy$default(GigShiftInfo gigShiftInfo, List list, Seller seller, String str, Action action, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = gigShiftInfo.shifts;
        }
        if ((i12 & 2) != 0) {
            seller = gigShiftInfo.seller;
        }
        if ((i12 & 4) != 0) {
            str = gigShiftInfo.shiftsDescription;
        }
        if ((i12 & 8) != 0) {
            action = gigShiftInfo.action;
        }
        return gigShiftInfo.copy(list, seller, str, action);
    }

    @l
    public final List<GigShift> component1() {
        return this.shifts;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Seller getSeller() {
        return this.seller;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getShiftsDescription() {
        return this.shiftsDescription;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    public final GigShiftInfo copy(@l List<GigShift> shifts, @l Seller seller, @l String shiftsDescription, @l Action action) {
        return new GigShiftInfo(shifts, seller, shiftsDescription, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigShiftInfo)) {
            return false;
        }
        GigShiftInfo gigShiftInfo = (GigShiftInfo) other;
        return L.f(this.shifts, gigShiftInfo.shifts) && L.f(this.seller, gigShiftInfo.seller) && L.f(this.shiftsDescription, gigShiftInfo.shiftsDescription) && L.f(this.action, gigShiftInfo.action);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final Seller getSeller() {
        return this.seller;
    }

    @l
    public final List<GigShift> getShifts() {
        return this.shifts;
    }

    @l
    public final String getShiftsDescription() {
        return this.shiftsDescription;
    }

    public int hashCode() {
        List<GigShift> list = this.shifts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Seller seller = this.seller;
        int iHashCode2 = (iHashCode + (seller == null ? 0 : seller.hashCode())) * 31;
        String str = this.shiftsDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.action;
        return iHashCode3 + (action != null ? action.hashCode() : 0);
    }

    @k
    public String toString() {
        return "GigShiftInfo(shifts=" + this.shifts + ", seller=" + this.seller + ", shiftsDescription=" + this.shiftsDescription + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<GigShift> list = this.shifts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((GigShift) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Seller seller = this.seller;
        if (seller == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seller.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.shiftsDescription);
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
    }
}

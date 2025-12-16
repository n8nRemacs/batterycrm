package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetDevelopmentTooltipInfo.kt */
@P
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003@ABBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJp\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010\u0019R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010 R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b?\u0010\u001c¨\u0006C"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo;", "Landroid/os/Parcelable;", "", "developmentId", "", "isKeyVisible", "", "title", "subtitle", "", "Lcom/avito/android/remote/model/Image;", "images", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;", "completionDate", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;", "haveCompleted", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$TableItem;", "table", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;Ljava/util/List;)V", "component1", "()J", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;", "component7", "()Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;", "component8", "copy", "(JZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getDevelopmentId", "Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getImages", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;", "getCompletionDate", "Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;", "getHaveCompleted", "getTable", "CompletionDate", "HaveCompleted", "TableItem", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetDevelopmentTooltipInfo implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetDevelopmentTooltipInfo> CREATOR = new a();

    @c("completionDate")
    @k
    private final CompletionDate completionDate;

    @c("developmentId")
    private final long developmentId;

    @c("haveCompleted")
    @l
    private final HaveCompleted haveCompleted;

    @c("images")
    @l
    private final List<Image> images;

    @c("isKeyVisible")
    private final boolean isKeyVisible;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("table")
    @k
    private final List<TableItem> table;

    @c("title")
    @k
    private final String title;

    /* compiled from: GetDevelopmentTooltipInfo.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;", "Landroid/os/Parcelable;", "", "value", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$CompletionDate;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getColor", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CompletionDate implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<CompletionDate> CREATOR = new a();

        @c("color")
        @k
        private final String color;

        @c("value")
        @k
        private final String value;

        /* compiled from: GetDevelopmentTooltipInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CompletionDate> {
            @Override // android.os.Parcelable.Creator
            public final CompletionDate createFromParcel(Parcel parcel) {
                return new CompletionDate(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CompletionDate[] newArray(int i12) {
                return new CompletionDate[i12];
            }
        }

        public CompletionDate(@k String str, @k String str2) {
            this.value = str;
            this.color = str2;
        }

        public static /* synthetic */ CompletionDate copy$default(CompletionDate completionDate, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = completionDate.value;
            }
            if ((i12 & 2) != 0) {
                str2 = completionDate.color;
            }
            return completionDate.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final CompletionDate copy(@k String value, @k String color) {
            return new CompletionDate(value, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompletionDate)) {
                return false;
            }
            CompletionDate completionDate = (CompletionDate) other;
            return L.f(this.value, completionDate.value) && L.f(this.color, completionDate.color);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.value.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CompletionDate(value=");
            sb2.append(this.value);
            sb2.append(", color=");
            return C22026a.c(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.value);
            parcel.writeString(this.color);
        }
    }

    /* compiled from: GetDevelopmentTooltipInfo.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;", "Landroid/os/Parcelable;", "", "value", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$HaveCompleted;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getColor", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class HaveCompleted implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<HaveCompleted> CREATOR = new a();

        @c("color")
        @k
        private final String color;

        @c("value")
        @k
        private final String value;

        /* compiled from: GetDevelopmentTooltipInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HaveCompleted> {
            @Override // android.os.Parcelable.Creator
            public final HaveCompleted createFromParcel(Parcel parcel) {
                return new HaveCompleted(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HaveCompleted[] newArray(int i12) {
                return new HaveCompleted[i12];
            }
        }

        public HaveCompleted(@k String str, @k String str2) {
            this.value = str;
            this.color = str2;
        }

        public static /* synthetic */ HaveCompleted copy$default(HaveCompleted haveCompleted, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = haveCompleted.value;
            }
            if ((i12 & 2) != 0) {
                str2 = haveCompleted.color;
            }
            return haveCompleted.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final HaveCompleted copy(@k String value, @k String color) {
            return new HaveCompleted(value, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HaveCompleted)) {
                return false;
            }
            HaveCompleted haveCompleted = (HaveCompleted) other;
            return L.f(this.value, haveCompleted.value) && L.f(this.color, haveCompleted.color);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.value.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HaveCompleted(value=");
            sb2.append(this.value);
            sb2.append(", color=");
            return C22026a.c(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.value);
            parcel.writeString(this.color);
        }
    }

    /* compiled from: GetDevelopmentTooltipInfo.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$TableItem;", "Landroid/os/Parcelable;", "", "roomType", "quantity", "price", "Lcom/avito/android/deep_linking/links/DeepLink;", SingleLineInputModel.STYLE_SEARCH, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/developments_agency_search/domain/GetDevelopmentTooltipInfo$TableItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRoomType", "getQuantity", "getPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", "getSearch", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TableItem implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<TableItem> CREATOR = new a();

        @c("price")
        @k
        private final String price;

        @c("quantity")
        @k
        private final String quantity;

        @c("roomType")
        @k
        private final String roomType;

        @c(SingleLineInputModel.STYLE_SEARCH)
        @k
        private final DeepLink search;

        /* compiled from: GetDevelopmentTooltipInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TableItem> {
            @Override // android.os.Parcelable.Creator
            public final TableItem createFromParcel(Parcel parcel) {
                return new TableItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(TableItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TableItem[] newArray(int i12) {
                return new TableItem[i12];
            }
        }

        public TableItem(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
            this.roomType = str;
            this.quantity = str2;
            this.price = str3;
            this.search = deepLink;
        }

        public static /* synthetic */ TableItem copy$default(TableItem tableItem, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tableItem.roomType;
            }
            if ((i12 & 2) != 0) {
                str2 = tableItem.quantity;
            }
            if ((i12 & 4) != 0) {
                str3 = tableItem.price;
            }
            if ((i12 & 8) != 0) {
                deepLink = tableItem.search;
            }
            return tableItem.copy(str, str2, str3, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getRoomType() {
            return this.roomType;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DeepLink getSearch() {
            return this.search;
        }

        @k
        public final TableItem copy(@k String roomType, @k String quantity, @k String price, @k DeepLink search) {
            return new TableItem(roomType, quantity, price, search);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TableItem)) {
                return false;
            }
            TableItem tableItem = (TableItem) other;
            return L.f(this.roomType, tableItem.roomType) && L.f(this.quantity, tableItem.quantity) && L.f(this.price, tableItem.price) && L.f(this.search, tableItem.search);
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @k
        public final String getQuantity() {
            return this.quantity;
        }

        @k
        public final String getRoomType() {
            return this.roomType;
        }

        @k
        public final DeepLink getSearch() {
            return this.search;
        }

        public int hashCode() {
            return this.search.hashCode() + H.d(H.d(this.roomType.hashCode() * 31, 31, this.quantity), 31, this.price);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TableItem(roomType=");
            sb2.append(this.roomType);
            sb2.append(", quantity=");
            sb2.append(this.quantity);
            sb2.append(", price=");
            sb2.append(this.price);
            sb2.append(", search=");
            return com.avito.android.actions_sheet.a.v(sb2, this.search, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.roomType);
            parcel.writeString(this.quantity);
            parcel.writeString(this.price);
            parcel.writeParcelable(this.search, flags);
        }
    }

    /* compiled from: GetDevelopmentTooltipInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetDevelopmentTooltipInfo> {
        @Override // android.os.Parcelable.Creator
        public final GetDevelopmentTooltipInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(GetDevelopmentTooltipInfo.class, parcel, arrayList, iL2, 1);
                }
            }
            CompletionDate completionDateCreateFromParcel = CompletionDate.CREATOR.createFromParcel(parcel);
            HaveCompleted haveCompletedCreateFromParcel = parcel.readInt() != 0 ? HaveCompleted.CREATOR.createFromParcel(parcel) : null;
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(TableItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new GetDevelopmentTooltipInfo(j12, z12, string, string2, arrayList, completionDateCreateFromParcel, haveCompletedCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GetDevelopmentTooltipInfo[] newArray(int i12) {
            return new GetDevelopmentTooltipInfo[i12];
        }
    }

    public GetDevelopmentTooltipInfo(long j12, boolean z12, @k String str, @k String str2, @l List<Image> list, @k CompletionDate completionDate, @l HaveCompleted haveCompleted, @k List<TableItem> list2) {
        this.developmentId = j12;
        this.isKeyVisible = z12;
        this.title = str;
        this.subtitle = str2;
        this.images = list;
        this.completionDate = completionDate;
        this.haveCompleted = haveCompleted;
        this.table = list2;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDevelopmentId() {
        return this.developmentId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsKeyVisible() {
        return this.isKeyVisible;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final List<Image> component5() {
        return this.images;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final CompletionDate getCompletionDate() {
        return this.completionDate;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final HaveCompleted getHaveCompleted() {
        return this.haveCompleted;
    }

    @k
    public final List<TableItem> component8() {
        return this.table;
    }

    @k
    public final GetDevelopmentTooltipInfo copy(long developmentId, boolean isKeyVisible, @k String title, @k String subtitle, @l List<Image> images, @k CompletionDate completionDate, @l HaveCompleted haveCompleted, @k List<TableItem> table) {
        return new GetDevelopmentTooltipInfo(developmentId, isKeyVisible, title, subtitle, images, completionDate, haveCompleted, table);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDevelopmentTooltipInfo)) {
            return false;
        }
        GetDevelopmentTooltipInfo getDevelopmentTooltipInfo = (GetDevelopmentTooltipInfo) other;
        return this.developmentId == getDevelopmentTooltipInfo.developmentId && this.isKeyVisible == getDevelopmentTooltipInfo.isKeyVisible && L.f(this.title, getDevelopmentTooltipInfo.title) && L.f(this.subtitle, getDevelopmentTooltipInfo.subtitle) && L.f(this.images, getDevelopmentTooltipInfo.images) && L.f(this.completionDate, getDevelopmentTooltipInfo.completionDate) && L.f(this.haveCompleted, getDevelopmentTooltipInfo.haveCompleted) && L.f(this.table, getDevelopmentTooltipInfo.table);
    }

    @k
    public final CompletionDate getCompletionDate() {
        return this.completionDate;
    }

    public final long getDevelopmentId() {
        return this.developmentId;
    }

    @l
    public final HaveCompleted getHaveCompleted() {
        return this.haveCompleted;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final List<TableItem> getTable() {
        return this.table;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(r.i(Long.hashCode(this.developmentId) * 31, 31, this.isKeyVisible), 31, this.title), 31, this.subtitle);
        List<Image> list = this.images;
        int iHashCode = (this.completionDate.hashCode() + ((iD2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        HaveCompleted haveCompleted = this.haveCompleted;
        return this.table.hashCode() + ((iHashCode + (haveCompleted != null ? haveCompleted.hashCode() : 0)) * 31);
    }

    public final boolean isKeyVisible() {
        return this.isKeyVisible;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GetDevelopmentTooltipInfo(developmentId=");
        sb2.append(this.developmentId);
        sb2.append(", isKeyVisible=");
        sb2.append(this.isKeyVisible);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", completionDate=");
        sb2.append(this.completionDate);
        sb2.append(", haveCompleted=");
        sb2.append(this.haveCompleted);
        sb2.append(", table=");
        return H.p(sb2, this.table, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.developmentId);
        parcel.writeInt(this.isKeyVisible ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        this.completionDate.writeToParcel(parcel, flags);
        HaveCompleted haveCompleted = this.haveCompleted;
        if (haveCompleted == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            haveCompleted.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.table, parcel);
        while (itJ.hasNext()) {
            ((TableItem) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}

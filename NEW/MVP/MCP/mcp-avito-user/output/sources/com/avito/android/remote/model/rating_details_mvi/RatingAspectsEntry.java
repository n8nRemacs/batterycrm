package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u000223B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0016¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "paramName", "", "selectedOption", "analyticsParamName", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Aspect;", "options", "Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;)Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getParamName", "Ljava/lang/Long;", "getSelectedOption", "getAnalyticsParamName", "Ljava/util/List;", "getOptions", "Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;", "getTooltip", "Aspect", "Tooltip", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RatingAspectsEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<RatingAspectsEntry> CREATOR = new Creator();

    @c("analyticsParamName")
    @l
    private final String analyticsParamName;

    @c("options")
    @k
    private final List<Aspect> options;

    @c("paramName")
    @k
    private final String paramName;

    @c("selectedOption")
    @l
    private final Long selectedOption;

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final Tooltip tooltip;

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Aspect;", "Landroid/os/Parcelable;", "", "title", "description", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Aspect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "J", "getValue", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Aspect implements Parcelable {

        @k
        public static final Parcelable.Creator<Aspect> CREATOR = new Creator();

        @c("description")
        @l
        private final String description;

        @c("title")
        @k
        private final String title;

        @c("value")
        private final long value;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Aspect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Aspect createFromParcel(@k Parcel parcel) {
                return new Aspect(parcel.readString(), parcel.readString(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Aspect[] newArray(int i12) {
                return new Aspect[i12];
            }
        }

        public Aspect(@k String str, @l String str2, long j12) {
            this.title = str;
            this.description = str2;
            this.value = j12;
        }

        public static /* synthetic */ Aspect copy$default(Aspect aspect, String str, String str2, long j12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = aspect.title;
            }
            if ((i12 & 2) != 0) {
                str2 = aspect.description;
            }
            if ((i12 & 4) != 0) {
                j12 = aspect.value;
            }
            return aspect.copy(str, str2, j12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        @k
        public final Aspect copy(@k String title, @l String description, long value) {
            return new Aspect(title, description, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Aspect)) {
                return false;
            }
            Aspect aspect = (Aspect) other;
            return L.f(this.title, aspect.title) && L.f(this.description, aspect.description) && this.value == aspect.value;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            return Long.hashCode(this.value) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Aspect(title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", value=");
            return r.u(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeLong(this.value);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingAspectsEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingAspectsEntry createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Aspect.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RatingAspectsEntry(string, lValueOf, string2, arrayList, parcel.readInt() != 0 ? Tooltip.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingAspectsEntry[] newArray(int i12) {
            return new RatingAspectsEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b%\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;", "Landroid/os/Parcelable;", "", "text", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip$Action;", "actions", "storageKey", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getActions", "getStorageKey", "Action", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Tooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();

        @c("actions")
        @l
        private final List<Action> actions;

        @c("storageKey")
        @k
        private final String storageKey;

        @c("text")
        @k
        private final String text;

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip$Action;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/RatingAspectsEntry$Tooltip$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @k
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @c("text")
            @k
            private final String text;

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action createFromParcel(@k Parcel parcel) {
                    return new Action(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public Action(@k String str) {
                this.text = str;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = action.text;
                }
                return action.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            public final Action copy(@k String text) {
                return new Action(text);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Action) && L.f(this.text, ((Action) other).text);
            }

            @k
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Action(text="), this.text, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Action.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Tooltip(string, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@k String str, @l List<Action> list, @k String str2) {
            this.text = str;
            this.actions = list;
            this.storageKey = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, String str, List list, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tooltip.text;
            }
            if ((i12 & 2) != 0) {
                list = tooltip.actions;
            }
            if ((i12 & 4) != 0) {
                str2 = tooltip.storageKey;
            }
            return tooltip.copy(str, list, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        public final List<Action> component2() {
            return this.actions;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getStorageKey() {
            return this.storageKey;
        }

        @k
        public final Tooltip copy(@k String text, @l List<Action> actions, @k String storageKey) {
            return new Tooltip(text, actions, storageKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return L.f(this.text, tooltip.text) && L.f(this.actions, tooltip.actions) && L.f(this.storageKey, tooltip.storageKey);
        }

        @l
        public final List<Action> getActions() {
            return this.actions;
        }

        @k
        public final String getStorageKey() {
            return this.storageKey;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            List<Action> list = this.actions;
            return this.storageKey.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(text=");
            sb2.append(this.text);
            sb2.append(", actions=");
            sb2.append(this.actions);
            sb2.append(", storageKey=");
            return C22026a.c(sb2, this.storageKey, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            List<Action> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Action) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeString(this.storageKey);
        }
    }

    public RatingAspectsEntry(@k String str, @l Long l12, @l String str2, @k List<Aspect> list, @l Tooltip tooltip) {
        this.paramName = str;
        this.selectedOption = l12;
        this.analyticsParamName = str2;
        this.options = list;
        this.tooltip = tooltip;
    }

    public static /* synthetic */ RatingAspectsEntry copy$default(RatingAspectsEntry ratingAspectsEntry, String str, Long l12, String str2, List list, Tooltip tooltip, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = ratingAspectsEntry.paramName;
        }
        if ((i12 & 2) != 0) {
            l12 = ratingAspectsEntry.selectedOption;
        }
        Long l13 = l12;
        if ((i12 & 4) != 0) {
            str2 = ratingAspectsEntry.analyticsParamName;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            list = ratingAspectsEntry.options;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            tooltip = ratingAspectsEntry.tooltip;
        }
        return ratingAspectsEntry.copy(str, l13, str3, list2, tooltip);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getParamName() {
        return this.paramName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Long getSelectedOption() {
        return this.selectedOption;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAnalyticsParamName() {
        return this.analyticsParamName;
    }

    @k
    public final List<Aspect> component4() {
        return this.options;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @k
    public final RatingAspectsEntry copy(@k String paramName, @l Long selectedOption, @l String analyticsParamName, @k List<Aspect> options, @l Tooltip tooltip) {
        return new RatingAspectsEntry(paramName, selectedOption, analyticsParamName, options, tooltip);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingAspectsEntry)) {
            return false;
        }
        RatingAspectsEntry ratingAspectsEntry = (RatingAspectsEntry) other;
        return L.f(this.paramName, ratingAspectsEntry.paramName) && L.f(this.selectedOption, ratingAspectsEntry.selectedOption) && L.f(this.analyticsParamName, ratingAspectsEntry.analyticsParamName) && L.f(this.options, ratingAspectsEntry.options) && L.f(this.tooltip, ratingAspectsEntry.tooltip);
    }

    @l
    public final String getAnalyticsParamName() {
        return this.analyticsParamName;
    }

    @k
    public final List<Aspect> getOptions() {
        return this.options;
    }

    @k
    public final String getParamName() {
        return this.paramName;
    }

    @l
    public final Long getSelectedOption() {
        return this.selectedOption;
    }

    @l
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int iHashCode = this.paramName.hashCode() * 31;
        Long l12 = this.selectedOption;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.analyticsParamName;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
        Tooltip tooltip = this.tooltip;
        return iE2 + (tooltip != null ? tooltip.hashCode() : 0);
    }

    @k
    public String toString() {
        return "RatingAspectsEntry(paramName=" + this.paramName + ", selectedOption=" + this.selectedOption + ", analyticsParamName=" + this.analyticsParamName + ", options=" + this.options + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.paramName);
        Long l12 = this.selectedOption;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.analyticsParamName);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Aspect) itJ.next()).writeToParcel(parcel, flags);
        }
        Tooltip tooltip = this.tooltip;
        if (tooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltip.writeToParcel(parcel, flags);
        }
    }
}

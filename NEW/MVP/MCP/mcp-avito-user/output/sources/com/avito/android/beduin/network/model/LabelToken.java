package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.storeParameters.StorageType;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LabelToken.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH¦\u0002J\b\u0010\u000b\u001a\u00020\fH&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken;", "Landroid/os/Parcelable;", "()V", "overridenAttributes", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "DateTimeToken", "DockingBadgeToken", "IconToken", "LinkToken", "SalesStrikeThroughToken", "SpacingToken", "StorageTextToken", "TextIconToken", "TextToken", "Lcom/avito/android/beduin/network/model/LabelToken$DateTimeToken;", "Lcom/avito/android/beduin/network/model/LabelToken$DockingBadgeToken;", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken;", "Lcom/avito/android/beduin/network/model/LabelToken$LinkToken;", "Lcom/avito/android/beduin/network/model/LabelToken$SalesStrikeThroughToken;", "Lcom/avito/android/beduin/network/model/LabelToken$SpacingToken;", "Lcom/avito/android/beduin/network/model/LabelToken$StorageTextToken;", "Lcom/avito/android/beduin/network/model/LabelToken$TextIconToken;", "Lcom/avito/android/beduin/network/model/LabelToken$TextToken;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class LabelToken implements Parcelable {

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$DateTimeToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "timestamp", "", "format", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$DateTimeToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getTimestamp", "Ljava/lang/String;", "getFormat", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DateTimeToken extends LabelToken {

        @k
        public static final Parcelable.Creator<DateTimeToken> CREATOR = new a();

        @l
        private final String format;

        @l
        private final LabelTextAttributes overridenAttributes;

        @l
        private final Long timestamp;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DateTimeToken> {
            @Override // android.os.Parcelable.Creator
            public final DateTimeToken createFromParcel(Parcel parcel) {
                return new DateTimeToken(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? LabelTextAttributes.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final DateTimeToken[] newArray(int i12) {
                return new DateTimeToken[i12];
            }
        }

        public DateTimeToken(@l Long l12, @l String str, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.timestamp = l12;
            this.format = str;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ DateTimeToken copy$default(DateTimeToken dateTimeToken, Long l12, String str, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = dateTimeToken.timestamp;
            }
            if ((i12 & 2) != 0) {
                str = dateTimeToken.format;
            }
            if ((i12 & 4) != 0) {
                labelTextAttributes = dateTimeToken.overridenAttributes;
            }
            return dateTimeToken.copy(l12, str, labelTextAttributes);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final DateTimeToken copy(@l Long timestamp, @l String format, @l LabelTextAttributes overridenAttributes) {
            return new DateTimeToken(timestamp, format, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeToken)) {
                return false;
            }
            DateTimeToken dateTimeToken = (DateTimeToken) other;
            return L.f(this.timestamp, dateTimeToken.timestamp) && L.f(this.format, dateTimeToken.format) && L.f(this.overridenAttributes, dateTimeToken.overridenAttributes);
        }

        @l
        public final String getFormat() {
            return this.format;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @l
        public final Long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            Long l12 = this.timestamp;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.format;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode2 + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "DateTimeToken(timestamp=" + this.timestamp + ", format=" + this.format + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.timestamp;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.format);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001?BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJf\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\u001f¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$DockingBadgeToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "badgeColor", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "startEdgeType", "endEdgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "", "offsetFromCenter", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;ILcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "component5", "component6", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "component7", "()I", "component8", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;ILcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$DockingBadgeToken;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBadgeColor", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "getStartEdgeType", "getEndEdgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "getSize", "I", "getOffsetFromCenter", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DockingBadgeToken extends LabelToken {

        @k
        private final UniversalColor badgeColor;

        @l
        private final DockingBadgeEdgeType endEdgeType;
        private final int offsetFromCenter;

        @l
        private final LabelTextAttributes overridenAttributes;

        @l
        private final DockingBadgeSize size;

        @k
        private final DockingBadgeEdgeType startEdgeType;

        @k
        private final UniversalColor textColor;

        @k
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        @k
        public static final Parcelable.Creator<DockingBadgeToken> CREATOR = new b();

        @k
        private static final DockingBadgeSize DEFAULT_SIZE = DockingBadgeSize.SMALL;

        /* compiled from: LabelToken.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$DockingBadgeToken$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.network.model.LabelToken$DockingBadgeToken$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            public Companion() {
            }
        }

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<DockingBadgeToken> {
            @Override // android.os.Parcelable.Creator
            public final DockingBadgeToken createFromParcel(Parcel parcel) {
                return new DockingBadgeToken(parcel.readString(), (UniversalColor) parcel.readParcelable(DockingBadgeToken.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DockingBadgeToken.class.getClassLoader()), DockingBadgeEdgeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingBadgeSize.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0 ? LabelTextAttributes.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final DockingBadgeToken[] newArray(int i12) {
                return new DockingBadgeToken[i12];
            }
        }

        public /* synthetic */ DockingBadgeToken(String str, UniversalColor universalColor, UniversalColor universalColor2, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, DockingBadgeSize dockingBadgeSize, int i12, LabelTextAttributes labelTextAttributes, int i13, C42822w c42822w) {
            this(str, universalColor, universalColor2, dockingBadgeEdgeType, dockingBadgeEdgeType2, dockingBadgeSize, (i13 & 64) != 0 ? 0 : i12, labelTextAttributes);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getBadgeColor() {
            return this.badgeColor;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DockingBadgeEdgeType getStartEdgeType() {
            return this.startEdgeType;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DockingBadgeEdgeType getEndEdgeType() {
            return this.endEdgeType;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final DockingBadgeSize getSize() {
            return this.size;
        }

        /* renamed from: component7, reason: from getter */
        public final int getOffsetFromCenter() {
            return this.offsetFromCenter;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final DockingBadgeToken copy(@k String title, @k UniversalColor textColor, @k UniversalColor badgeColor, @k DockingBadgeEdgeType startEdgeType, @l DockingBadgeEdgeType endEdgeType, @l DockingBadgeSize size, int offsetFromCenter, @l LabelTextAttributes overridenAttributes) {
            return new DockingBadgeToken(title, textColor, badgeColor, startEdgeType, endEdgeType, size, offsetFromCenter, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DockingBadgeToken)) {
                return false;
            }
            DockingBadgeToken dockingBadgeToken = (DockingBadgeToken) other;
            return L.f(this.title, dockingBadgeToken.title) && L.f(this.textColor, dockingBadgeToken.textColor) && L.f(this.badgeColor, dockingBadgeToken.badgeColor) && this.startEdgeType == dockingBadgeToken.startEdgeType && this.endEdgeType == dockingBadgeToken.endEdgeType && this.size == dockingBadgeToken.size && this.offsetFromCenter == dockingBadgeToken.offsetFromCenter && L.f(this.overridenAttributes, dockingBadgeToken.overridenAttributes);
        }

        @k
        public final UniversalColor getBadgeColor() {
            return this.badgeColor;
        }

        @l
        public final DockingBadgeEdgeType getEndEdgeType() {
            return this.endEdgeType;
        }

        public final int getOffsetFromCenter() {
            return this.offsetFromCenter;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @l
        public final DockingBadgeSize getSize() {
            return this.size;
        }

        @k
        public final DockingBadgeEdgeType getStartEdgeType() {
            return this.startEdgeType;
        }

        @k
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            int iHashCode = (this.startEdgeType.hashCode() + a.i(this.badgeColor, a.i(this.textColor, this.title.hashCode() * 31, 31), 31)) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType = this.endEdgeType;
            int iHashCode2 = (iHashCode + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31;
            DockingBadgeSize dockingBadgeSize = this.size;
            int iE2 = r.e(this.offsetFromCenter, (iHashCode2 + (dockingBadgeSize == null ? 0 : dockingBadgeSize.hashCode())) * 31, 31);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iE2 + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "DockingBadgeToken(title=" + this.title + ", textColor=" + this.textColor + ", badgeColor=" + this.badgeColor + ", startEdgeType=" + this.startEdgeType + ", endEdgeType=" + this.endEdgeType + ", size=" + this.size + ", offsetFromCenter=" + this.offsetFromCenter + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.badgeColor, flags);
            parcel.writeString(this.startEdgeType.name());
            DockingBadgeEdgeType dockingBadgeEdgeType = this.endEdgeType;
            if (dockingBadgeEdgeType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dockingBadgeEdgeType.name());
            }
            DockingBadgeSize dockingBadgeSize = this.size;
            if (dockingBadgeSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(dockingBadgeSize.name());
            }
            parcel.writeInt(this.offsetFromCenter);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }

        public DockingBadgeToken(@k String str, @k UniversalColor universalColor, @k UniversalColor universalColor2, @k DockingBadgeEdgeType dockingBadgeEdgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType2, @l DockingBadgeSize dockingBadgeSize, int i12, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.title = str;
            this.textColor = universalColor;
            this.badgeColor = universalColor2;
            this.startEdgeType = dockingBadgeEdgeType;
            this.endEdgeType = dockingBadgeEdgeType2;
            this.size = dockingBadgeSize;
            this.offsetFromCenter = i12;
            this.overridenAttributes = labelTextAttributes;
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u000212B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0010R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0014¨\u00063"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$IconToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;", "alignment", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;Ljava/util/List;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "()Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;Ljava/util/List;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$IconToken;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;", "getAlignment", "Ljava/util/List;", "getOnTapActions", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "Alignment", "IconAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class IconToken extends LabelToken {

        @k
        public static final Parcelable.Creator<IconToken> CREATOR = new a();

        @l
        private final IconAlignment alignment;

        @k
        private final LocalIcon localIcon;

        @l
        private final List<BeduinAction> onTapActions;

        @l
        private final LabelTextAttributes overridenAttributes;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LabelToken.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;", "", "(Ljava/lang/String;I)V", "TOP", "BASELINE", "CENTER", "BOTTOM", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Alignment {

            @c("baseline")
            public static final Alignment BASELINE;

            @c("bottom")
            public static final Alignment BOTTOM;

            @c("center")
            public static final Alignment CENTER;

            @c("top")
            public static final Alignment TOP;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Alignment[] f104014b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f104015c;

            static {
                Alignment alignment = new Alignment("TOP", 0);
                TOP = alignment;
                Alignment alignment2 = new Alignment("BASELINE", 1);
                BASELINE = alignment2;
                Alignment alignment3 = new Alignment("CENTER", 2);
                CENTER = alignment3;
                Alignment alignment4 = new Alignment("BOTTOM", 3);
                BOTTOM = alignment4;
                Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4};
                f104014b = alignmentArr;
                f104015c = kotlin.enums.c.a(alignmentArr);
            }

            private Alignment(String str, int i12) {
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) f104014b.clone();
            }
        }

        /* compiled from: LabelToken.kt */
        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;", "type", "", "offset", "<init>", "(Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;Ljava/lang/Integer;)Lcom/avito/android/beduin/network/model/LabelToken$IconToken$IconAlignment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken$Alignment;", "getType", "Ljava/lang/Integer;", "getOffset", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class IconAlignment implements Parcelable {

            @k
            public static final Parcelable.Creator<IconAlignment> CREATOR = new a();

            @l
            private final Integer offset;

            @l
            private final Alignment type;

            /* compiled from: LabelToken.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<IconAlignment> {
                @Override // android.os.Parcelable.Creator
                public final IconAlignment createFromParcel(Parcel parcel) {
                    return new IconAlignment(parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final IconAlignment[] newArray(int i12) {
                    return new IconAlignment[i12];
                }
            }

            public IconAlignment(@l Alignment alignment, @l Integer num) {
                this.type = alignment;
                this.offset = num;
            }

            public static /* synthetic */ IconAlignment copy$default(IconAlignment iconAlignment, Alignment alignment, Integer num, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    alignment = iconAlignment.type;
                }
                if ((i12 & 2) != 0) {
                    num = iconAlignment.offset;
                }
                return iconAlignment.copy(alignment, num);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Alignment getType() {
                return this.type;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Integer getOffset() {
                return this.offset;
            }

            @k
            public final IconAlignment copy(@l Alignment type, @l Integer offset) {
                return new IconAlignment(type, offset);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconAlignment)) {
                    return false;
                }
                IconAlignment iconAlignment = (IconAlignment) other;
                return this.type == iconAlignment.type && L.f(this.offset, iconAlignment.offset);
            }

            @l
            public final Integer getOffset() {
                return this.offset;
            }

            @l
            public final Alignment getType() {
                return this.type;
            }

            public int hashCode() {
                Alignment alignment = this.type;
                int iHashCode = (alignment == null ? 0 : alignment.hashCode()) * 31;
                Integer num = this.offset;
                return iHashCode + (num != null ? num.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("IconAlignment(type=");
                sb2.append(this.type);
                sb2.append(", offset=");
                return s.j(sb2, this.offset, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Alignment alignment = this.type;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
                Integer num = this.offset;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }
        }

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IconToken> {
            @Override // android.os.Parcelable.Creator
            public final IconToken createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                LocalIcon localIconCreateFromParcel = LocalIcon.CREATOR.createFromParcel(parcel);
                IconAlignment iconAlignmentCreateFromParcel = parcel.readInt() == 0 ? null : IconAlignment.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(IconToken.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new IconToken(localIconCreateFromParcel, iconAlignmentCreateFromParcel, arrayList, parcel.readInt() != 0 ? LabelTextAttributes.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final IconToken[] newArray(int i12) {
                return new IconToken[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IconToken(@k LocalIcon localIcon, @l IconAlignment iconAlignment, @l List<? extends BeduinAction> list, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.localIcon = localIcon;
            this.alignment = iconAlignment;
            this.onTapActions = list;
            this.overridenAttributes = labelTextAttributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconToken copy$default(IconToken iconToken, LocalIcon localIcon, IconAlignment iconAlignment, List list, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                localIcon = iconToken.localIcon;
            }
            if ((i12 & 2) != 0) {
                iconAlignment = iconToken.alignment;
            }
            if ((i12 & 4) != 0) {
                list = iconToken.onTapActions;
            }
            if ((i12 & 8) != 0) {
                labelTextAttributes = iconToken.overridenAttributes;
            }
            return iconToken.copy(localIcon, iconAlignment, list, labelTextAttributes);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final IconAlignment getAlignment() {
            return this.alignment;
        }

        @l
        public final List<BeduinAction> component3() {
            return this.onTapActions;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final IconToken copy(@k LocalIcon localIcon, @l IconAlignment alignment, @l List<? extends BeduinAction> onTapActions, @l LabelTextAttributes overridenAttributes) {
            return new IconToken(localIcon, alignment, onTapActions, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconToken)) {
                return false;
            }
            IconToken iconToken = (IconToken) other;
            return L.f(this.localIcon, iconToken.localIcon) && L.f(this.alignment, iconToken.alignment) && L.f(this.onTapActions, iconToken.onTapActions) && L.f(this.overridenAttributes, iconToken.overridenAttributes);
        }

        @l
        public final IconAlignment getAlignment() {
            return this.alignment;
        }

        @k
        public final LocalIcon getLocalIcon() {
            return this.localIcon;
        }

        @l
        public final List<BeduinAction> getOnTapActions() {
            return this.onTapActions;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            int iHashCode = this.localIcon.hashCode() * 31;
            IconAlignment iconAlignment = this.alignment;
            int iHashCode2 = (iHashCode + (iconAlignment == null ? 0 : iconAlignment.hashCode())) * 31;
            List<BeduinAction> list = this.onTapActions;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode3 + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "IconToken(localIcon=" + this.localIcon + ", alignment=" + this.alignment + ", onTapActions=" + this.onTapActions + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.localIcon.writeToParcel(parcel, flags);
            IconAlignment iconAlignment = this.alignment;
            if (iconAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iconAlignment.writeToParcel(parcel, flags);
            }
            List<BeduinAction> list = this.onTapActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$LinkToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$LinkToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOnTapActions", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LinkToken extends LabelToken {

        @k
        public static final Parcelable.Creator<LinkToken> CREATOR = new a();

        @k
        private final List<BeduinAction> onTapActions;

        @l
        private final LabelTextAttributes overridenAttributes;

        @l
        private final String title;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LinkToken> {
            @Override // android.os.Parcelable.Creator
            public final LinkToken createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(LinkToken.class, parcel, arrayList, iL2, 1);
                }
                return new LinkToken(string, arrayList, parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LinkToken[] newArray(int i12) {
                return new LinkToken[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LinkToken(@l String str, @k List<? extends BeduinAction> list, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.title = str;
            this.onTapActions = list;
            this.overridenAttributes = labelTextAttributes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LinkToken copy$default(LinkToken linkToken, String str, List list, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = linkToken.title;
            }
            if ((i12 & 2) != 0) {
                list = linkToken.onTapActions;
            }
            if ((i12 & 4) != 0) {
                labelTextAttributes = linkToken.overridenAttributes;
            }
            return linkToken.copy(str, list, labelTextAttributes);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<BeduinAction> component2() {
            return this.onTapActions;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final LinkToken copy(@l String title, @k List<? extends BeduinAction> onTapActions, @l LabelTextAttributes overridenAttributes) {
            return new LinkToken(title, onTapActions, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkToken)) {
                return false;
            }
            LinkToken linkToken = (LinkToken) other;
            return L.f(this.title, linkToken.title) && L.f(this.onTapActions, linkToken.onTapActions) && L.f(this.overridenAttributes, linkToken.overridenAttributes);
        }

        @k
        public final List<BeduinAction> getOnTapActions() {
            return this.onTapActions;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            String str = this.title;
            int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.onTapActions);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iE2 + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "LinkToken(title=" + this.title + ", onTapActions=" + this.onTapActions + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.onTapActions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$SalesStrikeThroughToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "title", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$SalesStrikeThroughToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SalesStrikeThroughToken extends LabelToken {

        @k
        public static final Parcelable.Creator<SalesStrikeThroughToken> CREATOR = new a();

        @l
        private final LabelTextAttributes overridenAttributes;

        @k
        private final String title;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SalesStrikeThroughToken> {
            @Override // android.os.Parcelable.Creator
            public final SalesStrikeThroughToken createFromParcel(Parcel parcel) {
                return new SalesStrikeThroughToken(parcel.readString(), parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SalesStrikeThroughToken[] newArray(int i12) {
                return new SalesStrikeThroughToken[i12];
            }
        }

        public SalesStrikeThroughToken(@k String str, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.title = str;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ SalesStrikeThroughToken copy$default(SalesStrikeThroughToken salesStrikeThroughToken, String str, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = salesStrikeThroughToken.title;
            }
            if ((i12 & 2) != 0) {
                labelTextAttributes = salesStrikeThroughToken.overridenAttributes;
            }
            return salesStrikeThroughToken.copy(str, labelTextAttributes);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final SalesStrikeThroughToken copy(@k String title, @l LabelTextAttributes overridenAttributes) {
            return new SalesStrikeThroughToken(title, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SalesStrikeThroughToken)) {
                return false;
            }
            SalesStrikeThroughToken salesStrikeThroughToken = (SalesStrikeThroughToken) other;
            return L.f(this.title, salesStrikeThroughToken.title) && L.f(this.overridenAttributes, salesStrikeThroughToken.overridenAttributes);
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode + (labelTextAttributes == null ? 0 : labelTextAttributes.hashCode());
        }

        @k
        public String toString() {
            return "SalesStrikeThroughToken(title=" + this.title + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$SpacingToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "width", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(ILcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()I", "component2", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(ILcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$SpacingToken;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SpacingToken extends LabelToken {

        @k
        public static final Parcelable.Creator<SpacingToken> CREATOR = new a();

        @l
        private final LabelTextAttributes overridenAttributes;
        private final int width;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SpacingToken> {
            @Override // android.os.Parcelable.Creator
            public final SpacingToken createFromParcel(Parcel parcel) {
                return new SpacingToken(parcel.readInt(), parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SpacingToken[] newArray(int i12) {
                return new SpacingToken[i12];
            }
        }

        public SpacingToken(int i12, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.width = i12;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ SpacingToken copy$default(SpacingToken spacingToken, int i12, LabelTextAttributes labelTextAttributes, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = spacingToken.width;
            }
            if ((i13 & 2) != 0) {
                labelTextAttributes = spacingToken.overridenAttributes;
            }
            return spacingToken.copy(i12, labelTextAttributes);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final SpacingToken copy(int width, @l LabelTextAttributes overridenAttributes) {
            return new SpacingToken(width, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacingToken)) {
                return false;
            }
            SpacingToken spacingToken = (SpacingToken) other;
            return this.width == spacingToken.width && L.f(this.overridenAttributes, spacingToken.overridenAttributes);
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        public final int getWidth() {
            return this.width;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.width) * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode + (labelTextAttributes == null ? 0 : labelTextAttributes.hashCode());
        }

        @k
        public String toString() {
            return "SpacingToken(width=" + this.width + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.width);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$StorageTextToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "storageType", "", "storageKey", "param", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$StorageTextToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin_shared/model/action/storeParameters/StorageType;", "getStorageType", "Ljava/lang/String;", "getStorageKey", "getParam", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class StorageTextToken extends LabelToken {

        @k
        public static final Parcelable.Creator<StorageTextToken> CREATOR = new a();

        @l
        private final LabelTextAttributes overridenAttributes;

        @k
        private final String param;

        @k
        private final String storageKey;

        @l
        private final StorageType storageType;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StorageTextToken> {
            @Override // android.os.Parcelable.Creator
            public final StorageTextToken createFromParcel(Parcel parcel) {
                return new StorageTextToken(parcel.readInt() == 0 ? null : StorageType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? LabelTextAttributes.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final StorageTextToken[] newArray(int i12) {
                return new StorageTextToken[i12];
            }
        }

        public StorageTextToken(@l StorageType storageType, @k String str, @k String str2, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.storageType = storageType;
            this.storageKey = str;
            this.param = str2;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ StorageTextToken copy$default(StorageTextToken storageTextToken, StorageType storageType, String str, String str2, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                storageType = storageTextToken.storageType;
            }
            if ((i12 & 2) != 0) {
                str = storageTextToken.storageKey;
            }
            if ((i12 & 4) != 0) {
                str2 = storageTextToken.param;
            }
            if ((i12 & 8) != 0) {
                labelTextAttributes = storageTextToken.overridenAttributes;
            }
            return storageTextToken.copy(storageType, str, str2, labelTextAttributes);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final StorageType getStorageType() {
            return this.storageType;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStorageKey() {
            return this.storageKey;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getParam() {
            return this.param;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final StorageTextToken copy(@l StorageType storageType, @k String storageKey, @k String param, @l LabelTextAttributes overridenAttributes) {
            return new StorageTextToken(storageType, storageKey, param, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StorageTextToken)) {
                return false;
            }
            StorageTextToken storageTextToken = (StorageTextToken) other;
            return this.storageType == storageTextToken.storageType && L.f(this.storageKey, storageTextToken.storageKey) && L.f(this.param, storageTextToken.param) && L.f(this.overridenAttributes, storageTextToken.overridenAttributes);
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final String getParam() {
            return this.param;
        }

        @k
        public final String getStorageKey() {
            return this.storageKey;
        }

        @l
        public final StorageType getStorageType() {
            return this.storageType;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            StorageType storageType = this.storageType;
            int iD2 = H.d(H.d((storageType == null ? 0 : storageType.hashCode()) * 31, 31, this.storageKey), 31, this.param);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iD2 + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "StorageTextToken(storageType=" + this.storageType + ", storageKey=" + this.storageKey + ", param=" + this.param + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            StorageType storageType = this.storageType;
            if (storageType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(storageType.name());
            }
            parcel.writeString(this.storageKey);
            parcel.writeString(this.param);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$TextIconToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "iconName", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$TextIconToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconName", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TextIconToken extends LabelToken {

        @k
        public static final Parcelable.Creator<TextIconToken> CREATOR = new a();

        @k
        private final String iconName;

        @l
        private final LabelTextAttributes overridenAttributes;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextIconToken> {
            @Override // android.os.Parcelable.Creator
            public final TextIconToken createFromParcel(Parcel parcel) {
                return new TextIconToken(parcel.readString(), parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final TextIconToken[] newArray(int i12) {
                return new TextIconToken[i12];
            }
        }

        public TextIconToken(@k String str, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.iconName = str;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ TextIconToken copy$default(TextIconToken textIconToken, String str, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textIconToken.iconName;
            }
            if ((i12 & 2) != 0) {
                labelTextAttributes = textIconToken.overridenAttributes;
            }
            return textIconToken.copy(str, labelTextAttributes);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final TextIconToken copy(@k String iconName, @l LabelTextAttributes overridenAttributes) {
            return new TextIconToken(iconName, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextIconToken)) {
                return false;
            }
            TextIconToken textIconToken = (TextIconToken) other;
            return L.f(this.iconName, textIconToken.iconName) && L.f(this.overridenAttributes, textIconToken.overridenAttributes);
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            int iHashCode = this.iconName.hashCode() * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode + (labelTextAttributes == null ? 0 : labelTextAttributes.hashCode());
        }

        @k
        public String toString() {
            return "TextIconToken(iconName=" + this.iconName + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.iconName);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LabelToken.kt */
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/network/model/LabelToken$TextToken;", "Lcom/avito/android/beduin/network/model/LabelToken;", "", "title", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;)Lcom/avito/android/beduin/network/model/LabelToken$TextToken;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TextToken extends LabelToken {

        @k
        public static final Parcelable.Creator<TextToken> CREATOR = new a();

        @l
        private final LabelTextAttributes overridenAttributes;

        @l
        private final String title;

        /* compiled from: LabelToken.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextToken> {
            @Override // android.os.Parcelable.Creator
            public final TextToken createFromParcel(Parcel parcel) {
                return new TextToken(parcel.readString(), parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final TextToken[] newArray(int i12) {
                return new TextToken[i12];
            }
        }

        public TextToken(@l String str, @l LabelTextAttributes labelTextAttributes) {
            super(null);
            this.title = str;
            this.overridenAttributes = labelTextAttributes;
        }

        public static /* synthetic */ TextToken copy$default(TextToken textToken, String str, LabelTextAttributes labelTextAttributes, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textToken.title;
            }
            if ((i12 & 2) != 0) {
                labelTextAttributes = textToken.overridenAttributes;
            }
            return textToken.copy(str, labelTextAttributes);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @k
        public final TextToken copy(@l String title, @l LabelTextAttributes overridenAttributes) {
            return new TextToken(title, overridenAttributes);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextToken)) {
                return false;
            }
            TextToken textToken = (TextToken) other;
            return L.f(this.title, textToken.title) && L.f(this.overridenAttributes, textToken.overridenAttributes);
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        @l
        public LabelTextAttributes getOverridenAttributes() {
            return this.overridenAttributes;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.beduin.network.model.LabelToken
        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            return iHashCode + (labelTextAttributes != null ? labelTextAttributes.hashCode() : 0);
        }

        @k
        public String toString() {
            return "TextToken(title=" + this.title + ", overridenAttributes=" + this.overridenAttributes + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            LabelTextAttributes labelTextAttributes = this.overridenAttributes;
            if (labelTextAttributes == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                labelTextAttributes.writeToParcel(parcel, flags);
            }
        }
    }

    public /* synthetic */ LabelToken(C42822w c42822w) {
        this();
    }

    public abstract boolean equals(@l Object other);

    @l
    public abstract LabelTextAttributes getOverridenAttributes();

    public abstract int hashCode();

    private LabelToken() {
    }
}

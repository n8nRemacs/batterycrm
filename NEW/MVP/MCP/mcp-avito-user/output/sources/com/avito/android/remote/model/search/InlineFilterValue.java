package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.platform.C22491k0;
import androidx.media3.exoplayer.analytics.m;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: InlineFilterValue.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J4\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&\u0082\u0001\u0017&'()*+,-./0123456789:;<¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue;", "Landroid/os/Parcelable;", "()V", "changedParamsMap", "", "", "isEmpty", "", "queryMap", "filterId", "format", "mapping", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "toStringList", "", "InlineCategoryNodesValue", "InlineFilterAddressesValue", "InlineFilterBooleanValue", "InlineFilterDateRangeValue", "InlineFilterDeveloperDevelopmentValue", "InlineFilterDirectionValue", "InlineFilterDistrictValue", "InlineFilterFootWalkingMetroChipsValue", "InlineFilterGuestsSelectValue", "InlineFilterLocalPriorityValue", "InlineFilterLocationValue", "InlineFilterMetroValue", "InlineFilterMultiSelectValue", "InlineFilterNumericRangeSelectValue", "InlineFilterNumericRangeValue", "InlineFilterRadiusSelectValue", "InlineFilterSectionedMultiSelectValue", "InlineFilterSelectIntValue", "InlineFilterSelectValue", "InlineFilterShortcutValue", "InlineFilterSuggestLocationValue", "InlineRadiusValue", "InlineSearchCoordinatesValue", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineCategoryNodesValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterAddressesValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterBooleanValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDateRangeValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDeveloperDevelopmentValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDirectionValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDistrictValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterFootWalkingMetroChipsValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterGuestsSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocalPriorityValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocationValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMetroValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterRadiusSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSectionedMultiSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectIntValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterShortcutValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSuggestLocationValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineRadiusValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue$InlineSearchCoordinatesValue;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class InlineFilterValue implements Parcelable {

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b\u0005\u0010\u001a¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineCategoryNodesValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "isFinalNode", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineCategoryNodesValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineCategoryNodesValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineCategoryNodesValue> CREATOR = new Creator();

        @c("isFinalNode")
        @l
        private final Boolean isFinalNode;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink link;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineCategoryNodesValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineCategoryNodesValue createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                DeepLink deepLink = (DeepLink) parcel.readParcelable(InlineCategoryNodesValue.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new InlineCategoryNodesValue(deepLink, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineCategoryNodesValue[] newArray(int i12) {
                return new InlineCategoryNodesValue[i12];
            }
        }

        public InlineCategoryNodesValue(@l DeepLink deepLink, @l Boolean bool) {
            super(null);
            this.link = deepLink;
            this.isFinalNode = bool;
        }

        public static /* synthetic */ InlineCategoryNodesValue copy$default(InlineCategoryNodesValue inlineCategoryNodesValue, DeepLink deepLink, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = inlineCategoryNodesValue.link;
            }
            if ((i12 & 2) != 0) {
                bool = inlineCategoryNodesValue.isFinalNode;
            }
            return inlineCategoryNodesValue.copy(deepLink, bool);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            return P0.c();
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getLink() {
            return this.link;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsFinalNode() {
            return this.isFinalNode;
        }

        @k
        public final InlineCategoryNodesValue copy(@l DeepLink link, @l Boolean isFinalNode) {
            return new InlineCategoryNodesValue(link, isFinalNode);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineCategoryNodesValue)) {
                return false;
            }
            InlineCategoryNodesValue inlineCategoryNodesValue = (InlineCategoryNodesValue) other;
            return L.f(this.link, inlineCategoryNodesValue.link) && L.f(this.isFinalNode, inlineCategoryNodesValue.isFinalNode);
        }

        @l
        public final DeepLink getLink() {
            return this.link;
        }

        public int hashCode() {
            DeepLink deepLink = this.link;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Boolean bool = this.isFinalNode;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.link == null;
        }

        @l
        public final Boolean isFinalNode() {
            return this.isFinalNode;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return P0.c();
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineCategoryNodesValue(link=");
            sb2.append(this.link);
            sb2.append(", isFinalNode=");
            return C0.g(sb2, this.isFinalNode, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            return C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.link, flags);
            Boolean bool = this.isFinalNode;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterAddressesValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "Lcom/avito/android/remote/model/search/AddressFilterValue;", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterAddressesValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterAddressesValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterAddressesValue> CREATOR = new Creator();

        @c("addresses")
        @l
        private final List<AddressFilterValue> selectedItems;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterAddressesValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterAddressesValue createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(AddressFilterValue.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new InlineFilterAddressesValue(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterAddressesValue[] newArray(int i12) {
                return new InlineFilterAddressesValue[i12];
            }
        }

        public InlineFilterAddressesValue(@l List<AddressFilterValue> list) {
            super(null);
            this.selectedItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterAddressesValue copy$default(InlineFilterAddressesValue inlineFilterAddressesValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterAddressesValue.selectedItems;
            }
            return inlineFilterAddressesValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<AddressFilterValue> list = this.selectedItems;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedItems, ",", null, null, null, 62));
        }

        @l
        public final List<AddressFilterValue> component1() {
            return this.selectedItems;
        }

        @k
        public final InlineFilterAddressesValue copy(@l List<AddressFilterValue> selectedItems) {
            return new InlineFilterAddressesValue(selectedItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterAddressesValue) && L.f(this.selectedItems, ((InlineFilterAddressesValue) other).selectedItems);
        }

        @l
        public final List<AddressFilterValue> getSelectedItems() {
            return this.selectedItems;
        }

        public int hashCode() {
            List<AddressFilterValue> list = this.selectedItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<AddressFilterValue> list = this.selectedItems;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<AddressFilterValue> list = this.selectedItems;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put("params[" + filterId + ']', "");
            } else {
                List<AddressFilterValue> list2 = this.selectedItems;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (L.f(((AddressFilterValue) obj).getParamId(), filterId)) {
                        arrayList.add(obj);
                    }
                }
                int i12 = 0;
                for (Object obj2 : arrayList) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put("params[" + filterId + "][" + i12 + ']', ((AddressFilterValue) obj2).getId());
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterAddressesValue(selectedItems="), this.selectedItems, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            ArrayList arrayList;
            List<AddressFilterValue> list = this.selectedItems;
            if (list != null) {
                List<AddressFilterValue> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AddressFilterValue) it.next()).getId());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C42784z0.f406748b : arrayList;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<AddressFilterValue> list = this.selectedItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AddressFilterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0007J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0007¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterBooleanValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "value", "<init>", "(Z)V", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Z)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterBooleanValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterBooleanValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterBooleanValue> CREATOR = new Creator();
        private final boolean value;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterBooleanValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterBooleanValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterBooleanValue(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterBooleanValue[] newArray(int i12) {
                return new InlineFilterBooleanValue[i12];
            }
        }

        public InlineFilterBooleanValue(boolean z12) {
            super(null);
            this.value = z12;
        }

        public static /* synthetic */ InlineFilterBooleanValue copy$default(InlineFilterBooleanValue inlineFilterBooleanValue, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = inlineFilterBooleanValue.value;
            }
            return inlineFilterBooleanValue.copy(z12);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            return Collections.singletonMap("changedParamValueBool", String.valueOf(this.value));
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @k
        public final InlineFilterBooleanValue copy(boolean value) {
            return new InlineFilterBooleanValue(value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterBooleanValue) && this.value == ((InlineFilterBooleanValue) other).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return false;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return Collections.singletonMap(filterId, this.value ? "1" : "0");
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("InlineFilterBooleanValue(value="), this.value, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            return Collections.singletonList(String.valueOf(this.value));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.value ? 1 : 0);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001b¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDeveloperDevelopmentValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "name", "", "developerId", "developmentId", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDeveloperDevelopmentValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Ljava/lang/Long;", "getDeveloperId", "getDevelopmentId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterDeveloperDevelopmentValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterDeveloperDevelopmentValue> CREATOR = new Creator();

        @c("developerId")
        @l
        private final Long developerId;

        @c("developmentId")
        @l
        private final Long developmentId;

        @c("name")
        @l
        private final String name;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterDeveloperDevelopmentValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDeveloperDevelopmentValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterDeveloperDevelopmentValue(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDeveloperDevelopmentValue[] newArray(int i12) {
                return new InlineFilterDeveloperDevelopmentValue[i12];
            }
        }

        public InlineFilterDeveloperDevelopmentValue(@l String str, @l Long l12, @l Long l13) {
            super(null);
            this.name = str;
            this.developerId = l12;
            this.developmentId = l13;
        }

        public static /* synthetic */ InlineFilterDeveloperDevelopmentValue copy$default(InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue, String str, Long l12, Long l13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterDeveloperDevelopmentValue.name;
            }
            if ((i12 & 2) != 0) {
                l12 = inlineFilterDeveloperDevelopmentValue.developerId;
            }
            if ((i12 & 4) != 0) {
                l13 = inlineFilterDeveloperDevelopmentValue.developmentId;
            }
            return inlineFilterDeveloperDevelopmentValue.copy(str, l12, l13);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            return P0.c();
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getDeveloperId() {
            return this.developerId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Long getDevelopmentId() {
            return this.developmentId;
        }

        @k
        public final InlineFilterDeveloperDevelopmentValue copy(@l String name, @l Long developerId, @l Long developmentId) {
            return new InlineFilterDeveloperDevelopmentValue(name, developerId, developmentId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterDeveloperDevelopmentValue)) {
                return false;
            }
            InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue = (InlineFilterDeveloperDevelopmentValue) other;
            return L.f(this.name, inlineFilterDeveloperDevelopmentValue.name) && L.f(this.developerId, inlineFilterDeveloperDevelopmentValue.developerId) && L.f(this.developmentId, inlineFilterDeveloperDevelopmentValue.developmentId);
        }

        @l
        public final Long getDeveloperId() {
            return this.developerId;
        }

        @l
        public final Long getDevelopmentId() {
            return this.developmentId;
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l12 = this.developerId;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.developmentId;
            return iHashCode2 + (l13 != null ? l13.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.name == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String string;
            String string2;
            Long l12 = this.developerId;
            if (l12 == null || (string = l12.toString()) == null) {
                string = "";
            }
            Long l13 = this.developmentId;
            if (l13 == null || (string2 = l13.toString()) == null) {
                string2 = "";
            }
            String str = this.name;
            return P0.g(new Q("params[search-name]", str != null ? str : ""), new Q("params[search-developer]", string), new Q("params[search-development]", string2));
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterDeveloperDevelopmentValue(name=");
            sb2.append(this.name);
            sb2.append(", developerId=");
            sb2.append(this.developerId);
            sb2.append(", developmentId=");
            return m.m(sb2, this.developmentId, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            return C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            Long l12 = this.developerId;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.developmentId;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDirectionValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "Lcom/avito/android/remote/model/search/DirectionFilterValue;", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDirectionValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterDirectionValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterDirectionValue> CREATOR = new Creator();

        @c("selectedItems")
        @l
        private final List<DirectionFilterValue> selectedItems;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterDirectionValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDirectionValue createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(DirectionFilterValue.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new InlineFilterDirectionValue(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDirectionValue[] newArray(int i12) {
                return new InlineFilterDirectionValue[i12];
            }
        }

        public InlineFilterDirectionValue(@l List<DirectionFilterValue> list) {
            super(null);
            this.selectedItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterDirectionValue copy$default(InlineFilterDirectionValue inlineFilterDirectionValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterDirectionValue.selectedItems;
            }
            return inlineFilterDirectionValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<DirectionFilterValue> list = this.selectedItems;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedItems, ",", null, null, null, 62));
        }

        @l
        public final List<DirectionFilterValue> component1() {
            return this.selectedItems;
        }

        @k
        public final InlineFilterDirectionValue copy(@l List<DirectionFilterValue> selectedItems) {
            return new InlineFilterDirectionValue(selectedItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterDirectionValue) && L.f(this.selectedItems, ((InlineFilterDirectionValue) other).selectedItems);
        }

        @l
        public final List<DirectionFilterValue> getSelectedItems() {
            return this.selectedItems;
        }

        public int hashCode() {
            List<DirectionFilterValue> list = this.selectedItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<DirectionFilterValue> list = this.selectedItems;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DirectionFilterValue> list = this.selectedItems;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put(filterId, "");
            } else {
                int i12 = 0;
                for (Object obj : this.selectedItems) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(filterId + '[' + i12 + ']', String.valueOf(((DirectionFilterValue) obj).getId()));
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterDirectionValue(selectedItems="), this.selectedItems, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            ArrayList arrayList;
            List<DirectionFilterValue> list = this.selectedItems;
            if (list != null) {
                List<DirectionFilterValue> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((DirectionFilterValue) it.next()).getId()));
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C42784z0.f406748b : arrayList;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<DirectionFilterValue> list = this.selectedItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DirectionFilterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDistrictValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "Lcom/avito/android/remote/model/search/DistrictFilterValue;", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDistrictValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterDistrictValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterDistrictValue> CREATOR = new Creator();

        @c("selectedItems")
        @l
        private final List<DistrictFilterValue> selectedItems;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterDistrictValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDistrictValue createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(DistrictFilterValue.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new InlineFilterDistrictValue(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDistrictValue[] newArray(int i12) {
                return new InlineFilterDistrictValue[i12];
            }
        }

        public InlineFilterDistrictValue(@l List<DistrictFilterValue> list) {
            super(null);
            this.selectedItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterDistrictValue copy$default(InlineFilterDistrictValue inlineFilterDistrictValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterDistrictValue.selectedItems;
            }
            return inlineFilterDistrictValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<DistrictFilterValue> list = this.selectedItems;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedItems, ",", null, null, null, 62));
        }

        @l
        public final List<DistrictFilterValue> component1() {
            return this.selectedItems;
        }

        @k
        public final InlineFilterDistrictValue copy(@l List<DistrictFilterValue> selectedItems) {
            return new InlineFilterDistrictValue(selectedItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterDistrictValue) && L.f(this.selectedItems, ((InlineFilterDistrictValue) other).selectedItems);
        }

        @l
        public final List<DistrictFilterValue> getSelectedItems() {
            return this.selectedItems;
        }

        public int hashCode() {
            List<DistrictFilterValue> list = this.selectedItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<DistrictFilterValue> list = this.selectedItems;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<DistrictFilterValue> list = this.selectedItems;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put(filterId, "");
            } else {
                int i12 = 0;
                for (Object obj : this.selectedItems) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(filterId + '[' + i12 + ']', String.valueOf(((DistrictFilterValue) obj).getId()));
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterDistrictValue(selectedItems="), this.selectedItems, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            ArrayList arrayList;
            List<DistrictFilterValue> list = this.selectedItems;
            if (list != null) {
                List<DistrictFilterValue> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((DistrictFilterValue) it.next()).getId()));
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C42784z0.f406748b : arrayList;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<DistrictFilterValue> list = this.selectedItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DistrictFilterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterFootWalkingMetroChipsValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "selectedOption", "<init>", "(Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterFootWalkingMetroChipsValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSelectedOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterFootWalkingMetroChipsValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterFootWalkingMetroChipsValue> CREATOR = new Creator();

        @c("selectedOption")
        @l
        private final String selectedOption;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterFootWalkingMetroChipsValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterFootWalkingMetroChipsValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterFootWalkingMetroChipsValue(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterFootWalkingMetroChipsValue[] newArray(int i12) {
                return new InlineFilterFootWalkingMetroChipsValue[i12];
            }
        }

        public InlineFilterFootWalkingMetroChipsValue(@l String str) {
            super(null);
            this.selectedOption = str;
        }

        public static /* synthetic */ InlineFilterFootWalkingMetroChipsValue copy$default(InlineFilterFootWalkingMetroChipsValue inlineFilterFootWalkingMetroChipsValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterFootWalkingMetroChipsValue.selectedOption;
            }
            return inlineFilterFootWalkingMetroChipsValue.copy(str);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            String str = this.selectedOption;
            if (str == null) {
                str = "";
            }
            return Collections.singletonMap("changedParamValueChips", str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @k
        public final InlineFilterFootWalkingMetroChipsValue copy(@l String selectedOption) {
            return new InlineFilterFootWalkingMetroChipsValue(selectedOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterFootWalkingMetroChipsValue) && L.f(this.selectedOption, ((InlineFilterFootWalkingMetroChipsValue) other).selectedOption);
        }

        @l
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            String str = this.selectedOption;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str = this.selectedOption;
            return str == null || str.length() == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String str = this.selectedOption;
            if (str == null) {
                str = "";
            }
            return Collections.singletonMap(SearchParamsConverterKt.FOOT_WALKING_METRO, str);
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("InlineFilterFootWalkingMetroChipsValue(selectedOption="), this.selectedOption, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String str = this.selectedOption;
            return str != null ? Collections.singletonList(str) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.selectedOption);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0016¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocalPriorityValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "priority", "<init>", "(Ljava/lang/Boolean;)V", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocalPriorityValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getPriority", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterLocalPriorityValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterLocalPriorityValue> CREATOR = new Creator();

        @c("value")
        @l
        private final Boolean priority;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterLocalPriorityValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterLocalPriorityValue createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new InlineFilterLocalPriorityValue(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterLocalPriorityValue[] newArray(int i12) {
                return new InlineFilterLocalPriorityValue[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InlineFilterLocalPriorityValue() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InlineFilterLocalPriorityValue copy$default(InlineFilterLocalPriorityValue inlineFilterLocalPriorityValue, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = inlineFilterLocalPriorityValue.priority;
            }
            return inlineFilterLocalPriorityValue.copy(bool);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = this.priority;
            if (bool != null) {
                linkedHashMap.put("changedParamValueLocalPriority", String.valueOf(bool.booleanValue()));
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getPriority() {
            return this.priority;
        }

        @k
        public final InlineFilterLocalPriorityValue copy(@l Boolean priority) {
            return new InlineFilterLocalPriorityValue(priority);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterLocalPriorityValue) && L.f(this.priority, ((InlineFilterLocalPriorityValue) other).priority);
        }

        @l
        public final Boolean getPriority() {
            return this.priority;
        }

        public int hashCode() {
            Boolean bool = this.priority;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.priority == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return Collections.singletonMap(filterId, String.valueOf(this.priority));
        }

        @k
        public String toString() {
            return C0.g(new StringBuilder("InlineFilterLocalPriorityValue(priority="), this.priority, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            Boolean bool = this.priority;
            return bool != null ? Collections.singletonList(bool.toString()) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.priority;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ InlineFilterLocalPriorityValue(Boolean bool, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bool);
        }

        public InlineFilterLocalPriorityValue(@l Boolean bool) {
            super(null);
            this.priority = bool;
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocationValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", SearchParamsConverterKt.LOCATION_ID, "<init>", "(Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterLocationValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocationId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterLocationValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterLocationValue> CREATOR = new Creator();

        @c("id")
        @l
        private final String locationId;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterLocationValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterLocationValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterLocationValue(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterLocationValue[] newArray(int i12) {
                return new InlineFilterLocationValue[i12];
            }
        }

        public InlineFilterLocationValue(@l String str) {
            super(null);
            this.locationId = str;
        }

        public static /* synthetic */ InlineFilterLocationValue copy$default(InlineFilterLocationValue inlineFilterLocationValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterLocationValue.locationId;
            }
            return inlineFilterLocationValue.copy(str);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.locationId;
            if (str != null) {
                linkedHashMap.put("changedParamValueLocation", str);
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getLocationId() {
            return this.locationId;
        }

        @k
        public final InlineFilterLocationValue copy(@l String locationId) {
            return new InlineFilterLocationValue(locationId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterLocationValue) && L.f(this.locationId, ((InlineFilterLocationValue) other).locationId);
        }

        @l
        public final String getLocationId() {
            return this.locationId;
        }

        public int hashCode() {
            String str = this.locationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str = this.locationId;
            return str == null || str.length() == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return Collections.singletonMap(filterId, String.valueOf(this.locationId));
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("InlineFilterLocationValue(locationId="), this.locationId, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String str = this.locationId;
            return str != null ? Collections.singletonList(str) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.locationId);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMetroValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "Lcom/avito/android/remote/model/search/MetroFilterValue;", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMetroValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedItems", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterMetroValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterMetroValue> CREATOR = new Creator();

        @c("selectedItems")
        @l
        private final List<MetroFilterValue> selectedItems;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterMetroValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterMetroValue createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(MetroFilterValue.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new InlineFilterMetroValue(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterMetroValue[] newArray(int i12) {
                return new InlineFilterMetroValue[i12];
            }
        }

        public InlineFilterMetroValue(@l List<MetroFilterValue> list) {
            super(null);
            this.selectedItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterMetroValue copy$default(InlineFilterMetroValue inlineFilterMetroValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterMetroValue.selectedItems;
            }
            return inlineFilterMetroValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<MetroFilterValue> list = this.selectedItems;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedItems, ",", null, null, null, 62));
        }

        @l
        public final List<MetroFilterValue> component1() {
            return this.selectedItems;
        }

        @k
        public final InlineFilterMetroValue copy(@l List<MetroFilterValue> selectedItems) {
            return new InlineFilterMetroValue(selectedItems);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterMetroValue) && L.f(this.selectedItems, ((InlineFilterMetroValue) other).selectedItems);
        }

        @l
        public final List<MetroFilterValue> getSelectedItems() {
            return this.selectedItems;
        }

        public int hashCode() {
            List<MetroFilterValue> list = this.selectedItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<MetroFilterValue> list = this.selectedItems;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<MetroFilterValue> list = this.selectedItems;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put(filterId, "");
            } else {
                int i12 = 0;
                for (Object obj : this.selectedItems) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(filterId + '[' + i12 + ']', String.valueOf(((MetroFilterValue) obj).getId()));
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterMetroValue(selectedItems="), this.selectedItems, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            ArrayList arrayList;
            List<MetroFilterValue> list = this.selectedItems;
            if (list != null) {
                List<MetroFilterValue> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((MetroFilterValue) it.next()).getId()));
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C42784z0.f406748b : arrayList;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<MetroFilterValue> list = this.selectedItems;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((MetroFilterValue) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\"\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "", "selectedOptions", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterMultiSelectValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedOptions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterMultiSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterMultiSelectValue> CREATOR = new Creator();

        @c("selectedOptions")
        @l
        private final List<String> selectedOptions;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterMultiSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterMultiSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterMultiSelectValue(parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterMultiSelectValue[] newArray(int i12) {
                return new InlineFilterMultiSelectValue[i12];
            }
        }

        public InlineFilterMultiSelectValue(@l List<String> list) {
            super(null);
            this.selectedOptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterMultiSelectValue copy$default(InlineFilterMultiSelectValue inlineFilterMultiSelectValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterMultiSelectValue.selectedOptions;
            }
            return inlineFilterMultiSelectValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<String> list = this.selectedOptions;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedOptions, ",", null, null, null, 62));
        }

        @l
        public final List<String> component1() {
            return this.selectedOptions;
        }

        @k
        public final InlineFilterMultiSelectValue copy(@l List<String> selectedOptions) {
            return new InlineFilterMultiSelectValue(selectedOptions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterMultiSelectValue) && L.f(this.selectedOptions, ((InlineFilterMultiSelectValue) other).selectedOptions);
        }

        @l
        public final List<String> getSelectedOptions() {
            return this.selectedOptions;
        }

        public int hashCode() {
            List<String> list = this.selectedOptions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<String> list = this.selectedOptions;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> list = this.selectedOptions;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put(filterId, "");
            } else {
                int i12 = 0;
                for (Object obj : this.selectedOptions) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(filterId + '[' + i12 + ']', (String) obj);
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterMultiSelectValue(selectedOptions="), this.selectedOptions, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            List<String> list = this.selectedOptions;
            return list == null ? C42784z0.f406748b : list;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.selectedOptions);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0017¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeSelectValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFrom", "getTo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterNumericRangeSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterNumericRangeSelectValue> CREATOR = new Creator();

        @c(InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @l
        private final String from;

        @c(InlineFilterDateRangeValue.TO_PARAM_NAME)
        @l
        private final String to;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterNumericRangeSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterNumericRangeSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterNumericRangeSelectValue(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterNumericRangeSelectValue[] newArray(int i12) {
                return new InlineFilterNumericRangeSelectValue[i12];
            }
        }

        public InlineFilterNumericRangeSelectValue(@l String str, @l String str2) {
            super(null);
            this.from = str;
            this.to = str2;
        }

        public static /* synthetic */ InlineFilterNumericRangeSelectValue copy$default(InlineFilterNumericRangeSelectValue inlineFilterNumericRangeSelectValue, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterNumericRangeSelectValue.from;
            }
            if ((i12 & 2) != 0) {
                str2 = inlineFilterNumericRangeSelectValue.to;
            }
            return inlineFilterNumericRangeSelectValue.copy(str, str2);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.from;
            if (str != null) {
                linkedHashMap.put("changedParamValueIntFrom", str);
            }
            String str2 = this.to;
            if (str2 != null) {
                linkedHashMap.put("changedParamValueIntTo", str2);
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @k
        public final InlineFilterNumericRangeSelectValue copy(@l String from, @l String to2) {
            return new InlineFilterNumericRangeSelectValue(from, to2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterNumericRangeSelectValue)) {
                return false;
            }
            InlineFilterNumericRangeSelectValue inlineFilterNumericRangeSelectValue = (InlineFilterNumericRangeSelectValue) other;
            return L.f(this.from, inlineFilterNumericRangeSelectValue.from) && L.f(this.to, inlineFilterNumericRangeSelectValue.to);
        }

        @l
        public final String getFrom() {
            return this.from;
        }

        @l
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            String str = this.from;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.to;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str;
            String str2 = this.from;
            return (str2 == null || C43066x.K(str2)) && ((str = this.to) == null || C43066x.K(str));
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String str = this.from;
            if (str == null) {
                str = "";
            }
            String str2 = this.to;
            return P0.g(new Q(filterId.concat("[from]"), str), new Q(filterId.concat("[to]"), str2 != null ? str2 : ""));
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterNumericRangeSelectValue(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return C22026a.c(sb2, this.to, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String str = this.from;
            if (str == null) {
                str = "";
            }
            String str2 = this.to;
            return C42745f0.U(str, str2 != null ? str2 : "");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.from);
            parcel.writeString(this.to);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0018¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/Long;", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterNumericRangeValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getFrom", "getTo", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterNumericRangeValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterNumericRangeValue> CREATOR = new Creator();

        @c(InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @l
        private final Long from;

        @c(InlineFilterDateRangeValue.TO_PARAM_NAME)
        @l
        private final Long to;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterNumericRangeValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterNumericRangeValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterNumericRangeValue(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterNumericRangeValue[] newArray(int i12) {
                return new InlineFilterNumericRangeValue[i12];
            }
        }

        public InlineFilterNumericRangeValue(@l Long l12, @l Long l13) {
            super(null);
            this.from = l12;
            this.to = l13;
        }

        public static /* synthetic */ InlineFilterNumericRangeValue copy$default(InlineFilterNumericRangeValue inlineFilterNumericRangeValue, Long l12, Long l13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = inlineFilterNumericRangeValue.from;
            }
            if ((i12 & 2) != 0) {
                l13 = inlineFilterNumericRangeValue.to;
            }
            return inlineFilterNumericRangeValue.copy(l12, l13);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Long l12 = this.from;
            if (l12 != null) {
                linkedHashMap.put("changedParamValueIntFrom", l12.toString());
            }
            Long l13 = this.to;
            if (l13 != null) {
                linkedHashMap.put("changedParamValueIntTo", l13.toString());
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getFrom() {
            return this.from;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Long getTo() {
            return this.to;
        }

        @k
        public final InlineFilterNumericRangeValue copy(@l Long from, @l Long to2) {
            return new InlineFilterNumericRangeValue(from, to2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterNumericRangeValue)) {
                return false;
            }
            InlineFilterNumericRangeValue inlineFilterNumericRangeValue = (InlineFilterNumericRangeValue) other;
            return L.f(this.from, inlineFilterNumericRangeValue.from) && L.f(this.to, inlineFilterNumericRangeValue.to);
        }

        @l
        public final Long getFrom() {
            return this.from;
        }

        @l
        public final Long getTo() {
            return this.to;
        }

        public int hashCode() {
            Long l12 = this.from;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Long l13 = this.to;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.from == null && this.to == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            Long l12 = this.from;
            String string = l12 != null ? l12.toString() : null;
            if (string == null) {
                string = "";
            }
            Long l13 = this.to;
            String string2 = l13 != null ? l13.toString() : null;
            return P0.g(new Q(filterId.concat("[from]"), string), new Q(filterId.concat("[to]"), string2 != null ? string2 : ""));
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterNumericRangeValue(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return m.m(sb2, this.to, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String string;
            String string2;
            Long l12 = this.from;
            String str = "";
            if (l12 == null || (string = l12.toString()) == null) {
                string = "";
            }
            Long l13 = this.to;
            if (l13 != null && (string2 = l13.toString()) != null) {
                str = string2;
            }
            return C42745f0.U(string, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.from;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Long l13 = this.to;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterRadiusSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "selectedOption", "<init>", "(Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterRadiusSelectValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSelectedOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterRadiusSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterRadiusSelectValue> CREATOR = new Creator();

        @l
        private final String selectedOption;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterRadiusSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterRadiusSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterRadiusSelectValue(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterRadiusSelectValue[] newArray(int i12) {
                return new InlineFilterRadiusSelectValue[i12];
            }
        }

        public InlineFilterRadiusSelectValue(@l String str) {
            super(null);
            this.selectedOption = str;
        }

        public static /* synthetic */ InlineFilterRadiusSelectValue copy$default(InlineFilterRadiusSelectValue inlineFilterRadiusSelectValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterRadiusSelectValue.selectedOption;
            }
            return inlineFilterRadiusSelectValue.copy(str);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            String str = this.selectedOption;
            if (str == null) {
                str = "";
            }
            return Collections.singletonMap("changedParamValueRadius", str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @k
        public final InlineFilterRadiusSelectValue copy(@l String selectedOption) {
            return new InlineFilterRadiusSelectValue(selectedOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterRadiusSelectValue) && L.f(this.selectedOption, ((InlineFilterRadiusSelectValue) other).selectedOption);
        }

        @l
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            String str = this.selectedOption;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str = this.selectedOption;
            return str == null || str.length() == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String str = this.selectedOption;
            if (str == null) {
                str = "";
            }
            return Collections.singletonMap("radius", str);
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("InlineFilterRadiusSelectValue(selectedOption="), this.selectedOption, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String str = this.selectedOption;
            return str != null ? Collections.singletonList(str) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.selectedOption);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\"\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSectionedMultiSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "", "selectedOptions", "<init>", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSectionedMultiSelectValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSelectedOptions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterSectionedMultiSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterSectionedMultiSelectValue> CREATOR = new Creator();

        @c("selectedOptions")
        @l
        private final List<String> selectedOptions;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterSectionedMultiSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSectionedMultiSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterSectionedMultiSelectValue(parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSectionedMultiSelectValue[] newArray(int i12) {
                return new InlineFilterSectionedMultiSelectValue[i12];
            }
        }

        public InlineFilterSectionedMultiSelectValue(@l List<String> list) {
            super(null);
            this.selectedOptions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterSectionedMultiSelectValue copy$default(InlineFilterSectionedMultiSelectValue inlineFilterSectionedMultiSelectValue, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = inlineFilterSectionedMultiSelectValue.selectedOptions;
            }
            return inlineFilterSectionedMultiSelectValue.copy(list);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            List<String> list = this.selectedOptions;
            return (list == null || list.isEmpty()) ? P0.c() : Collections.singletonMap("changedParamValueList", C42745f0.O(this.selectedOptions, ",", null, null, null, 62));
        }

        @l
        public final List<String> component1() {
            return this.selectedOptions;
        }

        @k
        public final InlineFilterSectionedMultiSelectValue copy(@l List<String> selectedOptions) {
            return new InlineFilterSectionedMultiSelectValue(selectedOptions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterSectionedMultiSelectValue) && L.f(this.selectedOptions, ((InlineFilterSectionedMultiSelectValue) other).selectedOptions);
        }

        @l
        public final List<String> getSelectedOptions() {
            return this.selectedOptions;
        }

        public int hashCode() {
            List<String> list = this.selectedOptions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            List<String> list = this.selectedOptions;
            return list == null || list.isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> list = this.selectedOptions;
            if (list == null || list.isEmpty()) {
                linkedHashMap.put(filterId, "");
            } else {
                int i12 = 0;
                for (Object obj : this.selectedOptions) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(filterId + '[' + i12 + ']', (String) obj);
                    i12 = i13;
                }
            }
            return linkedHashMap;
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("InlineFilterSectionedMultiSelectValue(selectedOptions="), this.selectedOptions, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            List<String> list = this.selectedOptions;
            return list == null ? C42784z0.f406748b : list;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.selectedOptions);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectIntValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "selectedOption", "<init>", "(I)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()I", "copy", "(I)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectIntValue;", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getSelectedOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterSelectIntValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterSelectIntValue> CREATOR = new Creator();
        private final int selectedOption;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterSelectIntValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSelectIntValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterSelectIntValue(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSelectIntValue[] newArray(int i12) {
                return new InlineFilterSelectIntValue[i12];
            }
        }

        public InlineFilterSelectIntValue(int i12) {
            super(null);
            this.selectedOption = i12;
        }

        public static /* synthetic */ InlineFilterSelectIntValue copy$default(InlineFilterSelectIntValue inlineFilterSelectIntValue, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = inlineFilterSelectIntValue.selectedOption;
            }
            return inlineFilterSelectIntValue.copy(i12);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            int i12 = this.selectedOption;
            return i12 != 0 ? Collections.singletonMap("changedParamValueInt", String.valueOf(i12)) : P0.c();
        }

        /* renamed from: component1, reason: from getter */
        public final int getSelectedOption() {
            return this.selectedOption;
        }

        @k
        public final InlineFilterSelectIntValue copy(int selectedOption) {
            return new InlineFilterSelectIntValue(selectedOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterSelectIntValue) && this.selectedOption == ((InlineFilterSelectIntValue) other).selectedOption;
        }

        public final int getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedOption);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.selectedOption == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return Collections.singletonMap(filterId, String.valueOf(this.selectedOption));
        }

        @k
        public String toString() {
            return r.t(new StringBuilder("InlineFilterSelectIntValue(selectedOption="), this.selectedOption, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            int i12 = this.selectedOption;
            return i12 != 0 ? Collections.singletonList(String.valueOf(i12)) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.selectedOption);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "selectedOption", "<init>", "(Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSelectValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSelectedOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterSelectValue> CREATOR = new Creator();

        @c("selectedOption")
        @l
        private final String selectedOption;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterSelectValue(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSelectValue[] newArray(int i12) {
                return new InlineFilterSelectValue[i12];
            }
        }

        public InlineFilterSelectValue(@l String str) {
            super(null);
            this.selectedOption = str;
        }

        public static /* synthetic */ InlineFilterSelectValue copy$default(InlineFilterSelectValue inlineFilterSelectValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterSelectValue.selectedOption;
            }
            return inlineFilterSelectValue.copy(str);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            String str = this.selectedOption;
            return str == null ? P0.c() : Collections.singletonMap("changedParamValue", str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        @k
        public final InlineFilterSelectValue copy(@l String selectedOption) {
            return new InlineFilterSelectValue(selectedOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineFilterSelectValue) && L.f(this.selectedOption, ((InlineFilterSelectValue) other).selectedOption);
        }

        @l
        public final String getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            String str = this.selectedOption;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str = this.selectedOption;
            return str == null || str.length() == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String str = this.selectedOption;
            if (str == null) {
                str = "";
            }
            return Collections.singletonMap(filterId, str);
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("InlineFilterSelectValue(selectedOption="), this.selectedOption, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            String str = this.selectedOption;
            return str != null ? Collections.singletonList(str) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.selectedOption);
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001b¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterShortcutValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)V", "", "isEmpty", "()Z", "", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterShortcutValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterShortcutValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterShortcutValue> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("image")
        @l
        private final UniversalImage image;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterShortcutValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterShortcutValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterShortcutValue((DeepLink) parcel.readParcelable(InlineFilterShortcutValue.class.getClassLoader()), (UniversalImage) parcel.readParcelable(InlineFilterShortcutValue.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterShortcutValue[] newArray(int i12) {
                return new InlineFilterShortcutValue[i12];
            }
        }

        public /* synthetic */ InlineFilterShortcutValue(DeepLink deepLink, UniversalImage universalImage, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : universalImage);
        }

        public static /* synthetic */ InlineFilterShortcutValue copy$default(InlineFilterShortcutValue inlineFilterShortcutValue, DeepLink deepLink, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = inlineFilterShortcutValue.deepLink;
            }
            if ((i12 & 2) != 0) {
                universalImage = inlineFilterShortcutValue.image;
            }
            return inlineFilterShortcutValue.copy(deepLink, universalImage);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            return P0.c();
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final InlineFilterShortcutValue copy(@l DeepLink deepLink, @l UniversalImage image) {
            return new InlineFilterShortcutValue(deepLink, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterShortcutValue)) {
                return false;
            }
            InlineFilterShortcutValue inlineFilterShortcutValue = (InlineFilterShortcutValue) other;
            return L.f(this.deepLink, inlineFilterShortcutValue.deepLink) && L.f(this.image, inlineFilterShortcutValue.image);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        public int hashCode() {
            DeepLink deepLink = this.deepLink;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            UniversalImage universalImage = this.image;
            return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.deepLink == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            return P0.c();
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterShortcutValue(deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            return C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeParcelable(this.image, flags);
        }

        public InlineFilterShortcutValue(@l DeepLink deepLink, @l UniversalImage universalImage) {
            super(null);
            this.deepLink = deepLink;
            this.image = universalImage;
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0017¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSuggestLocationValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "suggestLocationId", "internalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterSuggestLocationValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSuggestLocationId", "getInternalId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterSuggestLocationValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterSuggestLocationValue> CREATOR = new Creator();

        @c("internal_id")
        @l
        private final String internalId;

        @c("id")
        @l
        private final String suggestLocationId;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterSuggestLocationValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSuggestLocationValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterSuggestLocationValue(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterSuggestLocationValue[] newArray(int i12) {
                return new InlineFilterSuggestLocationValue[i12];
            }
        }

        public /* synthetic */ InlineFilterSuggestLocationValue(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ InlineFilterSuggestLocationValue copy$default(InlineFilterSuggestLocationValue inlineFilterSuggestLocationValue, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inlineFilterSuggestLocationValue.suggestLocationId;
            }
            if ((i12 & 2) != 0) {
                str2 = inlineFilterSuggestLocationValue.internalId;
            }
            return inlineFilterSuggestLocationValue.copy(str, str2);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.suggestLocationId;
            if (str != null) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = this.internalId;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("changedParamValueSuggestLocation", H.o(sb2, str2, '_', str));
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getSuggestLocationId() {
            return this.suggestLocationId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getInternalId() {
            return this.internalId;
        }

        @k
        public final InlineFilterSuggestLocationValue copy(@l String suggestLocationId, @l String internalId) {
            return new InlineFilterSuggestLocationValue(suggestLocationId, internalId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterSuggestLocationValue)) {
                return false;
            }
            InlineFilterSuggestLocationValue inlineFilterSuggestLocationValue = (InlineFilterSuggestLocationValue) other;
            return L.f(this.suggestLocationId, inlineFilterSuggestLocationValue.suggestLocationId) && L.f(this.internalId, inlineFilterSuggestLocationValue.internalId);
        }

        @l
        public final String getInternalId() {
            return this.internalId;
        }

        @l
        public final String getSuggestLocationId() {
            return this.suggestLocationId;
        }

        public int hashCode() {
            String str = this.suggestLocationId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.internalId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            String str = this.suggestLocationId;
            return str == null || str.length() == 0;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.internalId;
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append('_');
            sb2.append(this.suggestLocationId);
            return Collections.singletonMap(filterId, sb2.toString());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterSuggestLocationValue(suggestLocationId=");
            sb2.append(this.suggestLocationId);
            sb2.append(", internalId=");
            return C22026a.c(sb2, this.internalId, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            if (this.suggestLocationId == null) {
                return C42784z0.f406748b;
            }
            StringBuilder sb2 = new StringBuilder();
            String str = this.internalId;
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append('_');
            sb2.append(this.suggestLocationId);
            return Collections.singletonList(sb2.toString());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.suggestLocationId);
            parcel.writeString(this.internalId);
        }

        public InlineFilterSuggestLocationValue(@l String str, @l String str2) {
            super(null);
            this.suggestLocationId = str;
            this.internalId = str2;
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001a¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineRadiusValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "Lcom/avito/android/remote/model/Radius;", "radius", "<init>", "(Lcom/avito/android/remote/model/Radius;)V", "Lcom/avito/android/remote/model/Coordinates;", "", "toValue", "(Lcom/avito/android/remote/model/Coordinates;)Ljava/lang/String;", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Lcom/avito/android/remote/model/Radius;", "copy", "(Lcom/avito/android/remote/model/Radius;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineRadiusValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Radius;", "getRadius", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineRadiusValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineRadiusValue> CREATOR = new Creator();

        @c("searchRadius")
        @l
        private final Radius radius;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineRadiusValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineRadiusValue createFromParcel(@k Parcel parcel) {
                return new InlineRadiusValue(parcel.readInt() == 0 ? null : Radius.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineRadiusValue[] newArray(int i12) {
                return new InlineRadiusValue[i12];
            }
        }

        public InlineRadiusValue(@l Radius radius) {
            super(null);
            this.radius = radius;
        }

        public static /* synthetic */ InlineRadiusValue copy$default(InlineRadiusValue inlineRadiusValue, Radius radius, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                radius = inlineRadiusValue.radius;
            }
            return inlineRadiusValue.copy(radius);
        }

        private final String toValue(Coordinates coordinates) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(coordinates.getLatitude());
            sb2.append(',');
            sb2.append(coordinates.getLongitude());
            return sb2.toString();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            Coordinates coordinates;
            Long distanceInMeters;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Radius radius = this.radius;
            if (radius != null && (distanceInMeters = radius.getDistanceInMeters()) != null) {
                linkedHashMap.put("changedParamValueRadius", String.valueOf(distanceInMeters.longValue()));
            }
            Radius radius2 = this.radius;
            if (radius2 != null && (coordinates = radius2.getCoordinates()) != null) {
                linkedHashMap.put("changedParamValueGeoCoords", toValue(coordinates));
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Radius getRadius() {
            return this.radius;
        }

        @k
        public final InlineRadiusValue copy(@l Radius radius) {
            return new InlineRadiusValue(radius);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineRadiusValue) && L.f(this.radius, ((InlineRadiusValue) other).radius);
        }

        @l
        public final Radius getRadius() {
            return this.radius;
        }

        public int hashCode() {
            Radius radius = this.radius;
            if (radius == null) {
                return 0;
            }
            return radius.hashCode();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            Radius radius = this.radius;
            return radius == null || radius.getCoordinates().isEmpty();
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            Coordinates coordinates;
            Radius radius = this.radius;
            String value = null;
            long jLongValue = (radius != null ? radius.getDistanceInMeters() : null) != null ? this.radius.getDistanceInMeters().longValue() / 1000 : 0L;
            Radius radius2 = this.radius;
            if (radius2 != null && (coordinates = radius2.getCoordinates()) != null) {
                value = toValue(coordinates);
            }
            if (value == null) {
                value = "";
            }
            return P0.g(new Q(SearchParamsConverterKt.GEO_COORDS, value), new Q("radius", String.valueOf(jLongValue)));
        }

        @k
        public String toString() {
            return "InlineRadiusValue(radius=" + this.radius + ')';
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            Long distanceInMeters;
            Coordinates coordinates;
            Radius radius = this.radius;
            String string = null;
            String value = (radius == null || (coordinates = radius.getCoordinates()) == null) ? null : toValue(coordinates);
            if (value == null) {
                value = "";
            }
            Radius radius2 = this.radius;
            if (radius2 != null && (distanceInMeters = radius2.getDistanceInMeters()) != null) {
                string = distanceInMeters.toString();
            }
            return C42745f0.U(value, string != null ? string : "");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Radius radius = this.radius;
            if (radius == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                radius.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010\u001d¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineSearchCoordinatesValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "lat", AddressParameter.Value.LNG, "", AddressParameter.TYPE, "jsonWebToken", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/Double;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineSearchCoordinatesValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Double;", "getLat", "getLng", "Ljava/lang/String;", "getAddress", "getJsonWebToken", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineSearchCoordinatesValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineSearchCoordinatesValue> CREATOR = new Creator();

        @c(AddressParameter.TYPE)
        @l
        private final String address;

        @c("jsonWebToken")
        @l
        private final String jsonWebToken;

        @c("lat")
        @l
        private final Double lat;

        @c(AddressParameter.Value.LNG)
        @l
        private final Double lng;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineSearchCoordinatesValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineSearchCoordinatesValue createFromParcel(@k Parcel parcel) {
                return new InlineSearchCoordinatesValue(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineSearchCoordinatesValue[] newArray(int i12) {
                return new InlineSearchCoordinatesValue[i12];
            }
        }

        public InlineSearchCoordinatesValue(@l Double d12, @l Double d13, @l String str, @l String str2) {
            super(null);
            this.lat = d12;
            this.lng = d13;
            this.address = str;
            this.jsonWebToken = str2;
        }

        public static /* synthetic */ InlineSearchCoordinatesValue copy$default(InlineSearchCoordinatesValue inlineSearchCoordinatesValue, Double d12, Double d13, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d12 = inlineSearchCoordinatesValue.lat;
            }
            if ((i12 & 2) != 0) {
                d13 = inlineSearchCoordinatesValue.lng;
            }
            if ((i12 & 4) != 0) {
                str = inlineSearchCoordinatesValue.address;
            }
            if ((i12 & 8) != 0) {
                str2 = inlineSearchCoordinatesValue.jsonWebToken;
            }
            return inlineSearchCoordinatesValue.copy(d12, d13, str, str2);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.address;
            if (str != null) {
                linkedHashMap.put("changedParamValue", str);
            }
            String str2 = this.jsonWebToken;
            if (str2 != null) {
                linkedHashMap.put("jsonWebToken", str2);
            }
            Double d12 = this.lat;
            if (d12 != null) {
                linkedHashMap.put("lat", String.valueOf(d12.doubleValue()));
            }
            Double d13 = this.lng;
            if (d13 != null) {
                linkedHashMap.put(AddressParameter.Value.LNG, String.valueOf(d13.doubleValue()));
            }
            return linkedHashMap;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Double getLat() {
            return this.lat;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Double getLng() {
            return this.lng;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        @k
        public final InlineSearchCoordinatesValue copy(@l Double lat, @l Double lng, @l String address, @l String jsonWebToken) {
            return new InlineSearchCoordinatesValue(lat, lng, address, jsonWebToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineSearchCoordinatesValue)) {
                return false;
            }
            InlineSearchCoordinatesValue inlineSearchCoordinatesValue = (InlineSearchCoordinatesValue) other;
            return L.f(this.lat, inlineSearchCoordinatesValue.lat) && L.f(this.lng, inlineSearchCoordinatesValue.lng) && L.f(this.address, inlineSearchCoordinatesValue.address) && L.f(this.jsonWebToken, inlineSearchCoordinatesValue.jsonWebToken);
        }

        @l
        public final String getAddress() {
            return this.address;
        }

        @l
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        @l
        public final Double getLat() {
            return this.lat;
        }

        @l
        public final Double getLng() {
            return this.lng;
        }

        public int hashCode() {
            Double d12 = this.lat;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.lng;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.address;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.jsonWebToken;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.lat == null || this.lng == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String strConcat = filterId.concat("[geoCoords]");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.lat);
            sb2.append(',');
            sb2.append(this.lng);
            return Collections.singletonMap(strConcat, sb2.toString());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineSearchCoordinatesValue(lat=");
            sb2.append(this.lat);
            sb2.append(", lng=");
            sb2.append(this.lng);
            sb2.append(", address=");
            sb2.append(this.address);
            sb2.append(", jsonWebToken=");
            return C22026a.c(sb2, this.jsonWebToken, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.lat);
            sb2.append(',');
            sb2.append(this.lng);
            String string = sb2.toString();
            String str = this.address;
            if (str == null) {
                str = "";
            }
            return C42745f0.U(string, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Double d12 = this.lat;
            if (d12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
            }
            Double d13 = this.lng;
            if (d13 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
            }
            parcel.writeString(this.address);
            parcel.writeString(this.jsonWebToken);
        }
    }

    public /* synthetic */ InlineFilterValue(C42822w c42822w) {
        this();
    }

    public static /* synthetic */ Map queryMap$default(InlineFilterValue inlineFilterValue, String str, String str2, Filter.FilterMapping filterMapping, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryMap");
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        if ((i12 & 4) != 0) {
            filterMapping = null;
        }
        return inlineFilterValue.queryMap(str, str2, filterMapping);
    }

    @k
    public abstract Map<String, String> changedParamsMap();

    public abstract boolean isEmpty();

    @k
    public abstract Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping);

    @k
    public abstract List<String> toStringList();

    private InlineFilterValue() {
    }

    /* compiled from: InlineFilterValue.kt */
    @s0
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J4\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b7\u00108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010'R\u001a\u0010C\u001a\u00020>8BX\u0082\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDateRangeValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "Ljava/util/Date;", InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterDateRangeValue.TO_PARAM_NAME, "", "flex", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;)V", "", "format", "Lkotlin/Q;", "formatFromToAsPair", "(Ljava/lang/String;)Lkotlin/Q;", "filterId", "getWrappedId", "(Ljava/lang/String;)Ljava/lang/String;", "getNumericId", "value", "extractDigits", "", "isEmpty", "()Z", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "", "toStringList", "()Ljava/util/List;", "getFilterValueIds", "(Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/List;", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDateRangeValue;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Date;", "getFrom", "getTo", "Ljava/lang/Integer;", "getFlex", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "getLocale$annotations", "()V", "locale", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class InlineFilterDateRangeValue extends InlineFilterValue {

        @k
        @Deprecated
        public static final String FROM_PARAM_NAME = "from";

        @k
        @Deprecated
        public static final String NUMERIC_ID_REGEX_PATTERN = "\\d+";

        @k
        @Deprecated
        public static final String TO_PARAM_NAME = "to";

        @k
        @Deprecated
        public static final String WRAPPED_PARAM_PREFIX = "params";

        @c("flex")
        @l
        private final Integer flex;

        @c(FROM_PARAM_NAME)
        @l
        private final Date from;

        @c(TO_PARAM_NAME)
        @l
        private final Date to;

        @k
        private static final Companion Companion = new Companion(null);

        @k
        public static final Parcelable.Creator<InlineFilterDateRangeValue> CREATOR = new Creator();

        /* compiled from: InlineFilterValue.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterDateRangeValue$Companion;", "", "()V", "FROM_PARAM_NAME", "", "NUMERIC_ID_REGEX_PATTERN", "TO_PARAM_NAME", "WRAPPED_PARAM_PREFIX", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            private Companion() {
            }
        }

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterDateRangeValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDateRangeValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterDateRangeValue((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterDateRangeValue[] newArray(int i12) {
                return new InlineFilterDateRangeValue[i12];
            }
        }

        public InlineFilterDateRangeValue(@l Date date, @l Date date2, @l Integer num) {
            super(null);
            this.from = date;
            this.to = date2;
            this.flex = num;
        }

        public static /* synthetic */ InlineFilterDateRangeValue copy$default(InlineFilterDateRangeValue inlineFilterDateRangeValue, Date date, Date date2, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                date = inlineFilterDateRangeValue.from;
            }
            if ((i12 & 2) != 0) {
                date2 = inlineFilterDateRangeValue.to;
            }
            if ((i12 & 4) != 0) {
                num = inlineFilterDateRangeValue.flex;
            }
            return inlineFilterDateRangeValue.copy(date, date2, num);
        }

        private final String extractDigits(String value) {
            InterfaceC43057n interfaceC43057nB = C43059p.b(new C43059p(NUMERIC_ID_REGEX_PATTERN), value);
            if (interfaceC43057nB != null) {
                return interfaceC43057nB.getValue();
            }
            return null;
        }

        private final Q<String, String> formatFromToAsPair(String format) {
            if (format == null) {
                format = BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, getLocale());
            Date date = this.from;
            String str = date == null ? "" : simpleDateFormat.format(date);
            Date date2 = this.to;
            return new Q<>(str, date2 != null ? simpleDateFormat.format(date2) : "");
        }

        public static /* synthetic */ Q formatFromToAsPair$default(InlineFilterDateRangeValue inlineFilterDateRangeValue, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = null;
            }
            return inlineFilterDateRangeValue.formatFromToAsPair(str);
        }

        private final Locale getLocale() {
            return new Locale("ru", "RU");
        }

        private final String getNumericId(String filterId) {
            if (filterId == null) {
                return null;
            }
            return extractDigits(filterId);
        }

        private final String getWrappedId(String filterId) {
            if (filterId == null) {
                return null;
            }
            if (C43066x.h0(filterId, "params", false)) {
                return filterId;
            }
            String strExtractDigits = extractDigits(filterId);
            if (strExtractDigits != null) {
                return C22491k0.a(']', "params[", strExtractDigits);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            Q fromToAsPair$default = formatFromToAsPair$default(this, null, 1, null);
            String str = (String) fromToAsPair$default.f406619b;
            String str2 = (String) fromToAsPair$default.f406620c;
            kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
            if (str.length() > 0) {
                dVar.put("changedParamValueFrom", str);
            }
            if (str2.length() > 0) {
                dVar.put("changedParamValueTo", str2);
            }
            Integer num = this.flex;
            if (num != null) {
                dVar.put("changedParamValueChips", num.toString());
            }
            return dVar.b();
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Date getFrom() {
            return this.from;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Date getTo() {
            return this.to;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getFlex() {
            return this.flex;
        }

        @k
        public final InlineFilterDateRangeValue copy(@l Date from, @l Date to2, @l Integer flex) {
            return new InlineFilterDateRangeValue(from, to2, flex);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterDateRangeValue)) {
                return false;
            }
            InlineFilterDateRangeValue inlineFilterDateRangeValue = (InlineFilterDateRangeValue) other;
            return L.f(this.from, inlineFilterDateRangeValue.from) && L.f(this.to, inlineFilterDateRangeValue.to) && L.f(this.flex, inlineFilterDateRangeValue.flex);
        }

        @k
        public final List<String> getFilterValueIds(@l Filter.FilterMapping mapping) {
            String str = null;
            String numericId = getNumericId(mapping != null ? mapping.getInSearch() : null);
            if (numericId != null && this.flex != null) {
                str = numericId;
            }
            return C42756l.B(new String[]{FROM_PARAM_NAME, TO_PARAM_NAME, str});
        }

        @l
        public final Integer getFlex() {
            return this.flex;
        }

        @l
        public final Date getFrom() {
            return this.from;
        }

        @l
        public final Date getTo() {
            return this.to;
        }

        public int hashCode() {
            Date date = this.from;
            int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
            Date date2 = this.to;
            int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
            Integer num = this.flex;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.from == null && this.to == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            Integer num;
            Q<String, String> fromToAsPair = formatFromToAsPair(format);
            String str = fromToAsPair.f406619b;
            String str2 = fromToAsPair.f406620c;
            String wrappedId = getWrappedId(mapping != null ? mapping.getInSearch() : null);
            kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
            dVar.put(filterId.concat("[from]"), str);
            dVar.put(filterId.concat("[to]"), str2);
            if (wrappedId != null && (num = this.flex) != null) {
                dVar.put(wrappedId, num.toString());
            }
            return dVar.b();
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterDateRangeValue(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            sb2.append(this.to);
            sb2.append(", flex=");
            return s.j(sb2, this.flex, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            Q fromToAsPair$default = formatFromToAsPair$default(this, null, 1, null);
            String str = (String) fromToAsPair$default.f406619b;
            String str2 = (String) fromToAsPair$default.f406620c;
            Integer num = this.flex;
            return C42756l.B(new String[]{str, str2, num != null ? num.toString() : null});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeSerializable(this.from);
            parcel.writeSerializable(this.to);
            Integer num = this.flex;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
        }

        private static /* synthetic */ void getLocale$annotations() {
        }
    }

    /* compiled from: InlineFilterValue.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018JF\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0018R\"\u00109\u001a\n 5*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010!¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterGuestsSelectValue;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "", "version", "totalCount", "adultsCount", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "", "isEmpty", "()Z", "filterId", "format", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "queryMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;)Ljava/util/Map;", "changedParamsMap", "()Ljava/util/Map;", "toStringList", "()Ljava/util/List;", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/remote/model/search/InlineFilterValue$InlineFilterGuestsSelectValue;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getVersion", "getTotalCount", "getAdultsCount", "Ljava/util/List;", "getChildren", "kotlin.jvm.PlatformType", "getJson", "getJson$annotations", "()V", "json", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFilterGuestsSelectValue extends InlineFilterValue {

        @k
        public static final Parcelable.Creator<InlineFilterGuestsSelectValue> CREATOR = new Creator();

        @c("adultsCount")
        @l
        private final Integer adultsCount;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
        @l
        private final List<String> children;

        @c("totalCount")
        @l
        private final Integer totalCount;

        @c("version")
        @l
        private final Integer version;

        /* compiled from: InlineFilterValue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InlineFilterGuestsSelectValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterGuestsSelectValue createFromParcel(@k Parcel parcel) {
                return new InlineFilterGuestsSelectValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InlineFilterGuestsSelectValue[] newArray(int i12) {
                return new InlineFilterGuestsSelectValue[i12];
            }
        }

        public InlineFilterGuestsSelectValue(@l Integer num, @l Integer num2, @l Integer num3, @l List<String> list) {
            super(null);
            this.version = num;
            this.totalCount = num2;
            this.adultsCount = num3;
            this.children = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineFilterGuestsSelectValue copy$default(InlineFilterGuestsSelectValue inlineFilterGuestsSelectValue, Integer num, Integer num2, Integer num3, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = inlineFilterGuestsSelectValue.version;
            }
            if ((i12 & 2) != 0) {
                num2 = inlineFilterGuestsSelectValue.totalCount;
            }
            if ((i12 & 4) != 0) {
                num3 = inlineFilterGuestsSelectValue.adultsCount;
            }
            if ((i12 & 8) != 0) {
                list = inlineFilterGuestsSelectValue.children;
            }
            return inlineFilterGuestsSelectValue.copy(num, num2, num3, list);
        }

        private final String getJson() {
            return new com.google.gson.d().a().l(this);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> changedParamsMap() {
            String json = getJson();
            if (json == null) {
                json = "";
            }
            return Collections.singletonMap("changedParamValue", json);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getTotalCount() {
            return this.totalCount;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getAdultsCount() {
            return this.adultsCount;
        }

        @l
        public final List<String> component4() {
            return this.children;
        }

        @k
        public final InlineFilterGuestsSelectValue copy(@l Integer version, @l Integer totalCount, @l Integer adultsCount, @l List<String> children) {
            return new InlineFilterGuestsSelectValue(version, totalCount, adultsCount, children);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InlineFilterGuestsSelectValue)) {
                return false;
            }
            InlineFilterGuestsSelectValue inlineFilterGuestsSelectValue = (InlineFilterGuestsSelectValue) other;
            return L.f(this.version, inlineFilterGuestsSelectValue.version) && L.f(this.totalCount, inlineFilterGuestsSelectValue.totalCount) && L.f(this.adultsCount, inlineFilterGuestsSelectValue.adultsCount) && L.f(this.children, inlineFilterGuestsSelectValue.children);
        }

        @l
        public final Integer getAdultsCount() {
            return this.adultsCount;
        }

        @l
        public final List<String> getChildren() {
            return this.children;
        }

        @l
        public final Integer getTotalCount() {
            return this.totalCount;
        }

        @l
        public final Integer getVersion() {
            return this.version;
        }

        public int hashCode() {
            Integer num = this.version;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.totalCount;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.adultsCount;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<String> list = this.children;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        public boolean isEmpty() {
            return this.version == null || this.totalCount == null || this.adultsCount == null || this.children == null;
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public Map<String, String> queryMap(@k String filterId, @l String format, @l Filter.FilterMapping mapping) {
            String json = getJson();
            if (json == null) {
                json = "";
            }
            return Collections.singletonMap(filterId, json);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterGuestsSelectValue(version=");
            sb2.append(this.version);
            sb2.append(", totalCount=");
            sb2.append(this.totalCount);
            sb2.append(", adultsCount=");
            sb2.append(this.adultsCount);
            sb2.append(", children=");
            return H.p(sb2, this.children, ')');
        }

        @Override // com.avito.android.remote.model.search.InlineFilterValue
        @k
        public List<String> toStringList() {
            return getJson() != null ? Collections.singletonList(getJson()) : C42784z0.f406748b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.version;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.totalCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Integer num3 = this.adultsCount;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num3);
            }
            parcel.writeStringList(this.children);
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }
}

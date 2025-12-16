package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MarkersFeatures.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/MarkersFeatures;", "", "isBeduinPinItems", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/MarkersFeatures;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MarkersFeatures {

    @c("beduinPinItems")
    @l
    private final Boolean isBeduinPinItems;

    public MarkersFeatures(@l Boolean bool) {
        this.isBeduinPinItems = bool;
    }

    public static /* synthetic */ MarkersFeatures copy$default(MarkersFeatures markersFeatures, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = markersFeatures.isBeduinPinItems;
        }
        return markersFeatures.copy(bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsBeduinPinItems() {
        return this.isBeduinPinItems;
    }

    @k
    public final MarkersFeatures copy(@l Boolean isBeduinPinItems) {
        return new MarkersFeatures(isBeduinPinItems);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkersFeatures) && L.f(this.isBeduinPinItems, ((MarkersFeatures) other).isBeduinPinItems);
    }

    public int hashCode() {
        Boolean bool = this.isBeduinPinItems;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @l
    public final Boolean isBeduinPinItems() {
        return this.isBeduinPinItems;
    }

    @k
    public String toString() {
        return C0.g(new StringBuilder("MarkersFeatures(isBeduinPinItems="), this.isBeduinPinItems, ')');
    }
}

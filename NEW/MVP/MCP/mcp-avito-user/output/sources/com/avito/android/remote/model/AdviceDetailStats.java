package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/AdviceDetailStats;", "", "views", "", "contacts", "conversion", "(FFF)V", "getContacts", "()F", "getConversion", "getViews", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdviceDetailStats {

    @c("contacts")
    private final float contacts;

    @c("conversion")
    private final float conversion;

    @c("views")
    private final float views;

    public AdviceDetailStats(float f12, float f13, float f14) {
        this.views = f12;
        this.contacts = f13;
        this.conversion = f14;
    }

    public static /* synthetic */ AdviceDetailStats copy$default(AdviceDetailStats adviceDetailStats, float f12, float f13, float f14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f12 = adviceDetailStats.views;
        }
        if ((i12 & 2) != 0) {
            f13 = adviceDetailStats.contacts;
        }
        if ((i12 & 4) != 0) {
            f14 = adviceDetailStats.conversion;
        }
        return adviceDetailStats.copy(f12, f13, f14);
    }

    /* renamed from: component1, reason: from getter */
    public final float getViews() {
        return this.views;
    }

    /* renamed from: component2, reason: from getter */
    public final float getContacts() {
        return this.contacts;
    }

    /* renamed from: component3, reason: from getter */
    public final float getConversion() {
        return this.conversion;
    }

    @k
    public final AdviceDetailStats copy(float views, float contacts, float conversion) {
        return new AdviceDetailStats(views, contacts, conversion);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdviceDetailStats)) {
            return false;
        }
        AdviceDetailStats adviceDetailStats = (AdviceDetailStats) other;
        return Float.compare(this.views, adviceDetailStats.views) == 0 && Float.compare(this.contacts, adviceDetailStats.contacts) == 0 && Float.compare(this.conversion, adviceDetailStats.conversion) == 0;
    }

    public final float getContacts() {
        return this.contacts;
    }

    public final float getConversion() {
        return this.conversion;
    }

    public final float getViews() {
        return this.views;
    }

    public int hashCode() {
        return Float.hashCode(this.conversion) + r.d(this.contacts, Float.hashCode(this.views) * 31, 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdviceDetailStats(views=");
        sb2.append(this.views);
        sb2.append(", contacts=");
        sb2.append(this.contacts);
        sb2.append(", conversion=");
        return r.k(')', this.conversion, sb2);
    }
}

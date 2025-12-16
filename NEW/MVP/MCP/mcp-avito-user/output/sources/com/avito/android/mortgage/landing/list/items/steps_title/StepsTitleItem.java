package com.avito.android.mortgage.landing.list.items.steps_title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.steps.StepsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepsTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/steps_title/StepsTitleItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StepsTitleItem implements LandingItem {

    @k
    public static final Parcelable.Creator<StepsTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199998b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f199999c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<StepsItem> f200000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f200001e;

    /* compiled from: StepsTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepsTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final StepsTitleItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(StepsTitleItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StepsItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StepsTitleItem(attributedText, string, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StepsTitleItem[] newArray(int i12) {
            return new StepsTitleItem[i12];
        }
    }

    public StepsTitleItem(@k AttributedText attributedText, @k String str, @k List list, boolean z12) {
        this.f199998b = str;
        this.f199999c = attributedText;
        this.f200000d = list;
        this.f200001e = z12;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    public final LandingItem N() {
        List<StepsItem> list = this.f200000d;
        return new StepsTitleItem(this.f199999c, this.f199998b, list, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepsTitleItem)) {
            return false;
        }
        StepsTitleItem stepsTitleItem = (StepsTitleItem) obj;
        return L.f(this.f199998b, stepsTitleItem.f199998b) && L.f(this.f199999c, stepsTitleItem.f199999c) && L.f(this.f200000d, stepsTitleItem.f200000d) && this.f200001e == stepsTitleItem.f200001e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77948b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199973b() {
        return this.f199998b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200001e) + H.e(com.avito.android.actions_sheet.a.b(this.f199998b.hashCode() * 31, 31, this.f199999c), 31, this.f200000d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepsTitleItem(stringId=");
        sb2.append(this.f199998b);
        sb2.append(", title=");
        sb2.append(this.f199999c);
        sb2.append(", steps=");
        sb2.append(this.f200000d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f200001e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199998b);
        parcel.writeParcelable(this.f199999c, i12);
        Iterator itJ = C0.j(this.f200000d, parcel);
        while (itJ.hasNext()) {
            ((StepsItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f200001e ? 1 : 0);
    }

    public /* synthetic */ StepsTitleItem(String str, AttributedText attributedText, List list, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, list, (i12 & 8) != 0 ? true : z12);
    }
}

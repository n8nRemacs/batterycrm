package com.avito.android.mortgage.landing.list.items.faq_title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.expandable_block.ExpandableBlockItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FaqTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/faq_title/FaqTitleItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FaqTitleItem implements LandingItem {

    @k
    public static final Parcelable.Creator<FaqTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f199720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ExpandableBlockItem> f199721d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f199722e;

    /* compiled from: FaqTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FaqTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final FaqTitleItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FaqTitleItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ExpandableBlockItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FaqTitleItem(attributedText, string, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FaqTitleItem[] newArray(int i12) {
            return new FaqTitleItem[i12];
        }
    }

    public FaqTitleItem(@k AttributedText attributedText, @k String str, @k List list, boolean z12) {
        this.f199719b = str;
        this.f199720c = attributedText;
        this.f199721d = list;
        this.f199722e = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FaqTitleItem a(FaqTitleItem faqTitleItem, ArrayList arrayList, int i12) {
        String str = faqTitleItem.f199719b;
        AttributedText attributedText = faqTitleItem.f199720c;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = faqTitleItem.f199721d;
        }
        boolean z12 = (i12 & 8) != 0 ? faqTitleItem.f199722e : false;
        faqTitleItem.getClass();
        return new FaqTitleItem(attributedText, str, list, z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    public final LandingItem N() {
        return a(this, null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqTitleItem)) {
            return false;
        }
        FaqTitleItem faqTitleItem = (FaqTitleItem) obj;
        return L.f(this.f199719b, faqTitleItem.f199719b) && L.f(this.f199720c, faqTitleItem.f199720c) && L.f(this.f199721d, faqTitleItem.f199721d) && this.f199722e == faqTitleItem.f199722e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77948b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77949c() {
        return this.f199719b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199722e) + H.e(com.avito.android.actions_sheet.a.b(this.f199719b.hashCode() * 31, 31, this.f199720c), 31, this.f199721d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqTitleItem(stringId=");
        sb2.append(this.f199719b);
        sb2.append(", title=");
        sb2.append(this.f199720c);
        sb2.append(", blocks=");
        sb2.append(this.f199721d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199722e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199719b);
        parcel.writeParcelable(this.f199720c, i12);
        Iterator itJ = C0.j(this.f199721d, parcel);
        while (itJ.hasNext()) {
            ((ExpandableBlockItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f199722e ? 1 : 0);
    }

    public /* synthetic */ FaqTitleItem(String str, AttributedText attributedText, List list, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, list, (i12 & 8) != 0 ? true : z12);
    }
}

package com.avito.android.code_check.phone_list.adapter.empty_search;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptySearchItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/empty_search/EmptySearchItem;", "Lcom/avito/android/code_check/phone_list/adapter/PhoneListItem;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmptySearchItem implements PhoneListItem {

    @k
    public static final Parcelable.Creator<EmptySearchItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f118924b;

    /* compiled from: EmptySearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptySearchItem> {
        @Override // android.os.Parcelable.Creator
        public final EmptySearchItem createFromParcel(Parcel parcel) {
            return new EmptySearchItem((PrintableText) parcel.readParcelable(EmptySearchItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EmptySearchItem[] newArray(int i12) {
            return new EmptySearchItem[i12];
        }
    }

    public EmptySearchItem(@k PrintableText printableText) {
        this.f118924b = printableText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmptySearchItem) && L.f(this.f118924b, ((EmptySearchItem) obj).f118924b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85286b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF118933d() {
        return "com.avito.android.code_check.phone_list.adapter.empty_search.EmptySearchItem";
    }

    public final int hashCode() {
        return this.f118924b.hashCode();
    }

    @k
    public final String toString() {
        return AK.c.m(new StringBuilder("EmptySearchItem(text="), this.f118924b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f118924b, i12);
    }
}

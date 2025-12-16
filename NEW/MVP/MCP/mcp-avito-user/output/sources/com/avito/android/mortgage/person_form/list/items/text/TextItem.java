package com.avito.android.mortgage.person_form.list.items.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/text/TextItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TextItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<TextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200813b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f200814c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200815d;

    /* compiled from: TextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextItem> {
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            return new TextItem((AttributedText) parcel.readParcelable(TextItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i12) {
            return new TextItem[i12];
        }
    }

    public TextItem(@k AttributedText attributedText, @k String str, boolean z12) {
        this.f200813b = str;
        this.f200814c = attributedText;
        this.f200815d = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new TextItem(this.f200814c, this.f200813b, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItem)) {
            return false;
        }
        TextItem textItem = (TextItem) obj;
        return L.f(this.f200813b, textItem.f200813b) && L.f(this.f200814c, textItem.f200814c) && this.f200815d == textItem.f200815d;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200611g() {
        return this.f200815d;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    public final String getStringId() {
        return this.f200813b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200815d) + com.avito.android.actions_sheet.a.b(this.f200813b.hashCode() * 31, 31, this.f200814c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextItem(stringId=");
        sb2.append(this.f200813b);
        sb2.append(", text=");
        sb2.append(this.f200814c);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200815d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200813b);
        parcel.writeParcelable(this.f200814c, i12);
        parcel.writeInt(this.f200815d ? 1 : 0);
    }

    public /* synthetic */ TextItem(String str, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(attributedText, str, (i12 & 4) != 0 ? true : z12);
    }
}

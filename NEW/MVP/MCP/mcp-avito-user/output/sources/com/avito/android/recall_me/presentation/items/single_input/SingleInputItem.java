package com.avito.android.recall_me.presentation.items.single_input;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SingleInputItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/SingleInputItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SingleInputItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SingleInputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f251943b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SingleInputType f251944c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f251945d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FormatterType f251946e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f251947f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f251948g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f251949h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f251950i;

    /* compiled from: SingleInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SingleInputItem> {
        @Override // android.os.Parcelable.Creator
        public final SingleInputItem createFromParcel(Parcel parcel) {
            return new SingleInputItem(parcel.readString(), SingleInputType.valueOf(parcel.readString()), parcel.readString(), (FormatterType) parcel.readParcelable(SingleInputItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SingleInputItem[] newArray(int i12) {
            return new SingleInputItem[i12];
        }
    }

    public SingleInputItem(@Y61.k String str, @Y61.k SingleInputType singleInputType, @Y61.k String str2, @Y61.k FormatterType formatterType, @l String str3, @l String str4, @l String str5, boolean z12) {
        this.f251943b = str;
        this.f251944c = singleInputType;
        this.f251945d = str2;
        this.f251946e = formatterType;
        this.f251947f = str3;
        this.f251948g = str4;
        this.f251949h = str5;
        this.f251950i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleInputItem)) {
            return false;
        }
        SingleInputItem singleInputItem = (SingleInputItem) obj;
        return L.f(this.f251943b, singleInputItem.f251943b) && this.f251944c == singleInputItem.f251944c && L.f(this.f251945d, singleInputItem.f251945d) && L.f(this.f251946e, singleInputItem.f251946e) && L.f(this.f251947f, singleInputItem.f251947f) && L.f(this.f251948g, singleInputItem.f251948g) && L.f(this.f251949h, singleInputItem.f251949h) && this.f251950i == singleInputItem.f251950i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return getF202552b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202552b() {
        return this.f251943b;
    }

    public final int hashCode() {
        int iHashCode = (this.f251946e.hashCode() + H.d((this.f251944c.hashCode() + (this.f251943b.hashCode() * 31)) * 31, 31, this.f251945d)) * 31;
        String str = this.f251947f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f251948g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f251949h;
        return Boolean.hashCode(this.f251950i) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleInputItem(stringId=");
        sb2.append(this.f251943b);
        sb2.append(", inputType=");
        sb2.append(this.f251944c);
        sb2.append(", inputTitle=");
        sb2.append(this.f251945d);
        sb2.append(", formatterType=");
        sb2.append(this.f251946e);
        sb2.append(", filterPattern=");
        sb2.append(this.f251947f);
        sb2.append(", hint=");
        sb2.append(this.f251948g);
        sb2.append(", value=");
        sb2.append(this.f251949h);
        sb2.append(", hasError=");
        return r.x(sb2, this.f251950i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f251943b);
        parcel.writeString(this.f251944c.name());
        parcel.writeString(this.f251945d);
        parcel.writeParcelable(this.f251946e, i12);
        parcel.writeString(this.f251947f);
        parcel.writeString(this.f251948g);
        parcel.writeString(this.f251949h);
        parcel.writeInt(this.f251950i ? 1 : 0);
    }

    public /* synthetic */ SingleInputItem(String str, SingleInputType singleInputType, String str2, FormatterType formatterType, String str3, String str4, String str5, boolean z12, int i12, C42822w c42822w) {
        this(str, singleInputType, str2, formatterType, str3, str4, str5, (i12 & 128) != 0 ? false : z12);
    }
}

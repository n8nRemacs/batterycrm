package com.avito.android.recall_me.presentation.items.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecallMeTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/title/RecallMeTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251976b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f251977c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f251978d;

    /* compiled from: RecallMeTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeTitleItem createFromParcel(Parcel parcel) {
            return new RecallMeTitleItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeTitleItem[] newArray(int i12) {
            return new RecallMeTitleItem[i12];
        }
    }

    public RecallMeTitleItem(@k String str, @k String str2, @l String str3) {
        this.f251976b = str;
        this.f251977c = str2;
        this.f251978d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF248601b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248601b() {
        return this.f251976b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f251976b);
        parcel.writeString(this.f251977c);
        parcel.writeString(this.f251978d);
    }

    public /* synthetic */ RecallMeTitleItem(String str, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? RecallMeTitleItem.class.getName() : str, str2, str3);
    }
}

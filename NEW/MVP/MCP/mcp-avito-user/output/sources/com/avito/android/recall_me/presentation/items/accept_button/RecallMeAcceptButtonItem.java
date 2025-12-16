package com.avito.android.recall_me.presentation.items.accept_button;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecallMeAcceptButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/accept_button/RecallMeAcceptButtonItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecallMeAcceptButtonItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeAcceptButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251932b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f251933c;

    /* compiled from: RecallMeAcceptButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeAcceptButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeAcceptButtonItem createFromParcel(Parcel parcel) {
            return new RecallMeAcceptButtonItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeAcceptButtonItem[] newArray(int i12) {
            return new RecallMeAcceptButtonItem[i12];
        }
    }

    public RecallMeAcceptButtonItem(@k String str, @k String str2) {
        this.f251932b = str;
        this.f251933c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF251932b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF251932b() {
        return this.f251932b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f251932b);
        parcel.writeString(this.f251933c);
    }

    public /* synthetic */ RecallMeAcceptButtonItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? RecallMeAcceptButtonItem.class.getName() : str, str2);
    }
}

package com.avito.android.advert.item.chat_history;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ChatHistory;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChatHistoryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/chat_history/ChatHistoryItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatHistoryItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<ChatHistoryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f74242c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ChatHistory f74243d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74244e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74245f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f74246g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f74247h;

    /* compiled from: ChatHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChatHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final ChatHistoryItem createFromParcel(Parcel parcel) {
            return new ChatHistoryItem(parcel.readLong(), parcel.readString(), (ChatHistory) parcel.readParcelable(ChatHistoryItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChatHistoryItem[] newArray(int i12) {
            return new ChatHistoryItem[i12];
        }
    }

    public ChatHistoryItem(long j12, @k String str, @k ChatHistory chatHistory, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f74241b = j12;
        this.f74242c = str;
        this.f74243d = chatHistory;
        this.f74244e = z12;
        this.f74245f = i12;
        this.f74246g = serpDisplayType;
        this.f74247h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new ChatHistoryItem(this.f74241b, this.f74242c, this.f74243d, this.f74244e, i12, this.f74246g, this.f74247h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74246g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistoryItem)) {
            return false;
        }
        ChatHistoryItem chatHistoryItem = (ChatHistoryItem) obj;
        return this.f74241b == chatHistoryItem.f74241b && L.f(this.f74242c, chatHistoryItem.f74242c) && L.f(this.f74243d, chatHistoryItem.f74243d) && this.f74244e == chatHistoryItem.f74244e && this.f74245f == chatHistoryItem.f74245f && this.f74246g == chatHistoryItem.f74246g && this.f74247h == chatHistoryItem.f74247h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f74241b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f74245f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f74242c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f74247h;
    }

    public final int hashCode() {
        return this.f74247h.hashCode() + com.avito.android.actions_sheet.a.h(this.f74246g, r.e(this.f74245f, r.i((this.f74243d.hashCode() + H.d(Long.hashCode(this.f74241b) * 31, 31, this.f74242c)) * 31, 31, this.f74244e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatHistoryItem(id=");
        sb2.append(this.f74241b);
        sb2.append(", stringId=");
        sb2.append(this.f74242c);
        sb2.append(", chat=");
        sb2.append(this.f74243d);
        sb2.append(", isRestyle=");
        sb2.append(this.f74244e);
        sb2.append(", spanCount=");
        sb2.append(this.f74245f);
        sb2.append(", displayType=");
        sb2.append(this.f74246g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74247h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f74241b);
        parcel.writeString(this.f74242c);
        parcel.writeParcelable(this.f74243d, i12);
        parcel.writeInt(this.f74244e ? 1 : 0);
        parcel.writeInt(this.f74245f);
        parcel.writeString(this.f74246g.name());
        parcel.writeString(this.f74247h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatHistoryItem(long j12, String str, ChatHistory chatHistory, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 125;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, chatHistory, z12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}

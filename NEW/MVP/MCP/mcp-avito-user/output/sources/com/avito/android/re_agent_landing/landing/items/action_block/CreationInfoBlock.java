package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/CreationInfoBlock;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreationInfoBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<CreationInfoBlock> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250726b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f250727c;

    /* compiled from: ActionBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreationInfoBlock> {
        @Override // android.os.Parcelable.Creator
        public final CreationInfoBlock createFromParcel(Parcel parcel) {
            return new CreationInfoBlock(parcel.readString(), (AttributedText) parcel.readParcelable(CreationInfoBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CreationInfoBlock[] newArray(int i12) {
            return new CreationInfoBlock[i12];
        }
    }

    public CreationInfoBlock(@k String str, @k AttributedText attributedText) {
        this.f250726b = str;
        this.f250727c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationInfoBlock)) {
            return false;
        }
        CreationInfoBlock creationInfoBlock = (CreationInfoBlock) obj;
        return L.f(this.f250726b, creationInfoBlock.f250726b) && L.f(this.f250727c, creationInfoBlock.f250727c);
    }

    public final int hashCode() {
        return this.f250727c.hashCode() + (this.f250726b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationInfoBlock(title=");
        sb2.append(this.f250726b);
        sb2.append(", list=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f250727c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250726b);
        parcel.writeParcelable(this.f250727c, i12);
    }
}

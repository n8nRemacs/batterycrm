package com.avito.android.stories;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StoriesArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/StoriesArguments;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoriesArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<StoriesArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f284989c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Intent f284990d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f284991e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f284992f;

    /* compiled from: StoriesArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoriesArguments> {
        @Override // android.os.Parcelable.Creator
        public final StoriesArguments createFromParcel(Parcel parcel) {
            return new StoriesArguments(parcel.readString(), parcel.readString(), (Intent) parcel.readParcelable(StoriesArguments.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesArguments[] newArray(int i12) {
            return new StoriesArguments[i12];
        }
    }

    public StoriesArguments(@Y61.k String str, @Y61.l String str2, @Y61.l Intent intent, @Y61.l String str3, @Y61.l String str4) {
        this.f284988b = str;
        this.f284989c = str2;
        this.f284990d = intent;
        this.f284991e = str3;
        this.f284992f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesArguments)) {
            return false;
        }
        StoriesArguments storiesArguments = (StoriesArguments) obj;
        return L.f(this.f284988b, storiesArguments.f284988b) && L.f(this.f284989c, storiesArguments.f284989c) && L.f(this.f284990d, storiesArguments.f284990d) && L.f(this.f284991e, storiesArguments.f284991e) && L.f(this.f284992f, storiesArguments.f284992f);
    }

    public final int hashCode() {
        int iHashCode = this.f284988b.hashCode() * 31;
        String str = this.f284989c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.f284990d;
        int iHashCode3 = (iHashCode2 + (intent == null ? 0 : intent.hashCode())) * 31;
        String str2 = this.f284991e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f284992f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoriesArguments(url=");
        sb2.append(this.f284988b);
        sb2.append(", selectedPage=");
        sb2.append(this.f284989c);
        sb2.append(", upIntent=");
        sb2.append(this.f284990d);
        sb2.append(", cid=");
        sb2.append(this.f284991e);
        sb2.append(", crossCategoryTag=");
        return C22026a.c(sb2, this.f284992f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f284988b);
        parcel.writeString(this.f284989c);
        parcel.writeParcelable(this.f284990d, i12);
        parcel.writeString(this.f284991e);
        parcel.writeString(this.f284992f);
    }

    public /* synthetic */ StoriesArguments(String str, String str2, Intent intent, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : intent, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}

package com.avito.android.gig_snippet.list.snippet;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: GigShiftSnippetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_snippet/list/snippet/GigShiftSnippetTimer;", "Landroid/os/Parcelable;", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftSnippetTimer implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftSnippetTimer> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f161043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f161044c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f161045d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161046e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f161047f;

    /* compiled from: GigShiftSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftSnippetTimer> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetTimer createFromParcel(Parcel parcel) {
            return new GigShiftSnippetTimer(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftSnippetTimer[] newArray(int i12) {
            return new GigShiftSnippetTimer[i12];
        }
    }

    public GigShiftSnippetTimer(@InterfaceC42150f int i12, long j12, @k String str, @k String str2, boolean z12) {
        this.f161043b = j12;
        this.f161044c = z12;
        this.f161045d = str;
        this.f161046e = i12;
        this.f161047f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f161043b);
        parcel.writeInt(this.f161044c ? 1 : 0);
        parcel.writeString(this.f161045d);
        parcel.writeInt(this.f161046e);
        parcel.writeString(this.f161047f);
    }
}

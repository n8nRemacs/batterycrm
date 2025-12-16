package com.avito.android.lib.design.page_indicator_re23.state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PageIndicatorState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/page_indicator_re23/state/PageIndicatorState;", "Landroid/os/Parcelable;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PageIndicatorState implements Parcelable {

    @k
    public static final Parcelable.Creator<PageIndicatorState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f179932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179933c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f179934d;

    /* compiled from: PageIndicatorState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PageIndicatorState> {
        @Override // android.os.Parcelable.Creator
        public final PageIndicatorState createFromParcel(Parcel parcel) {
            return new PageIndicatorState(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PageIndicatorState[] newArray(int i12) {
            return new PageIndicatorState[i12];
        }
    }

    public PageIndicatorState(int i12, int i13, boolean z12) {
        this.f179932b = i12;
        this.f179933c = i13;
        this.f179934d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageIndicatorState)) {
            return false;
        }
        PageIndicatorState pageIndicatorState = (PageIndicatorState) obj;
        return this.f179932b == pageIndicatorState.f179932b && this.f179933c == pageIndicatorState.f179933c && this.f179934d == pageIndicatorState.f179934d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179934d) + r.e(this.f179933c, Integer.hashCode(this.f179932b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageIndicatorState(currentPage=");
        sb2.append(this.f179932b);
        sb2.append(", count=");
        sb2.append(this.f179933c);
        sb2.append(", highlightVisitedDots=");
        return r.x(sb2, this.f179934d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f179932b);
        parcel.writeInt(this.f179933c);
        parcel.writeInt(this.f179934d ? 1 : 0);
    }

    public /* synthetic */ PageIndicatorState(int i12, int i13, boolean z12, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 4) != 0 ? false : z12);
    }
}

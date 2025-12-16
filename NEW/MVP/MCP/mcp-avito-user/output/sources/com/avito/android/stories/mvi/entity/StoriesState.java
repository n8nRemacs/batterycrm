package com.avito.android.stories.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StoriesState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoriesState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f285263b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f285264c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f285265d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<String> f285266e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f285267f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f285268g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f285269h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LoadState f285270i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f285262j = new a(null);

    @k
    public static final Parcelable.Creator<StoriesState> CREATOR = new b();

    /* compiled from: StoriesState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/mvi/entity/StoriesState$a;", "", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StoriesState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StoriesState> {
        @Override // android.os.Parcelable.Creator
        public final StoriesState createFromParcel(Parcel parcel) {
            return new StoriesState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, LoadState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesState[] newArray(int i12) {
            return new StoriesState[i12];
        }
    }

    public StoriesState(@k String str, @l String str2, @l String str3, @k List<String> list, @l String str4, @l String str5, boolean z12, @k LoadState loadState) {
        this.f285263b = str;
        this.f285264c = str2;
        this.f285265d = str3;
        this.f285266e = list;
        this.f285267f = str4;
        this.f285268g = str5;
        this.f285269h = z12;
        this.f285270i = loadState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StoriesState a(StoriesState storiesState, String str, String str2, ArrayList arrayList, boolean z12, LoadState loadState, int i12) {
        String str3 = storiesState.f285263b;
        if ((i12 & 2) != 0) {
            str = storiesState.f285264c;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = storiesState.f285265d;
        }
        String str5 = str2;
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = storiesState.f285266e;
        }
        List list2 = list;
        String str6 = storiesState.f285267f;
        String str7 = storiesState.f285268g;
        if ((i12 & 64) != 0) {
            z12 = storiesState.f285269h;
        }
        boolean z13 = z12;
        if ((i12 & 128) != 0) {
            loadState = storiesState.f285270i;
        }
        storiesState.getClass();
        return new StoriesState(str3, str4, str5, list2, str6, str7, z13, loadState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesState)) {
            return false;
        }
        StoriesState storiesState = (StoriesState) obj;
        return L.f(this.f285263b, storiesState.f285263b) && L.f(this.f285264c, storiesState.f285264c) && L.f(this.f285265d, storiesState.f285265d) && L.f(this.f285266e, storiesState.f285266e) && L.f(this.f285267f, storiesState.f285267f) && L.f(this.f285268g, storiesState.f285268g) && this.f285269h == storiesState.f285269h && this.f285270i == storiesState.f285270i;
    }

    public final int hashCode() {
        int iHashCode = this.f285263b.hashCode() * 31;
        String str = this.f285264c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f285265d;
        int iE2 = H.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f285266e);
        String str3 = this.f285267f;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f285268g;
        return this.f285270i.hashCode() + r.i((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f285269h);
    }

    @k
    public final String toString() {
        return "StoriesState(url=" + this.f285263b + ", selectedId=" + this.f285264c + ", selectedPage=" + this.f285265d + ", viewedList=" + this.f285266e + ", categoryId=" + this.f285267f + ", crossCategoryTag=" + this.f285268g + ", needToShowUxFeedback=" + this.f285269h + ", loadState=" + this.f285270i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f285263b);
        parcel.writeString(this.f285264c);
        parcel.writeString(this.f285265d);
        parcel.writeStringList(this.f285266e);
        parcel.writeString(this.f285267f);
        parcel.writeString(this.f285268g);
        parcel.writeInt(this.f285269h ? 1 : 0);
        parcel.writeString(this.f285270i.name());
    }
}

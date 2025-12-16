package com.avito.android.stories;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: StoriesLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/StoriesLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class StoriesLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<StoriesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f285018b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f285019c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f285020d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f285021e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f285022f;

    /* compiled from: StoriesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoriesLink> {
        @Override // android.os.Parcelable.Creator
        public final StoriesLink createFromParcel(Parcel parcel) {
            return new StoriesLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesLink[] newArray(int i12) {
            return new StoriesLink[i12];
        }
    }

    /* compiled from: StoriesLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/StoriesLink$b;", "", "<init>", "()V", "a", "b", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: StoriesLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/StoriesLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f285023b = new a();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }

        /* compiled from: StoriesLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/StoriesLink$b$b;", "LJu/c$b;", "_avito_stories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.stories.StoriesLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8526b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f285024b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final List<String> f285025c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Boolean f285026d;

            public C8526b(@Y61.l Boolean bool, @Y61.k String str, @Y61.l List list) {
                this.f285024b = str;
                this.f285025c = list;
                this.f285026d = bool;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8526b)) {
                    return false;
                }
                C8526b c8526b = (C8526b) obj;
                return L.f(this.f285024b, c8526b.f285024b) && L.f(this.f285025c, c8526b.f285025c) && L.f(this.f285026d, c8526b.f285026d);
            }

            public final int hashCode() {
                int iHashCode = this.f285024b.hashCode() * 31;
                List<String> list = this.f285025c;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.f285026d;
                return iHashCode2 + (bool != null ? bool.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StoriesCompleted(id=");
                sb2.append(this.f285024b);
                sb2.append(", ids=");
                sb2.append(this.f285025c);
                sb2.append(", needToShowUxFeedback=");
                return C0.g(sb2, this.f285026d, ')');
            }

            public /* synthetic */ C8526b(String str, List list, Boolean bool, int i12, C42822w c42822w) {
                this((i12 & 4) != 0 ? null : bool, str, list);
            }
        }
    }

    public /* synthetic */ StoriesLink(String str, String str2, String str3, boolean z12, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 8) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f285018b);
        parcel.writeString(this.f285019c);
        parcel.writeString(this.f285020d);
        parcel.writeInt(this.f285021e ? 1 : 0);
        parcel.writeString(this.f285022f);
    }

    public StoriesLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        this.f285018b = str;
        this.f285019c = str2;
        this.f285020d = str3;
        this.f285021e = z12;
        this.f285022f = str4;
    }
}

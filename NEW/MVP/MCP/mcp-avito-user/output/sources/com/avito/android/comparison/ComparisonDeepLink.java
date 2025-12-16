package com.avito.android.comparison;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ComparisonDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/ComparisonDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_comparison_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ComparisonDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ComparisonDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f123772b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f123773c;

    /* compiled from: ComparisonDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonDeepLink createFromParcel(Parcel parcel) {
            return new ComparisonDeepLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonDeepLink[] newArray(int i12) {
            return new ComparisonDeepLink[i12];
        }
    }

    /* compiled from: ComparisonDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comparison/ComparisonDeepLink$b;", "", "<init>", "()V", "a", "_avito_comparison_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ComparisonDeepLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/ComparisonDeepLink$b$a;", "LJu/c$b;", "_avito_comparison_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final List<String> f123774b;

            public a(@Y61.l List<String> list) {
                this.f123774b = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f123774b, ((a) obj).f123774b);
            }

            public final int hashCode() {
                List<String> list = this.f123774b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("ComparisonResult(itemList="), this.f123774b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ComparisonDeepLink(@Y61.k String str, @Y61.l String str2) {
        this.f123772b = str;
        this.f123773c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f123772b);
        parcel.writeString(this.f123773c);
    }
}

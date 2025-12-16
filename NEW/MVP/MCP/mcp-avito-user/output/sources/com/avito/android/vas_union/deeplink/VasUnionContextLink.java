package com.avito.android.vas_union.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: VasUnionContextLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionContextLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasUnionContextLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VasUnionContextLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323120b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323121c;

    /* compiled from: VasUnionContextLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasUnionContextLink> {
        @Override // android.os.Parcelable.Creator
        public final VasUnionContextLink createFromParcel(Parcel parcel) {
            return new VasUnionContextLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasUnionContextLink[] newArray(int i12) {
            return new VasUnionContextLink[i12];
        }
    }

    /* compiled from: VasUnionContextLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b$a;", "Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b$b;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: VasUnionContextLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b$a;", "Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f323122b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1629031028;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: VasUnionContextLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b$b;", "Lcom/avito/android/vas_union/deeplink/VasUnionContextLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_union.deeplink.VasUnionContextLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9986b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9986b f323123b = new C9986b();

            public C9986b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9986b);
            }

            public final int hashCode() {
                return 1885340677;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public VasUnionContextLink(@k String str, @k String str2) {
        this.f323120b = str;
        this.f323121c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f323120b);
        parcel.writeString(this.f323121c);
    }
}

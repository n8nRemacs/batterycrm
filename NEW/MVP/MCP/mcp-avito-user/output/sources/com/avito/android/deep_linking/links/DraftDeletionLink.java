package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DraftDeletionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftDeletionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DraftDeletionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DraftDeletionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133286c;

    /* compiled from: DraftDeletionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DraftDeletionLink> {
        @Override // android.os.Parcelable.Creator
        public final DraftDeletionLink createFromParcel(Parcel parcel) {
            return new DraftDeletionLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftDeletionLink[] newArray(int i12) {
            return new DraftDeletionLink[i12];
        }
    }

    /* compiled from: DraftDeletionLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftDeletionLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/DraftDeletionLink$b$a;", "Lcom/avito/android/deep_linking/links/DraftDeletionLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: DraftDeletionLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftDeletionLink$b$a;", "Lcom/avito/android/deep_linking/links/DraftDeletionLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ApiError f133287b;

            public a(@Y61.k ApiError apiError) {
                super(null);
                this.f133287b = apiError;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133287b, ((a) obj).f133287b);
            }

            public final int hashCode() {
                return this.f133287b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.n(new StringBuilder("Failure(error="), this.f133287b, ')');
            }
        }

        /* compiled from: DraftDeletionLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DraftDeletionLink$b$b;", "Lcom/avito/android/deep_linking/links/DraftDeletionLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.DraftDeletionLink$b$b, reason: collision with other inner class name */
        public static final class C3996b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3996b f133288b = new C3996b();

            public C3996b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ DraftDeletionLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133285b);
        parcel.writeString(this.f133286c);
    }

    public DraftDeletionLink(@Y61.k String str, @Y61.l String str2) {
        this.f133285b = str;
        this.f133286c = str2;
    }
}

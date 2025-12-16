package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StoreDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/StoreDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class StoreDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StoreDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Store f133685b;

    /* compiled from: StoreDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoreDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StoreDeeplink createFromParcel(Parcel parcel) {
            return new StoreDeeplink(Store.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreDeeplink[] newArray(int i12) {
            return new StoreDeeplink[i12];
        }
    }

    /* compiled from: StoreDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/StoreDeeplink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/StoreDeeplink$b$a;", "Lcom/avito/android/deep_linking/links/StoreDeeplink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: StoreDeeplink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/StoreDeeplink$b$a;", "Lcom/avito/android/deep_linking/links/StoreDeeplink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return kotlin.jvm.internal.L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "Failure(message=null)";
            }
        }

        /* compiled from: StoreDeeplink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/StoreDeeplink$b$b;", "Lcom/avito/android/deep_linking/links/StoreDeeplink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.StoreDeeplink$b$b, reason: collision with other inner class name */
        public static final class C4016b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4016b f133686b = new C4016b();

            public C4016b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoreDeeplink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreDeeplink) && this.f133685b == ((StoreDeeplink) obj).f133685b;
    }

    public final int hashCode() {
        return this.f133685b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "StoreDeeplink(store=" + this.f133685b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133685b.name());
    }

    public /* synthetic */ StoreDeeplink(Store store, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Store.f133676d : store);
    }

    public StoreDeeplink(@Y61.k Store store) {
        this.f133685b = store;
    }
}

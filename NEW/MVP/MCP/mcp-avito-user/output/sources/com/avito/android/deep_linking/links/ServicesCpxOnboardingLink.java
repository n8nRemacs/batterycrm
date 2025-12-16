package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServicesCplOnboardingLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "cpxContext", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ServicesCpxOnboardingLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ServicesCpxOnboardingLink> CREATOR = new a();

    @com.google.gson.annotations.c("context")
    @Y61.k
    private final String cpxContext;

    /* compiled from: ServicesCplOnboardingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesCpxOnboardingLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesCpxOnboardingLink createFromParcel(Parcel parcel) {
            return new ServicesCpxOnboardingLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesCpxOnboardingLink[] newArray(int i12) {
            return new ServicesCpxOnboardingLink[i12];
        }
    }

    /* compiled from: ServicesCplOnboardingLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ServicesCpxOnboardingLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
            return new ServicesCpxOnboardingLink(Ku.i.p(uri, "context"));
        }
    }

    /* compiled from: ServicesCplOnboardingLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c$a;", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: ServicesCplOnboardingLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c$a;", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133654b = new a();
        }

        /* compiled from: ServicesCplOnboardingLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c$b;", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink$c;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133655b = new b();
        }
    }

    public ServicesCpxOnboardingLink(@Y61.k String str) {
        this.cpxContext = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getCpxContext() {
        return this.cpxContext;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.cpxContext);
    }
}

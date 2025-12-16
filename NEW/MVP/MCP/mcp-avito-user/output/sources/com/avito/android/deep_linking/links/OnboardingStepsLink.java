package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: OnboardingStepsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/OnboardingStepsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Arguments", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class OnboardingStepsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<OnboardingStepsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133521b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133522c;

    /* compiled from: OnboardingStepsLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/OnboardingStepsLink$Arguments;", "Landroid/os/Parcelable;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Arguments implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133524b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f133523c = new a(null);

        @Y61.k
        public static final Parcelable.Creator<Arguments> CREATOR = new b();

        /* compiled from: OnboardingStepsLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/OnboardingStepsLink$Arguments$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: OnboardingStepsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i12) {
                return new Arguments[i12];
            }
        }

        public Arguments(@Y61.l String str) {
            this.f133524b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Arguments) && kotlin.jvm.internal.L.f(this.f133524b, ((Arguments) obj).f133524b);
        }

        public final int hashCode() {
            String str = this.f133524b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Arguments(esid="), this.f133524b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133524b);
        }
    }

    /* compiled from: OnboardingStepsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingStepsLink> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingStepsLink createFromParcel(Parcel parcel) {
            return new OnboardingStepsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingStepsLink[] newArray(int i12) {
            return new OnboardingStepsLink[i12];
        }
    }

    public OnboardingStepsLink(@Y61.k String str, @Y61.l String str2) {
        this.f133521b = str;
        this.f133522c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133521b);
        parcel.writeString(this.f133522c);
    }
}

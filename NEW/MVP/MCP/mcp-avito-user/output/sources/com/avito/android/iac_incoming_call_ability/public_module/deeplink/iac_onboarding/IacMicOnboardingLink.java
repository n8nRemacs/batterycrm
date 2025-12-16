package com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_onboarding;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: IacMicOnboardingLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_onboarding/IacMicOnboardingLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class IacMicOnboardingLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacMicOnboardingLink> CREATOR = new a();

    /* compiled from: IacMicOnboardingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacMicOnboardingLink> {
        @Override // android.os.Parcelable.Creator
        public final IacMicOnboardingLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new IacMicOnboardingLink();
        }

        @Override // android.os.Parcelable.Creator
        public final IacMicOnboardingLink[] newArray(int i12) {
            return new IacMicOnboardingLink[i12];
        }
    }

    /* compiled from: IacMicOnboardingLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_onboarding/IacMicOnboardingLink$b;", "", "a", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacMicOnboardingLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_onboarding/IacMicOnboardingLink$b$a;", "LJu/c$a;", "<init>", "()V", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168400b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2136176099;
            }

            @k
            public final String toString() {
                return "Redirected";
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}

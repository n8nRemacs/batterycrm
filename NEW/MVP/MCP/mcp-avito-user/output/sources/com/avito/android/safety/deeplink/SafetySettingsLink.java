package com.avito.android.safety.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SafetySettingsDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/deeplink/SafetySettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_safety_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class SafetySettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SafetySettingsLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f257200b;

    /* compiled from: SafetySettingsDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safety/deeplink/SafetySettingsLink$a;", "", "<init>", "()V", "", "SOURCE_PARAM", "Ljava/lang/String;", "_avito_safety_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafetySettingsDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SafetySettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final SafetySettingsLink createFromParcel(Parcel parcel) {
            return new SafetySettingsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SafetySettingsLink[] newArray(int i12) {
            return new SafetySettingsLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public SafetySettingsLink(@l String str) {
        this.f257200b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f257200b);
    }
}

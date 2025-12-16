package com.avito.android.passport.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.enums.c;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportSelectBusinessVrfLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Flow", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class PassportSelectBusinessVrfLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PassportSelectBusinessVrfLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Flow f211122b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f211123c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportSelectBusinessVrfLink$Flow;", "", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Flow {

        /* renamed from: b, reason: collision with root package name */
        public static final Flow f211124b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flow f211125c;

        /* renamed from: d, reason: collision with root package name */
        public static final Flow f211126d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Flow[] f211127e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f211128f;

        static {
            Flow flow = new Flow("MERGE_WITH_PROFILE_PROF_CONVERTATION", 0);
            f211124b = flow;
            Flow flow2 = new Flow("FINALIZE_MERGE", 1);
            f211125c = flow2;
            Flow flow3 = new Flow("CREATE", 2);
            f211126d = flow3;
            Flow[] flowArr = {flow, flow2, flow3};
            f211127e = flowArr;
            f211128f = c.a(flowArr);
        }

        public Flow() {
            throw null;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f211127e.clone();
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportSelectBusinessVrfLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessVrfLink createFromParcel(Parcel parcel) {
            return new PassportSelectBusinessVrfLink(Flow.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessVrfLink[] newArray(int i12) {
            return new PassportSelectBusinessVrfLink[i12];
        }
    }

    public PassportSelectBusinessVrfLink(@k Flow flow, @l String str) {
        this.f211122b = flow;
        this.f211123c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211122b.name());
        parcel.writeString(this.f211123c);
    }
}

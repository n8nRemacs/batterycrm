package com.avito.android.cpt.mass_activation.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CptMassActivationEstimateLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CptMassActivationEstimateLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CptMassActivationEstimateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f126487b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f126488c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f126489d;

    /* compiled from: CptMassActivationEstimateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CptMassActivationEstimateLink> {
        @Override // android.os.Parcelable.Creator
        public final CptMassActivationEstimateLink createFromParcel(Parcel parcel) {
            return new CptMassActivationEstimateLink((AttributedText) parcel.readParcelable(CptMassActivationEstimateLink.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CptMassActivationEstimateLink[] newArray(int i12) {
            return new CptMassActivationEstimateLink[i12];
        }
    }

    /* compiled from: CptMassActivationEstimateLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b;", "", "a", "b", "c", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$a;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$b;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$c;", "_avito_cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: CptMassActivationEstimateLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$a;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f126490b = new a();
        }

        /* compiled from: CptMassActivationEstimateLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$b;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink$b$b, reason: collision with other inner class name */
        public static final class C3762b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3762b f126491b = new C3762b();
        }

        /* compiled from: CptMassActivationEstimateLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b$c;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink$b;", "LJu/c$b;", "_avito_cpt_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f126492b;

            public c(@k DeepLink deepLink) {
                this.f126492b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f126492b, ((c) obj).f126492b);
            }

            public final int hashCode() {
                return this.f126492b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("ReturnAction(deepLink="), this.f126492b, ')');
            }
        }
    }

    public CptMassActivationEstimateLink(@l AttributedText attributedText, @k List list, @k String str) {
        this.f126487b = list;
        this.f126488c = str;
        this.f126489d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f126487b);
        parcel.writeString(this.f126488c);
        parcel.writeParcelable(this.f126489d, i12);
    }
}

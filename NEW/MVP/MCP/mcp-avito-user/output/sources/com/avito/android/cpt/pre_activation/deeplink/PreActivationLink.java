package com.avito.android.cpt.pre_activation.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.pre_activation.data.PreActivationData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PreActivationLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PreActivationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PreActivationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PreActivationData f126685b;

    /* compiled from: PreActivationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreActivationLink> {
        @Override // android.os.Parcelable.Creator
        public final PreActivationLink createFromParcel(Parcel parcel) {
            return new PreActivationLink(PreActivationData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PreActivationLink[] newArray(int i12) {
            return new PreActivationLink[i12];
        }
    }

    /* compiled from: PreActivationLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b;", "", "a", "b", "Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b$a;", "Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b$b;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PreActivationLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b$a;", "Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f126686b = new a();
        }

        /* compiled from: PreActivationLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b$b;", "Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cpt.pre_activation.deeplink.PreActivationLink$b$b, reason: collision with other inner class name */
        public static final class C3771b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3771b f126687b = new C3771b();
        }
    }

    public PreActivationLink(@k PreActivationData preActivationData) {
        this.f126685b = preActivationData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f126685b.writeToParcel(parcel, i12);
    }
}

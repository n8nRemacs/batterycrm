package com.avito.android.iac_outgoing_call_ability.public_module.deep_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacLaunchCallAfterCanCallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacLaunchCallAfterCanCallLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacLaunchCallAfterCanCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IacMakeCallLink f168683b;

    /* compiled from: IacLaunchCallAfterCanCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacLaunchCallAfterCanCallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacLaunchCallAfterCanCallLink createFromParcel(Parcel parcel) {
            return new IacLaunchCallAfterCanCallLink(IacMakeCallLink.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IacLaunchCallAfterCanCallLink[] newArray(int i12) {
            return new IacLaunchCallAfterCanCallLink[i12];
        }
    }

    /* compiled from: IacLaunchCallAfterCanCallLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b;", "", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: IacLaunchCallAfterCanCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b$a;", "LJu/c$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f168684b = new a();
        }

        /* compiled from: IacLaunchCallAfterCanCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b$b;", "LJu/c$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacLaunchCallAfterCanCallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink$b$b, reason: collision with other inner class name */
        public static final class C4987b implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4987b f168685b = new C4987b();
        }
    }

    public IacLaunchCallAfterCanCallLink(@k IacMakeCallLink iacMakeCallLink) {
        this.f168683b = iacMakeCallLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacLaunchCallAfterCanCallLink) && L.f(this.f168683b, ((IacLaunchCallAfterCanCallLink) obj).f168683b);
    }

    public final int hashCode() {
        return this.f168683b.f168711b.hashCode();
    }

    @k
    public final String toString() {
        return "IacLaunchCallAfterCanCallLink(iacMakeCallLink=" + this.f168683b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f168683b.writeToParcel(parcel, i12);
    }
}

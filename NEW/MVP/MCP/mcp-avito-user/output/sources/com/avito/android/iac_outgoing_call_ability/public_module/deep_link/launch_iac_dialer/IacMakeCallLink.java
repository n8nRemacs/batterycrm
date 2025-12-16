package com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacMakeCallLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacMakeCallLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacMakeCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IacCallInfo f168711b;

    /* compiled from: IacMakeCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacMakeCallLink> {
        @Override // android.os.Parcelable.Creator
        public final IacMakeCallLink createFromParcel(Parcel parcel) {
            return new IacMakeCallLink((IacCallInfo) parcel.readParcelable(IacMakeCallLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacMakeCallLink[] newArray(int i12) {
            return new IacMakeCallLink[i12];
        }
    }

    /* compiled from: IacMakeCallLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: IacMakeCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$a;", "LJu/c$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b;", "<init>", "()V", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {
            static {
                new a();
            }

            public a() {
                super(null);
            }
        }

        /* compiled from: IacMakeCallLink.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC4992b extends b {

            /* compiled from: IacMakeCallLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b$a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b;", "LJu/c$b;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink$b$b$a */
            public static final /* data */ class a extends AbstractC4992b implements InterfaceC14249c.b {
                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    ((a) obj).getClass();
                    return L.f(null, null);
                }

                public final int hashCode() {
                    return 0;
                }

                @k
                public final String toString() {
                    return "StartedInIacDialer(itemId=null)";
                }
            }

            /* compiled from: IacMakeCallLink.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b$b;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_iac_dialer/IacMakeCallLink$b$b;", "LJu/c$a;", "_avito_iac-outgoing-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink$b$b$b, reason: collision with other inner class name */
            public static final /* data */ class C4993b extends AbstractC4992b implements InterfaceC14249c.a {

                /* renamed from: b, reason: collision with root package name */
                @l
                public final String f168712b;

                public C4993b(@l String str) {
                    super(null);
                    this.f168712b = str;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C4993b) && L.f(this.f168712b, ((C4993b) obj).f168712b);
                }

                public final int hashCode() {
                    String str = this.f168712b;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("StartedInVoipDialer(itemId="), this.f168712b, ')');
                }
            }

            public /* synthetic */ AbstractC4992b(C42822w c42822w) {
                this();
            }

            public AbstractC4992b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public IacMakeCallLink(@k IacCallInfo iacCallInfo) {
        this.f168711b = iacCallInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacMakeCallLink) && L.f(this.f168711b, ((IacMakeCallLink) obj).f168711b);
    }

    public final int hashCode() {
        return this.f168711b.hashCode();
    }

    @k
    public final String toString() {
        return "IacMakeCallLink(callInfo=" + this.f168711b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f168711b, i12);
    }
}

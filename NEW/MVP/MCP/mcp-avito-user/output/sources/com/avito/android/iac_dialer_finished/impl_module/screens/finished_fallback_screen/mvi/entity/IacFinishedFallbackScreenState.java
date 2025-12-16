package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.AutomaticGsmClickSource;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: IacFinishedFallbackScreenState.kt */
@d
@P
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\rR\u001d\u0010%\u001a\u00020\u00108\u0006¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0012R#\u00100\u001a\u0004\u0018\u00010*8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "LdL/d;", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "argument", "", "wasClosingActionIntercepted", "<init>", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;Z)V", "component1", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "component2", "()Z", "copy", "(Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;Z)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/IacFinishedFallbackScreenArgument;", "getArgument", "Z", "getWasClosingActionIntercepted", "gsmCallSource", "Ljava/lang/String;", "getGsmCallSource", "getGsmCallSource$annotations", "()V", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "callToSellerEventAnalytics$delegate", "Lkotlin/C;", "getCallToSellerEventAnalytics", "()Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "getCallToSellerEventAnalytics$annotations", "callToSellerEventAnalytics", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFallbackScreenState extends q implements Parcelable, dL.d {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<IacFinishedFallbackScreenState> CREATOR = new a();

    @k
    private final IacFinishedFallbackScreenArgument argument;

    /* renamed from: callToSellerEventAnalytics$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C callToSellerEventAnalytics;

    @k
    private final String gsmCallSource;
    private final boolean wasClosingActionIntercepted;

    /* compiled from: IacFinishedFallbackScreenState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedFallbackScreenState> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenState createFromParcel(Parcel parcel) {
            return new IacFinishedFallbackScreenState((IacFinishedFallbackScreenArgument) parcel.readParcelable(IacFinishedFallbackScreenState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedFallbackScreenState[] newArray(int i12) {
            return new IacFinishedFallbackScreenState[i12];
        }
    }

    /* compiled from: IacFinishedFallbackScreenState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166598a;

        static {
            int[] iArr = new int[AutomaticGsmClickSource.values().length];
            try {
                iArr[AutomaticGsmClickSource.WaitGsmFallback.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutomaticGsmClickSource.ActiveFallback.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166598a = iArr;
        }
    }

    /* compiled from: IacFinishedFallbackScreenState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<PhoneRequestDeepLinkAnalyticsData.IacGsmFallback> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final PhoneRequestDeepLinkAnalyticsData.IacGsmFallback invoke() {
            IacFinishedFallbackScreenState iacFinishedFallbackScreenState = IacFinishedFallbackScreenState.this;
            String itemId = iacFinishedFallbackScreenState.getArgument().getItemId();
            if (itemId == null) {
                return null;
            }
            return new PhoneRequestDeepLinkAnalyticsData.IacGsmFallback(itemId, iacFinishedFallbackScreenState.getGsmCallSource());
        }
    }

    public IacFinishedFallbackScreenState(@k IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument, boolean z12) {
        String str;
        this.argument = iacFinishedFallbackScreenArgument;
        this.wasClosingActionIntercepted = z12;
        AutomaticGsmClickSource automaticGsmClickSource = iacFinishedFallbackScreenArgument.getAutomaticGsmClickSource();
        int i12 = automaticGsmClickSource == null ? -1 : b.f166598a[automaticGsmClickSource.ordinal()];
        if (i12 == -1) {
            str = "iac_call_end_fallback";
        } else if (i12 == 1) {
            str = "iac_wait_fallback";
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "iac_omelette";
        }
        this.gsmCallSource = str;
        this.callToSellerEventAnalytics = C42727D.c(new c());
    }

    public static /* synthetic */ IacFinishedFallbackScreenState copy$default(IacFinishedFallbackScreenState iacFinishedFallbackScreenState, IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacFinishedFallbackScreenArgument = iacFinishedFallbackScreenState.argument;
        }
        if ((i12 & 2) != 0) {
            z12 = iacFinishedFallbackScreenState.wasClosingActionIntercepted;
        }
        return iacFinishedFallbackScreenState.copy(iacFinishedFallbackScreenArgument, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacFinishedFallbackScreenArgument getArgument() {
        return this.argument;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasClosingActionIntercepted() {
        return this.wasClosingActionIntercepted;
    }

    @k
    public final IacFinishedFallbackScreenState copy(@k IacFinishedFallbackScreenArgument argument, boolean wasClosingActionIntercepted) {
        return new IacFinishedFallbackScreenState(argument, wasClosingActionIntercepted);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFallbackScreenState)) {
            return false;
        }
        IacFinishedFallbackScreenState iacFinishedFallbackScreenState = (IacFinishedFallbackScreenState) other;
        return L.f(this.argument, iacFinishedFallbackScreenState.argument) && this.wasClosingActionIntercepted == iacFinishedFallbackScreenState.wasClosingActionIntercepted;
    }

    @k
    public final IacFinishedFallbackScreenArgument getArgument() {
        return this.argument;
    }

    @l
    public final PhoneRequestDeepLinkAnalyticsData.IacGsmFallback getCallToSellerEventAnalytics() {
        return (PhoneRequestDeepLinkAnalyticsData.IacGsmFallback) this.callToSellerEventAnalytics.getValue();
    }

    @k
    public final String getGsmCallSource() {
        return this.gsmCallSource;
    }

    public final boolean getWasClosingActionIntercepted() {
        return this.wasClosingActionIntercepted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasClosingActionIntercepted) + (this.argument.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacFinishedFallbackScreenState(argument=");
        sb2.append(this.argument);
        sb2.append(", wasClosingActionIntercepted=");
        return r.x(sb2, this.wasClosingActionIntercepted, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.argument, flags);
        parcel.writeInt(this.wasClosingActionIntercepted ? 1 : 0);
    }

    public static /* synthetic */ void getCallToSellerEventAnalytics$annotations() {
    }

    public static /* synthetic */ void getGsmCallSource$annotations() {
    }
}

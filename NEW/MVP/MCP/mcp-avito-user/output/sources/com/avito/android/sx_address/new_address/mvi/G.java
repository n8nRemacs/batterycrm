package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SxNewAddressViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/G;", "Lcom/avito/android/sx_address/new_address/mvi/F;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G implements F {

    /* compiled from: SxNewAddressViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SxNewAddressMviState.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SxNewAddressMviState.LoadingType loadingType = SxNewAddressMviState.LoadingType.f293726b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SxNewAddressMviState.LoadingType loadingType2 = SxNewAddressMviState.LoadingType.f293726b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SxNewAddressMviState.LoadingType loadingType3 = SxNewAddressMviState.LoadingType.f293726b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public G() {
    }

    @Override // com.avito.android.sx_address.new_address.mvi.F
    @Y61.k
    public final SxNewAddressMviState a(@Y61.k SxNewAddressMviState sxNewAddressMviState, @Y61.l Throwable th2) {
        int iOrdinal = sxNewAddressMviState.f293714b.ordinal();
        if (iOrdinal == 0) {
            return SxNewAddressMviState.a(sxNewAddressMviState, null, new SxNewAddressMviViewState.Content(sxNewAddressMviState.f293716d, sxNewAddressMviState.f293717e, sxNewAddressMviState.f293718f, sxNewAddressMviState.f293719g, sxNewAddressMviState.f293720h, sxNewAddressMviState.f293721i), null, null, null, null, null, 253);
        }
        if (iOrdinal == 1) {
            return SxNewAddressMviState.a(sxNewAddressMviState, null, SxNewAddressMviViewState.Loading.f293744b, null, null, null, null, null, 253);
        }
        if (iOrdinal == 2) {
            return SxNewAddressMviState.a(sxNewAddressMviState, null, SxNewAddressMviViewState.SaveLoading.f293746b, null, null, null, null, null, 253);
        }
        if (iOrdinal == 3) {
            return SxNewAddressMviState.a(sxNewAddressMviState, null, new SxNewAddressMviViewState.NetworkError(th2), null, null, null, null, null, 253);
        }
        throw new NoWhenBranchMatchedException();
    }
}

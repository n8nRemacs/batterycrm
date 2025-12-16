package com.avito.android.sx_address.deeplink;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddAddressSource;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.sx_address.SelectAddressListParams;
import com.avito.android.sx_address.SxAddressActivity;
import com.avito.android.sx_address.SxAddressEditParams;
import com.avito.android.sx_address.SxAddressEntryLinksParams;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.sx_address.SxNewAddressOpenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/deeplink/x;", "LyA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class x implements InterfaceC50095c {
    @Inject
    public x() {
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent a(@Y61.k Context context, long j12, @Y61.l String str, @Y61.l String str2) {
        SxAddressVideoVerificationParams sxAddressVideoVerificationParams = new SxAddressVideoVerificationParams(j12, str, str2);
        SxAddressActivity.f292523m.getClass();
        return SxAddressActivity.a.a(context, sxAddressVideoVerificationParams);
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent b(@Y61.k Context context) {
        SxAddressActivity.a aVar = SxAddressActivity.f292523m;
        SxAddressEntryLinksParams sxAddressEntryLinksParams = SxAddressEntryLinksParams.f292539b;
        aVar.getClass();
        return SxAddressActivity.a.a(context, sxAddressEntryLinksParams);
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent c(@Y61.k Context context, @Y61.l String str, @Y61.k String str2, long j12, long j13, @Y61.k Coordinates coordinates, @Y61.l String str3, @Y61.k String str4, @Y61.k SxAddAddressSource sxAddAddressSource) {
        SxNewAddressOpenParams sxNewAddressOpenParams = new SxNewAddressOpenParams(str, j12, j13, new SxNewAddressOpenParams.Address(new SxNewAddressOpenParams.Address.Component(str3, str4), new Coordinates(coordinates.getLatitude(), coordinates.getLongitude())), Integer.parseInt(str2), sxAddAddressSource);
        SxAddressActivity.f292523m.getClass();
        return SxAddressActivity.a.a(context, sxNewAddressOpenParams);
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent d(@Y61.k Context context, long j12) {
        SxAddressActivity.a aVar = SxAddressActivity.f292523m;
        SelectAddressListParams selectAddressListParams = new SelectAddressListParams(j12);
        aVar.getClass();
        return SxAddressActivity.a.a(context, selectAddressListParams);
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent e(@Y61.k Context context, long j12, @Y61.l String str) {
        SxAddressListParams sxAddressListParams = new SxAddressListParams(j12, str);
        SxAddressActivity.f292523m.getClass();
        return SxAddressActivity.a.a(context, sxAddressListParams);
    }

    @Override // yA0.InterfaceC50095c
    @Y61.k
    public final Intent f(@Y61.k Context context, @Y61.l String str, long j12, long j13, @Y61.l Boolean bool, @Y61.k SxAddAddressSource sxAddAddressSource) {
        SxAddressEditParams sxAddressEditParams = new SxAddressEditParams(str, j12, j13, bool, sxAddAddressSource);
        SxAddressActivity.f292523m.getClass();
        return SxAddressActivity.a.a(context, sxAddressEditParams);
    }
}

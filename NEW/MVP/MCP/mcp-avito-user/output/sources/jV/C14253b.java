package Jv;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.presentation.DeliveryTarifikatorActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryTarifikatorIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJv/b;", "LJv/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14253b implements InterfaceC14252a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f9176a;

    @Inject
    public C14253b(@k Context context) {
        this.f9176a = context;
    }

    @Override // Jv.InterfaceC14252a
    @k
    public final Intent a(@k DeliveryTarifikatorParams deliveryTarifikatorParams) {
        DeliveryTarifikatorActivity.f135354m.getClass();
        Intent intent = new Intent(this.f9176a, (Class<?>) DeliveryTarifikatorActivity.class);
        intent.putExtra("TARIFIKATOR_PARAMS", deliveryTarifikatorParams);
        return intent;
    }
}

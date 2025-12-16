package zn0;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.safedeal.delivery.order_cancellation.RdsOrderCancellationActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzn0/b;", "Lzn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50595b implements InterfaceC50594a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f444241a;

    @Inject
    public C50595b(@k Application application) {
        this.f444241a = application;
    }

    @Override // zn0.InterfaceC50594a
    @k
    public final Intent a(@k String str) {
        return new Intent(this.f444241a, (Class<?>) RdsOrderCancellationActivity.class).putExtra("EXTRA_ORDER_ID", str);
    }
}

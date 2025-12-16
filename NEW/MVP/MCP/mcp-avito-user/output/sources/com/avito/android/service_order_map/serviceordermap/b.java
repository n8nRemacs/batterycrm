package com.avito.android.service_order_map.serviceordermap;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderMapActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceOrderMapActivity f278619l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ServiceOrderMapActivity serviceOrderMapActivity) {
        super(0);
        this.f278619l = serviceOrderMapActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ServiceOrderMapActivity.a aVar = ServiceOrderMapActivity.f278595s;
        ServiceOrderMapActivity serviceOrderMapActivity = this.f278619l;
        serviceOrderMapActivity.getClass();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", serviceOrderMapActivity.getPackageName(), null));
        serviceOrderMapActivity.startActivity(intent);
        return G0.f406611a;
    }
}

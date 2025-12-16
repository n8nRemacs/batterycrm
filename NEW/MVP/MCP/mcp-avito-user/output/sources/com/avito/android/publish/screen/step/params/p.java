package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.C33864h0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.sx_address.SxAddressAddResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/p;", "Lcom/avito/android/publish/screen/step/params/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements InterfaceC34046a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PublishDetailsFragment f241516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33864h0 f241517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f241518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f241519d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C0 f241520e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.b f241521f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.params.view.actions.l f241522g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14065a, G0> f241523h;

    public p(@Y61.k PublishDetailsFragment publishDetailsFragment, @Y61.k C33864h0 c33864h0, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C0 c02, @Y61.k com.avito.android.details.b bVar, @Y61.k com.avito.android.publish.screen.step.params.view.actions.l lVar, @Y61.k Y41.l lVar2) {
        this.f241516a = publishDetailsFragment;
        this.f241517b = c33864h0;
        this.f241518c = aVar;
        this.f241519d = interfaceC33535v;
        this.f241520e = c02;
        this.f241521f = bVar;
        this.f241522g = lVar;
        this.f241523h = lVar2;
    }

    public static final AddressParameter.Value a(SxAddressAddResult.Success.PublishValue publishValue, p pVar) {
        double lat = publishValue.getLat();
        double lng = publishValue.getLng();
        String text = publishValue.getText();
        String jwt = publishValue.getJwt();
        SxAddressAddResult.Success.AddressData data = publishValue.getData();
        AddressParameter.Value value = new AddressParameter.Value(lat, lng, text, jwt, data != null ? new AddressParameter.Value.PublishValueSellerAddressData(data.getHouse(), data.getId(), Boolean.valueOf(data.getIsDisabled()), data.getLocation(), data.getName()) : null);
        pVar.f241519d.n0(AddressChoiceType.f232213e, value);
        return value;
    }
}

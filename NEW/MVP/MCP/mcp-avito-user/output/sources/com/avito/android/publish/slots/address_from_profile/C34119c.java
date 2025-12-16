package com.avito.android.publish.slots.address_from_profile;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddressFromProfileResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/c;", "Lcom/avito/android/publish/slots/address_from_profile/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.slots.address_from_profile.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34119c implements InterfaceC34118b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f242830a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f242831b;

    @Inject
    public C34119c(@Y61.k Context context) {
        this.f242830a = context.getString(R.string.addresses_from_profile_load_error);
        this.f242831b = context.getString(R.string.addresses_from_profile_load_button);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.InterfaceC34118b
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF242831b() {
        return this.f242831b;
    }

    @Override // com.avito.android.publish.slots.address_from_profile.InterfaceC34118b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF242830a() {
        return this.f242830a;
    }
}

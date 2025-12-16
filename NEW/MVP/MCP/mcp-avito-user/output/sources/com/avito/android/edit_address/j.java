package com.avito.android.edit_address;

import android.os.Bundle;
import com.avito.android.edit_address.EditAddressMviFragment;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAddressMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f145937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfilesSettingsAddress f145938m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
        super(1);
        this.f145937l = str;
        this.f145938m = extendedProfilesSettingsAddress;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("key_arguments", new EditAddressMviFragment.Args(this.f145937l, this.f145938m));
        return G0.f406611a;
    }
}

package com.avito.android.profile_settings;

import android.os.Bundle;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileSettingsMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f228443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f228444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f228445n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f228446o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, String str3, String str4) {
        super(1);
        this.f228443l = str;
        this.f228444m = str2;
        this.f228445n = str3;
        this.f228446o = str4;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("key_arguments", new ProfileSettingsMviFragment.Args(this.f228443l, this.f228444m, this.f228445n, this.f228446o));
        return G0.f406611a;
    }
}

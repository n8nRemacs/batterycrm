package com.avito.android.extended_profile_map;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileMapFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileMapArguments f151259l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ExtendedProfileMapArguments extendedProfileMapArguments) {
        super(1);
        this.f151259l = extendedProfileMapArguments;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("arguments", this.f151259l);
        return G0.f406611a;
    }
}

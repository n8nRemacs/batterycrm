package com.avito.android.tariff_lf_constructor.configure.locations;

import kotlin.Metadata;

/* compiled from: ConstructorConfigureLocationsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureLocationsFragment f299875b;

    public c(ConstructorConfigureLocationsFragment constructorConfigureLocationsFragment) {
        this.f299875b = constructorConfigureLocationsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i iVar = this.f299875b.f299860p0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.i(zBooleanValue);
    }
}

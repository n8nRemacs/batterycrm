package com.avito.android.publish.slots.advantage_banners;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.AdvantageBannersSlot;

/* compiled from: AdvantageBannersSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i f243018a;

    public h(i iVar) {
        this.f243018a = iVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f243018a.getClass();
        return new f((AdvantageBannersSlot) slot);
    }
}

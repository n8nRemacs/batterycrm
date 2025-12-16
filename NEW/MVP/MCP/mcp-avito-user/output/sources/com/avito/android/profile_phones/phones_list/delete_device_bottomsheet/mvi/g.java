package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import ub0.C49016d;

/* compiled from: DeleteDeviceBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227610a;

    /* renamed from: b, reason: collision with root package name */
    public final i f227611b;

    /* renamed from: c, reason: collision with root package name */
    public final k f227612c;

    /* renamed from: d, reason: collision with root package name */
    public final l f227613d;

    public g(d dVar, i iVar, k kVar, l lVar) {
        this.f227610a = dVar;
        this.f227611b = iVar;
        this.f227612c = kVar;
        this.f227613d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f227610a.get();
        h hVar = (h) this.f227611b.get();
        this.f227612c.getClass();
        j jVar = new j();
        DeleteDeviceBottomSheetArgument deleteDeviceBottomSheetArgument = (DeleteDeviceBottomSheetArgument) this.f227613d.f393949a;
        ArrayList arrayList = deleteDeviceBottomSheetArgument.f227595c;
        return new f("DeleteDeviceBottomSheet", new C49016d(deleteDeviceBottomSheetArgument.f227594b, arrayList, arrayList.size() == 1 ? 0 : null, false, 8, null), new e(cVar, jVar, hVar));
    }
}

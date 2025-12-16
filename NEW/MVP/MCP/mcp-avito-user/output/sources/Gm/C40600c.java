package gM;

import com.avito.android.iac_problems.impl_module.startup_tracking.IacDeviceSettingsStartupTrackingTask;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDeviceSettingsStartupTrackingTask_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: gM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40600c implements dagger.internal.h<IacDeviceSettingsStartupTrackingTask> {

    /* renamed from: a, reason: collision with root package name */
    public final h f396457a;

    /* renamed from: b, reason: collision with root package name */
    public final f f396458b;

    public C40600c(h hVar, f fVar) {
        this.f396457a = hVar;
        this.f396458b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacDeviceSettingsStartupTrackingTask((g) this.f396457a.get(), (e) this.f396458b.get());
    }
}

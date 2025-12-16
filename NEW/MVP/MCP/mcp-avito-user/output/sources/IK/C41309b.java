package iK;

import android.os.Build;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.f;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import hK.InterfaceC40840a;

/* compiled from: HardwareAudioManagerModule_ProvideAudioDeviceManagerFactory.java */
@e
@y
@x
/* renamed from: iK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C41309b implements h<InterfaceC40840a> {

    /* renamed from: a, reason: collision with root package name */
    public final C41308a f398499a;

    /* renamed from: b, reason: collision with root package name */
    public final u f398500b;

    /* renamed from: c, reason: collision with root package name */
    public final f f398501c;

    public C41309b(C41308a c41308a, u uVar, f fVar) {
        this.f398499a = c41308a;
        this.f398500b = uVar;
        this.f398501c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f398500b));
        h31.e eVarA2 = g.a(w.a(this.f398501c));
        this.f398499a.getClass();
        return Build.VERSION.SDK_INT >= 31 ? (InterfaceC40840a) eVarA2.get() : (InterfaceC40840a) eVarA.get();
    }
}

package com.avito.android.remote;

import com.avito.android.remote.model.Profile;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: GetProfileWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/Y;", "Lcom/avito/android/remote/X;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Y implements X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f253060a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final gD.f f253061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f253062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34242a0 f253063d;

    @Inject
    public Y(@Y61.k InterfaceC49101b interfaceC49101b, @Y61.k gD.f fVar, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k InterfaceC34242a0 interfaceC34242a0) {
        this.f253060a = interfaceC49101b;
        this.f253061b = fVar;
        this.f253062c = interfaceC34401z0;
        this.f253063d = interfaceC34242a0;
    }

    @Override // com.avito.android.remote.X
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Profile> a() {
        if (this.f253060a.c()) {
            gD.f fVar = this.f253061b;
            fVar.getClass();
            kotlin.reflect.n<Object> nVar = gD.f.f396389r[16];
            if (((Boolean) fVar.f396405q.a().invoke()).booleanValue()) {
                return this.f253063d.a();
            }
        }
        return this.f253062c.a();
    }
}

package com.avito.android.di.module;

import com.avito.android.remote.InterfaceC34242a0;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: ProfileModule_ProvideGetProfileWrapperFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/R6;", "Ldagger/internal/h;", "Lcom/avito/android/remote/X;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class R6 implements dagger.internal.h<com.avito.android.remote.X> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f144116e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ur.e f144117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final gD.h f144118b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34401z0> f144119c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34242a0> f144120d;

    /* compiled from: ProfileModule_ProvideGetProfileWrapperFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/R6$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public R6(@Y61.k ur.e eVar, @Y61.k gD.h hVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f144117a = eVar;
        this.f144118b = hVar;
        this.f144119c = provider;
        this.f144120d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f144117a.get();
        gD.f fVar = (gD.f) this.f144118b.get();
        InterfaceC34401z0 interfaceC34401z0 = this.f144119c.get();
        InterfaceC34242a0 interfaceC34242a0 = this.f144120d.get();
        f144116e.getClass();
        Q6.f144108a.getClass();
        return new com.avito.android.remote.Y(interfaceC49101b, fVar, interfaceC34401z0, interfaceC34242a0);
    }
}

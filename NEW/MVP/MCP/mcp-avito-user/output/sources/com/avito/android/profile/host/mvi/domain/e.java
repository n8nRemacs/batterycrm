package com.avito.android.profile.host.mvi.domain;

import Y61.k;
import com.avito.android.util.R0;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: UserProfileHostLoader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/host/mvi/domain/e;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final s90.b f222396a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41196a f222397b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f222398c;

    @Inject
    public e(@k s90.b bVar, @k InterfaceC41196a interfaceC41196a, @k R0 r02) {
        this.f222396a = bVar;
        this.f222397b = interfaceC41196a;
        this.f222398c = r02;
    }

    @k
    public final C1 a() {
        b bVar = new b(C43175k.G(new c(this, null)), this);
        R0 r02 = this.f222398c;
        return new C1(C43175k.I(r02.a(), bVar), C43175k.I(r02.a(), new a(this.f222397b.j(), this)), new d(3, null));
    }
}

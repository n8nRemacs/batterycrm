package Xv0;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Date;
import javax.inject.Provider;

/* compiled from: StrSoftBookingAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f19162a;

    /* renamed from: b, reason: collision with root package name */
    public final l f19163b;

    /* renamed from: c, reason: collision with root package name */
    public final l f19164c;

    /* renamed from: d, reason: collision with root package name */
    public final l f19165d;

    /* renamed from: e, reason: collision with root package name */
    public final l f19166e;

    /* renamed from: f, reason: collision with root package name */
    public final l f19167f;

    /* renamed from: g, reason: collision with root package name */
    public final l f19168g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<E> f19169h;

    public c(Provider provider, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, Provider provider2) {
        this.f19162a = provider;
        this.f19163b = lVar;
        this.f19164c = lVar2;
        this.f19165d = lVar3;
        this.f19166e = lVar4;
        this.f19167f = lVar5;
        this.f19168g = lVar6;
        this.f19169h = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f19162a.get(), (String) this.f19163b.f393949a, (String) this.f19164c.f393949a, (Boolean) this.f19165d.f393949a, (Date) this.f19166e.f393949a, (Date) this.f19167f.f393949a, (String) this.f19168g.f393949a, this.f19169h.get());
    }
}

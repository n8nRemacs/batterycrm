package Tf0;

import Bk0.InterfaceC13158a;
import com.avito.android.remote.notification.InterfaceC34350q;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vN.C49239c;

/* compiled from: OnMessageReceivedPushServiceDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: Tf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15360b implements h<C15359a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f15814a;

    /* renamed from: b, reason: collision with root package name */
    public final C49239c f15815b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f15816c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC13158a> f15817d;

    public C15360b(u uVar, C49239c c49239c, Provider provider, Provider provider2) {
        this.f15814a = uVar;
        this.f15815b = c49239c;
        this.f15816c = provider;
        this.f15817d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SK.a aVar = (SK.a) this.f15814a.get();
        this.f15815b.get();
        return new C15359a(aVar, this.f15816c.get(), this.f15817d.get());
    }
}

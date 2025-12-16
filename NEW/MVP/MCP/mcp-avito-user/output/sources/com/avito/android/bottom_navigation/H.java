package com.avito.android.bottom_navigation;

import Oj.InterfaceC14702a;
import Rj.C15047a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: NavigationTabSetProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/H;", "Ldagger/internal/h;", "Lcom/avito/android/bottom_navigation/G;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f106949d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49101b> f106950a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14702a> f106951b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C15047a> f106952c;

    /* compiled from: NavigationTabSetProvider_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/H$a;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H(@Y61.k Provider<InterfaceC49101b> provider, @Y61.k Provider<InterfaceC14702a> provider2, @Y61.k Provider<C15047a> provider3) {
        this.f106950a = provider;
        this.f106951b = provider2;
        this.f106952c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49101b interfaceC49101b = this.f106950a.get();
        InterfaceC14702a interfaceC14702a = this.f106951b.get();
        C15047a c15047a = this.f106952c.get();
        f106949d.getClass();
        return new G(interfaceC49101b, interfaceC14702a, c15047a);
    }
}

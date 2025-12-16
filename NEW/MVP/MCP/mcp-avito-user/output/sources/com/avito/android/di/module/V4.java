package com.avito.android.di.module;

import A3.a;
import Cq0.C13343b;
import android.annotation.SuppressLint;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import kotlin.Metadata;

/* compiled from: FavoritePluginModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/V4;", "LA3/b;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class V4 implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.favorites.W f144155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f144156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h31.e<ZC.c> f144157c;

    /* compiled from: FavoritePluginModule.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f144158l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            com.avito.android.util.V2.f318762a.a("DEFAULT_TAG", "favorites sync error", th2);
            return kotlin.G0.f406611a;
        }
    }

    public V4(com.avito.android.favorites.W w12, InterfaceC35745a5 interfaceC35745a5, h31.e<ZC.c> eVar) {
        this.f144155a = w12;
        this.f144156b = interfaceC35745a5;
        this.f144157c = eVar;
    }

    @Override // A3.b
    public final void i(@Y61.k a.b bVar) {
        this.f144155a.b();
    }

    @Override // A3.b
    @SuppressLint({"CheckResult"})
    public final void l(@Y61.k a.InterfaceC0003a.b bVar) {
        this.f144155a.a(0L);
        io.reactivex.rxjava3.kotlin.A1.f(new C41986s0(new io.reactivex.rxjava3.internal.operators.observable.F(new C13343b(this.f144157c, 6))).x(this.f144156b.a()), a.f144158l, null, 2);
    }

    @Override // A3.b
    public final void m(@Y61.l Boolean bool, @Y61.k String str) {
        this.f144155a.a(0L);
    }

    @Override // A3.b
    public final void d(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@Y61.k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void p(@Y61.k a.InterfaceC0003a.d dVar) {
    }
}

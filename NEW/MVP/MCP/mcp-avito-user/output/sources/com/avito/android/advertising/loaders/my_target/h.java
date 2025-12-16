package com.avito.android.advertising.loaders.my_target;

import com.avito.android.advertising.loaders.my_target.d;
import com.my.target.nativeads.d;
import io.reactivex.rxjava3.core.B;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ob.InterfaceC44739c;
import rb.InterfaceC47628b;

/* compiled from: MyTargetBannerLoader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/h;", "Lcom/my/target/nativeads/d$c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference<B<d>> f88415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f88416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference<InterfaceC47628b> f88417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f88418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f88419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f88420f;

    public h(WeakReference<B<d>> weakReference, k kVar, WeakReference<InterfaceC47628b> weakReference2, String str, String str2, b bVar) {
        this.f88415a = weakReference;
        this.f88416b = kVar;
        this.f88417c = weakReference2;
        this.f88418d = str;
        this.f88419e = str2;
        this.f88420f = bVar;
    }

    @Override // com.my.target.nativeads.d.c
    public final void a(@Y61.k k11.c cVar, @Y61.k com.my.target.nativeads.d dVar) {
        B<d> b12 = this.f88415a.get();
        if (b12 == null) {
            return;
        }
        k11.c cVarA = dVar.a();
        k kVar = this.f88416b;
        if (cVarA == null) {
            k.b(kVar, b12, "MyTarget banner is null");
            return;
        }
        String str = cVarA.f406012i;
        boolean z12 = str == null || str.length() == 0;
        boolean z13 = !z12;
        InterfaceC47628b interfaceC47628b = this.f88417c.get();
        if (interfaceC47628b != null) {
            interfaceC47628b.e("mytarget", this.f88418d, this.f88419e, z13);
        }
        if (z12) {
            k.b(kVar, b12, "myTarget banner have is null or empty domain asset");
        } else {
            b12.onNext(new d.a(dVar, L.f(cVarA.f406004a, "store"), this.f88420f));
            b12.e();
        }
    }

    @Override // com.my.target.nativeads.d.c
    public final void g(@Y61.k String str, @Y61.k com.my.target.nativeads.d dVar) {
        B<d> b12 = this.f88415a.get();
        if (b12 != null) {
            k.b(this.f88416b, b12, "noAd");
        }
    }

    @Override // com.my.target.nativeads.d.c
    public final void onClick() {
        h31.e<InterfaceC44739c> eVar;
        InterfaceC44739c interfaceC44739c;
        c cVar = this.f88420f.f88398a;
        if (cVar == null || (eVar = cVar.f88399a.get()) == null || (interfaceC44739c = eVar.get()) == null) {
            return;
        }
        interfaceC44739c.C1(cVar.f88400b, cVar.f88401c);
    }

    @Override // com.my.target.nativeads.d.c
    public final void b() {
    }

    @Override // com.my.target.nativeads.d.c
    public final void c() {
    }

    @Override // com.my.target.nativeads.d.c
    public final void d() {
    }

    @Override // com.my.target.nativeads.d.c
    public final void e() {
    }
}

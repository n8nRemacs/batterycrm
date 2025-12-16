package Gk;

import Y61.k;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;

/* compiled from: BxBeduinNativeItemVisibilityFilterAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGk/c;", "LGk/d;", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WV0.a f6720a;

    public c(@k WV0.a aVar) {
        this.f6720a = aVar;
    }

    @Override // Gk.InterfaceC13892b
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return this.f6720a.a(interfaceC10495b);
    }

    @Override // Gk.d
    public final boolean b() {
        return this.f6720a.f17930a;
    }

    @Override // Gk.InterfaceC13892b
    public final void c(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f6720a.b(i12, interfaceC10495b);
    }

    @Override // Gk.InterfaceC13892b
    @k
    public final Class<Object> d() {
        return this.f6720a.getClass();
    }

    @Override // Gk.InterfaceC13892b
    public final float f() {
        return this.f6720a.f17932c;
    }

    @Override // Gk.d
    public final boolean g() {
        return this.f6720a.f17931b;
    }

    @Override // Gk.InterfaceC13892b
    public final long h() {
        return this.f6720a.f17933d;
    }
}

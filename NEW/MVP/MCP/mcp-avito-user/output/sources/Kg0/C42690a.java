package kg0;

import A3.a;
import Y61.k;
import Y61.l;
import com.avito.android.push.rustore.token_update.i;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import kotlin.Metadata;
import lg0.InterfaceC43767a;

/* compiled from: RustoreAuthorizationPluginModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkg0/a;", "LA3/b;", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42690a implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43767a f406536a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f406537b;

    @Inject
    public C42690a(@k InterfaceC43767a interfaceC43767a, @k i iVar) {
        this.f406536a = interfaceC43767a;
        this.f406537b = iVar;
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
        this.f406536a.a();
        this.f406537b.b(AbstractC41398a.f.f398619c, false);
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
        AbstractC41398a.e eVar = AbstractC41398a.e.f398618c;
        i iVar = this.f406537b;
        iVar.a(eVar, true);
        iVar.a(eVar, false);
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @k String str) {
    }
}

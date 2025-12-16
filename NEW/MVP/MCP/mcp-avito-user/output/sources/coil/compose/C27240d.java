package coil.compose;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AsyncImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.compose.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27240d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f58186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C27242f f58187m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f58188n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f f58189o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n f58190p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f58191q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U f58192r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f58193s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27240d(androidx.compose.ui.v vVar, C27242f c27242f, String str, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, float f12, U u12, int i12) {
        super(2);
        this.f58186l = vVar;
        this.f58187m = c27242f;
        this.f58188n = str;
        this.f58189o = interfaceC22215f;
        this.f58190p = interfaceC22374n;
        this.f58191q = f12;
        this.f58192r = u12;
        this.f58193s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f58193s | 1);
        C27242f c27242f = this.f58187m;
        InterfaceC22374n interfaceC22374n = this.f58190p;
        float f12 = this.f58191q;
        C27241e.b(this.f58186l, c27242f, this.f58188n, this.f58189o, interfaceC22374n, f12, this.f58192r, a12, iA2);
        return G0.f406611a;
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21837ra extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N9 f37197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f37198m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20639x2 f37199n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f37200o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f37201p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21837ra(N9 n92, Y41.a aVar, InterfaceC20639x2 interfaceC20639x2, C22096n c22096n, int i12) {
        super(2);
        this.f37197l = n92;
        this.f37198m = aVar;
        this.f37199n = interfaceC20639x2;
        this.f37200o = c22096n;
        this.f37201p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37201p | 1);
        InterfaceC20639x2 interfaceC20639x2 = this.f37199n;
        C22096n c22096n = this.f37200o;
        C22015za.b(this.f37197l, this.f37198m, interfaceC20639x2, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

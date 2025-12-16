package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22717d extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f43076l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f43077m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f43078n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f43079o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22717d(J j12, Y41.a<G0> aVar, H h12, LayoutDirection layoutDirection) {
        super(0);
        this.f43076l = j12;
        this.f43077m = aVar;
        this.f43078n = h12;
        this.f43079o = layoutDirection;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f43076l.o(this.f43077m, this.f43078n, this.f43079o);
        return G0.f406611a;
    }
}

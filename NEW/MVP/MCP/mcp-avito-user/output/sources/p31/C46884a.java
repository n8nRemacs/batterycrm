package p31;

import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: p31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46884a extends N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f428157l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f428158m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f428159n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46884a(int i12, v vVar, ActivityC22955m activityC22955m) {
        super(3);
        this.f428157l = vVar;
        this.f428158m = activityC22955m;
        this.f428159n = i12;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        int i12 = ((this.f428159n >> 3) & 14) | 64;
        sberid.sdk.ui.screens.compose.elk.root.i.a(this.f428157l, this.f428158m, (A) obj2, i12);
        return G0.f406611a;
    }
}

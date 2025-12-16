package R91;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f14126l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h f14127m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Rect f14128n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, l0.h hVar, Rect rect) {
        super(0);
        this.f14126l = jVar;
        this.f14127m = hVar;
        this.f14128n = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final Object invoke() {
        return this.f14126l.f14145d.b((Bitmap) this.f14127m.f406842b, this.f14128n);
    }
}

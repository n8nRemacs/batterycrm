package R91;

import android.graphics.Bitmap;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f14134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f14135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h f14136n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, j jVar, l0.h hVar) {
        super(0);
        this.f14134l = kVar;
        this.f14135m = jVar;
        this.f14136n = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final Object invoke() {
        k kVar = this.f14134l;
        if (kVar.f14155b && kVar.f14158e && kVar.f14156c) {
            j jVar = this.f14135m;
            zA = jVar.f14149h.a((Bitmap) this.f14136n.f406842b, kVar.f14154a, jVar.f14143b == ru.mts.biometry.sdk.feature.document.ml.c.f436445b);
        }
        return Boolean.valueOf(zA);
    }
}

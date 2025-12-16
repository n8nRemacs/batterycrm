package R91;

import android.graphics.Bitmap;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f14131l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f14132m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h f14133n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, j jVar, l0.h hVar) {
        super(0);
        this.f14131l = kVar;
        this.f14132m = jVar;
        this.f14133n = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final Object invoke() {
        k kVar = this.f14131l;
        boolean zA2 = true;
        if (kVar.f14155b && kVar.f14158e && kVar.f14156c) {
            try {
                zA2 = this.f14132m.f14147f.a((Bitmap) this.f14133n.f406842b, kVar.f14154a);
            } catch (IllegalArgumentException e12) {
                pc1.b.f428696a.m(e12);
            }
        }
        return Boolean.valueOf(zA2);
    }
}

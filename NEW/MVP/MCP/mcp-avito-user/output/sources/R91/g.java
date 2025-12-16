package R91;

import android.graphics.Bitmap;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import wa1.C49587b;

/* loaded from: classes9.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f14137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h f14138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, l0.h hVar) {
        super(0);
        this.f14137l = jVar;
        this.f14138m = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final Object invoke() {
        j jVar = this.f14137l;
        C49587b c49587b = jVar.f14148g;
        Bitmap bitmap = (Bitmap) this.f14138m.f406842b;
        boolean z12 = jVar.f14143b == ru.mts.biometry.sdk.feature.document.ml.c.f436445b;
        c49587b.getClass();
        return Boolean.valueOf(C49587b.a(bitmap, z12));
    }
}

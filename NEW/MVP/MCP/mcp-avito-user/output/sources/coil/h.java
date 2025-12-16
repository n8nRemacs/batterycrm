package coil;

import android.content.Context;
import android.graphics.Bitmap;
import coil.disk.a;
import coil.j;
import coil.util.x;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okio.S;

/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil/disk/a;", "invoke", "()Lcoil/disk/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<coil.disk.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j.a f58414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j.a aVar) {
        super(0);
        this.f58414l = aVar;
    }

    @Override // Y41.a
    public final coil.disk.a invoke() {
        coil.disk.f fVarA;
        x xVar = x.f58801a;
        Context context = this.f58414l.f58505a;
        synchronized (xVar) {
            try {
                fVarA = x.f58802b;
                if (fVarA == null) {
                    a.C2070a c2070a = new a.C2070a();
                    Bitmap.Config[] configArr = coil.util.l.f58781a;
                    File cacheDir = context.getCacheDir();
                    if (cacheDir == null) {
                        throw new IllegalStateException("cacheDir == null");
                    }
                    cacheDir.mkdirs();
                    c2070a.f58313a = S.a.a(S.f420033c, kotlin.io.j.e(cacheDir, "image_cache"));
                    fVarA = c2070a.a();
                    x.f58802b = fVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVarA;
    }
}

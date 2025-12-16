package sberid.sdk.ui.utils.extensions;

import android.content.Context;
import coil.disk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okio.S;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil/disk/a;", "invoke", "()Lcoil/disk/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class f extends N implements Y41.a<coil.disk.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f437904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(0);
        this.f437904l = context;
    }

    @Override // Y41.a
    public final coil.disk.a invoke() {
        a.C2070a c2070a = new a.C2070a();
        c2070a.f58313a = S.a.a(S.f420033c, kotlin.io.j.e(this.f437904l.getCacheDir(), "sid_image_cache"));
        c2070a.f58315c = 0.0d;
        c2070a.f58318f = 10485760L;
        return c2070a.a();
    }
}

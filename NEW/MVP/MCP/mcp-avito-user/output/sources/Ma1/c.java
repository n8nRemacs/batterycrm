package ma1;

import android.graphics.Bitmap;
import kotlin.jvm.internal.N;
import wa1.C49587b;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f414595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f414596m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Bitmap bitmap) {
        super(0);
        this.f414595l = eVar;
        this.f414596m = bitmap;
    }

    @Override // Y41.a
    public final Object invoke() {
        this.f414595l.f414602e.getClass();
        return Boolean.valueOf(C49587b.a(this.f414596m, false));
    }
}

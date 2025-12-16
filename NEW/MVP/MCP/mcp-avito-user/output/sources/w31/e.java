package w31;

import android.content.pm.ApplicationInfo;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f441251l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(0);
        this.f441251l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        h hVar = this.f441251l;
        ApplicationInfo applicationInfo = hVar.f441254a.getApplicationInfo();
        int i12 = applicationInfo.labelRes;
        return i12 == 0 ? applicationInfo.nonLocalizedLabel.toString() : hVar.f441254a.getString(i12);
    }
}

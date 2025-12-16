package Za1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class e extends N implements Y41.l<String, ComponentName> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f20227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f20227l = fVar;
    }

    @Override // Y41.l
    public final ComponentName invoke(String str) {
        String str2 = str;
        int i12 = f.f20228o;
        f fVar = this.f20227l;
        fVar.getClass();
        Intent intent = new Intent("com.vk.push.MASTER_SERVICE");
        intent.setPackage(str2);
        ResolveInfo resolveInfoResolveService = fVar.f367033a.getPackageManager().resolveService(intent, 128);
        if (resolveInfoResolveService != null) {
            return new ComponentName(str2, resolveInfoResolveService.serviceInfo.name);
        }
        fVar.i().error(AK.c.k("Unable to resolve service in ", str2, " by action com.vk.push.MASTER_SERVICE"), null);
        return null;
    }
}

package O51;

import android.content.Context;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f11996l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.f11996l = bVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        Context context = this.f11996l.f11997a;
        return context.getSharedPreferences(context.getPackageName() + "config_store", 0);
    }
}

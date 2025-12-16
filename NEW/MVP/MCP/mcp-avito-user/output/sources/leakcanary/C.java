package leakcanary;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: OncePerPeriodInterceptor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<SharedPreferences> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f413979l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Application application) {
        super(0);
        this.f413979l = application;
    }

    @Override // Y41.a
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f413979l.getSharedPreferences("OncePerPeriodInterceptor", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}

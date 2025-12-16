package Z51;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class j extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f19917l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(0);
        this.f19917l = context;
    }

    @Override // Y41.a
    public final Object invoke() {
        Object bVar;
        Context context = this.f19917l;
        try {
            int i12 = Z.f406624c;
            bVar = new WebView(context);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (WebView) bVar;
    }
}

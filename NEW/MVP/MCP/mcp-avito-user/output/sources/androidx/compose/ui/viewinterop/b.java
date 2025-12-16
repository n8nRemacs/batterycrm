package androidx.compose.ui.viewinterop;

import Y41.l;
import androidx.compose.ui.viewinterop.a;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f42954c;

    public /* synthetic */ b(int i12, Y41.a aVar) {
        this.f42953b = i12;
        this.f42954c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y41.a aVar = this.f42954c;
        switch (this.f42953b) {
            case 0:
                a.b bVar = a.b.f42923l;
                aVar.invoke();
                break;
            default:
                l<a, G0> lVar = a.f42896A;
                aVar.invoke();
                break;
        }
    }
}

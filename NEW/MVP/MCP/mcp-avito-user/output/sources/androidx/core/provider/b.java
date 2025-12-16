package androidx.core.provider;

import androidx.core.content.res.i;
import androidx.core.graphics.z;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes.dex */
class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.a f44810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44811c;

    public b(z.a aVar, int i12) {
        this.f44810b = aVar;
        this.f44811c = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.f fVar = this.f44810b.f44785a;
        if (fVar != null) {
            fVar.b(this.f44811c);
        }
    }
}

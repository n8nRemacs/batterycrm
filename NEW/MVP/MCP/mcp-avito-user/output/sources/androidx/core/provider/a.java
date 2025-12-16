package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.content.res.i;
import androidx.core.graphics.z;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes.dex */
class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.a f44808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f44809c;

    public a(z.a aVar, Typeface typeface) {
        this.f44808b = aVar;
        this.f44809c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.f fVar = this.f44808b.f44785a;
        if (fVar != null) {
            fVar.c(this.f44809c);
        }
    }
}

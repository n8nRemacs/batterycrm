package androidx.media;

import android.content.Context;
import androidx.media.F;
import j.N;
import j.X;

/* compiled from: MediaSessionManagerImplApi21.java */
@X
/* loaded from: classes.dex */
class D extends F {
    public D(Context context) {
        this.f47009a = context;
        this.f47010b = context.getContentResolver();
        this.f47009a = context;
    }

    @Override // androidx.media.F, androidx.media.C.a
    public boolean a(@N F.a aVar) {
        return this.f47009a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", aVar.f47012b, aVar.f47013c) == 0 || super.a(aVar);
    }
}

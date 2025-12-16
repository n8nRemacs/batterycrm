package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;
import j.P;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23084h extends AbstractServiceC23085i.C1812i<Bundle> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f47029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23084h(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f47029f = resultReceiver;
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void c() {
        this.f47029f.send(-1, null);
    }

    @Override // androidx.media.AbstractServiceC23085i.C1812i
    public final void d(@P Bundle bundle) {
        this.f47029f.send(0, bundle);
    }
}

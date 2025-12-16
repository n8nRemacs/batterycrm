package androidx.media3.session;

import com.google.common.util.concurrent.InterfaceC37564s0;

/* compiled from: MediaNotificationManager.java */
/* loaded from: classes.dex */
class L0 implements InterfaceC37564s0<O1> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f52122a;

    public L0(String str) {
        this.f52122a = str;
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final void a(Throwable th2) {
        androidx.media3.common.util.s.h("custom command " + this.f52122a + " produced an error: " + th2.getMessage(), th2);
    }

    @Override // com.google.common.util.concurrent.InterfaceC37564s0
    public final /* bridge */ /* synthetic */ void onSuccess(O1 o12) {
    }
}

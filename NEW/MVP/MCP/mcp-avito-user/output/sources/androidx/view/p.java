package androidx.view;

import android.content.Intent;
import android.content.IntentSender;
import androidx.view.n;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f21235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n.b f21236d;

    public p(n.b bVar, int i12, IntentSender.SendIntentException sendIntentException) {
        this.f21236d = bVar;
        this.f21234b = i12;
        this.f21235c = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21236d.b(this.f21234b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f21235c));
    }
}

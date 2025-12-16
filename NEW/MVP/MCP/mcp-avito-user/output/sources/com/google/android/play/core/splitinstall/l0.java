package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.internal.q0;
import com.google.android.play.core.splitinstall.internal.s0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class l0 extends q0 {

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public static l0 f358820j;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f358821g;

    /* renamed from: h, reason: collision with root package name */
    public final zzo f358822h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f358823i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j.k0
    public l0(Context context) {
        super(new s0("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        zzo zzoVar = zzo.f358905b;
        this.f358821g = new Handler(Looper.getMainLooper());
        this.f358823i = new LinkedHashSet();
        this.f358822h = zzoVar;
    }

    public static synchronized l0 c(Context context) {
        try {
            if (f358820j == null) {
                zzo zzoVar = zzo.f358905b;
                f358820j = new l0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f358820j;
    }

    @Override // com.google.android.play.core.splitinstall.internal.q0
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC37204f abstractC37204fN = AbstractC37204f.n(bundleExtra);
        this.f358790a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", abstractC37204fN);
        W wA2 = this.f358822h.a();
        C37206h c37206h = (C37206h) abstractC37204fN;
        if (c37206h.f358719b != 3 || wA2 == null) {
            d(abstractC37204fN);
        } else {
            wA2.a(c37206h.f358726i, new j0(this, abstractC37204fN, intent, context));
        }
    }

    public final synchronized void d(AbstractC37204f abstractC37204f) {
        try {
            Iterator it = new LinkedHashSet(this.f358823i).iterator();
            while (it.hasNext()) {
                ((InterfaceC37205g) it.next()).a(abstractC37204f);
            }
            synchronized (this) {
                Iterator it2 = new HashSet(this.f358793d).iterator();
                while (it2.hasNext()) {
                    ((MY0.a) it2.next()).a(abstractC37204f);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

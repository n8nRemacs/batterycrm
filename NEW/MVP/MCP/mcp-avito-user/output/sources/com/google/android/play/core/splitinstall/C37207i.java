package com.google.android.play.core.splitinstall;

import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.view.dynamicfeatures.fragment.ui.AbstractProgressFragment;
import androidx.view.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37207i implements InterfaceC37201c {

    /* renamed from: a, reason: collision with root package name */
    public final L f358728a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f358729b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f358730c;

    /* renamed from: d, reason: collision with root package name */
    public final N f358731d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f358732e = new Handler(Looper.getMainLooper());

    public C37207i(L l12, l0 l0Var, g0 g0Var, N n12) {
        this.f358728a = l12;
        this.f358729b = l0Var;
        this.f358730c = g0Var;
        this.f358731d = n12;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> a(com.google.android.play.core.splitinstall.C37203e r12) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C37207i.a(com.google.android.play.core.splitinstall.e):com.google.android.gms.tasks.Task");
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final synchronized void b(InterfaceC37205g interfaceC37205g) {
        l0 l0Var = this.f358729b;
        synchronized (l0Var) {
            l0Var.f358790a.d("unregisterListener", new Object[0]);
            l0Var.f358793d.remove(interfaceC37205g);
            l0Var.b();
        }
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final synchronized void c(InterfaceC37205g interfaceC37205g) {
        l0 l0Var = this.f358729b;
        synchronized (l0Var) {
            l0Var.f358790a.d("registerListener", new Object[0]);
            l0Var.f358793d.add(interfaceC37205g);
            l0Var.b();
        }
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final boolean d(AbstractC37204f abstractC37204f, Ae0.c cVar) {
        if (abstractC37204f.i() != 8 || abstractC37204f.g() == null) {
            return false;
        }
        IntentSender intentSender = abstractC37204f.g().getIntentSender();
        IntentSenderRequest.a aVar = new IntentSenderRequest.a(intentSender);
        aVar.f21248a = null;
        aVar.f21250c = 0;
        aVar.f21249b = 0;
        ((AbstractProgressFragment) cVar.f547c).f53066j0.b(new IntentSenderRequest(intentSender, aVar.f21248a, aVar.f21249b, aVar.f21250c));
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.InterfaceC37201c
    public final Set<String> e() {
        return this.f358730c.b();
    }
}

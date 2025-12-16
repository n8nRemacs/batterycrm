package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.splitinstall.internal.s0;
import com.google.android.play.core.splitinstall.internal.t0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37242t extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f358831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f358832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.play.core.splitinstall.internal.l0 f358833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C37028k f358834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L f358835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37242t(L l12, C37028k c37028k, ArrayList arrayList, ArrayList arrayList2, com.google.android.play.core.splitinstall.internal.l0 l0Var, C37028k c37028k2) {
        super(c37028k);
        this.f358835g = l12;
        this.f358831c = arrayList;
        this.f358832d = arrayList2;
        this.f358833e = l0Var;
        this.f358834f = c37028k2;
    }

    @Override // com.google.android.play.core.splitinstall.internal.t0
    public final void a() {
        C37028k c37028k = this.f358834f;
        L l12 = this.f358835g;
        com.google.android.play.core.splitinstall.internal.l0 l0Var = this.f358833e;
        ArrayList arrayList = this.f358831c;
        s0 s0Var = L.f358685c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList2.add(bundle);
        }
        ArrayList arrayList3 = this.f358832d;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", str2);
            arrayList4.add(bundle2);
        }
        arrayList2.addAll(arrayList4);
        try {
            l0Var.a(2);
            l12.f358688b.f358771m.I3(l12.f358687a, arrayList2, L.a(l0Var), new J(l12, c37028k));
        } catch (RemoteException e12) {
            L.f358685c.c(e12, "startInstall(%s,%s)", arrayList, arrayList3);
            c37028k.c(new RuntimeException(e12));
        }
    }
}

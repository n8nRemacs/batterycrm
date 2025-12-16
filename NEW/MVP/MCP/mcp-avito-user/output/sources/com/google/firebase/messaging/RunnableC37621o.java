package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import vZ0.InterfaceC49287a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC37621o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f361880d;

    public /* synthetic */ RunnableC37621o(Object obj, C37028k c37028k, int i12) {
        this.f361878b = i12;
        this.f361879c = obj;
        this.f361880d = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f361878b) {
            case 0:
                C37028k c37028k = this.f361880d;
                G g12 = FirebaseMessaging.f361749o;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f361879c;
                firebaseMessaging.getClass();
                try {
                    c37028k.b(firebaseMessaging.a());
                    return;
                } catch (Exception e12) {
                    c37028k.a(e12);
                    return;
                }
            case 1:
                C37028k c37028k2 = this.f361880d;
                G g13 = FirebaseMessaging.f361749o;
                FirebaseMessaging firebaseMessaging2 = (FirebaseMessaging) this.f361879c;
                firebaseMessaging2.getClass();
                try {
                    InterfaceC49287a interfaceC49287a = firebaseMessaging2.f361753b;
                    u.b(firebaseMessaging2.f361752a);
                    interfaceC49287a.a();
                    c37028k2.b(null);
                    return;
                } catch (Exception e13) {
                    c37028k2.a(e13);
                    return;
                }
            case 2:
                FirebaseMessaging firebaseMessaging3 = (FirebaseMessaging) this.f361879c;
                C37028k c37028k3 = this.f361880d;
                G g14 = FirebaseMessaging.f361749o;
                firebaseMessaging3.getClass();
                try {
                    r rVar = firebaseMessaging3.f361756e;
                    rVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    C37030m.a(rVar.a(rVar.c(u.b(rVar.f361885a), "*", bundle)));
                    G gC2 = FirebaseMessaging.c(firebaseMessaging3.f361755d);
                    String strD = firebaseMessaging3.d();
                    String strB = u.b(firebaseMessaging3.f361752a);
                    synchronized (gC2) {
                        String strA = G.a(strD, strB);
                        SharedPreferences.Editor editorEdit = gC2.f361770a.edit();
                        editorEdit.remove(strA);
                        editorEdit.commit();
                    }
                    c37028k3.b(null);
                    return;
                } catch (Exception e14) {
                    c37028k3.a(e14);
                    return;
                }
            default:
                C37028k c37028k4 = this.f361880d;
                try {
                    c37028k4.b(((s) this.f361879c).a());
                    return;
                } catch (Exception e15) {
                    c37028k4.a(e15);
                    return;
                }
        }
    }
}

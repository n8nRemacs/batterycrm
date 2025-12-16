package com.google.firebase.messaging;

import android.content.SharedPreferences;
import com.google.firebase.messaging.P;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361742c;

    public /* synthetic */ E(Object obj, int i12) {
        this.f361741b = i12;
        this.f361742c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f361741b) {
            case 0:
                F f12 = (F) this.f361742c;
                synchronized (f12.f361746d) {
                    SharedPreferences.Editor editorEdit = f12.f361743a.edit();
                    String str = f12.f361744b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = f12.f361746d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(f12.f361745c);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                }
                return;
            default:
                P.a aVar = (P.a) this.f361742c;
                aVar.f361823a.getAction();
                aVar.f361824b.d(null);
                return;
        }
    }
}

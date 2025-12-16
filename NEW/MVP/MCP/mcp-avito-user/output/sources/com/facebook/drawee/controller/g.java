package com.facebook.drawee.controller;

import QW0.h;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;

/* compiled from: ForwardingControllerListener.java */
@J41.d
/* loaded from: classes.dex */
public class g<INFO> implements e<INFO>, h<INFO> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f340017b = new ArrayList(2);

    @Override // com.facebook.drawee.controller.e
    public final synchronized void a(String str) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.a(str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.e
    public final void b(String str, Throwable th2) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.b(str, th2);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.e
    public final synchronized void c(String str) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.c(str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.e
    public final void d(@I41.h Object obj, String str) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.d(obj, str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.e
    public final synchronized void e(String str, Throwable th2) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.e(str, th2);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // com.facebook.drawee.controller.e
    public final synchronized void f(String str, @I41.h INFO info, @I41.h Animatable animatable) {
        int size = this.f340017b.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                e eVar = (e) this.f340017b.get(i12);
                if (eVar != null) {
                    eVar.f(str, info, animatable);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    public final synchronized void g(e<? super INFO> eVar) {
        this.f340017b.add(eVar);
    }
}

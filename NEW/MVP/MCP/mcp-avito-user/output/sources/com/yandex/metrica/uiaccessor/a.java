package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class a implements Z21.a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final InterfaceC10964a f382501a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public FragmentLifecycleCallback f382502b;

    /* renamed from: com.yandex.metrica.uiaccessor.a$a, reason: collision with other inner class name */
    public interface InterfaceC10964a {
        void fragmentAttached(@N Activity activity);
    }

    public a(@N InterfaceC10964a interfaceC10964a) {
        this.f382501a = interfaceC10964a;
    }

    @Override // Z21.a
    public final void subscribe(@N Activity activity) {
        if (activity instanceof ActivityC22955m) {
            if (this.f382502b == null) {
                this.f382502b = new FragmentLifecycleCallback(this.f382501a, activity);
            }
            FragmentManager supportFragmentManager = ((ActivityC22955m) activity).getSupportFragmentManager();
            supportFragmentManager.v0(this.f382502b);
            supportFragmentManager.e0(this.f382502b, true);
        }
    }

    @Override // Z21.a
    public final void unsubscribe(@N Activity activity) {
        if (!(activity instanceof ActivityC22955m) || this.f382502b == null) {
            return;
        }
        ((ActivityC22955m) activity).getSupportFragmentManager().v0(this.f382502b);
    }
}

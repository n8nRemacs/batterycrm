package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.a;
import j.N;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class FragmentLifecycleCallback extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final a.InterfaceC10964a f382499a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final WeakReference<Activity> f382500b;

    public FragmentLifecycleCallback(@N a.InterfaceC10964a interfaceC10964a, @N Activity activity) {
        this.f382499a = interfaceC10964a;
        this.f382500b = new WeakReference<>(activity);
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public void onFragmentAttached(@N FragmentManager fragmentManager, @N Fragment fragment, @N Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = this.f382500b.get();
        if (activity != null) {
            this.f382499a.fragmentAttached(activity);
        }
    }
}

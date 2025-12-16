package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C20199a;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class zzd extends Fragment implements InterfaceC36656m {

    /* renamed from: i0, reason: collision with root package name */
    public static final WeakHashMap f349255i0 = new WeakHashMap();

    /* renamed from: f0, reason: collision with root package name */
    public final Map f349256f0 = Collections.synchronizedMap(new C20199a());

    /* renamed from: g0, reason: collision with root package name */
    public int f349257g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    @j.P
    public Bundle f349258h0;

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @j.P FileDescriptor fileDescriptor, PrintWriter printWriter, @j.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @j.P Intent intent) {
        super.onActivityResult(i12, i13, intent);
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d(i12, i13, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@j.P Bundle bundle) {
        super.onCreate(bundle);
        this.f349257g0 = 1;
        this.f349258h0 = bundle;
        for (Map.Entry entry : this.f349256f0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f349257g0 = 5;
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f349257g0 = 3;
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f349256f0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f349257g0 = 2;
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f349257g0 = 4;
        Iterator it = this.f349256f0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36656m
    public final void u1(String str, @j.N w1 w1Var) {
        Map map = this.f349256f0;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AK.c.k("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, w1Var);
        if (this.f349257g0 > 0) {
            new zzi(Looper.getMainLooper()).post(new J1(this, w1Var, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36656m
    @j.P
    public final LifecycleCallback w(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f349256f0.get(str));
    }
}

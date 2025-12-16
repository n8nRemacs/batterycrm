package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C20199a;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class I1 extends Fragment implements InterfaceC36656m {

    /* renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f349015e = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f349016b = Collections.synchronizedMap(new C20199a());

    /* renamed from: c, reason: collision with root package name */
    public int f349017c = 0;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public Bundle f349018d;

    @Override // android.app.Fragment
    public final void dump(String str, @j.P FileDescriptor fileDescriptor, PrintWriter printWriter, @j.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36656m
    @j.P
    public final Activity l1() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i12, int i13, @j.P Intent intent) {
        super.onActivityResult(i12, i13, intent);
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d(i12, i13, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@j.P Bundle bundle) {
        super.onCreate(bundle);
        this.f349017c = 1;
        this.f349018d = bundle;
        for (Map.Entry entry : this.f349016b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f349017c = 5;
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f349017c = 3;
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f349016b.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f349017c = 2;
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f349017c = 4;
        Iterator it = this.f349016b.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36656m
    public final void u1(String str, @j.N w1 w1Var) {
        Map map = this.f349016b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AK.c.k("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, w1Var);
        if (this.f349017c > 0) {
            new zzi(Looper.getMainLooper()).post(new H1(this, w1Var, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36656m
    @j.P
    public final LifecycleCallback w(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f349016b.get(str));
    }
}

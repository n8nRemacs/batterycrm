package androidx.fragment.app;

import android.view.View;
import androidx.core.view.C22823h0;
import java.util.ArrayList;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
class N implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46493f;

    public N(int i12, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f46489b = i12;
        this.f46490c = arrayList;
        this.f46491d = arrayList2;
        this.f46492e = arrayList3;
        this.f46493f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i12 = 0; i12 < this.f46489b; i12++) {
            C22823h0.P((View) this.f46490c.get(i12), (String) this.f46491d.get(i12));
            C22823h0.P((View) this.f46492e.get(i12), (String) this.f46493f.get(i12));
        }
    }
}

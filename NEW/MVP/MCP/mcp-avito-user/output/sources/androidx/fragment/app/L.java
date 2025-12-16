package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
class L implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f46473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f46476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K f46477e;

    public L(K k12, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f46477e = k12;
        this.f46473a = obj;
        this.f46474b = arrayList;
        this.f46475c = obj2;
        this.f46476d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        K k12 = this.f46477e;
        Object obj = this.f46473a;
        if (obj != null) {
            k12.t(obj, this.f46474b, null);
        }
        Object obj2 = this.f46475c;
        if (obj2 != null) {
            k12.t(obj2, this.f46476d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}

package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalPhoto;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final class l29 extends phd implements adf {
    public final ek8 X;
    public final ek8 Y;
    public final ek8 Z;
    public final l48 d;
    public final ti6 o;
    public wo8 s0;
    public final bh0 t0;
    public boolean u0;
    public boolean v0;
    public final List w0;
    public final nd8 x0;
    public final HashMap y0;

    public l29(ActLocalMedias actLocalMedias, ArrayList arrayList, nd8 nd8Var) {
        ti6 ti6VarZ = actLocalMedias.z();
        l48 l48Var = actLocalMedias.a;
        this.X = new ek8((Object) null);
        this.Y = new ek8((Object) null);
        this.Z = new ek8((Object) null);
        bh0 bh0Var = new bh0();
        bh0Var.a = new CopyOnWriteArrayList();
        this.t0 = bh0Var;
        this.u0 = false;
        this.v0 = false;
        this.o = ti6VarZ;
        this.d = l48Var;
        A(true);
        this.w0 = arrayList;
        this.x0 = nd8Var;
        this.y0 = new HashMap();
    }

    public static void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean D(long j) {
        return j >= 0 && j < ((long) this.w0.size());
    }

    public final void E() {
        ek8 ek8Var;
        ek8 ek8Var2;
        a aVar;
        View viewB;
        if (!this.v0 || this.o.P()) {
            return;
        }
        xs xsVar = new xs(0);
        int i = 0;
        while (true) {
            ek8Var = this.X;
            int iG = ek8Var.g();
            ek8Var2 = this.Z;
            if (i >= iG) {
                break;
            }
            long jD = ek8Var.d(i);
            if (!D(jD)) {
                xsVar.add(Long.valueOf(jD));
                ek8Var2.f(jD);
            }
            i++;
        }
        if (!this.u0) {
            this.v0 = false;
            for (int i2 = 0; i2 < ek8Var.g(); i2++) {
                long jD2 = ek8Var.d(i2);
                if (ek8Var2.c(jD2) < 0 && ((aVar = (a) ek8Var.b(jD2)) == null || (viewB = aVar.B()) == null || viewB.getParent() == null)) {
                    xsVar.add(Long.valueOf(jD2));
                }
            }
        }
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            I(((Long) qsVar.next()).longValue());
        }
    }

    public final FrgLocalMedia F(long j) {
        WeakReference weakReference = (WeakReference) this.y0.get(Long.valueOf(j));
        if (weakReference != null) {
            return (FrgLocalMedia) weakReference.get();
        }
        return null;
    }

    public final Long G(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            ek8 ek8Var = this.Z;
            if (i2 >= ek8Var.g()) {
                return lValueOf;
            }
            if (((Integer) ek8Var.h(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(ek8Var.d(i2));
            }
            i2++;
        }
    }

    public final void H(bj6 bj6Var) {
        a aVar = (a) this.X.b(bj6Var.o);
        if (aVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) bj6Var.a;
        View viewB = aVar.B();
        if (!aVar.F() && viewB != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zF = aVar.F();
        ti6 ti6Var = this.o;
        if (zF && viewB == null) {
            ((CopyOnWriteArrayList) ti6Var.o.c).add(new hi6(new h79(this, aVar, frameLayout)));
            return;
        }
        if (aVar.F() && viewB.getParent() != null) {
            if (viewB.getParent() != frameLayout) {
                C(viewB, frameLayout);
                return;
            }
            return;
        }
        if (aVar.F()) {
            C(viewB, frameLayout);
            return;
        }
        if (ti6Var.P()) {
            if (ti6Var.J) {
                return;
            }
            this.d.a(new xn4(this, bj6Var));
            return;
        }
        ((CopyOnWriteArrayList) ti6Var.o.c).add(new hi6(new h79(this, aVar, frameLayout)));
        bh0 bh0Var = this.t0;
        bh0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = bh0Var.a.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
        try {
            aVar.o0(false);
            ue0 ue0Var = new ue0(ti6Var);
            ue0Var.f(0, aVar, "f" + bj6Var.o, 1);
            ue0Var.i(aVar, l38.d);
            ue0Var.e();
            this.s0.g(false);
        } finally {
            bh0.a(arrayList);
        }
    }

    public final void I(long j) {
        ViewParent parent;
        ek8 ek8Var = this.X;
        a aVar = (a) ek8Var.b(j);
        if (aVar == null) {
            return;
        }
        if (aVar.B() != null && (parent = aVar.B().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zD = D(j);
        ek8 ek8Var2 = this.Y;
        if (!zD) {
            ek8Var2.f(j);
        }
        if (!aVar.F()) {
            ek8Var.f(j);
            return;
        }
        ti6 ti6Var = this.o;
        if (ti6Var.P()) {
            this.v0 = true;
            return;
        }
        boolean zF = aVar.F();
        bh0 bh0Var = this.t0;
        if (zF && D(j)) {
            bh0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = bh0Var.a.iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
            e eVar = (e) ti6Var.c.b.get(aVar.o);
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.equals(aVar)) {
                    ci6 ci6Var = aVar2.a > -1 ? new ci6(eVar.o()) : null;
                    bh0.a(arrayList);
                    ek8Var2.e(j, ci6Var);
                }
            }
            ti6Var.i0(new IllegalStateException(u45.j("Fragment ", aVar, " is not currently in the FragmentManager")));
            throw null;
        }
        bh0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = bh0Var.a.iterator();
        if (it2.hasNext()) {
            throw ctd.h(it2);
        }
        try {
            ue0 ue0Var = new ue0(ti6Var);
            ue0Var.h(aVar);
            ue0Var.e();
            ek8Var.f(j);
        } finally {
            bh0.a(arrayList2);
        }
    }

    @Override // defpackage.adf
    public final Parcelable a() {
        ek8 ek8Var = this.X;
        int iG = ek8Var.g();
        ek8 ek8Var2 = this.Y;
        Bundle bundle = new Bundle(ek8Var2.g() + iG);
        for (int i = 0; i < ek8Var.g(); i++) {
            long jD = ek8Var.d(i);
            a aVar = (a) ek8Var.b(jD);
            if (aVar != null && aVar.F()) {
                String strE = vb9.e(jD, "f#");
                ti6 ti6Var = this.o;
                ti6Var.getClass();
                if (aVar.D0 != ti6Var) {
                    ti6Var.i0(new IllegalStateException(u45.j("Fragment ", aVar, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(strE, aVar.o);
            }
        }
        for (int i2 = 0; i2 < ek8Var2.g(); i2++) {
            long jD2 = ek8Var2.d(i2);
            if (D(jD2)) {
                bundle.putParcelable(vb9.e(jD2, "s#"), (Parcelable) ek8Var2.b(jD2));
            }
        }
        return bundle;
    }

    @Override // defpackage.adf
    public final void c(Parcelable parcelable) throws NumberFormatException {
        ek8 ek8Var = this.Y;
        if (ek8Var.g() == 0) {
            ek8 ek8Var2 = this.X;
            if (ek8Var2.g() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(l29.class.getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j = Long.parseLong(str.substring(2));
                        ti6 ti6Var = this.o;
                        ti6Var.getClass();
                        String string = bundle.getString(str);
                        a aVar = null;
                        if (string != null) {
                            a aVarB = ti6Var.c.b(string);
                            if (aVarB == null) {
                                ti6Var.i0(new IllegalStateException(wy1.i("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                            aVar = aVarB;
                        }
                        ek8Var2.e(j, aVar);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j2 = Long.parseLong(str.substring(2));
                        ci6 ci6Var = (ci6) bundle.getParcelable(str);
                        if (D(j2)) {
                            ek8Var.e(j2, ci6Var);
                        }
                    }
                }
                if (ek8Var2.g() == 0) {
                    return;
                }
                this.v0 = true;
                this.u0 = true;
                E();
                Handler handler = new Handler(Looper.getMainLooper());
                ue ueVar = new ue(23, this);
                this.d.a(new xn4(handler, 2, ueVar));
                handler.postDelayed(ueVar, WorkRequest.MIN_BACKOFF_MILLIS);
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // defpackage.phd
    public final int j() {
        return this.w0.size();
    }

    @Override // defpackage.phd
    public final long k(int i) {
        return i;
    }

    @Override // defpackage.phd
    public final void q(RecyclerView recyclerView) {
        z5j.b(this.s0 == null);
        wo8 wo8Var = new wo8();
        wo8Var.X = this;
        wo8Var.a = -1L;
        this.s0 = wo8Var;
        ViewPager2 viewPager2F = wo8.f(recyclerView);
        wo8Var.o = viewPager2F;
        ki0 ki0Var = new ki0(7, wo8Var);
        wo8Var.b = ki0Var;
        viewPager2F.b(ki0Var);
        kd5 kd5Var = new kd5(2, wo8Var);
        wo8Var.c = kd5Var;
        z(kd5Var);
        nhd nhdVar = new nhd(5, wo8Var);
        wo8Var.d = nhdVar;
        this.d.a(nhdVar);
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        a frgLocalPhoto;
        Bundle bundle;
        bj6 bj6Var = (bj6) midVar;
        long j = bj6Var.o;
        FrameLayout frameLayout = (FrameLayout) bj6Var.a;
        int id = frameLayout.getId();
        Long lG = G(id);
        ek8 ek8Var = this.Z;
        if (lG != null && lG.longValue() != j) {
            I(lG.longValue());
            ek8Var.f(lG.longValue());
        }
        ek8Var.e(j, Integer.valueOf(id));
        long j2 = i;
        ek8 ek8Var2 = this.X;
        if (ek8Var2.c(j2) < 0) {
            pd8 pd8Var = (pd8) this.w0.get(i);
            String strA = pd8Var.a();
            int i2 = pd8Var.a;
            long j3 = pd8Var.b;
            nd8 nd8Var = this.x0;
            String str = nd8Var.X;
            Bundle bundle2 = null;
            boolean zA = goi.a(strA != null ? Uri.parse(strA) : null, str != null ? Uri.parse(str) : null);
            HashMap map = this.y0;
            if (i2 != 1) {
                if (i2 != 3) {
                    throw new IllegalStateException(ho7.f(i2, "media type should be known, type = "));
                }
                frgLocalPhoto = new FrgLocalVideo();
                frgLocalPhoto.n0(FrgLocalMedia.C0(pd8Var, zA, nd8Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            } else if (pd8Var.d()) {
                frgLocalPhoto = new FrgLocalGif();
                frgLocalPhoto.n0(FrgLocalMedia.C0(pd8Var, zA, nd8Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            } else {
                frgLocalPhoto = new FrgLocalPhoto();
                frgLocalPhoto.n0(FrgLocalMedia.C0(pd8Var, zA, nd8Var));
                map.put(Long.valueOf(j3), new WeakReference(frgLocalPhoto));
            }
            ci6 ci6Var = (ci6) this.Y.b(j2);
            if (frgLocalPhoto.D0 != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (ci6Var != null && (bundle = ci6Var.a) != null) {
                bundle2 = bundle;
            }
            frgLocalPhoto.b = bundle2;
            ek8Var2.e(j2, frgLocalPhoto);
        }
        if (frameLayout.isAttachedToWindow()) {
            H(bj6Var);
        }
        E();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = bj6.E0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new bj6(frameLayout);
    }

    @Override // defpackage.phd
    public final void u(RecyclerView recyclerView) {
        wo8 wo8Var = this.s0;
        wo8Var.getClass();
        wo8.f(recyclerView).g((ki0) wo8Var.b);
        l29 l29Var = (l29) wo8Var.X;
        l29Var.B((kd5) wo8Var.c);
        l29Var.d.f((nhd) wo8Var.d);
        wo8Var.o = null;
        this.s0 = null;
    }

    @Override // defpackage.phd
    public final /* bridge */ /* synthetic */ boolean v(mid midVar) {
        return true;
    }

    @Override // defpackage.phd
    public final void w(mid midVar) {
        H((bj6) midVar);
        E();
    }

    @Override // defpackage.phd
    public final void y(mid midVar) {
        Long lG = G(((FrameLayout) ((bj6) midVar).a).getId());
        if (lG != null) {
            I(lG.longValue());
            this.Z.f(lG.longValue());
        }
    }
}

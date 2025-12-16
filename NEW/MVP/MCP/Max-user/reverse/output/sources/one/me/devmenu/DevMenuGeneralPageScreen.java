package one.me.devmenu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ed8;
import defpackage.efe;
import defpackage.g56;
import defpackage.gw0;
import defpackage.iv4;
import defpackage.joe;
import defpackage.ka4;
import defpackage.koe;
import defpackage.kti;
import defpackage.m8a;
import defpackage.myg;
import defpackage.pfe;
import defpackage.pg1;
import defpackage.su4;
import defpackage.tqi;
import defpackage.ue3;
import defpackage.ve3;
import defpackage.vw4;
import defpackage.we3;
import defpackage.x26;
import defpackage.xu4;
import defpackage.yg4;
import defpackage.z71;
import defpackage.zu4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/DevMenuGeneralPageScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Ljoe;", "Lmyg;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class DevMenuGeneralPageScreen extends SectionRecyclerWidget implements joe, myg {
    public final List X;
    public final m8a Y;
    public final koe d;
    public final z71 o;

    public DevMenuGeneralPageScreen() {
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        this.d = new koe(this, forkJoinPoolCommonPool);
        this.o = new z71(forkJoinPoolCommonPool, 5);
        this.X = su4.a.getAccessor().a(2);
        this.Y = new m8a();
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: A0, reason: from getter */
    public final koe getD() {
        return this.d;
    }

    @Override // defpackage.myg
    public final void G(long j, String str) {
        Object next;
        List<iv4> list = this.X;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    iv4Var.c(yg4Var, str);
                    return;
                }
            }
        }
    }

    @Override // defpackage.joe
    public final void e0(long j, boolean z) {
        Object next;
        List<iv4> list = this.X;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    iv4Var.d(yg4Var);
                    return;
                }
            }
        }
    }

    @Override // defpackage.joe
    public final void h(long j) {
        Object next;
        List<iv4> list = this.X;
        if (list == null || !list.isEmpty()) {
            for (iv4 iv4Var : list) {
                Iterator it = ((Iterable) iv4Var.b().getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((yg4) next).a == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                yg4 yg4Var = (yg4) next;
                if (yg4Var != null) {
                    iv4Var.d(yg4Var);
                    return;
                }
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        RecyclerView recyclerViewB0 = B0(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        float f = 12;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, kti.d(vw4.d().getDisplayMetrics().density * f), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, kti.d(f * vw4.d().getDisplayMetrics().density));
        linearLayout.addView(recyclerViewB0, layoutParams);
        tqi.c(new pg1(3, null, 2), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.Y.a();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.X) {
            iv4 iv4Var = (iv4) obj;
            if (!(iv4Var instanceof ed8) && !(iv4Var instanceof efe) && !(iv4Var instanceof pfe)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            arrayList2.add(new zu4(((iv4) next).b(), this, i));
            i = i2;
        }
        gw0.w(new g56(new ka4((x26[]) ue3.d0(arrayList2).toArray(new x26[0]), 1), new xu4(this, null), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: y0, reason: from getter */
    public final z71 getO() {
        return this.o;
    }
}

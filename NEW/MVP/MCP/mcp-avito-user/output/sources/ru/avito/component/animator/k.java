package ru.avito.component.animator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.animator.k;

/* compiled from: ExtensibleItemAnimator.kt */
@InterfaceC41178c
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/animator/k;", "Landroidx/recyclerview/widget/O;", "a", "b", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k extends O {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f430297h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430298i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430299j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ArrayList<b> f430300k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ArrayList<a> f430301l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ArrayList<ArrayList<RecyclerView.C>> f430302m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ArrayList<ArrayList<b>> f430303n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ArrayList<ArrayList<a>> f430304o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430305p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430306q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430307r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ArrayList<RecyclerView.C> f430308s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f430309t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f430310u;

    /* compiled from: ExtensibleItemAnimator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/k$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public RecyclerView.C f430311a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public RecyclerView.C f430312b;

        /* renamed from: c, reason: collision with root package name */
        public int f430313c;

        /* renamed from: d, reason: collision with root package name */
        public int f430314d;

        /* renamed from: e, reason: collision with root package name */
        public int f430315e;

        /* renamed from: f, reason: collision with root package name */
        public int f430316f;

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f430311a);
            sb2.append(", newHolder=");
            sb2.append(this.f430312b);
            sb2.append(", fromX=");
            sb2.append(this.f430313c);
            sb2.append(", fromY=");
            sb2.append(this.f430314d);
            sb2.append(", toX=");
            sb2.append(this.f430315e);
            sb2.append(", toY=");
            return androidx.appcompat.app.r.t(sb2, this.f430316f, '}');
        }
    }

    /* compiled from: ExtensibleItemAnimator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/animator/k$b;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public RecyclerView.C f430317a;

        /* renamed from: b, reason: collision with root package name */
        public int f430318b;

        /* renamed from: c, reason: collision with root package name */
        public int f430319c;

        /* renamed from: d, reason: collision with root package name */
        public int f430320d;

        /* renamed from: e, reason: collision with root package name */
        public int f430321e;
    }

    public k() {
        this(false, 1, null);
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i12 = size - 1;
            ((RecyclerView.C) arrayList.get(size)).itemView.animate().cancel();
            if (i12 < 0) {
                return;
            } else {
                size = i12;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean g(@Y61.k RecyclerView.C c12, @Y61.k List<? extends Object> list) {
        return !list.isEmpty() || f(c12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    @SuppressLint({"HardcodeStringDetector"})
    public final void j(@Y61.k RecyclerView.C c12) {
        View view = c12.itemView;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f430300k;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                if (arrayList.get(size).f430317a == c12) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    h(c12);
                    arrayList.remove(size);
                }
                if (i12 < 0) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        u(this.f430301l, c12);
        if (this.f430298i.remove(c12)) {
            view.setAlpha(1.0f);
            h(c12);
        }
        if (this.f430299j.remove(c12)) {
            view.setAlpha(1.0f);
            h(c12);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f430304o;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i13 = size2 - 1;
                ArrayList<a> arrayList3 = arrayList2.get(size2);
                u(arrayList3, c12);
                if (arrayList3.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i13 < 0) {
                    break;
                } else {
                    size2 = i13;
                }
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f430303n;
        int size3 = arrayList4.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i14 = size3 - 1;
                ArrayList<b> arrayList5 = arrayList4.get(size3);
                int size4 = arrayList5.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i15 = size4 - 1;
                        if (arrayList5.get(size4).f430317a == c12) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            h(c12);
                            arrayList5.remove(size4);
                            if (arrayList5.isEmpty()) {
                                arrayList4.remove(size3);
                            }
                        } else if (i15 < 0) {
                            break;
                        } else {
                            size4 = i15;
                        }
                    }
                }
                if (i14 < 0) {
                    break;
                } else {
                    size3 = i14;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.C>> arrayList6 = this.f430302m;
        int size5 = arrayList6.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i16 = size5 - 1;
                ArrayList<RecyclerView.C> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(c12)) {
                    view.setAlpha(1.0f);
                    h(c12);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
                if (i16 < 0) {
                    break;
                } else {
                    size5 = i16;
                }
            }
        }
        boolean zRemove = this.f430307r.remove(c12);
        boolean z12 = this.f430297h;
        if (zRemove && z12) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f430305p.remove(c12) && z12) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.f430308s.remove(c12) && z12) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f430306q.remove(c12) && z12) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void k() {
        ArrayList<b> arrayList = this.f430300k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            RecyclerView.C c12 = arrayList.get(size).f430317a;
            View view = c12.itemView;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            h(c12);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.C> arrayList2 = this.f430298i;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.C> arrayList3 = this.f430299j;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (-1 >= size3) {
                break;
            }
            RecyclerView.C c13 = arrayList3.get(size3);
            c13.itemView.setAlpha(1.0f);
            h(c13);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f430301l;
        for (int size4 = arrayList4.size() - 1; -1 < size4; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.C c14 = aVar.f430311a;
            if (c14 != null) {
                v(aVar, c14);
            }
            RecyclerView.C c15 = aVar.f430312b;
            if (c15 != null) {
                v(aVar, c15);
            }
        }
        arrayList4.clear();
        if (l()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f430303n;
            for (int size5 = arrayList5.size() - 1; -1 < size5; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; -1 < size6; size6--) {
                    RecyclerView.C c16 = arrayList6.get(size6).f430317a;
                    View view2 = c16.itemView;
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    h(c16);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.C>> arrayList7 = this.f430302m;
            for (int size7 = arrayList7.size() - 1; -1 < size7; size7--) {
                ArrayList<RecyclerView.C> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; -1 < size8; size8--) {
                    RecyclerView.C c17 = arrayList8.get(size8);
                    c17.itemView.setAlpha(1.0f);
                    h(c17);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f430304o;
            for (int size9 = arrayList9.size() - 1; -1 < size9; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; -1 < size10; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.C c18 = aVar2.f430311a;
                    if (c18 != null) {
                        v(aVar2, c18);
                    }
                    RecyclerView.C c19 = aVar2.f430312b;
                    if (c19 != null) {
                        v(aVar2, c19);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            s(this.f430307r);
            s(this.f430306q);
            s(this.f430305p);
            s(this.f430308s);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean l() {
        return (this.f430299j.isEmpty() && this.f430301l.isEmpty() && this.f430300k.isEmpty() && this.f430298i.isEmpty() && this.f430306q.isEmpty() && this.f430307r.isEmpty() && this.f430305p.isEmpty() && this.f430308s.isEmpty() && this.f430303n.isEmpty() && this.f430302m.isEmpty() && this.f430304o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void n() {
        RecyclerView.C next;
        b next2;
        long j12;
        RecyclerView.C c12;
        RecyclerView.C c13;
        ArrayList<RecyclerView.C> arrayList = this.f430298i;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<b> arrayList2 = this.f430300k;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<a> arrayList3 = this.f430301l;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.C> arrayList4 = this.f430299j;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        Iterator<RecyclerView.C> it = arrayList.iterator();
        a next3 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jA2 = w(next).a();
                do {
                    RecyclerView.C next4 = it.next();
                    long jA3 = w(next4).a();
                    if (jA2 < jA3) {
                        next = next4;
                        jA2 = jA3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        RecyclerView.C c14 = next;
        long jA4 = c14 != null ? w(c14).a() : 0L;
        Iterator<b> it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                ((d) w(next2.f430317a)).getClass();
                do {
                    ((d) w(it2.next().f430317a)).getClass();
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        b bVar = next2;
        if (bVar == null || (c13 = bVar.f430317a) == null) {
            j12 = 0;
        } else {
            ((d) w(c13)).getClass();
            j12 = 250;
        }
        Iterator<a> it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                RecyclerView.C c15 = next3.f430311a;
                long jE2 = c15 != null ? w(c15).e() : 0L;
                do {
                    a next5 = it3.next();
                    a aVar = next3;
                    RecyclerView.C c16 = next5.f430311a;
                    long jE3 = c16 != null ? w(c16).e() : 0L;
                    if (jE2 < jE3) {
                        next3 = next5;
                        jE2 = jE3;
                    } else {
                        next3 = aVar;
                    }
                } while (it3.hasNext());
            }
        }
        a aVar2 = next3;
        long jE4 = (aVar2 == null || (c12 = aVar2.f430311a) == null) ? 0L : w(c12).e();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.C> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Iterator<RecyclerView.C> it5 = it4;
            RecyclerView.C next6 = it4.next();
            long j13 = j12;
            this.f430307r.add(next6);
            d dVar = (d) w(next6);
            dVar.getClass();
            A0 a0A = C22823h0.a(next6.itemView);
            a0A.c(dVar.a());
            a0A.a(0.0f);
            h hVar = new h();
            a0A.e(new q(new p(this, next6, new ru.avito.component.animator.a(a0A, hVar)), hVar));
            a0A.f();
            it4 = it5;
            j12 = j13;
            jE4 = jE4;
        }
        long j14 = j12;
        long j15 = jE4;
        arrayList.clear();
        if (!zIsEmpty2) {
            final ArrayList<b> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f430303n.add(arrayList5);
            arrayList2.clear();
            final int i12 = 0;
            Runnable runnable = new Runnable() { // from class: ru.avito.component.animator.j
                @Override // java.lang.Runnable
                public final void run() {
                    View view;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList6 = arrayList5;
                            Iterator it6 = arrayList6.iterator();
                            while (true) {
                                boolean zHasNext = it6.hasNext();
                                k kVar = this;
                                if (!zHasNext) {
                                    arrayList6.clear();
                                    kVar.f430303n.remove(arrayList6);
                                    break;
                                } else {
                                    k.b bVar2 = (k.b) it6.next();
                                    RecyclerView.C c17 = bVar2.f430317a;
                                    kVar.f430306q.add(c17);
                                    b bVarW = kVar.w(c17);
                                    int i13 = bVar2.f430318b;
                                    int i14 = bVar2.f430319c;
                                    int i15 = bVar2.f430320d;
                                    int i16 = bVar2.f430321e;
                                    ((d) bVarW).getClass();
                                    View view2 = c17.itemView;
                                    int i17 = i15 - i13;
                                    int i18 = i16 - i14;
                                    if (i17 != 0 && (view = C22823h0.a(view2).f44903a.get()) != null) {
                                        view.animate().translationX(0.0f);
                                    }
                                    if (i18 != 0) {
                                        C22823h0.a(view2).g(0.0f);
                                    }
                                    A0 a0A2 = C22823h0.a(view2);
                                    a0A2.c(250L);
                                    g gVar = new g(i17, i18);
                                    a0A2.e(new q(new o(kVar, c17, new a(a0A2, gVar)), gVar));
                                    a0A2.f();
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList7 = arrayList5;
                            Iterator it7 = arrayList7.iterator();
                            while (true) {
                                boolean zHasNext2 = it7.hasNext();
                                k kVar2 = this;
                                if (!zHasNext2) {
                                    arrayList7.clear();
                                    kVar2.f430304o.remove(arrayList7);
                                    break;
                                } else {
                                    k.a aVar3 = (k.a) it7.next();
                                    RecyclerView.C c18 = aVar3.f430311a;
                                    View view3 = c18 != null ? c18.itemView : null;
                                    RecyclerView.C c19 = aVar3.f430312b;
                                    View view4 = c19 != null ? c19.itemView : null;
                                    ArrayList<RecyclerView.C> arrayList8 = kVar2.f430308s;
                                    if (view3 != null) {
                                        arrayList8.add(c18);
                                        a aVarB = kVar2.w(c18).b(c18, aVar3.f430313c, aVar3.f430314d, aVar3.f430315e, aVar3.f430316f);
                                        c18.itemView.animate();
                                        q qVar = new q(new m(kVar2, c18, aVarB), aVarB.f430291b);
                                        A0 a02 = aVarB.f430290a;
                                        a02.e(qVar);
                                        a02.f();
                                    }
                                    if (view4 != null) {
                                        arrayList8.add(c19);
                                        a aVarC = kVar2.w(c19).c(c19);
                                        q qVar2 = new q(new n(kVar2, c19, aVarC), aVarC.f430291b);
                                        A0 a03 = aVarC.f430290a;
                                        a03.e(qVar2);
                                        a03.f();
                                    }
                                }
                            }
                        default:
                            ArrayList arrayList9 = arrayList5;
                            Iterator it8 = arrayList9.iterator();
                            while (true) {
                                boolean zHasNext3 = it8.hasNext();
                                k kVar3 = this;
                                if (!zHasNext3) {
                                    arrayList9.clear();
                                    kVar3.f430302m.remove(arrayList9);
                                    break;
                                } else {
                                    RecyclerView.C c22 = (RecyclerView.C) it8.next();
                                    kVar3.f430305p.add(c22);
                                    a aVarD = kVar3.w(c22).d(c22);
                                    q qVar3 = new q(new l(kVar3, c22, aVarD), aVarD.f430291b);
                                    A0 a04 = aVarD.f430290a;
                                    a04.e(qVar3);
                                    a04.f();
                                }
                            }
                    }
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                arrayList5.get(0).f430317a.itemView.postOnAnimationDelayed(runnable, jA4);
            }
        }
        if (!zIsEmpty3) {
            final ArrayList<a> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f430304o.add(arrayList6);
            arrayList3.clear();
            final int i13 = 1;
            Runnable runnable2 = new Runnable() { // from class: ru.avito.component.animator.j
                @Override // java.lang.Runnable
                public final void run() {
                    View view;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList62 = arrayList6;
                            Iterator it6 = arrayList62.iterator();
                            while (true) {
                                boolean zHasNext = it6.hasNext();
                                k kVar = this;
                                if (!zHasNext) {
                                    arrayList62.clear();
                                    kVar.f430303n.remove(arrayList62);
                                    break;
                                } else {
                                    k.b bVar2 = (k.b) it6.next();
                                    RecyclerView.C c17 = bVar2.f430317a;
                                    kVar.f430306q.add(c17);
                                    b bVarW = kVar.w(c17);
                                    int i132 = bVar2.f430318b;
                                    int i14 = bVar2.f430319c;
                                    int i15 = bVar2.f430320d;
                                    int i16 = bVar2.f430321e;
                                    ((d) bVarW).getClass();
                                    View view2 = c17.itemView;
                                    int i17 = i15 - i132;
                                    int i18 = i16 - i14;
                                    if (i17 != 0 && (view = C22823h0.a(view2).f44903a.get()) != null) {
                                        view.animate().translationX(0.0f);
                                    }
                                    if (i18 != 0) {
                                        C22823h0.a(view2).g(0.0f);
                                    }
                                    A0 a0A2 = C22823h0.a(view2);
                                    a0A2.c(250L);
                                    g gVar = new g(i17, i18);
                                    a0A2.e(new q(new o(kVar, c17, new a(a0A2, gVar)), gVar));
                                    a0A2.f();
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList7 = arrayList6;
                            Iterator it7 = arrayList7.iterator();
                            while (true) {
                                boolean zHasNext2 = it7.hasNext();
                                k kVar2 = this;
                                if (!zHasNext2) {
                                    arrayList7.clear();
                                    kVar2.f430304o.remove(arrayList7);
                                    break;
                                } else {
                                    k.a aVar3 = (k.a) it7.next();
                                    RecyclerView.C c18 = aVar3.f430311a;
                                    View view3 = c18 != null ? c18.itemView : null;
                                    RecyclerView.C c19 = aVar3.f430312b;
                                    View view4 = c19 != null ? c19.itemView : null;
                                    ArrayList<RecyclerView.C> arrayList8 = kVar2.f430308s;
                                    if (view3 != null) {
                                        arrayList8.add(c18);
                                        a aVarB = kVar2.w(c18).b(c18, aVar3.f430313c, aVar3.f430314d, aVar3.f430315e, aVar3.f430316f);
                                        c18.itemView.animate();
                                        q qVar = new q(new m(kVar2, c18, aVarB), aVarB.f430291b);
                                        A0 a02 = aVarB.f430290a;
                                        a02.e(qVar);
                                        a02.f();
                                    }
                                    if (view4 != null) {
                                        arrayList8.add(c19);
                                        a aVarC = kVar2.w(c19).c(c19);
                                        q qVar2 = new q(new n(kVar2, c19, aVarC), aVarC.f430291b);
                                        A0 a03 = aVarC.f430290a;
                                        a03.e(qVar2);
                                        a03.f();
                                    }
                                }
                            }
                        default:
                            ArrayList arrayList9 = arrayList6;
                            Iterator it8 = arrayList9.iterator();
                            while (true) {
                                boolean zHasNext3 = it8.hasNext();
                                k kVar3 = this;
                                if (!zHasNext3) {
                                    arrayList9.clear();
                                    kVar3.f430302m.remove(arrayList9);
                                    break;
                                } else {
                                    RecyclerView.C c22 = (RecyclerView.C) it8.next();
                                    kVar3.f430305p.add(c22);
                                    a aVarD = kVar3.w(c22).d(c22);
                                    q qVar3 = new q(new l(kVar3, c22, aVarD), aVarD.f430291b);
                                    A0 a04 = aVarD.f430290a;
                                    a04.e(qVar3);
                                    a04.f();
                                }
                            }
                    }
                }
            };
            if (zIsEmpty) {
                runnable2.run();
            } else {
                arrayList6.get(0).f430311a.itemView.postOnAnimationDelayed(runnable2, jA4);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList<RecyclerView.C> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.f430302m.add(arrayList7);
        arrayList4.clear();
        final int i14 = 2;
        Runnable runnable3 = new Runnable() { // from class: ru.avito.component.animator.j
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                switch (i14) {
                    case 0:
                        ArrayList arrayList62 = arrayList7;
                        Iterator it6 = arrayList62.iterator();
                        while (true) {
                            boolean zHasNext = it6.hasNext();
                            k kVar = this;
                            if (!zHasNext) {
                                arrayList62.clear();
                                kVar.f430303n.remove(arrayList62);
                                break;
                            } else {
                                k.b bVar2 = (k.b) it6.next();
                                RecyclerView.C c17 = bVar2.f430317a;
                                kVar.f430306q.add(c17);
                                b bVarW = kVar.w(c17);
                                int i132 = bVar2.f430318b;
                                int i142 = bVar2.f430319c;
                                int i15 = bVar2.f430320d;
                                int i16 = bVar2.f430321e;
                                ((d) bVarW).getClass();
                                View view2 = c17.itemView;
                                int i17 = i15 - i132;
                                int i18 = i16 - i142;
                                if (i17 != 0 && (view = C22823h0.a(view2).f44903a.get()) != null) {
                                    view.animate().translationX(0.0f);
                                }
                                if (i18 != 0) {
                                    C22823h0.a(view2).g(0.0f);
                                }
                                A0 a0A2 = C22823h0.a(view2);
                                a0A2.c(250L);
                                g gVar = new g(i17, i18);
                                a0A2.e(new q(new o(kVar, c17, new a(a0A2, gVar)), gVar));
                                a0A2.f();
                            }
                        }
                        break;
                    case 1:
                        ArrayList arrayList72 = arrayList7;
                        Iterator it7 = arrayList72.iterator();
                        while (true) {
                            boolean zHasNext2 = it7.hasNext();
                            k kVar2 = this;
                            if (!zHasNext2) {
                                arrayList72.clear();
                                kVar2.f430304o.remove(arrayList72);
                                break;
                            } else {
                                k.a aVar3 = (k.a) it7.next();
                                RecyclerView.C c18 = aVar3.f430311a;
                                View view3 = c18 != null ? c18.itemView : null;
                                RecyclerView.C c19 = aVar3.f430312b;
                                View view4 = c19 != null ? c19.itemView : null;
                                ArrayList<RecyclerView.C> arrayList8 = kVar2.f430308s;
                                if (view3 != null) {
                                    arrayList8.add(c18);
                                    a aVarB = kVar2.w(c18).b(c18, aVar3.f430313c, aVar3.f430314d, aVar3.f430315e, aVar3.f430316f);
                                    c18.itemView.animate();
                                    q qVar = new q(new m(kVar2, c18, aVarB), aVarB.f430291b);
                                    A0 a02 = aVarB.f430290a;
                                    a02.e(qVar);
                                    a02.f();
                                }
                                if (view4 != null) {
                                    arrayList8.add(c19);
                                    a aVarC = kVar2.w(c19).c(c19);
                                    q qVar2 = new q(new n(kVar2, c19, aVarC), aVarC.f430291b);
                                    A0 a03 = aVarC.f430290a;
                                    a03.e(qVar2);
                                    a03.f();
                                }
                            }
                        }
                    default:
                        ArrayList arrayList9 = arrayList7;
                        Iterator it8 = arrayList9.iterator();
                        while (true) {
                            boolean zHasNext3 = it8.hasNext();
                            k kVar3 = this;
                            if (!zHasNext3) {
                                arrayList9.clear();
                                kVar3.f430302m.remove(arrayList9);
                                break;
                            } else {
                                RecyclerView.C c22 = (RecyclerView.C) it8.next();
                                kVar3.f430305p.add(c22);
                                a aVarD = kVar3.w(c22).d(c22);
                                q qVar3 = new q(new l(kVar3, c22, aVarD), aVarD.f430291b);
                                A0 a04 = aVarD.f430290a;
                                a04.e(qVar3);
                                a04.f();
                            }
                        }
                }
            }
        };
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnable3.run();
            return;
        }
        if (zIsEmpty) {
            jA4 = 0;
        }
        arrayList7.get(0).itemView.postOnAnimationDelayed(runnable3, Math.max(!zIsEmpty2 ? j14 : 0L, !zIsEmpty3 ? j15 : 0L) + jA4);
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean o(@Y61.k RecyclerView.C c12) {
        x(c12);
        ((d) w(c12)).getClass();
        c12.itemView.setAlpha(0.0f);
        this.f430299j.add(c12);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean p(@Y61.k RecyclerView.C c12, @Y61.l RecyclerView.C c13, int i12, int i13, int i14, int i15) {
        if (c12 == c13) {
            return q(c12, i12, i13, i14, i15);
        }
        w(c12).getClass();
        float translationX = c12.itemView.getTranslationX();
        float translationY = c12.itemView.getTranslationY();
        float alpha = c12.itemView.getAlpha();
        x(c12);
        int i16 = (int) ((i14 - i12) - translationX);
        int i17 = (int) ((i15 - i13) - translationY);
        c12.itemView.setTranslationX(translationX);
        c12.itemView.setTranslationY(translationY);
        c12.itemView.setAlpha(alpha);
        if (c13 != null) {
            x(c13);
            c13.itemView.setTranslationX(-i16);
            c13.itemView.setTranslationY(-i17);
            c13.itemView.setAlpha(0.0f);
        }
        ArrayList<a> arrayList = this.f430301l;
        a aVar = new a();
        aVar.f430311a = c12;
        aVar.f430312b = c13;
        aVar.f430313c = i12;
        aVar.f430314d = i13;
        aVar.f430315e = i14;
        aVar.f430316f = i15;
        arrayList.add(aVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean q(@Y61.k RecyclerView.C c12, int i12, int i13, int i14, int i15) {
        int translationX = i12 + ((int) c12.itemView.getTranslationX());
        int translationY = i13 + ((int) c12.itemView.getTranslationY());
        x(c12);
        ((d) w(c12)).getClass();
        View view = c12.itemView;
        int i16 = i14 - translationX;
        int i17 = i15 - translationY;
        if (i16 == 0 && i17 == 0) {
            h(c12);
            return false;
        }
        if (i16 != 0) {
            view.setTranslationX(-i16);
        }
        if (i17 != 0) {
            view.setTranslationY(-i17);
        }
        ArrayList<b> arrayList = this.f430300k;
        b bVar = new b();
        bVar.f430317a = c12;
        bVar.f430318b = translationX;
        bVar.f430319c = translationY;
        bVar.f430320d = i14;
        bVar.f430321e = i15;
        arrayList.add(bVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.O
    public final boolean r(@Y61.k RecyclerView.C c12) {
        x(c12);
        w(c12).getClass();
        this.f430298i.add(c12);
        return true;
    }

    public final void t() {
        if (l()) {
            return;
        }
        i();
    }

    public final void u(ArrayList arrayList, RecyclerView.C c12) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i12 = size - 1;
            a aVar = (a) arrayList.get(size);
            if (v(aVar, c12) && aVar.f430311a == null && aVar.f430312b == null) {
                arrayList.remove(aVar);
            }
            if (i12 < 0) {
                return;
            } else {
                size = i12;
            }
        }
    }

    public final boolean v(a aVar, RecyclerView.C c12) {
        if (aVar.f430312b == c12) {
            aVar.f430312b = null;
        } else {
            if (aVar.f430311a != c12) {
                return false;
            }
            aVar.f430311a = null;
        }
        c12.itemView.setAlpha(1.0f);
        c12.itemView.setTranslationX(0.0f);
        c12.itemView.setTranslationY(0.0f);
        h(c12);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final ru.avito.component.animator.b w(@Y61.k RecyclerView.C c12) {
        return c12 instanceof c ? ((c) c12).y00() : (d) this.f430310u.getValue();
    }

    public final void x(RecyclerView.C c12) {
        c12.itemView.animate().setInterpolator(this.f430309t);
        j(c12);
    }

    public k(boolean z12, int i12, C42822w c42822w) {
        this.f430297h = (i12 & 1) != 0 ? false : z12;
        this.f430298i = new ArrayList<>();
        this.f430299j = new ArrayList<>();
        this.f430300k = new ArrayList<>();
        this.f430301l = new ArrayList<>();
        this.f430302m = new ArrayList<>();
        this.f430303n = new ArrayList<>();
        this.f430304o = new ArrayList<>();
        this.f430305p = new ArrayList<>();
        this.f430306q = new ArrayList<>();
        this.f430307r = new ArrayList<>();
        this.f430308s = new ArrayList<>();
        this.f430309t = new ValueAnimator().getInterpolator();
        this.f430310u = C42727D.c(r.f430339l);
    }
}

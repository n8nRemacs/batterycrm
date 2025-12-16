package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.L;
import androidx.transition.P;
import androidx.transition.Q;
import androidx.transition.T;
import com.yandex.div.core.view2.C38029k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivTransitionHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/b;", "", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38029k f367914a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f367915b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f367916c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f367917d;

    /* compiled from: DivTransitionHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/animations/b$a;", "", "<init>", "()V", "a", "Lcom/yandex/div/core/view2/animations/b$a$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        /* compiled from: DivTransitionHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/b$a$a;", "Lcom/yandex/div/core/view2/animations/b$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.animations.b$a$a, reason: collision with other inner class name */
        public static final class C10867a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f367918a;

            public C10867a(int i12) {
                super(null);
                this.f367918a = i12;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivTransitionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/b$b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.animations.b$b, reason: collision with other inner class name */
    public static final class C10868b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final L f367919a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f367920b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f367921c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f367922d;

        public C10868b(@Y61.k L l12, @Y61.k View view, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2) {
            this.f367919a = l12;
            this.f367920b = view;
            this.f367921c = arrayList;
            this.f367922d = arrayList2;
        }
    }

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/yandex/div/core/view2/animations/h", "Landroidx/transition/P;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends P {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f367923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f367924b;

        public c(T t12, b bVar) {
            this.f367923a = t12;
            this.f367924b = bVar;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@Y61.k L l12) {
            this.f367924b.f367916c.clear();
            this.f367923a.A(this);
        }
    }

    public b(@Y61.k C38029k c38029k) {
        this.f367914a = c38029k;
    }

    public static ArrayList b(View view, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10868b c10868b = (C10868b) it.next();
            a.C10867a c10867a = kotlin.jvm.internal.L.f(c10868b.f367920b, view) ? (a.C10867a) C42745f0.S(c10868b.f367922d) : null;
            if (c10867a != null) {
                arrayList2.add(c10867a);
            }
        }
        return arrayList2;
    }

    public final void a(ViewGroup viewGroup, boolean z12) {
        if (z12) {
            Q.b(viewGroup);
        }
        T t12 = new T();
        ArrayList arrayList = this.f367915b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t12.N(((C10868b) it.next()).f367919a);
        }
        t12.a(new c(t12, this));
        Q.a(viewGroup, t12);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10868b c10868b = (C10868b) it2.next();
            for (a.C10867a c10867a : c10868b.f367921c) {
                c10868b.f367920b.setVisibility(c10867a.f367918a);
                c10868b.f367922d.add(c10867a);
            }
        }
        ArrayList arrayList2 = this.f367916c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
    }

    public final void c(@Y61.k L l12, @Y61.k View view, @Y61.k a.C10867a c10867a) {
        this.f367915b.add(new C10868b(l12, view, C42745f0.e0(c10867a), new ArrayList()));
        if (this.f367917d) {
            return;
        }
        this.f367917d = true;
        this.f367914a.post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 17));
    }
}

package com.avito.android.lib.deprecated_design.tab;

import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import java.util.Iterator;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TabPagerAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/TabPagerAdapter;", "Landroidx/fragment/app/F;", "Behaviour", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TabPagerAdapter extends F {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<? extends a> f178127j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Set<b<? extends a>> f178128k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Fragment f178129l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TabPagerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/TabPagerAdapter$Behaviour;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Behaviour {

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC42830m
        public static final Behaviour f178130c;

        /* renamed from: d, reason: collision with root package name */
        public static final Behaviour f178131d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Behaviour[] f178132e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f178133f;

        /* renamed from: b, reason: collision with root package name */
        public final int f178134b;

        static {
            Behaviour behaviour = new Behaviour("SET_USER_VISIBLE_HINT", 0, 0);
            f178130c = behaviour;
            Behaviour behaviour2 = new Behaviour("RESUME_ONLY_CURRENT_FRAGMENT", 1, 1);
            f178131d = behaviour2;
            Behaviour[] behaviourArr = {behaviour, behaviour2};
            f178132e = behaviourArr;
            f178133f = kotlin.enums.c.a(behaviourArr);
        }

        public Behaviour(String str, int i12, int i13) {
            this.f178134b = i13;
        }

        public static Behaviour valueOf(String str) {
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            return (Behaviour[]) f178132e.clone();
        }
    }

    public /* synthetic */ TabPagerAdapter(FragmentManager fragmentManager, com.avito.android.lib.deprecated_design.tab.adapter.j jVar, Set set, Behaviour behaviour, int i12, C42822w c42822w) {
        this(fragmentManager, jVar, set, (i12 & 8) != 0 ? Behaviour.f178130c : behaviour);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f178127j.getCount();
    }

    @Override // androidx.viewpager.widget.a
    @Y61.l
    public final CharSequence e(int i12) {
        return this.f178127j.getItem(i12).getF318257d();
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final void l(@Y61.k ViewPager viewPager, int i12, @Y61.k Object obj) {
        super.l(viewPager, i12, obj);
        Fragment fragment = obj instanceof Fragment ? (Fragment) obj : null;
        this.f178129l = fragment;
        if (fragment != null) {
            fragment.setMenuVisibility(true);
        }
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        Object next;
        a item = this.f178127j.getItem(i12);
        Iterator<T> it = this.f178128k.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b) next).b(item)) {
                break;
            }
        }
        b bVar = (b) next;
        if (bVar != null) {
            return bVar.a(item);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabPagerAdapter(@Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j<? extends a> jVar, @Y61.k Set<? extends b<? extends a>> set, @Y61.k Behaviour behaviour) {
        super(fragmentManager, behaviour.f178134b);
        this.f178127j = jVar;
        this.f178128k = set;
    }
}

package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.search.Tab;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f283209m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Tab.Onboarding f283210n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283211o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283212p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283213q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(C34999p c34999p, String str, Tab.Onboarding onboarding, Y41.a aVar, Y41.a aVar2, Y41.a aVar3) {
        super(0);
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f283208l = c34999p;
        this.f283209m = str;
        this.f283210n = onboarding;
        this.f283211o = aVar;
        this.f283212p = aVar2;
        this.f283213q = aVar3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.lib.design.tab_layout.c cVar;
        Object next;
        C34999p c34999p = this.f283208l;
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, c34999p.f283453H.getTabCount());
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.k it = lVarR.iterator();
        while (true) {
            boolean z12 = it.f406910d;
            cVar = c34999p.f283453H;
            if (!z12) {
                break;
            }
            c.i iVarJ = cVar.j(it.a());
            if (iVarJ != null) {
                arrayList.add(iVarJ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (String.valueOf(((c.i) next).f180893b).equals(this.f283209m)) {
                break;
            }
        }
        c.i iVar = (c.i) next;
        if (iVar != null) {
            View childAt = cVar.getChildAt(0);
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            View childAt2 = viewGroup != null ? viewGroup.getChildAt(iVar.f180895d) : null;
            if (childAt2 != null) {
                Tab.Onboarding onboarding = this.f283210n;
                Y41.a<G0> aVar = this.f283211o;
                Y41.a<G0> aVar2 = this.f283212p;
                Y41.a<G0> aVar3 = this.f283213q;
                C34999p c34999p2 = this.f283208l;
                c34999p2.j("tab_onboarding", OnboardingType.f209409b, new Z(childAt2, onboarding, aVar, aVar2, aVar3, c34999p2));
            }
        }
        return G0.f406611a;
    }
}

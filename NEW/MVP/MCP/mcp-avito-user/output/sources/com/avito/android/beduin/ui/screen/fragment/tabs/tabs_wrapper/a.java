package com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wi.C49625a;

/* compiled from: ChipsTabsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/a;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Chips f104373b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Object f104374c = C42784z0.f406748b;

    /* compiled from: ChipsTabsWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/a$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.a$a, reason: collision with other inner class name */
    public static final class C3120a implements h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e.b f104375b;

        public C3120a(@k e.b bVar) {
            this.f104375b = bVar;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            return (obj instanceof C3120a) && L.f(this.f104375b.f104389a, ((C3120a) obj).f104375b.f104389a);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f104375b.f104390b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return this.f104375b.f104392d;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    public a(@k Context context, @k FrameLayout.LayoutParams layoutParams, @k C49625a c49625a) {
        Chips chips = new Chips(context, null);
        chips.setId(R.id.beduin_chips);
        chips.setLayoutParams(layoutParams);
        String style = c49625a.getStyle();
        chips.setAppearanceFromAttr(style != null ? com.avito.android.lib.util.f.e(style) : R.attr.chipsLarge);
        chips.setSelectStrategy(SelectStrategy.f178716b);
        chips.setKeepSelected(true);
        chips.setDisplayType(Chips.DisplayType.f178701b);
        e.f104386a.getClass();
        int i12 = e.a.f104388b;
        chips.t(i12, i12);
        this.f104373b = chips;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void a(@k Y41.l<? super String, G0> lVar) {
        this.f104373b.setChipsSelectedListener(new b(lVar));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void b(@k ArrayList arrayList) {
        this.f104374c = arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3120a((e.b) it.next()));
        }
        this.f104373b.setData(arrayList2);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void c(@k String str) {
        Object next;
        Chips chips = this.f104373b;
        chips.j();
        Iterator it = ((Iterable) this.f104374c).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((e.b) next).f104389a, str)) {
                    break;
                }
            }
        }
        e.b bVar = (e.b) next;
        if (bVar == null) {
            return;
        }
        chips.q(new C3120a(bVar), false);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    @k
    public final View getView() {
        return this.f104373b;
    }

    /* compiled from: ChipsTabsWrapper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/a$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f104376a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super String, G0> lVar) {
            this.f104376a = lVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k h hVar) {
            this.f104376a.invoke(((C3120a) hVar).f104375b.f104389a);
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k h hVar) {
        }
    }
}

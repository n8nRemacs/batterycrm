package com.avito.android.shortcut_navigation_bar.adapter.category_node;

import Y61.k;
import com.avito.android.shortcut_navigation_bar.C34984a;
import com.avito.android.shortcut_navigation_bar.C34985b;
import com.avito.android.shortcut_navigation_bar.adapter.CollapsedShortcutItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GlobalCategoryNodePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/category_node/g;", "LTV0/f;", "Lcom/avito/android/shortcut_navigation_bar/adapter/category_node/c;", "Lcom/avito/android/shortcut_navigation_bar/adapter/CollapsedShortcutItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.f<c, CollapsedShortcutItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C34985b f283272b;

    /* compiled from: GlobalCategoryNodePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f283274m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12) {
            super(0);
            this.f283274m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f283272b.h(this.f283274m);
            return G0.f406611a;
        }
    }

    public g(@k C34985b c34985b) {
        this.f283272b = c34985b;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        c cVar = (c) eVar;
        CollapsedShortcutItem collapsedShortcutItem = (CollapsedShortcutItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C34984a) {
                obj = obj2;
            }
        }
        C34984a c34984a = (C34984a) (obj instanceof C34984a ? obj : null);
        if (c34984a == null) {
            O5(cVar, collapsedShortcutItem, i12);
        } else if (c34984a.f283207a) {
            cVar.jG();
        } else {
            O5(cVar, collapsedShortcutItem, i12);
        }
    }

    @Override // TV0.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void O5(@k c cVar, @k CollapsedShortcutItem collapsedShortcutItem, int i12) {
        if (collapsedShortcutItem.f283222p) {
            cVar.setText("");
        } else {
            String str = collapsedShortcutItem.f283233h;
            if (str == null) {
                str = collapsedShortcutItem.f283220n;
            }
            cVar.setText(str);
            cVar.j2();
        }
        cVar.a(new a(i12));
    }
}

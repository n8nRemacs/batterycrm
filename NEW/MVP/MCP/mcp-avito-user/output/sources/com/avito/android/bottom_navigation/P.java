package com.avito.android.bottom_navigation;

import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragmentImpl;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.google.common.collect.H1;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TabFragmentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/P;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class P implements TabFragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H1 f106983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H1 f106984b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H1 f106985c;

    @Inject
    public P(@Y61.k H1 h12, @Y61.k H1 h13, @Y61.k H1 h14) {
        this.f106983a = h12;
        this.f106984b = h13;
        this.f106985c = h14;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory
    public final TabBaseFragment a(TabFragmentFactory.Data data) {
        Object next;
        Iterator<E> it = this.f106985c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((InterfaceC28898u) next).a(), data.getClass())) {
                break;
            }
        }
        if (next != null) {
            return ((InterfaceC28898u) next).b(data);
        }
        throw new IllegalStateException(("No DataTabFragmentFactory for data " + data).toString());
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory
    @Y61.k
    public final TabContainerFragment b(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        Object next;
        TabContainerFragment tabContainerFragmentCreate;
        Iterator<E> it = this.f106983a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((InterfaceC28896s) next).getType(), navigationTabSetItem)) {
                break;
            }
        }
        InterfaceC28896s interfaceC28896s = (InterfaceC28896s) next;
        return (interfaceC28896s == null || (tabContainerFragmentCreate = interfaceC28896s.create()) == null) ? new TabContainerFragmentImpl() : tabContainerFragmentCreate;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory
    public final TabBaseFragment c(NavigationTabSetItem navigationTabSetItem) {
        Object next;
        Iterator<E> it = this.f106984b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((E) next).getType(), navigationTabSetItem)) {
                break;
            }
        }
        if (next != null) {
            return ((E) next).create();
        }
        throw new IllegalStateException(("No NavigationTabFragmentFactory for tab " + navigationTabSetItem).toString());
    }
}

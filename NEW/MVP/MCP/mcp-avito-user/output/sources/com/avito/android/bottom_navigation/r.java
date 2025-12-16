package com.avito.android.bottom_navigation;

import com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment;
import kotlin.Metadata;

/* compiled from: ContainerTabFragmentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/r;", "Lcom/avito/android/bottom_navigation/s;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements InterfaceC28896s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f107060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavigationTab f107061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.H f107062d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(NavigationTab navigationTab, Y41.l lVar) {
        this.f107061c = navigationTab;
        this.f107062d = (kotlin.jvm.internal.H) lVar;
        this.f107060b = navigationTab;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // com.avito.android.bottom_navigation.InterfaceC28896s
    @Y61.k
    public final TabContainerFragment create() {
        return (TabContainerFragment) this.f107062d.invoke(this.f107061c);
    }

    @Override // com.avito.android.bottom_navigation.InterfaceC28896s
    @Y61.k
    public final NavigationTabSetItem getType() {
        return this.f107060b;
    }
}

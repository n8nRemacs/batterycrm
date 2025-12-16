package com.avito.android.di.module;

import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.TabContainerWithStubFragmentImpl;
import kotlin.Metadata;

/* compiled from: SerpTabFragmentFactoryModule.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class S8 extends kotlin.jvm.internal.H implements Y41.l<NavigationTabSetItem, TabContainerWithStubFragmentImpl> {
    @Override // Y41.l
    public final TabContainerWithStubFragmentImpl invoke(NavigationTabSetItem navigationTabSetItem) {
        ((TabContainerWithStubFragmentImpl.a) this.receiver).getClass();
        return TabContainerWithStubFragmentImpl.a.a(navigationTabSetItem);
    }
}

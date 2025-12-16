package com.avito.android.di.module;

import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;
import rg.C47652a;

/* compiled from: AvitoForBusinessTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "it", "Lcom/avito/android/bottom_navigation/NavigationTab;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class M1 extends kotlin.jvm.internal.N implements Y41.l<NavigationTab, TabBaseFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C47652a f144054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(C47652a c47652a) {
        super(1);
        this.f144054l = c47652a;
    }

    @Override // Y41.l
    public final TabBaseFragment invoke(NavigationTab navigationTab) {
        return BxContentFragment.C28907a.b(BxContentFragment.f108886v5, this.f144054l.b());
    }
}

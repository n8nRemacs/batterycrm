package com.avito.android.di.module;

import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: SerpTabFragmentFactoryModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/bxcontent/BxContentFragment;", "it", "Lcom/avito/android/bottom_navigation/NavigationTabSetItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.a9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29987a9 extends kotlin.jvm.internal.N implements Y41.l<NavigationTabSetItem, BxContentFragment> {

    /* renamed from: l, reason: collision with root package name */
    public static final C29987a9 f144231l = new C29987a9();

    public C29987a9() {
        super(1);
    }

    @Override // Y41.l
    public final BxContentFragment invoke(NavigationTabSetItem navigationTabSetItem) {
        return BxContentFragment.C28907a.b(BxContentFragment.f108886v5, new BxContentArguments(null, SearchParams.INSTANCE.getEMPTY(), null, null, null, PresentationType.MAIN, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388573, null));
    }
}

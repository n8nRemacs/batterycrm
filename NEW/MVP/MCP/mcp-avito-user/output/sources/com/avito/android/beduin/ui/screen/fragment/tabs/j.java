package com.avito.android.beduin.ui.screen.fragment.tabs;

import com.avito.android.beduin.network.model.BeduinTitleAlignment;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: TabsScreenFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TabsScreenFragment f104344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsScreenModel f104345m;

    /* compiled from: TabsScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104346a;

        static {
            int[] iArr = new int[BeduinTitleAlignment.values().length];
            try {
                iArr[BeduinTitleAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTitleAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinTitleAlignment.PLATFORM_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104346a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabsScreenFragment tabsScreenFragment, TabsScreenModel tabsScreenModel) {
        super(0);
        this.f104344l = tabsScreenFragment;
        this.f104345m = tabsScreenModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TabsScreenFragment.a aVar = TabsScreenFragment.f104306N0;
        TabsScreenFragment tabsScreenFragment = this.f104344l;
        MaterialToolbar materialToolbarY5 = tabsScreenFragment.y5();
        TabsScreenModel tabsScreenModel = this.f104345m;
        materialToolbarY5.setTitle(tabsScreenModel.getTitle());
        MaterialToolbar materialToolbarY52 = tabsScreenFragment.y5();
        int i12 = a.f104346a[tabsScreenModel.l().ordinal()];
        boolean z12 = false;
        if (i12 != 1) {
            if (i12 == 2) {
                z12 = true;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        materialToolbarY52.setTitleCentered(z12);
        return G0.f406611a;
    }
}

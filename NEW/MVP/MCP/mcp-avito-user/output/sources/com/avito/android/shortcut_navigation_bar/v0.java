package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class v0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding f283583l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        super(1);
        this.f283583l = onboarding;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding = this.f283583l;
        oVar2.i(onboarding.getTitle());
        oVar2.b(onboarding.getSubtitle());
        return G0.f406611a;
    }
}

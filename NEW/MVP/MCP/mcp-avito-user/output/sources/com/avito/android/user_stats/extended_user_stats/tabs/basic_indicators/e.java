package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i;
import com.avito.android.util.C35755b0;
import com.avito.user_stats.model.extended_user_stats.UserMessage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BasicIndicatorsTabFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/i$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<i.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f317410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BasicIndicatorsTabFragment f317411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, BasicIndicatorsTabFragment basicIndicatorsTabFragment) {
        super(1);
        this.f317410l = gVar;
        this.f317411m = basicIndicatorsTabFragment;
    }

    @Override // Y41.l
    public final G0 invoke(i.b bVar) {
        i.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof i.b.C9850b;
        g gVar = this.f317410l;
        com.avito.android.progress_overlay.l lVar = gVar.f317415d;
        if (z12) {
            i.b.C9850b c9850b = (i.b.C9850b) bVar2;
            BasicIndicatorsTabFragment basicIndicatorsTabFragment = this.f317411m;
            com.avito.android.util.text.a aVar = basicIndicatorsTabFragment.f317348t0;
            if (aVar == null) {
                aVar = null;
            }
            lVar.j();
            UserMessage userMessage = c9850b.f317429c;
            boolean z13 = userMessage != null;
            ConstraintLayout constraintLayout = gVar.f317414c;
            if (z13) {
                h.a(userMessage, constraintLayout, aVar, null, gVar.f317417f);
            } else {
                gVar.f317412a.c(new UV0.c(c9850b.f317427a));
            }
            gVar.f317413b.setVisibility(!z13 ? 0 : 8);
            constraintLayout.setVisibility(z13 ? 0 : 8);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("requestKeyTabsData", C35755b0.a(c9850b.f317428b));
            basicIndicatorsTabFragment.getParentFragmentManager().o0(bundle, "requestKeyTabs");
        } else if (bVar2 instanceof i.b.c) {
            lVar.k(null);
        } else if (bVar2 instanceof i.b.a) {
            lVar.a(((i.b.a) bVar2).f317426a);
        }
        return G0.f406611a;
    }
}

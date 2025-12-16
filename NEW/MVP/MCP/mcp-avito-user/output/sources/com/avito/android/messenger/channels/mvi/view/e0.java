package com.avito.android.messenger.channels.mvi.view;

import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.messenger.channels.mvi.presenter.a;
import com.avito.android.messenger.channels.mvi.view.g0;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChannelsContentDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/channels/mvi/presenter/a$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f188743b;

    public e0(g0 g0Var) {
        this.f188743b = g0Var;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.C] */
    @Override // l41.g
    public final void accept(Object obj) {
        ViewPager2 viewPager2;
        a.b bVar = (a.b) obj;
        g0 g0Var = this.f188743b;
        ViewPager2 viewPager22 = g0Var.f188749d;
        if ((viewPager22 != null ? viewPager22.getAdapter() : null) == null && ((Boolean) g0Var.f188754i.getValue()).booleanValue() && (viewPager2 = g0Var.f188749d) != null) {
            com.avito.android.messenger.folders.e.f196349a.getClass();
            viewPager2.setAdapter(new f0((List) com.avito.android.messenger.folders.e.f196353e.getValue(), g0Var.f188748c));
        }
        TabLayout tabLayout = g0Var.f188750e;
        g0.a aVar = g0Var.f188753h;
        if (tabLayout != null) {
            tabLayout.f357363L.remove(aVar);
        }
        i0 i0Var = g0Var.f188751f;
        if (i0Var != null) {
            e.a.a(i0Var, bVar);
        }
        ViewPager2 viewPager23 = g0Var.f188749d;
        if (viewPager23 != null) {
            viewPager23.setCurrentItem(bVar.f188292b);
        }
        TabLayout tabLayout2 = g0Var.f188750e;
        if (tabLayout2 != null) {
            tabLayout2.a(aVar);
        }
    }
}

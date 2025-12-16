package com.avito.android.settings;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.settings.ui.SettingsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/q;", "", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f280962a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SettingsFragment f280963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f280964c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.toast.b f280965d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f280966e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f280967f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f280968g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f280969h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.replace_main.toast.a f280970i;

    /* compiled from: SettingsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/q$a;", "", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public q(@Y61.k View view, @Y61.k SettingsFragment settingsFragment, @Y61.k i iVar, @Y61.k SettingsFragment settingsFragment2, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.android.replace_main.toast.b bVar, @Y61.k com.avito.konveyor.a aVar2) {
        this.f280962a = iVar;
        this.f280963b = settingsFragment2;
        this.f280964c = aVar;
        this.f280965d = bVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        this.f280966e = jVar;
        View viewFindViewById = view.findViewById(R.id.settings_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f280967f = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.spinner_overlay_initial);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f280968g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.spinner_overlay_updating);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f280969h = viewFindViewById3;
        M81.c cVar = new M81.c(view, recyclerView, false, 4, null);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        cVar.f10415d.setTitle(R.string.settings);
        cVar.f5(new n(this));
        com.avito.android.arch.mvi.android.f.a(iVar, settingsFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new o(1, this, q.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/settings/mvi/entity/SettingsOneTimeEvent;)V", 0), new p(1, this, q.class, "render", "render(Lcom/avito/android/settings/mvi/entity/SettingsState;)V", 0));
        settingsFragment.getViewLifecycleOwner().getLifecycle().a(new t(this));
    }
}

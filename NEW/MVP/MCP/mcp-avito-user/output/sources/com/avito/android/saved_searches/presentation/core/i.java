package com.avito.android.saved_searches.presentation.core;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.main.SavedSearchMainFragment;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsFragment;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchRouter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/i;", "Lcom/avito/android/saved_searches/presentation/core/h;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f258409a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DialogFragment f258410b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f258411c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SavedSearchParams f258412d;

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k DialogFragment dialogFragment, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k SavedSearchParams savedSearchParams) {
        this.f258409a = aVar;
        this.f258410b = dialogFragment;
        this.f258411c = interfaceC35845m2;
        this.f258412d = savedSearchParams;
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void a() {
        Intent intentR = this.f258411c.r();
        intentR.setFlags(268468224);
        this.f258410b.startActivity(intentR);
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void b() {
        DialogFragment dialogFragment = this.f258410b;
        if (dialogFragment.getChildFragmentManager().L() > 0) {
            dialogFragment.getChildFragmentManager().Y();
        } else {
            c();
            dialogFragment.dismiss();
        }
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void c() {
        String str = this.f258412d.f181445d.f181432d;
        if (L.f(str, "map") || L.f(str, "serp")) {
            b.a.a(this.f258409a, new UxFeedbackStartCampaignLink("savedSearchNewFlowAndroidBx", false, P0.c(), null), null, null, 6);
        }
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void d() {
        Intent intentA = this.f258411c.a();
        intentA.setFlags(268468224);
        this.f258410b.startActivity(intentA);
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void e(@Y61.k SavedSearchData.Settings.SettingsDetails settingsDetails) {
        h(settingsDetails, SavedSearchSettingsMode.f258740b);
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void f() {
        H hE2 = this.f258410b.getChildFragmentManager().e();
        hE2.o(R.anim.saved_search_enter_from_right, R.anim.saved_search_exit_to_left, R.anim.saved_search_enter_from_left, R.anim.saved_search_exit_to_right);
        SavedSearchMainFragment.f258577w0.getClass();
        hE2.n(R.id.fragment_container, new SavedSearchMainFragment(), null);
        hE2.e();
    }

    @Override // com.avito.android.saved_searches.presentation.core.h
    public final void g(@Y61.k SavedSearchData.Settings.SettingsDetails settingsDetails) {
        h(settingsDetails, SavedSearchSettingsMode.f258741c);
    }

    public final void h(SavedSearchData.Settings.SettingsDetails settingsDetails, SavedSearchSettingsMode savedSearchSettingsMode) {
        H hE2 = this.f258410b.getChildFragmentManager().e();
        hE2.o(R.anim.saved_search_enter_from_right, R.anim.saved_search_exit_to_left, R.anim.saved_search_enter_from_left, R.anim.saved_search_exit_to_right);
        SavedSearchSettingsFragment.f258724t0.getClass();
        hE2.n(R.id.fragment_container, SavedSearchSettingsFragment.a.a(settingsDetails, savedSearchSettingsMode), "tag.SavedSearchSettingsFragment");
        hE2.c(null);
        hE2.e();
    }
}

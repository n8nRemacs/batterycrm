package com.avito.android.bxcontent.di;

import Bx.InterfaceC13199b;
import Ex0.InterfaceC13542b;
import Hg.InterfaceC13986b;
import Ig.InterfaceC14102a;
import Lg.InterfaceC14390a;
import Y61.k;
import Y61.l;
import Zr0.n;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.S0;
import com.avito.android.advertising.di.v;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.C29265y;
import com.avito.android.bxcontent.call.DialogsAfterCallState;
import com.avito.android.bxcontent.di.module.InterfaceC29054b;
import com.avito.android.bxcontent.di.module.InterfaceC29062j;
import com.avito.android.bxcontent.di.module.U;
import com.avito.android.bxcontent.di.module.V;
import com.avito.android.di.B;
import com.avito.android.di.module.D5;
import com.avito.android.di.module.E5;
import com.avito.android.di.module.I9;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.di.module.InterfaceC30232x2;
import com.avito.android.di.module.J9;
import com.avito.android.di.module.K9;
import com.avito.android.di.module.Q;
import com.avito.android.di.module.X2;
import com.avito.android.di.module.ja;
import com.avito.android.inline_filters.di.s;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.location.LocationInteractorState;
import com.avito.android.map.MapArguments;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.serp.adapter.vertical_main.publish.VerticalPublishState;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterState;
import com.avito.android.serp.warning.WarningStateProviderState;
import com.avito.android.util.C35838l3;
import com.avito.android.util.Kundle;
import h31.d;
import hs0.u;
import iT.C41343c;
import kotlin.Metadata;
import kr0.InterfaceC43491a;
import oW.InterfaceC44697a;
import ob.C44742f;
import rs0.InterfaceC47717b;

/* compiled from: BxContentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/di/a;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: BxContentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/di/a$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3272a {
        @h31.b
        @k
        InterfaceC3272a A(@l @InterfaceC13986b Kundle kundle);

        @k
        InterfaceC3272a B(@k WQ.a aVar);

        @h31.b
        @k
        InterfaceC3272a C(@InterfaceC29054b @l Bundle bundle);

        @h31.b
        @k
        InterfaceC3272a D(@Q @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a E(@k BxContentFragment.Y0 y02);

        @h31.b
        @k
        InterfaceC3272a F(@Ar0.b @l Bundle bundle);

        @h31.b
        @k
        InterfaceC3272a G(@k BxContentFragment bxContentFragment);

        @h31.b
        @k
        InterfaceC3272a H(@l LocationInteractorState locationInteractorState);

        @h31.b
        @k
        InterfaceC3272a I(@l String str);

        @h31.b
        @k
        InterfaceC3272a J(@k BxContentFragment bxContentFragment);

        @k
        InterfaceC3272a K(@k kj.c cVar);

        @h31.b
        @k
        InterfaceC3272a L(@com.avito.android.floating_views.e @l Bundle bundle);

        @h31.b
        @k
        InterfaceC3272a M(@k BxContentArguments bxContentArguments);

        @h31.b
        @k
        InterfaceC3272a N(@l ProgressInfoToastBarPresenter.State state);

        @h31.b
        @k
        InterfaceC3272a O(@k @D5 com.jakewharton.rxrelay3.c cVar);

        @h31.b
        @k
        InterfaceC3272a P();

        @k
        InterfaceC3272a Q(@k InterfaceC14390a interfaceC14390a);

        @h31.b
        @k
        InterfaceC3272a R(@InterfaceC43491a @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a S(@l @ds0.b Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a T(@k C29265y c29265y);

        @k
        InterfaceC3272a U(@k InterfaceC14102a interfaceC14102a);

        @h31.b
        @k
        InterfaceC3272a V(@l @s Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a W(@K9 @k com.jakewharton.rxrelay3.c cVar);

        @k
        InterfaceC3272a X(@k C31138n0 c31138n0);

        @h31.b
        @k
        InterfaceC3272a Y(@l @InterfaceC30232x2 Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a Z(@V @l Bundle bundle);

        @h31.b
        @k
        InterfaceC3272a a0(@InterfaceC47717b @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a b(@k Resources resources);

        @h31.b
        @k
        InterfaceC3272a b0(@l WarningStateProviderState warningStateProviderState);

        @k
        a build();

        @h31.b
        @k
        InterfaceC3272a c0(@l @ja.b Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a d(@k ActivityC22955m activityC22955m);

        @h31.b
        @k
        InterfaceC3272a d0(@I9 @k com.jakewharton.rxrelay3.c cVar);

        @h31.b
        @k
        InterfaceC3272a e(@k r rVar);

        @h31.b
        @k
        InterfaceC3272a e0(@k Screen screen);

        @k
        InterfaceC3272a f(@k InterfaceC44697a interfaceC44697a);

        @h31.b
        @k
        InterfaceC3272a f0(@k BxContentFragment bxContentFragment);

        @h31.b
        @k
        InterfaceC3272a g(@k S0 s02);

        @h31.b
        @k
        InterfaceC3272a g0(@l DialogsAfterCallState dialogsAfterCallState);

        @h31.b
        @k
        InterfaceC3272a h(@k ScreenPerformanceTracker screenPerformanceTracker);

        @h31.b
        @k
        InterfaceC3272a h0(@U @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a i(@com.avito.android.deal_confirmation.di.b @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a i0(@k MapArguments mapArguments);

        @h31.b
        @k
        InterfaceC3272a j(@k C44742f c44742f);

        @h31.b
        @k
        InterfaceC3272a j0(@InterfaceC13542b @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a k(@InterfaceC29062j @l Bundle bundle);

        @h31.b
        @k
        InterfaceC3272a k0(@k SerpSpaceType serpSpaceType);

        @k
        InterfaceC3272a l(@k InterfaceC30106l7 interfaceC30106l7);

        @h31.b
        @k
        InterfaceC3272a l0(@u @l VerticalFilterState verticalFilterState);

        @h31.b
        @k
        InterfaceC3272a m(@l @X2 Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a m0(@l @n VerticalPublishState verticalPublishState);

        @h31.b
        @k
        InterfaceC3272a n0(@J9 @k com.jakewharton.rxrelay3.c cVar);

        @h31.b
        @k
        InterfaceC3272a o(@l SearchParams searchParams);

        @h31.b
        @k
        InterfaceC3272a p(@v @l Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a q(@k RecyclerView.t tVar);

        @h31.b
        @k
        InterfaceC3272a r(@k PresentationType presentationType);

        @h31.b
        @k
        InterfaceC3272a s(@l @InterfaceC30073i7 Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a t(@l View view);

        @h31.b
        @k
        InterfaceC3272a u(@k C41343c c41343c);

        @k
        InterfaceC3272a v(@k cv.d dVar);

        @h31.b
        @k
        InterfaceC3272a w(@E5 @k com.jakewharton.rxrelay3.c cVar);

        @h31.b
        @k
        InterfaceC3272a x(@l @InterfaceC13199b Kundle kundle);

        @h31.b
        @k
        InterfaceC3272a y(@k C35838l3 c35838l3);

        @k
        InterfaceC3272a z(@k b bVar);
    }

    void a(@k BxContentFragment bxContentFragment);
}

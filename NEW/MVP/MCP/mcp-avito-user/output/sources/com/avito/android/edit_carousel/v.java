package com.avito.android.edit_carousel;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/v;", "Lcom/avito/android/edit_carousel/n;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f146544a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f146545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f146546c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final EditCarouselFragment f146547d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f146548e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f146549f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f146550g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f146551h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f146552i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f146553j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f146554k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f146555l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ImageView f146556m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f146557n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f146558o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f146559p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Group f146560q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final View f146561r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<String> f146562s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public EditCarouselState.d f146563t;

    public v(@Y61.k View view, @Y61.k EditCarouselFragment editCarouselFragment, @Y61.k i iVar, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k EditCarouselFragment editCarouselFragment2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f146544a = view;
        this.f146545b = iVar;
        this.f146546c = dVar;
        this.f146547d = editCarouselFragment2;
        this.f146548e = screenPerformanceTracker;
        this.f146549f = view.getContext();
        View viewFindViewById = view.findViewById(R.id.edit_carousel_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.edit_carousel_toolbar_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146550g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.edit_carousel_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f146551h = (Input) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.edit_carousel_sort_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.edit_carousel_recycler_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f146552i = recyclerView;
        View viewFindViewById6 = view.findViewById(R.id.edit_carousel_bottom_panel);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f146553j = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.edit_carousel_bottom_hint);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146554k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.edit_carousel_bottom_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById8;
        this.f146555l = button2;
        View viewFindViewById9 = view.findViewById(R.id.edit_carousel_status_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f146556m = (ImageView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.edit_carousel_status_title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146557n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.edit_carousel_status_hint);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146558o = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.edit_carousel_reload_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button3 = (Button) viewFindViewById12;
        this.f146559p = button3;
        View viewFindViewById13 = view.findViewById(R.id.edit_carousel_search_settings_group);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f146560q = (Group) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.edit_carousel_progress_bar);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f146561r = viewFindViewById14;
        InterfaceC43160i interfaceC43160iN = C43175k.n(C43175k.d(new s(this, null)), 600L);
        Lifecycle lifecycle = editCarouselFragment.getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.f46682e;
        InterfaceC43160i<String> interfaceC43160iA = C23069w.a(interfaceC43160iN, lifecycle, state);
        this.f146562s = interfaceC43160iA;
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_carousel.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f146533c;

            {
                this.f146533c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f146533c.f146545b.accept(InterfaceC48738a.f.f439681a);
                        break;
                    case 1:
                        this.f146533c.f146545b.accept(InterfaceC48738a.k.f439686a);
                        break;
                    case 2:
                        this.f146533c.f146545b.accept(InterfaceC48738a.g.f439682a);
                        break;
                    default:
                        this.f146533c.f146545b.accept(InterfaceC48738a.e.f439680a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_carousel.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f146533c;

            {
                this.f146533c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f146533c.f146545b.accept(InterfaceC48738a.f.f439681a);
                        break;
                    case 1:
                        this.f146533c.f146545b.accept(InterfaceC48738a.k.f439686a);
                        break;
                    case 2:
                        this.f146533c.f146545b.accept(InterfaceC48738a.g.f439682a);
                        break;
                    default:
                        this.f146533c.f146545b.accept(InterfaceC48738a.e.f439680a);
                        break;
                }
            }
        });
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_carousel.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f146533c;

            {
                this.f146533c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f146533c.f146545b.accept(InterfaceC48738a.f.f439681a);
                        break;
                    case 1:
                        this.f146533c.f146545b.accept(InterfaceC48738a.k.f439686a);
                        break;
                    case 2:
                        this.f146533c.f146545b.accept(InterfaceC48738a.g.f439682a);
                        break;
                    default:
                        this.f146533c.f146545b.accept(InterfaceC48738a.e.f439680a);
                        break;
                }
            }
        });
        final int i15 = 3;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_carousel.o

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f146533c;

            {
                this.f146533c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f146533c.f146545b.accept(InterfaceC48738a.f.f439681a);
                        break;
                    case 1:
                        this.f146533c.f146545b.accept(InterfaceC48738a.k.f439686a);
                        break;
                    case 2:
                        this.f146533c.f146545b.accept(InterfaceC48738a.g.f439682a);
                        break;
                    default:
                        this.f146533c.f146545b.accept(InterfaceC48738a.e.f439680a);
                        break;
                }
            }
        });
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
        recyclerView.l(new PV.a(y6.b(0), y6.b(28), 0, 0, 12, null), -1);
        new C23427s(new h(iVar)).c(recyclerView);
        C43175k.K(new C43197r1(new p(this, null), interfaceC43160iA), C22984Q.a(editCarouselFragment.getViewLifecycleOwner()));
        com.avito.android.arch.mvi.android.f.a(iVar, editCarouselFragment.getViewLifecycleOwner(), state, new q(1, this, v.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselOneTimeEvent;)V", 0), new r(1, this, v.class, "render", "render(Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState;)V", 0));
    }
}

package com.avito.android.photo_picker.legacy;

import KV.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.photo_list_view.ImageLabelsView;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.A;
import com.avito.android.ui.view.PagerLayoutManager;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/E;", "Lcom/avito/android/photo_picker/legacy/A;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f219578a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A.a f219579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f219580c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageButton f219581d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageLabelsView f219582e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f219583f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f219584g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f219585h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f219586i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f219587j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageButton f219588k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f219589l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final PagerLayoutManager f219590m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public B f219591n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C33242d f219592o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f219593p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.tooltip.k f219594q;

    /* compiled from: PhotoPickerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            E.this.a();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(ViewGroup viewGroup, A.a aVar, InterfaceC28373a interfaceC28373a, com.avito.android.photo_list_view.E e12, com.avito.konveyor.adapter.j jVar, com.avito.konveyor.adapter.j jVar2, LinearLayoutManager linearLayoutManager, int i12, C42822w c42822w) {
        LinearLayoutManager linearLayoutManager2;
        if ((i12 & 64) != 0) {
            viewGroup.getContext();
            linearLayoutManager2 = new LinearLayoutManager(0, false);
        } else {
            linearLayoutManager2 = linearLayoutManager;
        }
        this.f219578a = viewGroup;
        this.f219579b = aVar;
        this.f219580c = linearLayoutManager2;
        View viewFindViewById = viewGroup.findViewById(R.id.cancel_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById;
        this.f219581d = imageButton;
        View viewFindViewById2 = viewGroup.findViewById(R.id.labels);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.photo_list_view.ImageLabelsView");
        }
        this.f219582e = (ImageLabelsView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.tooltip_anchor);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219583f = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.photo_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f219584g = recyclerView;
        View viewFindViewById5 = viewGroup.findViewById(R.id.controls_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219585h = viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.remove_btn);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219586i = viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.edit_btn);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219587j = viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.enhance_btn);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f219588k = (ImageButton) viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.camera_list);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById9;
        this.f219589l = recyclerView2;
        View viewFindViewById10 = viewGroup.findViewById(R.id.container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById10;
        PagerLayoutManager pagerLayoutManager = new PagerLayoutManager(viewGroup.getContext(), 0, 2, null);
        this.f219590m = pagerLayoutManager;
        this.f219592o = new C33242d(viewGroup);
        this.f219593p = new com.avito.android.progress_overlay.l(frameLayout, R.id.camera_list, interfaceC28373a, 0, 0, 24, null);
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(viewGroup.getContext(), 0, 0, 6, null);
        this.f219594q = kVar;
        boolean z12 = true;
        z12 = true;
        z12 = true;
        if (kotlin.jvm.internal.L.f(aVar.getMode(), new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, z12 ? 1 : 0, 0 == true ? 1 : 0))) {
            imageButton.setImageResource(R.drawable.ic_back_24);
        }
        imageButton.setOnClickListener(new C(this, 1));
        if (C33261x.b(aVar.getMode())) {
            viewFindViewById7.setOnClickListener(new C(this, 2));
            viewFindViewById6.setOnClickListener(new C(this, 3));
            recyclerView2.setLayoutManager(pagerLayoutManager);
            recyclerView2.setAdapter(jVar);
            pagerLayoutManager.f304681H = new D(this);
            recyclerView.setLayoutManager(linearLayoutManager2);
            recyclerView.l(new com.avito.android.photo_picker.legacy.thumbnail_list.b(viewGroup.getContext().getResources()), -1);
            jVar2.setHasStableIds(true);
            recyclerView.setAdapter(jVar2);
            PhotoPickerIntentFactory.PhotoPickerMode mode = aVar.getMode();
            if (!(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) && !(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
                if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) {
                    z12 = ((PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) mode).f218810c;
                } else if (mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView) {
                    z12 = false;
                } else if (!(mode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (z12) {
                e12.a(recyclerView, aVar);
            }
        }
        a.C0572a c0572a = KV.a.f9464v;
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, viewGroup.getContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        c0572a.getClass();
        kVar.c(KV.a.a(a.C0572a.b(R.style.Re23_Tooltip_Inverse, contextThemeWrapperB), D6.i(320, viewGroup.getContext()), 0, 0, 2097150));
    }

    public final void a() {
        this.f219594q.b(new TooltipState(null, false, null, null, null, null, null, null, null, null, false, null, null, TooltipState.State.f181286c, 8191, null));
    }

    public final void b(int i12) {
        RecyclerView.Adapter adapter = this.f219589l.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i12);
        }
    }

    public final void c(@Y61.k List<InterfaceC33208b.a> list) {
        ImageLabelsView imageLabelsView = this.f219582e;
        imageLabelsView.setLabels(list);
        imageLabelsView.setOnClickListener(new C(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@Y61.k InterfaceC33208b.a.C6539a c6539a) {
        a();
        r.a aVar = new r.a(null, 1, 0 == true ? 1 : 0);
        aVar.m(0);
        aVar.j(0);
        r.a aVar2 = new r.a(aVar);
        aVar2.m(0);
        aVar2.j(0);
        TooltipState.State state = TooltipState.State.f181285b;
        a aVar3 = new a();
        View view = this.f219583f;
        this.f219594q.b(new TooltipState(aVar2, false, null, c6539a.f218115a, c6539a.f218116b, null, null, null, null, null, true, aVar3, view, state, 996, null));
    }

    public final void e(@Y61.k String str) {
        com.avito.android.component.toast.b.b(this.f219578a, str, 0, null, 0, null, 0, null, null, null, 131070);
    }
}

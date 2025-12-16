package com.avito.android.profile_settings_extended.adapter.universal.section;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetCarouselPreviewView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetTwoBlocksView;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetSectionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/universal/section/j;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j, InterfaceC15026b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f229945k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f229946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f229947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetPreviewFrameLayout f229948d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f229949e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f229950f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f229951g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f229952h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f229953i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public ViewGroup f229954j;

    public k(@Y61.k View view) {
        super(view);
        new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_universal_widget_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229946b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_universal_widget_section_preview_frame_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f229947c = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_universal_widget_section_preview_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.profile_settings_extended.adapter.universal.section.UniversalWidgetPreviewFrameLayout");
        }
        this.f229948d = (UniversalWidgetPreviewFrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_universal_widget_section_empty_edit);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229949e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_profile_universal_widget_section_status_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229950f = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_universal_widget_section_item_root);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229951g = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.extended_profile_universal_widget_section_move_up_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229952h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.extended_profile_universal_widget_section_move_down_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229953i = (ImageView) viewFindViewById8;
    }

    public final void B80() {
        ViewGroup viewGroup = this.f229954j;
        if (viewGroup instanceof UniversalWidgetCarouselPreviewView) {
            UniversalWidgetCarouselPreviewView universalWidgetCarouselPreviewView = (UniversalWidgetCarouselPreviewView) viewGroup;
            universalWidgetCarouselPreviewView.f153521b.i();
            universalWidgetCarouselPreviewView.f153522c.i();
            universalWidgetCarouselPreviewView.f153523d.i();
            return;
        }
        if (viewGroup instanceof UniversalWidgetFourBlocksView) {
            UniversalWidgetFourBlocksView universalWidgetFourBlocksView = (UniversalWidgetFourBlocksView) viewGroup;
            universalWidgetFourBlocksView.f153528b.i();
            universalWidgetFourBlocksView.f153529c.i();
            universalWidgetFourBlocksView.f153530d.i();
            universalWidgetFourBlocksView.f153531e.i();
            return;
        }
        if (viewGroup instanceof UniversalWidgetBlockView) {
            ((UniversalWidgetBlockView) viewGroup).i();
        } else if (viewGroup instanceof UniversalWidgetTwoBlocksView) {
            UniversalWidgetTwoBlocksView universalWidgetTwoBlocksView = (UniversalWidgetTwoBlocksView) viewGroup;
            universalWidgetTwoBlocksView.f153635b.i();
            universalWidgetTwoBlocksView.f153636c.i();
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void DT(@Y61.k UniversalWidgetCarouselPreviewView.UniversalWidgetCarouselPreviewState universalWidgetCarouselPreviewState) {
        D6.w(this.f229949e);
        B80();
        UniversalWidgetPreviewFrameLayout universalWidgetPreviewFrameLayout = this.f229948d;
        universalWidgetPreviewFrameLayout.removeAllViews();
        D6.H(this.f229947c);
        UniversalWidgetCarouselPreviewView universalWidgetCarouselPreviewView = new UniversalWidgetCarouselPreviewView(universalWidgetPreviewFrameLayout.getContext(), null, 0, 6, null);
        universalWidgetCarouselPreviewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        universalWidgetPreviewFrameLayout.setUnlimitedWidth(true);
        universalWidgetPreviewFrameLayout.addView(universalWidgetCarouselPreviewView);
        UniversalWidgetBlockView universalWidgetBlockView = universalWidgetCarouselPreviewView.f153521b;
        universalWidgetBlockView.g(universalWidgetCarouselPreviewState.f153524b);
        UniversalWidgetBlockView universalWidgetBlockView2 = universalWidgetCarouselPreviewView.f153522c;
        universalWidgetBlockView2.g(universalWidgetCarouselPreviewState.f153525c);
        UniversalWidgetBlockView universalWidgetBlockView3 = universalWidgetCarouselPreviewView.f153523d;
        universalWidgetBlockView3.g(universalWidgetCarouselPreviewState.f153526d);
        int iB2 = (C35835l0.g(universalWidgetCarouselPreviewView.getRootView().getContext()).x - (y6.b(30) * 2)) - y6.b(10);
        ViewGroup.LayoutParams layoutParams = universalWidgetBlockView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iB2;
        universalWidgetBlockView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = universalWidgetBlockView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = iB2;
        universalWidgetBlockView2.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = universalWidgetBlockView3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = iB2;
        universalWidgetBlockView3.setLayoutParams(layoutParams3);
        this.f229954j = universalWidgetCarouselPreviewView;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void MH(@Y61.k UniversalWidgetSectionItem universalWidgetSectionItem, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4) {
        I5.a(this.f229946b, universalWidgetSectionItem.f229917e, false);
        this.f229951g.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(23, aVar));
        com.avito.android.profile_phones.phones_list.phone_item.g gVar = new com.avito.android.profile_phones.phones_list.phone_item.g(24, aVar2);
        ImageView imageView = this.f229950f;
        imageView.setOnClickListener(gVar);
        boolean z12 = universalWidgetSectionItem.f229924l;
        ImageView imageView2 = this.f229952h;
        if (z12) {
            imageView2.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(25, aVar3));
            imageView2.setColorFilter(C35835l0.d(R.attr.black, imageView2.getContext()));
        } else {
            imageView2.setOnClickListener(null);
            imageView2.setColorFilter(C35835l0.d(R.attr.gray36, imageView2.getContext()));
        }
        boolean z13 = universalWidgetSectionItem.f229925m;
        ImageView imageView3 = this.f229953i;
        if (z13) {
            imageView3.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(26, aVar4));
            imageView3.setColorFilter(C35835l0.d(R.attr.black, imageView3.getContext()));
        } else {
            imageView3.setOnClickListener(null);
            imageView3.setColorFilter(C35835l0.d(R.attr.gray36, imageView3.getContext()));
        }
        UniversalWidget.UniversalWidgetSectionVisibilityStatus universalWidgetSectionVisibilityStatus = universalWidgetSectionItem.f229921i;
        if (universalWidgetSectionVisibilityStatus.getRequiredFilling()) {
            D6.H(imageView);
            imageView.setImageResource(R.drawable.ic_visibility_requires_filling);
            return;
        }
        ModerationStatus moderationStatus = universalWidgetSectionItem.f229920h;
        if (moderationStatus instanceof ModerationStatus.ModerationFailed) {
            D6.H(imageView);
            imageView.setImageResource(R.drawable.ic_universal_widget_moderation_fail);
        } else if (moderationStatus instanceof ModerationStatus.ModerationPending) {
            D6.H(imageView);
            imageView.setImageResource(R.drawable.ic_universal_widget_on_moderation);
        } else if (universalWidgetSectionVisibilityStatus.isVisibleInBx()) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
            imageView.setImageResource(R.drawable.ic_universal_widget_invisible);
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void Nx(@Y61.k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState) {
        D6.w(this.f229949e);
        B80();
        UniversalWidgetPreviewFrameLayout universalWidgetPreviewFrameLayout = this.f229948d;
        universalWidgetPreviewFrameLayout.removeAllViews();
        D6.H(this.f229947c);
        UniversalWidgetBlockView universalWidgetBlockView = new UniversalWidgetBlockView(universalWidgetPreviewFrameLayout.getContext(), null, 0, 6, null);
        universalWidgetBlockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        universalWidgetPreviewFrameLayout.setUnlimitedWidth(false);
        universalWidgetPreviewFrameLayout.addView(universalWidgetBlockView);
        universalWidgetBlockView.g(universalWidgetBlockState);
        this.f229954j = universalWidgetBlockView;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void XA(@Y61.l String str) {
        I5.a(this.f229949e, str, false);
        D6.w(this.f229947c);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void gM(@Y61.k UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState) {
        D6.w(this.f229949e);
        B80();
        UniversalWidgetPreviewFrameLayout universalWidgetPreviewFrameLayout = this.f229948d;
        universalWidgetPreviewFrameLayout.removeAllViews();
        D6.H(this.f229947c);
        UniversalWidgetFourBlocksView universalWidgetFourBlocksView = new UniversalWidgetFourBlocksView(universalWidgetPreviewFrameLayout.getContext(), null, 0, 6, null);
        universalWidgetFourBlocksView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        universalWidgetPreviewFrameLayout.setUnlimitedWidth(false);
        universalWidgetPreviewFrameLayout.addView(universalWidgetFourBlocksView);
        universalWidgetFourBlocksView.a(universalWidgetFourBlocksState);
        this.f229954j = universalWidgetFourBlocksView;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        B80();
        this.f229950f.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.section.j
    public final void wz(@Y61.k UniversalWidgetTwoBlocksView.UniversalWidgetTwoBlocksState universalWidgetTwoBlocksState) {
        D6.w(this.f229949e);
        B80();
        UniversalWidgetPreviewFrameLayout universalWidgetPreviewFrameLayout = this.f229948d;
        universalWidgetPreviewFrameLayout.removeAllViews();
        D6.H(this.f229947c);
        UniversalWidgetTwoBlocksView universalWidgetTwoBlocksView = new UniversalWidgetTwoBlocksView(universalWidgetPreviewFrameLayout.getContext(), null, 0, 6, null);
        universalWidgetTwoBlocksView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        universalWidgetPreviewFrameLayout.setUnlimitedWidth(false);
        universalWidgetPreviewFrameLayout.addView(universalWidgetTwoBlocksView);
        universalWidgetTwoBlocksView.f153635b.g(universalWidgetTwoBlocksState.f153637b);
        universalWidgetTwoBlocksView.f153636c.g(universalWidgetTwoBlocksState.f153638c);
        D6.c(universalWidgetTwoBlocksView.f153636c, null, Integer.valueOf(universalWidgetTwoBlocksState.f153639d), null, null, 13);
        this.f229954j = universalWidgetTwoBlocksView;
    }
}

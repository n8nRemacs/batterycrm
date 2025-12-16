package com.avito.android.blueprints.selector_card.multiselect;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import gj.InterfaceC40691b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectSelectorCardGroupContentBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/c;", "Lcom/avito/android/lib/design/selector_card/f;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40691b f106634a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f106635b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f106636c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f106637d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public NoTouchEventRecyclerView f106638e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f106639f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public SimpleDraweeView f106640g;

    public c(@k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b, @l Integer num) {
        this.f106634a = interfaceC40691b;
        this.f106635b = interfaceC25659b;
        this.f106636c = num;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@k View view) {
        View viewFindViewById = view.findViewById(R.id.content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f106637d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.beduin_form_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.NoTouchEventRecyclerView");
        }
        this.f106638e = (NoTouchEventRecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.selector_card_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f106640g = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.selector_card_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106639f = (TextView) viewFindViewById4;
        NoTouchEventRecyclerView noTouchEventRecyclerView = this.f106638e;
        if (noTouchEventRecyclerView != null) {
            noTouchEventRecyclerView.getContext();
            noTouchEventRecyclerView.setLayoutManager(new MultiselectSelectorCardGroupContentBinder$initBeduinFormView$1());
        }
        Integer num = this.f106636c;
        if (num != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = y6.b(num.intValue());
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@k r rVar) {
        if (!(rVar instanceof ParameterElement.E.b)) {
            throw new IllegalStateException("Check failed.");
        }
        ParameterElement.E.b bVar = (ParameterElement.E.b) rVar;
        List<BeduinModel> list = bVar.f117288g;
        if (list != null) {
            NoTouchEventRecyclerView noTouchEventRecyclerView = this.f106638e;
            if (noTouchEventRecyclerView == null) {
                return;
            }
            View view = this.f106637d;
            if (view != null) {
                view.setVisibility(8);
            }
            noTouchEventRecyclerView.setVisibility(0);
            if (noTouchEventRecyclerView.getAdapter() == null) {
                noTouchEventRecyclerView.setAdapter(this.f106635b.a(0));
            }
            ((com.avito.android.beduin_shared.common.component.adapter.b) noTouchEventRecyclerView.getAdapter()).k(com.avito.android.beduin_shared.model.utils.b.a(this.f106634a, bVar.f117283b, list));
            return;
        }
        View view2 = this.f106637d;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        NoTouchEventRecyclerView noTouchEventRecyclerView2 = this.f106638e;
        if (noTouchEventRecyclerView2 != null) {
            noTouchEventRecyclerView2.setVisibility(8);
        }
        TextView textView = this.f106639f;
        if (textView != null) {
            I5.a(textView, bVar.f117286e, false);
        }
        SimpleDraweeView simpleDraweeView = this.f106640g;
        if (simpleDraweeView != null) {
            UniversalImage universalImage = bVar.f117287f;
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null), null, null, null, 14);
        }
    }
}

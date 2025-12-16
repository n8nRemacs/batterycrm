package com.avito.android.category.element;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWidgetElementItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/element/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/category/element/l;", "a", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f116618h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f116619b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f116620c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f116621d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f116622e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f116623f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f116624g;

    /* compiled from: CategoryWidgetElementItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/category/element/n$a;", "", "<init>", "()V", "", "MAX_LINES_DEFAULT", "I", "MAX_LINES_EXPANDED", "", "TAG", "Ljava/lang/String;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public n(@Y61.k View view) {
        super(view);
        this.f116619b = view;
        View viewFindViewById = view.findViewById(R.id.category_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f116620c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.actioned_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f116621d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.category_actions_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f116622e = (FlexboxLayout) viewFindViewById3;
        this.f116623f = LayoutInflater.from(view.getContext());
        this.f116624g = com.avito.android.lib.util.darkTheme.c.b(view.getContext());
    }

    public final void B80(ViewGroup viewGroup, CategoryItemAction categoryItemAction, Y41.p<? super DeepLink, ? super String, G0> pVar) {
        View viewFindViewById;
        if (categoryItemAction.getTitle() == null || categoryItemAction.getDeepLink() == null) {
            return;
        }
        View viewInflate = this.f116623f.inflate(R.layout.bx_content_widget_category_item_element_action_button_layout, viewGroup, false);
        String title = categoryItemAction.getTitle();
        if (title != null) {
            Button button = (Button) viewInflate.findViewById(R.id.category_action_button);
            if (button == null) {
                V2.f318762a.d("CategoryElementView", "Category action button not inflated");
                return;
            }
            button.setText(title);
            DeepLink deepLink = categoryItemAction.getDeepLink();
            if (deepLink != null) {
                button.setOnClickListener(new com.avito.android.advert_core.advert.f(pVar, deepLink, this, title));
            }
        }
        ActionDisplayParams displayParams = categoryItemAction.getDisplayParams();
        if (displayParams != null && (viewFindViewById = viewInflate.findViewById(R.id.category_action_button_dot)) != null) {
            D6.G(viewFindViewById, displayParams.getShowPoint());
        }
        viewGroup.addView(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // com.avito.android.category.element.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hA(@Y61.k com.avito.android.category.element.CategoryWidgetElementItem r11, int r12, @Y61.k Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super java.lang.String, kotlin.G0> r13, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r14) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category.element.n.hA(com.avito.android.category.element.CategoryWidgetElementItem, int, Y41.p, Y41.l):void");
    }
}

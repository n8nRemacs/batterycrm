package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35987z1;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lV.C43688d;
import lV.InterfaceC43686b;

/* compiled from: NodeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/k;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f171441g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckmark f171442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f171443c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Drawable f171444d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Drawable f171445e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f171446f;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.node_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckmark");
        }
        ListItemCheckmark listItemCheckmark = (ListItemCheckmark) viewFindViewById;
        this.f171442b = listItemCheckmark;
        View viewFindViewById2 = view.findViewById(R.id.arrow);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f171443c = (ImageView) viewFindViewById2;
        this.f171444d = C35835l0.h(R.attr.ic_arrowExpandMore20, this.itemView.getContext());
        this.f171445e = C35835l0.h(R.attr.ic_arrowExpandLess20, this.itemView.getContext());
        listItemCheckmark.setToggleByClickEnabled(false);
    }

    public final C43688d B80() {
        C43688d.a aVar = C43688d.f413784i;
        ListItemCheckmark listItemCheckmark = this.f171442b;
        Context context = listItemCheckmark.getContext();
        int iJ2 = C35835l0.j(R.attr.listItemCheckmarkDefaultMedium, listItemCheckmark.getContext());
        aVar.getClass();
        return C43688d.a.b(iJ2, context);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void CQ() {
        this.f171442b.setStyle((InterfaceC43686b) C43688d.a(B80(), null, null, null, 95));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void Lv(boolean z12, boolean z13, boolean z14) {
        ImageView imageView = this.f171443c;
        if (!z12 || z14) {
            D6.w(imageView);
            return;
        }
        D6.H(imageView);
        imageView.setImageDrawable(z13 ? this.f171444d : this.f171445e);
        imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, imageView.getContext())));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f171442b.setOnClickListener(new C(3, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void f(@Y61.k String str) {
        this.f171442b.setSubtitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f171446f;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void mW(@Y61.k UniversalImage universalImage, @Y61.l String str) {
        ListItemCheckmark listItemCheckmark = this.f171442b;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(listItemCheckmark.getContext()));
        if (imageDependsOnThemeOrDefault == null) {
            listItemCheckmark.setStyle((InterfaceC43686b) C43688d.a(B80(), null, null, null, 95));
            return;
        }
        Size size = new Size(44, 44);
        io.reactivex.rxjava3.internal.observers.m mVar = this.f171446f;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        Uri uriD = C35829k2.b(imageDependsOnThemeOrDefault, y6.b(size.getWidth()), y6.b(size.getHeight()), 0.0f, 2, 44).d();
        if (uriD == null) {
            return;
        }
        C35987z1.f319133a.getClass();
        C42006d c42006d = new C42006d(new com.avito.android.gig_shift_action.ui.a(10, uriD, size));
        l lVar = new l(str, this, size);
        final V2 v22 = V2.f318762a;
        this.f171446f = (io.reactivex.rxjava3.internal.observers.m) c42006d.x(lVar, new l41.g() { // from class: com.avito.android.inline_filters.dialog.category_nodes.adapter.m
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        });
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void setChecked(boolean z12) {
        this.f171442b.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void setTitle(@Y61.k String str) {
        this.f171442b.setTitle(str);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void yZ(int i12) {
        D6.f(this.f171442b, (y6.b(20) * i12) + y6.b(24), 0, 0, 0, 14);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.adapter.k
    public final void nP(@Y61.l String str) {
    }
}

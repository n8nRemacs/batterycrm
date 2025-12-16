package com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.deprecated_design.tab.TabWithImage;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;

/* compiled from: FiltersTabsAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/a;", "Lcom/avito/android/lib/deprecated_design/tab/TabWithImage;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a<T extends TabWithImage> extends com.avito.android.lib.deprecated_design.tab.adapter.g<T, i> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<View, i> f269879e;

    /* compiled from: FiltersTabsAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8048a extends H implements l<View, i> {

        /* renamed from: b, reason: collision with root package name */
        public static final C8048a f269880b = new C8048a();

        public C8048a() {
            super(1, i.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final i invoke(View view) {
            return new i(view);
        }
    }

    public a() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(j jVar, Context context, int i12, l lVar, int i13, C42822w c42822w) {
        i12 = (i13 & 4) != 0 ? R.layout.filters_tabs_tab_with_image : i12;
        lVar = (i13 & 8) != 0 ? C8048a.f269880b : lVar;
        super(jVar, context, i12);
        this.f269879e = lVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(com.avito.android.lib.deprecated_design.tab.adapter.i iVar, Object obj) {
        Map<Size, Uri> variants;
        Set<Size> setKeySet;
        Size size;
        i iVar2 = (i) iVar;
        TabWithImage tabWithImage = (TabWithImage) obj;
        Image image = tabWithImage.f178137d;
        SimpleDraweeView simpleDraweeView = iVar2.f269897c;
        if (image != null && (variants = image.getVariants()) != null && (setKeySet = variants.keySet()) != null && (size = (Size) C42745f0.F(setKeySet)) != null) {
            simpleDraweeView.getLayoutParams().width = (size.getWidth() * simpleDraweeView.getLayoutParams().height) / size.getHeight();
            simpleDraweeView.requestLayout();
            simpleDraweeView.invalidate();
        }
        if (image == null) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
            C35949t5.c(iVar2.f269897c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        }
        iVar2.a(tabWithImage.f178135b, tabWithImage.f178136c);
        TextView textView = iVar2.f269896b;
        textView.setTextColor(C35835l0.d(tabWithImage.f178138e ? R.attr.black : R.attr.gray44, textView.getContext()));
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final com.avito.android.lib.deprecated_design.tab.adapter.i b(View view) {
        return this.f269879e.invoke(view);
    }
}

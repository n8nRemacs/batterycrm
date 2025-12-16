package com.avito.android.lib.design.gallery;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import cV.C27109a;
import com.avito.android.R;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Gallery.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/avito/android/lib/design/gallery/a;", "Landroid/widget/LinearLayout;", "LLV/b;", "LcV/a;", "newState", "Lkotlin/G0;", "setState", "(LcV/a;)V", "Lcom/avito/android/lib/design/gallery/h;", "b", "Lcom/avito/android/lib/design/gallery/h;", "getGalleryRecyclerView", "()Lcom/avito/android/lib/design/gallery/h;", "galleryRecyclerView", "Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23;", "c", "Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23;", "getPageIndicator", "()Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23;", "pageIndicator", "", "value", "isPageIndicatorVisible", "()Z", "setPageIndicatorVisible", "(Z)V", "Lcom/avito/android/lib/design/gallery/b;", "<set-?>", "getGalleryAdapter", "()Lcom/avito/android/lib/design/gallery/b;", "setGalleryAdapter", "(Lcom/avito/android/lib/design/gallery/b;)V", "getGalleryAdapter$delegate", "(Lcom/avito/android/lib/design/gallery/a;)Ljava/lang/Object;", "galleryAdapter", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends LinearLayout implements LV.b<C27109a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final h galleryRecyclerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public final PageIndicatorRe23 pageIndicator;

    /* compiled from: Gallery.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.design.gallery.a$a, reason: collision with other inner class name */
    public static final class C5274a extends N implements l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, G0> f179206m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5274a(l<? super Boolean, G0> lVar) {
            super(1);
            this.f179206m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            a.this.setPageIndicatorVisible(bool2.booleanValue());
            l<Boolean, G0> lVar = this.f179206m;
            if (lVar != null) {
                lVar.invoke(bool2);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        attributeSet = (i12 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet);
        h hVar = new h(context, attributeSet);
        this.galleryRecyclerView = hVar;
        PageIndicatorRe23 pageIndicatorRe23 = new PageIndicatorRe23(context, null, R.attr.pageIndicatorTransparent, 0, 10, null);
        this.pageIndicator = pageIndicatorRe23;
        if (getId() == hVar.getId() && getId() != -1) {
            hVar.setId(View.generateViewId());
        }
        setOrientation(1);
        setGravity(17);
        addView(hVar);
        addView(pageIndicatorRe23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageIndicatorVisible(boolean z12) {
        this.pageIndicator.setVisibility(!z12 ? 4 : 0);
    }

    @Y61.l
    public final b getGalleryAdapter() {
        return this.galleryRecyclerView.getGalleryAdapter();
    }

    @k
    public final h getGalleryRecyclerView() {
        return this.galleryRecyclerView;
    }

    @k
    public final PageIndicatorRe23 getPageIndicator() {
        return this.pageIndicator;
    }

    public final void setGalleryAdapter(@Y61.l b bVar) {
        this.galleryRecyclerView.setGalleryAdapter(bVar);
    }

    @Override // LV.b
    public void setState(@k C27109a newState) {
        RunnableC28882d runnableC28882d = new RunnableC28882d(17, this, newState.f57910c);
        C5274a c5274a = new C5274a(newState.f57912e);
        this.galleryRecyclerView.setState(new C27109a(newState.f57908a, newState.f57909b, runnableC28882d, newState.f57911d, c5274a));
    }
}

package com.avito.android.gallery.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.c;
import com.avito.android.gallery.ui.adapter.d;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import gF.e;
import iF.InterfaceC41277a;
import iF.InterfaceC41278b;
import iF.InterfaceC41279c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryView.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/gallery/ui/GalleryView;", "Landroid/widget/FrameLayout;", "LiF/c;", "Landroid/view/View;", "getIndicator", "()Landroid/view/View;", "", "position", "Lkotlin/G0;", "setCurrentItem", "(I)V", "", "value", "isSaveImageScrollState", "()Z", "setSaveImageScrollState", "(Z)V", "getCurrentPosition", "()I", "currentPosition", "a", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryView extends FrameLayout implements InterfaceC41279c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewPager f159225b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PageIndicator f159226c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PageIndicatorRe23 f159227d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f159228e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC41278b f159229f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC41277a f159230g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Toast f159231h;

    /* compiled from: GalleryView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gallery/ui/GalleryView$a;", "", "<init>", "()V", "", "NO_CURRENT_PAGE", "I", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/gallery/ui/GalleryView$b", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ViewPager.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41278b f159232b;

        public b(InterfaceC41278b interfaceC41278b) {
            this.f159232b = interfaceC41278b;
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            this.f159232b.c();
        }
    }

    static {
        new a(null);
    }

    @j
    public GalleryView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getIndicator() {
        return this.f159228e ? this.f159227d : this.f159226c;
    }

    public final void a(@k FragmentManager fragmentManager, @l List<Image> list, @l InterfaceC41278b interfaceC41278b, @l InterfaceC41277a interfaceC41277a, int i12, int i13) {
        this.f159229f = interfaceC41278b;
        this.f159230g = interfaceC41277a;
        List<Image> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            i();
            D6.w(this);
            return;
        }
        ViewPager viewPager = this.f159225b;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar == null) {
            viewPager.setAdapter(new d(fragmentManager, list, this, i13));
        } else {
            boolean zF2 = L.f(dVar.f159265j, list);
            dVar.f159265j = list;
            if (!zF2) {
                dVar.h();
            }
        }
        viewPager.setOnClickListener(new c(15, interfaceC41277a, this));
        viewPager.c(new b(interfaceC41278b));
        com.avito.android.lib.design.page_indicator_re23.b.b(this.f159227d, viewPager);
        this.f159226c.e(viewPager);
        if (list.size() > 1) {
            if (i12 > -1) {
                setCurrentItem(i12);
            }
            D6.H(getIndicator());
        } else {
            D6.w(getIndicator());
        }
        D6.H(this);
    }

    public final int getCurrentPosition() {
        return this.f159225b.getCurrentItem();
    }

    @Override // iF.InterfaceC41279c
    public final void i() {
        Toast toast = this.f159231h;
        if (toast != null) {
            toast.cancel();
        }
        if (this.f159231h == null) {
            this.f159231h = Toast.makeText(getContext(), R.string.gallery_photo_load_error, 0);
        }
        Toast toast2 = this.f159231h;
        if (toast2 != null) {
            toast2.show();
        }
    }

    public final void setCurrentItem(int position) {
        this.f159225b.x(position, false);
    }

    public final void setSaveImageScrollState(boolean z12) {
        this.f159225b.setSaveFromParentEnabled(z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GalleryView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.galleryView : i12;
        super(context, attributeSet, i12);
        LayoutInflater.from(context).inflate(R.layout.gallery_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.photo_indicator);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator.PageIndicator");
        }
        PageIndicator pageIndicator = (PageIndicator) viewFindViewById;
        this.f159226c = pageIndicator;
        View viewFindViewById2 = findViewById(R.id.photo_indicator_re23);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23");
        }
        PageIndicatorRe23 pageIndicatorRe23 = (PageIndicatorRe23) viewFindViewById2;
        this.f159227d = pageIndicatorRe23;
        View viewFindViewById3 = findViewById(R.id.photo_pager);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById3;
        this.f159225b = viewPager;
        viewPager.setOffscreenPageLimit(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f.f396412a, i12, 0);
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, false);
            this.f159228e = z12;
            if (z12) {
                D6.w(pageIndicator);
                D6.H(pageIndicatorRe23);
            } else {
                D6.H(pageIndicator);
                D6.w(pageIndicatorRe23);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            D6.c(getIndicator(), null, null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0)), 7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            D6.c(getIndicator(), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0)), null, null, null, 14);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            D6.c(getIndicator(), null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0)), null, 11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            pageIndicator.setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(5, C35835l0.d(R.attr.white, context)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            pageIndicator.setUnselectedDotColor(typedArrayObtainStyledAttributes.getColor(6, C35835l0.d(R.attr.whiteAlpha40, context)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getInt(0, 2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

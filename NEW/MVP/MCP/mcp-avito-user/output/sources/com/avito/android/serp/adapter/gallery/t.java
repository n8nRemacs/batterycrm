package com.avito.android.serp.adapter.gallery;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.serp.adapter.gallery.j;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import or0.C44853c;

/* compiled from: GalleryHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/t;", "Lcom/avito/android/serp/adapter/gallery/p;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends com.avito.konveyor.adapter.b implements p {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f270060n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f270061b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f270062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f270063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f270064e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f270065f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewPager2 f270066g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f270067h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public GalleryHeaderItem f270068i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public m f270069j;

    /* renamed from: k, reason: collision with root package name */
    public int f270070k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public ValueAnimator f270071l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final j f270072m;

    /* compiled from: GalleryHeaderView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/t$a;", "", "<init>", "()V", "", "KEY_FAKE_DRAG_SHOWN", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public t(@Y61.k View view, @Y61.k com.avito.android.onboarding_manager.f fVar) throws Resources.NotFoundException {
        super(view);
        this.f270061b = fVar;
        Context context = view.getContext();
        this.f270062c = context;
        View viewFindViewById = view.findViewById(R.id.top_corners_background);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f270063d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rounded_background);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f270064e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270065f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.pager);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById4;
        this.f270066g = viewPager2;
        View viewFindViewById5 = view.findViewById(R.id.details_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f270067h = (FrameLayout) viewFindViewById5;
        this.f270072m = new j(new v(1, this, t.class, "onPageSelected", "onPageSelected(I)V", 0));
        viewPager2.setOffscreenPageLimit(4);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gallery_header_image_size);
        viewPager2.setPageTransformer(new ViewPager2.l() { // from class: com.avito.android.serp.adapter.gallery.r
            @Override // androidx.viewpager2.widget.ViewPager2.l
            public final void a(View view2, float f12) {
                int i12 = t.f270060n;
                view2.setTranslationX((view2.getWidth() - (dimensionPixelSize * 0.95f)) * (-1) * f12);
                float fA2 = (kotlin.ranges.s.a(1.0f - Math.abs(f12), 0.0f) * 0.2f) + 0.8f;
                view2.setScaleX(fA2);
                view2.setScaleY(fA2);
                View view3 = (View) k.f270041b.getValue(view2, k.f270040a[0]);
                if (view3 == null) {
                    return;
                }
                view3.setAlpha(kotlin.ranges.s.c(Math.abs(f12), 1.0f) * 0.4f);
            }
        });
        viewPager2.e(new s(this));
        com.avito.android.lib.util.v.a(viewFindViewById2, y6.b(20));
    }

    public static final void B80(t tVar, int i12) {
        List<GalleryHeaderWidget.GalleryItem> list;
        ValueAnimator valueAnimator = tVar.f270071l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        j.a aVar = j.f270034e;
        GalleryHeaderItem galleryHeaderItem = tVar.f270068i;
        Integer numValueOf = (galleryHeaderItem == null || (list = galleryHeaderItem.f270007d) == null) ? null : Integer.valueOf(list.size());
        aVar.getClass();
        int iIntValue = i12 % (numValueOf != null ? numValueOf.intValue() : 1);
        GalleryHeaderItem galleryHeaderItem2 = tVar.f270068i;
        if (galleryHeaderItem2 == null || iIntValue != galleryHeaderItem2.f270009f) {
            if (galleryHeaderItem2 != null) {
                galleryHeaderItem2.f270009f = iIntValue;
            }
            if (i12 != tVar.f270070k) {
                tVar.f270066g.g(i12, true);
            }
            tVar.C80(true);
            m mVar = tVar.f270069j;
            if (mVar != null) {
                int i13 = tVar.f270070k;
                GalleryHeaderItem galleryHeaderItem3 = mVar.f270045d;
                int size = galleryHeaderItem3.f270007d.size();
                aVar.getClass();
                int i14 = i13 % size;
                int size2 = i12 % galleryHeaderItem3.f270007d.size();
                n nVar = mVar.f270042a;
                p pVar = mVar.f270043b;
                nVar.f270048d.c(new C44853c(pVar.Xn(), pVar.TE(i14), pVar.TE(size2), nVar.f270049e, i12 > i13));
            }
            tVar.f270070k = i12;
        }
    }

    public final void C80(boolean z12) {
        GalleryHeaderItem galleryHeaderItem = this.f270068i;
        Integer numValueOf = galleryHeaderItem != null ? Integer.valueOf(galleryHeaderItem.f270009f) : null;
        FrameLayout frameLayout = this.f270067h;
        int childCount = frameLayout.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            boolean z13 = numValueOf != null && i12 == numValueOf.intValue();
            float f12 = z13 ? 1.0f : 0.0f;
            long j12 = 200 / 2;
            View childAt = frameLayout.getChildAt(i12);
            int i13 = z13 ? 0 : 4;
            if (z12) {
                if (z13) {
                    childAt.setAlpha(0.0f);
                    childAt.setVisibility(0);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = childAt.animate();
                if (!z13) {
                    j12 = 0;
                }
                viewPropertyAnimatorAnimate.setStartDelay(j12).setDuration(200L).alpha(f12).withEndAction(new q(childAt, i13, 0));
            } else {
                childAt.animate().cancel();
                childAt.setAlpha(f12);
                childAt.setVisibility(i13);
            }
            i12++;
        }
    }

    @Override // com.avito.android.serp.adapter.gallery.p
    @Y61.k
    public final String TE(int i12) {
        c cVar = (c) d.f270031b.getValue(this.f270067h.getChildAt(i12), d.f270030a[0]);
        if (cVar != null) {
            CharSequence text = cVar.f270023c.getText();
            string = text != null ? text.toString() : null;
            if (string == null) {
                string = "";
            }
        }
        return string == null ? "" : string;
    }

    @Override // com.avito.android.serp.adapter.gallery.p
    @Y61.k
    public final String Xn() {
        CharSequence text = this.f270065f.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.ViewGroup[], java.lang.Object[]] */
    @Override // com.avito.android.serp.adapter.gallery.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cy(@Y61.k com.avito.android.serp.adapter.gallery.GalleryHeaderItem r19, @Y61.k com.avito.android.serp.adapter.gallery.m r20) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.gallery.t.cy(com.avito.android.serp.adapter.gallery.GalleryHeaderItem, com.avito.android.serp.adapter.gallery.m):void");
    }
}

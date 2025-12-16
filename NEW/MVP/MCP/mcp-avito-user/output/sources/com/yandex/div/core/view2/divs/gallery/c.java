package com.yandex.div.core.view2.divs.gallery;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22829k0;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.util.q;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.json.expressions.e;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;
import com.yandex.div2.H;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.sequences.C43033p;

/* compiled from: DivGalleryItemHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/c;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface c {

    /* renamed from: n2, reason: collision with root package name */
    @k
    public static final a f368450n2 = a.f368451a;

    /* compiled from: DivGalleryItemHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/c$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f368451a = new a();

        /* compiled from: DivGalleryItemHelper.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.gallery.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10875a {
            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                iArr2[0] = 1;
                iArr2[1] = 2;
                iArr2[2] = 3;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                iArr3[0] = 1;
                iArr3[3] = 2;
                iArr3[1] = 3;
                iArr3[2] = 4;
            }
        }

        public static final int a(a aVar, int i12, int i13, DivGallery.CrossContentAlignment crossContentAlignment) {
            aVar.getClass();
            int i14 = i12 - i13;
            int iOrdinal = crossContentAlignment.ordinal();
            if (iOrdinal == 0) {
                return 0;
            }
            if (iOrdinal == 1) {
                return i14 / 2;
            }
            if (iOrdinal == 2) {
                return i14;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f368452b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f368453c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f368454d;

        public b(int i12, c cVar, int i13) {
            this.f368452b = i12;
            this.f368453c = cVar;
            this.f368454d = i13;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            int i22 = this.f368454d;
            c cVar = this.f368453c;
            int i23 = this.f368452b;
            if (i23 == 0) {
                int i24 = -i22;
                cVar.getView().scrollBy(i24, i24);
                return;
            }
            cVar.getView().scrollBy(-cVar.getView().getScrollX(), -cVar.getView().getScrollY());
            RecyclerView.m layoutManager = cVar.getView().getLayoutManager();
            View viewZ = layoutManager == null ? null : layoutManager.Z(i23);
            I iB2 = I.b(cVar.getView().getLayoutManager(), cVar.n());
            while (viewZ == null && (cVar.getView().canScrollVertically(1) || cVar.getView().canScrollHorizontally(1))) {
                RecyclerView.m layoutManager2 = cVar.getView().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.i1();
                }
                RecyclerView.m layoutManager3 = cVar.getView().getLayoutManager();
                viewZ = layoutManager3 == null ? null : layoutManager3.Z(i23);
                if (viewZ != null) {
                    break;
                } else {
                    cVar.getView().scrollBy(cVar.getView().getWidth(), cVar.getView().getHeight());
                }
            }
            if (viewZ == null) {
                return;
            }
            int iG2 = (iB2.g(viewZ) - iB2.m()) - i22;
            ViewGroup.LayoutParams layoutParams = viewZ.getLayoutParams();
            int marginStart = iG2 + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            cVar.getView().scrollBy(marginStart, marginStart);
        }
    }

    static int i(int i12, int i13, int i14, int i15, int i16, boolean z12) {
        int i17 = i12 - i14;
        if (i17 < 0) {
            i17 = 0;
        }
        return (i15 < 0 || i15 > Integer.MAX_VALUE) ? i15 == -1 ? (z12 && i13 == 0) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i17, i13) : i15 == -2 ? i16 == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION) : i15 == -3 ? (i13 == Integer.MIN_VALUE || i13 == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(i17, i16), BeduinInputModel.MIN_TEXT_VERSION) : i16 == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i16, BeduinInputModel.MIN_TEXT_VERSION) : View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
    }

    int A(@k View view);

    @k
    DivGallery a();

    default void b(@k View view, int i12, int i13, int i14, int i15, boolean z12) {
        Object bVar;
        int iA2;
        int iA3;
        DivAlignmentVertical divAlignmentVerticalA;
        DivGallery.CrossContentAlignment crossContentAlignment;
        DivAlignmentHorizontal divAlignmentHorizontalA;
        DivGallery.CrossContentAlignment crossContentAlignmentA;
        List<AbstractC38330g> listK;
        Object tag;
        try {
            int i16 = Z.f406624c;
            listK = k();
            tag = view.getTag(R.id.div_gallery_item_index);
        } catch (Throwable th2) {
            int i17 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        bVar = listK.get(((Integer) tag).intValue()).a();
        DivGallery.CrossContentAlignment crossContentAlignmentA2 = null;
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        H h12 = (H) bVar;
        e expressionResolver = w().getExpressionResolver();
        com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> bVar2 = a().f371511i;
        int iN2 = n();
        if ((iN2 == 1 && view.getMeasuredWidth() == 0) || (iN2 == 0 && view.getMeasuredHeight() == 0)) {
            j(view, i12, i13, i14, i15);
            if (z12) {
                return;
            }
            h().add(view);
            return;
        }
        a aVar = f368450n2;
        if (iN2 == 1) {
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarM = h12 == null ? null : h12.m();
            if (bVarM == null || (divAlignmentHorizontalA = bVarM.a(expressionResolver)) == null) {
                crossContentAlignmentA = null;
            } else {
                aVar.getClass();
                int iOrdinal = divAlignmentHorizontalA.ordinal();
                if (iOrdinal == 0) {
                    crossContentAlignmentA = DivGallery.CrossContentAlignment.START;
                } else if (iOrdinal == 1) {
                    crossContentAlignmentA = DivGallery.CrossContentAlignment.CENTER;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    crossContentAlignmentA = DivGallery.CrossContentAlignment.END;
                }
            }
            if (crossContentAlignmentA == null) {
                crossContentAlignmentA = bVar2.a(expressionResolver);
            }
            iA2 = a.a(aVar, (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight(), i14 - i12, crossContentAlignmentA);
        } else {
            iA2 = 0;
        }
        if (iN2 == 0) {
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarU = h12 == null ? null : h12.u();
            if (bVarU != null && (divAlignmentVerticalA = bVarU.a(expressionResolver)) != null) {
                aVar.getClass();
                int iOrdinal2 = divAlignmentVerticalA.ordinal();
                if (iOrdinal2 == 0) {
                    crossContentAlignment = DivGallery.CrossContentAlignment.START;
                    crossContentAlignmentA2 = crossContentAlignment;
                } else {
                    if (iOrdinal2 == 1) {
                        crossContentAlignment = DivGallery.CrossContentAlignment.CENTER;
                    } else if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        crossContentAlignment = DivGallery.CrossContentAlignment.START;
                    } else {
                        crossContentAlignment = DivGallery.CrossContentAlignment.END;
                    }
                    crossContentAlignmentA2 = crossContentAlignment;
                }
            }
            if (crossContentAlignmentA2 == null) {
                crossContentAlignmentA2 = bVar2.a(expressionResolver);
            }
            iA3 = a.a(aVar, (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom(), i15 - i13, crossContentAlignmentA2);
        } else {
            iA3 = 0;
        }
        j(view, i12 + iA2, i13 + iA3, i14 + iA2, i15 + iA3);
        r(view, false);
        if (z12) {
            return;
        }
        h().remove(view);
    }

    int f();

    @k
    RecyclerView getView();

    @k
    HashSet h();

    void j(@k View view, int i12, int i13, int i14, int i15);

    @k
    List<AbstractC38330g> k();

    int l();

    int n();

    default void r(@k View view, boolean z12) {
        View view2;
        int iA2 = A(view);
        if (iA2 == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (view2 = (View) C43033p.n(new C22829k0(viewGroup))) == null) {
            return;
        }
        AbstractC38330g abstractC38330g = k().get(iA2);
        if (z12) {
            w().getDiv2Component().t().d(w(), null, abstractC38330g, C37931a.u(abstractC38330g.a()));
            w().A(view2);
        } else {
            w().getDiv2Component().t().d(w(), view2, abstractC38330g, C37931a.u(abstractC38330g.a()));
            w().k(view2, abstractC38330g);
        }
    }

    default void t() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            b(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        h().clear();
    }

    void v(int i12);

    @k
    C38029k w();

    int width();

    void y(int i12, int i13);

    default void z(int i12, int i13) {
        RecyclerView view = getView();
        if (!q.b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new b(i12, this, i13));
            return;
        }
        if (i12 == 0) {
            int i14 = -i13;
            getView().scrollBy(i14, i14);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.m layoutManager = getView().getLayoutManager();
        View viewZ = layoutManager == null ? null : layoutManager.Z(i12);
        I iB2 = I.b(getView().getLayoutManager(), n());
        while (viewZ == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.m layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.i1();
            }
            RecyclerView.m layoutManager3 = getView().getLayoutManager();
            viewZ = layoutManager3 == null ? null : layoutManager3.Z(i12);
            if (viewZ != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (viewZ == null) {
            return;
        }
        int iG2 = (iB2.g(viewZ) - iB2.m()) - i13;
        ViewGroup.LayoutParams layoutParams = viewZ.getLayoutParams();
        int marginStart = iG2 + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        getView().scrollBy(marginStart, marginStart);
    }
}

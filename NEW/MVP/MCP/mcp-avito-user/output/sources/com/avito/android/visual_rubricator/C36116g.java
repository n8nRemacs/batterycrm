package com.avito.android.visual_rubricator;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import com.avito.android.visual_rubricator.C36116g;
import com.avito.android.visual_rubricator.C36116g.a;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import com.avito.android.visual_rubricator.element.l;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48063a;

/* compiled from: DoubleRowsVisualRubricatorWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/g;", "Lcom/avito/android/visual_rubricator/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.visual_rubricator.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36116g extends com.avito.konveyor.adapter.b implements InterfaceC36112c {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f327415m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f327416b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f327417c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f327418d;

    /* renamed from: e, reason: collision with root package name */
    public final HorizontalScrollView f327419e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f327420f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f327421g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ViewOnScrollChangeListenerC36114e f327422h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327423i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f327424j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public Object f327425k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public Object f327426l;

    /* compiled from: DoubleRowsVisualRubricatorWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.g$a */
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            C36116g c36116g = C36116g.this;
            ArrayList arrayListD80 = C36116g.D80(c36116g.f327420f);
            ArrayList arrayListD802 = C36116g.D80(c36116g.f327421g);
            A a12 = q12.f406619b;
            if (((List) a12).size() == 2) {
                B b12 = q12.f406620c;
                if (((List) b12).size() == 2 && arrayListD80.size() == 2 && arrayListD802.size() == 2) {
                    c36116g.f327416b.O(new H(new kotlin.Q(a12, arrayListD80), new kotlin.Q(b12, arrayListD802)));
                }
            }
            c36116g.f327423i = false;
        }
    }

    /* compiled from: DoubleRowsVisualRubricatorWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.visual_rubricator.g$b */
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f327428b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("DoubleRowsRubricator", "on scroll error: " + ((Throwable) obj));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.visual_rubricator.e] */
    public C36116g(@Y61.k View view, @Y61.k final Q q12, @Y61.k G g12) {
        super(view);
        this.f327416b = g12;
        this.f327417c = (LinearLayout) view.findViewById(R.id.vertical_container);
        this.f327418d = (LinearLayout) view.findViewById(R.id.horizontal_container);
        this.f327419e = (HorizontalScrollView) view.findViewById(R.id.horizontal_scroll_view);
        this.f327420f = (LinearLayout) view.findViewById(R.id.row_first);
        this.f327421g = (LinearLayout) view.findViewById(R.id.row_second);
        this.f327424j = new io.reactivex.rxjava3.disposables.i(0);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f327425k = c42784z0;
        this.f327426l = c42784z0;
        this.f327422h = new View.OnScrollChangeListener() { // from class: com.avito.android.visual_rubricator.e
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i12, int i13, int i14, int i15) {
                int i16 = C36116g.f327415m;
                if (view2.isAttachedToWindow()) {
                    q12.x(i12);
                }
                C36116g c36116g = this;
                if (!c36116g.f327423i) {
                    c36116g.f327423i = true;
                    c36116g.f327425k = C36116g.D80(c36116g.f327420f);
                    c36116g.f327426l = C36116g.D80(c36116g.f327421g);
                }
                c36116g.f327424j.a(io.reactivex.rxjava3.core.z.c0(new kotlin.Q(c36116g.f327425k, c36116g.f327426l)).z(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).v0(c36116g.new a(), C36116g.b.f327428b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        };
    }

    public static void B80(VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, LinearLayout linearLayout, T t12, boolean z12, int i12, boolean z13) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.bx_content_widget_visual_rubricator_visual_rubricator_category_item, (ViewGroup) linearLayout, false);
        com.avito.android.visual_rubricator.element.l lVar = new com.avito.android.visual_rubricator.element.l(viewInflate);
        lVar.setOnClickListener(new ViewOnClickListenerC36113d(t12, visualRubricatorWidgetElementItem, i12, 2));
        lVar.yY(new com.avito.android.visual_rubricator.element.a());
        int[] iArr = {R.attr.textS2};
        TextView textView = lVar.f327405e;
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.setTextAppearance(resourceId);
        UniversalImage f327365h = visualRubricatorWidgetElementItem.getF327365h();
        if (f327365h != null) {
            lVar.i(f327365h);
        }
        lVar.EX(visualRubricatorWidgetElementItem.getF327360c(), visualRubricatorWidgetElementItem.getF327361d());
        UniversalColor f327371n = visualRubricatorWidgetElementItem.getF327371n();
        if (f327371n != null) {
            lVar.Ig(f327371n);
        }
        Integer f327363f = visualRubricatorWidgetElementItem.getF327363f();
        if (f327363f != null) {
            lVar.BY(f327363f.intValue());
        }
        UniversalColor f327372o = visualRubricatorWidgetElementItem.getF327372o();
        if (f327372o != null) {
            lVar.D5(f327372o);
        }
        Space f327373p = visualRubricatorWidgetElementItem.getF327373p();
        Space space = Space.f327305k;
        LinearLayout linearLayout2 = lVar.f327409i;
        View view = lVar.f327402b;
        SimpleDraweeView simpleDraweeView = lVar.f327406f;
        if (f327373p == space) {
            VisualRubricatorWidgetElementLayout f327366i = visualRubricatorWidgetElementItem.getF327366i();
            simpleDraweeView.getHierarchy().s(RoundingParams.b(32.0f));
            view.setTag(f327366i.toString());
            int i13 = l.a.f327412a[f327366i.ordinal()];
            if (i13 == 1) {
                if (linearLayout2 == null || (layoutParams5 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams5 = view.getLayoutParams();
                }
                layoutParams5.width = y6.b(142);
                layoutParams5.height = y6.b(78);
                view.setLayoutParams(layoutParams5);
            } else if (i13 == 2) {
                if (linearLayout2 == null || (layoutParams6 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams6 = view.getLayoutParams();
                }
                layoutParams6.width = y6.b(114);
                layoutParams6.height = y6.b(78);
                view.setLayoutParams(layoutParams6);
            } else if (i13 != 3) {
                if (linearLayout2 == null || (layoutParams8 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams8 = view.getLayoutParams();
                }
                layoutParams8.width = y6.b(84);
                layoutParams8.height = y6.b(78);
                view.setLayoutParams(layoutParams8);
            } else {
                if (linearLayout2 == null || (layoutParams7 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams7 = view.getLayoutParams();
                }
                layoutParams7.width = y6.b(114);
                layoutParams7.height = simpleDraweeView.getDrawable() == null ? y6.b(35) : y6.b(78);
                view.setLayoutParams(layoutParams7);
            }
        } else {
            VisualRubricatorWidgetElementLayout f327366i2 = visualRubricatorWidgetElementItem.getF327366i();
            simpleDraweeView.getHierarchy().s(RoundingParams.b(32.0f));
            view.setTag(f327366i2.toString());
            int i14 = l.a.f327412a[f327366i2.ordinal()];
            if (i14 == 1) {
                if (linearLayout2 == null || (layoutParams = linearLayout2.getLayoutParams()) == null) {
                    layoutParams = view.getLayoutParams();
                }
                layoutParams.width = y6.b(186);
                layoutParams.height = y6.b(70);
                view.setLayoutParams(layoutParams);
            } else if (i14 == 2) {
                if (linearLayout2 == null || (layoutParams2 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams2 = view.getLayoutParams();
                }
                layoutParams2.width = y6.b(138);
                layoutParams2.height = y6.b(70);
                view.setLayoutParams(layoutParams2);
            } else if (i14 != 3) {
                if (linearLayout2 == null || (layoutParams4 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams4 = view.getLayoutParams();
                }
                layoutParams4.width = y6.b(90);
                layoutParams4.height = y6.b(70);
                view.setLayoutParams(layoutParams4);
            } else {
                if (linearLayout2 == null || (layoutParams3 = linearLayout2.getLayoutParams()) == null) {
                    layoutParams3 = view.getLayoutParams();
                }
                layoutParams3.width = y6.b(138);
                layoutParams3.height = simpleDraweeView.getDrawable() == null ? y6.b(35) : y6.b(70);
                view.setLayoutParams(layoutParams3);
            }
            lVar.D80(Integer.valueOf(z12 ? y6.b(78) : y6.b(80)));
        }
        D6.c(lVar.f327405e, Integer.valueOf(y6.b(14)), null, null, null, 14);
        lVar.ad(R.drawable.bx_content_widget_visual_rubricator_rich_item_ripple_fg_r_16);
        lVar.LO(visualRubricatorWidgetElementItem.getF327370m());
        D6.c(viewInflate, Integer.valueOf(y6.b(3)), null, Integer.valueOf(y6.b(3)), null, 10);
        linearLayout.addView(viewInflate);
        if (visualRubricatorWidgetElementItem.getF327369l()) {
            lVar.s3();
        }
        if ((visualRubricatorWidgetElementItem.m0() && z13) || visualRubricatorWidgetElementItem.N5()) {
            String f327361d = visualRubricatorWidgetElementItem.getF327361d();
            if (f327361d == null) {
                f327361d = visualRubricatorWidgetElementItem.getF327360c();
            }
            C80(lVar, visualRubricatorWidgetElementItem, f327361d);
        }
    }

    public static void C80(com.avito.android.visual_rubricator.element.l lVar, VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, String str) {
        Integer f327367j = visualRubricatorWidgetElementItem.getF327367j();
        Drawable drawableH = f327367j != null ? C35835l0.h(f327367j.intValue(), lVar.itemView.getContext()) : null;
        if (drawableH == null) {
            lVar.EX(str, visualRubricatorWidgetElementItem.getF327361d());
            return;
        }
        Integer f327364g = visualRubricatorWidgetElementItem.getF327364g();
        UniversalColor f327372o = visualRubricatorWidgetElementItem.getF327372o();
        drawableH.setTint(f327364g != null ? C35835l0.d(f327364g.intValue(), lVar.itemView.getContext()) : f327372o != null ? C48063a.f437606a.a(lVar.itemView.getContext(), f327372o) : C35835l0.d(R.attr.black, lVar.itemView.getContext()));
        String str2 = str + ' ';
        SpannableString spannableString = new SpannableString(str2);
        ImageSpan imageSpan = new ImageSpan(drawableH, 0);
        drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
        spannableString.setSpan(imageSpan, str2.length() - 1, str2.length(), 33);
        lVar.f327405e.setText(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList D80(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        p6 p6Var = new p6(viewGroup);
        while (p6Var.hasNext()) {
            View view = (View) p6Var.next();
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                int i12 = rect.right;
                if (i12 - rect.left >= i12 / 2 && i12 >= view.getWidth() / 2) {
                    arrayList.add(Integer.valueOf(viewGroup.indexOfChild(view)));
                }
            }
        }
        return C42756l.B(new Integer[]{C42745f0.G(arrayList), C42745f0.S(arrayList)});
    }

    public static boolean E80(ViewGroup viewGroup, ArrayList arrayList) {
        if (viewGroup.getChildCount() != arrayList.size()) {
            return true;
        }
        boolean z12 = false;
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = (VisualRubricatorWidgetElementItem) obj;
            com.avito.android.visual_rubricator.element.l lVar = new com.avito.android.visual_rubricator.element.l(viewGroup.getChildAt(i12));
            String string = lVar.f327405e.getText().toString();
            String f327361d = visualRubricatorWidgetElementItem.getF327361d();
            if (f327361d == null) {
                f327361d = visualRubricatorWidgetElementItem.getF327360c();
            }
            if (!kotlin.jvm.internal.L.f(string, f327361d) || !kotlin.jvm.internal.L.f(lVar.f327402b.getTag().toString(), visualRubricatorWidgetElementItem.getF327366i().toString())) {
                z12 = true;
            }
            i12 = i13;
        }
        return z12;
    }

    @Override // com.avito.android.visual_rubricator.V
    public final boolean K10() {
        return this.f327420f.getChildCount() == 0 || this.f327421g.getChildCount() == 0;
    }

    @Override // com.avito.android.visual_rubricator.V
    public final void MV(@Y61.k List list, @Y61.k T t12, boolean z12, boolean z13) {
        this.f327419e.setOnScrollChangeListener(this.f327422h);
    }

    @Override // com.avito.android.visual_rubricator.V
    public final int gm() {
        int[] iArr = new int[2];
        LinearLayout linearLayout = this.f327417c;
        linearLayout.getLocationOnScreen(iArr);
        int height = linearLayout.getHeight() + iArr[1];
        if (height != linearLayout.getHeight()) {
            return height;
        }
        return -1;
    }

    @Override // com.avito.android.visual_rubricator.V
    public final void gy(@Y61.k List list, @Y61.k final T t12, int i12, boolean z12, boolean z13) {
        LinearLayout linearLayout;
        HorizontalScrollView horizontalScrollView = this.f327419e;
        int i13 = 0;
        boolean z14 = i12 != horizontalScrollView.getScrollX();
        horizontalScrollView.setOnScrollChangeListener(null);
        if (z14) {
            D6.g(horizontalScrollView);
            horizontalScrollView.scrollTo(0, 0);
        }
        horizontalScrollView.setOnScrollChangeListener(this.f327422h);
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            Integer f327368k = ((VisualRubricatorWidgetElementItem) obj).getF327368k();
            if (f327368k != null && f327368k.intValue() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            Integer f327368k2 = ((VisualRubricatorWidgetElementItem) obj2).getF327368k();
            if (f327368k2 != null && f327368k2.intValue() == 2) {
                arrayList2.add(obj2);
            }
        }
        LinearLayout linearLayout2 = this.f327420f;
        boolean zE80 = E80(linearLayout2, arrayList);
        LinearLayout linearLayout3 = this.f327421g;
        if (zE80 || E80(linearLayout3, arrayList2)) {
            linearLayout2.removeAllViews();
            linearLayout3.removeAllViews();
            LinearLayout linearLayout4 = this.f327418d;
            p6 p6Var = new p6(linearLayout4);
            while (p6Var.hasNext()) {
                View view = (View) p6Var.next();
                if (view.getId() == R.id.category_tile_root) {
                    linearLayout4.removeView(view);
                }
            }
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                B80((VisualRubricatorWidgetElementItem) next, linearLayout2, t12, z12, i15, z13);
                i14 = i15;
                linearLayout4 = linearLayout4;
                linearLayout3 = linearLayout3;
            }
            LinearLayout linearLayout5 = linearLayout4;
            LinearLayout linearLayout6 = linearLayout3;
            Iterator it2 = arrayList2.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                B80((VisualRubricatorWidgetElementItem) next2, linearLayout6, t12, z12, i17, z13);
                i16 = i17;
            }
            final VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem = (VisualRubricatorWidgetElementItem) androidx.media3.exoplayer.analytics.m.h(1, list);
            if (!z13) {
                if (visualRubricatorWidgetElementItem.m0()) {
                    linearLayout = linearLayout5;
                    View viewInflate = LayoutInflater.from(linearLayout5.getContext()).inflate(R.layout.bx_content_widget_visual_rubricator_update_visual_rubricator_all_categories, (ViewGroup) linearLayout, false);
                    com.avito.android.visual_rubricator.element.l lVar = new com.avito.android.visual_rubricator.element.l(viewInflate);
                    int[] iArr = {R.attr.textS2};
                    TextView textView = lVar.f327405e;
                    TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(iArr);
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    textView.setTextAppearance(resourceId);
                    String f327360c = visualRubricatorWidgetElementItem.getF327360c();
                    String string = C43066x.K(f327360c) ? null : f327360c;
                    if (string == null) {
                        string = this.itemView.getContext().getString(R.string.bx_content_widget_visual_rubricator_show_all_categories);
                    }
                    C80(lVar, visualRubricatorWidgetElementItem, string);
                    UniversalColor f327371n = visualRubricatorWidgetElementItem.getF327371n();
                    if (f327371n != null) {
                        lVar.Ig(f327371n);
                    }
                    Integer f327363f = visualRubricatorWidgetElementItem.getF327363f();
                    if (f327363f != null) {
                        lVar.BY(f327363f.intValue());
                    }
                    UniversalColor f327372o = visualRubricatorWidgetElementItem.getF327372o();
                    if (f327372o != null) {
                        lVar.D5(f327372o);
                    }
                    lVar.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.visual_rubricator.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i18 = C36116g.f327415m;
                            t12.k(visualRubricatorWidgetElementItem, null);
                        }
                    });
                    D6.f(viewInflate, y6.b(3), 0, y6.b(16), 0, 10);
                    if (z12) {
                        lVar.D80(Integer.valueOf(this.itemView.getResources().getDimensionPixelOffset(R.dimen.bx_content_widget_visual_rubricator_double_rows_rubricator_all_categories_with_mini_menu_height)));
                    }
                    linearLayout.addView(viewInflate);
                    if (visualRubricatorWidgetElementItem.getF327369l()) {
                        lVar.s3();
                    }
                } else {
                    linearLayout = linearLayout5;
                }
                if (visualRubricatorWidgetElementItem.N5()) {
                    D6.f(linearLayout, 0, 0, y6.b(15), 0, 11);
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            int i18 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                new com.avito.android.visual_rubricator.element.l(linearLayout2.getChildAt(i18)).setOnClickListener(new ViewOnClickListenerC36113d(t12, (VisualRubricatorWidgetElementItem) next3, i18, 0));
                i18 = i19;
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                int i22 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                new com.avito.android.visual_rubricator.element.l(linearLayout3.getChildAt(i13)).setOnClickListener(new ViewOnClickListenerC36113d(t12, (VisualRubricatorWidgetElementItem) next4, i13, 1));
                i13 = i22;
            }
        }
        if (z14) {
            this.itemView.post(new androidx.camera.video.internal.audio.q(i12, 17, this));
        }
        this.itemView.post(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 5));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f327419e.setOnScrollChangeListener(null);
        this.f327424j.a(null);
        this.f327423i = false;
    }
}

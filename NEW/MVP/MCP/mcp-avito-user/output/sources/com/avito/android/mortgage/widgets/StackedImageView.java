package com.avito.android.mortgage.widgets;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.mortgage.a;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: StackedImageView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/widgets/StackedImageView;", "Landroid/view/ViewGroup;", "", "getNotOverlappedPercent", "()F", "notOverlappedPercent", "a", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StackedImageView extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f203958k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f203959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f203960c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public final int f203961d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public final int f203962e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f203963f;

    /* renamed from: g, reason: collision with root package name */
    public final int f203964g;

    /* renamed from: h, reason: collision with root package name */
    public final float f203965h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ArrayList f203966i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final FrameLayout f203967j;

    /* compiled from: StackedImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/widgets/StackedImageView$a;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@k View view, @k Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
        }
    }

    @j
    public StackedImageView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final float getNotOverlappedPercent() {
        return 1 - this.f203965h;
    }

    public final void a(int i12, @k List list) {
        FrameLayout frameLayout = this.f203967j;
        boolean z12 = frameLayout.getVisibility() == 0;
        ArrayList arrayList = this.f203966i;
        int size = arrayList.size();
        int size2 = list.size();
        if (size2 != arrayList.size()) {
            while (arrayList.size() < size2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setOutlineProvider(new a());
                imageView.setClipToOutline(true);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                frameLayout2.setBackgroundColor(this.f203961d);
                int i13 = this.f203960c;
                frameLayout2.setPadding(i13, i13, i13, i13);
                frameLayout2.setOutlineProvider(new a());
                frameLayout2.setClipToOutline(true);
                frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                arrayList.add(frameLayout2);
                addView(frameLayout2);
            }
            while (arrayList.size() > size2) {
                removeView((View) arrayList.remove(C42745f0.J(arrayList)));
            }
        }
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            ((b) obj).a((ImageView) ((FrameLayout) arrayList.get(i14)).getChildAt(0));
            i14 = i15;
        }
        frameLayout.setVisibility(i12 > 0 ? 0 : 8);
        ((TextView) frameLayout.getChildAt(0)).setText(getContext().getString(R.string.stacked_image_view_additional_count, Integer.valueOf(i12)));
        if (size == arrayList.size()) {
            if (z12 == (frameLayout.getVisibility() == 0)) {
                return;
            }
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingBottom = (i15 - i13) - getPaddingBottom();
        int paddingTop = (((paddingBottom - getPaddingTop()) - getMeasuredHeight()) / 2) + getPaddingTop();
        int paddingStart = getPaddingStart();
        int paddingEnd = (i14 - i12) - getPaddingEnd();
        int i16 = paddingBottom - paddingTop;
        int notOverlappedPercent = paddingStart + i16;
        Iterator it = this.f203966i.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) it.next();
            frameLayout.layout(paddingStart, paddingTop, notOverlappedPercent, paddingBottom);
            frameLayout.bringToFront();
            float f12 = i16;
            paddingStart += (int) (getNotOverlappedPercent() * f12);
            if (paddingStart > paddingEnd) {
                paddingStart = paddingEnd;
            }
            notOverlappedPercent += (int) (f12 * getNotOverlappedPercent());
            if (notOverlappedPercent > paddingEnd) {
                notOverlappedPercent = paddingEnd;
            }
        }
        FrameLayout frameLayout2 = this.f203967j;
        if (frameLayout2.getVisibility() == 0) {
            frameLayout2.layout(paddingStart, paddingTop, notOverlappedPercent, paddingBottom);
            frameLayout2.bringToFront();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[LOOP:0: B:10:0x003c->B:12:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.widgets.StackedImageView.onMeasure(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StackedImageView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.stackedImageView : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_StackedImageView : i13;
        super(context, attributeSet, i12, i13);
        this.f203961d = -1;
        this.f203962e = -1;
        this.f203965h = 0.5f;
        this.f203966i = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.f198160a, i12, i13);
        this.f203965h = typedArrayObtainStyledAttributes.getFloat(6, this.f203965h);
        this.f203959b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, this.f203959b);
        this.f203960c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, this.f203960c);
        this.f203961d = typedArrayObtainStyledAttributes.getColor(4, this.f203961d);
        this.f203962e = typedArrayObtainStyledAttributes.getColor(2, this.f203962e);
        this.f203963f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f203964g = typedArrayObtainStyledAttributes.getResourceId(1, this.f203964g);
        typedArrayObtainStyledAttributes.recycle();
        setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setBackground(this.f203963f);
        textView.setTextAppearance(this.f203964g);
        textView.setTextColor(this.f203962e);
        textView.setOutlineProvider(new a());
        textView.setClipToOutline(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(this.f203961d);
        frameLayout.setOutlineProvider(new a());
        int i15 = this.f203960c;
        frameLayout.setPadding(i15, i15, i15, i15);
        frameLayout.setClipToOutline(true);
        frameLayout.setVisibility(8);
        this.f203967j = frameLayout;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
    }

    /* compiled from: StackedImageView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/widgets/StackedImageView$b;", "", "a", "b", "Lcom/avito/android/mortgage/widgets/StackedImageView$b$a;", "Lcom/avito/android/mortgage/widgets/StackedImageView$b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: StackedImageView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/widgets/StackedImageView$b$b;", "Lcom/avito/android/mortgage/widgets/StackedImageView$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.widgets.StackedImageView$b$b, reason: collision with other inner class name */
        public static final class C6086b implements b {
            @Override // com.avito.android.mortgage.widgets.StackedImageView.b
            public final void a(@k ImageView imageView) {
                com.avito.android.image_loader.glide.utils.b.a(imageView, 0);
            }
        }

        void a(@k ImageView imageView);

        /* compiled from: StackedImageView.kt */
        @P
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/widgets/StackedImageView$b$a;", "Lcom/avito/android/mortgage/widgets/StackedImageView$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f203968a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f203969b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f203970c;

            public a(@k String str, @InterfaceC42165v @l Integer num, @InterfaceC42165v @l Integer num2) {
                this.f203968a = str;
                this.f203969b = num;
                this.f203970c = num2;
            }

            @Override // com.avito.android.mortgage.widgets.StackedImageView.b
            public final void a(@k ImageView imageView) {
                ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
                Integer num = this.f203969b;
                if (num != null) {
                    Drawable drawableA = C43852a.a(imageView.getContext(), num.intValue());
                    ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
                    aVar.f169492j = drawableA;
                    aVar.f169493k = scaleType;
                }
                Integer num2 = this.f203970c;
                if (num2 != null) {
                    aVar.f169485c = num2;
                }
                aVar.f(Uri.parse(this.f203968a));
                aVar.c();
            }

            public /* synthetic */ a(String str, Integer num, Integer num2, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2);
            }
        }
    }
}

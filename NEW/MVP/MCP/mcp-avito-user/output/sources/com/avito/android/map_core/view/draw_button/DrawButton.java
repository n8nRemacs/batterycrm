package com.avito.android.map_core.view.draw_button;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.jakewharton.rxrelay3.c;
import e11.ViewOnClickListenerC39879j1;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: DrawButton.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/map_core/view/draw_button/DrawButton;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/map_core/view/draw_button/DrawingState;", "drawingState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/map_core/view/draw_button/DrawingState;)V", "Lio/reactivex/rxjava3/core/z;", "k", "Lio/reactivex/rxjava3/core/z;", "getClicks", "()Lio/reactivex/rxjava3/core/z;", "clicks", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DrawButton extends CardView {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f185699b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c<G0> f185700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f185701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f185702e;

    /* renamed from: f, reason: collision with root package name */
    public final int f185703f;

    /* renamed from: g, reason: collision with root package name */
    public final int f185704g;

    /* renamed from: h, reason: collision with root package name */
    public final int f185705h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ColorStateList f185706i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ColorStateList f185707j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final c f185708k;

    /* compiled from: DrawButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DrawingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DrawingState drawingState = DrawingState.f185715b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DrawingState drawingState2 = DrawingState.f185715b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DrawingState drawingState3 = DrawingState.f185715b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DrawButton(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        c<G0> cVar = new c<>();
        this.f185700c = cVar;
        this.f185701d = (int) (12 * Resources.getSystem().getDisplayMetrics().density);
        this.f185702e = (int) (18 * Resources.getSystem().getDisplayMetrics().density);
        this.f185703f = (int) (10 * Resources.getSystem().getDisplayMetrics().density);
        this.f185704g = C35835l0.d(R.attr.blue600, getContext());
        this.f185705h = C35835l0.d(R.attr.white, getContext());
        this.f185706i = C35835l0.e(R.attr.white, getContext());
        this.f185707j = C35835l0.e(R.attr.black, getContext());
        this.f185708k = cVar;
        View.inflate(getContext(), R.layout.search_map_draw_button, this);
        View viewFindViewById = findViewById(R.id.search_map_draw_button_label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f185699b = (TextView) viewFindViewById;
        setOnClickListener(new ViewOnClickListenerC39879j1(this, 4));
    }

    @k
    public final z<G0> getClicks() {
        return this.f185708k;
    }

    public final void setState(@k DrawingState drawingState) {
        int i12;
        Drawable drawable;
        TextView textView = this.f185699b;
        if (textView != null) {
            int iOrdinal = drawingState.ordinal();
            if (iOrdinal != 0) {
                int i13 = this.f185703f;
                i12 = this.f185702e;
                if (iOrdinal == 1) {
                    textView.setText(R.string.map_area_button_cancel);
                    textView.setCompoundDrawablePadding(i13);
                } else {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textView.setText(R.string.map_area_button_reset);
                    textView.setCompoundDrawablePadding(i13);
                }
            } else {
                textView.setText("");
                textView.setCompoundDrawablePadding(0);
                i12 = this.f185701d;
            }
            textView.setPadding(i12, 0, i12, 0);
            if (drawingState == DrawingState.f185718e) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                drawable = compoundDrawables.length != 0 ? compoundDrawables[0] : null;
                int i14 = this.f185705h;
                if (drawable != null) {
                    drawable.setTint(i14);
                }
                textView.setTextColor(i14);
                setCardBackgroundColor(this.f185704g);
                return;
            }
            Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
            drawable = compoundDrawables2.length != 0 ? compoundDrawables2[0] : null;
            ColorStateList colorStateList = this.f185707j;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
            }
            textView.setTextColor(colorStateList);
            setCardBackgroundColor(this.f185706i);
        }
    }
}

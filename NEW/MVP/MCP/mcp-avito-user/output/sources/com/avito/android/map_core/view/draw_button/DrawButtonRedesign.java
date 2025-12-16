package com.avito.android.map_core.view.draw_button;

import LV.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.lib.util.c;
import com.avito.android.util.C35835l0;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import gY.C40635a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DrawButtonRedesign.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/map_core/view/draw_button/DrawButtonRedesign;", "Landroidx/cardview/widget/CardView;", "LLV/b;", "LgY/a;", "newState", "Lkotlin/G0;", "setState", "(LgY/a;)V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DrawButtonRedesign extends CardView implements b<C40635a> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f185709g = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ImageView f185710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f185711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f185712d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Drawable f185713e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f185714f;

    /* compiled from: DrawButtonRedesign.kt */
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

    @j
    public DrawButtonRedesign(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DrawButtonRedesign(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f185711c = C35835l0.d(R.attr.white, context);
        this.f185712d = C35835l0.d(R.attr.black, context);
        Drawable drawableK = C35835l0.k(R.drawable.ic_drawing_touch, context);
        this.f185713e = drawableK;
        this.f185714f = C35835l0.m(context, R.attr.ic_close24, R.attr.white);
        View.inflate(context, R.layout.search_map_draw_button_redesign, this);
        View viewFindViewById = findViewById(R.id.search_map_draw_button_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        this.f185710b = imageView;
        imageView.setImageDrawable(drawableK);
    }

    @Override // LV.b
    public void setState(@k C40635a newState) {
        ImageView imageView = this.f185710b;
        if (imageView == null || new c(newState, null).f181333c) {
            return;
        }
        DrawingState drawingState = newState.f396485a;
        if (!new c(drawingState, null).f181333c && drawingState != null) {
            int iOrdinal = drawingState.ordinal();
            if (iOrdinal == 0) {
                imageView.setImageDrawable(this.f185713e);
                setCardBackgroundColor(this.f185711c);
            } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                imageView.setImageDrawable(this.f185714f);
                setCardBackgroundColor(this.f185712d);
            }
        }
        Y41.a<G0> aVar = newState.f396486b;
        if (new c(aVar, null).f181333c || aVar == null) {
            return;
        }
        setOnClickListener(new i(22, aVar));
    }
}

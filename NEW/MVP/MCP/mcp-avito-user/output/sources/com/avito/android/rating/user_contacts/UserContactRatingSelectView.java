package com.avito.android.rating.user_contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import j.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UserContactRatingSelectView.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView;", "Landroid/view/View;", "Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;", "b", "Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;", "getOnRatingSelectListener", "()Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;", "setOnRatingSelectListener", "(Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;)V", "onRatingSelectListener", "", "d", "I", "getStarSize", "()I", "getStarSize$annotations", "()V", "starSize", "e", "getStarSpace", "getStarSpace$annotations", "starSpace", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserContactRatingSelectView extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public a onRatingSelectListener;

    /* renamed from: c, reason: collision with root package name */
    public final int f247646c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int starSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int starSpace;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Drawable f247649f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Drawable f247650g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Rect[] f247651h;

    /* renamed from: i, reason: collision with root package name */
    public int f247652i;

    /* compiled from: UserContactRatingSelectView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/UserContactRatingSelectView$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(int i12);
    }

    @X41.j
    public UserContactRatingSelectView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Y61.l
    public final a getOnRatingSelectListener() {
        return this.onRatingSelectListener;
    }

    public final int getStarSize() {
        return this.starSize;
    }

    public final int getStarSpace() {
        return this.starSpace;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        int i12 = 0;
        while (i12 < this.f247646c) {
            Drawable drawable = i12 <= this.f247652i + (-1) ? this.f247649f : this.f247650g;
            drawable.setBounds(this.f247651h[i12]);
            drawable.draw(canvas);
            i12++;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = i14 - i12;
        int i17 = this.f247646c;
        int i18 = this.starSize;
        int i19 = this.starSpace;
        int i22 = ((i16 - (i17 * i18)) - ((i17 - 1) * i19)) / 2;
        for (int i23 = 0; i23 < i17; i23++) {
            this.f247651h[i23].set(i22, 0, i22 + i18, i18);
            i22 += i18 + i19;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size;
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = this.starSize;
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            size = View.MeasureSpec.getSize(i12);
        } else {
            int i14 = this.f247646c;
            size = ((i14 - 1) * this.starSpace) + (i14 * size2);
        }
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 != Integer.MIN_VALUE && mode2 == 1073741824) {
            size2 = View.MeasureSpec.getSize(i13);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        int action;
        a aVar;
        if (super.onTouchEvent(motionEvent) || (action = motionEvent.getAction()) == 0) {
            return true;
        }
        int i12 = 0;
        if (action != 1) {
            return false;
        }
        int x12 = (int) motionEvent.getX();
        int y12 = (int) motionEvent.getY();
        Rect[] rectArr = this.f247651h;
        int length = rectArr.length;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (rectArr[i12].contains(x12, y12)) {
                break;
            }
            i12++;
        }
        int i13 = i12 + 1;
        if (i13 == this.f247652i) {
            return true;
        }
        this.f247652i = i13;
        if (i13 > 0 && (aVar = this.onRatingSelectListener) != null) {
            aVar.a(i13);
        }
        invalidate();
        return true;
    }

    public final void setOnRatingSelectListener(@Y61.l a aVar) {
        this.onRatingSelectListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserContactRatingSelectView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f247646c = 5;
        this.starSize = y6.b(40);
        this.starSpace = y6.b(16);
        this.f247649f = context.getDrawable(R.drawable.expected_ic_rating_40).mutate();
        this.f247650g = context.getDrawable(R.drawable.expected_ic_rating_40).mutate();
        Rect[] rectArr = new Rect[5];
        for (int i14 = 0; i14 < 5; i14++) {
            rectArr[i14] = new Rect();
        }
        this.f247651h = rectArr;
        Drawable drawable = this.f247649f;
        int iD2 = C35835l0.d(R.attr.orange, context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(new PorterDuffColorFilter(iD2, mode));
        this.f247650g.setColorFilter(new PorterDuffColorFilter(C35835l0.d(R.attr.gray12, context), mode));
    }

    @k0
    public static /* synthetic */ void getStarSize$annotations() {
    }

    @k0
    public static /* synthetic */ void getStarSpace$annotations() {
    }
}

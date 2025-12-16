package mn0;

import Ca1.ViewOnTouchListenerC13234a;
import VU.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.R;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RewardBugEntryView.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R*\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"Lmn0/b;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;", "positionOnScreen", "Lkotlin/G0;", "setPosition", "(Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;)V", "value", "c", "Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;", "getPositionOnScreen", "()Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;", "setPositionOnScreen", "Lkotlin/Function1;", "d", "LY41/l;", "getOnPositionOnScreenChanged", "()LY41/l;", "setOnPositionOnScreenChanged", "(LY41/l;)V", "onPositionOnScreenChanged", "Lcom/facebook/drawee/view/SimpleDraweeView;", "e", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getImageView", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "imageView", "f", "Landroid/widget/FrameLayout;", "getCloseIcon", "()Landroid/widget/FrameLayout;", "closeIcon", "Lkotlin/Function0;", "g", "LY41/a;", "getOnClick", "()LY41/a;", "setOnClick", "(LY41/a;)V", "onClick", "h", "getOnDrag", "setOnDrag", "onDrag", "", "isVisible", "Z", "()Z", "setVisible", "(Z)V", "", "getRightCornerX", "()I", "rightCornerX", "getBottomY", "bottomY", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44109b extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f414727v = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.button.c f414728b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public PositionOnScreen positionOnScreen;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.l<? super PositionOnScreen, G0> onPositionOnScreenChanged;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public final SimpleDraweeView imageView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final FrameLayout closeIcon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onDrag;

    /* renamed from: i, reason: collision with root package name */
    public boolean f414735i;

    /* renamed from: j, reason: collision with root package name */
    public int f414736j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f414737k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f414738l;

    /* renamed from: m, reason: collision with root package name */
    public final int f414739m;

    /* renamed from: n, reason: collision with root package name */
    public final int f414740n;

    /* renamed from: o, reason: collision with root package name */
    public final int f414741o;

    /* renamed from: p, reason: collision with root package name */
    public float f414742p;

    /* renamed from: q, reason: collision with root package name */
    public float f414743q;

    /* renamed from: r, reason: collision with root package name */
    public float f414744r;

    /* renamed from: s, reason: collision with root package name */
    public float f414745s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f414746t;

    /* renamed from: u, reason: collision with root package name */
    public final int f414747u;

    /* compiled from: RewardBugEntryView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn0.b$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PositionOnScreen.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionOnScreen.a aVar = PositionOnScreen.f255594b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PositionOnScreen.a aVar2 = PositionOnScreen.f255594b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PositionOnScreen.a aVar3 = PositionOnScreen.f255594b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C44109b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        com.avito.android.lib.design.button.c cVar = new com.avito.android.lib.design.button.c();
        this.f414728b = cVar;
        PositionOnScreen.f255594b.getClass();
        this.positionOnScreen = PositionOnScreen.f255595c;
        this.f414736j = -1;
        this.f414739m = y6.b(100);
        this.f414740n = y6.b(10);
        this.f414741o = y6.b(130);
        this.f414747u = ViewConfiguration.get(context).getScaledTouchSlop();
        setWillNotDraw(false);
        cVar.h(D6.i(24, context), null, new d(0, D6.i(4, context), context.getColor(R.color.reward_bug_entry_floating_entry_point_shadow), D6.i(10, context)), true);
        setBackgroundResource(R.drawable.reward_bug_entry_bg);
        LayoutInflater.from(context).inflate(R.layout.reward_bug_entry_floating_view, (ViewGroup) this, true);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.image_view);
        this.imageView = simpleDraweeView;
        this.closeIcon = (FrameLayout) findViewById(R.id.close_button);
        try {
            simpleDraweeView.setBackground(D6.u(this, R.drawable.reward_bug_entry_bg));
        } catch (Resources.NotFoundException unused) {
            this.f414738l = true;
        }
        setVisibility(8);
        setHapticFeedbackEnabled(true);
        C22823h0.K(this, new com.my.target.ads.a(this, 20));
    }

    public static void a(C44109b c44109b, J0 j02) {
        c44109b.f414737k = j02.p(8);
        if (C42745f0.U(PositionOnScreen.f255599g, PositionOnScreen.f255598f).contains(c44109b.positionOnScreen)) {
            c44109b.setY(c44109b.getBottomY());
        }
    }

    public static void b(C44109b c44109b) {
        Y41.l<? super PositionOnScreen, G0> lVar = c44109b.onPositionOnScreenChanged;
        if (lVar != null) {
            int x12 = (int) c44109b.getX();
            int i12 = c44109b.f414741o;
            int i13 = c44109b.f414740n;
            lVar.invoke((x12 == i13 && ((int) c44109b.getY()) == i12) ? PositionOnScreen.f255597e : (((int) c44109b.getX()) == c44109b.getRightCornerX() && ((int) c44109b.getY()) == i12) ? PositionOnScreen.f255596d : (((int) c44109b.getX()) == i13 && ((int) c44109b.getY()) == c44109b.getBottomY()) ? PositionOnScreen.f255599g : (((int) c44109b.getX()) == c44109b.getRightCornerX() && ((int) c44109b.getY()) == c44109b.getBottomY()) ? PositionOnScreen.f255598f : PositionOnScreen.f255597e);
        }
        Y41.a<G0> aVar = c44109b.onDrag;
        if (aVar != null) {
            aVar.invoke();
        }
        c44109b.performHapticFeedback(0);
    }

    public static boolean c(C44109b c44109b, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            c44109b.f414742p = motionEvent.getX();
            c44109b.f414743q = motionEvent.getY();
            c44109b.f414744r = motionEvent.getRawX();
            c44109b.f414745s = motionEvent.getRawY();
            return false;
        }
        if (action != 1) {
            if (action != 2 || !c44109b.f414746t) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f12 = rawX - c44109b.f414744r;
            float f13 = rawY - c44109b.f414745s;
            c44109b.setTranslationX(c44109b.getTranslationX() + f12);
            c44109b.setTranslationY(c44109b.getTranslationY() + f13);
            c44109b.f414744r = rawX;
            c44109b.f414745s = rawY;
            c44109b.f414736j = 2;
            if (!c44109b.f414735i) {
                c44109b.f414735i = true;
                c44109b.d(false);
            }
        } else {
            if (c44109b.f414736j == 0) {
                c44109b.f414735i = false;
                c44109b.performClick();
                return false;
            }
            c44109b.d(true);
            int i12 = c44109b.getResources().getDisplayMetrics().widthPixels;
            int i13 = c44109b.getResources().getDisplayMetrics().heightPixels;
            float x12 = c44109b.getX();
            float f14 = c44109b.f414739m / 2;
            int rightCornerX = x12 + f14 <= ((float) (i12 / 2)) ? c44109b.f414740n : c44109b.getRightCornerX();
            int bottomY = c44109b.getY() + f14 <= ((float) (i13 / 2)) ? c44109b.f414741o : c44109b.getBottomY();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = c44109b.animate();
            viewPropertyAnimatorAnimate.translationX(rightCornerX);
            viewPropertyAnimatorAnimate.translationY(bottomY);
            viewPropertyAnimatorAnimate.setInterpolator(new DecelerateInterpolator());
            viewPropertyAnimatorAnimate.setDuration(250L);
            viewPropertyAnimatorAnimate.withEndAction(new RunnableC44108a(c44109b, 1));
            c44109b.f414735i = false;
            c44109b.performClick();
        }
        return true;
    }

    private final int getBottomY() {
        int i12 = getResources().getDisplayMetrics().heightPixels;
        return this.f414737k ? i12 : (int) (i12 * 0.75d);
    }

    private final int getRightCornerX() {
        return (getResources().getDisplayMetrics().widthPixels - this.f414739m) - y6.b(10);
    }

    private final void setPosition(PositionOnScreen positionOnScreen) {
        int iOrdinal = positionOnScreen.ordinal();
        int i12 = this.f414741o;
        if (iOrdinal != 0) {
            int i13 = this.f414740n;
            if (iOrdinal == 1) {
                setX(i13);
                setY(i12);
            } else if (iOrdinal == 2) {
                setX(getRightCornerX());
                setY(getBottomY());
            } else if (iOrdinal == 3) {
                setX(i13);
                setY(getBottomY());
            }
        } else {
            setX(getRightCornerX());
            setY(i12);
        }
        invalidate();
    }

    public final void d(boolean z12) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setInterpolator(new BounceInterpolator());
        float f12 = z12 ? 1.0f : 1.3f;
        viewPropertyAnimatorAnimate.scaleX(f12);
        viewPropertyAnimatorAnimate.scaleY(f12);
        viewPropertyAnimatorAnimate.setDuration(100L);
        viewPropertyAnimatorAnimate.withEndAction(new RunnableC44108a(this, 0));
    }

    @Override // android.view.View
    public final void draw(@k Canvas canvas) {
        SimpleDraweeView simpleDraweeView = this.imageView;
        float x12 = simpleDraweeView.getX();
        float y12 = simpleDraweeView.getY();
        int iSave = canvas.save();
        canvas.translate(x12, y12);
        try {
            this.f414728b.a(canvas, simpleDraweeView);
            canvas.restoreToCount(iSave);
            super.draw(canvas);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @k
    public final FrameLayout getCloseIcon() {
        return this.closeIcon;
    }

    @k
    public final SimpleDraweeView getImageView() {
        return this.imageView;
    }

    @l
    public final Y41.a<G0> getOnClick() {
        return this.onClick;
    }

    @l
    public final Y41.a<G0> getOnDrag() {
        return this.onDrag;
    }

    @l
    public final Y41.l<PositionOnScreen, G0> getOnPositionOnScreenChanged() {
        return this.onPositionOnScreenChanged;
    }

    @k
    public final PositionOnScreen getPositionOnScreen() {
        return this.positionOnScreen;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(new ViewOnTouchListenerC13234a(this, 20));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.onPositionOnScreenChanged = null;
        this.onClick = null;
        this.onDrag = null;
        setOnTouchListener(null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(@Y61.k android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 == 0) goto L40
            r2 = 1
            if (r0 == r2) goto L39
            r3 = 2
            if (r0 == r3) goto L11
            r2 = 3
            if (r0 == r2) goto L39
            goto L3b
        L11:
            float r0 = r5.getX()
            float r1 = r4.f414742p
            float r0 = r0 - r1
            float r1 = r5.getY()
            float r3 = r4.f414743q
            float r1 = r1 - r3
            boolean r3 = r4.f414746t
            if (r3 != 0) goto L3b
            float r0 = java.lang.Math.abs(r0)
            int r3 = r4.f414747u
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L36
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L3b
        L36:
            r4.f414746t = r2
            return r2
        L39:
            r4.f414746t = r1
        L3b:
            boolean r5 = super.onInterceptTouchEvent(r5)
            return r5
        L40:
            float r0 = r5.getX()
            r4.f414742p = r0
            float r0 = r5.getY()
            r4.f414743q = r0
            float r0 = r5.getRawX()
            r4.f414744r = r0
            float r5 = r5.getRawY()
            r4.f414745s = r5
            r4.f414746t = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.C44109b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        this.f414728b.d(this.imageView);
    }

    public final void setOnClick(@l Y41.a<G0> aVar) {
        this.onClick = aVar;
    }

    public final void setOnDrag(@l Y41.a<G0> aVar) {
        this.onDrag = aVar;
    }

    public final void setOnPositionOnScreenChanged(@l Y41.l<? super PositionOnScreen, G0> lVar) {
        this.onPositionOnScreenChanged = lVar;
    }

    public final void setPositionOnScreen(@k PositionOnScreen positionOnScreen) {
        this.positionOnScreen = positionOnScreen;
        setPosition(positionOnScreen);
    }

    public final void setVisible(boolean z12) {
        setVisibility(z12 ? 0 : 4);
        if (this.f414738l) {
            setVisibility(4);
        }
    }
}

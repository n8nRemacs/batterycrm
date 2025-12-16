package Sy;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.R;
import com.avito.android.employee_bug_reporter_impl.domain.PositionOnScreen;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EmployeeBugReporterView.kt */
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R*\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"LSy/b;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;", "positionOnScreen", "Lkotlin/G0;", "setPosition", "(Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;)V", "value", "b", "Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;", "getPositionOnScreen", "()Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;", "setPositionOnScreen", "Lkotlin/Function1;", "c", "LY41/l;", "getOnPositionOnScreenChanged", "()LY41/l;", "setOnPositionOnScreenChanged", "(LY41/l;)V", "onPositionOnScreenChanged", "Lkotlin/Function0;", "d", "LY41/a;", "getOnClick", "()LY41/a;", "setOnClick", "(LY41/a;)V", "onClick", "e", "getOnDrag", "setOnDrag", "onDrag", "", "getRightCornerX", "()I", "rightCornerX", "getBottomY", "bottomY", "", "isVisible", "Z", "()Z", "setVisible", "(Z)V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AppCompatImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f15207p = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public PositionOnScreen positionOnScreen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.l<? super PositionOnScreen, G0> onPositionOnScreenChanged;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onDrag;

    /* renamed from: f, reason: collision with root package name */
    public float f15212f;

    /* renamed from: g, reason: collision with root package name */
    public float f15213g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15214h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15215i;

    /* renamed from: j, reason: collision with root package name */
    public int f15216j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15217k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15218l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15219m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15220n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15221o;

    /* compiled from: EmployeeBugReporterView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PositionOnScreen.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PositionOnScreen.a aVar = PositionOnScreen.f147289b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PositionOnScreen.a aVar2 = PositionOnScreen.f147289b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PositionOnScreen.a aVar3 = PositionOnScreen.f147289b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Handlers.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/S1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Sy.b$b, reason: collision with other inner class name */
    public static final class RunnableC1038b implements Runnable {
        public RunnableC1038b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.f15215i = true;
        }
    }

    public b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        PositionOnScreen.f147289b.getClass();
        this.positionOnScreen = PositionOnScreen.f147290c;
        this.f15216j = -1;
        this.f15219m = y6.b(42);
        this.f15220n = y6.b(10);
        this.f15221o = y6.b(120);
        try {
            setImageDrawable(C35835l0.h(R.attr.expected_ic_bug_reporter, context));
            setImageTintList(C35835l0.e(R.attr.black, context));
            setBackground(D6.u(this, R.drawable.bg_bug_reporter_btn));
        } catch (Resources.NotFoundException unused) {
            this.f15218l = true;
        }
        setVisibility(8);
        setElevation(12.0f);
        setHapticFeedbackEnabled(true);
        C22823h0.K(this, new Ae0.c(this, 6));
    }

    private final int getBottomY() {
        return getResources().getDisplayMetrics().heightPixels - (this.f15217k ? y6.b(360) : y6.b(120));
    }

    private final int getRightCornerX() {
        return (getResources().getDisplayMetrics().widthPixels - this.f15219m) - y6.b(10);
    }

    public static void k(b bVar, J0 j02) {
        bVar.f15217k = j02.p(8);
        if (C42745f0.U(PositionOnScreen.f147294g, PositionOnScreen.f147293f).contains(bVar.positionOnScreen)) {
            bVar.setY(bVar.getBottomY());
        }
    }

    public static boolean l(b bVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            bVar.f15212f = bVar.getX() - motionEvent.getRawX();
            bVar.f15213g = bVar.getY() - motionEvent.getRawY();
            bVar.f15216j = 0;
            bVar.getHandler().postAtTime(bVar.new RunnableC1038b(), "br-view", SystemClock.uptimeMillis() + 500);
        } else if (action == 1) {
            bVar.getHandler().removeCallbacksAndMessages("br-view");
            if (bVar.f15216j == 0) {
                Y41.a<G0> aVar = bVar.onClick;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                bVar.n(true);
                int i12 = bVar.getResources().getDisplayMetrics().widthPixels;
                int i13 = bVar.getResources().getDisplayMetrics().heightPixels;
                float x12 = bVar.getX();
                float f12 = bVar.f15219m / 2;
                int rightCornerX = x12 + f12 <= ((float) (i12 / 2)) ? bVar.f15220n : bVar.getRightCornerX();
                int bottomY = bVar.getY() + f12 <= ((float) (i13 / 2)) ? bVar.f15221o : bVar.getBottomY();
                ViewPropertyAnimator viewPropertyAnimatorAnimate = bVar.animate();
                viewPropertyAnimatorAnimate.translationX(rightCornerX);
                viewPropertyAnimatorAnimate.translationY(bottomY);
                viewPropertyAnimatorAnimate.setInterpolator(new DecelerateInterpolator());
                viewPropertyAnimatorAnimate.setDuration(250L);
                viewPropertyAnimatorAnimate.withEndAction(new RunnableC15269a(bVar, 0));
            }
            bVar.f15214h = false;
            bVar.f15215i = false;
            bVar.performClick();
        } else {
            if (action != 2) {
                return false;
            }
            if (bVar.f15215i) {
                bVar.setX(motionEvent.getRawX() + bVar.f15212f);
                bVar.setY(motionEvent.getRawY() + bVar.f15213g);
                bVar.f15216j = 2;
                if (!bVar.f15214h) {
                    bVar.f15214h = true;
                    bVar.n(false);
                }
            }
        }
        return true;
    }

    public static void m(b bVar) {
        Y41.l<? super PositionOnScreen, G0> lVar = bVar.onPositionOnScreenChanged;
        if (lVar != null) {
            int x12 = (int) bVar.getX();
            int i12 = bVar.f15221o;
            int i13 = bVar.f15220n;
            lVar.invoke((x12 == i13 && ((int) bVar.getY()) == i12) ? PositionOnScreen.f147292e : (((int) bVar.getX()) == bVar.getRightCornerX() && ((int) bVar.getY()) == i12) ? PositionOnScreen.f147291d : (((int) bVar.getX()) == i13 && ((int) bVar.getY()) == bVar.getBottomY()) ? PositionOnScreen.f147294g : (((int) bVar.getX()) == bVar.getRightCornerX() && ((int) bVar.getY()) == bVar.getBottomY()) ? PositionOnScreen.f147293f : PositionOnScreen.f147292e);
        }
        Y41.a<G0> aVar = bVar.onDrag;
        if (aVar != null) {
            aVar.invoke();
        }
        bVar.performHapticFeedback(0);
    }

    private final void setPosition(PositionOnScreen positionOnScreen) {
        int iOrdinal = positionOnScreen.ordinal();
        int i12 = this.f15221o;
        if (iOrdinal != 0) {
            int i13 = this.f15220n;
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

    public final void n(boolean z12) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setInterpolator(new BounceInterpolator());
        float f12 = z12 ? 1.0f : 1.3f;
        viewPropertyAnimatorAnimate.scaleX(f12);
        viewPropertyAnimatorAnimate.scaleY(f12);
        viewPropertyAnimatorAnimate.setDuration(100L);
        viewPropertyAnimatorAnimate.withEndAction(new RunnableC15269a(this, 1));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(new ViewOnTouchListenerC13234a(this, 1));
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
        setVisibility(z12 ? 0 : 8);
        if (this.f15218l) {
            setVisibility(8);
        }
    }
}

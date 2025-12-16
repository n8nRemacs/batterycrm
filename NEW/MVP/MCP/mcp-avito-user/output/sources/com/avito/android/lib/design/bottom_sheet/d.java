package com.avito.android.lib.design.bottom_sheet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.util.C1;
import com.avito.android.util.C35835l0;
import iR.C41336a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import j.InterfaceC42165v;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: BottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d;", "Landroidx/appcompat/app/A;", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class d extends androidx.appcompat.app.A {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final a f178509B = new a(null);

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final io.reactivex.rxjava3.subjects.e<Q<d, b>> f178510C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final C41981q0 f178511D;

    /* renamed from: A, reason: collision with root package name */
    public boolean f178512A;

    /* renamed from: g, reason: collision with root package name */
    public boolean f178513g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f178514h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f178515i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public CharSequence f178516j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public CharSequence f178517k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f178518l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f178519m;

    /* renamed from: n, reason: collision with root package name */
    public int f178520n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f178521o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178522p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public View f178523q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public View f178524r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178525s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f178526t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f178527u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178528v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f178529w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public q f178530x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final Integer f178531y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f178532z;

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR?\u0010\u0013\u001a-\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010 \u0011*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\u000e0\r¢\u0006\u0002\b\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d$a;", "", "<init>", "()V", "", "CHANGES_ANIMATION_TIME_MILLIS", "J", "", "NO_ID", "I", "", "TAG", "Ljava/lang/String;", "Lio/reactivex/rxjava3/subjects/e;", "Lkotlin/Q;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d$b;", "kotlin.jvm.PlatformType", "Lj41/e;", "dialogEventsSubject", "Lio/reactivex/rxjava3/subjects/e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d$b;", "", "a", "b", "Lcom/avito/android/lib/design/bottom_sheet/d$b$a;", "Lcom/avito/android/lib/design/bottom_sheet/d$b$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d$b$a;", "Lcom/avito/android/lib/design/bottom_sheet/d$b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f178533a = new a();
        }

        /* compiled from: BottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d$b$b;", "Lcom/avito/android/lib/design/bottom_sheet/d$b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.bottom_sheet.d$b$b, reason: collision with other inner class name */
        public static final class C5259b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5259b f178534a = new C5259b();
        }
    }

    static {
        io.reactivex.rxjava3.subjects.e<Q<d, b>> eVar = new io.reactivex.rxjava3.subjects.e<>();
        f178510C = eVar;
        f178511D = new C41981q0(eVar);
    }

    public /* synthetic */ d(Context context, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12);
    }

    public static void I(d dVar, boolean z12) {
        if (dVar.f178525s == z12) {
            return;
        }
        dVar.f178525s = z12;
        dVar.f178526t = false;
        q qVar = dVar.f178530x;
        if (qVar != null) {
            qVar.e(z12, false);
        }
        if (z12) {
            return;
        }
        dVar.S(dVar.f178520n);
    }

    public static /* synthetic */ void M(d dVar, CharSequence charSequence, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            charSequence = null;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        if ((i12 & 8) != 0) {
            z13 = false;
        }
        dVar.L(charSequence, null, z12, z13);
    }

    public static ViewGroup U(d dVar, int i12, View view, ViewGroup.LayoutParams layoutParams, int i13, Y41.l lVar, Y41.l lVar2, boolean z12, int i14) {
        G0 g02;
        int i15 = (i14 & 1) != 0 ? -1 : i12;
        final View viewInflate = (i14 & 2) != 0 ? null : view;
        ViewGroup.LayoutParams layoutParams2 = (i14 & 4) != 0 ? null : layoutParams;
        int i16 = (i14 & 8) != 0 ? -1 : i13;
        Y41.l lVar3 = (i14 & 16) != 0 ? null : lVar;
        Y41.l lVar4 = (i14 & 32) != 0 ? null : lVar2;
        boolean z13 = (i14 & 64) != 0 ? false : z12;
        dVar.getClass();
        boolean z14 = z13 && dVar.getContext().getResources().getBoolean(R.bool.is_tablet);
        ViewGroup viewGroup = (ViewGroup) dVar.getLayoutInflater().inflate(z14 ? R.layout.design_bottom_sheet_dialog_tablet : R.layout.design_bottom_sheet_dialog_mobile, (ViewGroup) null);
        q.f178563a.getClass();
        q a12 = z14 ? new A(viewGroup) : new u(viewGroup);
        a12.s(new e(dVar, a12));
        a12.a();
        a12.F(dVar.f178516j, dVar.f178517k, dVar.f178518l, dVar.f178519m);
        View view2 = dVar.f178523q;
        if (view2 != null) {
            a12.f(view2);
        }
        View view3 = dVar.f178524r;
        if (view3 != null) {
            a12.B(view3);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null && dVar.f178528v) {
            a12.j();
        }
        a12.l2(dVar.f178513g);
        a12.C(dVar.f178521o);
        boolean z15 = dVar.f178525s;
        if (z15) {
            a12.e(z15, dVar.f178526t);
        } else {
            a12.b(dVar.f178520n);
        }
        a12.u(new f(dVar));
        a12.setDraggable(dVar.f178529w);
        if (i15 != -1) {
            viewInflate = View.inflate(dVar.getContext(), i15, null);
        }
        if (viewInflate != null) {
            FrameLayout frameLayoutT1 = a12.getF178583j();
            if (layoutParams2 == null) {
                frameLayoutT1.addView(viewInflate);
            } else {
                frameLayoutT1.addView(viewInflate, layoutParams2);
            }
            FrameLayout frameLayoutG = a12.getF178585l();
            if (i16 != -1) {
                View viewInflate2 = dVar.getLayoutInflater().inflate(i16, (ViewGroup) frameLayoutG, true);
                frameLayoutG.measure(frameLayoutG.getMeasuredWidthAndState(), frameLayoutG.getMeasuredHeightAndState());
                frameLayoutG.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.avito.android.lib.design.bottom_sheet.a
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view4, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26) {
                        d.a aVar = d.f178509B;
                        int i27 = i22 - i18;
                        viewInflate.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), view4.getPaddingBottom() + i27);
                    }
                });
                ((ViewGroup) viewInflate).setClipToPadding(false);
                if (lVar4 != null) {
                    lVar4.invoke(viewInflate2);
                }
            }
            if (lVar3 != null) {
                lVar3.invoke(viewInflate);
            }
        }
        dVar.f178530x = a12;
        dVar.O(Picker.class, g.f178538l);
        return viewGroup;
    }

    public final void A(int i12, int i13) {
        super.setContentView(U(this, i12, null, null, i13, null, null, false, 118));
    }

    public final void B(int i12, int i13, @Y61.k Y41.l<? super View, G0> lVar, @Y61.k Y41.l<? super View, G0> lVar2, boolean z12) {
        super.setContentView(U(this, i12, null, null, i13, lVar, lVar2, z12, 6));
    }

    public final void C(int i12, @Y61.k Y41.l<? super View, G0> lVar) {
        super.setContentView(U(this, i12, null, null, 0, lVar, null, false, 110));
    }

    public final void D(int i12, boolean z12) {
        super.setContentView(U(this, i12, null, null, 0, null, null, z12, 62));
    }

    public final void E(int i12, boolean z12, @Y61.k Y41.l<? super View, G0> lVar) {
        super.setContentView(U(this, i12, null, null, 0, lVar, null, z12, 46));
    }

    public final void F(@Y61.k View view, @Y61.l Integer num, @Y61.l Y41.l lVar) {
        super.setContentView(U(this, 0, view, null, num != null ? num.intValue() : -1, null, lVar, true, 21));
    }

    public final void G(@Y61.k View view, boolean z12) {
        super.setContentView(U(this, 0, view, null, 0, null, null, z12, 61));
    }

    public final void H(@Y61.k View view) {
        this.f178523q = view;
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.f(view);
        }
    }

    public final void J(boolean z12) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.w(z12);
        }
    }

    public final void K(boolean z12) {
        this.f178521o = z12;
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.C(z12);
        }
    }

    public final void L(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, boolean z12, boolean z13) {
        this.f178516j = charSequence;
        this.f178517k = charSequence2;
        this.f178518l = z12;
        this.f178519m = z13;
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.F(charSequence, charSequence2, z12, z13);
        }
    }

    public final void N(boolean z12) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.m(z12);
        }
    }

    public final <T> void O(@Y61.k Class<T> cls, @Y61.k Y41.p<? super View, ? super MotionEvent, Boolean> pVar) {
        Map<Class<?>, Y41.p<View, MotionEvent, Boolean>> mapI;
        q qVar = this.f178530x;
        if (qVar == null || (mapI = qVar.i()) == null) {
            return;
        }
        mapI.put(cls, pVar);
    }

    public final void P(@Y61.l Y41.a<G0> aVar) {
        q qVar = this.f178530x;
        if (qVar == null) {
            return;
        }
        qVar.U(aVar);
    }

    public final void Q(@Y61.l Y41.a<G0> aVar) {
        q qVar = this.f178530x;
        if (qVar == null) {
            return;
        }
        qVar.q(aVar);
    }

    public final void R(@Y61.l Y41.a<G0> aVar) {
        q qVar = this.f178530x;
        if (qVar == null) {
            return;
        }
        qVar.E(aVar);
    }

    public final void S(int i12) {
        this.f178520n = i12;
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.b(i12);
        }
        I(this, false);
    }

    public final void T() {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C41336a.C11375a.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f178522p = true;
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
            window.setLayout(-1, -1);
        }
        f178510C.onNext(new Q<>(this, b.a.f178533a));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f178522p = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.view.r, android.app.Dialog
    public void onStart() {
        q qVar;
        super.onStart();
        if (!this.f178532z || (qVar = this.f178530x) == null) {
            return;
        }
        qVar.show();
    }

    public final void r() {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.dismiss();
        }
    }

    public final void s() {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.j2();
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z12) {
        if (this.f178513g != z12) {
            this.f178513g = z12;
            q qVar = this.f178530x;
            if (qVar != null) {
                qVar.l2(z12);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z12) {
        super.setCanceledOnTouchOutside(z12);
        if (z12 && !this.f178513g) {
            this.f178513g = true;
        }
        this.f178514h = z12;
        this.f178515i = true;
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.A(z12);
        }
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(int i12) {
        super.setContentView(U(this, i12, null, null, 0, null, null, false, WebSocketProtocol.PAYLOAD_SHORT));
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(@Y61.l final DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.lib.design.bottom_sheet.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                d.a aVar = d.f178509B;
                d.f178510C.onNext(new Q<>(this.f178506b, d.b.C5259b.f178534a));
                C41336a.C11375a.a();
                DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss(dialogInterface);
                }
            }
        });
    }

    @Override // androidx.appcompat.app.A, android.app.Dialog
    public void setTitle(int i12) {
        M(this, getContext().getText(i12), false, false, 14);
    }

    @Override // android.app.Dialog
    public void show() {
        Activity activityA = C35835l0.a(getContext());
        if (activityA == null || activityA.isFinishing()) {
            return;
        }
        super.show();
        TypedValue typedValue = new TypedValue();
        if ((!getContext().getTheme().resolveAttribute(R.attr.bottomSheet_defaultExpandedState, typedValue, true) || typedValue.data != 0) && getContext().getResources().getConfiguration().orientation == 2) {
            s();
        }
        Integer num = this.f178531y;
        if (num != null) {
            C1.f318564a.getClass();
            if (C1.a()) {
                final ColorDrawable colorDrawable = new ColorDrawable();
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(colorDrawable);
                }
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(0, num.intValue());
                valueAnimatorOfArgb.setDuration(200L);
                valueAnimatorOfArgb.setStartDelay(100L);
                valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.lib.design.bottom_sheet.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        d.a aVar = d.f178509B;
                        colorDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                valueAnimatorOfArgb.start();
            }
        }
    }

    public final void t() {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.z();
        }
    }

    @Y61.l
    public final View u() {
        q qVar = this.f178530x;
        if (qVar != null) {
            return qVar.getF178578e();
        }
        return null;
    }

    @Y61.l
    public final View v() {
        q qVar = this.f178530x;
        if (qVar != null) {
            return qVar.getF178577d();
        }
        return null;
    }

    public final void w(boolean z12) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.l(z12);
        }
    }

    public final void x(boolean z12) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.x(z12);
        }
    }

    public final void y(@InterfaceC42165v int i12) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.h(i12);
        }
    }

    public final void z(@Y61.l Drawable drawable) {
        q qVar = this.f178530x;
        if (qVar != null) {
            qVar.v(drawable);
        }
    }

    public d(@Y61.k Context context, int i12) {
        Window window;
        f178509B.getClass();
        if (i12 == 0) {
            TypedValue typedValue = new TypedValue();
            i12 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialog, typedValue, true) ? typedValue.resourceId : R.style.Design_Widget_BottomSheetDialog;
        }
        super(context, i12);
        this.f178513g = true;
        this.f178514h = true;
        this.f178520n = -1;
        this.f178529w = true;
        this.f178532z = true;
        this.f178512A = true;
        Integer numValueOf = null;
        setOnDismissListener(null);
        TypedValue typedValue2 = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue2, true);
        int i13 = typedValue2.resourceId;
        Integer numValueOf2 = i13 == 0 ? null : Integer.valueOf(i13);
        if (numValueOf2 != null) {
            Drawable drawableA = C43852a.a(getContext(), numValueOf2.intValue());
            ColorDrawable colorDrawable = drawableA instanceof ColorDrawable ? (ColorDrawable) drawableA : null;
            if (colorDrawable != null) {
                numValueOf = Integer.valueOf(colorDrawable.getColor());
            }
        }
        this.f178531y = numValueOf;
        if (numValueOf != null) {
            C1.f318564a.getClass();
            if (C1.a() && (window = getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        super.q();
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(@Y61.k View view) {
        super.setContentView(U(this, 0, view, null, 0, null, null, false, 125));
    }

    @Override // androidx.appcompat.app.A, android.app.Dialog
    public void setTitle(@Y61.l CharSequence charSequence) {
        M(this, charSequence, false, false, 14);
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(@Y61.k View view, @Y61.l ViewGroup.LayoutParams layoutParams) {
        super.setContentView(U(this, 0, view, layoutParams, 0, null, null, false, 121));
    }
}

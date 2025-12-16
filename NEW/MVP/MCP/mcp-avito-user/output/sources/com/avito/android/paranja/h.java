package com.avito.android.paranja;

import KV.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.tooltip.q;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.paranja.m;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.A6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;

/* compiled from: ParanjaView.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0018J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\"\u0010\u0017\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/avito/android/paranja/h;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/paranja/ParanjaState;", "Lcom/avito/android/paranja/f;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/paranja/ParanjaState;)V", "newStyle", "setStyle", "(Lcom/avito/android/paranja/f;)V", "h", "Lcom/avito/android/paranja/ParanjaState;", "getState$_avito_paranja_util", "()Lcom/avito/android/paranja/ParanjaState;", "setState$_avito_paranja_util", VoiceInfo.STATE, "i", "Lcom/avito/android/paranja/f;", "getStyle$_avito_paranja_util", "()Lcom/avito/android/paranja/f;", "setStyle$_avito_paranja_util", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "b", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class h extends FrameLayout implements LV.a<ParanjaState, f> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f210888o = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f210889b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f210890c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RectF f210891d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Rect f210892e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Paint f210893f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Paint f210894g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public ParanjaState state;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public f style;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super ParanjaState.ClickPosition, G0> f210897j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.tooltip.k f210898k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public TooltipState f210899l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public KV.a f210900m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final C22977J f210901n;

    /* compiled from: ParanjaView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            hVar.f210892e.set(hVar.getPaddingLeft(), hVar.getPaddingTop(), hVar.getWidth() - hVar.getPaddingRight(), hVar.getHeight() - hVar.getPaddingBottom());
            return G0.f406611a;
        }
    }

    /* compiled from: ParanjaView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/paranja/h$b;", "", "<init>", "()V", "", "APPEARING_ANIMATION_DURATION", "J", "", "DEFAULT_CORNER_RADIUS", "F", "", "DEFAULT_PADDING", "I", "", "TAG", "Ljava/lang/String;", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ParanjaView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ParanjaState.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParanjaState.State state = ParanjaState.State.f210855b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new b(null);
    }

    public h(@Y61.k View view) {
        Window window;
        super(view.getContext());
        Activity activityA = C35835l0.a(getContext());
        View decorView = (activityA == null || (window = activityA.getWindow()) == null) ? null : window.getDecorView();
        this.f210889b = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.f210890c = view;
        this.f210891d = new RectF();
        this.f210892e = new Rect();
        Paint paint = new Paint();
        this.f210893f = paint;
        Paint paint2 = new Paint(1);
        this.f210894g = paint2;
        this.f210899l = new TooltipState(null, false, null, null, null, null, null, null, null, null, false, null, null, TooltipState.State.f181286c, 8191, null);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
        a.C0572a c0572a = KV.a.f9464v;
        int iJ2 = C35835l0.j(R.attr.tooltipSmall, contextThemeWrapper);
        c0572a.getClass();
        this.f210900m = a.C0572a.b(iJ2, contextThemeWrapper);
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        C22977J c22977jA = interfaceC22983PA != null ? C22981N.a(interfaceC22983PA.getLifecycle()) : null;
        this.f210901n = c22977jA;
        setTag("ParanjaView");
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(contextThemeWrapper, 0, 0, 6, null);
        kVar.c(this.f210900m);
        this.f210898k = kVar;
        this.style = new f(new f.a(20, 20, 20, 20), C35835l0.d(R.attr.blackAlpha64, getContext()), 15.0f, null, 8, null);
        setWillNotDraw(false);
        setLayerType(2, null);
        paint.setColor(this.style.f210872b);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        D6.B(new a(), this);
        if (c22977jA != null) {
            C43259k.d(c22977jA, null, null, new i(this, null), 3);
        }
        e.f210864a.getClass();
        if (e.f210865b == null) {
            e.f210865b = new WeakReference<>(view);
            InterfaceC22983P interfaceC22983PA2 = V0.a(view);
            e.f210868e = interfaceC22983PA2 != null ? C22981N.a(interfaceC22983PA2.getLifecycle()) : null;
            A6.a(view.getViewTreeObserver(), com.avito.android.paranja.b.f210860l);
        } else {
            e.f210866c.K5(m.c.f210911a);
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void a() {
        this.f210898k.b(new TooltipState(null, false, null, null, null, null, null, null, null, null, false, null, null, TooltipState.State.f181286c, 8191, null));
        ViewGroup viewGroup = this.f210889b;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Y61.l
    /* renamed from: getState$_avito_paranja_util, reason: from getter */
    public final ParanjaState getState() {
        return this.state;
    }

    @Y61.k
    /* renamed from: getStyle$_avito_paranja_util, reason: from getter */
    public final f getStyle() {
        return this.style;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        e.f210864a.getClass();
        e.f210866c.K5(m.a.f210909a);
        WeakReference<View> weakReference = e.f210865b;
        if (weakReference != null && (view = weakReference.get()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            A6.a(viewTreeObserver, d.f210863l);
        }
        e.f210865b = null;
        N0 n02 = e.f210869f;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        e.f210869f = null;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.f210892e, this.f210893f);
        RectF rectF = this.f210891d;
        float f12 = this.style.f210873c;
        canvas.drawRoundRect(rectF, f12, f12, this.f210894g);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, @Y61.l KeyEvent keyEvent) {
        if (i12 != 4) {
            return super.onKeyDown(i12, keyEvent);
        }
        a();
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        if (motionEvent.getAction() != 0) {
            return true;
        }
        if (this.f210891d.contains(x12, y12)) {
            Y41.l<? super ParanjaState.ClickPosition, G0> lVar = this.f210897j;
            if (lVar != null) {
                lVar.invoke(ParanjaState.ClickPosition.f210849c);
            }
            a();
            return true;
        }
        Y41.l<? super ParanjaState.ClickPosition, G0> lVar2 = this.f210897j;
        if (lVar2 != null) {
            lVar2.invoke(ParanjaState.ClickPosition.f210848b);
        }
        a();
        return true;
    }

    public final void setState$_avito_paranja_util(@Y61.l ParanjaState paranjaState) {
        this.state = paranjaState;
    }

    public final void setStyle$_avito_paranja_util(@Y61.k f fVar) {
        this.style = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.paranja.ParanjaState r25) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.paranja.h.setState(com.avito.android.paranja.ParanjaState):void");
    }

    @Override // LV.d
    public void setStyle(@Y61.k f newStyle) {
        f fVar = this.style;
        if (fVar == null) {
            fVar = null;
        }
        if (new com.avito.android.lib.util.c(newStyle, fVar).f181333c) {
            return;
        }
        this.style = newStyle;
        f.a aVar = fVar != null ? fVar.f210871a : null;
        f.a aVar2 = newStyle.f210871a;
        com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(aVar2, aVar);
        com.avito.android.lib.design.tooltip.k kVar = this.f210898k;
        if (!cVar.f181333c && aVar2 != null) {
            q qVar = this.f210899l.f181271a;
            boolean z12 = qVar instanceof r.b;
            int iIntValue = aVar2.f210875a;
            if (!z12) {
                boolean z13 = qVar instanceof r.d;
                int i12 = aVar2.f210877c;
                if (z13) {
                    iIntValue = i12;
                } else {
                    boolean z14 = qVar instanceof r.c;
                    int i13 = aVar2.f210876b;
                    if (z14) {
                        iIntValue = i13;
                    } else {
                        boolean z15 = qVar instanceof r.a;
                        int i14 = aVar2.f210878d;
                        iIntValue = z15 ? i14 : ((Number) C42745f0.Z(C42745f0.U(Integer.valueOf(iIntValue), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)))).intValue();
                    }
                }
            }
            KV.a aVarA = KV.a.a(this.f210900m, 0, 0, iIntValue, 1966079);
            this.f210900m = aVarA;
            kVar.c(aVarA);
            requestLayout();
        }
        Integer numValueOf = Integer.valueOf(newStyle.f210872b);
        if (!new com.avito.android.lib.util.c(numValueOf, fVar != null ? Integer.valueOf(fVar.f210872b) : null).f181333c) {
            this.f210893f.setColor(numValueOf.intValue());
            invalidate();
        }
        if (!new com.avito.android.lib.util.c(Float.valueOf(newStyle.f210873c), fVar != null ? Float.valueOf(fVar.f210873c) : null).f181333c) {
            invalidate();
        }
        KV.a aVar3 = fVar != null ? fVar.f210874d : null;
        KV.a aVar4 = newStyle.f210874d;
        if (new com.avito.android.lib.util.c(aVar4, aVar3).f181333c || aVar4 == null) {
            return;
        }
        this.f210900m = aVar4;
        kVar.c(aVar4);
    }
}

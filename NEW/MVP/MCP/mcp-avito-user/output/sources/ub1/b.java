package Ub1;

import Nb1.a;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.content.d;
import androidx.vectordrawable.graphics.drawable.c;
import com.avito.android.R;
import d31.AbstractC39501g;
import d31.C39499e;
import e.InterfaceC39835a;
import java.util.Arrays;
import java.util.Observer;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import m.C43852a;
import m31.C43874b;
import m31.e;
import m31.f;
import m31.g;
import m31.h;
import m31.i;
import m31.j;
import m31.m;
import sberid.sdk.auth.model.ButtonText;
import sberid.sdk.auth.model.ButtonType;
import y2.C50040a;
import y2.C50041b;
import y81.InterfaceC50085b;

@P
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"LUb1/b;", "Landroid/widget/FrameLayout;", "", "visibility", "Lkotlin/G0;", "setVisibility", "(I)V", "", "isLoading", "setLoaderState", "(Z)V", "Ljava/util/Observer;", "observer", "setHideObserver", "(Ljava/util/Observer;)V", "Ld31/e;", "b", "Lkotlin/C;", "getAuthAnalytic", "()Ld31/e;", "authAnalytic", "Le31/g;", "c", "getGlobalAnalytic", "()Le31/g;", "globalAnalytic", "Le/a;", "d", "getGeneralRamStorage", "()Le/a;", "generalRamStorage", "Ly81/b;", "e", "getConfigRamStorage", "()Ly81/b;", "configRamStorage", "LD31/a;", "f", "getCoroutineScopes", "()LD31/a;", "coroutineScopes", "e0/e", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class b extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f16491x = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f16492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f16493c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f16494d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f16495e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f16496f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16497g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16498h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C50041b f16499i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final C50040a f16500j;

    /* renamed from: k, reason: collision with root package name */
    public int f16501k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final DisplayMetrics f16502l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f16503m;

    /* renamed from: n, reason: collision with root package name */
    public final TypedArray f16504n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Pb1.a f16505o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16506p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final C43874b f16507q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final g f16508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16509s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public String f16510t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public String f16511u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final N0 f16512v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final a f16513w;

    static {
        new e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, AttributeSet attributeSet, int i12, Pb1.a aVar, int i13, C42822w c42822w) {
        float dimension;
        int i14;
        int i15;
        boolean z12;
        ButtonType buttonType;
        int color;
        Integer num;
        ButtonType buttonType2;
        Integer num2;
        C50041b c50041b;
        int i16 = 0;
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        aVar = (i13 & 8) != 0 ? null : aVar;
        super(context, attributeSet, i12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        this.f16492b = C42727D.b(lazyThreadSafetyMode, h.f414293l);
        this.f16493c = C42727D.b(lazyThreadSafetyMode, i.f414294l);
        this.f16494d = C42727D.b(lazyThreadSafetyMode, j.f414295l);
        this.f16495e = C42727D.b(lazyThreadSafetyMode, m31.k.f414296l);
        this.f16496f = C42727D.b(lazyThreadSafetyMode, m31.l.f414297l);
        this.f16499i = new C50041b(this);
        this.f16502l = new DisplayMetrics();
        this.f16506p = getResources().getDimensionPixelSize(R.dimen.sber_logo_padding);
        this.f16507q = new C43874b();
        this.f16508r = new g(this);
        this.f16513w = new a(this, i16);
        this.f16505o = aVar;
        try {
            Context applicationContext = context.getApplicationContext();
            C50040a c50040a = new C50040a();
            String strA = AbstractC39501g.a(applicationContext, null);
            c50040a.setApplicationContext(applicationContext.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strA)) {
                intent.setPackage(strA);
            }
            applicationContext.bindService(intent, c50040a, 33);
            this.f16500j = c50040a;
        } catch (Throwable th2) {
            th2.getMessage();
        }
        LayoutInflater.from(context).inflate(R.layout.sber_id_button_layout, this);
        this.f16504n = context.obtainStyledAttributes(attributeSet, a.q.f11613a, 0, 0);
        Intent intent2 = new Intent();
        intent2.setPackage("ru.sberbankmobile");
        intent2.setAction("ru.sberbank.mobile.sberid.MASK_NAME");
        if (g() && (c50041b = this.f16499i) != null) {
            try {
                c50041b.f442864b = getContext().getApplicationContext().bindService(intent2, c50041b, 1);
            } catch (SecurityException unused) {
            }
            boolean z13 = c50041b.f442864b;
        }
        this.f16503m = (TextView) findViewById(R.id.sber_id_login_text_view);
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        Pb1.a aVar2 = this.f16505o;
        if (aVar2 == null || (num2 = aVar2.f13152f) == null) {
            TypedArray typedArray = this.f16504n;
            dimension = (typedArray == null ? null : typedArray).getDimension(0, 0.0f);
        } else {
            dimension = d(num2.intValue());
        }
        gradientDrawableE.setCornerRadius(dimension);
        if (aVar2 == null || (buttonType2 = aVar2.f13150d) == null) {
            TypedArray typedArray2 = this.f16504n;
            typedArray2 = typedArray2 == null ? null : typedArray2;
            ButtonType buttonType3 = ButtonType.f437752c;
            i14 = typedArray2.getInt(4, 0);
        } else {
            i14 = buttonType2.f437755b;
        }
        ButtonType buttonType4 = ButtonType.f437752c;
        if (i14 == 1) {
            gradientDrawableE.setColor(d.getColor(getContext(), android.R.color.transparent));
            if (aVar2 == null || (num = aVar2.f13153g) == null) {
                TypedArray typedArray3 = this.f16504n;
                color = (typedArray3 == null ? null : typedArray3).getColor(2, d.getColor(getContext(), R.color.color_sber_id_button_grey));
            } else {
                color = num.intValue();
            }
            gradientDrawableE.setStroke(3, color);
        } else {
            gradientDrawableE.setColor(d.getColor(getContext(), R.color.color_sber_id_button_primary));
        }
        setBackground(gradientDrawableE);
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = getContext().getDisplay();
            if (display != null) {
                display.getRealMetrics(this.f16502l);
            }
        } else if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getRealMetrics(this.f16502l);
        }
        if (this.f16502l.widthPixels == 0) {
            this.f16502l = getResources().getDisplayMetrics();
        }
        TextView textView = this.f16503m;
        (textView == null ? null : textView).setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf"));
        if (aVar2 == null || (buttonType = aVar2.f13150d) == null) {
            TypedArray typedArray4 = this.f16504n;
            i15 = (typedArray4 == null ? null : typedArray4).getInt(4, 0);
        } else {
            i15 = buttonType.f437755b;
        }
        if (i15 == 1) {
            TextView textView2 = this.f16503m;
            (textView2 == null ? null : textView2).setTextAppearance(android.R.style.TextAppearance);
        } else {
            TextView textView3 = this.f16503m;
            (textView3 == null ? null : textView3).setTextColor(d.getColor(getContext(), R.color.color_sber_id_button_white));
        }
        TextView textView4 = this.f16503m;
        (textView4 == null ? null : textView4).setAlpha(1.0f);
        TextView textView5 = this.f16503m;
        (textView5 == null ? null : textView5).setAllCaps(false);
        TypedArray typedArray5 = this.f16504n;
        this.f16511u = e(typedArray5 == null ? null : typedArray5);
        u0 u0Var = u0.f406856a;
        setContentDescription(String.format(getResources().getString(R.string.talkback_click_text), Arrays.copyOf(new Object[]{this.f16511u}, 1)));
        if (aVar2 != null) {
            z12 = aVar2.f13154h;
        } else {
            TypedArray typedArray6 = this.f16504n;
            z12 = (typedArray6 == null ? null : typedArray6).getBoolean(1, false);
        }
        this.f16509s = z12;
        setEnabled(!z12);
        this.f16512v = C43259k.d((T) ((D31.g) getCoroutineScopes()).f2881b.getValue(), null, null, new m31.d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final C39499e getAuthAnalytic() {
        return (C39499e) this.f16492b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final InterfaceC50085b getConfigRamStorage() {
        return (InterfaceC50085b) this.f16495e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final D31.a getCoroutineScopes() {
        return (D31.a) this.f16496f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final InterfaceC39835a getGeneralRamStorage() {
        return (InterfaceC39835a) this.f16494d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final e31.g getGlobalAnalytic() {
        return (e31.g) this.f16493c.getValue();
    }

    public final void c() {
        post(new a(this, 1));
        this.f16509s = false;
        N0 n02 = this.f16512v;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f16497g = false;
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f16513w);
        }
        C50040a c50040a = this.f16500j;
        if (c50040a != null) {
            new f(c50040a, this);
        }
    }

    public final int d(int i12) {
        return (int) TypedValue.applyDimension(1, i12, getResources().getDisplayMetrics());
    }

    public final String e(TypedArray typedArray) {
        int i12;
        ButtonText buttonText;
        Pb1.a aVar = this.f16505o;
        if (aVar == null || (buttonText = aVar.f13151e) == null) {
            ButtonText buttonText2 = ButtonText.f437748c;
            i12 = typedArray.getInt(3, 0);
        } else {
            i12 = buttonText.f437751b;
        }
        ButtonText buttonText3 = ButtonText.f437748c;
        return i12 == 1 ? getResources().getString(R.string.login_short_sber_id_logo_text) : i12 == 2 ? getResources().getString(R.string.continue_sber_id_logo_text) : i12 == 3 ? getResources().getString(R.string.fill_sber_id_logo_text) : getResources().getString(R.string.login_sber_id_logo_text);
    }

    public final void f(@l String str) {
        post(new a(this, 1));
        if (str == null || C43066x.K(str) || L.f(C43066x.A0(str).toString(), "null")) {
            return;
        }
        this.f16510t = str;
        ((e.h) getGeneralRamStorage()).f394235h = true;
    }

    public final boolean g() {
        int i12;
        ButtonText buttonText;
        Pb1.a aVar = this.f16505o;
        if (aVar == null || (buttonText = aVar.f13151e) == null) {
            TypedArray typedArray = this.f16504n;
            if (typedArray == null) {
                typedArray = null;
            }
            ButtonText buttonText2 = ButtonText.f437748c;
            i12 = typedArray.getInt(3, 0);
        } else {
            i12 = buttonText.f437751b;
        }
        ButtonText buttonText3 = ButtonText.f437748c;
        return i12 != 1;
    }

    public final void h(Drawable drawable) {
        m mVar = new m(this);
        int i12 = c.f54873h;
        if (drawable != null && (drawable instanceof Animatable)) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(mVar.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(this.f16513w);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        this.f16507q.deleteObservers();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(@Y61.k android.graphics.Canvas r14) throws java.net.SocketException {
        /*
            r13 = this;
            super.onDraw(r14)
            boolean r14 = r13.f16509s
            r0 = 0
            y2.b r1 = r13.f16499i
            if (r14 != 0) goto L1d
            boolean r14 = r1.f442864b
            if (r14 != 0) goto L1d
            android.widget.TextView r14 = r13.f16503m
            if (r14 != 0) goto L13
            r14 = r0
        L13:
            java.lang.CharSequence r14 = r14.getText()
            int r14 = r14.length()
            if (r14 != 0) goto L2d
        L1d:
            android.widget.TextView r14 = r13.f16503m
            if (r14 != 0) goto L22
            goto L23
        L22:
            r0 = r14
        L23:
            android.graphics.drawable.Drawable[] r14 = r0.getCompoundDrawables()
            r0 = 0
            r14 = r14[r0]
            r13.h(r14)
        L2d:
            boolean r14 = r13.f16497g
            if (r14 != 0) goto L79
            boolean r14 = r1.f442864b
            if (r14 != 0) goto L79
            r14 = 1
            r13.f16497g = r14
            d31.e r14 = r13.getAuthAnalytic()
            r14.getClass()
            Yb1.a$f r11 = new Yb1.a$f
            e.a r0 = r14.f393654c
            e.h r0 = (e.h) r0
            java.lang.String r2 = r0.a()
            kotlin.C r1 = y31.c.f442880b
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            f61.a r1 = r14.f393655d
            java.lang.String r5 = r14.a()
            java.lang.String r6 = r0.f394234g
            boolean r0 = r0.f394235h
            if (r0 == 0) goto L62
            java.lang.String r0 = "1"
        L60:
            r7 = r0
            goto L65
        L62:
            java.lang.String r0 = "0"
            goto L60
        L65:
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            java.lang.String r4 = "android_4.0.0"
            java.lang.String r8 = r1.f395679a
            r12 = 0
            r0 = r11
            r1 = r4
            r4 = r8
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            e31.a r14 = r14.f393653b
            r14.a(r11)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ub1.b.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) throws Resources.NotFoundException {
        int i14;
        int i15;
        int iMeasureText;
        Integer num;
        ButtonType buttonType;
        Integer num2;
        Integer num3;
        TypedArray typedArray = this.f16504n;
        TextView textView = this.f16503m;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        Pb1.a aVar = this.f16505o;
        if (aVar != null && (num3 = aVar.f13149c) != null) {
            size2 = d(num3.intValue());
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.min_height);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.max_height);
        if (aVar != null && (num2 = aVar.f13149c) != null) {
            size2 = d(num2.intValue());
        } else if (getLayoutParams().height == -2) {
            size2 = dimensionPixelSize;
        }
        int iMin = Math.min(Math.max(size2, dimensionPixelSize), dimensionPixelSize2);
        TypedArray typedArray2 = typedArray == null ? null : typedArray;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.medium_border_height);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.large_border_height);
        Context context = getContext();
        float f12 = 14.0f;
        if (iMin < dimensionPixelSize3) {
            i14 = R.drawable.ic_anim_sber_logo_16dp;
        } else if (dimensionPixelSize3 > iMin || iMin >= dimensionPixelSize4) {
            f12 = 16.0f;
            i14 = R.drawable.ic_anim_sber_logo_26dp;
        } else {
            i14 = R.drawable.ic_anim_sber_logo_22dp;
        }
        Drawable drawableA = C43852a.a(context, i14);
        if (aVar == null || (buttonType = aVar.f13150d) == null) {
            ButtonType buttonType2 = ButtonType.f437752c;
            i15 = typedArray2.getInt(4, 0);
        } else {
            i15 = buttonType.f437755b;
        }
        ButtonType buttonType3 = ButtonType.f437752c;
        if (i15 == 1) {
            drawableA.mutate().setTint(d.getColor(getContext(), R.color.color_sber_id_button_primary));
        } else {
            drawableA.mutate().setTint(d.getColor(getContext(), R.color.color_sber_id_button_white));
        }
        (textView == null ? null : textView).setTextSize(f12);
        TextPaint paint = (textView == null ? null : textView).getPaint();
        if (paint != null) {
            if (typedArray == null) {
                typedArray = null;
            }
            iMeasureText = (int) paint.measureText(String.valueOf(e(typedArray)));
        } else {
            iMeasureText = 0;
        }
        int intrinsicWidth = (drawableA.getIntrinsicWidth() * 3) + iMeasureText;
        int i16 = this.f16506p;
        int i17 = intrinsicWidth + i16;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i18 = layoutParams.width;
        if (i18 == -1 || i18 == 0) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int iMax = Math.max(marginStart, marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            int marginEnd = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0;
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (Math.max(marginEnd, marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) + iMax > this.f16502l.widthPixels - i17) {
                layoutParams.width = i17;
                setLayoutParams(layoutParams);
            }
        }
        if (aVar != null && (num = aVar.f13148b) != null) {
            size = d(num.intValue());
        } else if (getLayoutParams().width == -2) {
            size = i17;
        }
        this.f16501k = Math.max(size, i17);
        (textView == null ? null : textView).setMaxWidth(Math.max(getWidth(), this.f16501k) - (drawableA.getIntrinsicWidth() * 2));
        if ((textView == null ? null : textView).getCompoundDrawables()[0] == null) {
            (textView == null ? null : textView).setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
            if (!g()) {
                Object obj = (textView == null ? null : textView).getCompoundDrawables()[0];
                Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.start();
                }
                (textView == null ? null : textView).setText(this.f16511u);
                if (textView == null) {
                    textView = null;
                }
                textView.setCompoundDrawablePadding(i16);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f16501k, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    public final void setHideObserver(@k Observer observer) {
        C43874b c43874b = this.f16507q;
        c43874b.addObserver(observer);
        c43874b.hasChanged();
        if (c43874b.hasChanged()) {
            c43874b.notifyObservers();
        }
    }

    public final void setLoaderState(boolean isLoading) {
        this.f16509s = isLoading;
        setEnabled(!isLoading);
        TextView textView = this.f16503m;
        if (textView == null) {
            textView = null;
        }
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (this.f16509s) {
            TransitionManager.beginDelayedTransition(this);
            h(drawable);
            TextView textView2 = this.f16503m;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText((CharSequence) null);
            TextView textView3 = this.f16503m;
            (textView3 != null ? textView3 : null).setCompoundDrawablePadding(0);
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility == 0 && this.f16507q.hasChanged()) {
            return;
        }
        if (((Boolean) ((O51.d) getConfigRamStorage()).f12008e.getValue()).booleanValue()) {
            super.setVisibility(8);
        } else {
            super.setVisibility(visibility);
        }
    }
}

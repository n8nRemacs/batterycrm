package com.avito.android.reputation.ui.items.reputation_progress_bar;

import Hm0.C14007a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: ReputationProgressBar.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001YJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR+\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR+\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR+\u0010!\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR+\u0010,\u001a\u00020&2\u0006\u0010\t\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR+\u00104\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR+\u00108\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR+\u0010<\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u000b\u001a\u0004\b:\u0010\u0004\"\u0004\b;\u0010 R+\u0010@\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u000b\u001a\u0004\b>\u0010\u0004\"\u0004\b?\u0010 R/\u0010F\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010P\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\rR\u001a\u0010R\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010N\u001a\u0004\bQ\u0010\rR\u001a\u0010U\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010\rR\u001a\u0010X\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010N\u001a\u0004\bW\u0010\r¨\u0006Z"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_progress_bar/a;", "Landroid/view/View;", "", "getDeltaCircleX", "()F", "Lkotlin/Q;", "getDeltaRectCoordinates", "()Lkotlin/Q;", "", "<set-?>", "b", "Lkotlin/properties/h;", "getScore", "()I", "setScore", "(I)V", "score", "c", "getLeftColor", "setLeftColor", "leftColor", "d", "getRightColor", "setRightColor", "rightColor", "e", "getTrackColor", "setTrackColor", "trackColor", "f", "getTrackHeight", "setTrackHeight", "(F)V", "trackHeight", "g", "getThreshold", "setThreshold", "threshold", "", "h", "getShowScale", "()Z", "setShowScale", "(Z)V", "showScale", "i", "getFutureScore", "setFutureScore", "futureScore", "j", "getDeltaColor", "setDeltaColor", "deltaColor", "k", "getDeltaBackgroundColor", "setDeltaBackgroundColor", "deltaBackgroundColor", "l", "getDeltaStripWidth", "setDeltaStripWidth", "deltaStripWidth", "m", "getFutureScoreCircleRadius", "setFutureScoreCircleRadius", "futureScoreCircleRadius", "n", "getFutureScoreCircleColor", "()Ljava/lang/Integer;", "setFutureScoreCircleColor", "(Ljava/lang/Integer;)V", "futureScoreCircleColor", "Landroid/graphics/Paint;", "v", "Lkotlin/C;", "getMarkingsPaint", "()Landroid/graphics/Paint;", "markingsPaint", "H", "I", "getGreen200$_avito_reputation_impl", "green200", "getGreen600$_avito_reputation_impl", "green600", "J", "getWarmGray4$_avito_reputation_impl", "warmGray4", "K", "getDeltaBackgroundColorDefault$_avito_reputation_impl", "deltaBackgroundColorDefault", "a", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.reputation.ui.items.reputation_progress_bar.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34407a extends View {

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final C7631a f254913L;

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f254914M;

    /* renamed from: N, reason: collision with root package name */
    public static final int f254915N;

    /* renamed from: O, reason: collision with root package name */
    public static final int f254916O;

    /* renamed from: P, reason: collision with root package name */
    public static final int f254917P;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f254918Q;

    /* renamed from: R, reason: collision with root package name */
    public static final int f254919R;

    /* renamed from: S, reason: collision with root package name */
    public static final int f254920S;

    /* renamed from: T, reason: collision with root package name */
    public static final float f254921T;

    /* renamed from: U, reason: collision with root package name */
    public static final int f254922U;

    /* renamed from: A, reason: collision with root package name */
    public float f254923A;

    /* renamed from: B, reason: collision with root package name */
    public float f254924B;

    /* renamed from: C, reason: collision with root package name */
    public final int f254925C;

    /* renamed from: D, reason: collision with root package name */
    public final int f254926D;

    /* renamed from: E, reason: collision with root package name */
    public final int f254927E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Path f254928F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f254929G;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final int green200;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public final int green600;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final int warmGray4;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public final int deltaBackgroundColorDefault;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f254934b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f254935c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f254936d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final j f254937e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f254938f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final j f254939g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f254940h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final j f254941i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final j f254942j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final j f254943k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final j f254944l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final j f254945m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final j f254946n;

    /* renamed from: o, reason: collision with root package name */
    public float f254947o;

    /* renamed from: p, reason: collision with root package name */
    public float f254948p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final RectF f254949q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Paint f254950r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Paint f254951s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Paint f254952t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Paint f254953u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C markingsPaint;

    /* renamed from: w, reason: collision with root package name */
    public float f254955w;

    /* renamed from: x, reason: collision with root package name */
    public float f254956x;

    /* renamed from: y, reason: collision with root package name */
    public int f254957y;

    /* renamed from: z, reason: collision with root package name */
    public int f254958z;

    /* compiled from: ReputationProgressBar.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_progress_bar/a$a;", "", "<init>", "()V", "", "DELTA_STRIP_ANGLE", "F", "DELTA_STRIP_MULTIPLIER", "DELTA_WIDE_STRIP_WIDTH", "FUTURE_SCORE_INNER_CIRCLE_MULTIPLIER", "", "FUTURE_SCORE_NOT_SET", "I", "", "SCALE_END_VALUE", "Ljava/lang/String;", "SCALE_MARGIN", "SCALE_START_VALUE", "THRESHOLD_DEFAULT", "THRESHOLD_GAP", "THRESHOLD_HEIGHT_DIVIDER", "THRESHOLD_RADIUS", "THRESHOLD_START_MARGIN", "THRESHOLD_WIDTH", "TRACK_HEIGHT", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.reputation.ui.items.reputation_progress_bar.a$a, reason: collision with other inner class name */
    public static final class C7631a {
        public /* synthetic */ C7631a(C42822w c42822w) {
            this();
        }

        public C7631a() {
        }
    }

    static {
        Y y12 = new Y(C34407a.class, "score", "getScore()I", 0);
        n0 n0Var = m0.f406844a;
        f254914M = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "leftColor", "getLeftColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "rightColor", "getRightColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "trackColor", "getTrackColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "trackHeight", "getTrackHeight()F", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "threshold", "getThreshold()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "showScale", "getShowScale()Z", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "futureScore", "getFutureScore()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "deltaColor", "getDeltaColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "deltaBackgroundColor", "getDeltaBackgroundColor()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "deltaStripWidth", "getDeltaStripWidth()F", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "futureScoreCircleRadius", "getFutureScoreCircleRadius()F", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(C34407a.class, "futureScoreCircleColor", "getFutureScoreCircleColor()Ljava/lang/Integer;", 0, n0Var)};
        f254913L = new C7631a(null);
        f254915N = y6.b(1);
        f254916O = y6.b(3);
        f254917P = y6.b(2);
        f254918Q = y6.b(10);
        f254919R = y6.b(12);
        f254920S = y6.b(12);
        f254921T = y6.b(3);
        f254922U = Color.parseColor("#7CF782");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34407a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.reputationProgressBar : i12;
        super(context, attributeSet, i12, 0);
        this.f254934b = new j(0, this, new l(this));
        this.f254935c = new j(0, this, new h(this));
        this.f254936d = new j(0, this, new k(this));
        this.f254937e = new j(0, this, new o(this));
        this.f254938f = new j(Float.valueOf(f254920S), this, new p(this));
        this.f254939g = new j(40, this, new n(this));
        this.f254940h = new j(Boolean.FALSE, this, new m(this));
        this.f254941i = new j(-1, this, new e(this));
        this.f254942j = new j(0, this, new c(this));
        this.f254943k = new j(0, this, new C34408b(this));
        float f12 = f254921T;
        this.f254944l = new j(Float.valueOf(f12), this, new d(this));
        this.f254945m = new j(Float.valueOf(0.0f), this, new g(this));
        this.f254946n = new j(0, this, new f(this));
        this.f254949q = new RectF();
        this.f254950r = new Paint(1);
        this.f254951s = new Paint(1);
        this.f254952t = new Paint(1);
        this.f254953u = new Paint(1);
        this.markingsPaint = C42727D.c(new i(context));
        int iD2 = C35835l0.d(R.attr.constantWhite, context);
        this.f254925C = C35835l0.d(R.attr.white, context);
        this.f254926D = iD2;
        this.f254927E = C35835l0.d(R.attr.gray36, context);
        this.f254928F = new Path();
        int iD3 = C35835l0.d(R.attr.green200, context);
        this.green200 = iD3;
        this.green600 = C35835l0.d(R.attr.green600, context);
        int iD4 = C35835l0.d(R.attr.warmGray4, context);
        this.warmGray4 = iD4;
        int iD5 = C35835l0.d(R.attr.transparentWhite, context);
        this.deltaBackgroundColorDefault = iD5;
        int iD6 = C35835l0.d(R.attr.green600, context);
        int iD7 = C35835l0.d(R.attr.orange200, context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14007a.e.f7690c, i12, 0);
        int i14 = typedArrayObtainStyledAttributes.getInt(9, 1);
        setScore(i14 <= 0 ? 1 : i14);
        setFutureScore(typedArrayObtainStyledAttributes.getInt(3, -1));
        setDeltaStripWidth(typedArrayObtainStyledAttributes.getDimension(2, f12));
        setLeftColor(typedArrayObtainStyledAttributes.getColor(7, iD3));
        setRightColor(typedArrayObtainStyledAttributes.getColor(8, iD6));
        setDeltaColor(typedArrayObtainStyledAttributes.getColor(1, f254922U));
        setDeltaBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, iD5));
        setTrackColor(typedArrayObtainStyledAttributes.getColor(11, iD4));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimension(12, getTrackHeight()));
        setThreshold(typedArrayObtainStyledAttributes.getInt(10, getThreshold()));
        setShowScale(typedArrayObtainStyledAttributes.getBoolean(6, getShowScale()));
        setFutureScoreCircleRadius(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        setFutureScoreCircleColor(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(4, iD7)));
        typedArrayObtainStyledAttributes.recycle();
        this.f254929G = true;
    }

    private final float getDeltaCircleX() {
        return getFutureScoreCircleRadius() + this.f254956x > ((float) getWidth()) ? getWidth() - getFutureScoreCircleRadius() : this.f254956x - getFutureScoreCircleRadius() < 0.0f ? getFutureScoreCircleRadius() : this.f254956x;
    }

    private final Q<Float, Float> getDeltaRectCoordinates() {
        float f12 = this.f254955w;
        float f13 = this.f254956x;
        return f12 >= f13 ? new Q<>(Float.valueOf(f13), Float.valueOf(this.f254955w)) : new Q<>(Float.valueOf(f12), Float.valueOf(this.f254956x));
    }

    private final Paint getMarkingsPaint() {
        return (Paint) this.markingsPaint.getValue();
    }

    public final int getDeltaBackgroundColor() {
        return ((Number) this.f254943k.getValue(this, f254914M[9])).intValue();
    }

    /* renamed from: getDeltaBackgroundColorDefault$_avito_reputation_impl, reason: from getter */
    public final int getDeltaBackgroundColorDefault() {
        return this.deltaBackgroundColorDefault;
    }

    public final int getDeltaColor() {
        return ((Number) this.f254942j.getValue(this, f254914M[8])).intValue();
    }

    public final float getDeltaStripWidth() {
        return ((Number) this.f254944l.getValue(this, f254914M[10])).floatValue();
    }

    public final int getFutureScore() {
        return ((Number) this.f254941i.getValue(this, f254914M[7])).intValue();
    }

    @Y61.l
    public final Integer getFutureScoreCircleColor() {
        return (Integer) this.f254946n.getValue(this, f254914M[12]);
    }

    public final float getFutureScoreCircleRadius() {
        return ((Number) this.f254945m.getValue(this, f254914M[11])).floatValue();
    }

    /* renamed from: getGreen200$_avito_reputation_impl, reason: from getter */
    public final int getGreen200() {
        return this.green200;
    }

    /* renamed from: getGreen600$_avito_reputation_impl, reason: from getter */
    public final int getGreen600() {
        return this.green600;
    }

    public final int getLeftColor() {
        return ((Number) this.f254935c.getValue(this, f254914M[1])).intValue();
    }

    public final int getRightColor() {
        return ((Number) this.f254936d.getValue(this, f254914M[2])).intValue();
    }

    public final int getScore() {
        return ((Number) this.f254934b.getValue(this, f254914M[0])).intValue();
    }

    public final boolean getShowScale() {
        return ((Boolean) this.f254940h.getValue(this, f254914M[6])).booleanValue();
    }

    public final int getThreshold() {
        return ((Number) this.f254939g.getValue(this, f254914M[5])).intValue();
    }

    public final int getTrackColor() {
        return ((Number) this.f254937e.getValue(this, f254914M[3])).intValue();
    }

    public final float getTrackHeight() {
        return ((Number) this.f254938f.getValue(this, f254914M[4])).floatValue();
    }

    /* renamed from: getWarmGray4$_avito_reputation_impl, reason: from getter */
    public final int getWarmGray4() {
        return this.warmGray4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0115  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invalidate() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.items.reputation_progress_bar.C34407a.invalidate():void");
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f254949q;
        rectF.top = 0.0f;
        rectF.bottom = getTrackHeight();
        rectF.left = 0.0f;
        rectF.right = getWidth();
        Path path = this.f254928F;
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            rectF.left = 0.0f;
            rectF.right = this.f254955w;
            canvas.drawRect(rectF, this.f254950r);
            rectF.left = this.f254955w;
            rectF.right = canvas.getWidth();
            canvas.drawRect(rectF, this.f254951s);
            if (getFutureScore() != -1) {
                Q<Float, Float> deltaRectCoordinates = getDeltaRectCoordinates();
                rectF.left = deltaRectCoordinates.f406619b.floatValue();
                rectF.right = deltaRectCoordinates.f406620c.floatValue();
                canvas.drawRect(rectF, this.f254952t);
            }
            canvas.restoreToCount(iSave);
            Integer futureScoreCircleColor = getFutureScoreCircleColor();
            if (getFutureScoreCircleRadius() != 0.0f && getFutureScore() != -1 && futureScoreCircleColor != null) {
                Paint paint = this.f254953u;
                paint.setColor(this.f254925C);
                canvas.drawCircle(getDeltaCircleX(), getTrackHeight(), getFutureScoreCircleRadius(), paint);
                paint.setColor(futureScoreCircleColor.intValue());
                canvas.drawCircle(getDeltaCircleX(), getTrackHeight(), getFutureScoreCircleRadius() * 0.66f, paint);
            }
            float f12 = this.f254924B;
            rectF.left = f12;
            rectF.right = f12 + f254916O;
            float trackHeight = getTrackHeight();
            float f13 = this.f254947o;
            rectF.top = (trackHeight - f13) / 2;
            rectF.bottom = rectF.top + f13;
            int i12 = f254917P;
            canvas.drawRoundRect(rectF, i12, i12, getMarkingsPaint());
            if (getShowScale()) {
                canvas.drawText("0", f254919R, this.f254923A, getMarkingsPaint());
                canvas.drawText("100", (getWidth() - this.f254957y) - r0, this.f254923A, getMarkingsPaint());
                canvas.drawText(String.valueOf(getThreshold()), (this.f254924B - this.f254958z) - f254918Q, this.f254923A, getMarkingsPaint());
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(View.MeasureSpec.getSize(i12), View.MeasureSpec.getMode(i13) == 1073741824 ? View.MeasureSpec.getSize(i13) : ((int) getTrackHeight()) + ((int) getFutureScoreCircleRadius()));
    }

    public final void setDeltaBackgroundColor(int i12) {
        this.f254943k.setValue(this, f254914M[9], Integer.valueOf(i12));
    }

    public final void setDeltaColor(int i12) {
        this.f254942j.setValue(this, f254914M[8], Integer.valueOf(i12));
    }

    public final void setDeltaStripWidth(float f12) {
        this.f254944l.setValue(this, f254914M[10], Float.valueOf(f12));
    }

    public final void setFutureScore(int i12) {
        this.f254941i.setValue(this, f254914M[7], Integer.valueOf(i12));
    }

    public final void setFutureScoreCircleColor(@Y61.l Integer num) {
        this.f254946n.setValue(this, f254914M[12], num);
    }

    public final void setFutureScoreCircleRadius(float f12) {
        this.f254945m.setValue(this, f254914M[11], Float.valueOf(f12));
    }

    public final void setLeftColor(int i12) {
        this.f254935c.setValue(this, f254914M[1], Integer.valueOf(i12));
    }

    public final void setRightColor(int i12) {
        this.f254936d.setValue(this, f254914M[2], Integer.valueOf(i12));
    }

    public final void setScore(int i12) {
        this.f254934b.setValue(this, f254914M[0], Integer.valueOf(i12));
    }

    public final void setShowScale(boolean z12) {
        this.f254940h.setValue(this, f254914M[6], Boolean.valueOf(z12));
    }

    public final void setThreshold(int i12) {
        this.f254939g.setValue(this, f254914M[5], Integer.valueOf(i12));
    }

    public final void setTrackColor(int i12) {
        this.f254937e.setValue(this, f254914M[3], Integer.valueOf(i12));
    }

    public final void setTrackHeight(float f12) {
        this.f254938f.setValue(this, f254914M[4], Float.valueOf(f12));
    }
}

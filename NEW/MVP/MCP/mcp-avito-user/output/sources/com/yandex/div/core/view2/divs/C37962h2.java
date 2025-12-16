package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.C19960l0;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.core.view2.divs.C37955g.b;
import com.yandex.div.core.widget.C38045a;
import com.yandex.div.core.widget.ViewOnAttachStateChangeListenerC38046b;
import com.yandex.div.core.widget.ViewTreeObserverOnPreDrawListenerC38047c;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.b;
import com.yandex.div.internal.spannable.BitmapImageSpan;
import com.yandex.div.internal.widget.menu.c;
import com.yandex.div2.AbstractC38564t7;
import com.yandex.div2.AbstractC38582v7;
import com.yandex.div2.C38269b7;
import com.yandex.div2.C38371h6;
import com.yandex.div2.C38502q1;
import com.yandex.div2.C38600x7;
import com.yandex.div2.C38656z6;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.F4;
import com.yandex.div2.G4;
import com.yandex.div2.I4;
import com.yandex.div2.M4;
import com.yandex.div2.O4;
import com.yandex.div2.S3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;
import v21.C49153a;

/* compiled from: DivTextBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/h2;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/b7;", "Lcom/yandex/div/core/view2/divs/widgets/k;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.h2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37962h2 implements com.yandex.div.core.view2.N<C38269b7, com.yandex.div.core.view2.divs.widgets.k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368464a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.J f368465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v21.c f368466c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f368467d;

    /* compiled from: DivTextBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.h2$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            int[] iArr2 = new int[DivLineStyle.values().length];
            iArr2[1] = 1;
            iArr2[0] = 2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            iArr3[1] = 1;
            iArr3[0] = 2;
            iArr3[3] = 3;
            iArr3[2] = 4;
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.h2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<CharSequence, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.internal.widget.e f368487l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.yandex.div.internal.widget.e eVar) {
            super(1);
            this.f368487l = eVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(CharSequence charSequence) {
            this.f368487l.setEllipsis(charSequence);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.h2$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<CharSequence, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextView f368488l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextView textView) {
            super(1);
            this.f368488l = textView;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(CharSequence charSequence) {
            this.f368488l.setText(charSequence, TextView.BufferType.NORMAL);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.h2$e */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f368489b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC38564t7 f368490c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368491d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C37962h2 f368492e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f368493f;

        public e(TextView textView, AbstractC38564t7 abstractC38564t7, com.yandex.div.json.expressions.e eVar, C37962h2 c37962h2, DisplayMetrics displayMetrics) {
            this.f368489b = textView;
            this.f368490c = abstractC38564t7;
            this.f368491d = eVar;
            this.f368492e = c37962h2;
            this.f368493f = displayMetrics;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            TextView textView = this.f368489b;
            TextPaint paint = textView.getPaint();
            Shader shaderB = null;
            AbstractC38564t7 abstractC38564t7 = this.f368490c;
            Object objA = abstractC38564t7 == null ? null : abstractC38564t7.a();
            boolean z12 = objA instanceof S3;
            com.yandex.div.json.expressions.e eVar = this.f368491d;
            if (z12) {
                b.a aVar = com.yandex.div.internal.drawable.b.f370102e;
                S3 s32 = (S3) objA;
                float fLongValue = s32.f373506a.a(eVar).longValue();
                int[] iArrL0 = C42745f0.L0(s32.f373507b.a(eVar));
                int width = textView.getWidth();
                int height = textView.getHeight();
                aVar.getClass();
                shaderB = b.a.a(fLongValue, iArrL0, width, height);
            } else if (objA instanceof F4) {
                RadialGradientDrawable.b bVar = RadialGradientDrawable.f370046g;
                F4 f42 = (F4) objA;
                M4 m42 = f42.f372279d;
                C37962h2 c37962h2 = this.f368492e;
                DisplayMetrics displayMetrics = this.f368493f;
                RadialGradientDrawable.Radius radiusB = C37962h2.b(c37962h2, m42, displayMetrics, eVar);
                RadialGradientDrawable.a aVarA = C37962h2.a(c37962h2, f42.f372276a, displayMetrics, eVar);
                RadialGradientDrawable.a aVarA2 = C37962h2.a(c37962h2, f42.f372277b, displayMetrics, eVar);
                int[] iArrL02 = C42745f0.L0(f42.f372278c.a(eVar));
                int width2 = textView.getWidth();
                int height2 = textView.getHeight();
                bVar.getClass();
                shaderB = RadialGradientDrawable.b.b(radiusB, aVarA, aVarA2, iArrL02, width2, height2);
            }
            paint.setShader(shaderB);
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivLineStyle;", "underline", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivLineStyle;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.h2$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<DivLineStyle, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368495m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.yandex.div.core.view2.divs.widgets.k kVar) {
            super(1);
            this.f368495m = kVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivLineStyle divLineStyle) {
            C37962h2.this.getClass();
            int iOrdinal = divLineStyle.ordinal();
            com.yandex.div.core.view2.divs.widgets.k kVar = this.f368495m;
            if (iOrdinal == 0) {
                kVar.setPaintFlags(kVar.getPaintFlags() & (-9));
            } else if (iOrdinal == 1) {
                kVar.setPaintFlags(kVar.getPaintFlags() | 8);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivLineStyle;", "strike", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivLineStyle;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.h2$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<DivLineStyle, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368497m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.yandex.div.core.view2.divs.widgets.k kVar) {
            super(1);
            this.f368497m = kVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivLineStyle divLineStyle) {
            C37962h2.this.getClass();
            int iOrdinal = divLineStyle.ordinal();
            com.yandex.div.core.view2.divs.widgets.k kVar = this.f368497m;
            if (iOrdinal == 0) {
                kVar.setPaintFlags(kVar.getPaintFlags() & (-17));
            } else if (iOrdinal == 1) {
                kVar.setPaintFlags(kVar.getPaintFlags() | 16);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectable", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.h2$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.k f368499m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.yandex.div.core.view2.divs.widgets.k kVar) {
            super(1);
            this.f368499m = kVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C37962h2.this.getClass();
            this.f368499m.setTextIsSelectable(zBooleanValue);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C37962h2(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.view2.J j12, @Y61.k v21.c cVar, @com.yandex.div.core.dagger.B boolean z12) {
        this.f368464a = c38006w;
        this.f368465b = j12;
        this.f368466c = cVar;
        this.f368467d = z12;
    }

    public static final RadialGradientDrawable.a a(C37962h2 c37962h2, G4 g42, DisplayMetrics displayMetrics, com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.b bVar;
        c37962h2.getClass();
        g42.getClass();
        if (g42 instanceof G4.c) {
            bVar = ((G4.c) g42).f372485c;
        } else {
            if (!(g42 instanceof G4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ((G4.d) g42).f372486c;
        }
        if (bVar instanceof I4) {
            return new RadialGradientDrawable.a.C10924a(C37931a.p(((I4) bVar).f372588b.a(eVar), displayMetrics));
        }
        if (bVar instanceof O4) {
            return new RadialGradientDrawable.a.b((float) ((O4) bVar).f373132a.a(eVar).doubleValue());
        }
        return null;
    }

    public static final RadialGradientDrawable.Radius b(C37962h2 c37962h2, M4 m42, DisplayMetrics displayMetrics, com.yandex.div.json.expressions.e eVar) {
        com.yandex.div.json.b bVar;
        RadialGradientDrawable.Radius.Relative.Type type;
        c37962h2.getClass();
        m42.getClass();
        if (m42 instanceof M4.c) {
            bVar = ((M4.c) m42).f372802c;
        } else {
            if (!(m42 instanceof M4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ((M4.d) m42).f372803c;
        }
        if (bVar instanceof C38502q1) {
            return new RadialGradientDrawable.Radius.a(C37931a.p(((C38502q1) bVar).f376152b.a(eVar), displayMetrics));
        }
        if (!(bVar instanceof DivRadialGradientRelativeRadius)) {
            return null;
        }
        int iOrdinal = ((DivRadialGradientRelativeRadius) bVar).f371864a.a(eVar).ordinal();
        if (iOrdinal == 0) {
            type = RadialGradientDrawable.Radius.Relative.Type.f370054b;
        } else if (iOrdinal == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.f370055c;
        } else if (iOrdinal == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.f370056d;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.f370057e;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    public static void d(com.yandex.div.core.view2.divs.widgets.k kVar, com.yandex.div.json.expressions.e eVar, C38269b7 c38269b7) {
        int i12;
        long jLongValue = c38269b7.f374589s.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            i12 = (int) jLongValue;
        } else {
            int i13 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        int iOrdinal = c38269b7.f374590t.a(eVar).ordinal();
        int i14 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i14 = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = 0;
            }
        }
        float f12 = i12;
        kVar.setTextSize(i14, f12);
        kVar.setLetterSpacing(((float) c38269b7.f374595y.a(eVar).doubleValue()) / f12);
    }

    public static void f(com.yandex.div.core.view2.divs.widgets.k kVar, com.yandex.div.json.expressions.e eVar, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2) {
        int i12;
        C38045a adaptiveMaxLines = kVar.getAdaptiveMaxLines();
        if (adaptiveMaxLines != null) {
            ViewOnAttachStateChangeListenerC38046b viewOnAttachStateChangeListenerC38046b = adaptiveMaxLines.f369246b;
            if (viewOnAttachStateChangeListenerC38046b != null) {
                adaptiveMaxLines.f369245a.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC38046b);
            }
            adaptiveMaxLines.f369246b = null;
            adaptiveMaxLines.a();
        }
        Long l12 = bVar == null ? null : (Long) bVar.a(eVar);
        Long l13 = bVar2 != null ? (Long) bVar2.a(eVar) : null;
        int i13 = BeduinInputModel.MIN_TEXT_VERSION;
        int i14 = Integer.MAX_VALUE;
        if (l12 == null || l13 == null) {
            if (l12 != null) {
                long jLongValue = l12.longValue();
                long j12 = jLongValue >> 31;
                if (j12 == 0 || j12 == -1) {
                    i13 = (int) jLongValue;
                } else {
                    int i15 = com.yandex.div.internal.n.f370123a;
                    if (jLongValue > 0) {
                        i13 = Integer.MAX_VALUE;
                    }
                }
                i14 = i13;
            }
            kVar.setMaxLines(i14);
            return;
        }
        C38045a c38045a = new C38045a(kVar);
        long jLongValue2 = l12.longValue();
        long j13 = jLongValue2 >> 31;
        if (j13 == 0 || j13 == -1) {
            i12 = (int) jLongValue2;
        } else {
            int i16 = com.yandex.div.internal.n.f370123a;
            i12 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = l13.longValue();
        long j14 = jLongValue3 >> 31;
        if (j14 == 0 || j14 == -1) {
            i13 = (int) jLongValue3;
        } else {
            int i17 = com.yandex.div.internal.n.f370123a;
            if (jLongValue3 > 0) {
                i13 = Integer.MAX_VALUE;
            }
        }
        C38045a.C10888a c10888a = new C38045a.C10888a(i12, i13);
        if (!kotlin.jvm.internal.L.f(c38045a.f369248d, c10888a)) {
            c38045a.f369248d = c10888a;
            WeakHashMap<View, androidx.core.view.A0> weakHashMap = C22823h0.f45055a;
            if (kVar.isAttachedToWindow() && c38045a.f369247c == null) {
                ViewTreeObserverOnPreDrawListenerC38047c viewTreeObserverOnPreDrawListenerC38047c = new ViewTreeObserverOnPreDrawListenerC38047c(c38045a);
                kVar.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC38047c);
                c38045a.f369247c = viewTreeObserverOnPreDrawListenerC38047c;
            }
            if (c38045a.f369246b == null) {
                ViewOnAttachStateChangeListenerC38046b viewOnAttachStateChangeListenerC38046b2 = new ViewOnAttachStateChangeListenerC38046b(c38045a);
                kVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC38046b2);
                c38045a.f369246b = viewOnAttachStateChangeListenerC38046b2;
            }
        }
        kVar.setAdaptiveMaxLines$div_release(c38045a);
    }

    public static void h(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(C37931a.r(divAlignmentHorizontal, divAlignmentVertical));
        int iOrdinal = divAlignmentHorizontal.ordinal();
        int i12 = 5;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i12 = 4;
            } else if (iOrdinal == 2) {
                i12 = 6;
            }
        }
        textView.setTextAlignment(i12);
    }

    public final void c(com.yandex.div.internal.widget.e eVar, C38029k c38029k, com.yandex.div.json.expressions.e eVar2, C38269b7 c38269b7) {
        C38269b7.m mVar = c38269b7.f374584n;
        if (mVar == null) {
            return;
        }
        a aVar = new a(c38029k, eVar, eVar2, mVar.f374617d.a(eVar2), c38269b7.f374589s.a(eVar2).longValue(), c38269b7.f374588r.a(eVar2), mVar.f374616c, mVar.f374614a, mVar.f374615b);
        aVar.f368480m = new c(eVar);
        aVar.a();
    }

    public final void e(TextView textView, com.yandex.div.json.expressions.e eVar, C38269b7 c38269b7) {
        int hyphenationFrequency = textView.getHyphenationFrequency();
        int i12 = 0;
        if (this.f368467d && TextUtils.indexOf((CharSequence) c38269b7.f374555K.a(eVar), (char) 173, 0, Math.min(c38269b7.f374555K.a(eVar).length(), 10)) > 0) {
            i12 = 1;
        }
        if (hyphenationFrequency != i12) {
            textView.setHyphenationFrequency(i12);
        }
    }

    public final void g(TextView textView, C38029k c38029k, com.yandex.div.json.expressions.e eVar, C38269b7 c38269b7) {
        a aVar = new a(c38029k, textView, eVar, c38269b7.f374555K.a(eVar), c38269b7.f374589s.a(eVar).longValue(), c38269b7.f374588r.a(eVar), c38269b7.f374550F, null, c38269b7.f374594x);
        aVar.f368480m = new d(textView);
        aVar.a();
    }

    public final void i(TextView textView, com.yandex.div.json.expressions.e eVar, AbstractC38564t7 abstractC38564t7) {
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        if (!com.yandex.div.core.util.q.b(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new e(textView, abstractC38564t7, eVar, this, displayMetrics));
            return;
        }
        TextPaint paint = textView.getPaint();
        Shader shaderB = null;
        Object objA = abstractC38564t7 == null ? null : abstractC38564t7.a();
        if (objA instanceof S3) {
            b.a aVar = com.yandex.div.internal.drawable.b.f370102e;
            S3 s32 = (S3) objA;
            float fLongValue = s32.f373506a.a(eVar).longValue();
            int[] iArrL0 = C42745f0.L0(s32.f373507b.a(eVar));
            int width = textView.getWidth();
            int height = textView.getHeight();
            aVar.getClass();
            shaderB = b.a.a(fLongValue, iArrL0, width, height);
        } else if (objA instanceof F4) {
            RadialGradientDrawable.b bVar = RadialGradientDrawable.f370046g;
            F4 f42 = (F4) objA;
            RadialGradientDrawable.Radius radiusB = b(this, f42.f372279d, displayMetrics, eVar);
            RadialGradientDrawable.a aVarA = a(this, f42.f372276a, displayMetrics, eVar);
            RadialGradientDrawable.a aVarA2 = a(this, f42.f372277b, displayMetrics, eVar);
            int[] iArrL02 = C42745f0.L0(f42.f372278c.a(eVar));
            int width2 = textView.getWidth();
            int height2 = textView.getHeight();
            bVar.getClass();
            shaderB = RadialGradientDrawable.b.b(radiusB, aVarA, aVarA2, iArrL02, width2, height2);
        }
        paint.setShader(shaderB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(@Y61.k com.yandex.div.core.view2.divs.widgets.k kVar, @Y61.k C38269b7 c38269b7, @Y61.k C38029k c38029k) {
        com.yandex.div.json.expressions.b<Long> bVar;
        com.yandex.div.json.expressions.b<Long> bVar2;
        C38371h6 c38371h6;
        C38656z6 c38656z6;
        com.yandex.div.json.expressions.b<Integer> bVar3;
        C38656z6 c38656z62;
        com.yandex.div.json.expressions.b<Long> bVar4;
        C38269b7 div = kVar.getDiv();
        if (c38269b7.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        kVar.g();
        kVar.setDiv$div_release(c38269b7);
        C38006w c38006w = this.f368464a;
        if (div != null) {
            c38006w.h(c38029k, kVar, div);
        }
        c38006w.d(kVar, c38269b7, div, c38029k);
        C37931a.c(kVar, c38029k, c38269b7.f374572b, c38269b7.f374574d, c38269b7.f374545A, c38269b7.f374583m, c38269b7.f374573c);
        com.yandex.div.json.expressions.b<DivFontFamily> bVar5 = c38269b7.f374588r;
        DivFontFamily divFontFamilyA = bVar5.a(expressionResolver);
        com.yandex.div.json.expressions.b<DivFontWeight> bVar6 = c38269b7.f374591u;
        kVar.setTypeface(this.f368465b.a(divFontFamilyA, bVar6.a(expressionResolver)));
        u2 u2Var = new u2(this, kVar, expressionResolver, c38269b7);
        kVar.e(bVar5.d(expressionResolver, u2Var));
        kVar.e(bVar6.d(expressionResolver, u2Var));
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar7 = c38269b7.f374556L;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar7.a(expressionResolver);
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar8 = c38269b7.f374557M;
        h(kVar, divAlignmentHorizontalA, bVar8.a(expressionResolver));
        o2 o2Var = new o2(this, kVar, bVar7, bVar8, expressionResolver);
        kVar.e(bVar7.d(expressionResolver, o2Var));
        kVar.e(bVar8.d(expressionResolver, o2Var));
        d(kVar, expressionResolver, c38269b7);
        C37970j2 c37970j2 = new C37970j2(this, kVar, expressionResolver, c38269b7);
        kVar.e(c38269b7.f374589s.d(expressionResolver, c37970j2));
        kVar.e(c38269b7.f374595y.d(expressionResolver, c37970j2));
        com.yandex.div.json.expressions.b<Long> bVar9 = c38269b7.f374596z;
        if (bVar9 == null) {
            C37931a.e(kVar, null, c38269b7.f374590t.a(expressionResolver));
        } else {
            kVar.e(bVar9.e(expressionResolver, new k2(kVar, expressionResolver, c38269b7)));
        }
        l0.f fVar = new l0.f();
        com.yandex.div.json.expressions.b<Integer> bVar10 = c38269b7.f374558N;
        fVar.f406840b = bVar10.a(expressionResolver).intValue();
        l0.h hVar = new l0.h();
        com.yandex.div.json.expressions.b<Integer> bVar11 = c38269b7.f374587q;
        hVar.f406842b = bVar11 == null ? 0 : bVar11.a(expressionResolver);
        r2 r2Var = new r2(kVar, hVar, fVar);
        r2Var.invoke();
        bVar10.d(expressionResolver, new p2(fVar, r2Var));
        if (bVar11 != null) {
            bVar11.d(expressionResolver, new q2(r2Var, hVar));
        }
        kVar.e(c38269b7.f374566V.e(expressionResolver, new f(kVar)));
        kVar.e(c38269b7.f374554J.e(expressionResolver, new g(kVar)));
        com.yandex.div.json.expressions.b<Long> bVar12 = c38269b7.f374547C;
        com.yandex.div.json.expressions.b<Long> bVar13 = c38269b7.f374548D;
        f(kVar, expressionResolver, bVar12, bVar13);
        l2 l2Var = new l2(this, kVar, bVar12, bVar13, expressionResolver);
        C38269b7 div2 = kVar.getDiv();
        InterfaceC37911f interfaceC37911fD = (div2 == null || (bVar = div2.f374547C) == null) ? null : bVar.d(expressionResolver, l2Var);
        if (interfaceC37911fD == null) {
            interfaceC37911fD = InterfaceC37911f.f367528l2;
        }
        kVar.e(interfaceC37911fD);
        C38269b7 div3 = kVar.getDiv();
        InterfaceC37911f interfaceC37911fD2 = (div3 == null || (bVar2 = div3.f374548D) == null) ? null : bVar2.d(expressionResolver, l2Var);
        if (interfaceC37911fD2 == null) {
            interfaceC37911fD2 = InterfaceC37911f.f367528l2;
        }
        kVar.e(interfaceC37911fD2);
        List<C38269b7.o> list = c38269b7.f374550F;
        com.yandex.div.json.expressions.b<String> bVar14 = c38269b7.f374555K;
        List<C38269b7.n> list2 = c38269b7.f374594x;
        if (list == null && list2 == null) {
            kVar.setText(bVar14.a(expressionResolver));
            e(kVar, expressionResolver, c38269b7);
            kVar.e(bVar14.d(expressionResolver, new t2(this, kVar, expressionResolver, c38269b7)));
        } else {
            g(kVar, c38029k, expressionResolver, c38269b7);
            e(kVar, expressionResolver, c38269b7);
            kVar.e(bVar14.d(expressionResolver, new m2(this, kVar, c38029k, expressionResolver, c38269b7)));
            n2 n2Var = new n2(this, kVar, c38029k, expressionResolver, c38269b7);
            if (list != null) {
                for (C38269b7.o oVar : list) {
                    kVar.e(oVar.f374657j.d(expressionResolver, n2Var));
                    kVar.e(oVar.f374651d.d(expressionResolver, n2Var));
                    com.yandex.div.json.expressions.b<Long> bVar15 = oVar.f374652e;
                    InterfaceC37911f interfaceC37911fD3 = bVar15 == null ? null : bVar15.d(expressionResolver, n2Var);
                    if (interfaceC37911fD3 == null) {
                        interfaceC37911fD3 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD3);
                    kVar.e(oVar.f374653f.d(expressionResolver, n2Var));
                    com.yandex.div.json.expressions.b<DivFontWeight> bVar16 = oVar.f374654g;
                    InterfaceC37911f interfaceC37911fD4 = bVar16 == null ? null : bVar16.d(expressionResolver, n2Var);
                    if (interfaceC37911fD4 == null) {
                        interfaceC37911fD4 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD4);
                    com.yandex.div.json.expressions.b<Double> bVar17 = oVar.f374655h;
                    InterfaceC37911f interfaceC37911fD5 = bVar17 == null ? null : bVar17.d(expressionResolver, n2Var);
                    if (interfaceC37911fD5 == null) {
                        interfaceC37911fD5 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD5);
                    com.yandex.div.json.expressions.b<Long> bVar18 = oVar.f374656i;
                    InterfaceC37911f interfaceC37911fD6 = bVar18 == null ? null : bVar18.d(expressionResolver, n2Var);
                    if (interfaceC37911fD6 == null) {
                        interfaceC37911fD6 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD6);
                    com.yandex.div.json.expressions.b<DivLineStyle> bVar19 = oVar.f374658k;
                    InterfaceC37911f interfaceC37911fD7 = bVar19 == null ? null : bVar19.d(expressionResolver, n2Var);
                    if (interfaceC37911fD7 == null) {
                        interfaceC37911fD7 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD7);
                    com.yandex.div.json.expressions.b<Integer> bVar20 = oVar.f374659l;
                    InterfaceC37911f interfaceC37911fD8 = bVar20 == null ? null : bVar20.d(expressionResolver, n2Var);
                    if (interfaceC37911fD8 == null) {
                        interfaceC37911fD8 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD8);
                    com.yandex.div.json.expressions.b<Long> bVar21 = oVar.f374660m;
                    InterfaceC37911f interfaceC37911fD9 = bVar21 == null ? null : bVar21.d(expressionResolver, n2Var);
                    if (interfaceC37911fD9 == null) {
                        interfaceC37911fD9 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD9);
                    com.yandex.div.json.expressions.b<DivLineStyle> bVar22 = oVar.f374661n;
                    InterfaceC37911f interfaceC37911fD10 = bVar22 == null ? null : bVar22.d(expressionResolver, n2Var);
                    if (interfaceC37911fD10 == null) {
                        interfaceC37911fD10 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD10);
                }
            }
            if (list2 != null) {
                for (C38269b7.n nVar : list2) {
                    kVar.e(nVar.f374627b.d(expressionResolver, n2Var));
                    kVar.e(nVar.f374630e.d(expressionResolver, n2Var));
                    com.yandex.div.json.expressions.b<Integer> bVar23 = nVar.f374628c;
                    InterfaceC37911f interfaceC37911fD11 = bVar23 == null ? null : bVar23.d(expressionResolver, n2Var);
                    if (interfaceC37911fD11 == null) {
                        interfaceC37911fD11 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD11);
                    C38502q1 c38502q1 = nVar.f374631f;
                    kVar.e(c38502q1.f376152b.d(expressionResolver, n2Var));
                    kVar.e(c38502q1.f376151a.d(expressionResolver, n2Var));
                }
            }
        }
        c(kVar, c38029k, expressionResolver, c38269b7);
        C38269b7.m mVar = c38269b7.f374584n;
        if (mVar != null) {
            C37966i2 c37966i2 = new C37966i2(this, kVar, c38029k, expressionResolver, c38269b7);
            kVar.e(mVar.f374617d.d(expressionResolver, c37966i2));
            List<C38269b7.o> list3 = mVar.f374616c;
            if (list3 != null) {
                for (C38269b7.o oVar2 : list3) {
                    kVar.e(oVar2.f374657j.d(expressionResolver, c37966i2));
                    kVar.e(oVar2.f374651d.d(expressionResolver, c37966i2));
                    com.yandex.div.json.expressions.b<Long> bVar24 = oVar2.f374652e;
                    InterfaceC37911f interfaceC37911fD12 = bVar24 == null ? null : bVar24.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD12 == null) {
                        interfaceC37911fD12 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD12);
                    kVar.e(oVar2.f374653f.d(expressionResolver, c37966i2));
                    com.yandex.div.json.expressions.b<DivFontWeight> bVar25 = oVar2.f374654g;
                    InterfaceC37911f interfaceC37911fD13 = bVar25 == null ? null : bVar25.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD13 == null) {
                        interfaceC37911fD13 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD13);
                    com.yandex.div.json.expressions.b<Double> bVar26 = oVar2.f374655h;
                    InterfaceC37911f interfaceC37911fD14 = bVar26 == null ? null : bVar26.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD14 == null) {
                        interfaceC37911fD14 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD14);
                    com.yandex.div.json.expressions.b<Long> bVar27 = oVar2.f374656i;
                    InterfaceC37911f interfaceC37911fD15 = bVar27 == null ? null : bVar27.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD15 == null) {
                        interfaceC37911fD15 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD15);
                    com.yandex.div.json.expressions.b<DivLineStyle> bVar28 = oVar2.f374658k;
                    InterfaceC37911f interfaceC37911fD16 = bVar28 == null ? null : bVar28.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD16 == null) {
                        interfaceC37911fD16 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD16);
                    com.yandex.div.json.expressions.b<Integer> bVar29 = oVar2.f374659l;
                    InterfaceC37911f interfaceC37911fD17 = bVar29 == null ? null : bVar29.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD17 == null) {
                        interfaceC37911fD17 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD17);
                    com.yandex.div.json.expressions.b<Long> bVar30 = oVar2.f374660m;
                    InterfaceC37911f interfaceC37911fD18 = bVar30 == null ? null : bVar30.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD18 == null) {
                        interfaceC37911fD18 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD18);
                    com.yandex.div.json.expressions.b<DivLineStyle> bVar31 = oVar2.f374661n;
                    InterfaceC37911f interfaceC37911fD19 = bVar31 == null ? null : bVar31.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD19 == null) {
                        interfaceC37911fD19 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD19);
                    AbstractC38582v7 abstractC38582v7 = oVar2.f374649b;
                    if (abstractC38582v7 == null) {
                        c38371h6 = null;
                    } else {
                        if (!(abstractC38582v7 instanceof AbstractC38582v7.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c38371h6 = ((AbstractC38582v7.c) abstractC38582v7).f376778c;
                    }
                    if (c38371h6 != null) {
                        kVar.e(c38371h6.f375275a.d(expressionResolver, c37966i2));
                    }
                    C38600x7 c38600x7 = oVar2.f374650c;
                    InterfaceC37911f interfaceC37911fD20 = (c38600x7 == null || (c38656z6 = c38600x7.f376975b) == null || (bVar3 = c38656z6.f377433a) == null) ? null : bVar3.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD20 == null) {
                        interfaceC37911fD20 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD20);
                    InterfaceC37911f interfaceC37911fD21 = (c38600x7 == null || (c38656z62 = c38600x7.f376975b) == null || (bVar4 = c38656z62.f377435c) == null) ? null : bVar4.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD21 == null) {
                        interfaceC37911fD21 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD21);
                }
            }
            List<C38269b7.n> list4 = mVar.f374615b;
            if (list4 != null) {
                for (C38269b7.n nVar2 : list4) {
                    kVar.e(nVar2.f374627b.d(expressionResolver, c37966i2));
                    kVar.e(nVar2.f374630e.d(expressionResolver, c37966i2));
                    com.yandex.div.json.expressions.b<Integer> bVar32 = nVar2.f374628c;
                    InterfaceC37911f interfaceC37911fD22 = bVar32 == null ? null : bVar32.d(expressionResolver, c37966i2);
                    if (interfaceC37911fD22 == null) {
                        interfaceC37911fD22 = InterfaceC37911f.f367528l2;
                    }
                    kVar.e(interfaceC37911fD22);
                    C38502q1 c38502q12 = nVar2.f374631f;
                    kVar.e(c38502q12.f376152b.d(expressionResolver, c37966i2));
                    kVar.e(c38502q12.f376151a.d(expressionResolver, c37966i2));
                }
            }
        }
        com.yandex.div.json.expressions.b<Boolean> bVar33 = c38269b7.f374578h;
        if (bVar33 == null) {
            kVar.setAutoEllipsize(false);
        } else {
            kVar.setAutoEllipsize(bVar33.a(expressionResolver).booleanValue());
        }
        AbstractC38564t7 abstractC38564t7 = c38269b7.f374559O;
        i(kVar, expressionResolver, abstractC38564t7);
        if (abstractC38564t7 != null) {
            s2 s2Var = new s2(this, kVar, expressionResolver, abstractC38564t7);
            Object objA = abstractC38564t7.a();
            if (objA instanceof S3) {
                kVar.e(((S3) objA).f373506a.d(expressionResolver, s2Var));
            } else if (objA instanceof F4) {
                F4 f42 = (F4) objA;
                C37931a.B(f42.f372276a, expressionResolver, kVar, s2Var);
                C37931a.B(f42.f372277b, expressionResolver, kVar, s2Var);
                C37931a.C(f42.f372279d, expressionResolver, kVar, s2Var);
            }
        }
        kVar.e(c38269b7.f374552H.e(expressionResolver, new h(kVar)));
        kVar.setFocusable(kVar.isFocusable() || bVar11 != null);
    }

    /* compiled from: DivTextBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/h2$a;", "", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.h2$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C38029k f368468a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f368469b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.json.expressions.e f368470c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f368471d;

        /* renamed from: e, reason: collision with root package name */
        public final long f368472e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DivFontFamily f368473f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<C38269b7.o> f368474g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<DivAction> f368475h;

        /* renamed from: i, reason: collision with root package name */
        public final Context f368476i;

        /* renamed from: j, reason: collision with root package name */
        public final DisplayMetrics f368477j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final SpannableStringBuilder f368478k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final List<C38269b7.n> f368479l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public kotlin.jvm.internal.N f368480m;

        /* compiled from: DivTextBinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/h2$a$b;", "Lcom/yandex/div/core/Y;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.h2$a$b */
        public final class b extends com.yandex.div.core.Y {

            /* renamed from: a, reason: collision with root package name */
            public final int f368484a;

            public b(int i12) {
                super(a.this.f368468a);
                this.f368484a = i12;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // v21.b
            public final void b(@Y61.k C49153a c49153a) {
                int i12;
                float fDescent;
                a aVar = a.this;
                List<C38269b7.n> list = aVar.f368479l;
                int i13 = this.f368484a;
                C38269b7.n nVar = list.get(i13);
                SpannableStringBuilder spannableStringBuilder = aVar.f368478k;
                Bitmap bitmap = c49153a.f440420a;
                C38502q1 c38502q1 = nVar.f374626a;
                DisplayMetrics displayMetrics = aVar.f368477j;
                com.yandex.div.json.expressions.e eVar = aVar.f368470c;
                int iP2 = C37931a.P(c38502q1, displayMetrics, eVar);
                int length = spannableStringBuilder.length();
                int i14 = BeduinInputModel.MIN_TEXT_VERSION;
                com.yandex.div.json.expressions.b<Long> bVar = nVar.f374627b;
                if (length == 0) {
                    fDescent = 0.0f;
                } else {
                    long jLongValue = bVar.a(eVar).longValue();
                    long j12 = jLongValue >> 31;
                    if (j12 == 0 || j12 == -1) {
                        i12 = (int) jLongValue;
                    } else {
                        int i15 = com.yandex.div.internal.n.f370123a;
                        i12 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    int i16 = i12 == 0 ? 0 : i12 - 1;
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(i16, i16 + 1, AbsoluteSizeSpan.class);
                    TextView textView = aVar.f368469b;
                    TextPaint paint = textView.getPaint();
                    float size = (absoluteSizeSpanArr == null || absoluteSizeSpanArr.length == 0) ? 1.0f : absoluteSizeSpanArr[0].getSize() / textView.getTextSize();
                    float f12 = 2;
                    fDescent = (((paint.descent() + paint.ascent()) / f12) * size) - ((-iP2) / f12);
                }
                int iP3 = C37931a.P(nVar.f374631f, displayMetrics, eVar);
                com.yandex.div.json.expressions.b<Integer> bVar2 = nVar.f374628c;
                BitmapImageSpan bitmapImageSpan = new BitmapImageSpan(aVar.f368476i, bitmap, fDescent, iP3, iP2, bVar2 == null ? null : bVar2.a(eVar), C37931a.N(nVar.f374629d.a(eVar)), false, BitmapImageSpan.AnchorPoint.f370164b);
                long jLongValue2 = bVar.a(eVar).longValue();
                long j13 = jLongValue2 >> 31;
                if (j13 == 0 || j13 == -1) {
                    i14 = (int) jLongValue2;
                } else {
                    int i17 = com.yandex.div.internal.n.f370123a;
                    if (jLongValue2 > 0) {
                        i14 = Integer.MAX_VALUE;
                    }
                }
                int i18 = i14 + i13;
                int i19 = i18 + 1;
                Object[] spans = spannableStringBuilder.getSpans(i18, i19, G21.a.class);
                int length2 = spans.length;
                int i22 = 0;
                while (i22 < length2) {
                    Object obj = spans[i22];
                    i22++;
                    spannableStringBuilder.removeSpan((G21.a) obj);
                }
                spannableStringBuilder.setSpan(bitmapImageSpan, i18, i19, 18);
                ?? r02 = aVar.f368480m;
                if (r02 == 0) {
                    return;
                }
                r02.invoke(spannableStringBuilder);
            }
        }

        /* compiled from: DivTextBinder.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.h2$a$c */
        public /* synthetic */ class c {
            static {
                int[] iArr = new int[DivLineStyle.values().length];
                iArr[1] = 1;
                iArr[0] = 2;
            }
        }

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: com.yandex.div.core.view2.divs.h2$a$d */
        public static final class d<T> implements Comparator {
            public d() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t12, T t13) {
                com.yandex.div.json.expressions.b<Long> bVar = ((C38269b7.n) t12).f374627b;
                a aVar = a.this;
                return kotlin.comparisons.a.b(bVar.a(aVar.f368470c), ((C38269b7.n) t13).f374627b.a(aVar.f368470c));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k C38029k c38029k, @Y61.k TextView textView, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k String str, long j12, @Y61.k DivFontFamily divFontFamily, @Y61.l List<? extends C38269b7.o> list, @Y61.l List<? extends DivAction> list2, @Y61.l List<? extends C38269b7.n> list3) {
            List<C38269b7.n> listB0;
            this.f368468a = c38029k;
            this.f368469b = textView;
            this.f368470c = eVar;
            this.f368471d = str;
            this.f368472e = j12;
            this.f368473f = divFontFamily;
            this.f368474g = list;
            this.f368475h = list2;
            this.f368476i = c38029k.getContext();
            this.f368477j = c38029k.getResources().getDisplayMetrics();
            this.f368478k = new SpannableStringBuilder(str);
            if (list3 == null) {
                listB0 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (((C38269b7.n) obj).f374627b.a(this.f368470c).longValue() <= this.f368471d.length()) {
                        arrayList.add(obj);
                    }
                }
                listB0 = C42745f0.B0(arrayList, new d());
            }
            this.f368479l = listB0 == null ? C42784z0.f406748b : listB0;
        }

        /* JADX WARN: Removed duplicated region for block: B:112:0x01e0  */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v14, types: [Y41.l, kotlin.jvm.internal.N] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 1050
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37962h2.a.a():void");
        }

        /* compiled from: DivTextBinder.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/h2$a$a;", "Landroid/text/style/ClickableSpan;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.h2$a$a, reason: collision with other inner class name */
        public final class C10876a extends ClickableSpan {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<DivAction> f368482b;

            /* JADX WARN: Multi-variable type inference failed */
            public C10876a(@Y61.k List<? extends DivAction> list) {
                this.f368482b = list;
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(@Y61.k View view) {
                Object next;
                a aVar = a.this;
                C37955g c37955gM = aVar.f368468a.getDiv2Component().m();
                List<DivAction> list = this.f368482b;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List<DivAction.d> list2 = ((DivAction) next).f371217b;
                    if (list2 != null && !list2.isEmpty()) {
                        break;
                    }
                }
                DivAction divAction = (DivAction) next;
                C38029k c38029k = aVar.f368468a;
                if (divAction == null) {
                    c38029k.m(new C37977m(list, "click", c37955gM, c38029k, view));
                    return;
                }
                List<DivAction.d> list3 = divAction.f371217b;
                if (list3 == null) {
                    int i12 = com.yandex.div.internal.n.f370123a;
                    return;
                }
                view.getContext();
                com.yandex.div.internal.widget.menu.c cVar = new com.yandex.div.internal.widget.menu.c(view);
                cVar.f370322b = c37955gM.new b(c38029k, list3);
                c38029k.n();
                c38029k.w(new C37980n());
                c37955gM.f368382b.getClass();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                c37955gM.f368383c.a(divAction, c38029k.getExpressionResolver());
                C19960l0 c19960l0 = new C19960l0(view.getContext(), view);
                c.a aVar2 = cVar.f370322b;
                if (aVar2 != null) {
                    ((C37955g.b) aVar2).a(c19960l0);
                }
                androidx.appcompat.view.menu.n nVar = c19960l0.f22566c;
                if (nVar.b()) {
                    return;
                }
                if (nVar.f21903e == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                nVar.e(0, 0, false, false);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(@Y61.k TextPaint textPaint) {
            }
        }
    }
}

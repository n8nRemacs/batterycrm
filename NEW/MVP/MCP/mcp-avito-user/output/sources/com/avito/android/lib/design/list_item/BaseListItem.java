package com.avito.android.lib.design.list_item;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout.b;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.q6;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import j.e0;
import java.util.Iterator;
import kV.C42635a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import lV.C43685a;
import lV.InterfaceC43686b;
import pK0.InterfaceC46971a;

/* compiled from: BaseListItem.kt */
@s0
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001;B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0016J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001d\u0010 J\u0017\u0010!\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\u0016J\u0019\u0010!\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b!\u0010\u0018J\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b#\u0010\u0016J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010\u0016J\u0019\u0010$\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b$\u0010\u0018J\r\u0010%\u001a\u00020\u0019¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0016J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b&\u0010 J\u0019\u0010'\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b'\u0010\u0018J\r\u0010(\u001a\u00020\u0019¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b)\u0010\u0016J\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b)\u0010 J\u0017\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010\u0016J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0013H\u0016¢\u0006\u0004\b5\u0010\u0016J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u000206H\u0002¢\u0006\u0004\b\u000e\u00107J\u0013\u00109\u001a\u00020\r*\u000208H\u0002¢\u0006\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem;", "Landroid/widget/LinearLayout;", "LpK0/a;", "LLV/a;", "LkV/b;", "LlV/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "newStyle", "Lkotlin/G0;", "setStyle", "(LlV/b;)V", "newState", "setState", "(LkV/b;)V", "", "text", "setTitle", "(I)V", "", "(Ljava/lang/CharSequence;)V", "", "getTitle", "()Ljava/lang/String;", "colorRes", "setTitleColor", "Landroid/content/res/ColorStateList;", "color", "(Landroid/content/res/ColorStateList;)V", "setSubtitle", "getSubtitle", "setSubtitleColor", "setMessage", "getMessage", "setMessageColor", "setLink", "getLink", "setLinkColor", "Landroid/view/View$OnClickListener;", "listener", "setLinkClickedListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/text/method/MovementMethod;", "movementMethod", "setLinkMovementMethod", "(Landroid/text/method/MovementMethod;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "minHeight", "setMinimumHeight", "LlV/a;", "(LlV/a;)V", "Landroid/view/ViewGroup;", "setVisibilityByContent", "(Landroid/view/ViewGroup;)V", "Alignment", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes14.dex */
public abstract class BaseListItem extends LinearLayout implements InterfaceC46971a, LV.a<kV.b, InterfaceC43686b> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f179488m = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LinearLayout f179489b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f179490c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f179491d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f179492e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TextView f179493f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AlignmentFrameLayout f179494g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AlignmentFrameLayout f179495h;

    /* renamed from: i, reason: collision with root package name */
    public int f179496i;

    /* renamed from: j, reason: collision with root package name */
    public int f179497j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public C43685a f179498k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public C42635a f179499l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseListItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        /* renamed from: b, reason: collision with root package name */
        public static final Alignment f179500b;

        /* renamed from: c, reason: collision with root package name */
        public static final Alignment f179501c;

        /* renamed from: d, reason: collision with root package name */
        public static final Alignment f179502d;

        /* renamed from: e, reason: collision with root package name */
        public static final Alignment f179503e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f179504f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179505g;

        /* compiled from: BaseListItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment$a;", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends Alignment {
            public a() {
                throw null;
            }

            @Override // com.avito.android.lib.design.list_item.BaseListItem.Alignment
            @k
            public final AlignmentFrameLayout.b a(@k BaseListItem baseListItem, @k AlignmentFrameLayout alignmentFrameLayout) {
                int i12 = BaseListItem.f179488m;
                return new AlignmentFrameLayout.b(alignmentFrameLayout, 0.0f, 1, null);
            }
        }

        /* compiled from: BaseListItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment$b;", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends Alignment {
            public b() {
                throw null;
            }

            @Override // com.avito.android.lib.design.list_item.BaseListItem.Alignment
            @k
            public final AlignmentFrameLayout.b a(@k BaseListItem baseListItem, @k AlignmentFrameLayout alignmentFrameLayout) {
                TextPaint paint;
                Paint.FontMetrics fontMetrics;
                TextPaint paint2;
                Paint.FontMetrics fontMetrics2;
                TextPaint paint3;
                Paint.FontMetrics fontMetrics3;
                TextPaint paint4;
                Paint.FontMetrics fontMetrics4;
                float f12 = 0.0f;
                float fA2 = s.a(baseListItem.f179490c != null ? r0.getTop() : 0.0f, baseListItem.f179489b != null ? r2.getPaddingTop() : 0.0f) + (baseListItem.f179490c != null ? r2.getPaddingTop() : 0.0f) + baseListItem.f179496i;
                TextView textView = baseListItem.f179490c;
                float f13 = (textView == null || (paint4 = textView.getPaint()) == null || (fontMetrics4 = paint4.getFontMetrics()) == null) ? 0.0f : fontMetrics4.ascent;
                TextView textView2 = baseListItem.f179490c;
                float f14 = (f13 - ((textView2 == null || (paint3 = textView2.getPaint()) == null || (fontMetrics3 = paint3.getFontMetrics()) == null) ? 0.0f : fontMetrics3.top)) + fA2;
                TextView textView3 = baseListItem.f179490c;
                float f15 = (textView3 == null || (paint2 = textView3.getPaint()) == null || (fontMetrics2 = paint2.getFontMetrics()) == null) ? 0.0f : fontMetrics2.descent;
                TextView textView4 = baseListItem.f179490c;
                if (textView4 != null && (paint = textView4.getPaint()) != null && (fontMetrics = paint.getFontMetrics()) != null) {
                    f12 = fontMetrics.ascent;
                }
                return alignmentFrameLayout.new b(((f15 - f12) / 2.0f) + f14);
            }
        }

        /* compiled from: BaseListItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment$c;", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends Alignment {
            public c() {
                throw null;
            }

            @Override // com.avito.android.lib.design.list_item.BaseListItem.Alignment
            @k
            public final AlignmentFrameLayout.b a(@k BaseListItem baseListItem, @k AlignmentFrameLayout alignmentFrameLayout) {
                return alignmentFrameLayout.new b(baseListItem.f179497j / 2.0f);
            }
        }

        /* compiled from: BaseListItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment$d;", "Lcom/avito/android/lib/design/list_item/BaseListItem$Alignment;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends Alignment {
            public d() {
                throw null;
            }

            @Override // com.avito.android.lib.design.list_item.BaseListItem.Alignment
            @k
            public final AlignmentFrameLayout.b a(@k BaseListItem baseListItem, @k AlignmentFrameLayout alignmentFrameLayout) {
                TextPaint paint;
                Paint.FontMetrics fontMetrics;
                TextPaint paint2;
                Paint.FontMetrics fontMetrics2;
                TextPaint paint3;
                Paint.FontMetrics fontMetrics3;
                TextPaint paint4;
                Paint.FontMetrics fontMetrics4;
                LinearLayout linearLayout = baseListItem.f179489b;
                int paddingTop = linearLayout != null ? linearLayout.getPaddingTop() : 0;
                LinearLayout linearLayout2 = baseListItem.f179489b;
                int paddingBottom = linearLayout2 != null ? linearLayout2.getPaddingBottom() : 0;
                TextView textView = baseListItem.f179490c;
                float f12 = 0.0f;
                float f13 = (textView == null || (paint4 = textView.getPaint()) == null || (fontMetrics4 = paint4.getFontMetrics()) == null) ? 0.0f : fontMetrics4.bottom;
                TextView textView2 = baseListItem.f179490c;
                float f14 = f13 - ((textView2 == null || (paint3 = textView2.getPaint()) == null || (fontMetrics3 = paint3.getFontMetrics()) == null) ? 0.0f : fontMetrics3.top);
                TextView textView3 = baseListItem.f179491d;
                float f15 = (textView3 == null || (paint2 = textView3.getPaint()) == null || (fontMetrics2 = paint2.getFontMetrics()) == null) ? 0.0f : fontMetrics2.bottom;
                TextView textView4 = baseListItem.f179491d;
                if (textView4 != null && (paint = textView4.getPaint()) != null && (fontMetrics = paint.getFontMetrics()) != null) {
                    f12 = fontMetrics.top;
                }
                return alignmentFrameLayout.new b((((paddingTop + f14) + (f15 - f12)) + paddingBottom) / 2.0f);
            }
        }

        static {
            a aVar = new a("CENTER", 0, null);
            f179500b = aVar;
            b bVar = new b("FIRST_LINE_CENTER", 1, null);
            f179501c = bVar;
            d dVar = new d("TWO_LINES_CENTER", 2, null);
            f179502d = dVar;
            c cVar = new c("MIN_HEIGHT_CENTER", 3, null);
            f179503e = cVar;
            Alignment[] alignmentArr = {aVar, bVar, dVar, cVar};
            f179504f = alignmentArr;
            f179505g = kotlin.enums.c.a(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public Alignment(String str, int i12, C42822w c42822w) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f179504f.clone();
        }

        @k
        public abstract AlignmentFrameLayout.b a(@k BaseListItem baseListItem, @k AlignmentFrameLayout alignmentFrameLayout);
    }

    public BaseListItem(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(BaseListItem baseListItem, View view, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i12 = -1;
        }
        if ((i14 & 4) != 0) {
            i13 = -1;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (i12 < 0) {
            i12 = marginLayoutParams.leftMargin;
        }
        int i15 = marginLayoutParams.topMargin;
        if (i13 < 0) {
            i13 = marginLayoutParams.rightMargin;
        }
        marginLayoutParams.setMargins(i12, i15, i13, marginLayoutParams.bottomMargin);
        view.requestLayout();
    }

    private final void setVisibilityByContent(ViewGroup viewGroup) {
        View next;
        Iterator<View> it = new q6(viewGroup).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (D6.y(next)) {
                    break;
                }
            }
        }
        D6.G(viewGroup, next != null);
    }

    public final void b() {
        AlignmentFrameLayout alignmentFrameLayout = this.f179494g;
        if (alignmentFrameLayout != null) {
            setVisibilityByContent(alignmentFrameLayout);
        }
    }

    public final void c() {
        AlignmentFrameLayout alignmentFrameLayout = this.f179495h;
        if (alignmentFrameLayout != null) {
            setVisibilityByContent(alignmentFrameLayout);
        }
    }

    public final void d(AlignmentFrameLayout alignmentFrameLayout, Alignment alignment, Alignment alignment2) {
        if (alignment != null) {
            AlignmentFrameLayout.a(alignmentFrameLayout, alignment.a(this, alignmentFrameLayout), null, 0, 6);
        }
        if (alignment2 != null) {
            AlignmentFrameLayout.a(alignmentFrameLayout, null, alignment2.a(this, alignmentFrameLayout), 0, 5);
        }
    }

    @k
    public final String getLink() {
        CharSequence text;
        String string;
        TextView textView = this.f179493f;
        if (textView != null) {
            if (!D6.y(textView)) {
                textView = null;
            }
            if (textView != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                return string;
            }
        }
        return "";
    }

    @k
    public final String getMessage() {
        CharSequence text;
        String string;
        TextView textView = this.f179492e;
        if (textView != null) {
            if (!D6.y(textView)) {
                textView = null;
            }
            if (textView != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                return string;
            }
        }
        return "";
    }

    @k
    public final String getSubtitle() {
        CharSequence text;
        String string;
        TextView textView = this.f179491d;
        if (textView != null) {
            if (!D6.y(textView)) {
                textView = null;
            }
            if (textView != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                return string;
            }
        }
        return "";
    }

    @k
    public final String getTitle() {
        CharSequence text;
        String string;
        TextView textView = this.f179490c;
        if (textView != null) {
            if (!D6.y(textView)) {
                textView = null;
            }
            if (textView != null && (text = textView.getText()) != null && (string = text.toString()) != null) {
                return string;
            }
        }
        return "";
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
        C43685a.C11787a c11787a = C43685a.f413756q;
        Context context = getContext();
        c11787a.getClass();
        setStyle(C43685a.C11787a.b(style, context));
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public void setLink(@l CharSequence text) {
        TextView textView = this.f179493f;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }

    public final void setLinkClickedListener(@l View.OnClickListener listener) {
        TextView textView = this.f179493f;
        if (textView != null) {
            textView.setOnClickListener(listener);
        }
    }

    public final void setLinkColor(@InterfaceC42158n int colorRes) {
        ColorStateList colorStateList = d.getColorStateList(getContext(), colorRes);
        if (colorStateList == null) {
            return;
        }
        setLinkColor(colorStateList);
    }

    public final void setLinkMovementMethod(@k MovementMethod movementMethod) {
        TextView textView = this.f179493f;
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(movementMethod);
    }

    public final void setMessage(@e0 int text) {
        setMessage(getContext().getString(text));
    }

    public final void setMessageColor(@InterfaceC42158n int colorRes) {
        ColorStateList colorStateList = d.getColorStateList(getContext(), colorRes);
        if (colorStateList == null) {
            return;
        }
        setMessageColor(colorStateList);
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        super.setMinimumHeight(minHeight);
        this.f179497j = minHeight;
        LinearLayout linearLayout = this.f179489b;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setMinimumHeight(minHeight);
    }

    public final void setSubtitle(@e0 int text) {
        setSubtitle(getContext().getString(text));
    }

    public final void setSubtitleColor(@InterfaceC42158n int colorRes) {
        ColorStateList colorStateList = d.getColorStateList(getContext(), colorRes);
        if (colorStateList == null) {
            return;
        }
        setSubtitleColor(colorStateList);
    }

    public final void setTitle(@e0 int text) {
        setTitle(getContext().getString(text));
    }

    public final void setTitleColor(@InterfaceC42158n int colorRes) {
        ColorStateList colorStateList = d.getColorStateList(getContext(), colorRes);
        if (colorStateList == null) {
            return;
        }
        setTitleColor(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseListItem(@l Context context, @l AttributeSet attributeSet, int i12) {
        Integer numValueOf = i12 <= 0 ? null : Integer.valueOf(i12);
        int i13 = R.attr.listItem;
        super(context, attributeSet, numValueOf != null ? numValueOf.intValue() : R.attr.listItem);
        Integer numValueOf2 = i12 <= 0 ? null : Integer.valueOf(i12);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178968g, numValueOf2 != null ? numValueOf2.intValue() : i13, R.style.Design_Widget_ListItem);
        LayoutInflater.from(getContext()).inflate(typedArrayObtainStyledAttributes.getResourceId(3, R.layout.design_list_item), (ViewGroup) this, true);
        super.setOrientation(0);
        this.f179489b = (LinearLayout) findViewById(R.id.design_item_text_container);
        this.f179494g = (AlignmentFrameLayout) findViewById(R.id.design_left_container);
        this.f179495h = (AlignmentFrameLayout) findViewById(R.id.design_right_container);
        LinearLayout linearLayout = this.f179489b;
        this.f179490c = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.design_item_title) : null;
        LinearLayout linearLayout2 = this.f179489b;
        this.f179491d = linearLayout2 != null ? (TextView) linearLayout2.findViewById(R.id.design_item_subtitle) : null;
        LinearLayout linearLayout3 = this.f179489b;
        this.f179492e = linearLayout3 != null ? (TextView) linearLayout3.findViewById(R.id.design_item_message) : null;
        LinearLayout linearLayout4 = this.f179489b;
        this.f179493f = linearLayout4 != null ? (TextView) linearLayout4.findViewById(R.id.design_item_link) : null;
        C43685a.C11787a c11787a = C43685a.f413756q;
        Context context2 = getContext();
        c11787a.getClass();
        setStyle(C43685a.C11787a.c(typedArrayObtainStyledAttributes, context2));
        TextView textView = this.f179490c;
        if (textView != null) {
            I5.a(textView, typedArrayObtainStyledAttributes.getText(26), false);
        }
        TextView textView2 = this.f179491d;
        if (textView2 != null) {
            I5.a(textView2, typedArrayObtainStyledAttributes.getText(18), false);
        }
        TextView textView3 = this.f179492e;
        if (textView3 != null) {
            I5.a(textView3, typedArrayObtainStyledAttributes.getText(15), false);
        }
        TextView textView4 = this.f179493f;
        if (textView4 != null) {
            I5.a(textView4, typedArrayObtainStyledAttributes.getText(12), false);
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setStyle(lV.C43685a r14) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.BaseListItem.setStyle(lV.a):void");
    }

    public void setMessage(@l CharSequence text) {
        TextView textView = this.f179492e;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k kV.b r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.list_item.BaseListItem.setState(kV.b):void");
    }

    public void setSubtitle(@l CharSequence text) {
        TextView textView = this.f179491d;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }

    public void setTitle(@l CharSequence text) {
        TextView textView = this.f179490c;
        if (textView != null) {
            I5.a(textView, text, false);
        }
    }

    public final void setLinkColor(@k ColorStateList color) {
        TextView textView = this.f179493f;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setMessageColor(@k ColorStateList color) {
        TextView textView = this.f179492e;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setSubtitleColor(@k ColorStateList color) {
        TextView textView = this.f179491d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setTitleColor(@k ColorStateList color) {
        TextView textView = this.f179490c;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // LV.d
    public void setStyle(@k InterfaceC43686b newStyle) {
        if (newStyle instanceof C43685a) {
            setStyle((C43685a) newStyle);
        }
    }
}

package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import j.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q21.e;

/* compiled from: EllipsizedTextView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u00018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0010R*\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR4\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\u0013\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0010R.\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0013\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0004R\"\u0010+\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\"\u00102\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\tR\u001a\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010#¨\u00069"}, d2 = {"Lcom/yandex/div/internal/widget/e;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "getText", "()Ljava/lang/CharSequence;", "", "maxLines", "Lkotlin/G0;", "setMaxLines", "(I)V", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "text", "setTextInternal", "(Ljava/lang/CharSequence;)V", "value", "b", "Ljava/lang/CharSequence;", "getEllipsis", "setEllipsis", "ellipsis", "", "c", "Z", "getAutoEllipsize", "()Z", "setAutoEllipsize", "(Z)V", "autoEllipsize", "e", "getEllipsizedText", "setEllipsizedText", "getEllipsizedText$annotations", "()V", "ellipsizedText", "<set-?>", "f", "getDisplayText", "getDisplayText$annotations", "displayText", "g", "isInternalTextChange", "setInternalTextChange", "i", "I", "getLastMeasuredHeight", "()I", "setLastMeasuredHeight", "lastMeasuredHeight", "Lcom/yandex/div/internal/widget/b;", "m", "Lcom/yandex/div/internal/widget/b;", "getAutoEllipsizeHelper$annotations", "autoEllipsizeHelper", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class e extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public CharSequence ellipsis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean autoEllipsize;

    /* renamed from: d, reason: collision with root package name */
    public boolean f370254d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public CharSequence ellipsizedText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public CharSequence displayText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isInternalTextChange;

    /* renamed from: h, reason: collision with root package name */
    public int f370258h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int lastMeasuredHeight;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public CharSequence f370260j;

    /* renamed from: k, reason: collision with root package name */
    public float f370261k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f370262l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final b autoEllipsizeHelper;

    /* compiled from: EllipsizedTextView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/internal/widget/e$a;", "", "<init>", "()V", "", "DEBUG", "Z", "", "DEFAULT_ELLIPSIS", "Ljava/lang/String;", "", "ELLIPSIS_WIDTH_UNKNOWN", "F", "", "NOT_SET", "I", "TAG", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence text) {
        this.isInternalTextChange = true;
        super.setText(text);
        this.isInternalTextChange = false;
    }

    public final void b(CharSequence charSequence) {
        if (getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE) {
            super.setEllipsize(null);
        } else if (L.f(charSequence, "…")) {
            super.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            super.setEllipsize(null);
            this.f370262l = true;
            this.f370261k = -1.0f;
            this.f370254d = false;
        }
        requestLayout();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    @Y61.l
    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    @Y61.k
    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    @Y61.l
    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    public final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @Y61.k
    public CharSequence getText() {
        CharSequence charSequence = this.f370260j;
        return charSequence == null ? "" : charSequence;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.div.internal.widget.a] */
    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final b bVar = this.autoEllipsizeHelper;
        if (bVar.f370241b && bVar.f370242c == null) {
            bVar.f370242c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.internal.widget.a
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    e eVar;
                    Layout layout;
                    b bVar2 = bVar;
                    if (!bVar2.f370241b || (layout = (eVar = bVar2.f370240a).getLayout()) == null) {
                        return true;
                    }
                    int iMin = Math.min(layout.getLineCount(), (eVar.getHeight() / eVar.getLineHeight()) + 1);
                    while (iMin > 0 && layout.getLineBottom(iMin - 1) - ((eVar.getHeight() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) > 3) {
                        iMin--;
                    }
                    int iMax = Math.max(0, iMin);
                    if (iMax != eVar.getMaxLines()) {
                        eVar.setMaxLines(iMax);
                        return false;
                    }
                    if (bVar2.f370242c == null) {
                        return true;
                    }
                    eVar.getViewTreeObserver().removeOnPreDrawListener(bVar2.f370242c);
                    bVar2.f370242c = null;
                    return true;
                }
            };
            bVar.f370240a.getViewTreeObserver().addOnPreDrawListener(bVar.f370242c);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.autoEllipsizeHelper;
        if (bVar.f370242c != null) {
            bVar.f370240a.getViewTreeObserver().removeOnPreDrawListener(bVar.f370242c);
            bVar.f370242c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.e.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        if (i12 == i14 && i13 == i15) {
            return;
        }
        this.f370262l = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        super.onTextChanged(charSequence, i12, i13, i14);
        if (this.isInternalTextChange) {
            return;
        }
        this.f370260j = charSequence;
        requestLayout();
        this.f370262l = true;
    }

    public final void setAutoEllipsize(boolean z12) {
        this.autoEllipsize = z12;
        this.autoEllipsizeHelper.f370241b = z12;
    }

    public final void setEllipsis(@Y61.k CharSequence charSequence) {
        b(charSequence);
        this.ellipsis = charSequence;
    }

    public final void setInternalTextChange(boolean z12) {
        this.isInternalTextChange = z12;
    }

    public final void setLastMeasuredHeight(int i12) {
        this.lastMeasuredHeight = i12;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        b(this.ellipsis);
        this.f370262l = true;
        this.f370261k = -1.0f;
        this.f370254d = false;
    }

    @Override // android.widget.TextView
    public final void setText(@Y61.l CharSequence charSequence, @Y61.l TextView.BufferType bufferType) {
        this.displayText = charSequence;
        super.setText(charSequence, bufferType);
    }

    @X41.j
    public e(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.f370258h = -1;
        this.lastMeasuredHeight = -1;
        this.f370261k = -1.0f;
        this.autoEllipsizeHelper = new b(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.f428998c, i12, 0);
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(0);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        b(this.ellipsis);
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    @k0
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @k0
    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Y61.l TextUtils.TruncateAt where) {
    }
}

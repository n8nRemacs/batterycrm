package com.avito.android.advertising.ui;

import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.advertising.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MinLengthMaxLinesTextView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/android/advertising/ui/MinLengthMaxLinesTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "maxLines", "Lkotlin/G0;", "setMaxLines", "(I)V", "minLength", "setMinLength", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "", "getText", "()Ljava/lang/CharSequence;", "a", "b", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MinLengthMaxLinesTextView extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name */
    @l
    public CharSequence f88548b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88549c;

    /* renamed from: d, reason: collision with root package name */
    public int f88550d;

    /* renamed from: e, reason: collision with root package name */
    public int f88551e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final b f88552f;

    /* renamed from: g, reason: collision with root package name */
    public int f88553g;

    /* renamed from: h, reason: collision with root package name */
    public int f88554h;

    /* compiled from: MinLengthMaxLinesTextView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/advertising/ui/MinLengthMaxLinesTextView$a;", "", "<init>", "()V", "", "DEFAULT_MAX_LINES", "I", "DEFAULT_MIN_LENGTH", "", "ELLIPSIS", "Ljava/lang/String;", "NOT_MEASURE_SPEC", "", "SPACE", "C", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MinLengthMaxLinesTextView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/MinLengthMaxLinesTextView$b;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements CharSequence {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public CharSequence f88555b = "";

        /* renamed from: c, reason: collision with root package name */
        public final int f88556c = 0;

        @Override // java.lang.CharSequence
        public final char charAt(int i12) {
            return this.f88555b.charAt(i12);
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.f88556c;
        }

        @Override // java.lang.CharSequence
        @Y61.k
        public final CharSequence subSequence(int i12, int i13) {
            return this.f88555b.subSequence(i12, i13);
        }
    }

    static {
        new a(null);
    }

    public MinLengthMaxLinesTextView(@Y61.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88550d = BeduinInputModel.MIN_TEXT_VERSION;
        this.f88551e = BeduinInputModel.MIN_TEXT_VERSION;
        this.f88552f = new b();
        this.f88553g = 3;
        this.f88554h = 33;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.i.f87862a);
        setMaxLines(typedArrayObtainStyledAttributes.getInt(0, this.f88553g));
        setMinLength(typedArrayObtainStyledAttributes.getInt(1, this.f88554h));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @Y61.l
    public CharSequence getText() {
        return this.f88548b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        int lineEnd;
        super.onMeasure(i12, i13);
        boolean z12 = this.f88549c;
        if (!z12 && this.f88550d == i12 && this.f88551e == i13) {
            return;
        }
        this.f88550d = i13;
        CharSequence charSequence = this.f88548b;
        if (charSequence != null) {
            b bVar = this.f88552f;
            if (!z12 && !charSequence.equals(super.getText())) {
                bVar.f88555b = charSequence;
                setText(bVar);
                super.onMeasure(i12, i13);
            }
            this.f88549c = false;
            int lineCount = getLayout().getLineCount();
            if (charSequence.length() <= this.f88554h || lineCount <= this.f88553g || (lineEnd = getLayout().getLineEnd(this.f88553g - 1)) > charSequence.length() - 1) {
                return;
            }
            for (lineEnd = getLayout().getLineEnd(this.f88553g - 1); lineEnd > this.f88554h; lineEnd--) {
                if (charSequence.charAt(lineEnd) == ' ' && charSequence.charAt(lineEnd - 1) != ' ') {
                    CharSequence charSequenceConcat = TextUtils.concat(charSequence.subSequence(0, lineEnd), "…");
                    Layout layout = getLayout();
                    if (StaticLayout.Builder.obtain(charSequenceConcat, 0, charSequenceConcat.length(), getPaint(), layout.getWidth()).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build().getLineCount() <= this.f88553g) {
                        bVar.f88555b = charSequenceConcat;
                        setText(bVar);
                        super.onMeasure(i12, i13);
                        return;
                    }
                }
            }
            for (int lineEnd2 = getLayout().getLineEnd(this.f88553g - 1); lineEnd2 < charSequence.length() - 1; lineEnd2++) {
                if (charSequence.charAt(lineEnd2) != ' ') {
                    int i14 = lineEnd2 + 1;
                    if (charSequence.charAt(i14) == ' ') {
                        bVar.f88555b = TextUtils.concat(charSequence.subSequence(0, i14), "…");
                        setText(bVar);
                        super.onMeasure(i12, i13);
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        if (maxLines <= 0) {
            super.setMaxLines(maxLines);
            return;
        }
        this.f88553g = maxLines;
        this.f88550d = BeduinInputModel.MIN_TEXT_VERSION;
        this.f88551e = BeduinInputModel.MIN_TEXT_VERSION;
        requestLayout();
        invalidate();
    }

    public final void setMinLength(int minLength) {
        if (minLength > 0) {
            this.f88554h = minLength;
        } else {
            this.f88554h = 0;
        }
    }

    @Override // android.widget.TextView
    public final void setText(@Y61.l CharSequence charSequence, @Y61.l TextView.BufferType bufferType) {
        b bVar = this.f88552f;
        if (charSequence == bVar) {
            super.setText(bVar.f88555b, bufferType);
            return;
        }
        this.f88548b = charSequence;
        this.f88549c = true;
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Y61.l TextUtils.TruncateAt where) {
    }
}

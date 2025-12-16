package ru.cyberity.cbr.core.widget.pincode;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.ranges.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.theme.d;

/* compiled from: CBRPinView.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 s2\u00020\u0001:\u0004tsuvB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0014¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010.J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u00100J\u0017\u00107\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b7\u0010(J\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u00103J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u00100J\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u00100J\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u00100J\u0017\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u00100R\u001c\u0010A\u001a\b\u0018\u00010@R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010^\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010J\u001a\u0004\b_\u0010`\"\u0004\ba\u0010.R*\u0010c\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010D\u001a\u0004\bc\u00103\"\u0004\bd\u0010>R(\u0010j\u001a\u0004\u0018\u00010e2\b\u0010b\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010m\u001a\u0004\u0018\u00010e2\b\u0010b\u001a\u0004\u0018\u00010e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR(\u0010r\u001a\u0004\u0018\u00010\u000b2\b\u0010b\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006w"}, d2 = {"Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", "Landroid/widget/EditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "radius", "Lkotlin/G0;", "setCornerSize", "(F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "text", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "selStart", "selEnd", "onSelectionChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/text/method/MovementMethod;", "getDefaultMovementMethod", "()Landroid/text/method/MovementMethod;", "screenState", "onScreenStateChanged", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "isSuggestionsEnabled", "()Z", "maxLength", "setMaxLength", "moveSelectionToEnd", "drawPinView", "shouldBlink", "makeBlink", "suspendBlink", "resumeBlink", "showCursor", "invalidateCursor", "(Z)V", "disableSelectionMenu", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$Blink;", "mBlink", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$Blink;", "isCursorVisible", "Z", "drawCursor", "Landroid/graphics/drawable/Drawable;", "cursorDrawable", "Landroid/graphics/drawable/Drawable;", "itemSpacing", "I", "itemPadding", "rect", "Landroid/graphics/Rect;", "Lcom/google/android/material/shape/q;", "shapeAppearance", "Lcom/google/android/material/shape/q;", "itemBackground", "getItemBackground", "()Landroid/graphics/drawable/Drawable;", "setItemBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "onTextCompleteListener", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "getOnTextCompleteListener", "()Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "setOnTextCompleteListener", "(Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;)V", "count", "itemCount", "getItemCount", "()I", "setItemCount", "value", "isError", "setError", "Landroid/content/res/ColorStateList;", "getBoxBackgroundColor", "()Landroid/content/res/ColorStateList;", "setBoxBackgroundColor", "(Landroid/content/res/ColorStateList;)V", "boxBackgroundColor", "getBoxStrokeColor", "setBoxStrokeColor", "boxStrokeColor", "getBoxStrokeWidth", "()Ljava/lang/Float;", "setBoxStrokeWidth", "(Ljava/lang/Float;)V", "boxStrokeWidth", "Companion", "Blink", "DefaultActionModeCallback", "OnTextCompleteListener", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes9.dex */
public final class CBRPinView extends EditText {

    @l
    private Drawable cursorDrawable;
    private boolean drawCursor;
    private boolean isCursorVisible;
    private boolean isError;

    @l
    private Drawable itemBackground;
    private int itemCount;
    private int itemPadding;
    private int itemSpacing;

    @l
    private Blink mBlink;

    @l
    private OnTextCompleteListener onTextCompleteListener;

    @k
    private final Rect rect;

    @k
    private final q shapeAppearance;

    @k
    private static final InputFilter[] NO_FILTERS = new InputFilter[0];

    @k
    private static final int[] HIGHLIGHT_STATE = {R.attr.state_selected};

    @k
    private static final int[] ERROR_STATE = {ru.cyberity.cbr.core.R.attr.cbr_stateRejected};

    /* compiled from: CBRPinView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/widget/pincode/CBRPinView$Blink;", "Ljava/lang/Runnable;", "<init>", "(Lru/cyberity/cbr/core/widget/pincode/CBRPinView;)V", "Lkotlin/G0;", "run", "()V", "cancel", "uncancel", "", "mCancelled", "Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class Blink implements Runnable {
        private boolean mCancelled;

        public Blink() {
        }

        public final void cancel() {
            if (this.mCancelled) {
                return;
            }
            CBRPinView.this.removeCallbacks(this);
            this.mCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mCancelled) {
                return;
            }
            CBRPinView.this.removeCallbacks(this);
            if (CBRPinView.this.shouldBlink()) {
                CBRPinView.this.invalidateCursor(!r0.drawCursor);
                CBRPinView.this.postDelayed(this, 500L);
            }
        }

        public final void uncancel() {
            this.mCancelled = false;
        }
    }

    /* compiled from: CBRPinView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "", "onTextComplete", "", "enteredText", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnTextCompleteListener {
        boolean onTextComplete(@k String enteredText);
    }

    @j
    public CBRPinView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void disableSelectionMenu() {
        setCustomSelectionActionModeCallback(new DefaultActionModeCallback());
        setCustomInsertionActionModeCallback(new DefaultActionModeCallback() { // from class: ru.cyberity.cbr.core.widget.pincode.CBRPinView.disableSelectionMenu.1
            @Override // ru.cyberity.cbr.core.widget.pincode.CBRPinView.DefaultActionModeCallback, android.view.ActionMode.Callback
            public boolean onCreateActionMode(@k ActionMode mode, @k Menu menu) {
                menu.removeItem(R.id.autofill);
                return true;
            }
        });
    }

    private final void drawPinView(Canvas canvas) {
        boolean z12;
        boolean z13;
        Drawable drawable;
        Editable text = getText();
        boolean z14 = false;
        int length = text != null ? text.length() : 0;
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (height < 0) {
            height = 0;
        }
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i12 = this.itemCount;
        int iG2 = s.g((width - ((i12 - 1) * this.itemSpacing)) / i12, 0, height);
        int paddingStart = getPaddingStart();
        int width2 = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i13 = this.itemCount;
        boolean z15 = true;
        int i14 = (width2 - (iG2 * i13)) - ((i13 - 1) * this.itemSpacing);
        int i15 = 2;
        int i16 = (i14 / 2) + paddingStart;
        int height2 = ((((getHeight() - height) - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int i17 = this.itemCount;
        int i18 = 0;
        while (i18 < i17) {
            boolean z16 = (isFocused() && length == i18) ? z15 : z14;
            int i19 = ((this.itemSpacing + iG2) * i18) + i16;
            int i22 = i19 + iG2;
            Drawable drawable2 = this.itemBackground;
            if (drawable2 != null) {
                drawable2.setState(this.isError ? ERROR_STATE : z16 ? HIGHLIGHT_STATE : getDrawableState());
                drawable2.setBounds(i19, height2, i22, height2 + height);
                canvas.save();
                drawable2.draw(canvas);
                canvas.restore();
            }
            if (z16 && this.drawCursor && (drawable = this.cursorDrawable) != null) {
                int intrinsicWidth = (((i22 - i19) - drawable.getIntrinsicWidth()) / i15) + i19;
                int iF2 = r.f(height, (int) getTextSize(), i15, height2);
                drawable.setBounds(intrinsicWidth, iF2, drawable.getIntrinsicWidth() + intrinsicWidth, ((int) getTextSize()) + iF2);
                canvas.save();
                drawable.draw(canvas);
                canvas.restore();
            }
            Editable text2 = getText();
            if (i18 < (text2 != null ? text2.length() : 0)) {
                String string = getText().subSequence(i18, i18 + 1).toString();
                z12 = false;
                z13 = true;
                getPaint().getTextBounds(string, 0, 1, this.rect);
                getPaint().setColor(getCurrentTextColor());
                canvas.drawText(string, (((i22 - i19) - this.rect.width()) / 2.0f) + i19, (height2 + height) - ((height - this.rect.height()) / 2.0f), getPaint());
            } else {
                z12 = false;
                z13 = true;
            }
            i18++;
            z14 = z12;
            z15 = z13;
            i15 = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateCursor(boolean showCursor) {
        if (this.drawCursor != showCursor) {
            this.drawCursor = showCursor;
            invalidate();
        }
    }

    private final void makeBlink() {
        if (!shouldBlink()) {
            Blink blink = this.mBlink;
            if (blink != null) {
                removeCallbacks(blink);
                return;
            }
            return;
        }
        if (this.mBlink == null) {
            this.mBlink = new Blink();
        }
        removeCallbacks(this.mBlink);
        this.drawCursor = false;
        postDelayed(this.mBlink, 500L);
    }

    private final void moveSelectionToEnd() {
        Editable text = getText();
        setSelection(text != null ? text.length() : 0);
    }

    private final void resumeBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.uncancel();
            makeBlink();
        }
    }

    private final void setMaxLength(int maxLength) {
        setFilters(maxLength >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(maxLength)} : NO_FILTERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldBlink() {
        return isCursorVisible() && isFocused();
    }

    private final void suspendBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.cancel();
            invalidateCursor(false);
        }
    }

    @l
    public final ColorStateList getBoxBackgroundColor() {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar != null) {
            return kVar.f357034b.f357059c;
        }
        return null;
    }

    @l
    public final ColorStateList getBoxStrokeColor() {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar != null) {
            return kVar.f357034b.f357060d;
        }
        return null;
    }

    @l
    public final Float getBoxStrokeWidth() {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar != null) {
            return Float.valueOf(kVar.f357034b.f357066j);
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    @k
    public MovementMethod getDefaultMovementMethod() {
        return DefaultMovementMethod.INSTANCE;
    }

    @l
    public final Drawable getItemBackground() {
        return this.itemBackground;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    @l
    public final OnTextCompleteListener getOnTextCompleteListener() {
        return this.onTextCompleteListener;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeBlink();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        suspendBlink();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@k Canvas canvas) {
        canvas.save();
        drawPinView(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean focused, int direction, @l Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (focused) {
            moveSelectionToEnd();
            makeBlink();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getPaint().getTextBounds("8", 0, 1, this.rect);
        int iHeight = this.rect.height() + this.itemPadding;
        int i12 = this.itemPadding;
        int iWidth = this.rect.width() + i12 + this.itemPadding;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iHeight + i12;
        int paddingStart = getPaddingStart();
        int i13 = this.itemCount;
        setMeasuredDimension(View.resolveSizeAndState(H.b(i13, 1, this.itemSpacing, (iWidth * i13) + paddingStart), widthMeasureSpec, 0), View.resolveSizeAndState(paddingBottom, heightMeasureSpec, 0));
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int screenState) {
        super.onScreenStateChanged(screenState);
        if (screenState == 0) {
            suspendBlink();
        } else {
            if (screenState != 1) {
                return;
            }
            resumeBlink();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Editable text = getText();
        if (text == null || selEnd != text.length()) {
            moveSelectionToEnd();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(@k CharSequence text, int start, int lengthBefore, int lengthAfter) {
        if (start != text.length()) {
            moveSelectionToEnd();
        }
        makeBlink();
        if (text.length() == this.itemCount) {
            OnTextCompleteListener onTextCompleteListener = this.onTextCompleteListener;
            if (onTextCompleteListener != null ? onTextCompleteListener.onTextComplete(text.toString()) : false) {
                ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
    }

    public final void setBoxBackgroundColor(@l ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar == null) {
            return;
        }
        kVar.n(colorStateList);
    }

    public final void setBoxStrokeColor(@l ColorStateList colorStateList) {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar == null) {
            return;
        }
        kVar.u(colorStateList);
    }

    public final void setBoxStrokeWidth(@l Float f12) {
        if (f12 != null) {
            float fFloatValue = f12.floatValue();
            Drawable drawable = this.itemBackground;
            com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
            if (kVar == null) {
                return;
            }
            kVar.v(fFloatValue);
        }
    }

    public final void setCornerSize(float radius) {
        Drawable drawable = this.itemBackground;
        com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
        if (kVar != null) {
            kVar.l(radius);
        }
    }

    public final void setError(boolean z12) {
        this.isError = z12;
        invalidate();
    }

    public final void setItemBackground(@l Drawable drawable) {
        this.itemBackground = drawable;
    }

    public final void setItemCount(int i12) {
        this.itemCount = i12;
        setMaxLength(i12);
        requestLayout();
    }

    public final void setOnTextCompleteListener(@l OnTextCompleteListener onTextCompleteListener) {
        this.onTextCompleteListener = onTextCompleteListener;
    }

    public /* synthetic */ CBRPinView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? ru.cyberity.cbr.core.R.attr.cbr_pinViewStyle : i12, (i14 & 8) != 0 ? ru.cyberity.cbr.core.R.style.Widget_CBRPinView : i13);
    }

    @j
    public CBRPinView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Float metricDimension;
        Float metricDimension2;
        Integer color;
        Integer color2;
        super(context, attributeSet, i12, i13);
        this.rect = new Rect();
        q qVarA = q.c(context, attributeSet, i12, i13).a();
        this.shapeAppearance = qVarA;
        this.itemBackground = new com.google.android.material.shape.k(qVarA);
        this.itemCount = 6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ru.cyberity.cbr.core.R.styleable.CBRPinView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.cbr.core.R.styleable.CBRPinView_android_itemBackground)) {
            this.itemBackground = typedArrayObtainStyledAttributes.getDrawable(ru.cyberity.cbr.core.R.styleable.CBRPinView_android_itemBackground);
        } else {
            if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxBackgroundColor)) {
                Drawable drawable = this.itemBackground;
                com.google.android.material.shape.k kVar = drawable instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable : null;
                if (kVar != null) {
                    kVar.n(typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxBackgroundColor));
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxStrokeColor)) {
                Drawable drawable2 = this.itemBackground;
                com.google.android.material.shape.k kVar2 = drawable2 instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable2 : null;
                if (kVar2 != null) {
                    kVar2.u(typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxStrokeColor));
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxStrokeWidth)) {
                Drawable drawable3 = this.itemBackground;
                com.google.android.material.shape.k kVar3 = drawable3 instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) drawable3 : null;
                if (kVar3 != null) {
                    kVar3.v(typedArrayObtainStyledAttributes.getDimension(ru.cyberity.cbr.core.R.styleable.CBRPinView_boxStrokeWidth, 0.0f));
                }
            }
        }
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(ru.cyberity.cbr.core.R.styleable.CBRPinView_cbr_itemSpacing, getResources().getDimensionPixelSize(ru.cyberity.cbr.core.R.dimen.cbr_pin_view_item_spacing));
        this.itemPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(ru.cyberity.cbr.core.R.styleable.CBRPinView_cbr_itemPadding, getResources().getDimensionPixelSize(ru.cyberity.cbr.core.R.dimen.cbr_pin_view_item_padding));
        this.isCursorVisible = typedArrayObtainStyledAttributes.getBoolean(ru.cyberity.cbr.core.R.styleable.CBRPinView_android_cursorVisible, true);
        this.cursorDrawable = typedArrayObtainStyledAttributes.getDrawable(ru.cyberity.cbr.core.R.styleable.CBRPinView_cbr_cursorDrawable);
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        setTransformationMethod(null);
        disableSelectionMenu();
        setMaxLength(6);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        themeHelper.applyTheme(this, CBRTypographyElement.HEADLINE1, CBRColorElement.FIELD_CONTENT);
        CBRColorElement cBRColorElement = CBRColorElement.FIELD_BACKGROUND;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color2 = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) != null) {
            setBoxBackgroundColor(ColorStateList.valueOf(color2.intValue()));
        }
        CBRColorElement cBRColorElement2 = CBRColorElement.FIELD_BORDER;
        d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 != null && (color = themeHelper.getColor(customTheme2, cBRColorElement2, themeHelper.isDarkTheme(this))) != null) {
            setBoxStrokeColor(ColorStateList.valueOf(color.intValue()));
        }
        CBRMetricElement cBRMetricElement = CBRMetricElement.FIELD_CORNER_RADIUS;
        d customTheme3 = themeHelper.getCustomTheme();
        if (customTheme3 != null && (metricDimension2 = themeHelper.getMetricDimension(customTheme3, cBRMetricElement)) != null) {
            setCornerSize(metricDimension2.floatValue());
        }
        CBRMetricElement cBRMetricElement2 = CBRMetricElement.FIELD_BORDER_WIDTH;
        d customTheme4 = themeHelper.getCustomTheme();
        if (customTheme4 == null || (metricDimension = themeHelper.getMetricDimension(customTheme4, cBRMetricElement2)) == null) {
            return;
        }
        setBoxStrokeWidth(Float.valueOf(metricDimension.floatValue()));
    }

    /* compiled from: CBRPinView.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/widget/pincode/CBRPinView$DefaultActionModeCallback;", "Landroid/view/ActionMode$Callback;", "<init>", "()V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", ChannelContext.MENU, "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Lkotlin/G0;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class DefaultActionModeCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(@k ActionMode mode, @k MenuItem item) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(@k ActionMode mode, @k Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(@k ActionMode mode, @k Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(@k ActionMode mode) {
        }
    }
}

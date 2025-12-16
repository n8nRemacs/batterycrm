package com.avito.android.messenger.conversation.adapter.platform;

import Y61.k;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: LinkArrowKeyMovementMethod.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/platform/a;", "Landroid/text/method/ArrowKeyMovementMethod;", "<init>", "()V", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends ArrowKeyMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f189262a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final NoCopySpan.Concrete f189263b = new NoCopySpan.Concrete();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Object f189264c = C42727D.b(LazyThreadSafetyMode.f406616d, C5579a.f189265l);

    /* compiled from: LinkArrowKeyMovementMethod.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/platform/a;", "invoke", "()Lcom/avito/android/messenger/conversation/adapter/platform/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.adapter.platform.a$a, reason: collision with other inner class name */
    public static final class C5579a extends N implements Y41.a<a> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5579a f189265l = new C5579a();

        public C5579a() {
            super(0);
        }

        @Override // Y41.a
        public final a invoke() {
            return new a();
        }
    }

    /* compiled from: LinkArrowKeyMovementMethod.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/platform/a$b;", "", "<init>", "()V", "", "CLICK", "I", "DOWN", "Landroid/text/NoCopySpan$Concrete;", "FROM_BELOW", "Landroid/text/NoCopySpan$Concrete;", "UP", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public static boolean a(TextView textView, Spannable spannable, int i12) {
        Layout layout = textView.getLayout();
        int totalPaddingBottom = textView.getTotalPaddingBottom() + textView.getTotalPaddingTop();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingBottom;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int iMin = Math.min(selectionStart, selectionEnd);
        int iMax = Math.max(selectionStart, selectionEnd);
        if (iMin < 0 && spannable.getSpanStart(f189263b) >= 0) {
            iMin = spannable.length();
            iMax = iMin;
        }
        if (iMin > lineEnd) {
            iMax = Integer.MAX_VALUE;
            iMin = Integer.MAX_VALUE;
        }
        int spanStart = -1;
        if (iMax < lineStart) {
            iMax = -1;
            iMin = -1;
        }
        if (i12 == 1) {
            if (iMin == iMax) {
                return false;
            }
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(iMin, iMax, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            clickableSpanArr2[0].onClick(textView);
        } else if (i12 == 2) {
            int length = clickableSpanArr.length;
            int i13 = -1;
            for (int i14 = 0; i14 < length; i14++) {
                int spanEnd = spannable.getSpanEnd(clickableSpanArr[i14]);
                if ((spanEnd < iMax || iMin == iMax) && spanEnd > i13) {
                    spanStart = spannable.getSpanStart(clickableSpanArr[i14]);
                    i13 = spanEnd;
                }
            }
            if (spanStart >= 0) {
                Selection.setSelection(spannable, i13, spanStart);
                return true;
            }
        } else if (i12 == 3) {
            int length2 = clickableSpanArr.length;
            int spanEnd2 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < length2; i16++) {
                int spanStart2 = spannable.getSpanStart(clickableSpanArr[i16]);
                if ((spanStart2 > iMin || iMin == iMax) && spanStart2 < i15) {
                    spanEnd2 = spannable.getSpanEnd(clickableSpanArr[i16]);
                    i15 = spanStart2;
                }
            }
            if (spanEnd2 < Integer.MAX_VALUE) {
                Selection.setSelection(spannable, i15, spanEnd2);
                return true;
            }
        }
        return false;
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod
    public final boolean down(@k TextView textView, @k Spannable spannable) {
        if (a(textView, spannable, 3)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod
    public final boolean handleMovementKey(@k TextView textView, @k Spannable spannable, int i12, int i13, @k KeyEvent keyEvent) {
        if ((i12 == 23 || i12 == 66) && KeyEvent.metaStateHasNoModifiers(i13) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && a(textView, spannable, 1)) {
            return true;
        }
        return super.handleMovementKey(textView, spannable, i12, i13, keyEvent);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void initialize(@k TextView textView, @k Spannable spannable) {
        super.initialize(textView, spannable);
        spannable.removeSpan(f189263b);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod
    public final boolean left(@k TextView textView, @k Spannable spannable) {
        if (a(textView, spannable, 2)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void onTakeFocus(@k TextView textView, @k Spannable spannable, int i12) {
        super.onTakeFocus(textView, spannable, i12);
        int i13 = i12 & 1;
        NoCopySpan.Concrete concrete = f189263b;
        if (i13 != 0) {
            spannable.setSpan(concrete, 0, 0, 34);
        } else {
            spannable.removeSpan(concrete);
        }
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(@k TextView textView, @k Spannable spannable, @k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x12 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            int totalPaddingLeft = x12 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y12 - textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                } else if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod
    public final boolean right(@k TextView textView, @k Spannable spannable) {
        if (a(textView, spannable, 3)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod
    public final boolean up(@k TextView textView, @k Spannable spannable) {
        if (a(textView, spannable, 2)) {
            return true;
        }
        return super.up(textView, spannable);
    }
}

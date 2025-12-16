package com.avito.android.messenger.conversation.adapter.text;

import Y61.k;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: LinkMovementMethodClick.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/b;", "Landroid/text/method/LinkMovementMethod;", "<init>", "()V", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends LinkMovementMethod {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C5580b f189290b = new C5580b(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Object f189291c = C42727D.b(LazyThreadSafetyMode.f406616d, a.f189293l);

    /* renamed from: a, reason: collision with root package name */
    public long f189292a;

    /* compiled from: LinkMovementMethodClick.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/b;", "invoke", "()Lcom/avito/android/messenger/conversation/adapter/text/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f189293l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final b invoke() {
            return new b();
        }
    }

    /* compiled from: LinkMovementMethodClick.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/b$b;", "", "<init>", "()V", "", "CLICK_DELAY", "J", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.adapter.text.b$b, reason: collision with other inner class name */
    public static final class C5580b {
        public /* synthetic */ C5580b(C42822w c42822w) {
            this();
        }

        public C5580b() {
        }
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(@k TextView textView, @k Spannable spannable, @k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            float x12 = motionEvent.getX();
            int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (x12 - textView.getTotalPaddingLeft()) + textView.getScrollX());
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 0) {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                    this.f189292a = System.currentTimeMillis();
                } else if (action == 1 && System.currentTimeMillis() - this.f189292a < 500) {
                    clickableSpan.onClick(textView);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}

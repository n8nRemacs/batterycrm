package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.cei;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.n1d;
import defpackage.q0d;
import defpackage.t5g;
import defpackage.t75;
import defpackage.u6g;
import defpackage.v1a;
import defpackage.yeb;
import ru.ok.messages.messages.widgets.ChatMsgSearchResultView;

/* loaded from: classes2.dex */
public class ChatMsgSearchResultView extends ConstraintLayout implements u6g {
    public static final /* synthetic */ int K0 = 0;
    public final TextView F0;
    public final ImageView G0;
    public final ImageView H0;
    public final ProgressBar I0;
    public final View J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMsgSearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        View.inflate(context, n1d.chat_msg_search_result_view, this);
        this.F0 = (TextView) findViewById(q0d.chat_msg_search_result_view__result);
        ImageView imageView = (ImageView) findViewById(q0d.chat_msg_search_result_view__next);
        this.G0 = imageView;
        f8j.d(imageView, 100L, new View.OnClickListener(this) { // from class: ls2
            public final /* synthetic */ ChatMsgSearchResultView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ChatMsgSearchResultView chatMsgSearchResultView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ChatMsgSearchResultView.K0;
                        chatMsgSearchResultView.getClass();
                        Log.i("ru.ok.messages.messages.widgets.ChatMsgSearchResultView", "Click top button");
                        break;
                    default:
                        int i4 = ChatMsgSearchResultView.K0;
                        chatMsgSearchResultView.getClass();
                        Log.i("ru.ok.messages.messages.widgets.ChatMsgSearchResultView", "Click bottom button");
                        break;
                }
            }
        });
        ImageView imageView2 = (ImageView) findViewById(q0d.chat_msg_search_result_view__prev);
        this.H0 = imageView2;
        final int i2 = 1;
        f8j.d(imageView2, 100L, new View.OnClickListener(this) { // from class: ls2
            public final /* synthetic */ ChatMsgSearchResultView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ChatMsgSearchResultView chatMsgSearchResultView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ChatMsgSearchResultView.K0;
                        chatMsgSearchResultView.getClass();
                        Log.i("ru.ok.messages.messages.widgets.ChatMsgSearchResultView", "Click top button");
                        break;
                    default:
                        int i4 = ChatMsgSearchResultView.K0;
                        chatMsgSearchResultView.getClass();
                        Log.i("ru.ok.messages.messages.widgets.ChatMsgSearchResultView", "Click bottom button");
                        break;
                }
            }
        });
        this.I0 = (ProgressBar) findViewById(q0d.chat_msg_search_result_view__pb_loading);
        this.J0 = findViewById(q0d.chat_msg_search_result_view_next_prev_separator);
        b();
    }

    public final void b() {
        v1a v1aVar = a93.s0;
        yeb yebVarY = v1aVar.y(this);
        setBackgroundColor(yebVarY.a().k().a.d);
        ImageView imageView = this.G0;
        boolean zIsEnabled = imageView.isEnabled();
        yeb yebVarY2 = v1aVar.y(this);
        imageView.setColorFilter(!zIsEnabled ? yebVarY2.c().b.a.f : yebVarY2.getIcon().f);
        imageView.setEnabled(zIsEnabled);
        imageView.setVisibility(0);
        ImageView imageView2 = this.H0;
        boolean zIsEnabled2 = imageView2.isEnabled();
        yeb yebVarY3 = v1aVar.y(this);
        imageView2.setColorFilter(!zIsEnabled2 ? yebVarY3.c().b.a.f : yebVarY3.getIcon().f);
        imageView2.setEnabled(zIsEnabled2);
        imageView2.setVisibility(0);
        cei.l(this.I0, yebVarY.e().c);
        t5g t5gVar = dpg.h;
        t75 t75Var = t75.b;
        TextView textView = this.F0;
        t5gVar.b(textView, t75Var);
        textView.setTextColor(yebVarY.getText().h);
        this.J0.setBackgroundColor(yebVarY.getIcon().h);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}

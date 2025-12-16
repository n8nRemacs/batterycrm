package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.Iterator;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class j81 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j81(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                Iterator it = ((CallEventsWidget) obj).d.iterator();
                while (it.hasNext()) {
                    CallScreen callScreen = ((nl1) it.next()).a;
                    rha rhaVar = CallScreen.N0;
                    callScreen.G0().c();
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new vy1(13, carouselLayoutManager));
                    break;
                }
            case 2:
                ChatScreen chatScreen = (ChatScreen) obj;
                bbd bbdVar = chatScreen.W0;
                yy7[] yy7VarArr = ChatScreen.l1;
                if (chatScreen.getView() != null) {
                    int measuredHeight = view.getMeasuredHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams = chatScreen.c1().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (measuredHeight != (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                        ((ViewGroup.MarginLayoutParams) chatScreen.c1().getLayoutParams()).bottomMargin = Math.max(measuredHeight, kti.d(48 * vw4.d().getDisplayMetrics().density));
                    }
                    ViewGroup.LayoutParams layoutParams2 = chatScreen.f1().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (measuredHeight != (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = chatScreen.f1().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (marginLayoutParams3 != null) {
                            marginLayoutParams3.bottomMargin = measuredHeight;
                        }
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    yy7[] yy7VarArr2 = ChatScreen.l1;
                    if (measuredHeight2 != ((LinearLayout) bbdVar.D(chatScreen, yy7VarArr2[16])).getPaddingBottom()) {
                        LinearLayout linearLayout = (LinearLayout) bbdVar.D(chatScreen, yy7VarArr2[16]);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 3:
                yy7[] yy7VarArr3 = MediaBarWidget.c1;
                sn0 sn0Var = ((MediaBarWidget) obj).x0;
                yy7 yy7Var = MediaBarWidget.c1[7];
                f82 f82Var = (f82) sn0Var.getValue();
                f82Var.setPadding(f82Var.getPaddingLeft(), f82Var.getPaddingTop(), f82Var.getPaddingRight(), i4 - i2);
                break;
            default:
                a9c a9cVar = (a9c) obj;
                a9cVar.getClass();
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    a9cVar.b();
                    a9cVar.a(true);
                    break;
                }
                break;
        }
    }
}

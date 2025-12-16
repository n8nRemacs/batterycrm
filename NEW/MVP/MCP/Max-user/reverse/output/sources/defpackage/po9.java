package defpackage;

import android.net.Uri;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class po9 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ po9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 4;
        int i3 = 2;
        int i4 = 1;
        qqg qqgVar = qqg.a;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                xfh.r(messageWriteWidget.I0().y0, new wn9((Uri) obj));
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                ik9 ik9Var = new ik9(viewGroup.getContext());
                MessageWriteWidget messageWriteWidget2 = this.b;
                ik9Var.setTextSelectionListener(new ao6(23, messageWriteWidget2));
                int i5 = 3;
                GestureDetector gestureDetector = new GestureDetector(ik9Var.getContext(), new pr6(1, new oo9(messageWriteWidget2, i5)));
                gestureDetector.setIsLongpressEnabled(false);
                ik9Var.setLeftInnerIconTouchListener(new or6(gestureDetector, 3));
                ik9Var.setRightInnerIconVisible(true);
                int i6 = 0;
                GestureDetector gestureDetector2 = new GestureDetector(ik9Var.getContext(), new pr6(1, new o91(0, messageWriteWidget2, MessageWriteWidget.class, "onClickAttachPicker", "onClickAttachPicker()V", i6, 22)));
                gestureDetector2.setIsLongpressEnabled(false);
                ik9Var.setRightInnerIconTouchListener(new or6(gestureDetector2, 3));
                int i7 = 0;
                ik9Var.setRightOuterIconTouchListener(new fi1(new jx0(1, messageWriteWidget2, MessageWriteWidget.class, "onTouch", "onTouch(Landroid/view/MotionEvent;)V", i6, 29), i3, new GestureDetector(ik9Var.getContext(), new of3(new o91(i7, messageWriteWidget2, MessageWriteWidget.class, "onRightOuterIconClick", "onRightOuterIconClick()V", i6, 23), 2, new o91(i7, messageWriteWidget2, MessageWriteWidget.class, "onSendLongClick", "onSendLongClick()V", i6, 24)))));
                ik9Var.setVideoMessageTouchListener(new ml1(i5, messageWriteWidget2));
                if (((Boolean) messageWriteWidget2.v0.getValue()).booleanValue()) {
                    ik9Var.d.addTextChangedListener(new bde(new uj9(ik9Var, 7), new po9(messageWriteWidget2, i5)));
                }
                ik9Var.setCustomSelectionActionModeCallback(new po9(messageWriteWidget2, i2));
                viewGroup.addView(ik9Var);
                View f82Var = new f82(viewGroup.getContext());
                f82Var.setId(mab.x);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                f82Var.setLayoutParams(layoutParams);
                f82Var.setBackgroundColor(0);
                viewGroup.addView(f82Var);
                break;
            case 2:
                hl8 hl8Var = (hl8) obj;
                yy7[] yy7VarArr3 = MessageWriteWidget.L0;
                int selectionStart = messageWriteWidget.C0().getSelectionStart();
                int selectionEnd = messageWriteWidget.C0().getSelectionEnd();
                Editable editableOriginal = messageWriteWidget.C0().getEditableOriginal();
                bl8 bl8VarD0 = messageWriteWidget.D0();
                bl8VarD0.getClass();
                if (editableOriginal != null && editableOriginal.length() != 0) {
                    int i8 = hl8Var.a;
                    xfh.r(bl8VarD0.Z, i8 == s0d.markdown_link ? new el8(editableOriginal, selectionStart, selectionEnd) : new fl8(i8, editableOriginal, selectionStart, selectionEnd));
                    bl8.t(bl8VarD0, 1);
                    break;
                }
                break;
            case 3:
                yy7[] yy7VarArr4 = MessageWriteWidget.L0;
                messageWriteWidget.M0((CharSequence) obj);
                break;
            case 4:
                yy7[] yy7VarArr5 = MessageWriteWidget.L0;
                hbd hbdVar = ((v3b) messageWriteWidget.u0.getValue()).a;
                gu5 gu5Var = (gu5) ((rt5) messageWriteWidget.t0.getValue());
                gu5Var.getClass();
                dp8 dp8Var = new dp8((EditText) obj, hbdVar, gu5Var.j(PmsKey.f124quotesenabled, false), new iv6(25, messageWriteWidget));
                messageWriteWidget.D0 = dp8Var;
                break;
            case 5:
                LinearLayout linearLayout = (LinearLayout) obj;
                yy7[] yy7VarArr6 = MessageWriteWidget.L0;
                po9 po9Var = new po9(messageWriteWidget, i4);
                View frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(mab.w);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                po9Var.invoke(frameLayout);
                linearLayout.addView(frameLayout);
                if (((Boolean) messageWriteWidget.J0.getValue()).booleanValue()) {
                    RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                    recyclerView.setId(tzc.writebar__miui_menu);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, kti.d(4 * vw4.d().getDisplayMetrics().density));
                    recyclerView.setLayoutParams(layoutParams2);
                    recyclerView.setMinimumHeight(kti.d(36 * vw4.d().getDisplayMetrics().density));
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                    recyclerView.setAdapter((dl8) messageWriteWidget.I0.getValue());
                    recyclerView.j(new m01(6));
                    recyclerView.setHorizontalFadingEdgeEnabled(true);
                    recyclerView.setOverScrollMode(2);
                    recyclerView.setFadingEdgeLength(kti.d(50 * vw4.d().getDisplayMetrics().density));
                    recyclerView.setHasFixedSize(true);
                    linearLayout.addView(recyclerView);
                    break;
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yy7[] yy7VarArr7 = MessageWriteWidget.L0;
                if (zBooleanValue) {
                    no9.C(messageWriteWidget.I0(), 2);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}

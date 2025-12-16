package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.appbar.MaterialToolbar;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class wzd extends dp5 {
    public static final /* synthetic */ yy7[] s0 = {new toc(wzd.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0), ho7.d(vid.a, wzd.class, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), new toc(wzd.class, "datePickerDivider", "getDatePickerDivider()Landroid/view/View;", 0), new toc(wzd.class, "notificationCheckbox", "getNotificationCheckbox()Landroidx/appcompat/widget/AppCompatCheckBox;", 0), new toc(wzd.class, "sendButton", "getSendButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0), new toc(wzd.class, "setCorrectTimeTextView", "getSetCorrectTimeTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    public final jkc c = a(t0d.toolbar);
    public final jkc d = a(t0d.date_time_picker);
    public final jkc o = a(t0d.date_picker_divider);
    public final jkc X = a(t0d.send_with_notification_checkbox);
    public final jkc Y = a(t0d.send_button);
    public final jkc Z = a(t0d.set_correct_time);

    public final DateTimePicker b() {
        return (DateTimePicker) this.d.D(this, s0[1]);
    }

    public final LongRoundedTitleSubtitleButton c() {
        return (LongRoundedTitleSubtitleButton) this.Y.D(this, s0[4]);
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        yy7[] yy7VarArr = s0;
        ((View) this.o.D(this, yy7VarArr[2])).setBackgroundColor(q1gVar.K);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.c.D(this, yy7VarArr[0]);
        int i = q1gVar.w;
        materialToolbar.setTitleTextColor(i);
        materialToolbar.setNavigationIconTint(i);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.X.D(this, yy7VarArr[3]);
        int i2 = q1gVar.k;
        appCompatCheckBox.setHighlightColor(i2);
        appCompatCheckBox.setButtonTintList(ColorStateList.valueOf(i2));
        appCompatCheckBox.setTextColor(i);
        cei.b(q1gVar, c(), kti.d(42 * vw4.d().getDisplayMetrics().density));
        ((AppCompatTextView) this.Z.D(this, yy7VarArr[5])).setTextColor(q1gVar.y);
    }
}

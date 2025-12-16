package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class jr7 extends ConstraintLayout implements u6g {
    public final /* synthetic */ int F0 = 1;
    public final Object G0;

    public jr7(VpnPanelWidget vpnPanelWidget, Context context) {
        super(context, null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setLayoutParams(new kt3(-2, -2));
        appCompatImageView.setId(eyc.call_screen_vpn_connection_icon);
        appCompatImageView.setImageDrawable(r34.b(appCompatImageView.getContext(), kwc.ic_connection_fill_28).mutate());
        appCompatImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFD60A")));
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setLayoutParams(new kt3(-2, -2));
        oneMeButton.setId(eyc.call_screen_vpn_dismiss_button_id);
        oneMeButton.setSize(jza.a);
        oneMeButton.setAppearance(gza.o);
        oneMeButton.setText(oneMeButton.getContext().getString(d3d.call_screen_snackbar_button_text));
        oneMeButton.setMode(iza.d);
        oneMeButton.setOnClickListener(new pcc(28, vpnPanelWidget));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setLayoutParams(new kt3(0, -2));
        appCompatTextView.setId(eyc.call_screen_vpn_title_id);
        dpg.h.b(appCompatTextView, t75.b);
        v1a v1aVar = a93.s0;
        v1aVar.y(appCompatTextView).getText();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(appCompatTextView.getContext().getString(d3d.call_screen_snackbar_title));
        appCompatTextView.setMaxLines(2);
        this.G0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        appCompatTextView2.setId(eyc.call_screen_vpn_caption_id);
        appCompatTextView2.setLayoutParams(new kt3(0, -2));
        dpg.j.b(appCompatTextView2, t75.b);
        v1aVar.y(appCompatTextView2).getText();
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(d3d.call_screen_snackbar_caption));
        appCompatTextView2.setMaxLines(2);
        setId(eyc.call_screen_vpn_container_id);
        setLayoutParams(new kt3(-1, -2));
        setMinimumHeight(kti.d(56 * vw4.d().getDisplayMetrics().density));
        float f = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        setPadding(iD, iD, iD, iD);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(v1aVar.y(this).b().e);
        addView(appCompatImageView);
        addView(oneMeButton);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatTextView.getId();
        ut3VarG.d(id, 6, appCompatImageView.getId(), 7);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id, 5));
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, oneMeButton.getId(), 6);
        new fua(ut3VarG, 7, id, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        ut3VarG.d(id, 4, appCompatTextView2.getId(), 3);
        int id2 = appCompatImageView.getId();
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        int id3 = appCompatTextView2.getId();
        ut3VarG.d(id3, 6, appCompatImageView.getId(), 7);
        new fua(ut3VarG, 6, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        ut3VarG.d(id3, 7, oneMeButton.getId(), 6);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id3, 3, appCompatTextView.getId(), 4);
        new fua(ut3VarG, 3, id3, 5).e(kti.d(2 * vw4.d().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.a(this);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        switch (this.F0) {
            case 0:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.G0;
                bbd bbdVar = inviteByPhoneScreen.X;
                yy7[] yy7VarArr = InviteByPhoneScreen.z0;
                ((TextView) bbdVar.D(inviteByPhoneScreen, yy7VarArr[1])).setTextColor(yebVar.getText().e);
                ((TextView) inviteByPhoneScreen.Y.D(inviteByPhoneScreen, yy7VarArr[2])).setTextColor(yebVar.getText().g);
                AppCompatTextView appCompatTextView = inviteByPhoneScreen.u0;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextColor(yebVar.getText().b);
                }
                inviteByPhoneScreen.A0().onThemeChanged(yebVar);
                inviteByPhoneScreen.z0().onThemeChanged(yebVar);
                ((yfb) inviteByPhoneScreen.t0.D(inviteByPhoneScreen, yy7VarArr[5])).onThemeChanged(yebVar);
                break;
            default:
                setBackgroundColor(yebVar.b().e);
                ((AppCompatTextView) this.G0).setTextColor(-1);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr7(InviteByPhoneScreen inviteByPhoneScreen, Context context) {
        super(context);
        this.G0 = inviteByPhoneScreen;
    }
}

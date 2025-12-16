package one.me.dialogs.share.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.avd;
import defpackage.aw0;
import defpackage.b6g;
import defpackage.ccb;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gk2;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.h54;
import defpackage.hk1;
import defpackage.hk2;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.i6c;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kcb;
import defpackage.kti;
import defpackage.l38;
import defpackage.m3d;
import defpackage.o05;
import defpackage.ok2;
import defpackage.pue;
import defpackage.q;
import defpackage.q2b;
import defpackage.qcb;
import defpackage.r00;
import defpackage.r6;
import defpackage.toc;
import defpackage.ts4;
import defpackage.vid;
import defpackage.vw4;
import defpackage.xfh;
import defpackage.yeb;
import defpackage.yk2;
import defpackage.yy7;
import defpackage.z7;
import defpackage.zb2;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "share-media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] I0 = {new toc(ChatMediaDownloadBottomSheet.class, "forceDarkTheme", "getForceDarkTheme()Z", 0), ho7.d(vid.a, ChatMediaDownloadBottomSheet.class, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    public final k18 C0;
    public final Object D0;
    public final k18 E0;
    public ts4 F0;
    public final hs G0;
    public final hs H0;

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(yk2.class, new q(29, new zb2(13)));
        this.C0 = k18VarCreateViewModelLazy;
        this.D0 = ipi.b(3, new hk1(9, this));
        this.E0 = pue.a.getAccessor().d(454);
        this.G0 = new hs(Boolean.class, "arg:force_dark");
        this.H0 = new hs(Integer.class, "arg:snack_bot_margin");
        yk2 yk2Var = (yk2) k18VarCreateViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yk2Var.y0 = xfh.o(yk2Var, ((q2b) yk2Var.c).b(), new ok2(yk2Var, j, string, (o05) o05.Z.get(bundle.getInt("arg:cause")), j2, null), 2);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        yeb yebVar = a93.s0.z(getContext()).c;
        yy7 yy7Var = I0[0];
        if (((Boolean) this.G0.a(this)).booleanValue()) {
            return yebVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kti.d(223 * vw4.d().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = kti.d(27 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        yeb yebVarC0 = C0();
        if (yebVarC0 == null) {
            yebVarC0 = a93.s0.y(textView);
        }
        textView.setTextColor(yebVarC0.getText().e);
        r00 r00Var = (r00) this.D0.getValue();
        ArrayList arrayList = b6g.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, r00Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(kti.d(12 * vw4.d().getDisplayMetrics().density));
        textView.setText(m3d.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), null);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density), 81));
        oneMeButton.setCustomTheme(C0());
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.c);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setText(avd.k);
        f8j.d(oneMeButton, 300L, new r6(4, this));
        frameLayout2.addView(oneMeButton);
        return frameLayout2;
    }

    public final void O0(int i, int i2) {
        ccb ccbVar = (ccb) this.E0.getValue();
        ccbVar.h(z7.e(getContext(), i));
        ccbVar.e(new qcb(i2));
        yy7 yy7Var = I0[1];
        Integer num = (Integer) this.H0.a(this);
        if (num != null) {
            ccbVar.c(new kcb(0, 0, num.intValue(), 3));
        }
        ccbVar.i();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        this.F0 = h54Var instanceof ts4 ? (ts4) h54Var : null;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((yk2) this.C0.getValue()).v();
        this.F0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(((yk2) this.C0.getValue()).x0, getViewLifecycleOwner().p(), l38.d), new hk2(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new gk2(this, 0);
    }

    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this(gwi.b(new imb("arg:msg_id", Long.valueOf(j)), new imb("arg:attach_id", Long.valueOf(j2)), new imb("arg:local_attach_id", str), new imb("arg:cause", Integer.valueOf(i)), new imb("arg:snack_bot_margin", num), new imb("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}

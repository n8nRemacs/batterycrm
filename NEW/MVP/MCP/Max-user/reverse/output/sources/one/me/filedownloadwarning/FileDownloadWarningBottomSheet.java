package one.me.filedownloadwarning;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.az1;
import defpackage.bud;
import defpackage.c54;
import defpackage.eud;
import defpackage.f7f;
import defpackage.fw5;
import defpackage.gwi;
import defpackage.h3b;
import defpackage.i3b;
import defpackage.imb;
import defpackage.jw5;
import defpackage.k18;
import defpackage.kw5;
import defpackage.lzf;
import defpackage.m54;
import defpackage.n5g;
import defpackage.oq3;
import defpackage.pq3;
import defpackage.q2b;
import defpackage.qq3;
import defpackage.r8d;
import defpackage.sc4;
import defpackage.wj1;
import defpackage.xfh;
import defpackage.yo3;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.zz;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BC\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/filedownloadwarning/FileDownloadWarningBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "", "attachId", "fileId", "fileName", "fileUrl", "fileSize", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V", "file-download-warning_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FileDownloadWarningBottomSheet extends Widget implements qq3 {
    public static final /* synthetic */ int c = 0;
    public final k18 a;
    public final k18 b;

    public FileDownloadWarningBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(kw5.class, new yo3(11, new wj1(bundle, 5)));
        this.b = fw5.a.getAccessor().d(160);
    }

    @Override // defpackage.qq3
    public final void F(Bundle bundle) {
        kw5 kw5VarY0 = y0();
        ((zz) kw5VarY0.w0.getValue()).a(new r8d(kw5VarY0.c, kw5VarY0.Z));
        f7f f7fVarT = y0().t();
        if (f7fVarT != null) {
            ((sc4) this.b.getValue()).a(f7fVarT, 3);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        int i2 = h3b.a;
        k18 k18Var = this.b;
        if (i == i2) {
            kw5 kw5VarY0 = y0();
            kw5VarY0.x0.O(kw5VarY0, kw5.y0[0], xfh.o(kw5VarY0, ((q2b) ((lzf) kw5VarY0.s0.getValue())).b(), new jw5(kw5VarY0, null), 2));
            f7f f7fVarT = y0().t();
            if (f7fVarT != null) {
                ((sc4) k18Var.getValue()).a(f7fVarT, 2);
                return;
            }
            return;
        }
        if (i == h3b.b) {
            kw5 kw5VarY02 = y0();
            ((zz) kw5VarY02.w0.getValue()).a(new r8d(kw5VarY02.c, kw5VarY02.Z));
            f7f f7fVarT2 = y0().t();
            if (f7fVarT2 != null) {
                ((sc4) k18Var.getValue()).a(f7fVarT2, 3);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(i3b.d, null, null, 6);
        oq3VarE.f(new n5g(i3b.c));
        oq3VarE.a(new pq3(h3b.b, new n5g(i3b.b), 3, true, 3, 3), new pq3(h3b.a, new n5g(i3b.a), 2, 32));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        confirmationBottomSheetE.addLifecycleListener(new m54(2, this));
        confirmationBottomSheetE.setTargetController(this);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(this);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
        f7f f7fVarT = y0().t();
        if (f7fVarT != null) {
            ((sc4) this.b.getValue()).a(f7fVarT, 1);
        }
    }

    public final kw5 y0() {
        return (kw5) this.a.getValue();
    }

    public FileDownloadWarningBottomSheet(long j, long j2, String str, long j3, String str2, String str3, long j4) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j)), new imb("message_id", Long.valueOf(j2)), new imb("attach_id", str), new imb("file_id", Long.valueOf(j3)), new imb("file_name", str2), new imb("file_url", str3), new imb("file_size", Long.valueOf(j4))));
    }
}

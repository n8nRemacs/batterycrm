package one.me.chatscreen.mediabar.mediatypepicker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a1g;
import defpackage.ab9;
import defpackage.ap7;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bb9;
import defpackage.cb9;
import defpackage.ccb;
import defpackage.cf8;
import defpackage.eb9;
import defpackage.f1e;
import defpackage.fb9;
import defpackage.g56;
import defpackage.gb9;
import defpackage.gda;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iv8;
import defpackage.k18;
import defpackage.l38;
import defpackage.l48;
import defpackage.lzf;
import defpackage.mvd;
import defpackage.ob9;
import defpackage.pb9;
import defpackage.q2b;
import defpackage.qb9;
import defpackage.qq3;
import defpackage.sn0;
import defpackage.svi;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.uv2;
import defpackage.vid;
import defpackage.wa9;
import defpackage.wqi;
import defpackage.xfh;
import defpackage.yy7;
import defpackage.z7;
import java.io.Serializable;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "parentScope", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLtk4;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaTypePickerWidget extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] X = {new toc(MediaTypePickerWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, MediaTypePickerWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), new toc(MediaTypePickerWidget.class, "root", "getRoot()Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerButtonsView;", 0)};
    public final hs a;
    public final hs b;
    public final k18 c;
    public final sn0 d;
    public final gda o;

    public MediaTypePickerWidget(String str, long j, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("MediaTypePickerWidget.chat_id", Long.valueOf(j))));
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == 1) {
            xfh.r(y0().b.b, bb9.a);
            return;
        }
        if (i != 2) {
            return;
        }
        try {
            String str = ap7.a;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            startActivityForResult(intent, 373);
            gda.g(this.o, f1e.CHAT_SYSTEM_FILE_VIEWER);
        } catch (ActivityNotFoundException unused) {
            ccb ccbVar = new ccb(this);
            ccbVar.h(z7.e(getContext(), mvd.I0));
            ccbVar.i();
        }
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        a1g a1gVar = null;
        a1gVar = null;
        if (i != 371) {
            if (i != 373) {
                wqi.e("MediaTypePickerWidget", "Unexpected onActivityResult code " + i2, null);
                return;
            } else {
                if (intent == null || (data = intent.getData()) == null) {
                    return;
                }
                gb9 gb9VarY0 = y0();
                svi.e(gb9VarY0.a, ((q2b) ((lzf) gb9VarY0.s0.getValue())).b(), null, new fb9(data, gb9VarY0, null), 2);
                return;
            }
        }
        if (i2 == -1 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("ru.ok.tamtam.extra.LOCATION");
            cf8 cf8Var = serializableExtra instanceof cf8 ? (cf8) serializableExtra : null;
            if (cf8Var == null) {
                cf8Var = cf8.Y;
            }
            a1gVar = new a1g(intent.getFloatExtra("ru.ok.tamtam.extra.ZOOM", 0.0f), intent.getLongExtra("ru.ok.tamtam.extra.LIVE", 0L), cf8Var);
        }
        if (a1gVar != null) {
            gb9 gb9VarY02 = y0();
            cf8 cf8Var2 = a1gVar.a;
            float f = a1gVar.c;
            long j = a1gVar.b;
            eb9 eb9Var = gb9VarY02.b;
            xfh.r(eb9Var.b, new cb9(f, j, cf8Var2));
            xfh.r(eb9Var.b, ab9.a);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yy7 yy7Var = X[2];
        return (wa9) this.d.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        tcf tcfVar = y0().o;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(tcfVar, l48VarP, l38Var), new pb9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().X, getViewLifecycleOwner().p(), l38Var), new qb9(null, this), 1), getViewLifecycleScope());
    }

    public final gb9 y0() {
        return (gb9) this.c.getValue();
    }

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, "MediaTypePickerWidget.chat_id");
        this.b = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        this.c = createViewModelLazy(gb9.class, new iv8(8, new ob9(this, 0)));
        this.d = binding(new ob9(this, 1));
        this.o = (gda) uv2.a.getAccessor().c(151);
    }
}

package one.me.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bbd;
import defpackage.bud;
import defpackage.c38;
import defpackage.f82;
import defpackage.ii8;
import defpackage.toc;
import defpackage.vid;
import defpackage.xyc;
import defpackage.yo3;
import defpackage.ytd;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class LoginScreen extends Widget {
    public static final /* synthetic */ yy7[] c;
    public final bbd a;
    public final String b;

    static {
        toc tocVar = new toc(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0);
        vid.a.getClass();
        c = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = Widget.childRouter$default(this, xyc.oneme_login_conductor, null, 2, null);
        this.b = "LoginScope";
        createViewModelLazy(ii8.class, new yo3(26, new c38(8)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f82 f82Var = new f82(getContext());
        f82Var.setId(xyc.oneme_login_conductor);
        f82Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return f82Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yy7[] yy7VarArr = c;
        yy7 yy7Var = yy7VarArr[0];
        bbd bbdVar = this.a;
        if (((ytd) bbdVar.D(this, yy7Var)).n()) {
            return;
        }
        ((ytd) bbdVar.D(this, yy7VarArr[0])).e = 1;
        ytd ytdVar = (ytd) bbdVar.D(this, yy7VarArr[0]);
        bud budVar = new bud(new InputPhoneScreen(), null, null, null, false, -1);
        budVar.d("InputPhoneScreen");
        ytdVar.S(budVar);
    }
}

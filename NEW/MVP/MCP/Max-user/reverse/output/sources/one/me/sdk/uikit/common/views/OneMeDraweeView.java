package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.brf;
import defpackage.c2c;
import defpackage.cf7;
import defpackage.df7;
import defpackage.md0;
import defpackage.nj7;
import defpackage.pe4;
import defpackage.pe7;
import defpackage.qpd;
import defpackage.rf7;
import defpackage.rpd;
import defpackage.ve3;
import defpackage.xt4;
import defpackage.yn6;
import defpackage.zk6;
import defpackage.zn6;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withAutoPlay", "Lqqg;", "setupNewController", "(Z)V", "Lpe4;", "Lvc3;", "Lsc3;", "getCurrentDataSource", "()Lpe4;", "currentDataSource", "xt4", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OneMeDraweeView extends SimpleDraweeView {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;
    public final String w0;
    public final rpd x0;
    public final xt4 y0;
    public final md0 z0;

    public OneMeDraweeView(Context context) {
        super(context);
        this.w0 = getClass().getName();
        rpd rpdVar = new rpd();
        this.x0 = rpdVar;
        this.y0 = new xt4(28, rpdVar);
        this.z0 = new md0(3, this);
        setupNewController(false);
    }

    public final pe4 getCurrentDataSource() {
        xt4 xt4Var = this.y0;
        qpd qpdVar = (qpd) xt4Var.c;
        if (qpdVar == null || qpdVar.f()) {
            rpd rpdVar = (rpd) xt4Var.b;
            qpd qpdVar2 = new qpd();
            qpdVar2.h = null;
            qpdVar2.o(rpdVar.b);
            rpdVar.a.add(qpdVar2);
            xt4Var.c = qpdVar2;
        }
        return (qpd) xt4Var.c;
    }

    public final void i(rf7 rf7Var, rf7 rf7Var2) {
        brf cf7Var;
        rpd rpdVar = this.x0;
        if (rf7Var == null) {
            if (rf7Var2 == null) {
                setController(null);
                return;
            }
            df7 df7VarE = zk6.e();
            df7VarE.getClass();
            rpdVar.a(new cf7(df7VarE, rf7Var2, null));
            if (getController() == null) {
                setupNewController(this.A0);
                return;
            }
            return;
        }
        if (rf7Var2 != null) {
            df7 df7VarE2 = zk6.e();
            df7VarE2.getClass();
            cf7 cf7Var2 = new cf7(df7VarE2, rf7Var, null);
            df7 df7VarE3 = zk6.e();
            df7VarE3.getClass();
            cf7Var = new nj7(ve3.j(cf7Var2, new cf7(df7VarE3, rf7Var2, null)), false);
        } else {
            df7 df7VarE4 = zk6.e();
            df7VarE4.getClass();
            cf7Var = new cf7(df7VarE4, rf7Var, null);
        }
        rpdVar.a(cf7Var);
        if (getController() == null) {
            setupNewController(this.A0);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new yn6(this, 24, drawable));
        } else {
            post(new zn6(this, 20, drawable));
        }
    }

    public void j(pe7 pe7Var, Animatable animatable) {
    }

    public final void setupNewController(boolean withAutoPlay) {
        this.A0 = withAutoPlay;
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = this.x0;
        c2cVarA.e = this.z0;
        c2cVarA.i = getController();
        c2cVarA.g = withAutoPlay;
        setController(c2cVarA.a());
    }

    public OneMeDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = getClass().getName();
        rpd rpdVar = new rpd();
        this.x0 = rpdVar;
        this.y0 = new xt4(28, rpdVar);
        this.z0 = new md0(3, this);
        setupNewController(false);
    }
}

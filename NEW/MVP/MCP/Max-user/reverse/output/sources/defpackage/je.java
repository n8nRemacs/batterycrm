package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;

/* loaded from: classes.dex */
public final class je extends u08 implements cm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Bundle Z;
    public final /* synthetic */ AndroidXLifecycleHandlerImpl a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent d;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super(0);
        this.a = androidXLifecycleHandlerImpl;
        this.b = intentSender;
        this.c = i;
        this.d = intent;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = bundle;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.a;
        if (androidXLifecycleHandlerImpl.E0 == null) {
            throw new IllegalStateException("Fragment " + androidXLifecycleHandlerImpl + " not attached to Activity");
        }
        boolean zK = c.K(2);
        IntentSender intentSender = this.b;
        int i = this.c;
        Intent intent = this.d;
        Bundle bundle = this.Z;
        if (zK) {
            Log.v("FragmentManager", "Fragment " + androidXLifecycleHandlerImpl + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        c cVarX = androidXLifecycleHandlerImpl.x();
        u5i u5iVar = cVarX.D;
        int i2 = this.o;
        int i3 = this.X;
        if (u5iVar != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent = new Intent();
                    intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (c.K(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + androidXLifecycleHandlerImpl);
                }
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            zo7 zo7Var = new zo7(intentSender, intent, i2, i3);
            cVarX.F.addLast(new oi6(androidXLifecycleHandlerImpl.o, i));
            if (c.K(2)) {
                Log.v("FragmentManager", "Fragment " + androidXLifecycleHandlerImpl + "is launching an IntentSender for result ");
            }
            cVarX.D.n(zo7Var);
        } else {
            ei6 ei6Var = cVarX.w;
            if (i != -1) {
                ei6Var.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            b bVar = ei6Var.c;
            if (bVar == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            bVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.Y, bundle);
        }
        return qqg.a;
    }
}

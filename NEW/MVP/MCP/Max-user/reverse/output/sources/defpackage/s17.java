package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s17 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ t17 Y;
    public File o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s17(t17 t17Var, Continuation continuation) {
        super(2, continuation);
        this.Y = t17Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s17) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s17(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        File fileH;
        t17 t17Var = this.Y;
        k18 k18Var = t17Var.c;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            fileH = ((iz5) k18Var.getValue()).h("oneme_heap_dump.hprof");
            Debug.dumpHprofData(fileH.getAbsolutePath());
            wl8 immediate = ((q2b) ((lzf) t17Var.b.getValue())).c().getImmediate();
            r17 r17Var = new r17(t17Var, fileH, null);
            this.o = fileH;
            this.X = 1;
            Object objI = svi.i(immediate, r17Var, this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileH = this.o;
            g8j.b(obj);
        }
        Context context = (Context) t17Var.a.getValue();
        Uri uriF = ((iz5) k18Var.getValue()).f(context, fileH);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", uriF);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        intentCreateChooser.addFlags(268435456);
        Iterator<T> it = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriF, 3);
        }
        context.startActivity(intentCreateChooser);
        return qqg.a;
    }
}

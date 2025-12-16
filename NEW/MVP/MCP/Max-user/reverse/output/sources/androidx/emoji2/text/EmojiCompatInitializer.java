package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.de6;
import defpackage.hc8;
import defpackage.j48;
import defpackage.l48;
import defpackage.ta5;
import defpackage.ul7;
import defpackage.va5;
import defpackage.xa5;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements ul7 {
    @Override // defpackage.ul7
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ul7
    public final Object b(Context context) {
        Object objB;
        de6 de6Var = new de6(new xa5(context));
        de6Var.e = 1;
        ta5.c(de6Var);
        hc8 hc8VarD = hc8.D(context);
        hc8VarD.getClass();
        synchronized (hc8.s0) {
            try {
                objB = ((HashMap) hc8VarD.b).get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = hc8VarD.B(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l48 l48VarP = ((j48) objB).p();
        l48VarP.a(new va5(this, l48VarP));
        return Boolean.TRUE;
    }
}

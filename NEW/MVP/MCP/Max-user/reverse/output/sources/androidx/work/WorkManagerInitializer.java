package androidx.work;

import android.content.Context;
import defpackage.c5i;
import defpackage.cei;
import defpackage.qo3;
import defpackage.uaj;
import defpackage.ul7;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements ul7 {
    public static final String a = cei.m("WrkMgrInitializer");

    @Override // defpackage.ul7
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ul7
    public final Object b(Context context) {
        cei.g().c(a, "Initializing WorkManager with default configuration.");
        c5i.e(context, new qo3(new uaj(2)));
        return c5i.d(context);
    }
}

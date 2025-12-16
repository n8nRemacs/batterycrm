package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.b6a;
import defpackage.jg;
import defpackage.ul7;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements ul7 {
    @Override // defpackage.ul7
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ul7
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new jg(this, context.getApplicationContext()));
        return new b6a(27);
    }
}

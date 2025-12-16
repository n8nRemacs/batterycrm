package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class e5i extends ContextWrapper implements oo3 {
    public final /* synthetic */ g5i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5i(g5i g5iVar, Context context) {
        super(context);
        this.a = g5iVar;
    }

    @Override // defpackage.oo3
    public final qo3 a() {
        return ((oo3) this.a.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}

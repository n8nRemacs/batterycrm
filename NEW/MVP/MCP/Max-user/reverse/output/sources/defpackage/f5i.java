package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class f5i extends ContextWrapper implements oo3 {
    public final e5i a;
    public final /* synthetic */ g5i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5i(g5i g5iVar, Context context) {
        super(context);
        this.b = g5iVar;
        this.a = new e5i(g5iVar, g5iVar.a.getApplicationContext());
    }

    @Override // defpackage.oo3
    public final qo3 a() {
        return ((oo3) this.b.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }
}

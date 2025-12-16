package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class w20 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w20(x20 x20Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x20Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        x20 x20Var = this.c;
        x20Var.a(u20.b((Context) x20Var.b, (k20) x20Var.j, (ao6) x20Var.i));
    }
}

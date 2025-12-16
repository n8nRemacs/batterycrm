package t31;

import android.content.Context;
import androidx.appcompat.app.r;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42729a0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f439138l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f439138l = cVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        c cVar = this.f439138l;
        Context context = cVar.f439139a;
        String strQ = r.q(context.getPackageName(), "session_store");
        Object obj = cVar.f439140b;
        C42729a0.b(obj);
        return EncryptedSharedPreferences.a(context, strQ, (MasterKey) obj);
    }
}

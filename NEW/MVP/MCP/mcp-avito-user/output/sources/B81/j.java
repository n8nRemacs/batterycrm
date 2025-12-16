package B81;

import android.content.Context;
import androidx.appcompat.app.r;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42729a0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class j extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.f907l = kVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        k kVar = this.f907l;
        Context context = kVar.f908a;
        String strQ = r.q(context.getPackageName(), "at_store");
        Object obj = kVar.f910c;
        C42729a0.b(obj);
        return EncryptedSharedPreferences.a(context, strQ, (MasterKey) obj);
    }
}

package vc1;

import android.content.Context;
import androidx.appcompat.app.r;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42729a0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f440907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f440907l = cVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        c cVar = this.f440907l;
        Context context = cVar.f440908a;
        String strQ = r.q(context.getPackageName(), "elk_store");
        Object obj = cVar.f440909b;
        C42729a0.b(obj);
        return EncryptedSharedPreferences.a(context, strQ, (MasterKey) obj);
    }
}

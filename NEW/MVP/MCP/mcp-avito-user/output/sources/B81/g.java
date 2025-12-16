package B81;

import android.content.Context;
import androidx.appcompat.app.r;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42729a0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f901l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f901l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        h hVar = this.f901l;
        Context context = hVar.f902a;
        String strQ = r.q(context.getPackageName(), "session_store");
        Object obj = hVar.f903b;
        C42729a0.b(obj);
        return EncryptedSharedPreferences.a(context, strQ, (MasterKey) obj);
    }
}

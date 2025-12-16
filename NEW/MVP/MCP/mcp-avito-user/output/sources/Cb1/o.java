package cb1;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.f;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class o extends N implements Y41.l<CorruptionException, androidx.datastore.preferences.core.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f58030l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(1);
        this.f58030l = str;
    }

    @Override // Y41.l
    public final androidx.datastore.preferences.core.f invoke(CorruptionException corruptionException) {
        CorruptionException corruptionException2 = corruptionException;
        Qa1.p pVar = C27166e.f57981b;
        (pVar != null ? pVar.f13854c : new T11.c("VkpnsClientSdk")).error(this.f58030l + " data store was initialized with default values, " + corruptionException2, null);
        return androidx.datastore.preferences.core.g.a(new f.b[0]);
    }
}

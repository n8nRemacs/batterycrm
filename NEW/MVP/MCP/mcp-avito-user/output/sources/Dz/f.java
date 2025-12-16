package dZ;

import Y61.k;
import androidx.work.C23544h;
import kotlin.Metadata;

/* compiled from: InfoPersistHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdZ/f;", "LdZ/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23544h.a f393913a;

    public f(C23544h.a aVar) {
        this.f393913a = aVar;
    }

    @Override // dZ.i
    public final void a(int i12, @k String str) {
        C23544h.a aVar = this.f393913a;
        aVar.f55511a.put(str, Integer.valueOf(i12));
    }

    @Override // dZ.i
    public final void b(boolean z12) {
        C23544h.a aVar = this.f393913a;
        aVar.f55511a.put("userIsEmployee", Boolean.valueOf(z12));
    }

    @Override // dZ.i
    public final void putString(@k String str, @k String str2) {
        this.f393913a.f55511a.put(str, str2);
    }
}

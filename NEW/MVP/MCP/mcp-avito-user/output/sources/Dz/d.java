package dZ;

import Y61.k;
import Y61.l;
import androidx.work.C23544h;
import kotlin.Metadata;

/* compiled from: InfoPersistHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdZ/d;", "LdZ/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23544h f393911a;

    public d(C23544h c23544h) {
        this.f393911a = c23544h;
    }

    @Override // dZ.h
    public final int a(@k String str) {
        Object obj = this.f393911a.f55510a.get(str);
        return ((Number) (obj instanceof Integer ? obj : 0)).intValue();
    }

    @Override // dZ.h
    public final boolean b() {
        return this.f393911a.a("userIsEmployee", false);
    }

    @Override // dZ.h
    @l
    public final String getString(@k String str) {
        return this.f393911a.c(str);
    }
}

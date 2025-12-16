package dZ;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: InfoPersistHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdZ/c;", "LdZ/h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39685c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f393910a;

    public C39685c(Bundle bundle) {
        this.f393910a = bundle;
    }

    @Override // dZ.h
    public final int a(@k String str) {
        return this.f393910a.getInt(str);
    }

    @Override // dZ.h
    public final boolean b() {
        return this.f393910a.getBoolean("userIsEmployee", false);
    }

    @Override // dZ.h
    @l
    public final String getString(@k String str) {
        return this.f393910a.getString(str);
    }
}

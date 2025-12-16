package com.avito.android.silent_update.permissions;

import Y61.l;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

/* compiled from: PermissionsActivityIntentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/permissions/d;", "Lcom/avito/android/silent_update/permissions/c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f283700a;

    public d(@Y61.k Context context) {
        this.f283700a = context;
    }

    @Override // com.avito.android.silent_update.permissions.c
    @Y61.k
    public final Intent a(@l String str) {
        PermissionsActivity.f283678t.getClass();
        return new Intent(this.f283700a, (Class<?>) PermissionsActivity.class).putExtra("ARG_SOURCE_SCREEN", str);
    }
}

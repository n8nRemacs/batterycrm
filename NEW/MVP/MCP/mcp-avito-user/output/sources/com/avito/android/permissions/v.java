package com.avito.android.permissions;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PermissionChecker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/v;", "Lcom/avito/android/permissions/u;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f215145a;

    @Inject
    public v(@Y61.k Context context) {
        this.f215145a = context;
    }

    @Override // com.avito.android.permissions.u
    public final boolean b(@Y61.k String str) {
        return androidx.core.content.d.checkSelfPermission(this.f215145a, str) == 0;
    }

    @Override // com.avito.android.permissions.u
    public final boolean c(@Y61.k String[] strArr, @Y61.k int[] iArr, @Y61.k String str) {
        if (iArr.length == strArr.length) {
            int length = strArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (str.equals(strArr[i12])) {
                    return iArr[i12] == 0;
                }
            }
        }
        return false;
    }
}

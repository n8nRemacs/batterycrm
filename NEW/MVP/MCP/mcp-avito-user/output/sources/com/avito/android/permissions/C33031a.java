package com.avito.android.permissions;

import androidx.core.app.C22744b;
import kotlin.Metadata;

/* compiled from: ActivityPermissionHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/permissions/a;", "Lcom/avito/android/permissions/x;", "Lcom/avito/android/permissions/u;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.permissions.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33031a implements x, u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.activity.a f215109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f215110b;

    public C33031a(@Y61.k com.avito.android.ui.activity.a aVar) {
        this.f215109a = aVar;
        this.f215110b = new v(aVar);
    }

    @Override // com.avito.android.permissions.x
    public final boolean a(@Y61.k String str) {
        return C22744b.b(this.f215109a, str);
    }

    @Override // com.avito.android.permissions.u
    public final boolean b(@Y61.k String str) {
        return this.f215110b.b(str);
    }

    @Override // com.avito.android.permissions.u
    public final boolean c(@Y61.k String[] strArr, @Y61.k int[] iArr, @Y61.k String str) {
        return this.f215110b.c(strArr, iArr, str);
    }

    @Override // com.avito.android.permissions.x
    public final void d(int i12, @Y61.k String... strArr) {
        C22744b.a(this.f215109a, strArr, i12);
    }
}

package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import java.util.Map;
import kotlin.Metadata;
import rv.C47920c;

/* compiled from: PermissionSystemRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lrv/c;", "it", "apply", "(Ljava/util/Map;)Lrv/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionSystemRequestLink f169241b;

    public z(PermissionSystemRequestLink permissionSystemRequestLink) {
        this.f169241b = permissionSystemRequestLink;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C47920c c47920c = (C47920c) ((Map) obj).get(this.f169241b.f169260b);
        if (c47920c != null) {
            return c47920c;
        }
        C47920c.f437160c.getClass();
        return new C47920c(false, false);
    }
}

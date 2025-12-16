package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PermissionSystemRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lrv/c;", "it", "", "test", "(Ljava/util/Map;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionSystemRequestLink f169240b;

    public y(PermissionSystemRequestLink permissionSystemRequestLink) {
        this.f169240b = permissionSystemRequestLink;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return ((Map) obj).containsKey(this.f169240b.f169260b);
    }
}

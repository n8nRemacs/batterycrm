package com.avito.android.iac_dialer.impl_module.screens.call_screen.permission;

import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;
import l41.r;

/* compiled from: IacCallScreenPermissionRequesterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f166272b;

    public c(String str) {
        this.f166272b = str;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        C43501a c43501a = (C43501a) obj;
        return L.f(c43501a.f413260a.f134521b, this.f166272b) && (c43501a.f413261b instanceof SetFlowResultLink.b);
    }
}

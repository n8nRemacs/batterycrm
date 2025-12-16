package com.avito.android.authorization.reset_password;

import com.avito.android.code_check_public.CodeCheckLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final t<T> f94207b = new t<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        com.avito.android.deeplink_handler.handler.bundle.a aVar = ((C43501a) obj).f413260a;
        return (aVar.f134520a instanceof CodeCheckLink) && L.f(aVar.f134521b, "code_check.confirm_reset_password");
    }
}

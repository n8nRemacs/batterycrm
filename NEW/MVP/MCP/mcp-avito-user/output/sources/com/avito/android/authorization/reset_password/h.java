package com.avito.android.authorization.reset_password;

import Vo.C15699a;
import com.avito.android.remote.model.ResetPasswordResult;
import kotlin.Metadata;

/* compiled from: ResetPasswordInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVo/a;", "it", "Lcom/avito/android/remote/model/ResetPasswordResult;", "apply", "(LVo/a;)Lcom/avito/android/remote/model/ResetPasswordResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final h<T, R> f94173b = new h<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        C15699a c15699a = (C15699a) obj;
        return new ResetPasswordResult.ViaCode(c15699a.f17383a, c15699a.f17384b, 5);
    }
}

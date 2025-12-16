package com.avito.android.authorization.select_profile;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import le.InterfaceC43738c;

/* compiled from: SelectProfileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lle/c;", "typedResult", "Lio/reactivex/rxjava3/core/O;", "Lle/c$b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final f<T, R> f94326b = new f<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return I.l(new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        InterfaceC43738c interfaceC43738c = (InterfaceC43738c) success.getResult();
        if (!(interfaceC43738c instanceof InterfaceC43738c.a)) {
            if (interfaceC43738c instanceof InterfaceC43738c.b) {
                return I.q((InterfaceC43738c.b) success.getResult());
            }
            throw new NoWhenBranchMatchedException();
        }
        String hash = ((InterfaceC43738c.a) interfaceC43738c).getMessages().getHash();
        if (hash == null) {
            hash = "";
        }
        return I.l(new ApiException(com.avito.android.remote.error.j.a(2, hash, null), null, 2, null));
    }
}

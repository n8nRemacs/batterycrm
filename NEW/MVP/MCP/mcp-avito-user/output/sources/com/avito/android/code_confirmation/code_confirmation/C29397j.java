package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.util.ApiException;
import kotlin.Metadata;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/ConfirmCodeResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29397j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f119559b;

    public C29397j(r rVar) {
        this.f119559b = rVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return io.reactivex.rxjava3.core.I.l(new ApiException(this.f119559b.f119622d.a((Throwable) obj), null, 2, null));
    }
}

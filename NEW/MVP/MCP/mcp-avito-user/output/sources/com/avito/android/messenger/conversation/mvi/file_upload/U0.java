package com.avito.android.messenger.conversation.mvi.file_upload;

import arrow.core.C23703n1;
import com.avito.android.persistence.messenger.C33136x2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/x2;", "optionalMessageUploadPart", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/persistence/messenger/TransferStatus;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class U0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final U0<T, R> f191098b = new U0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("No such MessageUploadPart entry found in db"));
        }
        if (y02 instanceof C23703n1) {
            return io.reactivex.rxjava3.core.z.c0(((C33136x2) ((C23703n1) y02).f56288b).f215577g);
        }
        throw new NoWhenBranchMatchedException();
    }
}

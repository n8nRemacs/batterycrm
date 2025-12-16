package com.avito.android.messenger.conversation.mvi.file_upload;

import arrow.core.C23703n1;
import com.avito.android.persistence.messenger.Q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FileUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/Q1;", "optionalMetaInfo", "Lio/reactivex/rxjava3/core/E;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32107z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32107z<T, R> f191338b = new C32107z<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("No such metainfo entry found in db"));
        }
        if (y02 instanceof C23703n1) {
            return io.reactivex.rxjava3.core.z.c0((Q1) ((C23703n1) y02).f56288b);
        }
        throw new NoWhenBranchMatchedException();
    }
}

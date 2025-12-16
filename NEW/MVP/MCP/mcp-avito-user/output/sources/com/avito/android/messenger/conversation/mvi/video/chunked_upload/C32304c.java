package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.persistence.messenger.C33136x2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/M0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.video.chunked_upload.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32304c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f194929b;

    public C32304c(f fVar) {
        this.f194929b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return C41823n.f402260b;
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        return com.avito.android.messenger.conversation.mvi.file_attachment.y.a(this.f194929b.f194934b, ((C33136x2) ((C23703n1) y02).f56288b).f215576f, "ChunkedVideoUploadManager");
    }
}

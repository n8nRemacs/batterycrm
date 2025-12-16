package com.avito.android.messenger.conversation.mvi.file_attachment;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.file_attachment.FileAttachmentException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f190701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190702c;

    public b(j jVar, long j12) {
        this.f190701b = jVar;
        this.f190702c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return I.l(FileAttachmentException.NoSuchFileFoundException.f190698b);
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        m mVar = (m) ((C23703n1) y02).f56288b;
        this.f190701b.getClass();
        long j12 = mVar.f190721c;
        long j13 = this.f190702c;
        if (j12 <= j13) {
            return I.q(mVar);
        }
        String strN0 = C43066x.n0('.', mVar.f190719a, "");
        if (C43066x.K(strN0)) {
            strN0 = null;
        }
        return I.l(new FileAttachmentException.FileMaxSizeExceeded(mVar.f190721c, j13, strN0));
    }
}

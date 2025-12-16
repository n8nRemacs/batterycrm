package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.o;
import com.avito.android.persistence.messenger.Q1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/M0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.b.C5761b f194965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f194966c;

    public q(o.b.C5761b c5761b, o oVar) {
        this.f194965b = c5761b;
        this.f194966c = oVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aA;
        String str;
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return C41823n.f402260b;
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        Q1 q12 = (Q1) ((C23703n1) y02).f56288b;
        String str2 = q12.f215300s;
        o.b.C5761b c5761b = this.f194965b;
        String str3 = c5761b.f194962b;
        AbstractC32094s0.b bVar = c5761b.f194961a;
        long j12 = bVar.f191225e;
        long j13 = bVar.f191224d;
        o oVar = this.f194966c;
        if (j12 <= 1 || j13 != j12) {
            abstractC41768aA = C41823n.f402260b;
            str = null;
        } else {
            com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = oVar.f194955c;
            str = q12.f215286e;
            abstractC41768aA = com.avito.android.messenger.conversation.mvi.file_attachment.y.a(nVar, str, "ChunkedVideoUploadWorkerDelegate");
        }
        return abstractC41768aA.g((str2 == null || C43066x.K(str2) || str2.equals(str3) || str2.equals(str) || j13 != bVar.f191225e) ? C41823n.f402260b : com.avito.android.messenger.conversation.mvi.file_attachment.y.a(oVar.f194955c, str2, "ChunkedVideoUploadWorkerDelegate"));
    }
}

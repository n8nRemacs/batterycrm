package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import arrow.core.C23703n1;
import com.avito.android.persistence.messenger.Q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32103x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32097u f191320b;

    public C32103x(C32097u c32097u) {
        this.f191320b = c32097u;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return io.reactivex.rxjava3.core.I.l(new IllegalStateException("No metainfo found for this file message"));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((Q1) ((C23703n1) y02).f56288b).f215285d;
        return str != null ? this.f191320b.f191233b.e(Uri.parse(str)) : io.reactivex.rxjava3.core.I.l(new IllegalStateException("No URI found for this file message"));
    }
}

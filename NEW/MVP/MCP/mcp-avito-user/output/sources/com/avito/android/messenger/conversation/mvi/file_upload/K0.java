package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/O0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class K0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f191049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191052e;

    public K0(AbstractC32094s0.a aVar, C32104x0 c32104x0, com.jakewharton.rxrelay3.c cVar, AtomicBoolean atomicBoolean) {
        this.f191049b = cVar;
        this.f191050c = c32104x0;
        this.f191051d = aVar;
        this.f191052e = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.jakewharton.rxrelay3.c cVar = this.f191049b;
        return new C41826q(new J0(this.f191051d, this.f191050c, cVar, this.f191052e));
    }
}

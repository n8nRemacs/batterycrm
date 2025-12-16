package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/O0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class B0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f190992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32092r0 f190993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateChunkedVideoFileResponse f190994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f190995e;

    public B0(C32104x0 c32104x0, C32092r0 c32092r0, CreateChunkedVideoFileResponse createChunkedVideoFileResponse, AbstractC32094s0.a aVar) {
        this.f190992b = c32104x0;
        this.f190993c = c32092r0;
        this.f190994d = createChunkedVideoFileResponse;
        this.f190995e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C41826q(new A0(this.f190992b, this.f190993c, this.f190994d, this.f190995e));
    }
}

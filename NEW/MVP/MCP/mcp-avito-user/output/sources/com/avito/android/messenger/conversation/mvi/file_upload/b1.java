package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b;
import com.avito.android.persistence.messenger.TransferStatus;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: Completables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class b1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f191117c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateChunkedVideoFileResponse f191118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f191119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C32092r0 f191121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191122h;

    public b1(C32104x0 c32104x0, AbstractC32094s0.b bVar, CreateChunkedVideoFileResponse createChunkedVideoFileResponse, File file, String str, C32092r0 c32092r0, AtomicBoolean atomicBoolean) {
        this.f191116b = c32104x0;
        this.f191117c = bVar;
        this.f191118d = createChunkedVideoFileResponse;
        this.f191119e = file;
        this.f191120f = str;
        this.f191121g = c32092r0;
        this.f191122h = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32104x0 c32104x0 = this.f191116b;
        InterfaceC32303b interfaceC32303b = c32104x0.f191334m;
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse = this.f191118d;
        String fileId = createChunkedVideoFileResponse.getFileId();
        String path = this.f191119e.getPath();
        String uploadSessionId = createChunkedVideoFileResponse.getUploadSessionId();
        C32092r0 c32092r0 = this.f191121g;
        String name = c32092r0.f191207b;
        if (name == null) {
            name = c32092r0.f191206a.getName();
        }
        AbstractC32094s0.b bVar = this.f191117c;
        return new C42026y(io.reactivex.rxjava3.core.z.k(c32104x0.f191322a.r(bVar.f191222b, bVar.f191223c, bVar.f191221a, bVar.f191224d).T(U0.f191098b, Integer.MAX_VALUE), new io.reactivex.rxjava3.internal.operators.mixed.a(interfaceC32303b.a(bVar, fileId, path, this.f191120f, uploadSessionId, c32092r0.f191209d, name).k(new Z0(bVar, this.f191122h, c32104x0)).l(new a1(c32104x0)), io.reactivex.rxjava3.core.z.c0(TransferStatus.IN_PROGRESS)), new c1()).N(X0.f191105b).S(), new Y0(bVar));
    }
}

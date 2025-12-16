package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.analytics.C31660p;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import kotlin.Metadata;
import l41.InterfaceC43543a;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/N0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f190987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32092r0 f190988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateChunkedVideoFileResponse f190989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f190990e;

    public A0(C32104x0 c32104x0, C32092r0 c32092r0, CreateChunkedVideoFileResponse createChunkedVideoFileResponse, AbstractC32094s0.a aVar) {
        this.f190987b = c32104x0;
        this.f190988c = c32092r0;
        this.f190989d = createChunkedVideoFileResponse;
        this.f190990e = aVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse = this.f190989d;
        String videoId = createChunkedVideoFileResponse.getVideoId();
        String fileId = createChunkedVideoFileResponse.getFileId();
        String str = this.f190990e.f191220c;
        int i12 = C32104x0.f191321p;
        C32104x0 c32104x0 = this.f190987b;
        c32104x0.getClass();
        C32092r0 c32092r0 = this.f190988c;
        c32104x0.f191328g.c(new C31660p(str, fileId, videoId, c32092r0.f191210e, c32092r0.f191208c, Long.valueOf(c32092r0.f191211f), null, null, 192, null));
    }
}

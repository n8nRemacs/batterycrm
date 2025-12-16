package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.util.V2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Z0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f191109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191111d;

    public Z0(AbstractC32094s0.b bVar, AtomicBoolean atomicBoolean, C32104x0 c32104x0) {
        this.f191109b = bVar;
        this.f191110c = atomicBoolean;
        this.f191111d = c32104x0;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        V2.f318762a.c("VideoUploadInteractorImpl", "Uploading video chunk has started, uploadId = " + this.f191109b, null);
        if (this.f191110c.compareAndSet(false, true)) {
            this.f191111d.f191331j.a("upload.uploading_started");
        }
    }
}

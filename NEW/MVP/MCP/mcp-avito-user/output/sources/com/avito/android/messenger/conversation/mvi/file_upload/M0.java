package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import com.avito.android.messenger.conversation.mvi.video.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/b$b;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/video/b$b;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f191061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f191062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f191063e;

    public M0(Uri uri, C32104x0 c32104x0, File file, String str) {
        this.f191060b = c32104x0;
        this.f191061c = uri;
        this.f191062d = file;
        this.f191063e = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.I iB2;
        b.AbstractC5756b abstractC5756b = (b.AbstractC5756b) obj;
        boolean z12 = abstractC5756b instanceof b.AbstractC5756b.C5757b;
        Uri uri = this.f191061c;
        C32104x0 c32104x0 = this.f191060b;
        if (z12) {
            c32104x0.f191331j.a("compression.succeeded");
            iB2 = C32104x0.b(c32104x0, C32104x0.c(c32104x0, uri, ((b.AbstractC5756b.C5757b) abstractC5756b).f194887a));
        } else {
            if (!(abstractC5756b instanceof b.AbstractC5756b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c32104x0.f191331j.a("compression.not_needed");
            this.f191062d.delete();
            iB2 = C32104x0.b(c32104x0, c32104x0.d(uri, this.f191063e));
        }
        return iB2.r(L0.f191053b);
    }
}

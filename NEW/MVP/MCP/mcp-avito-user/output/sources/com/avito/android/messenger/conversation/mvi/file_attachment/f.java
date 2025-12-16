package com.avito.android.messenger.conversation.mvi.file_attachment;

import com.avito.android.messenger.conversation.mvi.file_attachment.FileAttachmentException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: FileAttachmentInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;", "kotlin.jvm.PlatformType", "videoInfo", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f190707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f190708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f190709d;

    public f(long j12, j jVar, long j13) {
        this.f190707b = j12;
        this.f190708c = jVar;
        this.f190709d = j13;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        z zVar = (z) obj;
        if (zVar.f190761b <= this.f190707b) {
            long j12 = zVar.f190762c;
            long j13 = this.f190709d;
            return j12 > j13 ? I.l(new FileAttachmentException.VideoMaxDurationExceeded(j12, j13)) : I.q(zVar);
        }
        this.f190708c.getClass();
        String strN0 = C43066x.n0('.', zVar.f190760a, "");
        if (C43066x.K(strN0)) {
            strN0 = null;
        }
        return I.l(new FileAttachmentException.FileMaxSizeExceeded(zVar.f190761b, this.f190707b, strN0));
    }
}

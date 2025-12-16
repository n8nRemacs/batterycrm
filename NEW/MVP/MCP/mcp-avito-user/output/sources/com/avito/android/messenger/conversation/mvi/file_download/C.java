package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadException;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f190775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f190779f;

    public C(x xVar, Integer num, String str, String str2, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190775b = xVar;
        this.f190776c = messengerUserHashInfo;
        this.f190777d = str;
        this.f190778e = str2;
        this.f190779f = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        return this.f190775b.f190961b.y(this.f190776c, this.f190777d, this.f190778e, this.f190779f).g(AbstractC41768a.o(th2 instanceof FileDownloadException ? (FileDownloadException) th2 : new FileDownloadException.Unknown(th2)));
    }
}

package com.avito.android.messenger.conversation.mvi.file_download;

import arrow.core.Y0;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Landroid/net/Uri;", "resultUriOption", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f190780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f190781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f190784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<FileChunkMetaInfo> f190785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f190786h;

    public D(File file, x xVar, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, List<FileChunkMetaInfo> list, Integer num) {
        this.f190780b = file;
        this.f190781c = xVar;
        this.f190782d = messengerUserHashInfo;
        this.f190783e = str;
        this.f190784f = str2;
        this.f190785g = list;
        this.f190786h = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f190780b.delete();
        return this.f190781c.f190961b.A(this.f190782d, this.f190783e, this.f190784f, null, this.f190785g, this.f190786h).B((Y0) obj);
    }
}

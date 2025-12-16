package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.x;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import com.avito.android.persistence.messenger.Q1;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "fileInfo", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Landroid/net/Uri;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f190974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q1 f190978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f190979g;

    public y(x xVar, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, Q1 q12, Integer num) {
        this.f190974b = xVar;
        this.f190975c = messengerUserHashInfo;
        this.f190976d = str;
        this.f190977e = str2;
        this.f190978f = q12;
        this.f190979g = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        x.a aVar = (x.a) obj;
        x xVar = this.f190974b;
        String strF = xVar.f190964e.f(aVar.f190969b, aVar.f190970c);
        Q1 q12 = this.f190978f;
        List<FileChunkMetaInfo> list = q12 != null ? q12.f215303v : null;
        InterfaceC32046j interfaceC32046j = xVar.f190963d;
        String str = aVar.f190968a;
        return interfaceC32046j.a(str, aVar.f190971d).n(new H(xVar, this.f190975c, this.f190976d, this.f190977e, list, this.f190979g, str, aVar.f190973f, aVar.f190969b, strF, aVar.f190972e));
    }
}

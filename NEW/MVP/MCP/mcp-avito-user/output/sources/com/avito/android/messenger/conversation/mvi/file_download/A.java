package com.avito.android.messenger.conversation.mvi.file_download;

import android.net.Uri;
import android.os.Parcelable;
import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.analytics.C31659o;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadException;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/M0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f190763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f190764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f190765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f190767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f190768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q1 f190769h;

    public A(Integer num, LocalMessage localMessage, x xVar, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, Q1 q12) {
        this.f190763b = num;
        this.f190764c = localMessage;
        this.f190765d = xVar;
        this.f190766e = messengerUserHashInfo;
        this.f190767f = str;
        this.f190768g = str2;
        this.f190769h = q12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String fileId;
        List<MessageBody.SystemMessageBody.Platform.Bubble> chunks;
        String fileId2;
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return AbstractC41768a.o(new FileDownloadException.CacheAndCopyFailed());
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        Uri uri = (Uri) ((C23703n1) y02).f56288b;
        String str = this.f190767f;
        MessengerUserHashInfo messengerUserHashInfo = this.f190766e;
        String str2 = this.f190768g;
        LocalMessage localMessage = this.f190764c;
        Integer num = this.f190763b;
        x xVar = this.f190765d;
        if (num == null) {
            MessageBody body = localMessage.getBody();
            MessageBody.File file = body instanceof MessageBody.File ? (MessageBody.File) body : null;
            if (file != null && (fileId2 = file.getFileId()) != null) {
                xVar.f190965f.c(new C31659o(str, fileId2));
            }
            return xVar.f190961b.v(messengerUserHashInfo, str, str2, uri.toString(), null, null);
        }
        MessageBody body2 = localMessage.getBody();
        MessageBody.SystemMessageBody.Platform platform = body2 instanceof MessageBody.SystemMessageBody.Platform ? (MessageBody.SystemMessageBody.Platform) body2 : null;
        Parcelable parcelable = (platform == null || (chunks = platform.getChunks()) == null) ? null : (MessageBody.SystemMessageBody.Platform.Bubble) chunks.get(num.intValue());
        MessageBody.SystemMessageBody.Platform.Bubble.File file2 = parcelable instanceof MessageBody.SystemMessageBody.Platform.Bubble.File ? (MessageBody.SystemMessageBody.Platform.Bubble.File) parcelable : null;
        if (file2 != null && (fileId = file2.getFileId()) != null) {
            new C31659o(str, fileId);
        }
        return xVar.f190961b.v(messengerUserHashInfo, str, str2, uri.toString(), this.f190763b, this.f190769h);
    }
}

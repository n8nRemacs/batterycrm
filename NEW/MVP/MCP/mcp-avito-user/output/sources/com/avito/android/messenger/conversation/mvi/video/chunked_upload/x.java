package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32058a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChunkedVideoUploadWorkerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/x;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/w;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f194978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32061b0 f194980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32058a f194981d;

    /* compiled from: ChunkedVideoUploadWorkerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/x$a;", "", "<init>", "()V", "", "CHUNKED_VIDEO_UPLOAD_PATH", "Ljava/lang/String;", "FILE_MEDIA_TYPE", "FILE_QUERY", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public x(@Y61.k w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32061b0 interfaceC32061b0, @Y61.k InterfaceC32058a interfaceC32058a) {
        this.f194978a = w0Var;
        this.f194979b = interfaceC35745a5;
        this.f194980c = interfaceC32061b0;
        this.f194981d = interfaceC32058a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.chunked_upload.w
    @Y61.k
    public final C42026y a(@Y61.k AbstractC32094s0.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6) {
        return this.f194978a.g().x0(this.f194979b.a()).S().n(new y(bVar, this)).n(new z(str4, str5, str6, this, str, str3, str2, bVar));
    }
}

package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32058a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.A;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadWorkerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/r;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/q;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f191305a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f191306b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32061b0 f191307c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32058a f191308d;

    /* compiled from: FileUploadWorkerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/r$a;", "", "<init>", "()V", "", "FILE_QUERY", "Ljava/lang/String;", "FILE_UPLOAD_PATH", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public r(@Y61.k w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32061b0 interfaceC32061b0, @Y61.k InterfaceC32058a interfaceC32058a) {
        this.f191305a = w0Var;
        this.f191306b = interfaceC35745a5;
        this.f191307c = interfaceC32061b0;
        this.f191308d = interfaceC32058a;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.worker.q
    @Y61.k
    public final A a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        return (A) this.f191305a.g().x0(this.f191306b.a()).S().n(new s(messengerUserHashInfo, this)).o(new t(str2, str3, str4, this, str));
    }
}

package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateFileResponse;

/* compiled from: FileUploadInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32097u implements InterfaceC32095t {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f191231i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191232a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191233b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f191234c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32060b f191235d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f191236e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191237f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_upload.worker.c f191238g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f191239h = C42727D.c(new b());

    /* compiled from: FileUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FileUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/x;", "invoke", "()Lcom/avito/android/messenger/analytics/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C31667x> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C31667x invoke() {
            C32097u c32097u = C32097u.this;
            return new C31667x(c32097u.f191237f, c32097u.f191236e);
        }
    }

    /* compiled from: FileUploadInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u$c */
    public static final class c implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f191241b;

        public c(Y41.l lVar) {
            this.f191241b = lVar;
        }

        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f191241b.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C32097u(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC32060b interfaceC32060b, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.conversation.mvi.file_upload.worker.c cVar) {
        this.f191232a = interfaceC32024m;
        this.f191233b = nVar;
        this.f191234c = interfaceC47842z;
        this.f191235d = interfaceC32060b;
        this.f191236e = c30277e1;
        this.f191237f = interfaceC28373a;
        this.f191238g = cVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        AbstractC32094s0.a aVar = new AbstractC32094s0.a(str2, str, messengerUserHashInfo);
        V2.f318762a.c("FileUploadInteractorImpl", "File uploading flow has started for uploadId = " + aVar, null);
        io.reactivex.rxjava3.internal.operators.completable.r rVarA = this.f191235d.a();
        InterfaceC32024m interfaceC32024m = this.f191232a;
        return rVarA.g(interfaceC32024m.e0(str, str2, messengerUserHashInfo)).h(interfaceC32024m.Z(str, str2, messengerUserHashInfo).n(new C32101w(this, str))).n(new N(aVar, this, messengerUserHashInfo, str, str2)).i(new O(this, aVar)).u(new com.avito.android.analytics.clickstream.I(29));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k MessageBody.File file) {
        AbstractC32094s0.a aVar = new AbstractC32094s0.a(str2, str, messengerUserHashInfo);
        V2.f318762a.c("FileUploadInteractorImpl", "File uploading flow has started for uploadId = " + aVar, null);
        return this.f191235d.a().g(this.f191232a.e0(str, str2, messengerUserHashInfo)).h(this.f191234c.createFile(str).r(new c(new kotlin.jvm.internal.h0() { // from class: com.avito.android.messenger.conversation.mvi.file_upload.v
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((CreateFileResponse) obj).getFileId();
            }
        }))).n(new G(aVar, this, messengerUserHashInfo, str, str2, file)).i(new H(this, aVar)).u(new com.avito.android.analytics.clickstream.I(28));
    }
}

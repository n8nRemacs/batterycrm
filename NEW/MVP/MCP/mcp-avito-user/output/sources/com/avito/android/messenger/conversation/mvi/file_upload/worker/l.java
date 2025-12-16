package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.I;
import io.reactivex.rxjava3.internal.operators.single.A;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadWorkerDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/l;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/k;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f191293e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f191294a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191295b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f191296c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31667x f191297d;

    /* compiled from: FileUploadWorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public l(@Y61.k q qVar, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k C31667x c31667x) {
        this.f191294a = qVar;
        this.f191295b = interfaceC32024m;
        this.f191296c = nVar;
        this.f191297d = c31667x;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.worker.k
    @Y61.k
    public final AbstractC41768a a(@Y61.k AbstractC32094s0.a aVar, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, boolean z12) {
        A a12 = this.f191294a.a(aVar.f191219b, str, str3, str2, str4);
        InterfaceC32024m interfaceC32024m = this.f191295b;
        MessengerUserHashInfo messengerUserHashInfo = aVar.f191219b;
        String str5 = aVar.f191220c;
        String str6 = aVar.f191218a;
        I iR2 = a12.g(interfaceC32024m.V(str5, str6, messengerUserHashInfo)).l(new o(this)).s(io.reactivex.rxjava3.internal.functions.a.g(interfaceC32024m.y(messengerUserHashInfo, str5, str6, null))).r();
        return z12 ? iR2.g(new io.reactivex.rxjava3.internal.operators.completable.v(this.f191296c.b(str3).k(new m(str3)).i(n.f191299b)).r()) : iR2;
    }
}

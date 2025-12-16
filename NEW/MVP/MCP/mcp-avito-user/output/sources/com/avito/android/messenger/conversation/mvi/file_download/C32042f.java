package com.avito.android.messenger.conversation.mvi.file_download;

import android.content.Context;
import androidx.view.C23034e0;
import androidx.view.InterfaceC23040h0;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import androidx.work.impl.utils.C23601k;
import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.data.CallableC31711t;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadWorker;
import com.avito.android.util.InterfaceC35745a5;
import com.google.common.util.concurrent.D0;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.flowable.C41870n0;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.observable.C41946e1;
import io.reactivex.rxjava3.internal.operators.observable.I1;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadManager.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/f;", "Lcom/avito/android/messenger/conversation/mvi/file_download/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32042f implements InterfaceC32038b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f190919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190920b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f190921c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f190922d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f190923e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f190924f;

    @Inject
    public C32042f(@Y61.k Context context, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.notification.m mVar) {
        this.f190919a = context;
        this.f190920b = interfaceC35745a5;
        this.f190921c = interfaceC32024m;
        this.f190922d = nVar;
        this.f190923e = c30277e1;
        this.f190924f = mVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.A a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12, @Y61.l List list, @Y61.l Integer num) {
        String str3;
        FileDownloadWorker.f190805d.getClass();
        WorkManager.f55428a.getClass();
        Y yF2 = Y.f(this.f190919a);
        String strH = com.avito.android.messenger.util.i.h(messengerUserHashInfo.f430681c);
        if (num == null) {
            str3 = "";
        } else {
            str3 = "||" + num;
        }
        StringBuilder sb2 = new StringBuilder();
        androidx.media3.exoplayer.analytics.m.p(sb2, messengerUserHashInfo.f430682d, "||", str, "||");
        D0 d0A = androidx.work.impl.utils.G.a(yF2.f55559d, yF2.f55560e, androidx.camera.camera2.internal.G.g(sb2, str2, strH, str3));
        int i12 = AbstractC41777j.f401972b;
        return (io.reactivex.rxjava3.internal.operators.single.A) new C41906z1(new C41870n0(d0A)).r(r.f190951b).o(new C32040d(this, messengerUserHashInfo, str, str2, list, num, j12));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b
    @Y61.k
    public final W b(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        FileDownloadWorker.a aVar = FileDownloadWorker.f190805d;
        InterfaceC35745a5 interfaceC35745a5 = this.f190920b;
        io.reactivex.rxjava3.core.H hE2 = interfaceC35745a5.e();
        io.reactivex.rxjava3.core.H hA2 = interfaceC35745a5.a();
        aVar.getClass();
        final Context context = this.f190919a;
        return new C41946e1(new I1(new io.reactivex.rxjava3.internal.operators.observable.C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.messenger.conversation.mvi.file_download.o
            @Override // io.reactivex.rxjava3.core.C
            public final void f(final io.reactivex.rxjava3.core.B b12) {
                WorkManager.f55428a.getClass();
                Y yF2 = Y.f(context);
                C23034e0 c23034e0A = C23601k.a(yF2.f55559d.A().n(), androidx.work.impl.model.H.f55794z, yF2.f55560e);
                InterfaceC23040h0 interfaceC23040h0 = new InterfaceC23040h0() { // from class: com.avito.android.messenger.conversation.mvi.file_download.q
                    @Override // androidx.view.InterfaceC23040h0
                    public final void onChanged(Object obj) {
                        b12.onNext((List) obj);
                    }
                };
                c23034e0A.observeForever(interfaceC23040h0);
                b12.f(new com.avito.android.app.work.a(3, c23034e0A, interfaceC23040h0));
            }
        }).x0(hE2), hE2).j0(hA2).d0(new C32054s(j12, str, messengerUserHashInfo)).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new com.avito.android.analytics.timer.b(2)).N(C32041e.f190918b);
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b
    @Y61.k
    public final C41811b c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l List list, @Y61.l Integer num) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31711t(this, messengerUserHashInfo, str, str2, num, 2)).g(new io.reactivex.rxjava3.internal.operators.completable.v(this.f190921c.Z(str, str2, messengerUserHashInfo).n(new C32039c(num, messengerUserHashInfo, str, str2, this)))).g(this.f190921c.R(messengerUserHashInfo, str, str2, list, num));
    }
}

package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.messenger.conversation.mvi.file_upload.T;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageEraser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_local/m;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_local/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f191660a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f191661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32200a f191662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f191663d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f191664e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32079k0 f191665f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32069f0 f191666g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32038b f191667h;

    @Inject
    public m(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k InterfaceC32200a interfaceC32200a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k T t12, @Y61.k InterfaceC32079k0 interfaceC32079k0, @Y61.k InterfaceC32069f0 interfaceC32069f0, @Y61.k InterfaceC32038b interfaceC32038b) {
        this.f191660a = interfaceC32024m;
        this.f191661b = bVar;
        this.f191662c = interfaceC32200a;
        this.f191663d = interfaceC35745a5;
        this.f191664e = t12;
        this.f191665f = interfaceC32079k0;
        this.f191666g = interfaceC32069f0;
        this.f191667h = interfaceC32038b;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f
    @Y61.k
    public final C42026y a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        C41934a1 c41934a1I = this.f191660a.i(str, str2, messengerUserHashInfo);
        InterfaceC35745a5 interfaceC35745a5 = this.f191663d;
        return c41934a1I.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.c()).S().u(g.f191651b).n(new h(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f
    @Y61.k
    public final C42026y b(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        C41906z1 c41906z1W = this.f191660a.w(str, str2, messengerUserHashInfo);
        InterfaceC35745a5 interfaceC35745a5 = this.f191663d;
        return c41906z1W.z(interfaceC35745a5.a()).s(interfaceC35745a5.c()).n(new l(this));
    }
}

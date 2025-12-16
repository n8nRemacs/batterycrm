package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: DeleteRemoteMessageElementProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_remote/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f191676a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC5664a f191677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f191678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f191679d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final JY.a f191680e;

    /* compiled from: DeleteRemoteMessageElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_remote/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.a$a, reason: collision with other inner class name */
    public interface InterfaceC5664a {
        void F4();
    }

    /* compiled from: DeleteRemoteMessageElementProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/delete_remote/a$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32891b<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191681d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f191681d = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(l.a aVar) {
            AbstractC41768a abstractC41768aO;
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f191681d;
            com.avito.android.messenger.conversation.mvi.message_menu.h f191618b = dVar.getF191618b();
            MessengerTimestamp messengerTimestamp = MessengerTimestamp.INSTANCE;
            a aVar2 = a.this;
            if (messengerTimestamp.fromMillis(aVar2.f191678c.now()) < dVar.getF191618b().f191752g + dVar.getF191617a().f19367a) {
                String str = f191618b.f191750e;
                if (str == null) {
                    abstractC41768aO = AbstractC41768a.o(new IllegalArgumentException("Message remoteId == null"));
                } else {
                    MessengerUserHashInfo messengerUserHashInfo = f191618b.f191746a;
                    abstractC41768aO = aVar2.f191679d.a(str, f191618b.f191747b, messengerUserHashInfo);
                }
            } else {
                abstractC41768aO = AbstractC41768a.o(new IllegalStateException("Message is too old to be deleted"));
            }
            return abstractC41768aO.l(new com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.b(f191618b, aVar2)).B(G0.f406611a).u(new C32102w0(2));
        }
    }

    @Inject
    public a(@k Resources resources, @k InterfaceC5664a interfaceC5664a, @k com.avito.android.server_time.f fVar, @k e eVar, @k JY.a aVar) {
        this.f191676a = resources;
        this.f191677b = interfaceC5664a;
        this.f191678c = fVar;
        this.f191679d = eVar;
        this.f191680e = aVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        if (!this.f191680e.m() || (dVar instanceof d.e) || !dVar.getF191618b().f191754i) {
            return null;
        }
        MessengerUserHashInfo messengerUserHashInfo = dVar.getF191618b().f191746a;
        if (!L.f(messengerUserHashInfo.f430682d, dVar.getF191618b().f191749d) || dVar.getF191618b().f191750e == null || MessengerTimestamp.INSTANCE.fromMillis(this.f191678c.now()) >= dVar.getF191618b().f191752g + dVar.getF191617a().f19367a) {
            return null;
        }
        return new AbstractC32118b.a("delete_remote_message", R.string.messenger_delete_remote_message, R.drawable.ic_rds_trash_24);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final ActionConfirmation b() {
        Resources resources = this.f191676a;
        return new ActionConfirmation(resources.getString(R.string.messenger_delete_remote_message_confirmation_title), resources.getString(R.string.messenger_delete_remote_message_confirmation_message), resources.getString(R.string.messenger_delete_remote_message_confirmation_confirm), resources.getString(R.string.messenger_delete_remote_message_confirmation_cancel));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final x<l.a> c(@k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        return new b(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @k
    public final String d() {
        return "delete_remote_message";
    }
}

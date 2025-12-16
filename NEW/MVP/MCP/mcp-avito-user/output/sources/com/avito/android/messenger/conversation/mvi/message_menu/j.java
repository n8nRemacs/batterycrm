package com.avito.android.messenger.conversation.mvi.message_menu;

import android.content.ClipData;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.util.architecture_components.D;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageMenuCallbacks.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/j;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/i;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends M0 implements i {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Resources f191755E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final D f191756J = new D();

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final D f191757K = new D();

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final D f191758L = new D();

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final D f191759M = new D();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D f191760N = new D();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D f191761O = new D();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D f191762P = new D();

    @Inject
    public j(@Y61.k Resources resources) {
        this.f191755E = resources;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: D9, reason: from getter */
    public final D getF191762P() {
        return this.f191762P;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.d.a
    public final void Ec(@Y61.k String str) {
        this.f191761O.postValue(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.a.InterfaceC5664a
    public final void F4() throws Resources.NotFoundException {
        this.f191757K.postValue(this.f191755E.getString(R.string.messenger_delete_message_error));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c.b
    public final void G4(@Y61.k String str) {
        this.f191759M.postValue(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.j.a
    public final void M2() throws Resources.NotFoundException {
        this.f191757K.postValue(this.f191755E.getString(R.string.messenger_retry_sending_error));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: N0, reason: from getter */
    public final D getF191756J() {
        return this.f191756J;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: T7, reason: from getter */
    public final D getF191758L() {
        return this.f191758L;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: Wa, reason: from getter */
    public final D getF191759M() {
        return this.f191759M;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.a.InterfaceC5663a
    public final void Y8() throws Resources.NotFoundException {
        this.f191757K.postValue(this.f191755E.getString(R.string.messenger_delete_message_error));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c.b
    public final void f9() throws Resources.NotFoundException {
        this.f191757K.postValue(this.f191755E.getString(R.string.messenger_quick_replies_add_success));
        this.f191762P.postValue(G0.f406611a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: fc, reason: from getter */
    public final D getF191760N() {
        return this.f191760N;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.a.InterfaceC5662a
    public final void g8(@Y61.k ClipData clipData) {
        this.f191758L.postValue(clipData);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: ka, reason: from getter */
    public final D getF191761O() {
        return this.f191761O;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c.b
    public final void o8() throws Resources.NotFoundException {
        this.f191757K.postValue(this.f191755E.getString(R.string.messenger_generic_error));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.a.InterfaceC5665a
    public final void q6(@Y61.k d dVar) {
        this.f191760N.postValue(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.i
    /* renamed from: ub, reason: from getter */
    public final D getF191757K() {
        return this.f191757K;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.elements.h.a
    public final void z5(@Y61.k String str) {
        this.f191756J.postValue(str);
    }
}

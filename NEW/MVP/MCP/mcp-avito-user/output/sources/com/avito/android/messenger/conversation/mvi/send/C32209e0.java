package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.util.X2;
import java.io.File;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "deletedSuccessfully", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32209e0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194498c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f194499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194500e;

    public C32209e0(SendMessagePresenter.State state, D d12, File file, String str) {
        this.f194497b = d12;
        this.f194498c = str;
        this.f194499d = file;
        this.f194500e = state;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            X2.f318778a.d(this.f194497b.f207131E, this.f194498c + " failed to delete " + this.f194499d.getPath());
        }
        return SendMessagePresenter.State.a(this.f194500e, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, SendMessagePresenter.VoiceRecorderState.Empty.f194447b, false, null, null, Integer.MAX_VALUE, 7);
    }
}

package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.util.X2;
import java.io.File;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32207d0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f194491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194492d;

    public C32207d0(D d12, File file, SendMessagePresenter.State state) {
        this.f194490b = d12;
        this.f194491c = file;
        this.f194492d = state;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        D d12 = this.f194490b;
        d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_voice_message_fail_to_record));
        X2.f318778a.a(d12.f207131E, "VoiceRecordingReachedMaxDuration recorderDelegate.stopRecording() call returned error", (Throwable) obj);
        return D.me(this.f194492d, d12, this.f194491c, "VoiceRecordingReachedMaxDuration");
    }
}

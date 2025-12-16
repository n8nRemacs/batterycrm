package com.avito.android.messenger.conversation.mvi.voice;

import android.app.Application;
import android.net.Uri;
import androidx.media3.common.AbstractC23093g;
import androidx.media3.common.C23091e;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.InterfaceC23144m;
import androidx.media3.exoplayer.source.C23161l;
import androidx.media3.extractor.C23192k;
import com.avito.android.messenger.conversation.mvi.voice.N;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/N;", "kotlin.jvm.PlatformType", "command", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/voice/N;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32325u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32306a f195208b;

    public C32325u(C32306a c32306a) {
        this.f195208b = c32306a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        final N n12 = (N) obj;
        final C32306a c32306a = this.f195208b;
        return new C41826q(new InterfaceC43543a() { // from class: com.avito.android.messenger.conversation.mvi.voice.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.InterfaceC43543a
            public final void run() {
                InterfaceC23144m interfaceC23144m;
                androidx.media3.common.z zVarB;
                InterfaceC23144m interfaceC23144m2;
                String str;
                C32306a c32306a2 = c32306a;
                if (c32306a2.f195108U.get()) {
                    boolean z12 = true;
                    if (c32306a2.f195101N == null) {
                        C23192k c23192k = new C23192k();
                        synchronized (c23192k) {
                            c23192k.f50613b = true;
                        }
                        Application application = c32306a2.f195096E;
                        InterfaceC23144m.c cVar = new InterfaceC23144m.c(application, new C23161l(application, c23192k));
                        C23091e c23091e = c32306a2.f195113Z;
                        C23110a.g(!cVar.f49243v);
                        c23091e.getClass();
                        cVar.f49231j = c23091e;
                        cVar.f49232k = true;
                        C23110a.g(!cVar.f49243v);
                        cVar.f49233l = true;
                        InterfaceC23144m interfaceC23144mA = cVar.a();
                        c32306a2.f195105R.b(c32306a2.f195102O.y0(new C32327w(c32306a2)).t0(new C32328x(c32306a2)));
                        interfaceC23144mA.F(c32306a2.f195120g0);
                        c32306a2.f195101N = interfaceC23144mA;
                        c32306a2.f195107T.set(true);
                    }
                    N n13 = n12;
                    if (!(n13 instanceof N.a)) {
                        if (n13 instanceof N.b) {
                            LocalMessage localMessage = ((N.b) n13).f195083a;
                            int i12 = ((N.b) n13).f195085c;
                            MessageBody body = localMessage.getBody();
                            MessageBody.Voice voice = body instanceof MessageBody.Voice ? (MessageBody.Voice) body : null;
                            String voiceId = voice != null ? voice.getVoiceId() : null;
                            if (voiceId != null) {
                                InterfaceC23144m interfaceC23144m3 = c32306a2.f195101N;
                                if (!kotlin.jvm.internal.L.f((interfaceC23144m3 == null || (zVarB = ((AbstractC23093g) interfaceC23144m3).B()) == null) ? null : zVarB.f47978b, voiceId) || (interfaceC23144m = c32306a2.f195101N) == null) {
                                    return;
                                }
                                long duration = interfaceC23144m.getDuration();
                                if ((duration != -9223372036854775807L ? Long.valueOf(duration) : null) != null) {
                                    long jLongValue = (long) ((i12 / 1000) * r4.longValue());
                                    InterfaceC23144m interfaceC23144m4 = c32306a2.f195101N;
                                    if (interfaceC23144m4 != null) {
                                        ((AbstractC23093g) interfaceC23144m4).seekTo(jLongValue);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    N.a aVar = (N.a) n13;
                    LocalMessage localMessage2 = aVar.f195081a;
                    Q1 q12 = aVar.f195082b;
                    Uri uri = (q12 == null || (str = q12.f215285d) == null) ? null : Uri.parse(str);
                    MessageBody body2 = localMessage2.getBody();
                    MessageBody.Voice voice2 = body2 instanceof MessageBody.Voice ? (MessageBody.Voice) body2 : null;
                    String voiceId2 = voice2 != null ? voice2.getVoiceId() : null;
                    if (uri == null || voiceId2 == null || (interfaceC23144m2 = c32306a2.f195101N) == null) {
                        return;
                    }
                    int playbackState = interfaceC23144m2.getPlaybackState();
                    if (playbackState == 1) {
                        interfaceC23144m2.prepare();
                        ((AbstractC23093g) interfaceC23144m2).f(c32306a2.le(voiceId2, uri, localMessage2));
                    } else {
                        AbstractC23093g abstractC23093g = (AbstractC23093g) interfaceC23144m2;
                        androidx.media3.common.z zVarB2 = abstractC23093g.B();
                        if (!kotlin.jvm.internal.L.f(zVarB2 != null ? zVarB2.f47978b : null, voiceId2)) {
                            abstractC23093g.f(c32306a2.le(voiceId2, uri, localMessage2));
                        }
                        if (playbackState == 4) {
                            abstractC23093g.D();
                        }
                        if (abstractC23093g.k()) {
                            z12 = false;
                        }
                    }
                    interfaceC23144m2.setPlayWhenReady(z12);
                }
            }
        }).l(C32324t.f195205b).r();
    }
}

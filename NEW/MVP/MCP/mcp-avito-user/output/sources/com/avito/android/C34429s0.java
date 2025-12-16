package com.avito.android;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.avito.android.C35202t0;
import com.avito.android.connection_quality.reactive_network.b;
import com.avito.android.messenger.analytics.C31660p;
import com.avito.android.messenger.conversation.mvi.file_upload.C32071g0;
import com.avito.android.messenger.conversation.mvi.file_upload.C32104x0;
import com.avito.android.messenger.conversation.mvi.voice.N;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l0;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C34429s0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f256018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f256019c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f256020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f256021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f256022f;

    public /* synthetic */ C34429s0(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f256018b = i12;
        this.f256019c = obj;
        this.f256020d = obj2;
        this.f256021e = obj3;
        this.f256022f = obj4;
    }

    @Override // l41.InterfaceC43543a
    public final void run() throws SecurityException, IllegalArgumentException {
        androidx.media3.session.J j12;
        String str;
        boolean z12 = false;
        switch (this.f256018b) {
            case 0:
                C35202t0 c35202t0 = (C35202t0) this.f256019c;
                LinkedHashMap linkedHashMap = c35202t0.f294214b;
                String str2 = (String) this.f256020d;
                C35202t0.a aVar = (C35202t0.a) linkedHashMap.get(str2);
                if (aVar == null) {
                    aVar = new C35202t0.a(str2, false, null, 6, null);
                }
                Boolean bool = (Boolean) this.f256021e;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : aVar.f294218c;
                Boolean bool2 = (Boolean) this.f256022f;
                if (bool2 == null) {
                    bool2 = aVar.f294219d;
                }
                C35202t0.a aVar2 = new C35202t0.a(aVar.f294217b, zBooleanValue, bool2);
                if (aVar.equals(aVar2)) {
                    return;
                }
                linkedHashMap.put(str2, aVar2);
                c35202t0.f294215c.accept(kotlin.G0.f406611a);
                c35202t0.f294213a.c(false);
                return;
            case 1:
                com.avito.android.connection_quality.reactive_network.b bVar = (com.avito.android.connection_quality.reactive_network.b) this.f256019c;
                ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) this.f256020d;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f256021e;
                Context context = (Context) this.f256022f;
                b.a aVar3 = com.avito.android.connection_quality.reactive_network.b.f125721d;
                try {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                } catch (Exception e12) {
                    bVar.getClass();
                    com.avito.android.util.V2.f318762a.a("ReactiveNetwork", "could not unregister network callback", e12);
                }
                try {
                    context.unregisterReceiver(bVar.f125723b);
                    return;
                } catch (Exception e13) {
                    bVar.getClass();
                    com.avito.android.util.V2.f318762a.a("ReactiveNetwork", "could not unregister receiver", e13);
                    return;
                }
            case 2:
                io.reactivex.rxjava3.core.I<kotlin.G0> iAbortChunkedUpload = ((C32071g0) this.f256019c).f191167c.abortChunkedUpload((String) this.f256020d, (String) this.f256021e, (String) this.f256022f);
                iAbortChunkedUpload.getClass();
                new io.reactivex.rxjava3.internal.operators.completable.v(iAbortChunkedUpload).r().u();
                return;
            case 3:
                int i12 = C32104x0.f191321p;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                C32104x0 c32104x0 = (C32104x0) this.f256019c;
                mediaMetadataRetriever.setDataSource(c32104x0.f191329h, Uri.parse((String) this.f256020d));
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                String strI = (strExtractMetadata == null || strExtractMetadata2 == null) ? null : androidx.compose.foundation.H.i('x', strExtractMetadata, strExtractMetadata2);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(12);
                c32104x0.f191328g.c(new C31660p((String) this.f256021e, null, (String) this.f256022f, strExtractMetadata3 != null ? c32104x0.f191323b.q(strExtractMetadata3) : null, strI, 0L, null, null, 194, null));
                return;
            case 4:
                com.avito.android.messenger.conversation.mvi.voice.N n12 = (com.avito.android.messenger.conversation.mvi.voice.N) this.f256019c;
                boolean z13 = n12 instanceof N.a;
                com.avito.android.messenger.conversation.mvi.voice.a0 a0Var = (com.avito.android.messenger.conversation.mvi.voice.a0) this.f256020d;
                androidx.media3.session.J j13 = (androidx.media3.session.J) this.f256021e;
                if (!z13) {
                    if (n12 instanceof N.b) {
                        LocalMessage localMessage = ((N.b) n12).f195083a;
                        int i13 = ((N.b) n12).f195085c;
                        MessageBody body = localMessage.getBody();
                        MessageBody.Voice voice = body instanceof MessageBody.Voice ? (MessageBody.Voice) body : null;
                        String voiceId = voice != null ? voice.getVoiceId() : null;
                        if (voiceId != null) {
                            a0Var.getClass();
                            androidx.media3.common.z zVarB = j13.B();
                            if (!kotlin.jvm.internal.L.f(zVarB != null ? zVarB.f47978b : null, voiceId) || (j12 = a0Var.f195127N) == null) {
                                return;
                            }
                            long duration = j12.getDuration();
                            if ((duration != -9223372036854775807L ? Long.valueOf(duration) : null) != null) {
                                long jLongValue = (long) ((i13 / 1000) * r1.longValue());
                                androidx.media3.session.J j14 = a0Var.f195127N;
                                if (j14 != null) {
                                    j14.seekTo(jLongValue);
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
                N.a aVar4 = (N.a) n12;
                LocalMessage localMessage2 = aVar4.f195081a;
                com.avito.android.persistence.messenger.Q1 q12 = aVar4.f195082b;
                Uri uri = (q12 == null || (str = q12.f215285d) == null) ? null : Uri.parse(str);
                MessageBody body2 = localMessage2.getBody();
                MessageBody.Voice voice2 = body2 instanceof MessageBody.Voice ? (MessageBody.Voice) body2 : null;
                String voiceId2 = voice2 != null ? voice2.getVoiceId() : null;
                if (uri == null || voiceId2 == null) {
                    return;
                }
                int playbackState = j13.getPlaybackState();
                User user = (User) this.f256022f;
                if (playbackState != 1) {
                    androidx.media3.common.z zVarB2 = j13.B();
                    if (!kotlin.jvm.internal.L.f(zVarB2 != null ? zVarB2.f47978b : null, voiceId2)) {
                        j13.f(a0Var.le(voiceId2, uri, localMessage2, user));
                    }
                    if (playbackState == 4) {
                        j13.D();
                    }
                    if (!j13.k()) {
                    }
                    j13.setPlayWhenReady(z12);
                    return;
                }
                j13.prepare();
                j13.f(a0Var.le(voiceId2, uri, localMessage2, user));
                z12 = true;
                j13.setPlayWhenReady(z12);
                return;
            default:
                com.avito.android.mvi.rx3.locks.k kVar = (com.avito.android.mvi.rx3.locks.k) this.f256019c;
                com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) this.f256020d;
                Object obj = this.f256021e;
                l0.a aVar5 = (l0.a) this.f256022f;
                kVar.a(kVar.f207060b, cVar + " doFinally");
                synchronized (obj) {
                    aVar5.f406838b = true;
                    kVar.f207061c.R(cVar);
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                return;
        }
    }
}

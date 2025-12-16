package com.avito.android.messenger.conversation.mvi.voice;

import android.media.MediaRecorder;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41824o;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VoiceRecorderDelegate.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/u0;", "Lcom/avito/android/messenger/conversation/mvi/voice/s0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public MediaRecorder f195209a;

    @Inject
    public u0() {
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.s0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k final File file) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.voice.t0
            @Override // java.util.concurrent.Callable
            public final Object call() throws IllegalStateException, IOException {
                u0 u0Var = this.f195206b;
                if (u0Var.f195209a == null) {
                    u0Var.f195209a = new MediaRecorder();
                }
                MediaRecorder mediaRecorder = u0Var.f195209a;
                if (mediaRecorder == null) {
                    return null;
                }
                mediaRecorder.setAudioSource(1);
                mediaRecorder.setOutputFormat(2);
                mediaRecorder.setAudioEncoder(3);
                mediaRecorder.setAudioEncodingBitRate(64000);
                mediaRecorder.setOutputFile(file.getPath());
                mediaRecorder.prepare();
                mediaRecorder.start();
                return mediaRecorder;
            }
        });
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.s0
    @Y61.k
    public final AbstractC41768a b() {
        try {
            try {
                MediaRecorder mediaRecorder = this.f195209a;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                return C41823n.f402260b;
            } catch (Exception e12) {
                V2.f318762a.j("VoiceRecorderDelegate", "Voice recorder stop failed", e12);
                C41824o c41824oO = AbstractC41768a.o(e12);
                try {
                    MediaRecorder mediaRecorder2 = this.f195209a;
                    if (mediaRecorder2 != null) {
                        mediaRecorder2.reset();
                    }
                } catch (Exception e13) {
                    V2.f318762a.j("VoiceRecorderDelegate", "Voice recorder stop failed, reset failed", e13);
                }
                return c41824oO;
            }
        } finally {
            try {
                MediaRecorder mediaRecorder3 = this.f195209a;
                if (mediaRecorder3 != null) {
                    mediaRecorder3.reset();
                }
            } catch (Exception e14) {
                V2.f318762a.j("VoiceRecorderDelegate", "Voice recorder stop failed, reset failed", e14);
            }
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.voice.s0
    public final void s() {
        MediaRecorder mediaRecorder = this.f195209a;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        this.f195209a = null;
    }
}

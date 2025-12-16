package com.avito.android.iac_dialer.impl_module.audio.tone;

import Y61.k;
import android.content.Context;
import android.media.AudioManager;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.webrtc.MediaStreamTrack;

/* compiled from: IacTonePlayer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/tone/c;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f165922a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f165923b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public IacToneType f165924c = IacToneType.f165910b;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165925d = C42727D.c(new a());

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165926e = C42727D.c(new b());

    /* compiled from: IacTonePlayer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<AudioManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final AudioManager invoke() {
            return (AudioManager) c.this.f165922a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }

    /* compiled from: IacTonePlayer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/iac_dialer/impl_module/audio/tone/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<List<? extends com.avito.android.iac_dialer.impl_module.audio.tone.a>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.iac_dialer.impl_module.audio.tone.a> invoke() {
            IacToneType iacToneType = IacToneType.f165910b;
            c cVar = c.this;
            return Collections.singletonList(new com.avito.android.iac_dialer.impl_module.audio.tone.a(cVar.f165922a, (AudioManager) cVar.f165925d.getValue(), cVar.f165923b));
        }
    }

    @Inject
    public c(@k Context context, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f165922a = context;
        this.f165923b = interfaceC35745a5;
    }
}

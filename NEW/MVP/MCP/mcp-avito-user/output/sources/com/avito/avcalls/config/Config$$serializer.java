package com.avito.avcalls.config;

import com.avito.avcalls.config.Config;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.Y;

/* compiled from: Config.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/config/Config.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/config/Config;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/config/Config;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/config/Config;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class Config$$serializer implements N<Config> {

    @Y61.k
    public static final Config$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$$serializer config$$serializer = new Config$$serializer();
        INSTANCE = config$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.config.Config", config$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("signaling.send_timeout", true);
        pluginGeneratedSerialDescriptor.j("signaling.send_retries", true);
        pluginGeneratedSerialDescriptor.j("signaling.send_retry_delay", true);
        pluginGeneratedSerialDescriptor.j("call.outgoing_start_timeout", true);
        pluginGeneratedSerialDescriptor.j("call.outgoing_accept_timeout", true);
        pluginGeneratedSerialDescriptor.j("call.outgoing_accept_timeout_after_ringing", true);
        pluginGeneratedSerialDescriptor.j("call.incoming_accept_timeout", true);
        pluginGeneratedSerialDescriptor.j("call.connect_timeout", true);
        pluginGeneratedSerialDescriptor.j("call.enable_stats_report", true);
        pluginGeneratedSerialDescriptor.j("rtc.ice_candidates_gathering_timeout", true);
        pluginGeneratedSerialDescriptor.j("rtc.dtmf_duration", true);
        pluginGeneratedSerialDescriptor.j("rtc.dtmf_inter_tone_gap", true);
        pluginGeneratedSerialDescriptor.j("video.framerate_limit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        C43412k0 c43412k0 = C43412k0.f412877a;
        return new KSerializer[]{c43412k0, Y.f412835a, c43412k0, c43412k0, c43412k0, c43412k0, c43412k0, c43412k0, C43407i.f412866a, c43412k0, c43412k0, c43412k0, F.f412769a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public Config deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        int iQ2 = 0;
        boolean zD2 = false;
        long jP2 = 0;
        long jP3 = 0;
        long jP4 = 0;
        long jP5 = 0;
        long jP6 = 0;
        long jP7 = 0;
        long jP8 = 0;
        long jP9 = 0;
        long jP10 = 0;
        long jP11 = 0;
        double dL2 = 0.0d;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    jP2 = cVarC.p(f412706c, 0);
                    i12 |= 1;
                    break;
                case 1:
                    iQ2 = cVarC.q(f412706c, 1);
                    i12 |= 2;
                    break;
                case 2:
                    jP3 = cVarC.p(f412706c, 2);
                    i12 |= 4;
                    break;
                case 3:
                    jP4 = cVarC.p(f412706c, 3);
                    i12 |= 8;
                    break;
                case 4:
                    jP5 = cVarC.p(f412706c, 4);
                    i12 |= 16;
                    break;
                case 5:
                    jP6 = cVarC.p(f412706c, 5);
                    i12 |= 32;
                    break;
                case 6:
                    jP7 = cVarC.p(f412706c, 6);
                    i12 |= 64;
                    break;
                case 7:
                    jP8 = cVarC.p(f412706c, 7);
                    i12 |= 128;
                    break;
                case 8:
                    zD2 = cVarC.D(f412706c, 8);
                    i12 |= 256;
                    break;
                case 9:
                    jP9 = cVarC.p(f412706c, 9);
                    i12 |= 512;
                    break;
                case 10:
                    jP10 = cVarC.p(f412706c, 10);
                    i12 |= 1024;
                    break;
                case 11:
                    jP11 = cVarC.p(f412706c, 11);
                    i12 |= 2048;
                    break;
                case 12:
                    dL2 = cVarC.l(f412706c, 12);
                    i12 |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new Config(i12, jP2, iQ2, jP3, jP4, jP5, jP6, jP7, jP8, zD2, jP9, jP10, jP11, dL2, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k Config value) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        Config.Companion companion = Config.INSTANCE;
        boolean zU2 = dVarC.u();
        long j12 = value.f332850a;
        if (zU2 || j12 != 15000) {
            dVarC.o(f412706c, 0, j12);
        }
        boolean zU3 = dVarC.u();
        int i12 = value.f332851b;
        if (zU3 || i12 != 30) {
            dVarC.D(1, i12, f412706c);
        }
        boolean zU4 = dVarC.u();
        long j13 = value.f332852c;
        if (zU4 || j13 != 1000) {
            dVarC.o(f412706c, 2, j13);
        }
        boolean zU5 = dVarC.u();
        long j14 = value.f332853d;
        if (zU5 || j14 != 60000) {
            dVarC.o(f412706c, 3, j14);
        }
        boolean zU6 = dVarC.u();
        long j15 = value.f332854e;
        if (zU6 || j15 != 40000) {
            dVarC.o(f412706c, 4, j15);
        }
        boolean zU7 = dVarC.u();
        long j16 = value.f332855f;
        if (zU7 || j16 != 60000) {
            dVarC.o(f412706c, 5, j16);
        }
        boolean zU8 = dVarC.u();
        long j17 = value.f332856g;
        if (zU8 || j17 != 59000) {
            dVarC.o(f412706c, 6, j17);
        }
        boolean zU9 = dVarC.u();
        long j18 = value.f332857h;
        if (zU9 || j18 != 30000) {
            dVarC.o(f412706c, 7, j18);
        }
        boolean zU10 = dVarC.u();
        boolean z12 = value.f332858i;
        if (zU10 || !z12) {
            dVarC.k(f412706c, 8, z12);
        }
        boolean zU11 = dVarC.u();
        long j19 = value.f332859j;
        if (zU11 || j19 != 500) {
            dVarC.o(f412706c, 9, j19);
        }
        boolean zU12 = dVarC.u();
        long j22 = value.f332860k;
        if (zU12 || j22 != 250) {
            dVarC.o(f412706c, 10, j22);
        }
        boolean zU13 = dVarC.u();
        long j23 = value.f332861l;
        if (zU13 || j23 != 100) {
            dVarC.o(f412706c, 11, j23);
        }
        boolean zU14 = dVarC.u();
        double d12 = value.f332862m;
        if (zU14 || Double.compare(d12, 30.0d) != 0) {
            dVarC.G(f412706c, 12, d12);
        }
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}

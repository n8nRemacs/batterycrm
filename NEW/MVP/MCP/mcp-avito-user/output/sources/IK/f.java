package IK;

import Y41.l;
import Y41.q;
import Y61.k;
import android.os.OutcomeReceiver;
import android.os.ParcelUuid;
import android.telecom.CallEndpoint;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import j.X;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacConnectionAudioDelegateApi34.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIK/f;", "LIK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes14.dex */
public final class f implements IK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q<CallEndpoint, Executor, OutcomeReceiver, G0> f8139a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<AudioState, G0> f8140b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public AudioDevice f8142d;

    /* renamed from: f, reason: collision with root package name */
    @k
    public AudioState f8144f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f8145g;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Map<UUID, String> f8141c = P0.c();

    /* renamed from: e, reason: collision with root package name */
    @k
    public Set<AudioDevice> f8143e = B0.f406639b;

    /* compiled from: IacConnectionAudioDelegateApi34.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8146a;

        static {
            int[] iArr = new int[AudioDevice.Type.values().length];
            try {
                iArr[AudioDevice.Type.WIRED_HEADSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDevice.Type.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDevice.Type.SPEAKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDevice.Type.EARPIECE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioDevice.Type.STREAMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioDevice.Type.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f8146a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k String str, @k q<? super CallEndpoint, ? super Executor, ? super OutcomeReceiver, G0> qVar, @k l<? super AudioState, G0> lVar) {
        this.f8139a = qVar;
        this.f8140b = lVar;
        AudioState.INSTANCE.getClass();
        this.f8144f = AudioState.Companion.a();
        this.f8145g = "IacConnectionAudio34_...".concat(C43066x.u0(3, str));
    }

    @Override // IK.a
    @k
    public final Object a(@k AudioDevice audioDevice) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f8145g;
        bVar.a(str, "requestAudioDeviceChange(" + audioDevice + ')', null);
        try {
            CallEndpoint callEndpointC = c(audioDevice);
            bVar.a(str, "requestAudioDeviceChange.requestCallEndpointChange", null);
            this.f8139a.invoke(callEndpointC, new androidx.arch.core.executor.a(1), new e());
            int i12 = Z.f406624c;
            return G0.f406611a;
        } catch (Exception e12) {
            int i13 = Z.f406624c;
            return new Z.b(e12);
        }
    }

    @k
    public final AudioDevice b(@k CallEndpoint callEndpoint) {
        int endpointType = callEndpoint.getEndpointType();
        boolean z12 = true;
        AudioDevice.Type type = endpointType != 1 ? endpointType != 2 ? endpointType != 3 ? endpointType != 4 ? endpointType != 5 ? AudioDevice.Type.UNKNOWN : AudioDevice.Type.STREAMING : AudioDevice.Type.SPEAKER : AudioDevice.Type.WIRED_HEADSET : AudioDevice.Type.BLUETOOTH : AudioDevice.Type.EARPIECE;
        String string = callEndpoint.getEndpointName().toString();
        if (string != null && !C43066x.K(string)) {
            z12 = false;
        }
        String str = null;
        if (z12) {
            string = null;
        }
        if (string != null) {
            this.f8141c = P0.l(this.f8141c, new Q(callEndpoint.getIdentifier().getUuid(), string));
            str = string;
        }
        return new AudioDevice(type, str, callEndpoint.getIdentifier().getUuid());
    }

    @k
    public final CallEndpoint c(@k AudioDevice audioDevice) {
        int i12;
        d.p();
        String str = this.f8141c.get(audioDevice.getId());
        if (str == null) {
            str = "";
        }
        switch (a.f8146a[audioDevice.getType().ordinal()]) {
            case 1:
                i12 = 3;
                break;
            case 2:
                i12 = 2;
                break;
            case 3:
                i12 = 4;
                break;
            case 4:
                i12 = 1;
                break;
            case 5:
                i12 = 5;
                break;
            case 6:
                i12 = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return d.j(str, i12, new ParcelUuid(audioDevice.getId()));
    }
}

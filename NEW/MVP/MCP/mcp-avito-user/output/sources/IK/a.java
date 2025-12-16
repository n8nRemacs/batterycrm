package IK;

import Y61.k;
import android.telecom.CallAudioState;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: IacConnectionAudioDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LIK/a;", "", "LIK/b;", "LIK/c;", "LIK/f;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacConnectionAudioDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: IK.a$a, reason: collision with other inner class name */
    public static final class C0459a {
        @k
        public static AudioDevice.Type a(int i12) {
            return i12 != 1 ? i12 != 2 ? i12 != 4 ? i12 != 8 ? AudioDevice.Type.UNKNOWN : AudioDevice.Type.SPEAKER : AudioDevice.Type.WIRED_HEADSET : AudioDevice.Type.BLUETOOTH : AudioDevice.Type.EARPIECE;
        }

        @k
        public static LinkedHashSet b(@k CallAudioState callAudioState) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int supportedRouteMask = callAudioState.getSupportedRouteMask();
            if ((supportedRouteMask & 1) == 1) {
                linkedHashSet.add(1);
            }
            if ((supportedRouteMask & 2) == 2) {
                linkedHashSet.add(2);
            }
            if ((supportedRouteMask & 4) == 4) {
                linkedHashSet.add(4);
            }
            if ((supportedRouteMask & 8) == 8) {
                linkedHashSet.add(8);
            }
            if (linkedHashSet.contains(4)) {
                linkedHashSet.remove(1);
            }
            return linkedHashSet;
        }
    }

    /* compiled from: IacConnectionAudioDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8122a;

        static {
            int[] iArr = new int[AudioDevice.Type.values().length];
            try {
                iArr[AudioDevice.Type.EARPIECE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDevice.Type.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDevice.Type.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDevice.Type.SPEAKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8122a = iArr;
        }
    }

    @k
    Object a(@k AudioDevice audioDevice);
}

package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class v61 implements a71 {
    public final CallsAudioDeviceInfo a;
    public final int b = j0b.I;
    public final int c = i0b.x;
    public final int d = i0b.v0;
    public final p5g e;
    public final p5g f;

    public v61(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        p5g p5gVar = new p5g(m0b.z2, ys.D(new Object[]{callsAudioDeviceInfo.getName()}));
        this.e = p5gVar;
        this.f = p5gVar;
    }

    @Override // defpackage.a71
    public final int a() {
        return this.c;
    }

    @Override // defpackage.a71
    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v61) && fni.a(this.a, ((v61) obj).a);
    }

    @Override // defpackage.a71
    public final s5g getContentDescription() {
        return this.f;
    }

    @Override // defpackage.a71
    public final int getIcon() {
        return this.d;
    }

    @Override // defpackage.a71
    public final int getId() {
        return this.b;
    }

    @Override // defpackage.a71
    public final s5g getTitle() {
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ")";
    }
}

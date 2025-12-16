package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class y61 implements a71 {
    public final CallsAudioDeviceInfo a;
    public final int b = j0b.L;
    public final int c = i0b.l0;
    public final int d = i0b.x0;
    public final n5g e;
    public final n5g f;

    public y61(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        n5g n5gVar = new n5g(m0b.C2);
        this.e = n5gVar;
        this.f = n5gVar;
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
        return (obj instanceof y61) && fni.a(this.a, ((y61) obj).a);
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
        return "Unknown(device=" + this.a + ")";
    }
}

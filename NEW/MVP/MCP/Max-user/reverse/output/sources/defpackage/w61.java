package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public final class w61 implements a71 {
    public final CallsAudioDeviceInfo a;
    public final int b = j0b.J;
    public final int c = i0b.l0;
    public final int d = i0b.w0;
    public final n5g e;
    public final n5g f;

    public w61(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        n5g n5gVar = new n5g(m0b.A2);
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
        return (obj instanceof w61) && fni.a(this.a, ((w61) obj).a);
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
        return "Earpiece(device=" + this.a + ")";
    }
}

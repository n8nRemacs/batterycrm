package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import j.InterfaceC42153i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes6.dex */
public abstract class m implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f344041b;

    /* renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f344042c;

    /* renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f344043d;

    /* renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f344044e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f344045f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f344046g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f344047h;

    public m() {
        ByteBuffer byteBuffer = AudioProcessor.f343846a;
        this.f344045f = byteBuffer;
        this.f344046g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f343847e;
        this.f344043d = aVar;
        this.f344044e = aVar;
        this.f344041b = aVar;
        this.f344042c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @InterfaceC42153i
    public boolean a() {
        return this.f344047h && this.f344046g == AudioProcessor.f343846a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) {
        this.f344043d = aVar;
        this.f344044e = c(aVar);
        return isActive() ? this.f344044e : AudioProcessor.a.f343847e;
    }

    public AudioProcessor.a c(AudioProcessor.a aVar) {
        return AudioProcessor.a.f343847e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @InterfaceC42153i
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f344046g;
        this.f344046g = AudioProcessor.f343846a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f344046g = AudioProcessor.f343846a;
        this.f344047h = false;
        this.f344041b = this.f344043d;
        this.f344042c = this.f344044e;
        d();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void h() {
        this.f344047h = true;
        e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f344044e != AudioProcessor.a.f343847e;
    }

    public final ByteBuffer j(int i12) {
        if (this.f344045f.capacity() < i12) {
            this.f344045f = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
        } else {
            this.f344045f.clear();
        }
        ByteBuffer byteBuffer = this.f344045f;
        this.f344046g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f344045f = AudioProcessor.f343846a;
        AudioProcessor.a aVar = AudioProcessor.a.f343847e;
        this.f344043d = aVar;
        this.f344044e = aVar;
        this.f344041b = aVar;
        this.f344042c = aVar;
        i();
    }

    public void d() {
    }

    public void e() {
    }

    public void i() {
    }
}

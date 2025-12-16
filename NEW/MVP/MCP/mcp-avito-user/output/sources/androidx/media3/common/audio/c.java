package androidx.media3.common.audio;

import aZ0.InterfaceC19845a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import j.InterfaceC42153i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor.java */
@J
/* loaded from: classes.dex */
public abstract class c implements AudioProcessor {

    /* renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f47569b;

    /* renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f47570c;

    /* renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f47571d;

    /* renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f47572e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f47573f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f47574g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47575h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f47559a;
        this.f47573f = byteBuffer;
        this.f47574g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f47560e;
        this.f47571d = aVar;
        this.f47572e = aVar;
        this.f47569b = aVar;
        this.f47570c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @InterfaceC42153i
    public boolean a() {
        return this.f47575h && this.f47574g == AudioProcessor.f47559a;
    }

    @InterfaceC19845a
    public AudioProcessor.a b(AudioProcessor.a aVar) {
        return AudioProcessor.a.f47560e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @InterfaceC42153i
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f47574g;
        this.f47574g = AudioProcessor.f47559a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f47574g = AudioProcessor.f47559a;
        this.f47575h = false;
        this.f47569b = this.f47571d;
        this.f47570c = this.f47572e;
        c();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void h() {
        this.f47575h = true;
        d();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @InterfaceC19845a
    public final AudioProcessor.a i(AudioProcessor.a aVar) {
        this.f47571d = aVar;
        this.f47572e = b(aVar);
        return isActive() ? this.f47572e : AudioProcessor.a.f47560e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f47572e != AudioProcessor.a.f47560e;
    }

    public final ByteBuffer j(int i12) {
        if (this.f47573f.capacity() < i12) {
            this.f47573f = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
        } else {
            this.f47573f.clear();
        }
        ByteBuffer byteBuffer = this.f47573f;
        this.f47574g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f47573f = AudioProcessor.f47559a;
        AudioProcessor.a aVar = AudioProcessor.a.f47560e;
        this.f47571d = aVar;
        this.f47572e = aVar;
        this.f47569b = aVar;
        this.f47570c = aVar;
        e();
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}

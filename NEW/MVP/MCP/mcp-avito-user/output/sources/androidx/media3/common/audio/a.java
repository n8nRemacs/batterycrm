package androidx.media3.common.audio;

import aZ0.InterfaceC19845a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: AudioProcessingPipeline.java */
@J
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37401r1<AudioProcessor> f47565a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f47566b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f47567c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f47568d;

    public a(AbstractC37401r1<AudioProcessor> abstractC37401r1) {
        this.f47565a = abstractC37401r1;
        AudioProcessor.a aVar = AudioProcessor.a.f47560e;
        this.f47568d = false;
    }

    @InterfaceC19845a
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f47560e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i12 = 0;
        while (true) {
            AbstractC37401r1<AudioProcessor> abstractC37401r1 = this.f47565a;
            if (i12 >= abstractC37401r1.size()) {
                return aVar;
            }
            AudioProcessor audioProcessor = abstractC37401r1.get(i12);
            AudioProcessor.a aVarI = audioProcessor.i(aVar);
            if (audioProcessor.isActive()) {
                C23110a.g(!aVarI.equals(AudioProcessor.a.f47560e));
                aVar = aVarI;
            }
            i12++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f47566b;
        arrayList.clear();
        this.f47568d = false;
        int i12 = 0;
        while (true) {
            AbstractC37401r1<AudioProcessor> abstractC37401r1 = this.f47565a;
            if (i12 >= abstractC37401r1.size()) {
                break;
            }
            AudioProcessor audioProcessor = abstractC37401r1.get(i12);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i12++;
        }
        this.f47567c = new ByteBuffer[arrayList.size()];
        for (int i13 = 0; i13 <= c(); i13++) {
            this.f47567c[i13] = ((AudioProcessor) arrayList.get(i13)).f();
        }
    }

    public final int c() {
        return this.f47567c.length - 1;
    }

    public final boolean d() {
        return this.f47568d && ((AudioProcessor) this.f47566b.get(c())).a() && !this.f47567c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f47566b.isEmpty();
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        AbstractC37401r1<AudioProcessor> abstractC37401r1 = this.f47565a;
        if (abstractC37401r1.size() != aVar.f47565a.size()) {
            return false;
        }
        for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
            if (abstractC37401r1.get(i12) != aVar.f47565a.get(i12)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z12;
        for (boolean z13 = true; z13; z13 = z12) {
            z12 = false;
            int i12 = 0;
            while (i12 <= c()) {
                if (!this.f47567c[i12].hasRemaining()) {
                    ArrayList arrayList = this.f47566b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i12);
                    if (!audioProcessor.a()) {
                        ByteBuffer byteBuffer2 = i12 > 0 ? this.f47567c[i12 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f47559a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.g(byteBuffer2);
                        this.f47567c[i12] = audioProcessor.f();
                        z12 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f47567c[i12].hasRemaining();
                    } else if (!this.f47567c[i12].hasRemaining() && i12 < c()) {
                        ((AudioProcessor) arrayList.get(i12 + 1)).h();
                    }
                }
                i12++;
            }
        }
    }

    public final int hashCode() {
        return this.f47565a.hashCode();
    }
}

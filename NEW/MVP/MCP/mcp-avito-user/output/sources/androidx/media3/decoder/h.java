package androidx.media3.decoder;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.f;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42153i;
import j.P;
import java.util.ArrayDeque;

/* compiled from: SimpleDecoder.java */
@J
/* loaded from: classes.dex */
public abstract class h<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements e<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f48343a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f48344b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f48345c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f48346d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f48347e;

    /* renamed from: f, reason: collision with root package name */
    public final O[] f48348f;

    /* renamed from: g, reason: collision with root package name */
    public int f48349g;

    /* renamed from: h, reason: collision with root package name */
    public int f48350h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public I f48351i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public E f48352j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48353k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f48354l;

    /* renamed from: m, reason: collision with root package name */
    public int f48355m;

    /* compiled from: SimpleDecoder.java */
    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.extractor.text.d f48356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.media3.extractor.text.d dVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f48356b = dVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException e12) {
                    throw new IllegalStateException(e12);
                }
            } while (this.f48356b.h());
        }
    }

    public h(I[] iArr, O[] oArr) {
        this.f48347e = iArr;
        this.f48349g = iArr.length;
        for (int i12 = 0; i12 < this.f48349g; i12++) {
            this.f48347e[i12] = new androidx.media3.extractor.text.h();
        }
        this.f48348f = oArr;
        this.f48350h = oArr.length;
        for (int i13 = 0; i13 < this.f48350h; i13++) {
            ((O[]) this.f48348f)[i13] = e();
        }
        a aVar = new a((androidx.media3.extractor.text.d) this);
        this.f48343a = aVar;
        aVar.start();
    }

    @Override // androidx.media3.decoder.e
    @P
    public final Object a() {
        I i12;
        synchronized (this.f48344b) {
            try {
                E e12 = this.f48352j;
                if (e12 != null) {
                    throw e12;
                }
                C23110a.g(this.f48351i == null);
                int i13 = this.f48349g;
                if (i13 == 0) {
                    i12 = null;
                } else {
                    I[] iArr = this.f48347e;
                    int i14 = i13 - 1;
                    this.f48349g = i14;
                    i12 = iArr[i14];
                }
                this.f48351i = i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    @Override // androidx.media3.decoder.e
    @P
    public final Object b() {
        synchronized (this.f48344b) {
            try {
                E e12 = this.f48352j;
                if (e12 != null) {
                    throw e12;
                }
                if (this.f48346d.isEmpty()) {
                    return null;
                }
                return this.f48346d.removeFirst();
            } finally {
            }
        }
    }

    @Override // androidx.media3.decoder.e
    public final void d(Object obj) {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f48344b) {
            try {
                E e12 = this.f48352j;
                if (e12 != null) {
                    throw e12;
                }
                C23110a.b(decoderInputBuffer == this.f48351i);
                this.f48345c.addLast(decoderInputBuffer);
                if (!this.f48345c.isEmpty() && this.f48350h > 0) {
                    this.f48344b.notify();
                }
                this.f48351i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract O e();

    public abstract SubtitleDecoderException f(Throwable th2);

    @Override // androidx.media3.decoder.e
    public final void flush() {
        synchronized (this.f48344b) {
            try {
                this.f48353k = true;
                this.f48355m = 0;
                I i12 = this.f48351i;
                if (i12 != null) {
                    i12.h();
                    int i13 = this.f48349g;
                    this.f48349g = i13 + 1;
                    this.f48347e[i13] = i12;
                    this.f48351i = null;
                }
                while (!this.f48345c.isEmpty()) {
                    I iRemoveFirst = this.f48345c.removeFirst();
                    iRemoveFirst.h();
                    int i14 = this.f48349g;
                    this.f48349g = i14 + 1;
                    this.f48347e[i14] = iRemoveFirst;
                }
                while (!this.f48346d.isEmpty()) {
                    this.f48346d.removeFirst().h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @P
    public abstract SubtitleDecoderException g(DecoderInputBuffer decoderInputBuffer, f fVar, boolean z12);

    public final boolean h() {
        SubtitleDecoderException subtitleDecoderExceptionF;
        synchronized (this.f48344b) {
            while (!this.f48354l) {
                try {
                    if (!this.f48345c.isEmpty() && this.f48350h > 0) {
                        break;
                    }
                    this.f48344b.wait();
                } finally {
                }
            }
            if (this.f48354l) {
                return false;
            }
            I iRemoveFirst = this.f48345c.removeFirst();
            O[] oArr = this.f48348f;
            int i12 = this.f48350h - 1;
            this.f48350h = i12;
            O o12 = oArr[i12];
            boolean z12 = this.f48353k;
            this.f48353k = false;
            if (iRemoveFirst.f(4)) {
                o12.e(4);
            } else {
                if (iRemoveFirst.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                    o12.e(BeduinInputModel.MIN_TEXT_VERSION);
                }
                if (iRemoveFirst.f(134217728)) {
                    o12.e(134217728);
                }
                try {
                    subtitleDecoderExceptionF = g(iRemoveFirst, o12, z12);
                } catch (OutOfMemoryError e12) {
                    subtitleDecoderExceptionF = f(e12);
                } catch (RuntimeException e13) {
                    subtitleDecoderExceptionF = f(e13);
                }
                if (subtitleDecoderExceptionF != null) {
                    synchronized (this.f48344b) {
                        this.f48352j = subtitleDecoderExceptionF;
                    }
                    return false;
                }
            }
            synchronized (this.f48344b) {
                try {
                    if (this.f48353k) {
                        o12.h();
                    } else if (o12.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                        this.f48355m++;
                        o12.h();
                    } else {
                        o12.f48342d = this.f48355m;
                        this.f48355m = 0;
                        this.f48346d.addLast(o12);
                    }
                    iRemoveFirst.h();
                    int i13 = this.f48349g;
                    this.f48349g = i13 + 1;
                    this.f48347e[i13] = iRemoveFirst;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // androidx.media3.decoder.e
    @InterfaceC42153i
    public final void release() throws InterruptedException {
        synchronized (this.f48344b) {
            this.f48354l = true;
            this.f48344b.notify();
        }
        try {
            this.f48343a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

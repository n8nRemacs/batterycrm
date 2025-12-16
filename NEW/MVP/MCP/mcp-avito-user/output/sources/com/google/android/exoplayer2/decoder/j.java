package com.google.android.exoplayer2.decoder;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.g;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42153i;
import j.P;
import java.util.ArrayDeque;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes6.dex */
public abstract class j<I extends DecoderInputBuffer, O extends g, E extends DecoderException> implements e<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f344242a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f344243b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f344244c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f344245d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f344246e;

    /* renamed from: f, reason: collision with root package name */
    public final O[] f344247f;

    /* renamed from: g, reason: collision with root package name */
    public int f344248g;

    /* renamed from: h, reason: collision with root package name */
    public int f344249h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public I f344250i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public E f344251j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f344252k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f344253l;

    /* renamed from: m, reason: collision with root package name */
    public int f344254m;

    /* compiled from: SimpleDecoder.java */
    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.text.g f344255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.google.android.exoplayer2.text.g gVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f344255b = gVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            do {
                try {
                } catch (InterruptedException e12) {
                    throw new IllegalStateException(e12);
                }
            } while (this.f344255b.h());
        }
    }

    public j(I[] iArr, O[] oArr) {
        this.f344246e = iArr;
        this.f344248g = iArr.length;
        for (int i12 = 0; i12 < this.f344248g; i12++) {
            this.f344246e[i12] = new com.google.android.exoplayer2.text.l();
        }
        this.f344247f = oArr;
        this.f344249h = oArr.length;
        for (int i13 = 0; i13 < this.f344249h; i13++) {
            ((O[]) this.f344247f)[i13] = e();
        }
        a aVar = new a((com.google.android.exoplayer2.text.g) this);
        this.f344242a = aVar;
        aVar.start();
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @P
    public final Object a() {
        I i12;
        synchronized (this.f344243b) {
            try {
                E e12 = this.f344251j;
                if (e12 != null) {
                    throw e12;
                }
                C36585a.d(this.f344250i == null);
                int i13 = this.f344248g;
                if (i13 == 0) {
                    i12 = null;
                } else {
                    I[] iArr = this.f344246e;
                    int i14 = i13 - 1;
                    this.f344248g = i14;
                    i12 = iArr[i14];
                }
                this.f344250i = i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @P
    public final Object b() {
        synchronized (this.f344243b) {
            try {
                E e12 = this.f344251j;
                if (e12 != null) {
                    throw e12;
                }
                if (this.f344245d.isEmpty()) {
                    return null;
                }
                return this.f344245d.removeFirst();
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final void d(Object obj) {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.f344243b) {
            try {
                E e12 = this.f344251j;
                if (e12 != null) {
                    throw e12;
                }
                C36585a.b(decoderInputBuffer == this.f344250i);
                this.f344244c.addLast(decoderInputBuffer);
                if (!this.f344244c.isEmpty() && this.f344249h > 0) {
                    this.f344243b.notify();
                }
                this.f344250i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract O e();

    public abstract SubtitleDecoderException f(Throwable th2);

    @Override // com.google.android.exoplayer2.decoder.e
    public final void flush() {
        synchronized (this.f344243b) {
            try {
                this.f344252k = true;
                this.f344254m = 0;
                I i12 = this.f344250i;
                if (i12 != null) {
                    i12.h();
                    int i13 = this.f344248g;
                    this.f344248g = i13 + 1;
                    this.f344246e[i13] = i12;
                    this.f344250i = null;
                }
                while (!this.f344244c.isEmpty()) {
                    I iRemoveFirst = this.f344244c.removeFirst();
                    iRemoveFirst.h();
                    int i14 = this.f344248g;
                    this.f344248g = i14 + 1;
                    this.f344246e[i14] = iRemoveFirst;
                }
                while (!this.f344245d.isEmpty()) {
                    this.f344245d.removeFirst().h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @P
    public abstract SubtitleDecoderException g(DecoderInputBuffer decoderInputBuffer, g gVar, boolean z12);

    public final boolean h() {
        SubtitleDecoderException subtitleDecoderExceptionF;
        synchronized (this.f344243b) {
            while (!this.f344253l) {
                try {
                    if (!this.f344244c.isEmpty() && this.f344249h > 0) {
                        break;
                    }
                    this.f344243b.wait();
                } finally {
                }
            }
            if (this.f344253l) {
                return false;
            }
            I iRemoveFirst = this.f344244c.removeFirst();
            O[] oArr = this.f344247f;
            int i12 = this.f344249h - 1;
            this.f344249h = i12;
            O o12 = oArr[i12];
            boolean z12 = this.f344252k;
            this.f344252k = false;
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
                    synchronized (this.f344243b) {
                        this.f344251j = subtitleDecoderExceptionF;
                    }
                    return false;
                }
            }
            synchronized (this.f344243b) {
                try {
                    if (this.f344252k) {
                        o12.h();
                    } else if (o12.f(BeduinInputModel.MIN_TEXT_VERSION)) {
                        this.f344254m++;
                        o12.h();
                    } else {
                        o12.f344236d = this.f344254m;
                        this.f344254m = 0;
                        this.f344245d.addLast(o12);
                    }
                    iRemoveFirst.h();
                    int i13 = this.f344248g;
                    this.f344248g = i13 + 1;
                    this.f344246e[i13] = iRemoveFirst;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @InterfaceC42153i
    public final void release() throws InterruptedException {
        synchronized (this.f344243b) {
            this.f344253l = true;
            this.f344243b.notify();
        }
        try {
            this.f344242a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

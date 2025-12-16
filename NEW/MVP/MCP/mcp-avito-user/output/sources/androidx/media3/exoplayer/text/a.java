package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.util.J;
import androidx.media3.extractor.text.f;
import androidx.media3.extractor.text.h;
import androidx.media3.extractor.text.i;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExoplayerCuesDecoder.java */
@J
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.extractor.text.a f49861a = new androidx.media3.extractor.text.a();

    /* renamed from: b, reason: collision with root package name */
    public final h f49862b = new h();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f49863c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f49864d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49865e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* renamed from: androidx.media3.exoplayer.text.a$a, reason: collision with other inner class name */
    public class C1836a extends i {
        public C1836a() {
        }

        @Override // androidx.media3.decoder.f
        public final void h() {
            ArrayDeque arrayDeque = a.this.f49863c;
            C23110a.g(arrayDeque.size() < 2);
            C23110a.b(!arrayDeque.contains(this));
            this.f48328b = 0;
            this.f51301e = null;
            arrayDeque.addFirst(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder.java */
    public static final class b implements androidx.media3.extractor.text.e {

        /* renamed from: b, reason: collision with root package name */
        public final long f49867b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37401r1<androidx.media3.common.text.a> f49868c;

        public b(long j12, AbstractC37401r1<androidx.media3.common.text.a> abstractC37401r1) {
            this.f49867b = j12;
            this.f49868c = abstractC37401r1;
        }

        @Override // androidx.media3.extractor.text.e
        public final long a(int i12) {
            C23110a.b(i12 == 0);
            return this.f49867b;
        }

        @Override // androidx.media3.extractor.text.e
        public final int b() {
            return 1;
        }

        @Override // androidx.media3.extractor.text.e
        public final int c(long j12) {
            return this.f49867b > j12 ? 0 : -1;
        }

        @Override // androidx.media3.extractor.text.e
        public final List<androidx.media3.common.text.a> d(long j12) {
            return j12 >= this.f49867b ? this.f49868c : AbstractC37401r1.C();
        }
    }

    public a() {
        for (int i12 = 0; i12 < 2; i12++) {
            this.f49863c.addFirst(new C1836a());
        }
        this.f49864d = 0;
    }

    @Override // androidx.media3.decoder.e
    @P
    public final h a() {
        C23110a.g(!this.f49865e);
        if (this.f49864d != 0) {
            return null;
        }
        this.f49864d = 1;
        return this.f49862b;
    }

    @Override // androidx.media3.decoder.e
    @P
    public final i b() {
        C23110a.g(!this.f49865e);
        if (this.f49864d == 2) {
            ArrayDeque arrayDeque = this.f49863c;
            if (!arrayDeque.isEmpty()) {
                i iVar = (i) arrayDeque.removeFirst();
                h hVar = this.f49862b;
                if (hVar.f(4)) {
                    iVar.e(4);
                } else {
                    long j12 = hVar.f48325f;
                    ByteBuffer byteBuffer = hVar.f48323d;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f49861a.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    iVar.i(hVar.f48325f, new b(j12, C23114e.a(androidx.media3.common.text.a.f47813K, parcelableArrayList)), 0L);
                }
                hVar.h();
                this.f49864d = 0;
                return iVar;
            }
        }
        return null;
    }

    @Override // androidx.media3.decoder.e
    public final void d(h hVar) {
        h hVar2 = hVar;
        C23110a.g(!this.f49865e);
        C23110a.g(this.f49864d == 1);
        C23110a.b(this.f49862b == hVar2);
        this.f49864d = 2;
    }

    @Override // androidx.media3.decoder.e
    public final void flush() {
        C23110a.g(!this.f49865e);
        this.f49862b.h();
        this.f49864d = 0;
    }

    @Override // androidx.media3.decoder.e
    public final String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // androidx.media3.decoder.e
    public final void release() {
        this.f49865e = true;
    }

    @Override // androidx.media3.extractor.text.f
    public final void c(long j12) {
    }
}

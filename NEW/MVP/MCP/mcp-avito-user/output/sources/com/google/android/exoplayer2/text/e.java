package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36588d;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: classes6.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.text.b f346900a = new com.google.android.exoplayer2.text.b();

    /* renamed from: b, reason: collision with root package name */
    public final l f346901b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f346902c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f346903d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f346904e;

    /* compiled from: ExoplayerCuesDecoder.java */
    public class a extends m {
        public a() {
        }

        @Override // com.google.android.exoplayer2.decoder.g
        public final void h() {
            ArrayDeque arrayDeque = e.this.f346902c;
            C36585a.d(arrayDeque.size() < 2);
            C36585a.b(!arrayDeque.contains(this));
            this.f344210b = 0;
            this.f346916e = null;
            arrayDeque.addFirst(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder.java */
    public static final class b implements h {

        /* renamed from: b, reason: collision with root package name */
        public final long f346906b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37401r1<com.google.android.exoplayer2.text.a> f346907c;

        public b(long j12, AbstractC37401r1<com.google.android.exoplayer2.text.a> abstractC37401r1) {
            this.f346906b = j12;
            this.f346907c = abstractC37401r1;
        }

        @Override // com.google.android.exoplayer2.text.h
        public final long a(int i12) {
            C36585a.b(i12 == 0);
            return this.f346906b;
        }

        @Override // com.google.android.exoplayer2.text.h
        public final int b() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.text.h
        public final int c(long j12) {
            return this.f346906b > j12 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.text.h
        public final List<com.google.android.exoplayer2.text.a> d(long j12) {
            return j12 >= this.f346906b ? this.f346907c : AbstractC37401r1.C();
        }
    }

    public e() {
        for (int i12 = 0; i12 < 2; i12++) {
            this.f346902c.addFirst(new a());
        }
        this.f346903d = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @P
    public final l a() {
        C36585a.d(!this.f346904e);
        if (this.f346903d != 0) {
            return null;
        }
        this.f346903d = 1;
        return this.f346901b;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    @P
    public final m b() {
        C36585a.d(!this.f346904e);
        if (this.f346903d == 2) {
            ArrayDeque arrayDeque = this.f346902c;
            if (!arrayDeque.isEmpty()) {
                m mVar = (m) arrayDeque.removeFirst();
                l lVar = this.f346901b;
                if (lVar.f(4)) {
                    mVar.e(4);
                } else {
                    long j12 = lVar.f344207f;
                    ByteBuffer byteBuffer = lVar.f344205d;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f346900a.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    mVar.i(lVar.f344207f, new b(j12, C36588d.a(com.google.android.exoplayer2.text.a.f346716t, parcelableArrayList)), 0L);
                }
                lVar.h();
                this.f346903d = 0;
                return mVar;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final void d(l lVar) {
        l lVar2 = lVar;
        C36585a.d(!this.f346904e);
        C36585a.d(this.f346903d == 1);
        C36585a.b(this.f346901b == lVar2);
        this.f346903d = 2;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final void flush() {
        C36585a.d(!this.f346904e);
        this.f346901b.h();
        this.f346903d = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final void release() {
        this.f346904e = true;
    }

    @Override // com.google.android.exoplayer2.text.i
    public final void c(long j12) {
    }
}

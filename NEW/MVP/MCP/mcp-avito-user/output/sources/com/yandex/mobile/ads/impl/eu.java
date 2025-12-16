package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class eu implements u71 {

    /* renamed from: a, reason: collision with root package name */
    private final wm f385097a = new wm();

    /* renamed from: b, reason: collision with root package name */
    private final x71 f385098b = new x71();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f385099c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f385100d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f385101e;

    public class a extends y71 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.wn
        public final void h() {
            eu.a(eu.this, this);
        }
    }

    public static final class b implements t71 {

        /* renamed from: a, reason: collision with root package name */
        private final long f385103a;

        /* renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<vm> f385104b;

        public b(long j12, com.yandex.mobile.ads.embedded.guava.collect.p<vm> pVar) {
            this.f385103a = j12;
            this.f385104b = pVar;
        }

        @Override // com.yandex.mobile.ads.impl.t71
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.t71
        public final List<vm> b(long j12) {
            return j12 >= this.f385103a ? this.f385104b : com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }

        @Override // com.yandex.mobile.ads.impl.t71
        public final int a(long j12) {
            return this.f385103a > j12 ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.t71
        public final long a(int i12) {
            db.a(i12 == 0);
            return this.f385103a;
        }
    }

    public eu() {
        for (int i12 = 0; i12 < 2; i12++) {
            this.f385099c.addFirst(new a());
        }
        this.f385100d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.u71
    public final void a(long j12) {
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    public final x71 b() {
        db.b(!this.f385101e);
        if (this.f385100d != 0) {
            return null;
        }
        this.f385100d = 1;
        return this.f385098b;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void flush() {
        db.b(!this.f385101e);
        this.f385098b.b();
        this.f385100d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void release() {
        this.f385101e = true;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void a(x71 x71Var) {
        db.b(!this.f385101e);
        db.b(this.f385100d == 1);
        db.a(this.f385098b == x71Var);
        this.f385100d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    public final y71 a() {
        db.b(!this.f385101e);
        if (this.f385100d != 2 || this.f385099c.isEmpty()) {
            return null;
        }
        y71 y71Var = (y71) this.f385099c.removeFirst();
        if (this.f385098b.f()) {
            y71Var.b(4);
        } else {
            x71 x71Var = this.f385098b;
            long j12 = x71Var.f390953e;
            wm wmVar = this.f385097a;
            ByteBuffer byteBuffer = x71Var.f390951c;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            wmVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            y71Var.a(this.f385098b.f390953e, new b(j12, sg.a(vm.f390911s, parcelableArrayList)), 0L);
        }
        this.f385098b.b();
        this.f385100d = 0;
        return y71Var;
    }

    public static void a(eu euVar, y71 y71Var) {
        db.b(euVar.f385099c.size() < 2);
        db.a(!euVar.f385099c.contains(y71Var));
        y71Var.b();
        euVar.f385099c.addFirst(y71Var);
    }
}

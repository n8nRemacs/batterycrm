package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public interface fb1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f385257a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f385258b;

        public a(String str, byte[] bArr) {
            this.f385257a = str;
            this.f385258b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final String f385259a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f385260b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f385261c;

        public b(int i12, @j.P String str, @j.P ArrayList arrayList, byte[] bArr) {
            this.f385259a = str;
            this.f385260b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f385261c = bArr;
        }
    }

    public interface c {
        SparseArray<fb1> a();

        @j.P
        fb1 a(int i12, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f385262a;

        /* renamed from: b, reason: collision with root package name */
        private final int f385263b;

        /* renamed from: c, reason: collision with root package name */
        private final int f385264c;

        /* renamed from: d, reason: collision with root package name */
        private int f385265d;

        /* renamed from: e, reason: collision with root package name */
        private String f385266e;

        public d(int i12, int i13, int i14) {
            String str;
            if (i12 != Integer.MIN_VALUE) {
                str = i12 + "/";
            } else {
                str = "";
            }
            this.f385262a = str;
            this.f385263b = i13;
            this.f385264c = i14;
            this.f385265d = BeduinInputModel.MIN_TEXT_VERSION;
            this.f385266e = "";
        }

        public final void a() {
            int i12 = this.f385265d;
            this.f385265d = i12 == Integer.MIN_VALUE ? this.f385263b : i12 + this.f385264c;
            this.f385266e = this.f385262a + this.f385265d;
        }

        public final String b() {
            if (this.f385265d != Integer.MIN_VALUE) {
                return this.f385266e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i12 = this.f385265d;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(int i12, pr0 pr0Var);

    void a(o91 o91Var, tu tuVar, d dVar);
}

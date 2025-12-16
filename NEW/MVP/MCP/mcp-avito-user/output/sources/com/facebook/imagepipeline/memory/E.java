package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.infer.annotation.Nullsafe;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: PoolConfig.java */
@J41.b
@Nullsafe
/* loaded from: classes13.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final G f340425a;

    /* renamed from: b, reason: collision with root package name */
    public final B f340426b;

    /* renamed from: c, reason: collision with root package name */
    public final G f340427c;

    /* renamed from: d, reason: collision with root package name */
    public final wW0.d f340428d;

    /* renamed from: e, reason: collision with root package name */
    public final G f340429e;

    /* renamed from: f, reason: collision with root package name */
    public final B f340430f;

    /* renamed from: g, reason: collision with root package name */
    public final G f340431g;

    /* renamed from: h, reason: collision with root package name */
    public final B f340432h;

    /* renamed from: i, reason: collision with root package name */
    public final String f340433i;

    /* renamed from: j, reason: collision with root package name */
    public final int f340434j;

    /* compiled from: PoolConfig.java */
    public static class b {
        public b() {
        }
    }

    public E(b bVar, a aVar) {
        com.facebook.imagepipeline.systrace.b.a();
        bVar.getClass();
        this.f340425a = l.a();
        this.f340426b = B.a();
        int i12 = n.f340480a;
        int i13 = i12 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i14 = 131072; i14 <= 4194304; i14 *= 2) {
            sparseIntArray.put(i14, i12);
        }
        this.f340427c = new G(4194304, i13, sparseIntArray, n.f340480a);
        this.f340428d = wW0.d.a();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i15 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.f340429e = new G(i15, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f340430f = B.a();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        this.f340431g = new G(81920, 1048576, sparseIntArray3, -1);
        this.f340432h = B.a();
        this.f340433i = "legacy";
        this.f340434j = 4194304;
        com.facebook.imagepipeline.systrace.b.a();
    }
}

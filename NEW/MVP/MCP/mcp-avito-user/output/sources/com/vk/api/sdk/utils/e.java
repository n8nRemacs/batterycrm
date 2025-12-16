package com.vk.api.sdk.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExponentialBackoff.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/e;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f366714a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366715b;

    /* renamed from: c, reason: collision with root package name */
    public final float f366716c;

    /* renamed from: d, reason: collision with root package name */
    public final float f366717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Random f366718e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f366719f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f366720g;

    /* compiled from: ExponentialBackoff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/utils/e$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public e() {
        this(0L, 0L, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public final void a() {
        this.f366719f = (long) Math.min(this.f366719f * this.f366716c, this.f366715b);
        this.f366719f += (long) (this.f366718e.nextGaussian() * this.f366719f * this.f366717d);
        this.f366720g++;
    }

    public e(long j12, long j13, float f12, float f13, float f14, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100L) : j12;
        j13 = (i12 & 2) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j13;
        f12 = (i12 & 4) != 0 ? 2.0f : f12;
        f14 = (i12 & 16) != 0 ? 0.1f : f14;
        this.f366714a = j12;
        this.f366715b = j13;
        this.f366716c = f12;
        this.f366717d = f14;
        this.f366718e = new Random(System.currentTimeMillis());
        this.f366719f = j12;
    }
}

package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes5.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f339332a;

    /* renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f339333b;

    /* renamed from: c, reason: collision with root package name */
    public static final DownsampleStrategy f339334c;

    /* renamed from: d, reason: collision with root package name */
    public static final DownsampleStrategy f339335d;

    /* renamed from: e, reason: collision with root package name */
    public static final DownsampleStrategy f339336e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<DownsampleStrategy> f339337f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f339338g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SampleSizeRounding {

        /* renamed from: b, reason: collision with root package name */
        public static final SampleSizeRounding f339339b;

        /* renamed from: c, reason: collision with root package name */
        public static final SampleSizeRounding f339340c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SampleSizeRounding[] f339341d;

        static {
            SampleSizeRounding sampleSizeRounding = new SampleSizeRounding("MEMORY", 0);
            f339339b = sampleSizeRounding;
            SampleSizeRounding sampleSizeRounding2 = new SampleSizeRounding("QUALITY", 1);
            f339340c = sampleSizeRounding2;
            f339341d = new SampleSizeRounding[]{sampleSizeRounding, sampleSizeRounding2};
        }

        public SampleSizeRounding() {
            throw null;
        }

        public static SampleSizeRounding valueOf(String str) {
            return (SampleSizeRounding) Enum.valueOf(SampleSizeRounding.class, str);
        }

        public static SampleSizeRounding[] values() {
            return (SampleSizeRounding[]) f339341d.clone();
        }
    }

    public static class a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return SampleSizeRounding.f339340c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            if (Math.min(i13 / i15, i12 / i14) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return SampleSizeRounding.f339339b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            int iCeil = (int) Math.ceil(Math.max(i13 / i15, i12 / i14));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    public static class c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return b(i12, i13, i14, i15) == 1.0f ? SampleSizeRounding.f339340c : DownsampleStrategy.f339332a.a(i12, i13, i14, i15);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            return Math.min(1.0f, DownsampleStrategy.f339332a.b(i12, i13, i14, i15));
        }
    }

    public static class d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return SampleSizeRounding.f339340c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            return Math.max(i14 / i12, i15 / i13);
        }
    }

    public static class e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return DownsampleStrategy.f339338g ? SampleSizeRounding.f339340c : SampleSizeRounding.f339339b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            if (DownsampleStrategy.f339338g) {
                return Math.min(i14 / i12, i15 / i13);
            }
            if (Math.max(i13 / i15, i12 / i14) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    public static class f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding a(int i12, int i13, int i14, int i15) {
            return SampleSizeRounding.f339340c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float b(int i12, int i13, int i14, int i15) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f339332a = new e();
        f339333b = new c();
        d dVar = new d();
        f339334c = dVar;
        f339335d = new f();
        f339336e = dVar;
        f339337f = com.bumptech.glide.load.j.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f339338g = true;
    }

    public abstract SampleSizeRounding a(int i12, int i13, int i14, int i15);

    public abstract float b(int i12, int i13, int i14, int i15);
}

package coil.disk;

import Y61.k;
import Y61.l;
import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.C43262l0;
import okio.AbstractC44811v;
import okio.I;
import okio.S;

/* compiled from: DiskCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/disk/a;", "", "a", "b", "c", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: DiskCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/disk/a$a;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.disk.a$a, reason: collision with other inner class name */
    public static final class C2070a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public S f58313a;

        /* renamed from: f, reason: collision with root package name */
        public long f58318f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final I f58314b = AbstractC44811v.f420161a;

        /* renamed from: c, reason: collision with root package name */
        public double f58315c = 0.02d;

        /* renamed from: d, reason: collision with root package name */
        public final long f58316d = 10485760;

        /* renamed from: e, reason: collision with root package name */
        public final long f58317e = 262144000;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final kotlinx.coroutines.scheduling.b f58319g = C43262l0.f411947c;

        @k
        public final f a() {
            long jI2;
            S s5 = this.f58313a;
            if (s5 == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f58315c > 0.0d) {
                try {
                    File fileE = s5.e();
                    fileE.mkdir();
                    StatFs statFs = new StatFs(fileE.getAbsolutePath());
                    jI2 = s.i((long) (this.f58315c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f58316d, this.f58317e);
                } catch (Exception unused) {
                    jI2 = this.f58316d;
                }
            } else {
                jI2 = this.f58318f;
            }
            return new f(jI2, this.f58319g, this.f58314b, s5);
        }
    }

    /* compiled from: DiskCache.kt */
    @C2.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil/disk/a$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @l
        c a();

        void abort();

        @k
        S getData();

        @k
        S getMetadata();
    }

    /* compiled from: DiskCache.kt */
    @C2.a
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/disk/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends Closeable {
        @l
        b L5();

        @k
        S getData();

        @k
        S getMetadata();
    }

    @k
    AbstractC44811v a();

    @C2.a
    @l
    b b(@k String str);

    @C2.a
    @l
    c c(@k String str);
}

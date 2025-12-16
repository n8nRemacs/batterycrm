package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.room.T0;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.C23605o;
import androidx.work.impl.utils.C23608s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WorkTypeConverters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Landroidx/work/impl/model/u0;", "", "<init>", "()V", "a", "b", "c", "d", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55888a = 0;

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/u0$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/u0$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        static {
            new b();
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/u0$c;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        static {
            new c();
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/u0$d;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        static {
            new d();
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {
        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        new u0();
    }

    @X41.n
    @T0
    public static final int a(@Y61.k BackoffPolicy backoffPolicy) {
        int iOrdinal = backoffPolicy.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @X41.n
    @T0
    @Y61.k
    public static final LinkedHashSet b(@Y61.k byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i12 = objectInputStream.readInt();
                    for (int i13 = 0; i13 < i12; i13++) {
                        linkedHashSet.add(new C23542f.c(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    G0 g02 = G0.f406611a;
                    kotlin.io.c.a(objectInputStream, null);
                } finally {
                }
            } finally {
            }
        } catch (IOException e12) {
            e12.printStackTrace();
        }
        G0 g03 = G0.f406611a;
        kotlin.io.c.a(byteArrayInputStream, null);
        return linkedHashSet;
    }

    @X41.n
    @T0
    @Y61.k
    public static final byte[] c(@Y61.k androidx.work.impl.utils.r rVar) {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) rVar.f56027a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrB = C23608s.b(networkRequest);
                int[] iArrA = C23608s.a(networkRequest);
                objectOutputStream.writeInt(iArrB.length);
                for (int i12 : iArrB) {
                    objectOutputStream.writeInt(i12);
                }
                objectOutputStream.writeInt(iArrA.length);
                for (int i13 : iArrA) {
                    objectOutputStream.writeInt(i13);
                }
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(objectOutputStream, null);
                kotlin.io.c.a(byteArrayOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    @X41.n
    @T0
    @Y61.k
    public static final BackoffPolicy d(int i12) {
        if (i12 == 0) {
            return BackoffPolicy.f55355b;
        }
        if (i12 == 1) {
            return BackoffPolicy.f55356c;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Could not convert ", " to BackoffPolicy"));
    }

    @X41.n
    @T0
    @Y61.k
    public static final NetworkType e(int i12) {
        if (i12 == 0) {
            return NetworkType.f55395b;
        }
        if (i12 == 1) {
            return NetworkType.f55396c;
        }
        if (i12 == 2) {
            return NetworkType.f55397d;
        }
        if (i12 == 3) {
            return NetworkType.f55398e;
        }
        if (i12 == 4) {
            return NetworkType.f55399f;
        }
        if (Build.VERSION.SDK_INT < 30 || i12 != 5) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Could not convert ", " to NetworkType"));
        }
        return NetworkType.f55400g;
    }

    @X41.n
    @T0
    @Y61.k
    public static final OutOfQuotaPolicy f(int i12) {
        if (i12 == 0) {
            return OutOfQuotaPolicy.f55404b;
        }
        if (i12 == 1) {
            return OutOfQuotaPolicy.f55405c;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    @X41.n
    @T0
    @Y61.k
    public static final WorkInfo.State g(int i12) {
        if (i12 == 0) {
            return WorkInfo.State.f55419b;
        }
        if (i12 == 1) {
            return WorkInfo.State.f55420c;
        }
        if (i12 == 2) {
            return WorkInfo.State.f55421d;
        }
        if (i12 == 3) {
            return WorkInfo.State.f55422e;
        }
        if (i12 == 4) {
            return WorkInfo.State.f55423f;
        }
        if (i12 == 5) {
            return WorkInfo.State.f55424g;
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Could not convert ", " to State"));
    }

    @X41.n
    @T0
    public static final int h(@Y61.k NetworkType networkType) {
        int iOrdinal = networkType.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.f55400g) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @X41.n
    @T0
    public static final int i(@Y61.k OutOfQuotaPolicy outOfQuotaPolicy) {
        int iOrdinal = outOfQuotaPolicy.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @X41.n
    @T0
    @Y61.k
    public static final byte[] j(@Y61.k Set<C23542f.c> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                for (C23542f.c cVar : set) {
                    objectOutputStream.writeUTF(cVar.f55505a.toString());
                    objectOutputStream.writeBoolean(cVar.f55506b);
                }
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(objectOutputStream, null);
                kotlin.io.c.a(byteArrayOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    @X41.n
    @T0
    public static final int k(@Y61.k WorkInfo.State state) {
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    @X41.n
    @T0
    @Y61.k
    public static final androidx.work.impl.utils.r l(@Y61.k byte[] bArr) {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new androidx.work.impl.utils.r(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i12 = objectInputStream.readInt();
                int[] iArr = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr[i13] = objectInputStream.readInt();
                }
                int i14 = objectInputStream.readInt();
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = objectInputStream.readInt();
                }
                C23605o.f56023a.getClass();
                androidx.work.impl.utils.r rVar = new androidx.work.impl.utils.r(C23605o.a(iArr2, iArr));
                kotlin.io.c.a(objectInputStream, null);
                kotlin.io.c.a(byteArrayInputStream, null);
                return rVar;
            } finally {
            }
        } finally {
        }
    }
}

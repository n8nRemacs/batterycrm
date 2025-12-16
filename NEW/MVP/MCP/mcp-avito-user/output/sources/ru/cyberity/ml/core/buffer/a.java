package ru.cyberity.ml.core.buffer;

import Y61.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.tensorflow.lite.DataType;

/* compiled from: TensorBuffer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/ml/core/buffer/a;", "", "", "data", "", "shape", "<init>", "([F[I)V", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "[F", "b", "()[F", "[I", "c", "()[I", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final float[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final int[] shape;

    /* compiled from: TensorBuffer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lru/cyberity/ml/core/buffer/a$a;", "", "", "shape", "", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ml.core.buffer.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public final int a(@k int[] shape) {
            int i12 = 1;
            for (int i13 : shape) {
                i12 *= i13;
            }
            return i12;
        }

        private Companion() {
        }
    }

    public a(@k float[] fArr, @k int[] iArr) {
        this.data = fArr;
        this.shape = iArr;
    }

    @k
    public final ByteBuffer a() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(DataType.FLOAT32.byteSize() * INSTANCE.a(this.shape));
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.asFloatBuffer().put(this.data);
        return byteBufferAllocateDirect;
    }
}

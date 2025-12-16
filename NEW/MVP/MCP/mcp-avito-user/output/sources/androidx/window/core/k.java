package androidx.window.core;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationComputer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/k;", "", "T", "Landroidx/window/core/n;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k<T> extends n<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f55191b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f55192c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final VerificationMode f55193d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final WindowStrictModeException f55194e;

    /* compiled from: SpecificationComputer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VerificationMode.values().length];
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
        }
    }

    public k(@Y61.k T t12, @Y61.k String str, @Y61.k String str2, @Y61.k l lVar, @Y61.k VerificationMode verificationMode) {
        this.f55191b = t12;
        this.f55192c = lVar;
        this.f55193d = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str2 + " value: " + t12);
        windowStrictModeException.setStackTrace((StackTraceElement[]) C42756l.x(2, windowStrictModeException.getStackTrace()).toArray(new StackTraceElement[0]));
        this.f55194e = windowStrictModeException;
    }

    @Override // androidx.window.core.n
    @Y61.l
    public final T a() throws WindowStrictModeException {
        int iOrdinal = this.f55193d.ordinal();
        if (iOrdinal == 0) {
            throw this.f55194e;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Objects.toString(this.f55191b);
        this.f55192c.getClass();
        return null;
    }

    @Override // androidx.window.core.n
    @Y61.k
    public final n<T> b(@Y61.k String str, @Y61.k Y41.l<? super T, Boolean> lVar) {
        return this;
    }
}

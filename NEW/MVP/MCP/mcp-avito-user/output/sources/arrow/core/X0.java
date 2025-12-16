package arrow.core;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Option.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Larrow/core/X0;", "Larrow/core/Y0;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class X0 extends Y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final X0 f56264b = new X0();

    public X0() {
        super(null);
    }

    @Override // arrow.core.Y0
    public final Object a() {
        throw new NoSuchElementException("None.get");
    }

    @Override // arrow.core.Y0
    public final boolean b() {
        return true;
    }

    @Y61.k
    public final String toString() {
        return "None";
    }
}

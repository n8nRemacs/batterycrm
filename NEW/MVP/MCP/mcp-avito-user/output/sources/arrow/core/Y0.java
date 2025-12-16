package arrow.core;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: Option.kt */
@q2.e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0004:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Larrow/core/Y0;", "A", "Lq2/b;", "Larrow/core/y;", "Larrow/core/OptionOf;", "<init>", "()V", "a", "Larrow/core/X0;", "Larrow/core/n1;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public abstract class Y0<A> implements q2.b<C23724y, A> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f56266a = new a(null);

    /* compiled from: Option.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/Y0$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public Y0() {
    }

    @InterfaceC42830m
    public abstract A a();

    public abstract boolean b();

    @Y61.l
    public final A c() {
        if (this instanceof X0) {
            return null;
        }
        if (this instanceof C23703n1) {
            return (A) ((C23703n1) this).f56288b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ Y0(C42822w c42822w) {
        this();
    }
}

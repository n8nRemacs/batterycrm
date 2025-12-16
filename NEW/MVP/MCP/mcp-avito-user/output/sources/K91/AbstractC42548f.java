package k91;

import Y61.k;
import Y61.l;
import com.avito.android.jsonrpc.client.JsonRpcCallException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TerminationEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lk91/f;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lk91/f$a;", "Lk91/f$c;", "Lk91/f$d;", "Lk91/f$e;", "Lk91/f$f;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k91.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC42548f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f406138a = new b(null);

    /* compiled from: TerminationEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk91/f$a;", "Lk91/f;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$a */
    public static final class a extends AbstractC42548f {

        /* renamed from: b, reason: collision with root package name */
        public final int f406139b;

        public a() {
            super(null);
            this.f406139b = 1000;
        }

        @Override // k91.AbstractC42548f
        @k
        /* renamed from: a */
        public final Integer getF406146b() {
            return Integer.valueOf(this.f406139b);
        }
    }

    /* compiled from: TerminationEvent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk91/f$b;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @k
        public static AbstractC42548f a(@k Throwable th2) {
            if (!(th2 instanceof JsonRpcCallException)) {
                return th2 instanceof IOException ? new d(th2) : new C11606f(null, th2.getMessage(), th2);
            }
            String message = th2.getMessage();
            int i12 = ((JsonRpcCallException) th2).f174716b;
            if (i12 != -32043) {
                if (i12 != -32041 && i12 != 401) {
                    if (i12 != 403) {
                        if (i12 == 1000) {
                            return new a();
                        }
                        if (i12 != 3401) {
                            if (i12 != 3403) {
                                return new C11606f(Integer.valueOf(i12), message, th2);
                            }
                        }
                    }
                }
                return new e(i12, th2);
            }
            return new c(th2);
        }

        public b() {
        }
    }

    /* compiled from: TerminationEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk91/f$c;", "Lk91/f;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$c */
    public static final class c extends AbstractC42548f {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f406140b;

        /* renamed from: c, reason: collision with root package name */
        public final int f406141c;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // k91.AbstractC42548f
        @k
        /* renamed from: a */
        public final Integer getF406146b() {
            return Integer.valueOf(this.f406141c);
        }

        public c(@l Throwable th2) {
            super(null);
            this.f406140b = th2;
            this.f406141c = 3403;
        }

        public /* synthetic */ c(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: TerminationEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk91/f$d;", "Lk91/f;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$d */
    public static final class d extends AbstractC42548f {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f406142b;

        /* renamed from: c, reason: collision with root package name */
        public final int f406143c;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // k91.AbstractC42548f
        @k
        /* renamed from: a */
        public final Integer getF406146b() {
            return Integer.valueOf(this.f406143c);
        }

        public d(@l Throwable th2) {
            super(null);
            this.f406142b = th2;
            this.f406143c = -1;
        }

        public /* synthetic */ d(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: TerminationEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk91/f$e;", "Lk91/f;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$e */
    public static final class e extends AbstractC42548f {

        /* renamed from: b, reason: collision with root package name */
        public final int f406144b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f406145c;

        public e(int i12, @l Throwable th2) {
            super(null);
            this.f406144b = i12;
            this.f406145c = th2;
        }

        @Override // k91.AbstractC42548f
        @k
        /* renamed from: a */
        public final Integer getF406146b() {
            return Integer.valueOf(this.f406144b);
        }

        public /* synthetic */ e(int i12, Throwable th2, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : th2);
        }
    }

    /* compiled from: TerminationEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk91/f$f;", "Lk91/f;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.f$f, reason: collision with other inner class name */
    public static final class C11606f extends AbstractC42548f {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f406146b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f406147c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f406148d;

        public C11606f() {
            this(null, null, null, 7, null);
        }

        @Override // k91.AbstractC42548f
        @l
        /* renamed from: a, reason: from getter */
        public final Integer getF406146b() {
            return this.f406146b;
        }

        public /* synthetic */ C11606f(Integer num, String str, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : th2);
        }

        public C11606f(@l Integer num, @l String str, @l Throwable th2) {
            super(null);
            this.f406146b = num;
            this.f406147c = str;
            this.f406148d = th2;
        }
    }

    public /* synthetic */ AbstractC42548f(C42822w c42822w) {
        this();
    }

    @l
    /* renamed from: a */
    public abstract Integer getF406146b();

    public AbstractC42548f() {
    }
}

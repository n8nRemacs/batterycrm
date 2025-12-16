package k91;

import X81.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;
import ru.avito.messenger.api.entity.MessengerResponse;

/* compiled from: SystemMessage.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0016\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u0082\u0001\u0016\u001d\u001e\u001f !\"#$%&'()*+,-./012¨\u00063"}, d2 = {"Lk91/e;", "Lru/avito/messenger/api/entity/MessengerResponse;", "<init>", "()V", "", "sequenceId", "Ljava/lang/String;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "Lk91/e$a;", "Lk91/e$b;", "Lk91/e$c;", "Lk91/e$d;", "Lk91/e$e;", "Lk91/e$f;", "Lk91/e$g;", "Lk91/e$h;", "Lk91/e$i;", "Lk91/e$j;", "Lk91/e$k;", "Lk91/e$l;", "Lk91/e$m;", "Lk91/e$n;", "Lk91/e$o;", "Lk91/e$p;", "Lk91/e$q;", "Lk91/e$r;", "Lk91/e$s;", "Lk91/e$t;", "Lk91/e$u;", "Lk91/e$v;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k91.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC42547e implements MessengerResponse {

    @X41.f
    @com.google.gson.annotations.c("seq")
    @Y61.l
    public String sequenceId;

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$a;", "Lk91/e;", "Lk91/d;", "Lk91/a;", "", "id", "value", "<init>", "(Ljava/lang/Long;Lk91/a;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Lk91/a;", "getValue", "()Lk91/a;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$a */
    public static final class a extends AbstractC42547e implements InterfaceC42546d<C42543a> {

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final Long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final C42543a value;

        public a(@Y61.l Long l12, @Y61.k C42543a c42543a) {
            super(null);
            this.id = l12;
            this.value = c42543a;
        }

        @Override // k91.InterfaceC42546d
        public final C42543a getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$b;", "Lk91/e;", "Lk91/d;", "LX81/a;", "", "id", "value", "<init>", "(JLX81/a;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/a;", "getValue", "()LX81/a;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$b */
    public static final class b extends AbstractC42547e implements InterfaceC42546d<X81.a> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.a value;

        public b(long j12, @Y61.k X81.a aVar) {
            super(null);
            this.id = j12;
            this.value = aVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.a getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$c;", "Lk91/e;", "Lk91/d;", "LX81/b;", "", "id", "value", "<init>", "(JLX81/b;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/b;", "getValue", "()LX81/b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$c */
    public static final class c extends AbstractC42547e implements InterfaceC42546d<X81.b> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.b value;

        public c(long j12, @Y61.k X81.b bVar) {
            super(null);
            this.id = j12;
            this.value = bVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.b getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$d;", "Lk91/e;", "Lk91/d;", "LX81/c;", "", "id", "value", "<init>", "(JLX81/c;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/c;", "getValue", "()LX81/c;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$d */
    public static final class d extends AbstractC42547e implements InterfaceC42546d<X81.c> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.c value;

        public d(long j12, @Y61.k X81.c cVar) {
            super(null);
            this.id = j12;
            this.value = cVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.c getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$e;", "Lk91/e;", "Lk91/d;", "LX81/e;", "", "id", "value", "<init>", "(JLX81/e;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/e;", "getValue", "()LX81/e;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$e, reason: collision with other inner class name */
    public static final class C11605e extends AbstractC42547e implements InterfaceC42546d<X81.e> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.e value;

        public C11605e(long j12, @Y61.k X81.e eVar) {
            super(null);
            this.id = j12;
            this.value = eVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.e getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$f;", "Lk91/e;", "Lk91/d;", "LX81/g;", "", "id", "value", "<init>", "(JLX81/g;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/g;", "getValue", "()LX81/g;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$f */
    public static final class f extends AbstractC42547e implements InterfaceC42546d<X81.g> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.g value;

        public f(long j12, @Y61.k X81.g gVar) {
            super(null);
            this.id = j12;
            this.value = gVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.g getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$g;", "Lk91/e;", "Lk91/d;", "LX81/m;", "", "id", "value", "<init>", "(JLX81/m;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/m;", "getValue", "()LX81/m;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$g */
    public static final class g extends AbstractC42547e implements InterfaceC42546d<X81.m> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.m value;

        public g(long j12, @Y61.k X81.m mVar) {
            super(null);
            this.id = j12;
            this.value = mVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.m getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$h;", "Lk91/e;", "Lk91/d;", "LX81/o;", "", "id", "value", "<init>", "(JLX81/o;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/o;", "getValue", "()LX81/o;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$h */
    public static final class h extends AbstractC42547e implements InterfaceC42546d<X81.o> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.o value;

        public h(long j12, @Y61.k X81.o oVar) {
            super(null);
            this.id = j12;
            this.value = oVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.o getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$i;", "Lk91/e;", "Lk91/d;", "LX81/i;", "", "id", "value", "<init>", "(JLX81/i;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/i;", "getValue", "()LX81/i;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$i */
    public static final class i extends AbstractC42547e implements InterfaceC42546d<X81.i> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.i value;

        public i(long j12, @Y61.k X81.i iVar) {
            super(null);
            this.id = j12;
            this.value = iVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.i getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$j;", "Lk91/e;", "Lk91/d;", "LX81/r;", "", "id", "value", "<init>", "(JLX81/r;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/r;", "getValue", "()LX81/r;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$j */
    public static final class j extends AbstractC42547e implements InterfaceC42546d<X81.r> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.r value;

        public j(long j12, @Y61.k X81.r rVar) {
            super(null);
            this.id = j12;
            this.value = rVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.r getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$k;", "Lk91/e;", "Lk91/d;", "LX81/t;", "", "id", "value", "<init>", "(JLX81/t;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/t;", "getValue", "()LX81/t;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$k */
    public static final class k extends AbstractC42547e implements InterfaceC42546d<X81.t> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.t value;

        public k(long j12, @Y61.k X81.t tVar) {
            super(null);
            this.id = j12;
            this.value = tVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.t getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$l;", "Lk91/e;", "Lk91/d;", "Lru/avito/messenger/api/entity/ChatMessage;", "", "id", "value", "<init>", "(JLru/avito/messenger/api/entity/ChatMessage;)V", "J", "getId", "()Ljava/lang/Long;", "Lru/avito/messenger/api/entity/ChatMessage;", "getValue", "()Lru/avito/messenger/api/entity/ChatMessage;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$l */
    public static final class l extends AbstractC42547e implements InterfaceC42546d<ChatMessage> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final ChatMessage value;

        public l(long j12, @Y61.k ChatMessage chatMessage) {
            super(null);
            this.id = j12;
            this.value = chatMessage;
        }

        @Override // k91.InterfaceC42546d
        public final ChatMessage getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$m;", "Lk91/e;", "Lk91/d;", "LX81/q;", "", "id", "value", "<init>", "(JLX81/q;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/q;", "getValue", "()LX81/q;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$m */
    public static final class m extends AbstractC42547e implements InterfaceC42546d<X81.q> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.q value;

        public m(long j12, @Y61.k X81.q qVar) {
            super(null);
            this.id = j12;
            this.value = qVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.q getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$n;", "Lk91/e;", "Lk91/d;", "Lru/avito/messenger/api/entity/ChatMessageUpdate;", "", "id", "value", "<init>", "(JLru/avito/messenger/api/entity/ChatMessageUpdate;)V", "J", "getId", "()Ljava/lang/Long;", "Lru/avito/messenger/api/entity/ChatMessageUpdate;", "getValue", "()Lru/avito/messenger/api/entity/ChatMessageUpdate;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$n */
    public static final class n extends AbstractC42547e implements InterfaceC42546d<ChatMessageUpdate> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final ChatMessageUpdate value;

        public n(long j12, @Y61.k ChatMessageUpdate chatMessageUpdate) {
            super(null);
            this.id = j12;
            this.value = chatMessageUpdate;
        }

        @Override // k91.InterfaceC42546d
        public final ChatMessageUpdate getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$o;", "Lk91/e;", "Lk91/d;", "LX81/j;", "", "id", "value", "<init>", "(JLX81/j;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/j;", "getValue", "()LX81/j;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$o */
    public static final class o extends AbstractC42547e implements InterfaceC42546d<X81.j> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.j value;

        public o(long j12, @Y61.k X81.j jVar) {
            super(null);
            this.id = j12;
            this.value = jVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.j getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$p;", "Lk91/e;", "Lk91/d;", "LX81/k;", "", "id", "value", "<init>", "(JLX81/k;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/k;", "getValue", "()LX81/k;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$p */
    public static final class p extends AbstractC42547e implements InterfaceC42546d<X81.k> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.k value;

        public p(long j12, @Y61.k X81.k kVar) {
            super(null);
            this.id = j12;
            this.value = kVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.k getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$q;", "Lk91/e;", "Lk91/d;", "LX81/l;", "", "id", "value", "<init>", "(JLX81/l;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/l;", "getValue", "()LX81/l;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$q */
    public static final class q extends AbstractC42547e implements InterfaceC42546d<X81.l> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final X81.l value;

        public q(long j12, @Y61.k X81.l lVar) {
            super(null);
            this.id = j12;
            this.value = lVar;
        }

        @Override // k91.InterfaceC42546d
        public final X81.l getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$r;", "Lk91/e;", "Lk91/d;", "Lk91/j;", "", "id", "value", "<init>", "(JLk91/j;)V", "J", "getId", "()Ljava/lang/Long;", "Lk91/j;", "a", "()Lk91/j;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$r */
    public static final class r extends AbstractC42547e implements InterfaceC42546d<C42552j> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final C42552j value;

        public r(long j12, @Y61.k C42552j c42552j) {
            super(null);
            this.id = j12;
            this.value = c42552j;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final C42552j getValue() {
            return this.value;
        }

        @Override // k91.InterfaceC42546d
        public final C42552j getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk91/e$s;", "Lk91/e;", "Lk91/d;", "Lmx0/a;", "", "id", "value", "Lmx0/e;", "type", "<init>", "(Ljava/lang/Long;Lmx0/a;Lmx0/e;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Lmx0/a;", "a", "()Lmx0/a;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$s */
    public static final /* data */ class s extends AbstractC42547e implements InterfaceC42546d<InterfaceC44149a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final mx0.e f406132a;

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final Long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final InterfaceC44149a value;

        public s(@Y61.l Long l12, @Y61.k InterfaceC44149a interfaceC44149a, @Y61.k mx0.e eVar) {
            super(null);
            this.id = l12;
            this.value = interfaceC44149a;
            this.f406132a = eVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final InterfaceC44149a getValue() {
            return this.value;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return L.f(this.id, sVar.id) && L.f(this.value, sVar.value) && L.f(this.f406132a, sVar.f406132a);
        }

        @Override // k91.InterfaceC42546d
        public final InterfaceC44149a getValue() {
            return this.value;
        }

        public final int hashCode() {
            Long l12 = this.id;
            return this.f406132a.hashCode() + ((this.value.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "SocketEventMessage(id=" + this.id + ", value=" + this.value + ", type=" + this.f406132a + ')';
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk91/e$t;", "Lk91/e;", "", "type", "subtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "id", "J", "getId", "()Ljava/lang/Long;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$t */
    public static final class t extends AbstractC42547e {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final String f406134a;

        @com.google.gson.annotations.c("id")
        private final long id;

        public t(@Y61.k String str, @Y61.l String str2) {
            super(null);
            this.f406134a = str;
        }

        @Y61.k
        public final String toString() {
            return super.toString() + " => type=" + this.f406134a;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$u;", "Lk91/e;", "Lk91/d;", "LX81/w;", "", "id", "value", "<init>", "(JLX81/w;)V", "J", "getId", "()Ljava/lang/Long;", "LX81/w;", "getValue", "()LX81/w;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$u */
    public static final class u extends AbstractC42547e implements InterfaceC42546d<w> {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final w value;

        public u(long j12, @Y61.k w wVar) {
            super(null);
            this.id = j12;
            this.value = wVar;
        }

        @Override // k91.InterfaceC42546d
        public final w getValue() {
            return this.value;
        }
    }

    /* compiled from: SystemMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lk91/e$v;", "Lk91/e;", "Lk91/d;", "Lcom/google/gson/i;", "", "id", "value", "<init>", "(Ljava/lang/Long;Lcom/google/gson/i;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Lcom/google/gson/i;", "a", "()Lcom/google/gson/i;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k91.e$v */
    public static final class v extends AbstractC42547e implements InterfaceC42546d<com.google.gson.i> {

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final Long id;

        @com.google.gson.annotations.c("value")
        @Y61.k
        private final com.google.gson.i value;

        public v(@Y61.l Long l12, @Y61.k com.google.gson.i iVar) {
            super(null);
            this.id = l12;
            this.value = iVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final com.google.gson.i getValue() {
            return this.value;
        }

        @Override // k91.InterfaceC42546d
        public final com.google.gson.i getValue() {
            return this.value;
        }
    }

    public /* synthetic */ AbstractC42547e(C42822w c42822w) {
        this();
    }

    private AbstractC42547e() {
    }
}

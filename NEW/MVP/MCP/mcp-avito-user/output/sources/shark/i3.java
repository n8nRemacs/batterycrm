package shark;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReferencePattern.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lshark/i3;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", "c", "d", "e", "Lshark/i3$c;", "Lshark/i3$e;", "Lshark/i3$b;", "Lshark/i3$d;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class i3 implements Serializable {
    private static final long serialVersionUID = -5113635523713591133L;

    /* compiled from: ReferencePattern.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/i3$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: ReferencePattern.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/i3$b;", "Lshark/i3;", "a", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class b extends i3 {
        private static final long serialVersionUID = 6649791455204159802L;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f438290b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f438291c;

        /* compiled from: ReferencePattern.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/i3$b$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }
        }

        static {
            new a(null);
        }

        public b(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f438290b = str;
            this.f438291c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f438290b, bVar.f438290b) && kotlin.jvm.internal.L.f(this.f438291c, bVar.f438291c);
        }

        public final int hashCode() {
            String str = this.f438290b;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f438291c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "instance field " + this.f438290b + '#' + this.f438291c;
        }
    }

    /* compiled from: ReferencePattern.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/i3$c;", "Lshark/i3;", "a", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class c extends i3 {
        private static final long serialVersionUID = -8985446122829543654L;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f438292b;

        /* compiled from: ReferencePattern.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/i3$c$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }
        }

        static {
            new a(null);
        }

        public c(@Y61.k String str) {
            super(null);
            this.f438292b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f438292b, ((c) obj).f438292b);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f438292b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "local variable on thread " + this.f438292b;
        }
    }

    /* compiled from: ReferencePattern.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/i3$d;", "Lshark/i3;", "a", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class d extends i3 {
        private static final long serialVersionUID = -2651328076202244933L;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f438293b;

        /* compiled from: ReferencePattern.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/i3$d$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }
        }

        static {
            new a(null);
        }

        public d(@Y61.k String str) {
            super(null);
            this.f438293b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this != obj) {
                return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f438293b, ((d) obj).f438293b);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f438293b;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "native global variable referencing " + this.f438293b;
        }
    }

    /* compiled from: ReferencePattern.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/i3$e;", "Lshark/i3;", "a", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class e extends i3 {
        private static final long serialVersionUID = 7656908128775899611L;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f438294b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f438295c;

        /* compiled from: ReferencePattern.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/i3$e$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }
        }

        static {
            new a(null);
        }

        public e(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f438294b = str;
            this.f438295c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.L.f(this.f438294b, eVar.f438294b) && kotlin.jvm.internal.L.f(this.f438295c, eVar.f438295c);
        }

        public final int hashCode() {
            String str = this.f438294b;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f438295c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "static field " + this.f438294b + '#' + this.f438295c;
        }
    }

    static {
        new a(null);
    }

    public i3() {
    }

    public /* synthetic */ i3(C42822w c42822w) {
        this();
    }
}

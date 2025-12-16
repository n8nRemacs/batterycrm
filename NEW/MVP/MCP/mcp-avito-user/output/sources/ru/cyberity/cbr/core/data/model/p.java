package ru.cyberity.cbr.core.data.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.model.CBRException;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\b\u000eB\u001f\b\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/model/p;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "exception", "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "payload", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "c", "Lru/cyberity/cbr/core/data/model/p$a;", "Lru/cyberity/cbr/core/data/model/p$b;", "Lru/cyberity/cbr/core/data/model/p$c;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class p implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Throwable exception;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Object payload;

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/p$a;", "Lru/cyberity/cbr/core/data/model/p;", "", "exception", "", "payload", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends p {
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(Throwable th2, Object obj, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2, (i12 & 2) != 0 ? null : obj);
        }

        public a(@Y61.l Throwable th2, @Y61.l Object obj) {
            super(th2, obj, null);
        }
    }

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/p$b;", "Lru/cyberity/cbr/core/data/model/p;", "", "exception", "", "payload", "<init>", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends p {
        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ b(Throwable th2, Object obj, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2, (i12 & 2) != 0 ? null : obj);
        }

        public b(@Y61.l Throwable th2, @Y61.l Object obj) {
            super(th2, obj, null);
        }
    }

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/p$c;", "Lru/cyberity/cbr/core/data/model/p;", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "description", "Lru/cyberity/cbr/core/data/model/CBRException$Api;", "exception", "", "payload", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/CBRException$Api;Ljava/lang/Object;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends p {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String description;

        public /* synthetic */ c(String str, CBRException.Api api, Object obj, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : api, (i12 & 4) != 0 ? null : obj);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public c(@Y61.l String str, @Y61.l CBRException.Api api, @Y61.l Object obj) {
            super(api, obj, null);
            this.description = str;
        }
    }

    public /* synthetic */ p(Throwable th2, Object obj, C42822w c42822w) {
        this(th2, obj);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    private p(Throwable th2, Object obj) {
        this.exception = th2;
        this.payload = obj;
    }

    public /* synthetic */ p(Throwable th2, Object obj, int i12, C42822w c42822w) {
        this(th2, (i12 & 2) != 0 ? null : obj, null);
    }
}

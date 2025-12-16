package ru.cyberity.input.tools.threading.safe;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ExecutionTimeoutException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/cyberity/fingerprint/tools/threading/safe/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/util/concurrent/TimeoutException;", "timeoutException", "", "Ljava/lang/StackTraceElement;", "executionThreadStackTrace", "<init>", "(Ljava/util/concurrent/TimeoutException;Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "", "getMessage", "()Ljava/lang/String;", "message", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<StackTraceElement> executionThreadStackTrace;

    /* compiled from: ExecutionTimeoutException.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "it", "", "a", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.fingerprint.tools.threading.safe.a$a, reason: collision with other inner class name */
    public static final class C12560a extends N implements Y41.l<StackTraceElement, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final C12560a f436061a = new C12560a();

        public C12560a() {
            super(1);
        }

        @Override // Y41.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@k StackTraceElement stackTraceElement) {
            return stackTraceElement.toString();
        }
    }

    public a(@k TimeoutException timeoutException, @l List<StackTraceElement> list) {
        super(timeoutException);
        this.executionThreadStackTrace = list;
    }

    @Override // java.lang.Throwable
    @k
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder("The execution took too long to complete. Original exception: ");
        sb2.append(getCause());
        sb2.append(", execution thread stacktrace: ");
        List<StackTraceElement> list = this.executionThreadStackTrace;
        return C22026a.c(sb2, list != null ? C42745f0.O(list, null, null, null, C12560a.f436061a, 31) : null, '.');
    }
}

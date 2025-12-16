package pc1;

import X41.n;
import Y61.j;
import Y61.k;
import Y61.l;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: Timber.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lpc1/b;", "", "<init>", "()V", "a", "b", "c", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C12280b f428696a = new C12280b(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ArrayList<c> f428697b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static volatile c[] f428698c = new c[0];

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpc1/b$a;", "Lpc1/b$c;", "<init>", "()V", "a", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f428699c;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f428700b = C42745f0.U(b.class.getName(), C12280b.class.getName(), c.class.getName(), a.class.getName());

        /* compiled from: Timber.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lpc1/b$a$a;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "", "MAX_LOG_LENGTH", "I", "MAX_TAG_LENGTH", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: pc1.b$a$a, reason: collision with other inner class name */
        public static final class C12279a {
            public /* synthetic */ C12279a(C42822w c42822w) {
                this();
            }

            public C12279a() {
            }
        }

        static {
            new C12279a(null);
            f428699c = Pattern.compile("(\\$\\d+)+$");
        }

        @Override // pc1.b.c
        @l
        public final String g() {
            String strG = super.g();
            if (strG != null) {
                return strG;
            }
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (!this.f428700b.contains(stackTraceElement.getClassName())) {
                    String className = stackTraceElement.getClassName();
                    String strN0 = C43066x.n0('.', className, className);
                    Matcher matcher = f428699c.matcher(strN0);
                    return matcher.find() ? matcher.replaceAll("") : strN0;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // pc1.b.c
        public final void j(int i12, @l String str, @k String str2, @l Throwable th2) {
            int iMin;
            if (str2.length() < 4000) {
                if (i12 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i12, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i13 = 0;
            while (i13 < length) {
                int iH2 = C43066x.H('\n', i13, 4, str2);
                if (iH2 == -1) {
                    iH2 = length;
                }
                while (true) {
                    iMin = Math.min(iH2, i13 + 4000);
                    String strSubstring = str2.substring(i13, iMin);
                    if (i12 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i12, str, strSubstring);
                    }
                    if (iMin >= iH2) {
                        break;
                    } else {
                        i13 = iMin;
                    }
                }
                i13 = iMin + 1;
            }
        }
    }

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpc1/b$b;", "Lpc1/b$c;", "<init>", "()V", "", "treeArray", "[Lpc1/b$c;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: pc1.b$b, reason: collision with other inner class name */
    public static final class C12280b extends c {
        public /* synthetic */ C12280b(C42822w c42822w) {
            this();
        }

        @Override // pc1.b.c
        @n
        public final void b(@j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        @n
        public final void c(@l Throwable th2, @j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.c(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        @n
        public final void d(@l Exception exc) {
            for (c cVar : b.f428698c) {
                cVar.d(exc);
            }
        }

        @Override // pc1.b.c
        @n
        public final void e(@j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.e(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        @n
        public final void f(@l Throwable th2, @j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.f(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        @n
        public final void h(@l Throwable th2, @j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.h(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        public final void j(int i12, @l String str, @k String str2, @l Throwable th2) {
            throw new AssertionError();
        }

        @Override // pc1.b.c
        @n
        public final void l(@l Throwable th2, @j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.l(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // pc1.b.c
        @n
        public final void m(@l IllegalArgumentException illegalArgumentException) {
            for (c cVar : b.f428698c) {
                cVar.m(illegalArgumentException);
            }
        }

        @Override // pc1.b.c
        @n
        public final void n(@l Throwable th2, @j @l String str, @k Object... objArr) {
            for (c cVar : b.f428698c) {
                cVar.n(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @n
        public final void o(@k c cVar) {
            if (!(cVar != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            ArrayList<c> arrayList = b.f428697b;
            synchronized (arrayList) {
                arrayList.add(cVar);
                Object[] array = arrayList.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                b.f428698c = (c[]) array;
                G0 g02 = G0.f406611a;
            }
        }

        @n
        @k
        public final void p(@k String str) {
            c[] cVarArr = b.f428698c;
            int length = cVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                c cVar = cVarArr[i12];
                i12++;
                cVar.f428701a.set(str);
            }
        }

        public C12280b() {
        }
    }

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpc1/b$c;", "", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ThreadLocal<String> f428701a = new ThreadLocal<>();

        public void b(@l String str, @k Object... objArr) {
            k(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void c(@l Throwable th2, @l String str, @k Object... objArr) {
            k(3, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(@l Exception exc) {
            k(6, exc, null, new Object[0]);
        }

        public void e(@l String str, @k Object... objArr) {
            k(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void f(@l Throwable th2, @l String str, @k Object... objArr) {
            k(6, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public /* synthetic */ String g() {
            ThreadLocal<String> threadLocal = this.f428701a;
            String str = threadLocal.get();
            if (str != null) {
                threadLocal.remove();
            }
            return str;
        }

        public void h(@l Throwable th2, @l String str, @k Object... objArr) {
            k(4, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public boolean i(int i12) {
            return true;
        }

        public abstract void j(int i12, @l String str, @k String str2, @l Throwable th2);

        public final void k(int i12, Throwable th2, String str, Object... objArr) {
            String strG = g();
            if (i(i12)) {
                if (str != null && str.length() != 0) {
                    if (objArr.length != 0) {
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    }
                    if (th2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) str);
                        sb2.append('\n');
                        StringWriter stringWriter = new StringWriter(256);
                        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                        th2.printStackTrace(printWriter);
                        printWriter.flush();
                        sb2.append(stringWriter.toString());
                        str = sb2.toString();
                    }
                } else {
                    if (th2 == null) {
                        return;
                    }
                    StringWriter stringWriter2 = new StringWriter(256);
                    PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                    th2.printStackTrace(printWriter2);
                    printWriter2.flush();
                    str = stringWriter2.toString();
                }
                j(i12, strG, str, th2);
            }
        }

        public void l(@l Throwable th2, @l String str, @k Object... objArr) {
            k(2, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void m(@l IllegalArgumentException illegalArgumentException) {
            k(5, illegalArgumentException, null, new Object[0]);
        }

        public void n(@l Throwable th2, @l String str, @k Object... objArr) {
            k(5, th2, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public b() {
        throw new AssertionError();
    }
}

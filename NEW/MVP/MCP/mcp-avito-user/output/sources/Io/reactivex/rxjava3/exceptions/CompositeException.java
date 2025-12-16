package io.reactivex.rxjava3.exceptions;

import j41.e;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f401981b;

    /* renamed from: c, reason: collision with root package name */
    public final String f401982c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f401983d;

    public static final class a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static abstract class b {
        public abstract b a(Serializable serializable);
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final PrintStream f401984a;

        public c(PrintStream printStream) {
            this.f401984a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        public final b a(Serializable serializable) {
            this.f401984a.print(serializable);
            return this;
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final PrintWriter f401985a;

        public d(PrintWriter printWriter) {
            this.f401985a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        public final b a(Serializable serializable) {
            this.f401985a.print(serializable);
            return this;
        }
    }

    public CompositeException(@e Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(b bVar, Throwable th2, String str) {
        bVar.a(str).a(th2).a('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            bVar.a("\t\tat ").a(stackTraceElement).a('\n');
        }
        if (th2.getCause() != null) {
            bVar.a("\tCaused by: ");
            a(bVar, th2.getCause(), "");
        }
    }

    public final void b(b bVar) {
        bVar.a(this).a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            bVar.a("\tat ").a(stackTraceElement).a("\n");
        }
        int i12 = 1;
        for (Throwable th2 : this.f401981b) {
            bVar.a("  ComposedException ").a(Integer.valueOf(i12)).a(" :\n");
            a(bVar, th2, "\t");
            i12++;
        }
        bVar.a("\n");
    }

    @Override // java.lang.Throwable
    @e
    public final synchronized Throwable getCause() {
        int i12;
        try {
            if (this.f401983d == null) {
                String property = System.getProperty("line.separator");
                if (this.f401981b.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f401981b.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f401981b) {
                        int i13 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i14 = 0; i14 < i13; i14++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append(cause.getClass().getCanonicalName());
                                sb2.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb2.append(message);
                                    sb2.append(property);
                                } else {
                                    sb2.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i15 = 0; i15 < i13 + 2; i15++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append(str);
                                        sb2.append(property);
                                    }
                                }
                                int i16 = 0;
                                while (true) {
                                    i12 = i13 + 2;
                                    if (i16 >= i12) {
                                        break;
                                    }
                                    sb2.append("  ");
                                    i16++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb2.append("at ");
                                    sb2.append(stackTrace[0]);
                                    sb2.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i17 = 0; i17 < i12; i17++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append("|-- ");
                                        sb2.append("(cause not expanded again) ");
                                        sb2.append(cause2.getClass().getCanonicalName());
                                        sb2.append(": ");
                                        sb2.append(cause2.getMessage());
                                        sb2.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i13++;
                                }
                            }
                        }
                    }
                    this.f401983d = new a(sb2.toString().trim());
                } else {
                    this.f401983d = this.f401981b.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f401983d;
    }

    @Override // java.lang.Throwable
    @e
    public final String getMessage() {
        return this.f401982c;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    public CompositeException(@e List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).f401981b);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f401981b = listUnmodifiableList;
            this.f401982c = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}

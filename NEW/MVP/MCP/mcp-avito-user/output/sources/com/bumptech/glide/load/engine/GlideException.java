package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import j.P;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class GlideException extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f338902g = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f338903b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.h f338904c;

    /* renamed from: d, reason: collision with root package name */
    public DataSource f338905d;

    /* renamed from: e, reason: collision with root package name */
    public Class<?> f338906e;

    /* renamed from: f, reason: collision with root package name */
    public final String f338907f;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof GlideException)) {
            arrayList.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).f338903b.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            a aVar = (a) appendable;
            aVar.append("Cause (");
            int i13 = i12 + 1;
            aVar.append(String.valueOf(i13));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = list.get(i12);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).d(aVar);
            } else {
                c(th2, aVar);
            }
            i12 = i13;
        }
    }

    public static void c(Throwable th2, Appendable appendable) throws IOException {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void d(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.f338903b, new a(appendable));
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f338907f);
        String str3 = "";
        if (this.f338906e != null) {
            str = ", " + this.f338906e;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f338905d != null) {
            str2 = ", " + this.f338905d;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (this.f338904c != null) {
            str3 = ", " + this.f338904c;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        d(System.err);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f338907f = str;
        setStackTrace(f338902g);
        this.f338903b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        d(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        d(printWriter);
    }

    public static final class a implements Appendable {

        /* renamed from: b, reason: collision with root package name */
        public final Appendable f338908b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f338909c = true;

        public a(Appendable appendable) {
            this.f338908b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c12) throws IOException {
            boolean z12 = this.f338909c;
            Appendable appendable = this.f338908b;
            if (z12) {
                this.f338909c = false;
                appendable.append("  ");
            }
            this.f338909c = c12 == '\n';
            appendable.append(c12);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@P CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@P CharSequence charSequence, int i12, int i13) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z12 = this.f338909c;
            Appendable appendable = this.f338908b;
            boolean z13 = false;
            if (z12) {
                this.f338909c = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i13 - 1) == '\n') {
                z13 = true;
            }
            this.f338909c = z13;
            appendable.append(charSequence, i12, i13);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

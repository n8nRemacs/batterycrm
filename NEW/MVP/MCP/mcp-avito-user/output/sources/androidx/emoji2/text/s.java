package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import androidx.core.util.z;
import j.N;
import j.P;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder.java */
@RestrictTo
/* loaded from: classes.dex */
public final class s extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Class<?> f46153b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ArrayList f46154c;

    /* compiled from: SpannableBuilder.java */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final Object f46155b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f46156c = new AtomicInteger(0);

        public a(Object obj) {
            this.f46155b = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f46155b).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            ((TextWatcher) this.f46155b).beforeTextChanged(charSequence, i12, i13, i14);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i12, int i13) {
            if (this.f46156c.get() <= 0 || !(obj instanceof m)) {
                ((SpanWatcher) this.f46155b).onSpanAdded(spannable, obj, i12, i13);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
  0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f46156c
                int r0 = r0.get()
                if (r0 <= 0) goto Ld
                boolean r0 = r10 instanceof androidx.emoji2.text.m
                if (r0 == 0) goto Ld
                return
            Ld:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1c
                r0 = 0
                if (r11 <= r12) goto L17
                r11 = r0
            L17:
                if (r13 <= r14) goto L1c
                r4 = r11
                r6 = r0
                goto L1e
            L1c:
                r4 = r11
                r6 = r13
            L1e:
                java.lang.Object r11 = r8.f46155b
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.s.a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i12, int i13) {
            if (this.f46156c.get() <= 0 || !(obj instanceof m)) {
                ((SpanWatcher) this.f46155b).onSpanRemoved(spannable, obj, i12, i13);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            ((TextWatcher) this.f46155b).onTextChanged(charSequence, i12, i13, i14);
        }
    }

    @RestrictTo
    public s(@N Class<?> cls, @N CharSequence charSequence) {
        super(charSequence);
        this.f46154c = new ArrayList();
        z.f(cls, "watcherClass cannot be null");
        this.f46153b = cls;
    }

    public final void a() {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f46154c;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i12)).f46156c.incrementAndGet();
            i12++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @RestrictTo
    public final void b() {
        e();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f46154c;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i12)).onTextChanged(this, 0, length(), length());
            i12++;
        }
    }

    public final a c(Object obj) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f46154c;
            if (i12 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i12);
            if (aVar.f46155b == obj) {
                return aVar;
            }
            i12++;
        }
    }

    public final boolean d(@P Object obj) {
        if (obj != null) {
            if (this.f46153b == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i12, int i13) {
        super.delete(i12, i13);
        return this;
    }

    public final void e() {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f46154c;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i12)).f46156c.decrementAndGet();
            i12++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(@P Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(@P Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(@P Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i12, int i13, @N Class<T> cls) {
        if (this.f46153b != cls) {
            return (T[]) super.getSpans(i12, i13, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i12, i13, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            tArr[i14] = aVarArr[i14].f46155b;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i12, CharSequence charSequence) {
        super.insert(i12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i12, int i13, @P Class cls) {
        if (cls == null || this.f46153b == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i12, i13, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(@P Object obj) {
        a aVarC;
        if (d(obj)) {
            aVarC = c(obj);
            if (aVarC != null) {
                obj = aVarC;
            }
        } else {
            aVarC = null;
        }
        super.removeSpan(obj);
        if (aVarC != null) {
            this.f46154c.remove(aVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i12, int i13, CharSequence charSequence) {
        replace(i12, i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(@P Object obj, int i12, int i13, int i14) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f46154c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i12, i13, i14);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i12, int i13) {
        return new s(this.f46153b, this, i12, i13);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i12, int i13) {
        super.delete(i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i12, CharSequence charSequence) {
        super.insert(i12, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i12, int i13, CharSequence charSequence, int i14, int i15) {
        replace(i12, i13, charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i12, CharSequence charSequence, int i13, int i14) {
        super.insert(i12, charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i12, int i13, CharSequence charSequence) {
        a();
        super.replace(i12, i13, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Editable append(char c12) {
        super.append(c12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i12, CharSequence charSequence, int i13, int i14) {
        super.insert(i12, charSequence, i13, i14);
        return this;
    }

    @RestrictTo
    public s(@N Class cls, @N s sVar, int i12, int i13) {
        super(sVar, i12, i13);
        this.f46154c = new ArrayList();
        z.f(cls, "watcherClass cannot be null");
        this.f46153b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final SpannableStringBuilder append(char c12) {
        super.append(c12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Appendable append(char c12) {
        super.append(c12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i12, int i13, CharSequence charSequence, int i14, int i15) {
        a();
        super.replace(i12, i13, charSequence, i14, i15);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i12, int i13) {
        super.append(charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i12, int i13) {
        super.append(charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i12, int i13) {
        super.append(charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i12) {
        super.append(charSequence, obj, i12);
        return this;
    }
}

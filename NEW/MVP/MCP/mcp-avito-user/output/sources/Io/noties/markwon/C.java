package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import j.N;
import j.P;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes8.dex */
public class C implements Appendable, CharSequence {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f401647c = new ArrayDeque(8);

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f401646b = new StringBuilder((CharSequence) "");

    /* compiled from: SpannableBuilder.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f401648a;

        /* renamed from: b, reason: collision with root package name */
        public final int f401649b;

        /* renamed from: c, reason: collision with root package name */
        public final int f401650c;

        /* renamed from: d, reason: collision with root package name */
        public final int f401651d;

        public a(@N Object obj, int i12, int i13, int i14) {
            this.f401648a = obj;
            this.f401649b = i12;
            this.f401650c = i13;
            this.f401651d = i14;
        }
    }

    /* compiled from: SpannableBuilder.java */
    public static class b extends SpannableStringBuilder {
    }

    public C() {
        b(0, "");
    }

    public static void c(@N C c12, @P Object obj, int i12, int i13) {
        if (obj != null) {
            int length = c12.f401646b.length();
            if (i13 <= i12 || i12 < 0 || i13 > length) {
                return;
            }
            d(c12, obj, i12, i13);
        }
    }

    public static void d(@N C c12, @P Object obj, int i12, int i13) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c12.getClass();
                c12.f401647c.push(new a(obj, i12, i13, 33));
            } else {
                for (Object obj2 : (Object[]) obj) {
                    d(c12, obj2, i12, i13);
                }
            }
        }
    }

    @N
    public final void a(char c12) {
        this.f401646b.append(c12);
    }

    @Override // java.lang.Appendable
    @N
    public final Appendable append(char c12) {
        this.f401646b.append(c12);
        return this;
    }

    public final void b(int i12, @P CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z12 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f401647c;
                if (!z12) {
                    for (int i13 = 0; i13 < length; i13++) {
                        Object obj = spans[i13];
                        arrayDeque.push(new a(obj, spanned.getSpanStart(obj) + i12, spanned.getSpanEnd(obj) + i12, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i14 = length - 1; i14 >= 0; i14--) {
                    Object obj2 = spans[i14];
                    arrayDeque.push(new a(obj2, spanned.getSpanStart(obj2) + i12, spanned.getSpanEnd(obj2) + i12, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f401646b.charAt(i12);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f401646b.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i12, int i13) {
        List<a> listUnmodifiableList;
        int i14;
        StringBuilder sb2 = this.f401646b;
        int length = sb2.length();
        if (i13 > i12 && i12 >= 0 && i13 <= length) {
            ArrayDeque arrayDeque = this.f401647c;
            if (i12 == 0 && length == i13) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    a aVar = (a) itDescendingIterator.next();
                    int i15 = aVar.f401649b;
                    if ((i15 >= i12 && i15 < i13) || (((i14 = aVar.f401650c) <= i13 && i14 > i12) || (i15 < i12 && i14 > i13))) {
                        arrayList2.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        } else {
            listUnmodifiableList = Collections.emptyList();
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb2.subSequence(i12, i13);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i12, i13));
        int length2 = spannableStringBuilder.length();
        for (a aVar2 : listUnmodifiableList) {
            int iMax = Math.max(0, aVar2.f401649b - i12);
            spannableStringBuilder.setSpan(aVar2.f401648a, iMax, Math.min(length2, (aVar2.f401650c - aVar2.f401649b) + iMax), aVar2.f401651d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @N
    public final String toString() {
        return this.f401646b.toString();
    }

    @Override // java.lang.Appendable
    @N
    public final Appendable append(CharSequence charSequence, int i12, int i13) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i12, i13);
        StringBuilder sb2 = this.f401646b;
        b(sb2.length(), charSequenceSubSequence);
        sb2.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @N
    public final Appendable append(@N CharSequence charSequence) {
        StringBuilder sb2 = this.f401646b;
        b(sb2.length(), charSequence);
        sb2.append(charSequence);
        return this;
    }
}

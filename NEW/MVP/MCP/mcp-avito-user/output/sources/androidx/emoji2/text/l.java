package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.e;
import androidx.emoji2.text.r;
import j.F;
import j.InterfaceC42148d;
import j.N;
import j.P;
import j.X;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiProcessor.java */
@RestrictTo
@X
@InterfaceC42148d
/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final e.C1785e f46116a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final r f46117b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final e.f f46118c;

    /* compiled from: EmojiProcessor.java */
    @X
    public static final class a {
    }

    /* compiled from: EmojiProcessor.java */
    public static class b implements c<v> {

        /* renamed from: a, reason: collision with root package name */
        @P
        public v f46119a;

        /* renamed from: b, reason: collision with root package name */
        public final e.C1785e f46120b;

        public b(@P v vVar, e.C1785e c1785e) {
            this.f46119a = vVar;
            this.f46120b = c1785e;
        }

        @Override // androidx.emoji2.text.l.c
        public final v a() {
            return this.f46119a;
        }

        @Override // androidx.emoji2.text.l.c
        public final boolean b(@N CharSequence charSequence, int i12, int i13, t tVar) {
            if ((tVar.f46160c & 4) > 0) {
                return true;
            }
            if (this.f46119a == null) {
                this.f46119a = new v(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f46120b.getClass();
            this.f46119a.setSpan(new u(tVar), i12, i13, 33);
            return true;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public interface c<T> {
        T a();

        boolean b(@N CharSequence charSequence, int i12, int i13, t tVar);
    }

    /* compiled from: EmojiProcessor.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public int f46125a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final r.a f46126b;

        /* renamed from: c, reason: collision with root package name */
        public r.a f46127c;

        /* renamed from: d, reason: collision with root package name */
        public r.a f46128d;

        /* renamed from: e, reason: collision with root package name */
        public int f46129e;

        /* renamed from: f, reason: collision with root package name */
        public int f46130f;

        public f(r.a aVar) {
            this.f46126b = aVar;
            this.f46127c = aVar;
        }

        public final void a() {
            this.f46125a = 1;
            this.f46127c = this.f46126b;
            this.f46130f = 0;
        }

        public final boolean b() {
            androidx.emoji2.text.flatbuffer.n nVarC = this.f46127c.f46152b.c();
            int iA2 = nVarC.a(6);
            return !(iA2 == 0 || nVarC.f46105b.get(iA2 + nVarC.f46104a) == 0) || this.f46129e == 65039;
        }
    }

    public l(@N r rVar, @N e.C1785e c1785e, @N e.f fVar, @N Set set) {
        this.f46116a = c1785e;
        this.f46117b = rVar;
        this.f46118c = fVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new e(str));
        }
    }

    public static boolean a(@N Editable editable, @N KeyEvent keyEvent, boolean z12) {
        m[] mVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (mVarArr = (m[]) editable.getSpans(selectionStart, selectionEnd, m.class)) != null && mVarArr.length > 0) {
            for (m mVar : mVarArr) {
                int spanStart = editable.getSpanStart(mVar);
                int spanEnd = editable.getSpanEnd(mVar);
                if ((z12 && spanStart == selectionStart) || ((!z12 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i12, int i13, t tVar) {
        if ((tVar.f46160c & 3) == 0) {
            e.f fVar = this.f46118c;
            androidx.emoji2.text.flatbuffer.n nVarC = tVar.c();
            int iA2 = nVarC.a(8);
            if (iA2 != 0) {
                nVarC.f46105b.getShort(iA2 + nVarC.f46104a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) fVar;
            dVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.d.f46063b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i12 < i13) {
                sb2.append(charSequence.charAt(i12));
                i12++;
            }
            TextPaint textPaint = dVar.f46064a;
            String string = sb2.toString();
            int i14 = androidx.core.graphics.m.f44779a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i15 = tVar.f46160c & 4;
            tVar.f46160c = zHasGlyph ? i15 | 2 : i15 | 1;
        }
        return (tVar.f46160c & 3) == 2;
    }

    public final <T> T c(@N CharSequence charSequence, @F int i12, @F int i13, @F int i14, boolean z12, c<T> cVar) {
        int i15;
        char c12;
        f fVar = new f(this.f46117b.f46149c);
        int iCodePointAt = Character.codePointAt(charSequence, i12);
        boolean zB2 = true;
        int i16 = 0;
        int iCharCount = i12;
        loop0: while (true) {
            i15 = iCharCount;
            while (iCharCount < i13 && i16 < i14 && zB2) {
                SparseArray<r.a> sparseArray = fVar.f46127c.f46151a;
                r.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (fVar.f46125a == 2) {
                    if (aVar != null) {
                        fVar.f46127c = aVar;
                        fVar.f46130f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            fVar.a();
                        } else if (iCodePointAt != 65039) {
                            r.a aVar2 = fVar.f46127c;
                            if (aVar2.f46152b != null) {
                                if (fVar.f46130f != 1) {
                                    fVar.f46128d = aVar2;
                                    fVar.a();
                                } else if (fVar.b()) {
                                    fVar.f46128d = fVar.f46127c;
                                    fVar.a();
                                } else {
                                    fVar.a();
                                }
                                c12 = 3;
                            } else {
                                fVar.a();
                            }
                        }
                        c12 = 1;
                    }
                    c12 = 2;
                } else if (aVar == null) {
                    fVar.a();
                    c12 = 1;
                } else {
                    fVar.f46125a = 2;
                    fVar.f46127c = aVar;
                    fVar.f46130f = 1;
                    c12 = 2;
                }
                fVar.f46129e = iCodePointAt;
                if (c12 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i15)) + i15;
                    if (iCharCount < i13) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c12 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i13) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c12 == 3) {
                    if (z12 || !b(charSequence, i15, iCharCount, fVar.f46128d.f46152b)) {
                        zB2 = cVar.b(charSequence, i15, iCharCount, fVar.f46128d.f46152b);
                        i16++;
                    }
                }
            }
            break loop0;
        }
        if (fVar.f46125a == 2 && fVar.f46127c.f46152b != null && ((fVar.f46130f > 1 || fVar.b()) && i16 < i14 && zB2 && (z12 || !b(charSequence, i15, iCharCount, fVar.f46127c.f46152b)))) {
            cVar.b(charSequence, i15, iCharCount, fVar.f46127c.f46152b);
        }
        return cVar.a();
    }

    /* compiled from: EmojiProcessor.java */
    public static class d implements c<d> {

        /* renamed from: a, reason: collision with root package name */
        public final int f46121a;

        /* renamed from: b, reason: collision with root package name */
        public int f46122b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f46123c = -1;

        public d(int i12) {
            this.f46121a = i12;
        }

        @Override // androidx.emoji2.text.l.c
        public final boolean b(@N CharSequence charSequence, int i12, int i13, t tVar) {
            int i14 = this.f46121a;
            if (i12 > i14 || i14 >= i13) {
                return i13 <= i14;
            }
            this.f46122b = i12;
            this.f46123c = i13;
            return false;
        }

        @Override // androidx.emoji2.text.l.c
        public final d a() {
            return this;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public static class e implements c<e> {

        /* renamed from: a, reason: collision with root package name */
        public final String f46124a;

        public e(String str) {
            this.f46124a = str;
        }

        @Override // androidx.emoji2.text.l.c
        public final boolean b(@N CharSequence charSequence, int i12, int i13, t tVar) {
            if (!TextUtils.equals(charSequence.subSequence(i12, i13), this.f46124a)) {
                return true;
            }
            tVar.f46160c = (tVar.f46160c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.l.c
        public final e a() {
            return this;
        }
    }
}

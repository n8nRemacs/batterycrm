package w0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.android.C22573l;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: WordIterator.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lw0/i;", "", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f441077e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f441078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BreakIterator f441081d;

    /* compiled from: WordIterator.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw0/i$a;", "", "<init>", "()V", "", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static boolean a(int i12) {
            int type = Character.getType(i12);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public a() {
        }
    }

    public i(@k CharSequence charSequence, int i12, @l Locale locale) {
        this.f441078a = charSequence;
        if (charSequence.length() < 0) {
            C50028a.a("input start index is outside the CharSequence");
        }
        if (i12 < 0 || i12 > charSequence.length()) {
            C50028a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f441081d = wordInstance;
        this.f441079b = Math.max(0, -50);
        this.f441080c = Math.min(charSequence.length(), i12 + 50);
        wordInstance.setText(new C22573l(i12, charSequence));
    }

    public final void a(int i12) {
        boolean z12 = false;
        int i13 = this.f441079b;
        int i14 = this.f441080c;
        if (i12 <= i14 && i13 <= i12) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        StringBuilder sbY = r.y(i12, i13, "Invalid offset: ", ". Valid range is [", " , ");
        sbY.append(i14);
        sbY.append(']');
        C50028a.a(sbY.toString());
    }

    public final boolean b(int i12) {
        int i13 = this.f441079b + 1;
        if (i12 > this.f441080c || i13 > i12) {
            return false;
        }
        CharSequence charSequence = this.f441078a;
        if (Character.isLetterOrDigit(Character.codePointBefore(charSequence, i12))) {
            return true;
        }
        int i14 = i12 - 1;
        if (Character.isSurrogate(charSequence.charAt(i14))) {
            return true;
        }
        if (!androidx.emoji2.text.e.g()) {
            return false;
        }
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        return eVarA.d() == 1 && eVarA.c(i14, charSequence) != -1;
    }

    public final boolean c(int i12) {
        int i13 = this.f441079b + 1;
        if (i12 > this.f441080c || i13 > i12) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(this.f441078a, i12);
        f441077e.getClass();
        return a.a(iCodePointBefore);
    }

    public final boolean d(int i12) {
        a(i12);
        if (this.f441081d.isBoundary(i12) && (!f(i12) || !f(i12 - 1) || !f(i12 + 1))) {
            if (i12 <= 0 || i12 >= this.f441078a.length() - 1) {
                return true;
            }
            if (!e(i12) && !e(i12 + 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(int i12) {
        int i13 = i12 - 1;
        CharSequence charSequence = this.f441078a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i13));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        return (L.f(unicodeBlockOf, unicodeBlock) && L.f(Character.UnicodeBlock.of(charSequence.charAt(i12)), Character.UnicodeBlock.KATAKANA)) || (L.f(Character.UnicodeBlock.of(charSequence.charAt(i12)), unicodeBlock) && L.f(Character.UnicodeBlock.of(charSequence.charAt(i13)), Character.UnicodeBlock.KATAKANA));
    }

    public final boolean f(int i12) {
        if (i12 >= this.f441080c || this.f441079b > i12) {
            return false;
        }
        CharSequence charSequence = this.f441078a;
        if (Character.isLetterOrDigit(Character.codePointAt(charSequence, i12)) || Character.isSurrogate(charSequence.charAt(i12))) {
            return true;
        }
        if (!androidx.emoji2.text.e.g()) {
            return false;
        }
        androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
        return eVarA.d() == 1 && eVarA.c(i12, charSequence) != -1;
    }

    public final boolean g(int i12) {
        if (i12 >= this.f441080c || this.f441079b > i12) {
            return false;
        }
        int iCodePointAt = Character.codePointAt(this.f441078a, i12);
        f441077e.getClass();
        return a.a(iCodePointAt);
    }

    public final int h(int i12) {
        a(i12);
        int iFollowing = this.f441081d.following(i12);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i12) {
        a(i12);
        int iPreceding = this.f441081d.preceding(i12);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }
}

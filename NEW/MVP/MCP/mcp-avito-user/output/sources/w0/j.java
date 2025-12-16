package w0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SegmentFinder.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw0/j;", "Lw0/f;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f441082a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f441083b;

    public j(@k CharSequence charSequence, @k i iVar) {
        this.f441082a = charSequence;
        this.f441083b = iVar;
    }

    @Override // w0.f
    public final int a(int i12) {
        do {
            i12 = this.f441083b.i(i12);
            if (i12 == -1 || i12 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f441082a.charAt(i12 - 1)));
        return i12;
    }

    @Override // w0.f
    public final int b(int i12) {
        CharSequence charSequence;
        do {
            i12 = this.f441083b.h(i12);
            if (i12 != -1) {
                charSequence = this.f441082a;
                if (i12 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i12)));
        return i12;
    }

    @Override // w0.f
    public final int c(int i12) {
        do {
            i12 = this.f441083b.i(i12);
            if (i12 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f441082a.charAt(i12)));
        return i12;
    }

    @Override // w0.f
    public final int d(int i12) {
        do {
            i12 = this.f441083b.h(i12);
            if (i12 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f441082a.charAt(i12 - 1)));
        return i12;
    }
}

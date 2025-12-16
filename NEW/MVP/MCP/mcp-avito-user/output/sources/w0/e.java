package w0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentFinder.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw0/e;", "Lw0/c;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final BreakIterator f441076a;

    public e(@k CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f441076a = characterInstance;
    }

    @Override // w0.c
    public final int e(int i12) {
        return this.f441076a.following(i12);
    }

    @Override // w0.c
    public final int f(int i12) {
        return this.f441076a.preceding(i12);
    }
}

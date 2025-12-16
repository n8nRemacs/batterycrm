package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.Metadata;

/* compiled from: CharSequenceCharacterIterator.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/l;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.android.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22573l implements CharacterIterator {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CharSequence f42014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42015c;

    /* renamed from: d, reason: collision with root package name */
    public int f42016d = 0;

    public C22573l(int i12, @Y61.k CharSequence charSequence) {
        this.f42014b = charSequence;
        this.f42015c = i12;
    }

    @Override // java.text.CharacterIterator
    @Y61.k
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i12 = this.f42016d;
        if (i12 == this.f42015c) {
            return (char) 65535;
        }
        return this.f42014b.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f42016d = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f42015c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f42016d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i12 = this.f42015c;
        if (i12 == 0) {
            this.f42016d = i12;
            return (char) 65535;
        }
        int i13 = i12 - 1;
        this.f42016d = i13;
        return this.f42014b.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i12 = this.f42016d + 1;
        this.f42016d = i12;
        int i13 = this.f42015c;
        if (i12 < i13) {
            return this.f42014b.charAt(i12);
        }
        this.f42016d = i13;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i12 = this.f42016d;
        if (i12 <= 0) {
            return (char) 65535;
        }
        int i13 = i12 - 1;
        this.f42016d = i13;
        return this.f42014b.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i12) {
        if (i12 > this.f42015c || i12 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f42016d = i12;
        return current();
    }
}

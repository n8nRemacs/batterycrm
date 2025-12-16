package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ReaderJsonLexer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/g;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43456g implements CharSequence {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final char[] f413086b;

    /* renamed from: c, reason: collision with root package name */
    public int f413087c;

    public C43456g(@Y61.k char[] cArr) {
        this.f413086b = cArr;
        this.f413087c = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f413086b[i12];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f413087c;
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final CharSequence subSequence(int i12, int i13) {
        return C43066x.p(this.f413086b, i12, Math.min(i13, this.f413087c));
    }

    @Override // java.lang.CharSequence
    @Y61.k
    public final String toString() {
        int i12 = this.f413087c;
        return C43066x.p(this.f413086b, 0, Math.min(i12, i12));
    }
}

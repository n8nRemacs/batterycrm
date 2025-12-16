package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21631i9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f36530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TypographyKeyTokens f36531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f36533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21631i9(long j12, TypographyKeyTokens typographyKeyTokens, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, int i12) {
        super(2);
        this.f36530l = j12;
        this.f36531m = typographyKeyTokens;
        this.f36532n = pVar;
        this.f36533o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36533o | 1);
        TypographyKeyTokens typographyKeyTokens = this.f36531m;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f36532n;
        C21676k9.b(this.f36530l, typographyKeyTokens, pVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

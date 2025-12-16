package io.ktor.util;

import java.util.zip.Deflater;
import kotlin.Metadata;

/* compiled from: Deflater.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Deflater f400401l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Deflater deflater) {
        super(0);
        this.f400401l = deflater;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(!this.f400401l.finished());
    }
}

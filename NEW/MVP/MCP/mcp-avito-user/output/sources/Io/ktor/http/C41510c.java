package io.ktor.http;

import kotlin.Metadata;

/* compiled from: Codecs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(B)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: io.ktor.http.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41510c extends kotlin.jvm.internal.N implements Y41.l<Byte, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f399943l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41510c(StringBuilder sb2) {
        super(1);
        this.f399943l = sb2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Byte b12) {
        this.f399943l.append(C41508b.a(b12.byteValue()));
        return kotlin.G0.f406611a;
    }
}

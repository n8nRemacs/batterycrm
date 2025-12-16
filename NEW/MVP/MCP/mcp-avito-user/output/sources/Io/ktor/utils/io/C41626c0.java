package io.ktor.utils.io;

import kotlin.Metadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41626c0 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400857l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f400858m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41626c0(AbstractC41660h0 abstractC41660h0, int i12) {
        super(0);
        this.f400857l = abstractC41660h0;
        this.f400858m = i12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        AbstractC41660h0 abstractC41660h0 = this.f400857l;
        return Boolean.valueOf(abstractC41660h0.get_availableForRead() < this.f400858m && !abstractC41660h0.x());
    }
}

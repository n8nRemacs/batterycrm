package Dk;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasUnionItemType.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LDk/i;", "", "LDk/f;", "bundles", "LDL0/b;", "performanceVas", "LAL0/a;", "additionalInfo", "<init>", "(LDk/f;LDL0/b;LAL0/a;)V", "LDk/f;", "a", "()LDk/f;", "LDL0/b;", "b", "()LDL0/b;", "LAL0/a;", "getAdditionalInfo", "()LAL0/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    @com.google.gson.annotations.c("additionalInfo")
    @l
    private final AL0.a additionalInfo;

    @com.google.gson.annotations.c("bundles")
    @l
    private final f bundles;

    @com.google.gson.annotations.c("performanceVas")
    @l
    private final DL0.b performanceVas;

    public i(@l f fVar, @l DL0.b bVar, @l AL0.a aVar) {
        this.bundles = fVar;
        this.performanceVas = bVar;
        this.additionalInfo = aVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getBundles() {
        return this.bundles;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DL0.b getPerformanceVas() {
        return this.performanceVas;
    }

    public /* synthetic */ i(f fVar, DL0.b bVar, AL0.a aVar, int i12, C42822w c42822w) {
        this(fVar, bVar, (i12 & 4) != 0 ? null : aVar);
    }
}

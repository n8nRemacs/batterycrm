package androidx.window.core;

import kotlin.Metadata;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/o;", "", "T", "Landroidx/window/core/n;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o<T> extends n<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f55196b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f55197c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final VerificationMode f55198d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l f55199e;

    public o(@Y61.k T t12, @Y61.k String str, @Y61.k VerificationMode verificationMode, @Y61.k l lVar) {
        this.f55196b = t12;
        this.f55197c = str;
        this.f55198d = verificationMode;
        this.f55199e = lVar;
    }

    @Override // androidx.window.core.n
    @Y61.k
    public final T a() {
        return this.f55196b;
    }

    @Override // androidx.window.core.n
    @Y61.k
    public final n<T> b(@Y61.k String str, @Y61.k Y41.l<? super T, Boolean> lVar) {
        return lVar.invoke(this.f55196b).booleanValue() ? this : new k(this.f55196b, this.f55197c, str, this.f55199e, this.f55198d);
    }
}

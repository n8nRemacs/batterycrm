package com.avito.android.lib.deprecated_design.edit_text;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: Mask.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class v extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f177992l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f177993m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l0.f fVar, w wVar) {
        super(0);
        this.f177992l = fVar;
        this.f177993m = wVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        l0.f fVar = this.f177992l;
        int i12 = fVar.f406840b;
        w wVar = this.f177993m;
        return Boolean.valueOf(i12 < wVar.f177997d.size() && ((Number) wVar.f177997d.get(fVar.f406840b)).intValue() == -1);
    }
}

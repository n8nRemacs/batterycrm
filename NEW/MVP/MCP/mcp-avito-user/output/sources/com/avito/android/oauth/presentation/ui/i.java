package com.avito.android.oauth.presentation.ui;

import j40.C42193c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l40.InterfaceC43542a;

/* compiled from: ExtendedForm.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f208419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42193c f208420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Y41.l<? super InterfaceC43542a, G0> lVar, C42193c c42193c) {
        super(0);
        this.f208419l = (N) lVar;
        this.f208420m = c42193c;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        Long id2 = this.f208420m.getId();
        this.f208419l.invoke(new InterfaceC43542a.b(id2 != null ? id2.longValue() : 0L));
        return G0.f406611a;
    }
}

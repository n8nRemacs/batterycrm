package com.avito.beduin.v2.utils.filepicker;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenAwareFilePickerClient.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHV0/c;", "invoke", "()LHV0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.a<HV0.c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f338442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.interaction.flow.file_picker.flow.l f338443m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f338444n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, com.avito.beduin.v2.interaction.flow.file_picker.flow.l lVar, l lVar2) {
        super(0);
        this.f338442l = gVar;
        this.f338443m = lVar;
        this.f338444n = lVar2;
    }

    @Override // Y41.a
    public final HV0.c invoke() {
        g gVar = this.f338442l;
        c cVar = gVar.f338431b;
        gVar.f338433d = cVar != null ? cVar.d(this.f338443m, this.f338444n) : null;
        return null;
    }
}

package com.avito.beduin.v2.utils.filepicker;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenAwareFilePickerClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class i extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f338445l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(0);
        this.f338445l = gVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        com.avito.beduin.v2.client.permission.f fVar = this.f338445l.f338432c;
        return Boolean.valueOf(fVar != null ? fVar.a() : true);
    }
}

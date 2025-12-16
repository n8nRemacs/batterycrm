package com.avito.android.beduin.ui.screen.fragment;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBaseScreenFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "", "kotlin.jvm.PlatformType", "isLoading", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.ui.screen.b f104248l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.beduin.ui.screen.b bVar) {
        super(1);
        this.f104248l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        com.avito.android.beduin.ui.screen.b bVar = this.f104248l;
        if (bVar != null) {
            bVar.R(bool2.booleanValue());
        }
        return G0.f406611a;
    }
}

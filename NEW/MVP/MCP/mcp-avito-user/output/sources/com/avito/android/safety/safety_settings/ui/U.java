package com.avito.android.safety.safety_settings.ui;

import androidx.compose.ui.platform.InterfaceC22520r2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsUnavailableTfaBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f257850l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22520r2 f257851m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(int i12, InterfaceC22520r2 interfaceC22520r2) {
        super(1);
        this.f257850l = i12;
        this.f257851m = interfaceC22520r2;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        if (num.intValue() > this.f257850l) {
            this.f257851m.a("https://support.avito.ru/sections/349");
        }
        return G0.f406611a;
    }
}

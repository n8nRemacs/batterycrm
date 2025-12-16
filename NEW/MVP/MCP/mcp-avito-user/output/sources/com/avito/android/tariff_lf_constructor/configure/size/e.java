package com.avito.android.tariff_lf_constructor.configure.size;

import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorConfigureSizeFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Intent;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<Intent, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorConfigureSizeFragment f300299l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConstructorConfigureSizeFragment constructorConfigureSizeFragment) {
        super(1);
        this.f300299l = constructorConfigureSizeFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Intent intent) {
        Intent intent2 = intent;
        com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l lVar = this.f300299l.f300246F0;
        if (lVar != null) {
            lVar.O0(intent2);
        }
        return G0.f406611a;
    }
}

package com.avito.android.help_center;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.help_center.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30748e extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f161676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30748e(String str) {
        super(1);
        this.f161676l = str;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putString("key_url", this.f161676l);
        return G0.f406611a;
    }
}

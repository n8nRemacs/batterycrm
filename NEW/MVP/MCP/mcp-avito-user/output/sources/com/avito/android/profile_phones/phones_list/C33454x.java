package com.avito.android.profile_phones.phones_list;

import android.os.Bundle;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile_phones.phones_list.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33454x extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f228332l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33454x(PhonesListFragment phonesListFragment) {
        super(2);
        this.f228332l = phonesListFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (str.equals("iac_enabled_result")) {
            PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
            this.f228332l.D5().accept(new InterfaceC49590a.d(bundle2.getBoolean("iac_iac_enabled")));
        }
        return G0.f406611a;
    }
}

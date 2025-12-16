package com.avito.android.beduin.v2.page.impl;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.C29270c0;
import com.avito.android.R;
import com.avito.android.util.C35966w1;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2PageActivity.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/a;", "Lcom/avito/android/beduin/v2/page/l;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Ii.k
/* renamed from: com.avito.android.beduin.v2.page.impl.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28864a implements com.avito.android.beduin.v2.page.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f104912a;

    /* compiled from: BeduinV2PageActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.v2.page.impl.a$a, reason: collision with other inner class name */
    public static final class C3130a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Intent f104913l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3130a(Intent intent) {
            super(1);
            this.f104913l = intent;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putAll(this.f104913l.getExtras());
            return G0.f406611a;
        }
    }

    @Inject
    public C28864a(@Y61.k C29270c0 c29270c0) {
        this.f104912a = c29270c0;
    }

    @Override // com.avito.android.beduin.v2.page.l
    public final void a(@Y61.k Intent intent, @Y61.k FragmentManager fragmentManager) {
        BeduinV2BottomSheetFragment beduinV2BottomSheetFragment;
        boolean booleanExtra = intent.getBooleanExtra("composeRenderer", false);
        C29270c0 c29270c0 = this.f104912a;
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[14];
        if (!((Boolean) c29270c0.f113278p.a().invoke()).booleanValue() || booleanExtra) {
            BeduinV2BottomSheetFragment.f104841l0.getClass();
            beduinV2BottomSheetFragment = new BeduinV2BottomSheetFragment();
        } else {
            BeduinV2BottomSheetFragment.f104841l0.getClass();
            beduinV2BottomSheetFragment = new BeduinV2BottomSheetFragment();
        }
        C35966w1.a(beduinV2BottomSheetFragment, -1, new C3130a(intent));
        beduinV2BottomSheetFragment.show(fragmentManager, "bottom_sheet");
    }

    @Override // com.avito.android.beduin.v2.page.l
    public final void b(@Y61.k com.avito.android.beduin.v2.page.e eVar) {
        Fragment fragmentH = eVar.getSupportFragmentManager().H("bottom_sheet");
        G0 g02 = null;
        BeduinV2BottomSheetFragment beduinV2BottomSheetFragment = fragmentH instanceof BeduinV2BottomSheetFragment ? (BeduinV2BottomSheetFragment) fragmentH : null;
        if (beduinV2BottomSheetFragment != null) {
            beduinV2BottomSheetFragment.dismiss();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            eVar.finish();
        }
    }

    @Override // com.avito.android.beduin.v2.page.l
    public final int c() {
        return R.layout.fragment_empty;
    }
}

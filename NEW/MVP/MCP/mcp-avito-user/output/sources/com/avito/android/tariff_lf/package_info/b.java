package com.avito.android.tariff_lf.package_info;

import Y41.l;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: TariffPackageInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/text/AttributedText;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<AttributedText, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffPackageInfoFragment f299176l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TariffPackageInfoFragment tariffPackageInfoFragment) {
        super(1);
        this.f299176l = tariffPackageInfoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AttributedText attributedText) {
        AttributedText attributedText2 = attributedText;
        TariffPackageInfoFragment tariffPackageInfoFragment = this.f299176l;
        C47313c c47313c = tariffPackageInfoFragment.f299171w0;
        n<Object> nVar = TariffPackageInfoFragment.f299160A0[2];
        TextView textView = (TextView) c47313c.a();
        com.avito.android.util.text.a aVar = tariffPackageInfoFragment.f299165q0;
        if (aVar == null) {
            aVar = null;
        }
        textView.setText(aVar.c(tariffPackageInfoFragment.requireContext(), attributedText2));
        return G0.f406611a;
    }
}

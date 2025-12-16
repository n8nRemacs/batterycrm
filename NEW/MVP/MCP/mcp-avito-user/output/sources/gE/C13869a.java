package Ge;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_loans_cabinet.InterfaceC28699d;
import com.avito.android.auto_loans_cabinet.deeplink.AutoLoanCabinetPageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetPageLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGe/a;", "Lev/b;", "Lcom/avito/android/auto_loans_cabinet/deeplink/AutoLoanCabinetPageLink;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ge.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13869a extends AbstractC40162b<AutoLoanCabinetPageLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f6624d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28699d f6625e;

    @Inject
    public C13869a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC28699d interfaceC28699d) {
        this.f6624d = interfaceC4053a;
        this.f6625e = interfaceC28699d;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f6624d.R(this.f6625e.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}

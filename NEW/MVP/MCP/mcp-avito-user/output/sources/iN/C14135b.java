package In;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.categories_global.CategoriesActivity;
import com.avito.android.categories_global.CategoriesGlobalDeepLink;
import com.avito.android.categories_global.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoriesGlobalDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIn/b;", "Lev/b;", "Lcom/avito/android/categories_global/CategoriesGlobalDeepLink;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: In.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14135b extends AbstractC40162b<CategoriesGlobalDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f8538d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f8539e;

    @Inject
    public C14135b(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f8538d = context;
        this.f8539e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CategoriesActivity.f116302p.getClass();
        Intent intent = new Intent(this.f8538d, (Class<?>) CategoriesActivity.class);
        String str2 = ((CategoriesGlobalDeepLink) deepLink).f116305b;
        intent.putExtra("categoryIdArg", str2);
        intent.setData(i.a(i.f116385a, null, str2, 1));
        this.f8539e.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}

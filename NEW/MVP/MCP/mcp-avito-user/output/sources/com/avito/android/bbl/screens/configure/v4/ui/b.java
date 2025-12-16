package com.avito.android.bbl.screens.configure.v4.ui;

import Y41.q;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV4Fragment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "requestKey", "Landroid/os/Bundle;", "args", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements q<DeepLink, String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BblConfigureV4Fragment f99529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BblConfigureV4Fragment bblConfigureV4Fragment) {
        super(3);
        this.f99529l = bblConfigureV4Fragment;
    }

    @Override // Y41.q
    public final G0 invoke(DeepLink deepLink, String str, Bundle bundle) {
        DeepLink deepLink2 = deepLink;
        String str2 = str;
        Bundle bundle2 = bundle;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f99529l.f99518q0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.r6(bundle2, deepLink2, str2);
        return G0.f406611a;
    }
}

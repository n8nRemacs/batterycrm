package com.avito.android.publish.select;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SelectViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectViewModel f242708b;

    public p(SelectViewModel selectViewModel) {
        this.f242708b = selectViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        String str = (String) q12.f406619b;
        DeepLink deepLink = (DeepLink) q12.f406620c;
        SelectViewModel selectViewModel = this.f242708b;
        SelectParameter selectParameter = selectViewModel.f242641P;
        if (selectParameter == null) {
            selectParameter = null;
        }
        selectParameter.setValue(str);
        Bundle bundle = new Bundle();
        bundle.putString("attrIdValue", str);
        selectViewModel.f242637L.r6(bundle, deepLink, "submitting_select_request_key");
    }
}

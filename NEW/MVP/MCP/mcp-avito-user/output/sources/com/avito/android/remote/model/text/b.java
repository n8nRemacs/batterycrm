package com.avito.android.remote.model.text;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import io.reactivex.rxjava3.core.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.I0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f253944c;

    public /* synthetic */ b(Object obj, int i12) {
        this.f253943b = i12;
        this.f253944c = obj;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f253943b) {
            case 0:
                D.c((I0) this.f253944c, deepLink);
                break;
            default:
                ((B) this.f253944c).onNext(deepLink);
                break;
        }
    }
}

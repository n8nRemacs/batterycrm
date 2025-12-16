package com.avito.android.advert.item.delivery_suggests;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class k implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f75118c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k(int i12, Y41.l lVar) {
        this.f75117b = i12;
        this.f75118c = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        ?? r02 = this.f75118c;
        switch (this.f75117b) {
            case 0:
                int i12 = m.f75120l;
                r02.invoke(deepLink);
                break;
            case 1:
                int i13 = com.avito.android.serp.adapter.alert_banner.m.f268922c;
                r02.invoke(deepLink);
                break;
            case 2:
                r02.invoke(deepLink);
                break;
            case 3:
                int i14 = MnzFloatingFooter.f197977j;
                r02.invoke(deepLink);
                break;
            case 4:
                int i15 = MnzFloatingFooter.f197977j;
                r02.invoke(deepLink);
                break;
            case 5:
                int i16 = MnzFloatingFooter.f197977j;
                r02.invoke(deepLink);
                break;
            default:
                int i17 = MnzFloatingFooter.f197977j;
                r02.invoke(deepLink);
                break;
        }
    }
}

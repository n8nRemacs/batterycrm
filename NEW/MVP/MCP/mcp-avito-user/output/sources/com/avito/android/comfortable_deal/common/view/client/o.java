package com.avito.android.comfortable_deal.common.view.client;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RedesignAgentCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f120688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<fp.i> f120689m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f120690n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f120691o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Image f120692p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f120693q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, List list, ArrayList arrayList, String str2, Image image, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f120688l = str;
        this.f120689m = list;
        this.f120690n = arrayList;
        this.f120691o = str2;
        this.f120692p = image;
        this.f120693q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(33345);
        ArrayList arrayList = this.f120690n;
        String str = this.f120691o;
        p.a(this.f120688l, this.f120689m, arrayList, str, this.f120692p, a12, iA2);
        return G0.f406611a;
    }
}

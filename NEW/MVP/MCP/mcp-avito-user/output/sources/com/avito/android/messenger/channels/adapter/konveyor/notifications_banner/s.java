package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelsNotificationsBannerRedesign.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f187022l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f187023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f187024n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f187025o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f187026p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f187027q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f187028r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, String str2, UniversalImage universalImage, Y41.a aVar, Y41.a aVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f187022l = str;
        this.f187023m = str2;
        this.f187024n = universalImage;
        this.f187025o = aVar;
        this.f187026p = aVar2;
        this.f187027q = vVar;
        this.f187028r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f187028r | 1);
        UniversalImage universalImage = this.f187024n;
        Y41.a<G0> aVar = this.f187025o;
        u.a(this.f187022l, this.f187023m, universalImage, aVar, this.f187026p, a12, iA2);
        return G0.f406611a;
    }
}

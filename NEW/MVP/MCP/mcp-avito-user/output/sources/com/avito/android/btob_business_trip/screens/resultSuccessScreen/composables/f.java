package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f108072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f108073m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f108074n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f108075o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f108076p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f108077q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f108078r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f108079s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f108080t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, String str2, UniversalImage universalImage, String str3, int i12, int i13, Y41.a aVar, v vVar, int i14) {
        super(2);
        this.f108072l = str;
        this.f108073m = str2;
        this.f108074n = universalImage;
        this.f108075o = str3;
        this.f108076p = i12;
        this.f108077q = i13;
        this.f108078r = (N) aVar;
        this.f108079s = vVar;
        this.f108080t = i14;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f108080t | 1);
        ?? r62 = this.f108078r;
        int i12 = this.f108076p;
        int i13 = this.f108077q;
        j.a(this.f108072l, this.f108073m, this.f108074n, this.f108075o, i12, i13, r62, this.f108079s, a12, iA2);
        return G0.f406611a;
    }
}

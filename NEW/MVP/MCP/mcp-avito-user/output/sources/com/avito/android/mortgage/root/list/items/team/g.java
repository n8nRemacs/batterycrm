package com.avito.android.mortgage.root.list.items.team;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TeamItemScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f202866l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f202867m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f202868n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f202869o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Image image, String str, String str2, v vVar, int i12) {
        super(2);
        this.f202866l = image;
        this.f202867m = str;
        this.f202868n = str2;
        this.f202869o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        String str = this.f202867m;
        String str2 = this.f202868n;
        h.c(this.f202866l, str, str2, a12, iA2);
        return G0.f406611a;
    }
}

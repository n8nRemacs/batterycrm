package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectMetroScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f265974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f265975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<ParcelableItem> f265976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f265977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f265978p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f265979q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroListOutputTypeItem.OutputType, G0> f265980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroStationItem, G0> f265981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f265982t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f265983u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroLineItem, G0> f265984v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroFilterItem, G0> f265985w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f265986x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f265987y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(String str, w0 w0Var, List<? extends ParcelableItem> list, boolean z12, com.avito.android.analytics.screens.mvi.r rVar, Y41.l<? super String, G0> lVar, Y41.l<? super MetroListOutputTypeItem.OutputType, G0> lVar2, Y41.l<? super MetroStationItem, G0> lVar3, Y41.p<? super MetroSelectedStationsItem, ? super String, G0> pVar, Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar2, Y41.l<? super MetroLineItem, G0> lVar4, Y41.l<? super MetroFilterItem, G0> lVar5, int i12, int i13) {
        super(2);
        this.f265974l = str;
        this.f265975m = w0Var;
        this.f265976n = list;
        this.f265977o = z12;
        this.f265978p = rVar;
        this.f265979q = lVar;
        this.f265980r = lVar2;
        this.f265981s = lVar3;
        this.f265982t = pVar;
        this.f265983u = pVar2;
        this.f265984v = lVar4;
        this.f265985w = lVar5;
        this.f265986x = i12;
        this.f265987y = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265986x | 1);
        int iA3 = C22066f2.a(this.f265987y);
        Y41.l<MetroLineItem, G0> lVar = this.f265984v;
        Y41.l<MetroFilterItem, G0> lVar2 = this.f265985w;
        L.c(this.f265974l, this.f265975m, this.f265976n, this.f265977o, this.f265978p, this.f265979q, this.f265980r, this.f265981s, this.f265982t, this.f265983u, lVar, lVar2, a12, iA2, iA3);
        return G0.f406611a;
    }
}

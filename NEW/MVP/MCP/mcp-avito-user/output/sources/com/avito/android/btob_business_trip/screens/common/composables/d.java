package com.avito.android.btob_business_trip.screens.common.composables;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: B2bTripListItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_btob-business-trip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* compiled from: B2bTripListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f107879l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: B2bTripListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UniversalImage f107880l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f107881m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f107882n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f107883o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, G0> f107884p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Boolean f107885q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f107886r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f107887s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(UniversalImage universalImage, String str, String str2, v vVar, l<? super Boolean, G0> lVar, Boolean bool, int i12, int i13) {
            super(2);
            this.f107880l = universalImage;
            this.f107881m = str;
            this.f107882n = str2;
            this.f107883o = vVar;
            this.f107884p = lVar;
            this.f107885q = bool;
            this.f107886r = i12;
            this.f107887s = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f107886r | 1);
            v vVar = this.f107883o;
            d.a(this.f107880l, this.f107881m, this.f107882n, vVar, this.f107884p, this.f107885q, a12, iA2, this.f107887s);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.remote.model.UniversalImage r42, @Y61.k java.lang.String r43, @Y61.k java.lang.String r44, @Y61.l androidx.compose.ui.v r45, @Y61.l Y41.l<? super java.lang.Boolean, kotlin.G0> r46, @Y61.l java.lang.Boolean r47, @Y61.l androidx.compose.runtime.A r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.common.composables.d.a(com.avito.android.remote.model.UniversalImage, java.lang.String, java.lang.String, androidx.compose.ui.v, Y41.l, java.lang.Boolean, androidx.compose.runtime.A, int, int):void");
    }
}

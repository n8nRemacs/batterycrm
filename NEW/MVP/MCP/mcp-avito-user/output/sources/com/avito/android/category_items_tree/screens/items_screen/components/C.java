package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextWithIcon.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class C extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f116827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f116828m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f116829n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f116830o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str, String str2, v.a aVar, int i12) {
        super(2);
        this.f116827l = str;
        this.f116828m = str2;
        this.f116829n = aVar;
        this.f116830o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116830o | 1);
        v.a aVar = this.f116829n;
        E.a(this.f116827l, this.f116828m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

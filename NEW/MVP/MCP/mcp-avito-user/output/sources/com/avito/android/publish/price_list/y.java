package com.avito.android.publish.price_list;

import android.content.res.ColorStateList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectPriceListView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class y extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f238936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f238937m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f238938n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ColorStateList colorStateList, ColorStateList colorStateList2) {
        super(1);
        this.f238936l = zVar;
        this.f238937m = colorStateList;
        this.f238938n = colorStateList2;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        z zVar = this.f238936l;
        zVar.f238950l.setLeftIconColor(str2.length() == 0 ? this.f238937m : this.f238938n);
        zVar.f238942d.invoke(str2);
        return G0.f406611a;
    }
}

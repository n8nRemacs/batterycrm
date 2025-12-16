package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div2.DivAccessibility;
import kotlin.Metadata;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hint", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38017y extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f369041l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DivAccessibility f369042m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f369043n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38017y(View view, DivAccessibility divAccessibility, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f369041l = view;
        this.f369042m = divAccessibility;
        this.f369043n = eVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        String str2 = str;
        com.yandex.div.json.expressions.b<String> bVar = this.f369042m.f371183a;
        C37931a.b(this.f369041l, bVar == null ? null : bVar.a(this.f369043n), str2);
        return kotlin.G0.f406611a;
    }
}

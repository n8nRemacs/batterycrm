package com.yandex.div.core.widget.wraplayout;

import Y41.l;
import android.graphics.Canvas;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WrapLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "top", "Lkotlin/G0;", "invoke", "(I)Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class c extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f369356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Canvas f369357m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Canvas canvas) {
        super(1);
        this.f369356l = bVar;
        this.f369357m = canvas;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        b bVar = this.f369356l;
        return b.i(bVar.getLineSeparatorDrawable(), this.f369357m, bVar.getPaddingLeft(), iIntValue - bVar.f369343m, bVar.getWidth() - bVar.getPaddingRight(), iIntValue);
    }
}

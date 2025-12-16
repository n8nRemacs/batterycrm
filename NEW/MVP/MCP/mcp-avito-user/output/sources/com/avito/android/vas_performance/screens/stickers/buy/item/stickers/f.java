package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<Integer, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f320672l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f320672l = bVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Integer num) {
        return Boolean.valueOf(this.f320672l.f320667d.get(num.intValue()).f320664e == null);
    }
}

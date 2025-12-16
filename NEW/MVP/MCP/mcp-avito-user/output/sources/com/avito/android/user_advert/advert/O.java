package com.avito.android.user_advert.advert;

import kotlin.Metadata;

/* compiled from: MyAdvertDetailsConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<Integer, Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f308398l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(N n12) {
        super(1);
        this.f308398l = n12;
    }

    @Override // Y41.l
    public final Long invoke(Integer num) {
        num.intValue();
        return Long.valueOf(this.f308398l.f308374d.a().hashCode());
    }
}

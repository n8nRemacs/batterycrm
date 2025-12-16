package com.avito.android.campaigns_sale.mvi;

import kotlin.Metadata;

/* compiled from: CampaignsSaleBlocksResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "d1", "d2", "invoke", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class A extends kotlin.jvm.internal.N implements Y41.p<Integer, Integer, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final A f114057l = new A();

    public A() {
        super(2);
    }

    @Override // Y41.p
    public final Integer invoke(Integer num, Integer num2) {
        Integer num3 = num;
        Integer num4 = num2;
        return Integer.valueOf((num4 != null ? num4.intValue() : 0) - (num3 != null ? num3.intValue() : 0));
    }
}

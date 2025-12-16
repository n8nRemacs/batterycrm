package com.avito.android.payment.items.text_item;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment/items/text_item/c;", "Lcom/avito/conveyor_item/a;", "a", "b", "Lcom/avito/android/payment/items/text_item/c$a;", "Lcom/avito/android/payment/items/text_item/c$b;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f214512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CharSequence f214513c;

    /* compiled from: TextItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/items/text_item/c$a;", "Lcom/avito/android/payment/items/text_item/c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends c {
    }

    /* compiled from: TextItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/items/text_item/c$b;", "Lcom/avito/android/payment/items/text_item/c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {
    }

    public c(String str, CharSequence charSequence, C42822w c42822w) {
        this.f214512b = str;
        this.f214513c = charSequence;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF214512b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF214512b() {
        return this.f214512b;
    }
}

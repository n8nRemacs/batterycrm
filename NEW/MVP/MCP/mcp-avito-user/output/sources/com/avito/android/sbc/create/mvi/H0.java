package com.avito.android.sbc.create.mvi;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/H0;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f259298a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.a f259299b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f259300c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f259301d;

    @Inject
    public H0(@Y61.k Resources resources, @Y61.k com.avito.android.sbc.utils.a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k Context context) {
        this.f259298a = resources;
        this.f259299b = aVar;
        this.f259300c = aVar2;
        this.f259301d = context;
    }

    @Y61.k
    public final String a(long j12) {
        return this.f259298a.getString(R.string.messenger_create_discount_dispatch_minimal_discount, this.f259299b.a(j12));
    }

    @Y61.k
    public final String b(long j12) {
        return this.f259298a.getString(R.string.messenger_create_discount_dispatch_minimal_discount, this.f259299b.b(j12));
    }
}

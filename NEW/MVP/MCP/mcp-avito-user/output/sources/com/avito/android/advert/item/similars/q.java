package com.avito.android.advert.item.similars;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.section.SectionResponseV3Converter;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: ComplementaryInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/q;", "Lcom/avito/android/advert/item/similars/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f80325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<fa.d> f80326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenSource f80327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f80328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f80329e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SectionResponseV3Converter f80330f;

    @Inject
    public q(@Y61.k @InterfaceC30174s String str, @Y61.k h31.e<fa.d> eVar, @Y61.k ScreenSource screenSource, @Y61.k com.avito.android.location.r rVar, @Y61.k R0 r02, @Y61.k SectionResponseV3Converter sectionResponseV3Converter) {
        this.f80325a = str;
        this.f80326b = eVar;
        this.f80327c = screenSource;
        this.f80328d = rVar;
        this.f80329e = r02;
        this.f80330f = sectionResponseV3Converter;
    }

    @Override // com.avito.android.advert.item.similars.n
    @Y61.l
    public final Object a(@Y61.k List list, @Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l String str, @Y61.l String str2, @Y61.l Boolean bool, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f80329e.a(), new o(advertDetailsStyle, this, list, str, str2, bool, null), suspendLambda);
    }
}

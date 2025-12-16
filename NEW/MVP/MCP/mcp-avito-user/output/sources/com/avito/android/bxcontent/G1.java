package com.avito.android.bxcontent;

import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxSingleItemLoader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/G1;", "Lcom/avito/android/bxcontent/E1;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class G1 implements E1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34323k> f109335a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.i f109336b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f109337c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f109338d;

    @Inject
    public G1(@Y61.k h31.e<InterfaceC34323k> eVar, @Y61.k com.avito.android.serp.i iVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k com.avito.android.util.R0 r02) {
        this.f109335a = eVar;
        this.f109336b = iVar;
        this.f109337c = searchParamsConverter;
        this.f109338d = r02;
    }

    @Override // com.avito.android.bxcontent.E1
    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str, @Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams, @Y61.l String str2, @Y61.l Long l12) {
        return C43175k.I(this.f109338d.a(), C43175k.G(new F1(this, presentationType, l12, str2, searchParams, str, null)));
    }
}

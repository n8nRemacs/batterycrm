package com.avito.android.bbl.screens.configure.v2.mvi.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.bbl.screens.configure.v2.mvi.entity.BblConfigureV2InternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lh.InterfaceC43770a;
import nh.InterfaceC44422a;
import oh.InterfaceC44774a;

/* compiled from: GetBblConfigureV2UseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/domain/c;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/domain/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44774a f99339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f99340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f99341d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99342e;

    @Inject
    public c(@Y61.k InterfaceC44774a interfaceC44774a, @Y61.k R0 r02, @InterfaceC44422a @Y61.k String str, @Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99339b = interfaceC44774a;
        this.f99340c = r02;
        this.f99341d = str;
        this.f99342e = interfaceC43770a;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends BblConfigureV2InternalAction> invoke() {
        return C43175k.I(this.f99340c.a(), C43175k.G(new b(this, null)));
    }
}

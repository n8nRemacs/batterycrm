package com.avito.android.profile_settings_extended.adapter.universal.section;

import Za0.InterfaceC19524a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalWidgetSectionsOrderInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/n;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f229961a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f229962b;

    @Inject
    public n(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f229961a = eVar;
        this.f229962b = r02;
    }

    @Y61.k
    public final InterfaceC43160i a(@Y61.k ArrayList arrayList) {
        return C43175k.I(this.f229962b.a(), new C43152f0(C43175k.G(new l(this, arrayList, null)), new m(3, null)));
    }
}

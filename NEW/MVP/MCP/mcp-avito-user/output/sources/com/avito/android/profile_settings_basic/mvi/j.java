package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14879b;
import Qb0.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import com.avito.android.profile_settings_basic.mvi.entity.BasicInfoAvatarAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: BasicProfileSettingsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "LQb0/a;", "LQb0/b;", "LQb0/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC14878a, InterfaceC14879b, Qb0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_basic.s f228889a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33460e f228890b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f228891c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f228892d;

    @Inject
    public j(@Y61.k com.avito.android.profile_settings_basic.s sVar, @Y61.k InterfaceC33460e interfaceC33460e, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f228889a = sVar;
        this.f228890b = interfaceC33460e;
        this.f228891c = interfaceC28373a;
        this.f228892d = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14879b> b(InterfaceC14878a interfaceC14878a, Qb0.d dVar) {
        InterfaceC14878a interfaceC14878a2 = interfaceC14878a;
        Qb0.d dVar2 = dVar;
        boolean z12 = interfaceC14878a2 instanceof InterfaceC14878a.d;
        com.avito.android.profile_settings_basic.s sVar = this.f228889a;
        if (z12) {
            return sVar.b(false);
        }
        if (interfaceC14878a2 instanceof InterfaceC14878a.e) {
            return sVar.b(true);
        }
        if (interfaceC14878a2 instanceof e.g) {
            return C43175k.G(new b(interfaceC14878a2, null));
        }
        boolean z13 = interfaceC14878a2 instanceof e.a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f228892d;
        if (z13) {
            DeepLink deepLink = ((e.a) interfaceC14878a2).f13916b.f124953l;
            if (deepLink != null) {
                b.a.a(aVar, deepLink, null, null, 6);
            }
            return C43175k.w();
        }
        if (interfaceC14878a2 instanceof e.h) {
            b.a.a(aVar, ((e.h) interfaceC14878a2).f13922b, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC14878a2 instanceof e.f) {
            return sVar.a();
        }
        if (interfaceC14878a2 instanceof e.c) {
            return C43175k.G(new c(interfaceC14878a2, null));
        }
        if (interfaceC14878a2 instanceof e.b) {
            return C43175k.G(new d(interfaceC14878a2, dVar2, this, null));
        }
        boolean z14 = interfaceC14878a2 instanceof InterfaceC14878a.b;
        InterfaceC33460e interfaceC33460e = this.f228890b;
        if (z14) {
            return C43175k.B(new e(2, null), interfaceC33460e.b(((InterfaceC14878a.b) interfaceC14878a2).f13864b));
        }
        if (interfaceC14878a2 instanceof BasicInfoAvatarAction.DeleteAvatarImage) {
            return new X(C43175k.B(new f(2, null), interfaceC33460e.a(((BasicInfoAvatarAction.DeleteAvatarImage) interfaceC14878a2).f228875b)), new g(this, null));
        }
        if (interfaceC14878a2 instanceof BasicInfoAvatarAction.OpenAvatarPicker) {
            return C43175k.G(new h(dVar2, null));
        }
        if (interfaceC14878a2 instanceof InterfaceC14878a.C0913a) {
            return new C43210w(InterfaceC14879b.a.f13868a);
        }
        if (interfaceC14878a2 instanceof e.C0916e) {
            b.a.a(aVar, null, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC14878a2 instanceof e.d) {
            return C43175k.G(new i(interfaceC14878a2, this, null));
        }
        if (interfaceC14878a2 instanceof InterfaceC14878a.c) {
            return C43175k.G(new a(interfaceC14878a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

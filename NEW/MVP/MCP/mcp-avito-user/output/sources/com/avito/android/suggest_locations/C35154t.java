package com.avito.android.suggest_locations;

import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/t;", "Lcom/avito/android/suggest_locations/i;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.suggest_locations.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35154t implements InterfaceC35144i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f292378a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f292379b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35159y f292380c;

    @Inject
    public C35154t(@Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35159y interfaceC35159y) {
        this.f292378a = gVar;
        this.f292379b = interfaceC35745a5;
        this.f292380c = interfaceC35159y;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35144i
    @Y61.k
    public final C42007e a(@Y61.k String str) {
        return new C42007e(new C35146k(this, str, 2));
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35144i
    @Y61.k
    public final C42007e b(@Y61.k String str) {
        return new C42007e(new C35146k(this, str, 0));
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35144i
    @Y61.k
    public final C42007e c(@Y61.l final Boolean bool, @Y61.k final String str, @Y61.l final String str2) {
        return new C42007e(new l41.s() { // from class: com.avito.android.suggest_locations.l
            @Override // l41.s
            public final Object get() {
                C35154t c35154t = this.f292339b;
                com.avito.android.geo_common.interactor.g gVar = c35154t.f292378a;
                String str3 = str2;
                Boolean bool2 = bool;
                String str4 = str;
                return gVar.r(bool2, str4, str3).S().r(new C35153s(c35154t, str4)).u(new C32102w0(28)).z(c35154t.f292379b.a());
            }
        });
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35144i
    @Y61.k
    public final C42007e d(@Y61.k final String str, @Y61.l final String str2) {
        return new C42007e(new l41.s() { // from class: com.avito.android.suggest_locations.j
            @Override // l41.s
            public final Object get() {
                String str3 = str2;
                Map mapSingletonMap = str3 != null ? Collections.singletonMap("types", str3) : P0.c();
                C35154t c35154t = this.f292333b;
                return c35154t.f292378a.y(str, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? P0.c() : mapSingletonMap).S().r(C35150o.f292348b).u(new C32102w0(25)).z(c35154t.f292379b.a());
            }
        });
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35144i
    @Y61.k
    public final C42007e k(@Y61.k String str) {
        return new C42007e(new C35146k(this, str, 1));
    }
}

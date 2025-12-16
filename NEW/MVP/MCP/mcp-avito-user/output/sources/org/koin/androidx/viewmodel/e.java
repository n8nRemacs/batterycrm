package org.koin.androidx.viewmodel;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.InterfaceC23487e;
import androidx.view.T0;
import kotlin.C49177a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p71.InterfaceC46911e;
import w71.InterfaceC49462a;

/* compiled from: ViewModelParameter.kt */
@InterfaceC46911e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lorg/koin/androidx/viewmodel/e;", "", "T", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC42830m
/* loaded from: classes7.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.d<T> f421426a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InterfaceC49462a f421427b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<Bundle> f421428c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Y41.a<C49177a> f421429d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final T0 f421430e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final InterfaceC23487e f421431f;

    public e() {
        throw null;
    }

    public e(kotlin.reflect.d dVar, InterfaceC49462a interfaceC49462a, Y41.a aVar, Y41.a aVar2, T0 t02, InterfaceC23487e interfaceC23487e, int i12, C42822w c42822w) {
        interfaceC49462a = (i12 & 2) != 0 ? null : interfaceC49462a;
        aVar = (i12 & 4) != 0 ? null : aVar;
        aVar2 = (i12 & 8) != 0 ? null : aVar2;
        interfaceC23487e = (i12 & 32) != 0 ? null : interfaceC23487e;
        this.f421426a = dVar;
        this.f421427b = interfaceC49462a;
        this.f421428c = aVar;
        this.f421429d = aVar2;
        this.f421430e = t02;
        this.f421431f = interfaceC23487e;
    }
}

package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.InterfaceC32900o;
import com.avito.android.permissions.u;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.internal.operators.single.A;
import javax.inject.Inject;
import javax.inject.Singleton;
import jg0.InterfaceC42375a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mM.InterfaceC43981a;
import pM.InterfaceC46977a;

/* compiled from: IacDeviceAvailabilityUpdater.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/c;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/a;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f168348k = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f168349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f168350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f168351c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42375a f168352d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168353e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f168354f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46977a f168355g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a f168356h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43981a f168357i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f168358j;

    /* compiled from: IacDeviceAvailabilityUpdater.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar, @Y61.k k kVar, @Y61.k u uVar, @Y61.k InterfaceC42375a interfaceC42375a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC32900o interfaceC32900o, @Y61.k InterfaceC46977a interfaceC46977a, @Y61.k com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a aVar2, @Y61.k InterfaceC43981a interfaceC43981a, @Y61.k h31.e<Gson> eVar) {
        this.f168349a = aVar;
        this.f168350b = kVar;
        this.f168351c = uVar;
        this.f168352d = interfaceC42375a;
        this.f168353e = interfaceC35745a5;
        this.f168354f = interfaceC32900o;
        this.f168355g = interfaceC46977a;
        this.f168356h = aVar2;
        this.f168357i = interfaceC43981a;
        this.f168358j = eVar;
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a
    @Y61.k
    public final A a(@Y61.k AbstractC41398a abstractC41398a) {
        return (A) this.f168350b.a(abstractC41398a).o(new g(this));
    }
}

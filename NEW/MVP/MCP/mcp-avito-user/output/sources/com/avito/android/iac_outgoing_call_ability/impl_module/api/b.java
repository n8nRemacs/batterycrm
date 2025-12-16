package com.avito.android.iac_outgoing_call_ability.impl_module.api;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacOutgoingCallAbilityApiImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/b;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/a;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_outgoing_call_ability.impl_module.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<e> f168413a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f168414b;

    /* compiled from: IacOutgoingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "m", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f168415l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacApiTracker", str, null);
            return G0.f406611a;
        }
    }

    /* compiled from: IacOutgoingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "m", "", "e", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_outgoing_call_ability.impl_module.api.b$b, reason: collision with other inner class name */
    public static final class C4981b extends N implements p<String, Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4981b f168416l = new C4981b();

        public C4981b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Throwable th2) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacApiTracker", str, th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacOutgoingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/remote/CanCallResult;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<I<TypedResult<CanCallResult>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f168418m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f168419n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f168420o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f168421p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f168422q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f168423r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, boolean z12, String str5) {
            super(0);
            this.f168418m = str;
            this.f168419n = str2;
            this.f168420o = str3;
            this.f168421p = str4;
            this.f168422q = z12;
            this.f168423r = str5;
        }

        @Override // Y41.a
        public final I<TypedResult<CanCallResult>> invoke() {
            return b.this.f168413a.get().a(this.f168418m, this.f168419n, null, this.f168420o, this.f168421p, this.f168422q, true, this.f168423r);
        }
    }

    /* compiled from: IacOutgoingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "LRL/b;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<I<TypedResult<RL.b>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f168425m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f168426n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f168427o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3) {
            super(0);
            this.f168425m = str;
            this.f168426n = str2;
            this.f168427o = str3;
        }

        @Override // Y41.a
        public final I<TypedResult<RL.b>> invoke() {
            return b.this.f168413a.get().b(this.f168425m, this.f168426n, this.f168427o);
        }
    }

    @Inject
    public b(@k h31.e<e> eVar, @k com.avito.android.iac_api_utils.util_module.a aVar) {
        this.f168413a = eVar;
        this.f168414b = aVar;
        aVar.b(a.f168415l, C4981b.f168416l);
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<CanCallResult>> a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @k String str4, @k String str5, boolean z12, boolean z13, @Y61.l String str6) {
        return this.f168414b.a("voipCanCall4", new String[]{G.f("itemId=", str), G.f("peerUserId=", str2), "localUserId=null", "networkType=".concat(str4), "scenario=".concat(str5), com.avito.android.bxcontent.mvi.entity.f.l("micAccess=", z12), "checkGoodBoy=true", G.f("analyticsParams=", str6)}, new c(str, str2, str4, str5, z12, str6));
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<RL.b>> b(@k String str, @k String str2, @k String str3) {
        return this.f168414b.a("canRecall", new String[]{"callId=".concat(str)}, new d(str, str2, str3));
    }
}

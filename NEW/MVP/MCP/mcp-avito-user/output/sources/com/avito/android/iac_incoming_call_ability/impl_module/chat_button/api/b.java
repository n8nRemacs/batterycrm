package com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api;

import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacChannelButtonsApiImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/chat_button/api/b;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/chat_button/api/a;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<e> f168218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f168219b;

    /* compiled from: IacChannelButtonsApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f168221m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f168221m = str;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f168218a.get().a(this.f168221m);
        }
    }

    @Inject
    public b(@k h31.e<e> eVar, @k com.avito.android.iac_api_utils.util_module.a aVar) {
        this.f168218a = eVar;
        this.f168219b = aVar;
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a
    @k
    public final I<TypedResult<Object>> a(@k String str) {
        a aVar = new a(str);
        return this.f168219b.a("closeChatButtons", new String[0], aVar);
    }
}

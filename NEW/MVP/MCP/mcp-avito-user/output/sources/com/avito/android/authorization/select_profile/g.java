package com.avito.android.authorization.select_profile;

import com.avito.android.util.InterfaceC35745a5;
import ie.InterfaceC41389a;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;

/* compiled from: SelectProfileInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/g;", "Lcom/avito/android/authorization/select_profile/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f94327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41389a> f94328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94329c;

    @Inject
    public g(@Y61.k String str, @Y61.k h31.e<InterfaceC41389a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f94327a = str;
        this.f94328b = eVar;
        this.f94329c = interfaceC35745a5;
    }

    @Override // com.avito.android.authorization.select_profile.c
    @Y61.k
    public final O a() {
        return Q.a(EmptyCoroutineContext.INSTANCE, new e(this, null)).z(this.f94329c.a()).n(f.f94326b).r(new d(this));
    }
}

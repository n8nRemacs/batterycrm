package com.avito.android.advert_item_actions.actions;

import Y61.k;
import Y61.l;
import com.avito.android.remote.V0;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HiddenAdvertsInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_item_actions/actions/c;", "LLa/c;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements La.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<V0> f85828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final La.d f85829b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f85830c;

    @Inject
    public c(@k h31.e<V0> eVar, @k La.d dVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f85828a = eVar;
        this.f85829b = dVar;
        this.f85830c = interfaceC35745a5;
    }

    @Override // La.c
    @k
    public final C41982q1 a(@l Integer num, @k String str, @k String str2, @l String str3) {
        return new F(new a(this, str, str2, str3, num)).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new b(this, str)).x0(this.f85830c.a());
    }
}

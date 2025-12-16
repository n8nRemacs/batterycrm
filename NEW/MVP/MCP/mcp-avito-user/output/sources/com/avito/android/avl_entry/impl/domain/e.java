package com.avito.android.avl_entry.impl.domain;

import Mg.InterfaceC14486a;
import Y61.k;
import Y61.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: ShortVideosInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/domain/e;", "LIg/c;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements Ig.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14486a f98491a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f98492b;

    @Inject
    public e(@k InterfaceC14486a interfaceC14486a, @k com.avito.android.remote.error.f fVar) {
        this.f98491a = interfaceC14486a;
        this.f98492b = fVar;
    }

    @Override // Ig.c
    @k
    public final C43152f0 a(@l String str, @l String str2, @l String str3) {
        return new C43152f0(new C43137a0(new c(2, null), C43175k.G(new b(this, str, str2, str3, null))), new d(this, null));
    }
}

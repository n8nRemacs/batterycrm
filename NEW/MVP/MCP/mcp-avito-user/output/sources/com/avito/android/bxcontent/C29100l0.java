package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.Metadata;
import tl.InterfaceC48685a;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/l0;", "Ltl/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.l0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29100l0 implements InterfaceC48685a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f111144a;

    public C29100l0(BxContentFragment bxContentFragment) {
        this.f111144a = bxContentFragment;
    }

    @Override // tl.InterfaceC48685a
    public final void a() {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentFragment bxContentFragment = this.f111144a;
        bxContentFragment.Z5().accept(new InterfaceC29127b.U(bxContentFragment.Z5().f112645M.a().f112321X));
    }

    @Override // tl.InterfaceC48685a
    public final void close() {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f111144a.Z5().accept(InterfaceC29127b.C29159s.f112170a);
    }
}

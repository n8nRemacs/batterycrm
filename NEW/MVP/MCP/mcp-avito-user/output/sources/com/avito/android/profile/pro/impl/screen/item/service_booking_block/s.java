package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.view.View;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.q;

/* compiled from: ProfileProSbBlockItemView_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class s implements q.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f223534a;

    public s(r rVar) {
        this.f223534a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.pro.impl.screen.item.service_booking_block.q.a
    public final q a(View view) {
        r rVar = this.f223534a;
        com.avito.android.util.text.a aVar = rVar.f223531a.get();
        a aVar2 = (a) rVar.f223532b.get();
        rVar.f223533c.getClass();
        return new q(view, aVar, aVar2, new k());
    }
}

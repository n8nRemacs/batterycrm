package com.avito.android.auto_contacts.link;

import android.content.Intent;
import com.avito.android.auto_contacts.presentation.AutoContactsPackagesActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoContactsPackagesLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f94899l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(0);
        this.f94899l = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f94899l;
        AutoContactsPackagesActivity.f94907r.getClass();
        fVar.f94900f.R(new Intent(fVar.f94902h, (Class<?>) AutoContactsPackagesActivity.class), com.avito.android.deeplink_handler.view.b.f134588l);
        return G0.f406611a;
    }
}

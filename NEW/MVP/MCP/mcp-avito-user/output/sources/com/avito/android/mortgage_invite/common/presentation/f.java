package com.avito.android.mortgage_invite.common.presentation;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoFormBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y10.b f205555l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p<ContactInfoFieldId, Boolean, G0> f205556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<ContactInfoFieldId, String, G0> f205557n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f205558o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f205559p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y10.b bVar, p pVar, p pVar2, v vVar, int i12) {
        super(2);
        this.f205555l = bVar;
        this.f205556m = pVar;
        this.f205557n = pVar2;
        this.f205558o = vVar;
        this.f205559p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205559p | 1);
        p<ContactInfoFieldId, Boolean, G0> pVar = this.f205556m;
        p<ContactInfoFieldId, String, G0> pVar2 = this.f205557n;
        a.b(this.f205555l, pVar, pVar2, a12, iA2);
        return G0.f406611a;
    }
}

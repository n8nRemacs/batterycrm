package com.avito.android.mortgage_invite.client_form;

import U10.d;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.client_form.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32806s extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.a f205278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f205279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205282p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f205283q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32806s(d.a aVar, w0 w0Var, Y41.p pVar, Y41.p pVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205278l = aVar;
        this.f205279m = w0Var;
        this.f205280n = pVar;
        this.f205281o = pVar2;
        this.f205282p = vVar;
        this.f205283q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205283q | 1);
        androidx.compose.ui.v vVar = this.f205282p;
        w0 w0Var = this.f205279m;
        Y41.p<ContactInfoFieldId, String, G0> pVar = this.f205280n;
        f0.c(this.f205278l, w0Var, pVar, this.f205281o, vVar, a12, iA2);
        return G0.f406611a;
    }
}

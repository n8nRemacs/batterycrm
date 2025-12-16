package com.avito.android.authorization.tfa.code_check.screen_builder;

import ae.C19873a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.model.Phone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TfaCodeCheckScreenBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "it", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<Phone, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f94715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC28373a interfaceC28373a) {
        super(1);
        this.f94715l = interfaceC28373a;
    }

    @Override // Y41.l
    public final G0 invoke(Phone phone) {
        Phone phone2 = phone;
        String str = phone2 != null ? phone2.f119296b : null;
        if ((str != null ? Phone.a(str) : null) == null) {
            throw new IllegalArgumentException("Phone must be set for TfaCodeCheckScreenBuilder!");
        }
        this.f94715l.c(new C19873a(str, CodeConfirmationSource.f92758f));
        return G0.f406611a;
    }
}

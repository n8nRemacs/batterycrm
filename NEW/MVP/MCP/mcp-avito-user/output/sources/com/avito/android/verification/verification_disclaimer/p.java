package com.avito.android.verification.verification_disclaimer;

import com.avito.android.R;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;
import xM0.C49861a;

/* compiled from: VerificationDisclaimerView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LxM0/a;", "Lkotlin/G0;", "invoke", "(LxM0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p extends N implements Y41.l<C49861a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CM0.e f325129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f325130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CM0.e eVar, String str) {
        super(1);
        this.f325129l = eVar;
        this.f325130m = str;
    }

    @Override // Y41.l
    public final G0 invoke(C49861a c49861a) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C49861a c49861a2 = c49861a;
        c49861a2.setImageDrawable(C43852a.a(c49861a2.getContext(), R.drawable.img_content_placeholder_error));
        CM0.e eVar = this.f325129l;
        if (eVar == null || (string = eVar.getTitle()) == null) {
            string = c49861a2.getContext().getString(R.string.verification_default_network_error_title);
        }
        c49861a2.setTitle(string);
        if (eVar == null || (string2 = eVar.getDescription()) == null) {
            string2 = c49861a2.getContext().getString(R.string.verification_default_network_error_body);
        }
        c49861a2.setSubtitle(string2);
        if (eVar == null || (string3 = eVar.getErrorIdPrefix()) == null) {
            string3 = c49861a2.getContext().getString(R.string.verification_default_network_error_id_prefix);
        }
        String str = this.f325130m;
        c49861a2.setErrorCodeMessage(str != null ? string3.concat(str.toUpperCase(Locale.ROOT)) : null);
        if (eVar == null || (string4 = eVar.getRefreshButton()) == null) {
            string4 = c49861a2.getContext().getString(R.string.verification_default_network_error_first_action);
        }
        c49861a2.setFirstButtonTitle(string4);
        if (eVar == null || (string5 = eVar.getSupportButton()) == null) {
            string5 = c49861a2.getContext().getString(R.string.verification_default_network_error_second_action);
        }
        c49861a2.setSecondButtonTitle(string5);
        return G0.f406611a;
    }
}

package com.avito.android.code_confirmation.code_confirmation;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CodeConfirmationResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/X;", "Lcom/avito/android/code_confirmation/code_confirmation/W;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f119480a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC35945t1<String>> f119481b;

    @Inject
    public X(@Y61.k Resources resources, @N3.c @Y61.k h31.e<InterfaceC35945t1<String>> eVar) {
        this.f119480a = resources;
        this.f119481b = eVar;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.W
    @Y61.k
    public final String a(@Y61.k String str) {
        if (C5.f318568b.e(str)) {
            str = this.f119481b.get().a(str);
        }
        return this.f119480a.getString(R.string.code_sent_text, str);
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.W
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f119480a.getString(R.string.code_request_timer_text, str);
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.W
    @Y61.k
    public final String getString(int i12) {
        return this.f119480a.getString(i12);
    }
}

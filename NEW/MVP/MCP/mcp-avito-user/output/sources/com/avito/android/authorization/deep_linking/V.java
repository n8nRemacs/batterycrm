package com.avito.android.authorization.deep_linking;

import com.avito.android.R;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class V extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f93721l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(S s5) {
        super(1);
        this.f93721l = s5;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f93721l.m(com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]));
        return G0.f406611a;
    }
}

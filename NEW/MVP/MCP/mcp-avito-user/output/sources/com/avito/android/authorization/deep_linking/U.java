package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.PerformResetPasswordLink;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f93720l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(S s5) {
        super(1);
        this.f93720l = s5;
    }

    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        this.f93720l.j(new PerformResetPasswordLink.b.c(map));
        return G0.f406611a;
    }
}

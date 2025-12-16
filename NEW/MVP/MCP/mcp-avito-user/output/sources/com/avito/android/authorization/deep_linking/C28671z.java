package com.avito.android.authorization.deep_linking;

import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoRecoveryAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.deep_linking.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28671z extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f93808l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28671z(A a12) {
        super(1);
        this.f93808l = a12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f93808l.j(new AutoRecoveryLink.Result.a(str));
        return G0.f406611a;
    }
}

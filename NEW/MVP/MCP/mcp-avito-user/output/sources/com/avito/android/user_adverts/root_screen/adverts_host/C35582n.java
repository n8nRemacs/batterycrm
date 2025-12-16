package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke", "()Lkotlinx/coroutines/flow/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35582n extends kotlin.jvm.internal.N implements Y41.a<InterfaceC43172j<? super List<? extends DeepLink>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f313110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts_common.ux_feedback.a f313111m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35582n(UserAdvertsHostFragment userAdvertsHostFragment, com.avito.android.user_adverts_common.ux_feedback.a aVar) {
        super(0);
        this.f313110l = userAdvertsHostFragment;
        this.f313111m = aVar;
    }

    @Override // Y41.a
    public final InterfaceC43172j<? super List<? extends DeepLink>> invoke() {
        UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
        return new C(this.f313110l, this.f313111m);
    }
}

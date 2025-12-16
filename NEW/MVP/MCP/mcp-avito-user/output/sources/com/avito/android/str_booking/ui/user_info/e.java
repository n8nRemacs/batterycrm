package com.avito.android.str_booking.ui.user_info;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.common.Prompt;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingUserInfoPresenter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LVx0/a;", "linkType", "", "", "content", "Lcom/avito/android/str_booking/network/models/common/Prompt;", "prompt", "LJx0/a;", "event", "Lkotlin/G0;", "invoke", "(LVx0/a;Ljava/util/Map;Lcom/avito/android/str_booking/network/models/common/Prompt;LJx0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements r<AbstractC15725a, Map<String, ? extends String>, Prompt, C14258a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f286181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar) {
        super(4);
        this.f286181l = jVar;
    }

    @Override // Y41.r
    public final G0 invoke(AbstractC15725a abstractC15725a, Map<String, ? extends String> map, Prompt prompt, C14258a c14258a) {
        this.f286181l.f286186b.invoke(new a.i(abstractC15725a, map, prompt, c14258a));
        return G0.f406611a;
    }
}

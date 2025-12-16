package com.avito.android.loyalty.ui.badges_list;

import androidx.compose.runtime.A;
import com.avito.android.loyalty.data.Badge;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgesListActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Badge f183370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<Badge> f183371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BadgesListActivity f183372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f183373o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Badge badge, BadgesListActivity badgesListActivity, String str, List list) {
        super(2);
        this.f183370l = badge;
        this.f183371m = list;
        this.f183372n = badgesListActivity;
        this.f183373o = str;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            BadgesListActivity badgesListActivity = this.f183372n;
            a aVar = new a(this.f183373o, badgesListActivity);
            b bVar = new b(0, badgesListActivity, BadgesListActivity.class, "finish", "finish()V", 0);
            o.a(this.f183370l, this.f183371m, aVar, bVar, a13, 72);
        }
        return G0.f406611a;
    }
}

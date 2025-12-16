package com.avito.android.profile.remove.screen.items.list_item;

import M90.a;
import Y41.l;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f224104l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f224105m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(0);
        this.f224104l = fVar;
        this.f224105m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f224104l;
        l<M90.a, G0> lVar = fVar.f224106b;
        a aVar = this.f224105m;
        lVar.invoke(new a.C0660a(aVar.f224099d));
        ProfileRemoveAnalytics profileRemoveAnalytics = fVar.f224107c;
        String strA = profileRemoveAnalytics.f223772b.a();
        if (strA != null) {
            profileRemoveAnalytics.f223771a.c(new I90.c(strA, aVar.f224098c));
        }
        return G0.f406611a;
    }
}

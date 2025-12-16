package com.vk.id.group.subscription.compose.ui;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupSubscriptionSheetState f366921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l f366922d;

    public /* synthetic */ h(GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, int i12) {
        this.f366920b = i12;
        this.f366921c = groupSubscriptionSheetState;
        this.f366922d = lVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366920b) {
            case 0:
                return GroupSubscriptionSheetKt.FailureDataState$lambda$48$lambda$47$lambda$46(this.f366921c, this.f366922d);
            case 1:
                return GroupSubscriptionSheetKt.DataStateButtons$lambda$53$lambda$52(this.f366921c, this.f366922d);
            default:
                return GroupSubscriptionSheetKt.DataStateHeader$lambda$67$lambda$66$lambda$65(this.f366921c, this.f366922d);
        }
    }
}

package com.avito.android.authorization.gorelkin;

import Wd.InterfaceC15745b;
import Yd.InterfaceC18254a;
import com.avito.android.remote.model.ParsingPermissionResult;
import kotlin.Metadata;

/* compiled from: ParsingPermissionInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ParsingPermissionResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/ParsingPermissionResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f93923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15745b.C1278b f93924c;

    public i(j jVar, InterfaceC15745b.C1278b c1278b) {
        this.f93923b = jVar;
        this.f93924c = c1278b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ParsingPermissionResult parsingPermissionResult = (ParsingPermissionResult) obj;
        ParsingPermissionResult.Ok ok2 = parsingPermissionResult instanceof ParsingPermissionResult.Ok ? (ParsingPermissionResult.Ok) parsingPermissionResult : null;
        if (ok2 != null) {
            InterfaceC18254a interfaceC18254a = this.f93923b.f93927c;
            InterfaceC15745b.a.C1277a c1277a = InterfaceC15745b.a.f17990c;
            String userHashId = ok2.getProfile().getUserHashId();
            InterfaceC15745b.C1278b c1278b = this.f93924c;
            c1277a.getClass();
            interfaceC18254a.a(InterfaceC15745b.a.C1277a.a(c1278b, userHashId));
        }
    }
}

package com.avito.android.passport.profile_switch;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_switch.PassportSwitchProfileAsyncLinkHandler", f = "PassportSwitchProfileAsyncLinkHandler.kt", i = {0, 0, 0}, l = {96}, m = "handleActual", n = {"this", Constants.DEEPLINK, "modeLink"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes15.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f213672q;

    /* renamed from: r, reason: collision with root package name */
    public PassportSwitchProfileLink f213673r;

    /* renamed from: s, reason: collision with root package name */
    public EmployeeModeSwitchLink f213674s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f213675t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f213676u;

    /* renamed from: v, reason: collision with root package name */
    public int f213677v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213676u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213675t = obj;
        this.f213677v |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.k(this.f213676u, null, this);
    }
}

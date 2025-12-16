package com.avito.android.notifications_settings.profile;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationsSettingsMessengerHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.profile.NotificationsSettingsMessengerHelperImpl", f = "NotificationsSettingsMessengerHelperImpl.kt", i = {0}, l = {30}, m = "enablePushSections", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f208010q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f208011r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f208012s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f208013t;

    /* renamed from: u, reason: collision with root package name */
    public int f208014u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208013t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208012s = obj;
        this.f208014u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208013t.a(null, this);
    }
}

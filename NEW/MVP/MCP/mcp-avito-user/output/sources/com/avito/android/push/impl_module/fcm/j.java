package com.avito.android.push.impl_module.fcm;

import com.avito.android.push.impl_module.fcm.i;
import kotlin.Metadata;

/* compiled from: FcmPushTokenProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Larrow/core/Y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f245962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f245963c;

    public j(i iVar, String str) {
        this.f245962b = str;
        this.f245963c = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        i.a.a(i.f245950g, "[" + this.f245962b + "] Old push token just deleted successfully");
        this.f245963c.b("token_just_deleted_successfully");
    }
}

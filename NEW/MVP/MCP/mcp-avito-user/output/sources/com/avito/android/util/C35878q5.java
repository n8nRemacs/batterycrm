package com.avito.android.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.view.ContextThemeWrapper;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: ShortcutInfoFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/q5;", "Lcom/avito/android/util/p5;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(AvailableCode.ERROR_ON_ACTIVITY_RESULT)
/* renamed from: com.avito.android.util.q5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35878q5 implements InterfaceC35871p5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.z f318982a;

    public C35878q5(@Y61.k com.avito.android.deep_linking.z zVar) {
        this.f318982a = zVar;
    }

    @Override // com.avito.android.util.InterfaceC35871p5
    @Y61.k
    public final ShortcutInfo a(@Y61.k Context context, @Y61.k String str, @j.e0 int i12, @InterfaceC42165v int i13, @Y61.k DeepLink deepLink) {
        Intent intentA = this.f318982a.a(deepLink);
        return new ShortcutInfo.Builder(context, str).setShortLabel(context.getString(i12)).setIcon(Icon.createWithBitmap(V0.b(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Legacy).getDrawable(i13)))).setIntents(new Intent[]{intentA}).build();
    }
}

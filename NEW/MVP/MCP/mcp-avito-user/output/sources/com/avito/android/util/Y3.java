package com.avito.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: PreferenceDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class Y3 extends kotlin.jvm.internal.N implements Y41.a<SharedPreferences> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f318783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Context context) {
        super(0);
        this.f318783l = context;
    }

    @Override // Y41.a
    public final SharedPreferences invoke() {
        return this.f318783l.getSharedPreferences("timeDiffPref", 0);
    }
}

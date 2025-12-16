package com.vk.api.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKPreferencesKeyValueStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/B;", "Lcom/vk/api/sdk/x;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class B implements x {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f366521a;

    /* compiled from: VKPreferencesKeyValueStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/B$a;", "", "<init>", "()V", "", "PREFERENCE_NAME", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public B(Context context, String str, int i12, C42822w c42822w) {
        this.f366521a = context.getSharedPreferences((i12 & 2) != 0 ? "com.vkontakte.android_pref_name" : str, 0);
    }

    @Override // com.vk.api.sdk.x
    public final void a(@Y61.k String str, @Y61.l String str2) {
        G0 g02;
        if (str2 == null) {
            g02 = null;
        } else {
            this.f366521a.edit().putString(str, str2).apply();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            remove(str);
        }
    }

    @Override // com.vk.api.sdk.x
    @Y61.l
    public final String get(@Y61.k String str) {
        return this.f366521a.getString(str, null);
    }

    @Override // com.vk.api.sdk.x
    public final void remove(@Y61.k String str) {
        this.f366521a.edit().remove(str).apply();
    }
}

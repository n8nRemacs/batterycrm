package com.avito.android.messenger.folders;

import Y61.k;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FolderOnboardingStatusStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/folders/d;", "Lcom/avito/android/messenger/folders/c;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f196348a;

    /* compiled from: FolderOnboardingStatusStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/folders/d$a;", "", "<init>", "()V", "", "FOLDER_ONBOARDING_KEY", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public d(@k SharedPreferences sharedPreferences) {
        this.f196348a = sharedPreferences;
    }

    @Override // com.avito.android.messenger.folders.c
    public final void a() {
        this.f196348a.edit().putBoolean("messenger_folder_onboarding_showed", true).apply();
    }

    @Override // com.avito.android.messenger.folders.c
    public final boolean b() {
        return this.f196348a.getBoolean("messenger_folder_onboarding_showed", false);
    }
}

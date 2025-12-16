package com.avito.android.image.enhancement;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceOnboardingManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/image/enhancement/g;", "Lcom/avito/android/image/enhancement/f;", "a", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.image.enhancement.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30976g implements InterfaceC30975f {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f169372a;

    /* compiled from: ImageEnhanceOnboardingManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/image/enhancement/g$a;", "", "<init>", "()V", "", "PREFERENCES_NAME", "Ljava/lang/String;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.image.enhancement.g$a */
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

    public C30976g(@Y61.k Context context) {
        this.f169372a = context.getSharedPreferences("image-enhance-onboarding", 0);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30975f
    public final boolean a(@Y61.k String str) {
        return this.f169372a.getBoolean(str, false);
    }

    @Override // com.avito.android.image.enhancement.InterfaceC30975f
    public final void b(@Y61.k String str) {
        SharedPreferences.Editor editorEdit = this.f169372a.edit();
        editorEdit.putBoolean(str, true);
        editorEdit.apply();
    }
}

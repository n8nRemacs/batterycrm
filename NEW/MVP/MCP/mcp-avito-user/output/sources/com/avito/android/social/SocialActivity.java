package com.avito.android.social;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.social.H;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SocialActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/social/SocialActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/social/H$a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocialActivity extends androidx.appcompat.app.m implements H.a, InterfaceC28477j.a {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public H f284278b;

    /* compiled from: SocialActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/social/SocialActivity$a;", "", "<init>", "()V", "", "EXTRA_SOCIAL_CODE", "Ljava/lang/String;", "EXTRA_SOCIAL_EMAIL", "EXTRA_SOCIAL_ERROR", "EXTRA_SOCIAL_ERROR_MESSAGE", "EXTRA_SOCIAL_STATE", "EXTRA_SOCIAL_TOKEN", "EXTRA_SOCIAL_TYPE", "EXTRA_SOCIAL_USER", "", "RESULT_ERROR", "I", "SOCIAL_TYPE_PARAM", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        H h12 = this.f284278b;
        if (h12 == null) {
            h12 = null;
        }
        if (h12.d(i12, i13, intent)) {
            return;
        }
        super.onActivityResult(i12, i13, intent);
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        SocialType socialType = (SocialType) getIntent().getSerializableExtra("social_type");
        String stringExtra = getIntent().getStringExtra("social_action");
        com.avito.android.social.di.f.a().a((com.avito.android.social.di.i) C29972i.a(C29972i.b(this), com.avito.android.social.di.i.class), bundle != null ? bundle.getBundle("presenter_state") : null, socialType, this).a(this);
        H h12 = this.f284278b;
        if (h12 == null) {
            h12 = null;
        }
        h12.b(this);
        if (bundle != null ? bundle.containsKey("presenter_state") : false) {
            return;
        }
        if (kotlin.jvm.internal.L.f(stringExtra, "login")) {
            H h13 = this.f284278b;
            (h13 != null ? h13 : null).c();
        } else if (kotlin.jvm.internal.L.f(stringExtra, "logout")) {
            H h14 = this.f284278b;
            (h14 != null ? h14 : null).a();
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        H h12 = this.f284278b;
        if (h12 == null) {
            h12 = null;
        }
        h12.c0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        H h12 = this.f284278b;
        if (h12 == null) {
            h12 = null;
        }
        bundle.putBundle("presenter_state", h12.H());
        super.onSaveInstanceState(bundle);
    }
}

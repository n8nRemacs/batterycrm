package com.avito.android.social;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: SocialActivityPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social/H;", "", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface H {

    /* compiled from: SocialActivityPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/H$a;", "", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: SocialActivityPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.social.H$a$a, reason: collision with other inner class name */
        public static final class C8496a {
            public static void a(SocialActivity socialActivity, SocialType socialType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12) {
                if ((i12 & 8) != 0) {
                    str3 = null;
                }
                if ((i12 & 16) != 0) {
                    str4 = null;
                }
                if ((i12 & 32) != 0) {
                    str5 = null;
                }
                if ((i12 & 64) != 0) {
                    str6 = null;
                }
                if ((i12 & 128) != 0) {
                    str7 = null;
                }
                socialActivity.getClass();
                socialActivity.setResult(-1, new Intent().putExtra("extra_social_email", str2).putExtra("extra_social_token", str).putExtra("extra_social_type", (Parcelable) socialType).putExtra("extra_social_user", str3).putExtra("extra_social_code", str4).putExtra("extra_social_state", str5).putExtra("extra_social_error", str6).putExtra("extra_social_error_message", str7));
                socialActivity.finish();
            }
        }
    }

    @Y61.k
    Bundle H();

    void a();

    void b(@Y61.k SocialActivity socialActivity);

    void c();

    void c0();

    boolean d(int i12, int i13, @Y61.l Intent intent);
}

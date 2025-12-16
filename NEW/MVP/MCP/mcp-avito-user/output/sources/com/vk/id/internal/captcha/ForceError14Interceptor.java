package com.vk.id.internal.captcha;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: ForceError14Interceptor.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/vk/id/internal/captcha/ForceError14Interceptor;", "Lokhttp3/Interceptor;", "redirectUri", "", "<init>", "(Ljava/lang/String;)V", "once", "Ljava/util/concurrent/atomic/AtomicBoolean;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ForceError14Interceptor implements Interceptor {

    @k
    private final AtomicBoolean once = new AtomicBoolean(true);

    @l
    private final String redirectUri;

    public ForceError14Interceptor(@l String str) {
        this.redirectUri = str;
    }

    @Override // okhttp3.Interceptor
    @k
    public Response intercept(@k Interceptor.Chain chain) {
        if (!this.once.getAndSet(false)) {
            return chain.proceed(chain.request());
        }
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).message("OK").body(ResponseBody.INSTANCE.create(C43066x.E0("\n                            {\n                                \"error\": {\n                                    \"error_code\": 14,\n                                    \"error_msg\": \"Captcha needed\",\n                                    \"request_params\": [\n                                    ],\n                                    \"redirect_uri\": \"" + this.redirectUri + "\",\n                                    \"captcha_sid\": \"679747455055\",\n                                    \"is_refresh_enabled\": true,\n                                    \"captcha_img\": \"https:\\/\\/vk.ru\\/captcha.php?sid=679747455055&source=check_user_action_validate%2Bmail_send&app_id=6287487&device_id=&s=1&resized=1\",\n                                    \"captcha_ts\": 1741099026.324000,\n                                    \"captcha_attempt\": 1,\n                                    \"captcha_ratio\": 2.600000,\n                                    \"is_sound_captcha_available\": true,\n                                    \"captcha_track\": \"https:\\/\\/vk.ru\\/sound_captcha.php?captcha_sid=679747455055&act=get&source=check_user_action_validate%2Bmail_send&app_id=6287487&device_id=\",\n                                    \"uiux_changes\": true\n                                }\n                            }\n                "), MediaType.INSTANCE.parse("application/json; charset=utf-8"))).code(200).build();
    }
}

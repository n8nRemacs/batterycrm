package com.vk.id.internal.context;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.auth.AuthActivity;
import kotlin.Metadata;

/* compiled from: DefaultActivityStarter.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/id/internal/context/DefaultActivityStarter;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", "Lkotlin/G0;", "startActivity", "(Landroid/content/Intent;)V", "Landroid/content/Context;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultActivityStarter implements InternalVKIDActivityStarter {

    @k
    private final Context context;

    public DefaultActivityStarter(@k Context context) {
        this.context = context;
    }

    @Override // com.vk.id.internal.context.InternalVKIDActivityStarter
    public void startActivity(@k Intent intent) {
        AuthActivity.INSTANCE.startForAuth$vkid_release(this.context, intent);
    }
}

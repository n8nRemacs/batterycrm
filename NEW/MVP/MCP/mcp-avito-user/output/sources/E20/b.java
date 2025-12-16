package E20;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.view.MultiMessageSendActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiMessageSendIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE20/b;", "LE20/a;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f3710a;

    @Inject
    public b(@k Context context) {
        this.f3710a = context;
    }

    @Override // E20.a
    @k
    public final Intent a(long j12, @k String str, @k String str2) {
        MultiMessageSendActivity.f206804o.getClass();
        Intent intent = new Intent(this.f3710a, (Class<?>) MultiMessageSendActivity.class);
        intent.putExtra("key_item_id", j12);
        intent.putExtra("key_message_text", str);
        intent.putExtra("key_channel_id", str2);
        return intent;
    }
}

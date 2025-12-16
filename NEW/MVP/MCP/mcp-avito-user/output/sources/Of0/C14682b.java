package Of0;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.publish_limits_info.history.PublishLimitsHistoryActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishLimitsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOf0/b;", "LOf0/a;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Of0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14682b implements InterfaceC14681a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f12476a;

    @Inject
    public C14682b(@k Application application) {
        this.f12476a = application;
    }

    @Override // Of0.InterfaceC14681a
    @k
    public final Intent a(@k String str) {
        ItemId itemId = new ItemId(str);
        Intent intent = new Intent(this.f12476a, (Class<?>) PublishLimitsHistoryActivity.class);
        intent.putExtra("history_id", itemId);
        return intent;
    }
}

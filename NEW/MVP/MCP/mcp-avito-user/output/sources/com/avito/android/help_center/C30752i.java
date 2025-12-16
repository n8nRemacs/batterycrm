package com.avito.android.help_center;

import android.content.Context;
import android.content.Intent;
import com.avito.android.help_center.help_center_articles.HelpCenterArticlesActivity;
import com.avito.android.help_center.help_center_request.HelpCenterRequestActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/i;", "Lcom/avito/android/help_center/h;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.help_center.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30752i implements InterfaceC30751h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f161837a;

    @Inject
    public C30752i(@Y61.k Context context) {
        this.f161837a = context;
    }

    @Override // com.avito.android.help_center.InterfaceC30751h
    @Y61.k
    public final Intent a(@Y61.l String str) {
        return new Intent(this.f161837a, (Class<?>) HelpCenterActivity.class).putExtra("key_url", str);
    }

    @Override // com.avito.android.help_center.InterfaceC30751h
    @Y61.k
    public final Intent b(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        Intent intent = new Intent(this.f161837a, (Class<?>) HelpCenterRequestActivity.class);
        intent.putExtra("key_theme", str);
        intent.putExtra("key_advertisement_id", str2);
        intent.putExtra("key_context_id", str3);
        return intent;
    }

    @Override // com.avito.android.help_center.InterfaceC30751h
    @Y61.k
    public final Intent c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        Intent intent = new Intent(this.f161837a, (Class<?>) HelpCenterArticlesActivity.class);
        intent.putExtra("key_articleId", str);
        intent.putExtra("key_theme", str2);
        intent.putExtra("key_advertisement_id", str3);
        intent.putExtra("key_context_id", str4);
        return intent;
    }
}
